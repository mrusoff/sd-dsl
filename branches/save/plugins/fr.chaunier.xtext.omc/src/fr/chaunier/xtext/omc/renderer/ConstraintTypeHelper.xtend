package fr.chaunier.xtext.omc.renderer

import fr.chaunier.xtext.omc.features.ConstraintType
import fr.chaunier.xtext.omc.omcDsl.BoolConstraint
import fr.chaunier.xtext.omc.omcDsl.Constraint
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint
import fr.chaunier.xtext.omc.omcDsl.IntegerConstraint
import fr.chaunier.xtext.omc.omcDsl.StringConstraint

class ConstraintTypeHelper {

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
}