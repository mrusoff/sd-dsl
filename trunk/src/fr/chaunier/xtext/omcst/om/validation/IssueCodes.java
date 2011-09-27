package fr.chaunier.xtext.omcst.om.validation;

public interface IssueCodes {
  String PREFIX = "fr.chaunier.xtext.omcst.om.omcstDsl.";
  String INVALID_TYPE_NAME = PREFIX + "InvalidTypeName";
  String INVALID_FEATURE_NAME = PREFIX + "InvalidFeatureName";
  String INVALID_FEATURE_CONSTRAINT = PREFIX + "InvalidConstraint";
  String MISSING_TYPE = PREFIX + "MissingType";
  String CIRCULAR_INHERITANCE = PREFIX + "CircularInheritance";
}
