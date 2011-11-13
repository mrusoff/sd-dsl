package fr.chaunier.xtext.omc.renderer

import fr.chaunier.xtext.omc.features.ElementType
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Enumeration
import fr.chaunier.xtext.omc.omcDsl.Reference


class ElementTypeHelper {

	def featureType(Attribute att) {
		if ( att == null )
			return ElementType::WITHOUT_TYPE
		if ( att.type == null )	 
			return ElementType::WITHOUT_TYPE
		if ( att.type.referenced == null )	 
			return ElementType::WITHOUT_TYPE
		if ( att.type.referenced instanceof Entity ) return ElementType::ENTITY
		if ( att.type.referenced instanceof DataType ) return ElementType::DATATYPE
		if ( att.type.referenced instanceof Enumeration ) return ElementType::ENUM
	}


	def featureType(Reference ref) {
		if ( ref == null )
			return ElementType::WITHOUT_TYPE 
		if ( ref.type == null )	 
			return ElementType::WITHOUT_TYPE
		if ( ref.type.referenced == null )	 
			return ElementType::WITHOUT_TYPE
		if ( ref.type.referenced instanceof Entity ) return ElementType::ENTITY
		if ( ref.type.referenced instanceof DataType ) return ElementType::DATATYPE
		if ( ref.type.referenced instanceof Enumeration ) return ElementType::ENUM
	}
	
}