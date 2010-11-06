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
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl <em>Mapping Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.MappingModuleImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getMappingModule()
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
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE__MAPPINGS = 2;

  /**
   * The number of structural features of the '<em>Mapping Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.MappingImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Left Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__LEFT_CLASS = 1;

  /**
   * The feature id for the '<em><b>Right Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__RIGHT_CLASS = 2;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__DOCUMENTATION = 3;

  /**
   * The feature id for the '<em><b>Mapped Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPPED_FEATURES = 4;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl <em>Feature Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl
   * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getFeatureMap()
   * @generated
   */
  int FEATURE_MAP = 4;

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
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Model
   * @generated
   */
  EClass getModel();

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
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getImports()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule#getMappings()
   * @see #getMappingModule()
   * @generated
   */
  EReference getMappingModule_Mappings();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.map.mapDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getLeftClass <em>Left Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Class</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping#getLeftClass()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_LeftClass();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getRightClass <em>Right Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right Class</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping#getRightClass()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_RightClass();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping#getDocumentation()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Documentation();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getMappedFeatures <em>Mapped Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Features</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.Mapping#getMappedFeatures()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_MappedFeatures();

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
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getLeftField <em>Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Field</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_LeftField();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRightField <em>Right Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right Field</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getRightField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_RightField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_Rule();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Left Field</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetLeftField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetLeftField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValLeft <em>Val Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Left</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getValLeft()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_ValLeft();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Set Right Field</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetRightField()
   * @see #getFeatureMap()
   * @generated
   */
  EReference getFeatureMap_SetRightField();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValRight <em>Val Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Right</em>'.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap#getValRight()
   * @see #getFeatureMap()
   * @generated
   */
  EAttribute getFeatureMap_ValRight();

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
     * The meta object literal for the '<em><b>Mapping Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPPING_MODULES = eINSTANCE.getModel_MappingModules();

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
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__IMPORTS = eINSTANCE.getMappingModule_Imports();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODULE__MAPPINGS = eINSTANCE.getMappingModule_Mappings();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.map.mapDsl.impl.MappingImpl
     * @see fr.chaunier.xtext.map.mapDsl.impl.MapDslPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Left Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__LEFT_CLASS = eINSTANCE.getMapping_LeftClass();

    /**
     * The meta object literal for the '<em><b>Right Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__RIGHT_CLASS = eINSTANCE.getMapping_RightClass();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__DOCUMENTATION = eINSTANCE.getMapping_Documentation();

    /**
     * The meta object literal for the '<em><b>Mapped Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPPED_FEATURES = eINSTANCE.getMapping_MappedFeatures();

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
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_MAP__DOCUMENTATION = eINSTANCE.getFeatureMap_Documentation();

  }

} //MapDslPackage
