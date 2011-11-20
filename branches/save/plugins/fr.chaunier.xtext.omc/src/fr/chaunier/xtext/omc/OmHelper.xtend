package fr.chaunier.xtext.omc

import fr.chaunier.xtext.omc.omcDsl.*
import java.util.ArrayList
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.emf.ecore.EObject

class OmHelper {

	// todo extend xhith recurse
	
	def getFeaturesWithHerited(Entity entity) {
		return getAddFeaturesWithHerited(entity) 
	}

	def getAddFeaturesWithHerited(Entity entity) {
	    var list = new ArrayList<Feature>()
	    if ( entity.superType != null ) {
	    	list.addAll(getAddFeaturesWithHerited(entity.superType))
	    }  
	    list.addAll(entity.features)
	    return list
	}

	def PackageDeclaration getPackageDeclaration(Object o) {
	    switch(o) {
	      PackageDeclaration : o 
	      EObject : getPackageDeclaration(o.eContainer)
	      default: null
	    }
  	}
  	
  	def concreteEntity(Entity entity) {
	      (entity.superType != null && entity.superType.isAbstract)  
  	}

	def searchConcreteEntitiesInPackage(PackageDeclaration pack) {
	    var listConcrete = new ArrayList<Entity>()
		for ( entity : pack.elements.filter(typeof(Entity)) ) {
			if ( entity.concreteEntity )
				listConcrete.add(entity)
		}
    	return listConcrete
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

/*
	def searchConcreteEntitiesInPackage(Entity abstractEntity) {
	    var listConcrete = new ArrayList<Entity>()
		var pack = getPackageDeclaration(abstractEntity)
		for ( entity : pack.elements.filter(typeof(Entity)) ) {
			if ( entity.superType != null && entity.superType.isAbstract )
				listConcrete.add(entity)
		}
    	return listConcrete
	}
 */
	def getAttributesWithHerited(Entity entity) {
		getFeaturesWithHerited(entity).filter(typeof(Attribute))
	}

    def QualifiedName(EObject o) {
	   val qn = new DefaultDeclarativeQualifiedNameProvider()
	   qn.getFullyQualifiedName(o)
    }  

	def featureTypeName(Feature feature) {
		val att = feature.asAttribute
		if ( att == null )
			return 0 
		if ( att.type.referenced instanceof Entity ) return 'Entity'
		if ( att.type.referenced instanceof DataType ) return 'DataType'
		if ( att.type.referenced instanceof Enumeration ) return 'Enum'
	}

	def asAttribute(Feature feature) {
   		if (feature instanceof Attribute) 
    		return feature as Attribute 
    	return null	
	}

	def getSpec(EObject obj) {
		var dm = Helpers::getModel(obj)
		return dm.spec
	}
	// TODO
	

		
}