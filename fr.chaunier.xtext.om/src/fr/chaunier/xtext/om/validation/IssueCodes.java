package fr.chaunier.xtext.om.validation;

public interface IssueCodes {
  String PREFIX = "fr.chaunier.xtext.om.omDsl.";
  String INVALID_TYPE_NAME = PREFIX + "InvalidTypeName";
  String INVALID_FEATURE_NAME = PREFIX + "InvalidFeatureName";
  String MISSING_TYPE = PREFIX + "MissingType";
  String CIRCULAR_INHERITANCE = PREFIX + "CircularInheritance";
}