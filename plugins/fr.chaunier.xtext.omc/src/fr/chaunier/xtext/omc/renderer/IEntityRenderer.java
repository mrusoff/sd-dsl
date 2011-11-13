package fr.chaunier.xtext.omc.renderer;

import fr.chaunier.xtext.omc.features.Cardinality;
import fr.chaunier.xtext.omc.omcDsl.Attribute;
import fr.chaunier.xtext.omc.omcDsl.DataType;
import fr.chaunier.xtext.omc.omcDsl.Reference;

public interface IEntityRenderer {

	public abstract void setIconPath(String iconPath);

	public abstract String constraintInFeature(Reference r);

	public abstract String constraintInFeature(Attribute a);

	public abstract String constraintInFeature(DataType dt);

	// buid cardinality for attribute	
	public abstract String cardinality(Attribute att);

	// buid cardinality for reference	
	public abstract String cardinality(Reference ref);

	// buid cardinality for attribute	
	public abstract String cardinality(Cardinality cardinality);

	public abstract Boolean isEntity(Attribute a);
	
	public abstract  String constraintType(Attribute a) ;

	public abstract  String elementType(Attribute a) ;
	public abstract  String elementType(Reference a) ;
	
	
}