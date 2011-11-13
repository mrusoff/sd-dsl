package fr.chaunier.xtext.omc

import fr.chaunier.xtext.omc.features.MergeConstraint
import fr.chaunier.xtext.omc.features.ConstraintResult
import fr.chaunier.xtext.omc.features.ConstraintType
import fr.chaunier.xtext.omc.features.ElementType
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Enumeration
import fr.chaunier.xtext.omc.omcDsl.Reference

class BuildConstraintResult extends MergeConstraint {

  
  def getMin(Attribute att) {
  		if ( att == null ) 
  			return 0
		if (att.type.multi)return 0 
		else if (att.type.multi1)return 1 
		else if (att.type.option)return 0 else return 1 
  }
   
  def getMin(Reference ref) {
  		if ( ref == null ) 
  			return 0
		if (ref.type.multi)return 0 
		else if (ref.type.multi1)return 1 
		else if (ref.type.option)return 0 else return 1 
  }

  def getMax(Attribute att) {
  		if ( att == null ) 
  			return 1
		if (att.type.multi)return -1 
		else if (att.type.multi1)return -1 
		else return 1 
  }

  def getMax(Reference ref) {
  		if ( ref == null ) 
  			return 1
		if (ref.type.multi)return -1 
		else if (ref.type.multi1)return -1 
		else return 1 
  }

	// duplicate ElementTypeHelper
	def featureType(Attribute att) {
		if ( att == null )
			return ElementType::ENTITY 
		if ( att.type.referenced instanceof Entity ) return ElementType::ENTITY
		if ( att.type.referenced instanceof DataType ) return ElementType::DATATYPE
		if ( att.type.referenced instanceof Enumeration ) return ElementType::ENUM
	}

	// duplicate ElementTypeHelper
	def featureType(Reference ref) {
		if ( ref == null )
			return ElementType::ENTITY 
		if ( ref.type.referenced instanceof Entity ) return ElementType::ENTITY
		if ( ref.type.referenced instanceof DataType ) return ElementType::DATATYPE
		if ( ref.type.referenced instanceof Enumeration ) return ElementType::ENUM
	}

  def constraintString(Attribute att) {
	if ( att == null) 
		return null   	
	var constraint = getMergedConstraint(att)
	return new ConstraintResult(att.min,att.max,constraintType(constraint),constraint,att.featureType,att.type.referenced)
  }
  
  def constraintString(Reference ref) {
	if ( ref == null) 
		return null   	
	return new ConstraintResult(ref.min,ref.max,ConstraintType::WITHOUT,null,ref.featureType,ref.type.referenced)
  }

}