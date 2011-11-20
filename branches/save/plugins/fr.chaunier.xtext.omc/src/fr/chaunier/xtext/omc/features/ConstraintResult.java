package fr.chaunier.xtext.omc.features;

import fr.chaunier.xtext.omc.omcDsl.Constraint;
import fr.chaunier.xtext.omc.omcDsl.Type;


public class ConstraintResult {

	Cardinality cardinality ;
	ConstraintType type ;
	ElementType elementType ;
	Type typeReferenced ;
	Constraint constraint ;
	
	public ElementType getElementType() {
		return elementType;
	}



	public int getMinCardinality() {
		return cardinality.min;
	}

	public int getMaxCardinality() {
		return cardinality.max;
	}

	public ConstraintType getType() {
		return type;
	}

	public Constraint getConstraint() {
		return constraint;
	}

	
	public ConstraintResult(int min, int max, ConstraintType type, Constraint constraint,ElementType elmType,Type typeReferenced) {
		this.cardinality = new Cardinality(min,max) ;
		this.type = type ;
		this.constraint = constraint ;
		this.elementType = elmType ;
		this.typeReferenced = typeReferenced ;
	}



	public Type getTypeReferenced() {
		return typeReferenced;
	}
	
    public boolean isFeatureIsEntityType() {
		 return elementType == ElementType.ENTITY; 
    }
	
}
