package fr.chaunier.xtext.omc.features;

public enum ConstraintStatus {

	//Override
	WITHOUT,  
	IN_DATATYPE,  
    IN_FEATURE,  
    OVERRIDE,
    OVERRIDE_SAME_TYPE,
    OVERRIDE_ERROR_TYPE,
    OVERRIDE_SAME_CONSTRAINT,
    OVERRIDE_COMPATIBLE_CONSTRAINT,
    OVERRIDE_UNCOMPATIBLE_CONSTRAINT
    ;  

}