package fr.chaunier.xtext.path.map.scoping

import com.google.inject.Inject
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.path.map.pathDsl.FeaturePathFrom
import fr.chaunier.xtext.path.map.pathDsl.FeaturePathTo
import fr.chaunier.xtext.path.map.pathDsl.FeatureSet
import fr.chaunier.xtext.path.map.pathDsl.InOut
import fr.chaunier.xtext.path.map.pathDsl.MapEntity
import fr.chaunier.xtext.path.map.pathDsl.PathElement
import fr.chaunier.xtext.path.map.pathDsl.PathHead
import fr.chaunier.xtext.path.map.pathDsl.PathTail
import fr.chaunier.xtext.path.map.services.DomainModelExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*

/**
 * Custom scope provider implementation for the Domain Model example.
 */
class PathDslXtendScopeProvider extends AbstractDeclarativeScopeProvider {


	@Inject extension DomainModelExtensions

	// re-implementation of the original one, using Xtend's collection extensions:
	def IScope scope_Reference_opposite(Reference reference, EReference eRef) {
		val thisEntity = reference.eContainer as Entity
		scopeFor(
			reference.entity						// Of the referenced Entity,
				?.features							// return its features
				.filter(typeof(Reference))			// which are Reference-s
				.filter[it.entity == thisEntity]	// which happen to reference the containing Entity.
		)
		/*
		 * Note the use of the ?-operator to provide an empty scope for the opposite
		 * feature in case the Reference specifies an invalid target type.
		 */
	}


	// scoping for PathTail.feature:
	def IScope scope_PathTail_feature(EObject context, EReference ref /* not used */) {
		val container = context.eContainer as PathElement
//		print(context)
//		print("  ")
//		println(context.eContainer)
		/*
		 * A PathTail instance is contained by either a PathHead instance or another
		 * PathTail instance (in both cases through the 'tail' feature), so container
		 * has type PathTail or PathHead, which are sub types of PathElement.
		 */
		if ( container == null )
			return IScope::NULLSCOPE 
		scopeFor( container.pathFeatures )
	}

	def private dispatch pathFeatures(PathHead pathHead) {
		pathHead.entity.structuralFeatures
	}

/*
	def PackageDeclaration getPackageDeclaration(Object o) {
	    switch(o) {
	      PackageDeclaration : o 
	      EObject : getPackageDeclaration(o.eContainer)
	      default: null
	    }
  	}
  	
	def concreteEntity(Entity entity) {
		if (entity.superType != null && entity.superType.isAbstract) 
	      	return true
	    if (entity.superType != null)
	      	concreteEntity(entity.superType)
	    else false			
  	}
  		
	def searchConcreteEntitiesOf(Entity abstractEntity) {
	    var listConcrete = new ArrayList<Entity>()
		var pack = getPackageDeclaration(abstractEntity)
		for ( entity : pack.elements.filter(typeof(Entity)) ) {
			if ( entity.superType == abstractEntity )
				listConcrete.add(entity)
		}
		return listConcrete
	}

  	def concrete(Entity entity) {
		if ( entity.isAbstract )
			entity.searchConcreteEntitiesOf
	}
 */

/* 
 	def getPreviousMapEnity(MapEntity mapEnt) {
		mapEnt.eContainer 		
 	}
 */ 	
	def  entityFrom(Object o) {
		switch(o) {
	      MapEntity : if ( o.entityFrom != null ) return o.entityFrom else entityFrom(o.eContainer) 
	      EObject : entityFrom(o.eContainer) as Entity
	      default: return null as Entity
	    }
	}
	
	def  entityTo(Object o) {
	    switch(o) {
	      MapEntity : if ( o.entityTo != null ) return o.entityTo else entityTo(o.eContainer)  
	      EObject : entityTo(o.eContainer) as Entity
	      default: null as Entity
	    }
	}

//		if( type.referenced instanceof Entity) type.referenced as Entity else null
 	
	def private dispatch pathFeatures(FeaturePathFrom pathFrom) {
		pathFrom.entityFrom.structuralFeatures
	}

	def private dispatch pathFeatures(FeatureSet pathSet) {
		if ( pathSet .in == InOut::IN) 
			pathSet.entityFrom.structuralFeatures
		else pathSet.entityTo.structuralFeatures	
	}

	def private dispatch pathFeatures(FeaturePathTo pathTo) {
		pathTo.entityTo.structuralFeatures
	}

	def private dispatch pathFeatures(PathTail pathTail) {
		pathTail.feature.structuralFeatures
	}

}
