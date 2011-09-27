package fr.chaunier.xtext.omcst.om.generator.xsd

import fr.chaunier.xtext.omcst.om.omcstDsl.*

class XsdConstaint {

	def dispatch constraint(StringConstraint cst) {
 		var res = '' 
		if (cst.minLen !=null)
			res = '<xsd:minLength value= "' + cst.minLen + '"'
		if (cst.maxLen !=null) 
			res = res + '<xsd:maxLength value= "' + cst.maxLen + '"'
		if (cst.fixeLen !=null)
			res = res + '<xsd:minLength value= "' +cst.fixeLen + '" <xsd:maxLength value= "' +cst.fixeLen + '"'  
//		if (cst.defaultValue !=null)
//			res = res + 'default ' +cst.defaultValue + ' '
//		if (cst.fixedValue !=null)
//			res = res + 'fixe value' +cst.fixedValue + ' '
		if (cst.regex !=null)
			res = res + 'regex ' +cst.regex + ' '
		return res 	 
	} 

	def dispatch constraint(DecimalConstraint cst) {
		if (cst == null) 
			return ''
 		var res = '' 
		if (cst.precision !=null)
			res = '<xsd:minLength value= "' + cst.precision + '"'
		if (cst.scale !=null) 
			res = res + '<xsd:maxLength value= "' + cst.scale + '"'
		if (cst.fixeLen !=null)
			res = res + '<xsd:minLength value= "' +cst.fixeLen + '" <xsd:maxLength value= "' +cst.fixeLen + '"'  
//		if (cst.minValue !=null)
//			res = res + 'min Value ' +cst.minValue.terminal + ' '
//		if (cst.maxValue !=null)
//			res = res + 'max Value ' +cst.maxValue.terminal  + ' ' 
//		if (cst.defaultValue !=null)
//			res = res + 'default ' +cst.defaultValue.terminal + ' '
//		if (cst.fixedValue !=null)
//			res = res + 'fixe value' +cst.fixedValue.terminal + ' '
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
		'pas traité'
	}
	
	def dispatch constraint(BoolConstraint cst) {
		'pas traité'
	}

		// buid xsd cardinality	
 	def cardinalityString(TypeRef ref) {
 		var res = new String() 
		if (ref.option)res='minOccurs="0"' 
		if (ref.multi)res=res+'maxOccurs="unbounded"'
		return res ;
 	}

// traitement des contraintes suivant type : boolean , string , decimal, enum
/*  		
  def setConstraint(Attribute att) {
  	if ( att.constraint == null ) 
  		return ''
	    switch(att.constraint) {
	      StringConstraint : 'string ' + constraint(att.constraint)  
	      DecimalConstraint : 'decimal ' + constraint(att.constraint)
	      EnumerationConstraint : 'enum ' +constraint(att.constraint)
	      DateTimeConstraint : 'dateTime ' + constraint(att.constraint)
	      BoolConstraint :  'boolean ' + constraint(att.constraint) 
	      default: ''
	    }
  	}
 */
	
}