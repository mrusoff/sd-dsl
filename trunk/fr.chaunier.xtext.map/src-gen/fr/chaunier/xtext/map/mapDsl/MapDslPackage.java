/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.map.mapDsl.MapDslFactory
 * @model kind="package"
 * @generated
 */
public interface MapDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaunier.fr/xtext/map/MapDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapDslPackage eINSTANCE = fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.ModelImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DOCUMENTATION = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 3;

  /**
   * The feature id for the '<em><b>Fuctions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUCTIONS = 4;

  /**
   * The feature id for the '<em><b>Mapping Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPING_MODULES = 5;

  /**
   * The feature id for the '<em><b>Roots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOTS = 6;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.ImportImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.RootModuleImpl <em>Root Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.RootModuleImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getRootModule()
   * @generated
   */
  int ROOT_MODULE = 2;

  /**
   * The feature id for the '<em><b>Root Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_MODULE__ROOT_REF = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_MODULE__DOCUMENTATION = 1;

  /**
   * The number of structural features of the '<em>Root Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.RuleImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getRule()
   * @generated
   */
  int RULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__OPERATION = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ARGS = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionImpl <em>Fuction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuction()
   * @generated
   */
  int FUCTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION__IN = 1;

  /**
   * The feature id for the '<em><b>Out</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION__OUT = 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION__DOCUMENTATION = 3;

  /**
   * The number of structural features of the '<em>Fuction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl <em>Fuction In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuctionIn()
   * @generated
   */
  int FUCTION_IN = 5;

  /**
   * The feature id for the '<em><b>In Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_IN__IN_ENTITY = 0;

  /**
   * The feature id for the '<em><b>In Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_IN__IN_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Fuction In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_IN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl <em>Fuction Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuctionOut()
   * @generated
   */
  int FUCTION_OUT = 6;

  /**
   * The feature id for the '<em><b>Out Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_OUT__OUT_ENTITY = 0;

  /**
   * The feature id for the '<em><b>Out Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_OUT__OUT_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Fuction Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUCTION_OUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getMappingModule()
   * @generated
   */
  int MAPPING_MODULE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Entity Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__ENTITY_SOURCE = 1;

  /**
   * The feature id for the '<em><b>Entity Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__ENTITY_TARGET = 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__DOCUMENTATION = 3;

  /**
   * The feature id for the '<em><b>Mapped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__MAPPED_FEATURES = 4;

  /**
   * The number of structural features of the '<em>Mapping Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFeatureMap()
   * @generated
   */
  int FEATURE_MAP = 8;

  /**
   * The feature id for the '<em><b>Fuction Map</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__FUCTION_MAP = 0;

  /**
   * The feature id for the '<em><b>Attribute Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__ATTRIBUTE_SOURCE = 1;

  /**
   * The feature id for the '<em><b>Attribute Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__ATTRIBUTE_TARGET = 2;

  /**
   * The feature id for the '<em><b>With Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__WITH_MODULE = 3;

  /**
   * The feature id for the '<em><b>Attribute Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__ATTRIBUTE_SOURCES = 4;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__EXPR = 5;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__RULE = 6;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__DOCUMENTATION = 7;

  /**
   * The number of structural features of the '<em>Feature Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.ExpressionImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__INT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl <em>Nested In Transformation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedInTransformationParameter()
   * @generated
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>In Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER__IN_ENTITY = FUCTION_IN__IN_ENTITY;

  /**
   * The feature id for the '<em><b>In Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER__IN_ATTRIBUTE = FUCTION_IN__IN_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER__TARGET = FUCTION_IN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>In Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE = FUCTION_IN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested In Transformation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_IN_TRANSFORMATION_PARAMETER_FEATURE_COUNT = FUCTION_IN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl <em>Nested Out Transformation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedOutTransformationParameter()
   * @generated
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Out Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_ENTITY = FUCTION_OUT__OUT_ENTITY;

  /**
   * The feature id for the '<em><b>Out Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_ATTRIBUTE = FUCTION_OUT__OUT_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET = FUCTION_OUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Out Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE = FUCTION_OUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Out Transformation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OUT_TRANSFORMATION_PARAMETER_FEATURE_COUNT = FUCTION_OUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl <em>Nested Transformation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedTransformationParameter()
   * @generated
   */
  int NESTED_TRANSFORMATION_PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Fuction Map</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__FUCTION_MAP = FEATURE_MAP__FUCTION_MAP;

  /**
   * The feature id for the '<em><b>Attribute Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__ATTRIBUTE_SOURCE = FEATURE_MAP__ATTRIBUTE_SOURCE;

  /**
   * The feature id for the '<em><b>Attribute Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__ATTRIBUTE_TARGET = FEATURE_MAP__ATTRIBUTE_TARGET;

  /**
   * The feature id for the '<em><b>With Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__WITH_MODULE = FEATURE_MAP__WITH_MODULE;

  /**
   * The feature id for the '<em><b>Attribute Sources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__ATTRIBUTE_SOURCES = FEATURE_MAP__ATTRIBUTE_SOURCES;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__EXPR = FEATURE_MAP__EXPR;

  /**
   * The feature id for the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__RULE = FEATURE_MAP__RULE;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__DOCUMENTATION = FEATURE_MAP__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__TARGET = FEATURE_MAP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE = FEATURE_MAP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Transformation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TRANSFORMATION_PARAMETER_FEATURE_COUNT = FEATURE_MAP_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Model#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getDocumentation()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Model#getFuctions <em>Fuctions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fuctions</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getFuctions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Fuctions();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Model#getMappingModules <em>Mapping Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping Modules</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getMappingModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MappingModules();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.map.mapDsl.Model#getRoots <em>Roots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Roots</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model#getRoots()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Roots();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.RootModule <em>Root Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Module</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.RootModule
   * @generated
   */
  EClass getRootModule();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.RootModule#getRootRef <em>Root Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Ref</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.RootModule#getRootRef()
   * @see #getRootModule()
   * @generated
   */
  EReference getRootModule_RootRef();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.RootModule#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.RootModule#getDocumentation()
   * @see #getRootModule()
   * @generated
   */
  EAttribute getRootModule_Documentation();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Rule#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Rule#getOperation()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Operation();

  /**
   * Returns the meta object for the attribute list '{@link fr.chaunier.xtext.map.mapDsl.Rule#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Rule#getArgs()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Args();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Fuction <em>Fuction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuction</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction
   * @generated
   */
  EClass getFuction();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Fuction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction#getName()
   * @see #getFuction()
   * @generated
   */
  EAttribute getFuction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Fuction#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>In</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction#getIn()
   * @see #getFuction()
   * @generated
   */
  EReference getFuction_In();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Fuction#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Out</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction#getOut()
   * @see #getFuction()
   * @generated
   */
  EReference getFuction_Out();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Fuction#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction#getDocumentation()
   * @see #getFuction()
   * @generated
   */
  EAttribute getFuction_Documentation();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn <em>Fuction In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuction In</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionIn
   * @generated
   */
  EClass getFuctionIn();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInEntity <em>In Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In Entity</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionIn#getInEntity()
   * @see #getFuctionIn()
   * @generated
   */
  EReference getFuctionIn_InEntity();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInAttribute <em>In Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In Attribute</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionIn#getInAttribute()
   * @see #getFuctionIn()
   * @generated
   */
  EReference getFuctionIn_InAttribute();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut <em>Fuction Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fuction Out</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionOut
   * @generated
   */
  EClass getFuctionOut();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutEntity <em>Out Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Out Entity</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutEntity()
   * @see #getFuctionOut()
   * @generated
   */
  EReference getFuctionOut_OutEntity();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutAttribute <em>Out Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Out Attribute</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutAttribute()
   * @see #getFuctionOut()
   * @generated
   */
  EReference getFuctionOut_OutAttribute();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.MappingModule <em>Mapping Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Module</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule
   * @generated
   */
  EClass getMappingModule();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getName()
   * @see #getMappingModule()
   * @generated
   */
  EAttribute getMappingModule_Name();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntitySource <em>Entity Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity Source</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getEntitySource()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_EntitySource();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntityTarget <em>Entity Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity Target</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getEntityTarget()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_EntityTarget();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getDocumentation()
   * @see #getMappingModule()
   * @generated
   */
  EAttribute getMappingModule_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getMappedFeatures <em>Mapped Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Features</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getMappedFeatures()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_MappedFeatures();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap <em>Feature Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Map</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap
   * @generated
   */
  EClass getFeatureMap();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getFuctionMap <em>Fuction Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fuction Map</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getFuctionMap()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_FuctionMap();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSource <em>Attribute Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute Source</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSource()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_AttributeSource();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeTarget <em>Attribute Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute Target</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeTarget()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_AttributeTarget();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getWithModule <em>With Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>With Module</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getWithModule()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_WithModule();

  /**
   * Returns the meta object for the reference list '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSources <em>Attribute Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attribute Sources</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSources()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_AttributeSources();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getExpr()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_Expr();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_Rule();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Documentation();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Expression#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Expression#getIntValue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_IntValue();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter <em>Nested In Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested In Transformation Parameter</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter
   * @generated
   */
  EClass getNestedInTransformationParameter();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getTarget()
   * @see #getNestedInTransformationParameter()
   * @generated
   */
  EReference getNestedInTransformationParameter_Target();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getInRefAttribute <em>In Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>In Ref Attribute</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getInRefAttribute()
   * @see #getNestedInTransformationParameter()
   * @generated
   */
  EReference getNestedInTransformationParameter_InRefAttribute();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter <em>Nested Out Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Out Transformation Parameter</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter
   * @generated
   */
  EClass getNestedOutTransformationParameter();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getTarget()
   * @see #getNestedOutTransformationParameter()
   * @generated
   */
  EReference getNestedOutTransformationParameter_Target();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getOutRefAttribute <em>Out Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Out Ref Attribute</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getOutRefAttribute()
   * @see #getNestedOutTransformationParameter()
   * @generated
   */
  EReference getNestedOutTransformationParameter_OutRefAttribute();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter <em>Nested Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Transformation Parameter</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter
   * @generated
   */
  EClass getNestedTransformationParameter();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getTarget()
   * @see #getNestedTransformationParameter()
   * @generated
   */
  EReference getNestedTransformationParameter_Target();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getRefAttribute <em>Ref Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attribute</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getRefAttribute()
   * @see #getNestedTransformationParameter()
   * @generated
   */
  EReference getNestedTransformationParameter_RefAttribute();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapDslFactory getMapDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.ModelImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__DOCUMENTATION = eINSTANCE.getModel_Documentation();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '<em><b>Fuctions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUCTIONS = eINSTANCE.getModel_Fuctions();

    /**
     * The meta object literal for the '<em><b>Mapping Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPING_MODULES = eINSTANCE.getModel_MappingModules();

    /**
     * The meta object literal for the '<em><b>Roots</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOTS = eINSTANCE.getModel_Roots();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.ImportImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.RootModuleImpl <em>Root Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.RootModuleImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getRootModule()
     * @generated
     */
    EClass ROOT_MODULE = eINSTANCE.getRootModule();

    /**
     * The meta object literal for the '<em><b>Root Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_MODULE__ROOT_REF = eINSTANCE.getRootModule_RootRef();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT_MODULE__DOCUMENTATION = eINSTANCE.getRootModule_Documentation();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.RuleImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__OPERATION = eINSTANCE.getRule_Operation();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__ARGS = eINSTANCE.getRule_Args();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionImpl <em>Fuction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuction()
     * @generated
     */
    EClass FUCTION = eINSTANCE.getFuction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUCTION__NAME = eINSTANCE.getFuction_Name();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION__IN = eINSTANCE.getFuction_In();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION__OUT = eINSTANCE.getFuction_Out();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUCTION__DOCUMENTATION = eINSTANCE.getFuction_Documentation();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl <em>Fuction In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuctionIn()
     * @generated
     */
    EClass FUCTION_IN = eINSTANCE.getFuctionIn();

    /**
     * The meta object literal for the '<em><b>In Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION_IN__IN_ENTITY = eINSTANCE.getFuctionIn_InEntity();

    /**
     * The meta object literal for the '<em><b>In Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION_IN__IN_ATTRIBUTE = eINSTANCE.getFuctionIn_InAttribute();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl <em>Fuction Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFuctionOut()
     * @generated
     */
    EClass FUCTION_OUT = eINSTANCE.getFuctionOut();

    /**
     * The meta object literal for the '<em><b>Out Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION_OUT__OUT_ENTITY = eINSTANCE.getFuctionOut_OutEntity();

    /**
     * The meta object literal for the '<em><b>Out Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUCTION_OUT__OUT_ATTRIBUTE = eINSTANCE.getFuctionOut_OutAttribute();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getMappingModule()
     * @generated
     */
    EClass MAPPING_MODULE = eINSTANCE.getMappingModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_MODULE__NAME = eINSTANCE.getMappingModule_Name();

    /**
     * The meta object literal for the '<em><b>Entity Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__ENTITY_SOURCE = eINSTANCE.getMappingModule_EntitySource();

    /**
     * The meta object literal for the '<em><b>Entity Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__ENTITY_TARGET = eINSTANCE.getMappingModule_EntityTarget();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_MODULE__DOCUMENTATION = eINSTANCE.getMappingModule_Documentation();

    /**
     * The meta object literal for the '<em><b>Mapped Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__MAPPED_FEATURES = eINSTANCE.getMappingModule_MappedFeatures();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFeatureMap()
     * @generated
     */
    EClass FEATURE_MAP = eINSTANCE.getFeatureMap();

    /**
     * The meta object literal for the '<em><b>Fuction Map</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__FUCTION_MAP = eINSTANCE.getFeatureMap_FuctionMap();

    /**
     * The meta object literal for the '<em><b>Attribute Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__ATTRIBUTE_SOURCE = eINSTANCE.getFeatureMap_AttributeSource();

    /**
     * The meta object literal for the '<em><b>Attribute Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__ATTRIBUTE_TARGET = eINSTANCE.getFeatureMap_AttributeTarget();

    /**
     * The meta object literal for the '<em><b>With Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__WITH_MODULE = eINSTANCE.getFeatureMap_WithModule();

    /**
     * The meta object literal for the '<em><b>Attribute Sources</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__ATTRIBUTE_SOURCES = eINSTANCE.getFeatureMap_AttributeSources();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__EXPR = eINSTANCE.getFeatureMap_Expr();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__RULE = eINSTANCE.getFeatureMap_Rule();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__DOCUMENTATION = eINSTANCE.getFeatureMap_Documentation();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.ExpressionImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__INT_VALUE = eINSTANCE.getExpression_IntValue();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl <em>Nested In Transformation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedInTransformationParameter()
     * @generated
     */
    EClass NESTED_IN_TRANSFORMATION_PARAMETER = eINSTANCE.getNestedInTransformationParameter();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_IN_TRANSFORMATION_PARAMETER__TARGET = eINSTANCE.getNestedInTransformationParameter_Target();

    /**
     * The meta object literal for the '<em><b>In Ref Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE = eINSTANCE.getNestedInTransformationParameter_InRefAttribute();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl <em>Nested Out Transformation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedOutTransformationParameter()
     * @generated
     */
    EClass NESTED_OUT_TRANSFORMATION_PARAMETER = eINSTANCE.getNestedOutTransformationParameter();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET = eINSTANCE.getNestedOutTransformationParameter_Target();

    /**
     * The meta object literal for the '<em><b>Out Ref Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE = eINSTANCE.getNestedOutTransformationParameter_OutRefAttribute();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl <em>Nested Transformation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getNestedTransformationParameter()
     * @generated
     */
    EClass NESTED_TRANSFORMATION_PARAMETER = eINSTANCE.getNestedTransformationParameter();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_TRANSFORMATION_PARAMETER__TARGET = eINSTANCE.getNestedTransformationParameter_Target();

    /**
     * The meta object literal for the '<em><b>Ref Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE = eINSTANCE.getNestedTransformationParameter_RefAttribute();

  }

} //MapDslPackage
