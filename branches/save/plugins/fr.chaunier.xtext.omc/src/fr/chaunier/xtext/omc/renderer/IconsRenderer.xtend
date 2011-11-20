package fr.chaunier.xtext.omc.renderer

import fr.chaunier.xtext.omc.features.ConstraintType 
import fr.chaunier.xtext.omc.features.ElementType
import fr.chaunier.xtext.omc.features.FeatureType
import fr.chaunier.xtext.omc.features.ConstraintDetailType 

class IconsRenderer {
	
	def getIconType(ElementType elementType,String iconPath) {
 		if (elementType == ElementType::ENTITY ) 
 			return '!'+iconPath+'Entity.gif!'
 		else if (elementType == ElementType::DATATYPE ) 	
 			return '!'+iconPath+'Datatype.gif!'
 		else if (elementType == ElementType::ENUM ) 	
 			return '!'+iconPath+'Enumeration.gif!'
 		else return ''	
	}

	def getIconType(FeatureType elementType,String iconPath) {
 		if (elementType == FeatureType::ENTITY ) 
 			return '!'+iconPath+'Entity.gif!'
 		else if (elementType == FeatureType::ATTRIBUTE ) 	
 			return '!'+iconPath+'Attribute.gif!'
 		else if (elementType == FeatureType::REFERENCE ) 	
 			return '!'+iconPath+'Reference.gif!'
 		else return ''	
	}

	def getIconType(ConstraintType cstType,String iconPath) {
  		if ( cstType == ConstraintType::STRING )
 			return '!'+iconPath+'String.gif!'
  		else if ( cstType == ConstraintType::DECIMAL ) 	 
 			return '!'+iconPath+'Decimal.gif!'
  		else if ( cstType == ConstraintType::INTEGER ) 	 
 			return '!'+iconPath+'Number.gif!'
  		else if ( cstType == ConstraintType::BOOLEAN ) 	 
  			'bool'
  		else if ( cstType == ConstraintType::ENUM ) 	 
  			'enum'
  		else if ( cstType == ConstraintType::DATE ) 	 
  			'date'
  		else ''
	}


	def getIconType(ConstraintDetailType cstType,String iconPath) {
  		if ( cstType == ConstraintDetailType::MIN_LENGHT )
 			return '!'+iconPath+'MinLengthFacet.gif!'
 		else if ( cstType == ConstraintDetailType::MAX_LENGHT )
 			return '!'+iconPath+'MaxLengthFacet.gif! '
 		else if ( cstType == ConstraintDetailType::MIN_VALUE )
 			return '!'+iconPath+'MinInclusiveFacet.gif!'		
 		else if ( cstType == ConstraintDetailType::MAX_VALUE )
 			return '!'+iconPath+'MaxInclusiveFacet.gif!'		
		else if ( cstType == ConstraintDetailType::FRACTION )
 			return '!'+iconPath+'IntDigitsFacet.gif!'		
		else if ( cstType == ConstraintDetailType::SCALE )
 			return '!'+iconPath+'FractionDigitsFacet.gif!'		
		else if ( cstType == ConstraintDetailType::KEY )
 			return '!'+iconPath+'IdentityConstraintDefinitionKey.gif!'		
		else if ( cstType == ConstraintDetailType::REGEX )
 			return '!'+iconPath+'PatternFacet.gif!'		
		else if ( cstType == ConstraintDetailType::DEFAULT )
 			return '!'+iconPath+'Default.gif!'		
		else if ( cstType == ConstraintDetailType::FIXED )
 			return '!'+iconPath+'EqualFacet.gif!'	
// 			return '!'+iconPath+''		
		else if ( cstType == ConstraintDetailType::DERIVED )
 			return 'Dr'		
// 			return '!'+iconPath+''		
		else if ( cstType == ConstraintDetailType::WRITABLE )
 			return 'Wr'		
// 			return '!'+iconPath+''		
  		else ''
	}	 
}