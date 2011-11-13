package fr.chaunier.xtext.omc.features

import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.BoolConstraint
import fr.chaunier.xtext.omc.omcDsl.Constraint
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint
import fr.chaunier.xtext.omc.omcDsl.IntegerConstraint
import fr.chaunier.xtext.omc.omcDsl.StringConstraint
import fr.chaunier.xtext.omc.omcDsl.StructuralFeature

class FeaturesHelpers {


	// surchage conbstraint for feature 
	def surchageCompatibility(StructuralFeature feature) {
		var cstStatus = ConstraintStatus::WITHOUT
		if ( feature instanceof Attribute ) {
		var att = feature as Attribute	
		if  ( att.getConstraint() != null ) 
			if ( feature instanceof Attribute ) {
				cstStatus = ConstraintStatus::IN_FEATURE  
 				val type = feature.type.referenced ;
 					if ( type instanceof DataType ) {
		 				val dt = type as DataType ;
						if (dt.getConstraint() != null) {
							cstStatus = ConstraintStatus::OVERRIDE  
							cstStatus = infoSurchargeConstraints(att.getConstraint(),dt.getConstraint())
						}
				}	
			}
		}
	}
	
	//  
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
	
	
}