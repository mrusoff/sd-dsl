package fr.chaunier.xtext.omc.features

import fr.chaunier.xtext.omc.Helpers
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.BoolConstraint
import fr.chaunier.xtext.omc.omcDsl.Constraint
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint
import fr.chaunier.xtext.omc.omcDsl.IntegerConstraint
import fr.chaunier.xtext.omc.omcDsl.StringConstraint
import fr.chaunier.xtext.omc.omcDsl.OmcDslFactory

class MergeConstraint {

  def getMergedConstraint(Attribute att) {
  	if ( att == null ) 
  		return null 
  	if ( att.type == null ) 
  		return null 
	if ( att.type.referenced instanceof DataType ) {
		var dt = att.type.referenced as DataType
		if (dt.constraint != null)
			return mergeConstraints(att.constraint,dt.constraint)
		else return att.constraint	
	} else return att.constraint
  }

  // duplicate on ConstraintTypeHelper
  def constraintType(Constraint constraint) {
	    switch(constraint) {
	      StringConstraint : ConstraintType::STRING  
	      DecimalConstraint : ConstraintType::DECIMAL
	      IntegerConstraint : ConstraintType::INTEGER
	      EnumerationConstraint : ConstraintType::ENUM
	      DateTimeConstraint : ConstraintType::DATE
	      BoolConstraint :  ConstraintType::BOOLEAN  
	      default: ConstraintType::WITHOUT
	    }
  }

  def create resCst : OmcDslFactory::eINSTANCE.createStringConstraint mergeConstraints(StringConstraint att,StringConstraint dt) {
		resCst.minLen = Helpers::merge(dt.minLen,att.minLen)
		resCst.maxLen = Helpers::merge( dt.maxLen,att.maxLen)   
		resCst.fixeLen = Helpers::merge( dt.fixeLen,att.fixeLen)
		resCst.fixedValue = Helpers::merge( dt.fixedValue,att.fixedValue)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.regex = Helpers::merge(dt.regex,att.regex)   
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
		resCst.isId= Helpers::merge( dt.nullable,att.nullable)
	}
	
	def create resCst : OmcDslFactory::eINSTANCE.createDecimalConstraint mergeConstraints(DecimalConstraint att,DecimalConstraint dt) {
		resCst.minValue = Helpers::merge(dt.minValue,att.minValue)
		resCst.maxValue = Helpers::merge( dt.maxValue,att.maxValue)   
		resCst.fixeLen = Helpers::merge( dt.fixeLen,att.fixeLen)
		resCst.precision = Helpers::merge( dt.precision,att.precision)
		resCst.scale = Helpers::merge( dt.scale,att.scale)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
	}

	def create resCst : OmcDslFactory::eINSTANCE.createIntegerConstraint mergeConstraints(IntegerConstraint att,IntegerConstraint dt) {
		resCst.minValue = Helpers::merge(dt.minValue,att.minValue)
		resCst.maxValue = Helpers::merge( dt.maxValue,att.maxValue)   
		resCst.fixeLen = Helpers::merge( dt.fixeLen,att.fixeLen)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
		resCst.isId= Helpers::merge( dt.nullable,att.nullable)
	}

	def create resCst : OmcDslFactory::eINSTANCE.createBoolConstraint mergeConstraints(BoolConstraint att,BoolConstraint dt) {
		resCst.fixedValue = Helpers::merge( dt.fixedValue,att.fixedValue)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
    }	

	def create resCst : OmcDslFactory::eINSTANCE.createDateTimeConstraint mergeConstraints(DateTimeConstraint att,DateTimeConstraint dt) {
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
	}

	def create resCst : OmcDslFactory::eINSTANCE.createEnumerationConstraint mergeConstraints(EnumerationConstraint att,EnumerationConstraint dt) {
		if ( att.usage != null ) 
			resCst.usage = att.usage
		else resCst.usage = dt.usage  
		resCst.defaultValueAsString = Helpers::merge( dt.defaultValueAsString,att.defaultValueAsString)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
	}
	
	def mergeConstraints(Constraint attCst,Constraint dTCst)  {
//		println('att '+attCst)
//		println('dt '+dTCst)
	    switch(attCst) {
	      StringConstraint : {
			    switch(dTCst) {
			      StringConstraint : mergeConstraints(attCst,dTCst)   
			      default : null as Constraint
			    }
	      } 
	      DecimalConstraint : { 
			    switch(dTCst) {
			      DecimalConstraint : mergeConstraints(attCst,dTCst) 
			      default : null as Constraint
			    }
	      } 
	      IntegerConstraint : { 
			    switch(dTCst) {
			      IntegerConstraint : mergeConstraints(attCst,dTCst) 
			      default : null as Constraint
			    }
	      } 
	      EnumerationConstraint : {
			    switch(dTCst) {
			      EnumerationConstraint : mergeConstraints(attCst,dTCst)
			      default : null as Constraint
			    }
	      } 
	      DateTimeConstraint : {
			  switch(dTCst) {
			      DateTimeConstraint : mergeConstraints(attCst,dTCst)
			      default : null as Constraint
		      } 
	      }
	      BoolConstraint : {
			  switch(dTCst) {
			      BoolConstraint : mergeConstraints(attCst,dTCst)
			      default : null as Constraint
		      } 
	      } 
	      default : return dTCst 
	      	
	       
      }
	}
	
}