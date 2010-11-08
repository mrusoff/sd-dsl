/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl;

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
 * @see fr.chaunier.xtext.simplemap.sMapDsl.SMapDslFactory
 * @model kind="package"
 * @generated
 */
public interface SMapDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sMapDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaunier.fr/xtext/simplemap/SMapDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sMapDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SMapDslPackage eINSTANCE = fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Mapping Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPPING_MODULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getMappingModule()
   * @generated
   */
  int MAPPING_MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__MAPPED_FEATURES = 1;

  /**
   * The number of structural features of the '<em>Mapping Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl
   * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getFeatureMap()
   * @generated
   */
  int FEATURE_MAP = 2;

  /**
   * The feature id for the '<em><b>Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__LEFT_FIELD = 0;

  /**
   * The feature id for the '<em><b>Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__RIGHT_FIELD = 1;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__RULE = 2;

  /**
   * The feature id for the '<em><b>Set Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__SET_LEFT_FIELD = 3;

  /**
   * The feature id for the '<em><b>Val Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__VAL_LEFT = 4;

  /**
   * The feature id for the '<em><b>Set Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__SET_RIGHT_FIELD = 5;

  /**
   * The feature id for the '<em><b>Val Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__VAL_RIGHT = 6;

  /**
   * The feature id for the '<em><b>Ignore Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__IGNORE_LEFT_FIELD = 7;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP__DOCUMENTATION = 8;

  /**
   * The number of structural features of the '<em>Feature Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAP_FEATURE_COUNT = 9;


  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.simplemap.sMapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.simplemap.sMapDsl.Model#getMappingModules <em>Mapping Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping Modules</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.Model#getMappingModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MappingModules();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.simplemap.sMapDsl.MappingModule <em>Mapping Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Module</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.MappingModule
   * @generated
   */
  EClass getMappingModule();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.simplemap.sMapDsl.MappingModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.MappingModule#getName()
   * @see #getMappingModule()
   * @generated
   */
  EAttribute getMappingModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.simplemap.sMapDsl.MappingModule#getMappedFeatures <em>Mapped Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Features</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.MappingModule#getMappedFeatures()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_MappedFeatures();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap <em>Feature Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Map</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap
   * @generated
   */
  EClass getFeatureMap();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getLeftField <em>Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Field</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_LeftField();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getRightField <em>Right Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right Field</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getRightField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_RightField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getRule()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Rule();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Left Field</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getSetLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetLeftField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getValLeft <em>Val Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Left</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getValLeft()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_ValLeft();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Right Field</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getSetRightField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetRightField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getValRight <em>Val Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Right</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getValRight()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_ValRight();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getIgnoreLeftField <em>Ignore Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ignore Left Field</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getIgnoreLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_IgnoreLeftField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap#getDocumentation()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Documentation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SMapDslFactory getSMapDslFactory();

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
     * The meta object literal for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Mapping Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPING_MODULES = eINSTANCE.getModel_MappingModules();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getMappingModule()
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
     * The meta object literal for the '<em><b>Mapped Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__MAPPED_FEATURES = eINSTANCE.getMappingModule_MappedFeatures();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl
     * @see fr.chaunier.xtext.simplemap.sMapDsl.impl.SMapDslPackageImpl#getFeatureMap()
     * @generated
     */
    EClass FEATURE_MAP = eINSTANCE.getFeatureMap();

    /**
     * The meta object literal for the '<em><b>Left Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__LEFT_FIELD = eINSTANCE.getFeatureMap_LeftField();

    /**
     * The meta object literal for the '<em><b>Right Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__RIGHT_FIELD = eINSTANCE.getFeatureMap_RightField();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__RULE = eINSTANCE.getFeatureMap_Rule();

    /**
     * The meta object literal for the '<em><b>Set Left Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__SET_LEFT_FIELD = eINSTANCE.getFeatureMap_SetLeftField();

    /**
     * The meta object literal for the '<em><b>Val Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__VAL_LEFT = eINSTANCE.getFeatureMap_ValLeft();

    /**
     * The meta object literal for the '<em><b>Set Right Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__SET_RIGHT_FIELD = eINSTANCE.getFeatureMap_SetRightField();

    /**
     * The meta object literal for the '<em><b>Val Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__VAL_RIGHT = eINSTANCE.getFeatureMap_ValRight();

    /**
     * The meta object literal for the '<em><b>Ignore Left Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAP__IGNORE_LEFT_FIELD = eINSTANCE.getFeatureMap_IgnoreLeftField();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__DOCUMENTATION = eINSTANCE.getFeatureMap_Documentation();

  }

} //SMapDslPackage
