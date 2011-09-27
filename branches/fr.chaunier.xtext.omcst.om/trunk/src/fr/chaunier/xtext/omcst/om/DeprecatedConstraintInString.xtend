package fr.chaunier.xtext.omcst.om

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmHelper 

class DeprecatedConstraintInString {
	
		// buid xsd cardinality	
 	def cardinalityString(TypeRef ref) {
 		var res = new String() 
		if (ref.multi)res='[0..*]' 
		else if (ref.option)res='[0..1]' else res='[1..1]' 
		return res ;
 	}

		// buid xsd cardinality	
 	def cardinalityString(Attribute att) {
 		cardinalityString(att.type)
 	}
 
 	def cardinalityAndConstraintString(Attribute att) {
 		cardinalityString(att.type) + " " + constraintString(att)
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
			res = res + 'fixe value' +cst.fixedValue + ' '
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
			res = res + 'fixe value' +cst.fixedValue.toStr + ' '
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
			res = res + 'fixe value' +cst.fixedValue.toStr + ' '
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
//		if (cst.defaultValue !=null)
//			res = res + 'default ' +cst.defaultValue + ' '
	}
	
	def dispatch constraint(BoolConstraint cst) {
 		var res = ''
 		res = cst.constraint 
		if (cst.defaultValue !=null)
			res = res + 'default ' +cst.defaultValue + ' '
		if (cst.fixedValue !=null)
			res = res + 'fixe value' +cst.fixedValue + ' '
	}

// traitement des contraintes suivant type : boolean , string , decimal, enum

  def constraintString(Attribute att) {
	// traitement surcharge de contraintes
	var constraintStr = ''
	if ( att.type.referenced instanceof DataType ) {
		constraintStr = constraintString(att.type.referenced as DataType)
	}
  	if ( att.constraint == null ) 
  		return constraintStr
	    switch(att.constraint) {
	      StringConstraint : 'string ' + constraint(att.constraint)  
	      DecimalConstraint : 'decimal ' + constraint(att.constraint)
	      IntegerConstraint : 'integer ' + constraint(att.constraint)
	      EnumerationConstraint : 'enum ' +constraint(att.constraint)
	      DateTimeConstraint : 'date ' + constraint(att.constraint)
	      BoolConstraint :  'boolean ' + constraint(att.constraint) 
	      default: ''
	    }
  }
/* 
  def constraintByString(Attribute att) {
	// traitement surcharge de contraintes
	var  omHelper = new OmHelper()
	if ( att.type.referenced instanceof DataType ) {
		var dt = att.type.referenced as DataType
		if ( att.constraint != null && dt.constraint != null ) {
			var cst = omHelper.mergeConstraints(att.constraint,dt.constraint) 
//			constraintByString(cst)
		} else if (dt.constraint != null)
			constraintByString(dt.constraint)
		else if (att.constraint != null)
			constraintByString(att.constraint)
		else ''	
	}
  }

  def constraintByString(AllConstraint constraint) {
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
  * /
  */

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
  
  def constraintString(DataType dt) {
  	if ( dt.constraint == null ) 
  		return ''
	    switch(dt.constraint) {
	      StringConstraint : 'string ' + constraint(dt.constraint)  
	      DecimalConstraint : 'decimal ' + constraint(dt.constraint)
	      IntegerConstraint : 'integer ' + constraint(dt.constraint)
	      EnumerationConstraint : 'enum ' +constraint(dt.constraint)
	      DateTimeConstraint : 'date ' + constraint(dt.constraint)
	      BoolConstraint :  'boolean ' + constraint(dt.constraint) 
	      default: ''
	    }
  }
}
  