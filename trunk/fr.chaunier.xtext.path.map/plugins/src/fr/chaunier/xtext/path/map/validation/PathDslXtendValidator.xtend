package fr.chaunier.xtext.path.map.validation

import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.path.map.pathDsl.CallMapEntity
import fr.chaunier.xtext.path.map.pathDsl.FeaturePath
import fr.chaunier.xtext.path.map.pathDsl.MapEntity
import fr.chaunier.xtext.path.map.pathDsl.PathDslPackage$Literals
import fr.chaunier.xtext.path.map.pathDsl.PathTail
import org.eclipse.xtext.validation.Check
/**
 * The actual implementation of the validator.
 */
class PathDslXtendValidator extends AbstractPathDslJavaValidator {

/*
	@Check
	def checkType(Attribute it) {
		if( !(type.referenced instanceof DataType) ) {
			error( "type of an attribute must be a data type", Literals::TYPED_ELEMENT__TYPE )
		}
	}
 */

	def private lastTail(PathTail tail) {
		if ( tail.tail != null ) 
			return lastTail(tail.tail) as PathTail
		else return tail 	
	}
/*
	def concreteEntity(Entity entity) {
		if (entity.superType != null && entity.superType.isAbstract) 
	      	return true
	    if (entity.superType != null)
	      	concreteEntity(entity.superType)
	    else false			
  	}
 */
	def abstractEntity(Entity entity) {
		if (entity.superType != null && entity.superType.isAbstract) 
	      	return entity.superType
	    if (entity.superType != null)
	      	abstractEntity(entity.superType)
	    else null			
  	}

	def private isValid(PathTail root,Entity entity) {
		var typeFeature = root.lastTail.feature.type.referenced
		if ( entity == typeFeature )
			return true;
		if ( entity.abstractEntity == typeFeature )
			return true	
		return false	
	}
	
	@Check
	def checkType(CallMapEntity it) {
		if ( featurePath != null ) {
		if ( ! isValid(featurePath.from.path,mapping.entityFrom ))
//			println("error"+featurePath.from.path.lastTail.feature.type.referenced + " " + mapping.entityFrom)		
			error( "bad source entity", Literals::CALL_MAP_ENTITY__FEATURE_PATH )
//		if ( featurePath.to.path.lastTail.feature.type.referenced != mapping.entityTo )		
		if ( ! isValid(featurePath.to.path,mapping.entityTo))
			error( "bad target entity", Literals::CALL_MAP_ENTITY__FEATURE_PATH )
//			println("error"+featurePath.to.path.lastTail.feature.type.referenced + " " + mapping.entityTo)		
		} else {
			if ( eContainer instanceof MapEntity ) {
				var container = eContainer as MapEntity 
				if ( ! isValid(featurePath.from.path,container.entityFrom ))
		//			println("error"+featurePath.from.path.lastTail.feature.type.referenced + " " + mapping.entityFrom)		
					error( "bad source entity", Literals::CALL_MAP_ENTITY__FEATURE_PATH )
				if ( ! isValid(featurePath.to.path,container.entityTo))
					error( "bad target entity", Literals::CALL_MAP_ENTITY__FEATURE_PATH )
			}
		}
	}

	@Check
	def checkType(FeaturePath it) {
//		println(eContainer)
//		println('last '+from.path.lastTail.feature.name)
//		println('cur '+from.path.feature.name)
		if ( eContainer instanceof CallMapEntity ) {
			if ( ! (from.path.lastTail.feature.type.referenced instanceof Entity))
				error( "must be an entity", Literals::FEATURE_PATH__FROM )
			if ( ! (to.path.lastTail.feature.type.referenced instanceof Entity))
				error( "must be an entity", Literals::FEATURE_PATH__TO )
			}
		else {
			if ( (from.path.lastTail.feature.type.referenced instanceof Entity))
				error( "can't be an entity", Literals::FEATURE_PATH__FROM )
			if ( (to.path.lastTail.feature.type.referenced instanceof Entity))
				error( "can't be an entity", Literals::FEATURE_PATH__TO )
			}
	}
	
	/*
	@Check
	def checkType(Reference it) {
		if( !(type.referenced instanceof Entity) ) {
			error( "type of a reference must be an entity", Literals::TYPED_ELEMENT__TYPE )
		}
	} */
}