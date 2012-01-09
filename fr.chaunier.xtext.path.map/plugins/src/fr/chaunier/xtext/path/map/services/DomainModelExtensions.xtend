package fr.chaunier.xtext.path.map.services

import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Feature
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.omc.omcDsl.StructuralFeature
import java.util.ArrayList
/**
 * Extensions for model elements of a domain model.
 * Usage in Xtend files:
 * <pre>
 *   @Inject extension DomainModelExtensions
 * 
 *   // ...
 * 
 *     entity.structuralFeatures
 *     reference.structuralFeatures
 *     reference.entity
 * </pre>
 */
class DomainModelExtensions {

	def featuresWithHerited(Entity it) {
	    var list = new ArrayList<Feature>()
	    if ( superType != null ) {
	    	list.addAll(featuresWithHerited(superType))
	    }  
	    list.addAll(features)
	    return list
	}

	def dispatch structuralFeatures(Entity it) {
		featuresWithHerited.filter(typeof(StructuralFeature))
//		features.filter(typeof(StructuralFeature))
	}

	def dispatch Iterable<StructuralFeature> structuralFeatures(Reference it) {
		type.referenced.structuralFeatures
	}
	// (need to specify return type because of recursion)

	def dispatch Iterable<StructuralFeature> structuralFeatures(Attribute it) {
//		emptyList
		type.referenced.structuralFeatures
	}
	// (need to specify return type because common super type of List<T> and Iterable<T> is Object)


	/**
	 * Returns the referenced Entity or null if type references something else (which is an error).
	 */
	def entity(Reference it) {
		if( type.referenced instanceof Entity) type.referenced as Entity else null
	}

}
