/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.mapdsl.mapDsl;

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
 * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslFactory
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
  String eNS_URI = "http://www.chaunier.fr/xtext/mapdsl/MapDsl";

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
  MapDslPackage eINSTANCE = fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.ModelImpl
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getModel()
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
   * The feature id for the '<em><b>Mapping Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPING_MODULES = 2;

  /**
   * The feature id for the '<em><b>Roots</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOTS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.RootModuleImpl <em>Root Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.RootModuleImpl
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getRootModule()
   * @generated
   */
  int ROOT_MODULE = 1;

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
   * The meta object id for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MappingModuleImpl
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getMappingModule()
   * @generated
   */
  int MAPPING_MODULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__DOCUMENTATION = 1;

  /**
   * The feature id for the '<em><b>Mapped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__MAPPED_FEATURES = 2;

  /**
   * The number of structural features of the '<em>Mapping Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.FeatureMapImpl
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getFeatureMap()
   * @generated
   */
  int FEATURE_MAP = 3;

  /**
   * The feature id for the '<em><b>Left Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__LEFT_FIELDS = 0;

  /**
   * The feature id for the '<em><b>Right Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__RIGHT_FIELDS = 1;

  /**
   * The feature id for the '<em><b>Set Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__SET_LEFT_FIELD = 2;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__EXPR = 3;

  /**
   * The feature id for the '<em><b>Set Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__SET_RIGHT_FIELD = 4;

  /**
   * The feature id for the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__MODULE = 5;

  /**
   * The feature id for the '<em><b>Rules</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__RULES = 6;

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
   * The meta object id for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.ExpressionImpl
   * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 4;

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
   * Returns the meta object for class '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Model#getDocumentation()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getMappingModules <em>Mapping Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping Modules</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Model#getMappingModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MappingModules();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getRoots <em>Roots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roots</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Model#getRoots()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Roots();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule <em>Root Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Module</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.RootModule
   * @generated
   */
  EClass getRootModule();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getRootRef <em>Root Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root Ref</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getRootRef()
   * @see #getRootModule()
   * @generated
   */
  EReference getRootModule_RootRef();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getDocumentation()
   * @see #getRootModule()
   * @generated
   */
  EAttribute getRootModule_Documentation();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.mapdsl.mapDsl.MappingModule <em>Mapping Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Module</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MappingModule
   * @generated
   */
  EClass getMappingModule();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getName()
   * @see #getMappingModule()
   * @generated
   */
  EAttribute getMappingModule_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getDocumentation()
   * @see #getMappingModule()
   * @generated
   */
  EAttribute getMappingModule_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getMappedFeatures <em>Mapped Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Features</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MappingModule#getMappedFeatures()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_MappedFeatures();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap <em>Feature Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Map</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap
   * @generated
   */
  EClass getFeatureMap();

  /**
   * Returns the meta object for the reference list '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getLeftFields <em>Left Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Left Fields</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getLeftFields()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_LeftFields();

  /**
   * Returns the meta object for the reference list '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRightFields <em>Right Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Right Fields</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRightFields()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_RightFields();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Left Field</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetLeftField();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getExpr()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_Expr();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Right Field</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetRightField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetRightField();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Module</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getModule()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_Module();

  /**
   * Returns the meta object for the attribute list '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rules</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRules()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Rules();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getDocumentation()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Documentation();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.mapdsl.mapDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.Expression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Expression#getValue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Value();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.mapdsl.mapDsl.Expression#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.Expression#getIntValue()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_IntValue();

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
     * The meta object literal for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.ModelImpl
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Mapping Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPING_MODULES = eINSTANCE.getModel_MappingModules();

    /**
     * The meta object literal for the '<em><b>Roots</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOTS = eINSTANCE.getModel_Roots();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.RootModuleImpl <em>Root Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.RootModuleImpl
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getRootModule()
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
     * The meta object literal for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MappingModuleImpl
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getMappingModule()
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
     * The meta object literal for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.FeatureMapImpl
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getFeatureMap()
     * @generated
     */
    EClass FEATURE_MAP = eINSTANCE.getFeatureMap();

    /**
     * The meta object literal for the '<em><b>Left Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__LEFT_FIELDS = eINSTANCE.getFeatureMap_LeftFields();

    /**
     * The meta object literal for the '<em><b>Right Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__RIGHT_FIELDS = eINSTANCE.getFeatureMap_RightFields();

    /**
     * The meta object literal for the '<em><b>Set Left Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__SET_LEFT_FIELD = eINSTANCE.getFeatureMap_SetLeftField();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__EXPR = eINSTANCE.getFeatureMap_Expr();

    /**
     * The meta object literal for the '<em><b>Set Right Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__SET_RIGHT_FIELD = eINSTANCE.getFeatureMap_SetRightField();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__MODULE = eINSTANCE.getFeatureMap_Module();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__RULES = eINSTANCE.getFeatureMap_Rules();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__DOCUMENTATION = eINSTANCE.getFeatureMap_Documentation();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.mapdsl.mapDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.ExpressionImpl
     * @see fr.chaunier.xtext.mapdsl.mapDsl.impl.MapDslPackageImpl#getExpression()
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

  }

} //MapDslPackage
