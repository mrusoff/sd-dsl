package fr.chaunier.xtext.omcst.om

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmHelper 
import fr.chaunier.xtext.omcst.om.Helpers
 
//import java.math.BigInteger 

class MergeConstraintInString {
	

		// buid xsd cardinality	
 	def cardinalityString(Attribute att) {
 		var res = new String() 
		if (att.type.multi)res='[0..*]' 
		else if (att.type.option)res='[0..1]' else res='[1..1]' 
		return res ;
 	}
 
 	def cardinalityString(Reference ref) {
 		var res = new String() 
		if (ref.type.multi)res='[0..*]' 
		else if (ref.type.option)res='[0..1]' else res='[1..1]' 
		return res ;
 	}

 	def cardinalityAndConstraintString(Attribute att) {
 		cardinalityString(att) + " " + constraintString(att)
 	}

	def dispatch constraint(StringConstraint cst) {
 		var res = '' 
		if (cst.minLen !=null)
			res = 'min Len ' + cst.minLen + ' '
		if (cst.maxLen !=null) 
			res = res + 'max Len ' + cst.maxLen + ' '
		if (cst.fixeLen !=null)
			res = res + 'fixe Len ' +cst.fixeLen + ' '
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue + ' '
		if (cst.fixedValue !=null)
			res = res + 'fixe value ' +cst.fixedValue + ' '
		if (cst.regex !=null)
			res = res + 'regex ' +cst.regex + ' '
		return res 	 
	} 

	def dispatch constraint(DecimalConstraint cst) {
		if (cst == null) 
			return ''
 		var res = '' 
		if (cst.precision !=null)
			res = 'precision ' + cst.precision + ' '
		if (cst.scale	!=null) 
			res = res + 'scale ' + cst.scale+ ' '
		if (cst.fixeLen !=null)
			res = res + 'fixe Len ' +cst.fixeLen + ' ' 
		if (cst.minValue !=null)
			res = res + 'min Value ' +cst.minValue.toStr + ' '
		if (cst.maxValue !=null)
			res = res + 'max Value ' +cst.maxValue.toStr  + ' ' 
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue.toStr + ' '
		if (cst.fixedValue !=null)
			res = res + 'fixe value ' +cst.fixedValue.toStr + ' '
//		if (cst.paddle !=null)
//			res = res + 'paddle ' +cst.paddle + ' '
		return res 	 
	} 
	
	def toStr(NumberVar numVar) {
		return numVar.value
	}

	def toStr(IntVar intVar) {
		return intVar.value
	}

	def dispatch constraint(IntegerConstraint cst) {
		if (cst == null) 
			return ''
 		var res = '' 
		if (cst.minValue !=null)
			res = 'min value ' + cst.minValue.toStr + ' '
		if (cst.maxValue !=null) 
			res = res + 'max value ' + cst.maxValue.toStr + ' '
		if (cst.fixeLen !=null)
			res = res + 'fixe Len ' +cst.fixeLen + ' ' 
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue.toStr + ' '
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue.toStr + ' '
		if (cst.fixedValue !=null)
			res = res + 'fixe value ' +cst.fixedValue.toStr + ' '
//		if (cst.paddle !=null)
//			res = res + 'paddle ' +cst.paddle + ' '
		return res 	 
	} 

	def terminal(TerminalNumber te) {
		if ( te.int != null )	
			return te.int.value 
		else if ( te.number != null )	
			return te.number.value 
	}
	
	def terminal(TerminalExpression te) {
		if ( te.bool != null )
			return te.bool.value 
		else if ( te.int != null )	
			return te.int.value 
		else if ( te.number != null )	
			return te.number.value 
		else if ( te.string != null )	
			return te.string.value 
	}
	
	def dispatch constraint(EnumerationConstraint cst) {
 		var res = '' 
		if (cst.fixeLen !=null)
			res = res + 'fixe Len ' +cst.fixeLen + ' '
		if (cst.usage != null)
			res = res +cst.usage.toString	
		return res  
	}
	
	def dispatch constraint(DateTimeConstraint cst) {
 		var res = ''
 		res = cst.constraint 
//		if (cst. !=null)
//			res = res + 'default ' +cst.defaultValue + ' '
	}
	
	def dispatch constraint(BoolConstraint cst) {
 		var res = ''
 		res = cst.constraint 
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue + ' '
		if (cst.fixedValue !=null)
			res = res + 'fixe value ' +cst.fixedValue + ' '
	}

  // traitement surcharge de contraintes
  def constraintString(Attribute att) {
	var constraintStr = ''
	if ( att.type.referenced instanceof DataType ) {
		var dt = att.type.referenced as DataType
		var constraint = mergeConstraints(att.constraint,dt.constraint)
//		println(constraint)
	  	if ( constraint == null ) 
	  		return constraintStr
	  	else return constraintByString(constraint);	
		}
	return constraintByString(att.constraint);  	
  }
  
  def constraintByString(Constraint constraint) {
	    switch(constraint) {
	      StringConstraint : 'string ' + constraint(constraint)  
	      DecimalConstraint : 'decimal ' + constraint(constraint)
	      IntegerConstraint : 'integer ' + constraint(constraint)
	      EnumerationConstraint : 'enum ' +constraint(constraint)
	      DateTimeConstraint : 'date ' + constraint(constraint)
	      BoolConstraint :  'boolean ' + constraint(constraint) 
	      default: ''
	    }
  }

  
	def create resCst : OmcstDslFactory::eINSTANCE.createStringConstraint mergeConstraints(StringConstraint att,StringConstraint dt) {
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
	
	def create resCst : OmcstDslFactory::eINSTANCE.createDecimalConstraint mergeConstraints(DecimalConstraint att,DecimalConstraint dt) {
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

	def create resCst : OmcstDslFactory::eINSTANCE.createIntegerConstraint mergeConstraints(IntegerConstraint att,IntegerConstraint dt) {
		resCst.minValue = Helpers::merge(dt.minValue,att.minValue)
		resCst.maxValue = Helpers::merge( dt.maxValue,att.maxValue)   
		resCst.fixeLen = Helpers::merge( dt.fixeLen,att.fixeLen)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
		resCst.isId= Helpers::merge( dt.nullable,att.nullable)
	}

	def create resCst : OmcstDslFactory::eINSTANCE.createBoolConstraint mergeConstraints(BoolConstraint att,BoolConstraint dt) {
		resCst.fixedValue = Helpers::merge( dt.fixedValue,att.fixedValue)
		resCst.defaultValue= Helpers::merge( dt.defaultValue,att.defaultValue)
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
    }	

	def create resCst : OmcstDslFactory::eINSTANCE.createDateTimeConstraint mergeConstraints(DateTimeConstraint att,DateTimeConstraint dt) {
		resCst.writable= Helpers::merge( dt.writable,att.writable)
		resCst.derived = Helpers::merge( dt.derived,att.derived)
		resCst.nullable = Helpers::merge( dt.nullable,att.nullable)
	}

	def create resCst : OmcstDslFactory::eINSTANCE.createEnumerationConstraint mergeConstraints(EnumerationConstraint att,EnumerationConstraint dt) {
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
  