package fr.chaunier.xtext.omcst.om

import java.util.ArrayList 
import fr.chaunier.xtext.omcst.om.omcstDsl.*
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.emf.ecore.*
import fr.chaunier.xtext.omcst.om.ConstraintStatus
import fr.chaunier.xtext.omcst.om.generator.TextConstraint
import fr.chaunier.xtext.omcst.om.Helpers
//import java.math.BigInteger 

class OmHelper {


	// todo extend xhith recurse
	
	def getFeaturesWithHerited(Entity entity) {
		var list = new ArrayList<Feature>()
		getFeaturesWithHerited(entity,list) 
	    return list
	}

	def getFeaturesWithHerited(Entity entity,ArrayList<Feature> features) {
	    features.addAll(entity.features)
	    if ( entity.superType != null ) 	
	    	return getFeaturesWithHerited(entity.superType,features)
	    return features
	}

	def getAttributesWithHerited(Entity entity) {
		var list = new ArrayList<Attribute>() 
//	    list.addAll(entity.features.filter(typeof(Attribute)))
//	    if ( entity.superType != null ) 	
//	    list.addAll(entity.superType.features.filter(typeof(Attribute)))
		getAttributesWithHerited(entity,list) 
	    return list
	}

	def getAttributesWithHerited(Entity entity,ArrayList<Attribute> attributes) {
	    attributes.addAll(entity.features.filter(typeof(Attribute)))
	    if ( entity.superType != null ) 	
	    	return getAttributesWithHerited(entity.superType,attributes)
	    return attributes
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

	def surchageCompatibility(StructuralFeature feature) {
		var cstStatus = ConstraintStatus::WITHOUT
		if  ( feature.getConstraint() != null ) 
			if ( feature instanceof Attribute ) {
				cstStatus = ConstraintStatus::IN_FEATURE  
 				val type = feature.type().referenced() ;
 					if ( type instanceof DataType ) {
		 				val dt = type as DataType ;
						if (dt.getConstraint() != null) {
							cstStatus = ConstraintStatus::OVERRIDE  
							cstStatus = infoSurchargeConstraints(feature.getConstraint(),dt.getConstraint())
						}
				}	
			}
	}

/*
	def errorSurchargeTypeConstraints(Constraint attCst,Constraint DTCst) {
	    switch(attCst) {
	      StringConstraint : if (DTCst instanceof StringConstraint) ConstraintStatus::OVERRIDE_SAME_TYPE else ConstraintStatus::OVERRIDE_ERROR_TYPE  
	      DecimalConstraint : if (DTCst instanceof DecimalConstraint) ConstraintStatus::OVERRIDE_SAME_TYPE else ConstraintStatus::OVERRIDE_ERROR_TYPE
	      EnumerationConstraint : if (DTCst instanceof EnumerationConstraint) ConstraintStatus::OVERRIDE_SAME_TYPE else ConstraintStatus::OVERRIDE_ERROR_TYPE
	      DateTimeConstraint : if (DTCst instanceof DateTimeConstraint) ConstraintStatus::OVERRIDE_SAME_TYPE else ConstraintStatus::OVERRIDE_ERROR_TYPE
	      BoolConstraint :  if (DTCst instanceof DateTimeConstraint) ConstraintStatus::OVERRIDE_SAME_TYPE else ConstraintStatus::OVERRIDE_ERROR_TYPE
	    }
	}
*/
/*
	    switch(dTCst) {
	      StringConstraint : ConstraintStatus::OVERRIDE_SAME_TYPE  
	      DecimalConstraint : ConstraintStatus::OVERRIDE_ERROR_TYPE 
	      EnumerationConstraint : ConstraintStatus::OVERRIDE_ERROR_TYPE 
	      DateTimeConstraint : ConstraintStatus::OVERRIDE_ERROR_TYPE
	      BoolConstraint : ConstraintStatus::OVERRIDE_ERROR_TYPE 
	    }
*/
	def infoSurchargeConstraints(Constraint attCst,Constraint dTCst) {
	    switch(attCst) {
	      StringConstraint : { 
			    switch(dTCst) {
			      StringConstraint : compareStrCst(attCst,dTCst)   
			      default : ConstraintStatus::OVERRIDE_ERROR_TYPE 
			    }
	      } 
	      DecimalConstraint : { 
			    switch(dTCst) {
			      DecimalConstraint : compareDecimalCst(attCst,dTCst) 
			      default : ConstraintStatus::OVERRIDE_ERROR_TYPE 
			    }
	      } 
	      IntegerConstraint : { 
			    switch(dTCst) {
			      IntegerConstraint : compareIntCst(attCst,dTCst) 
			      default : ConstraintStatus::OVERRIDE_ERROR_TYPE 
			    }
	      } 
	      EnumerationConstraint : {
			    switch(dTCst) {
			      EnumerationConstraint : ConstraintStatus::OVERRIDE_SAME_TYPE
			      default :	ConstraintStatus::OVERRIDE_SAME_TYPE
			    }
	      } 
	      DateTimeConstraint : {
			  switch(dTCst) {
			      DateTimeConstraint : ConstraintStatus::OVERRIDE_SAME_TYPE   
			      default : ConstraintStatus::OVERRIDE_ERROR_TYPE 
		      } 
	      }
	      BoolConstraint : {
			  switch(dTCst) {
			      BoolConstraint : ConstraintStatus::OVERRIDE_SAME_TYPE   
			      default : ConstraintStatus::OVERRIDE_ERROR_TYPE 
		      } 
	      } 
	    }
	}
	
	def compareStrCst(StringConstraint att,StringConstraint dt) {
		if (att.haveConstraint ==false) 
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if (dt.haveConstraint ==false)  
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if ( dt.minLen != null && att.minLen != null && dt.minLen != att.minLen )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.maxLen != null && att.maxLen != null && dt.maxLen != att.maxLen )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.fixedValue != null && att.fixedValue != null && dt.fixedValue != att.fixedValue )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		else ConstraintStatus::OVERRIDE_COMPATIBLE_CONSTRAINT	
	}
	
	def compareIntCst(IntegerConstraint att,IntegerConstraint dt) {
		if (att.haveConstraint ==false) 
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if (dt.haveConstraint ==false)  
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if ( dt.fixeLen != null && att.fixeLen != null && dt.fixeLen != att.fixeLen )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.fixedValue != null && att.fixedValue != null && dt.fixedValue != att.fixedValue )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.minValue != null && att.minValue != null && dt.minValue != att.minValue  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		if ( dt.maxValue != null && att.maxValue != null && dt.maxValue != att.maxValue  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		else ConstraintStatus::OVERRIDE_COMPATIBLE_CONSTRAINT	
	}

	def compareDecimalCst(DecimalConstraint att,DecimalConstraint dt) {
		if (att.haveConstraint ==false) 
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if (dt.haveConstraint ==false)  
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		if ( dt.fixeLen != null && att.fixeLen != null && dt.fixeLen != att.fixeLen )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.fixedValue != null && att.fixedValue != null && dt.fixedValue != att.fixedValue )
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT  
		if ( dt.minValue != null && att.minValue != null && dt.minValue != att.minValue  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		if ( dt.maxValue != null && att.maxValue != null && dt.maxValue != att.maxValue  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		if ( dt.precision != null && att.precision != null && dt.precision != att.precision  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		if ( dt.scale != null && att.scale != null && dt.scale != att.scale  ) 
			return ConstraintStatus::OVERRIDE_UNCOMPATIBLE_CONSTRAINT
		else ConstraintStatus::OVERRIDE_COMPATIBLE_CONSTRAINT	
	}

	def haveConstraint(DecimalConstraint dt) {
		if ( dt.minValue == null && dt.maxValue == null && dt.fixedValue==null && dt.defaultValue == null 
			&& dt.precision == null && dt.scale == null )
		return false	 
	}

	def haveConstraint(IntegerConstraint dt) {
		if ( dt.minValue == null && dt.maxValue == null && dt.fixedValue==null && dt.defaultValue == null )
			return ConstraintStatus::OVERRIDE_SAME_TYPE
		return false	 
	}

	def haveConstraint(StringConstraint dt) {
		if ( dt.minLen == null && dt.maxLen == null && dt.fixedValue==null && dt.defaultValue == null )
			return ConstraintStatus::OVERRIDE_SAME_TYPE
	}

	// TODO
	

		
}