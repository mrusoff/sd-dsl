/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;

import fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap;
import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.Model;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslFactory;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SMapDslPackageImpl extends EPackageImpl implements SMapDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureMapEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SMapDslPackageImpl()
  {
    super(eNS_URI, SMapDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SMapDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SMapDslPackage init()
  {
    if (isInited) return (SMapDslPackage)EPackage.Registry.INSTANCE.getEPackage(SMapDslPackage.eNS_URI);

    // Obtain or create and register package
    SMapDslPackageImpl theSMapDslPackage = (SMapDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SMapDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SMapDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    BomDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSMapDslPackage.createPackageContents();

    // Initialize created meta-data
    theSMapDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSMapDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SMapDslPackage.eNS_URI, theSMapDslPackage);
    return theSMapDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_MappingModules()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMappingModule()
  {
    return mappingModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMappingModule_Name()
  {
    return (EAttribute)mappingModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMappingModule_MappedFeatures()
  {
    return (EReference)mappingModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureMap()
  {
    return featureMapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMap_LeftField()
  {
    return (EReference)featureMapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMap_RightField()
  {
    return (EReference)featureMapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureMap_Rule()
  {
    return (EAttribute)featureMapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMap_SetLeftField()
  {
    return (EReference)featureMapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureMap_ValLeft()
  {
    return (EAttribute)featureMapEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMap_SetRightField()
  {
    return (EReference)featureMapEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureMap_ValRight()
  {
    return (EAttribute)featureMapEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMap_IgnoreLeftField()
  {
    return (EReference)featureMapEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureMap_Documentation()
  {
    return (EAttribute)featureMapEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMapDslFactory getSMapDslFactory()
  {
    return (SMapDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MAPPING_MODULES);

    mappingModuleEClass = createEClass(MAPPING_MODULE);
    createEAttribute(mappingModuleEClass, MAPPING_MODULE__NAME);
    createEReference(mappingModuleEClass, MAPPING_MODULE__MAPPED_FEATURES);

    featureMapEClass = createEClass(FEATURE_MAP);
    createEReference(featureMapEClass, FEATURE_MAP__LEFT_FIELD);
    createEReference(featureMapEClass, FEATURE_MAP__RIGHT_FIELD);
    createEAttribute(featureMapEClass, FEATURE_MAP__RULE);
    createEReference(featureMapEClass, FEATURE_MAP__SET_LEFT_FIELD);
    createEAttribute(featureMapEClass, FEATURE_MAP__VAL_LEFT);
    createEReference(featureMapEClass, FEATURE_MAP__SET_RIGHT_FIELD);
    createEAttribute(featureMapEClass, FEATURE_MAP__VAL_RIGHT);
    createEReference(featureMapEClass, FEATURE_MAP__IGNORE_LEFT_FIELD);
    createEAttribute(featureMapEClass, FEATURE_MAP__DOCUMENTATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    BomDslPackage theBomDslPackage = (BomDslPackage)EPackage.Registry.INSTANCE.getEPackage(BomDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_MappingModules(), this.getMappingModule(), null, "mappingModules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingModuleEClass, MappingModule.class, "MappingModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMappingModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMappingModule_MappedFeatures(), this.getFeatureMap(), null, "mappedFeatures", null, 0, -1, MappingModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureMapEClass, FeatureMap.class, "FeatureMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureMap_LeftField(), theBomDslPackage.getAttribute(), null, "leftField", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMap_RightField(), theBomDslPackage.getAttribute(), null, "rightField", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureMap_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMap_SetLeftField(), theBomDslPackage.getAttribute(), null, "setLeftField", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureMap_ValLeft(), ecorePackage.getEString(), "valLeft", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMap_SetRightField(), theBomDslPackage.getAttribute(), null, "setRightField", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureMap_ValRight(), ecorePackage.getEString(), "valRight", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMap_IgnoreLeftField(), theBomDslPackage.getAttribute(), null, "ignoreLeftField", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureMap_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, FeatureMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SMapDslPackageImpl
