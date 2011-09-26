/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl.impl;

import fr.chaunier.xtext.instance.om.instanceDsl.Containment;
import fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute;
import fr.chaunier.xtext.instance.om.instanceDsl.Factory;
import fr.chaunier.xtext.instance.om.instanceDsl.Feature;
import fr.chaunier.xtext.instance.om.instanceDsl.Import;
import fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslFactory;
import fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage;
import fr.chaunier.xtext.instance.om.instanceDsl.Intero;
import fr.chaunier.xtext.instance.om.instanceDsl.New;
import fr.chaunier.xtext.instance.om.instanceDsl.NewObject;
import fr.chaunier.xtext.instance.om.instanceDsl.Nullo;
import fr.chaunier.xtext.instance.om.instanceDsl.Reference;
import fr.chaunier.xtext.instance.om.instanceDsl.Stringa;
import fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression;
import fr.chaunier.xtext.instance.om.instanceDsl.This;
import fr.chaunier.xtext.instance.om.instanceDsl.Value;

import fr.chaunier.xtext.om.omDsl.OmDslPackage;

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
public class InstanceDslPackageImpl extends EPackageImpl implements InstanceDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass terminalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nulloEClass = null;

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
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private InstanceDslPackageImpl()
  {
    super(eNS_URI, InstanceDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link InstanceDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static InstanceDslPackage init()
  {
    if (isInited) return (InstanceDslPackage)EPackage.Registry.INSTANCE.getEPackage(InstanceDslPackage.eNS_URI);

    // Obtain or create and register package
    InstanceDslPackageImpl theInstanceDslPackage = (InstanceDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstanceDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstanceDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    OmDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theInstanceDslPackage.createPackageContents();

    // Initialize created meta-data
    theInstanceDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theInstanceDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(InstanceDslPackage.eNS_URI, theInstanceDslPackage);
    return theInstanceDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactory()
  {
    return factoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactory_Imports()
  {
    return (EReference)factoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactory_Root()
  {
    return (EReference)factoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_EFeature()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_IsMany()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Value()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewObject()
  {
    return newObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewObject_EClass()
  {
    return (EReference)newObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewObject_Name()
  {
    return (EAttribute)newObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewObject_Features()
  {
    return (EReference)newObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Value()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainment()
  {
    return containmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainment_Value()
  {
    return (EReference)containmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumAttribute()
  {
    return enumAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumAttribute_Value()
  {
    return (EReference)enumAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerminalExpression()
  {
    return terminalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalExpression_This()
  {
    return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalExpression_New()
  {
    return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalExpression_Int()
  {
    return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalExpression_String()
  {
    return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTerminalExpression_Null()
  {
    return (EReference)terminalExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThis()
  {
    return thisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThis_Variable()
  {
    return (EAttribute)thisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNew()
  {
    return newEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNew_Type()
  {
    return (EReference)newEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntero()
  {
    return interoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntero_Value()
  {
    return (EAttribute)interoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringa()
  {
    return stringaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringa_Value()
  {
    return (EAttribute)stringaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullo()
  {
    return nulloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullo_Value()
  {
    return (EAttribute)nulloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceDslFactory getInstanceDslFactory()
  {
    return (InstanceDslFactory)getEFactoryInstance();
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
    factoryEClass = createEClass(FACTORY);
    createEReference(factoryEClass, FACTORY__IMPORTS);
    createEReference(factoryEClass, FACTORY__ROOT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    featureEClass = createEClass(FEATURE);
    createEReference(featureEClass, FEATURE__EFEATURE);
    createEAttribute(featureEClass, FEATURE__IS_MANY);
    createEReference(featureEClass, FEATURE__VALUE);

    newObjectEClass = createEClass(NEW_OBJECT);
    createEReference(newObjectEClass, NEW_OBJECT__ECLASS);
    createEAttribute(newObjectEClass, NEW_OBJECT__NAME);
    createEReference(newObjectEClass, NEW_OBJECT__FEATURES);

    valueEClass = createEClass(VALUE);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__VALUE);

    containmentEClass = createEClass(CONTAINMENT);
    createEReference(containmentEClass, CONTAINMENT__VALUE);

    enumAttributeEClass = createEClass(ENUM_ATTRIBUTE);
    createEReference(enumAttributeEClass, ENUM_ATTRIBUTE__VALUE);

    terminalExpressionEClass = createEClass(TERMINAL_EXPRESSION);
    createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__THIS);
    createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__NEW);
    createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__INT);
    createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__STRING);
    createEReference(terminalExpressionEClass, TERMINAL_EXPRESSION__NULL);

    thisEClass = createEClass(THIS);
    createEAttribute(thisEClass, THIS__VARIABLE);

    newEClass = createEClass(NEW);
    createEReference(newEClass, NEW__TYPE);

    interoEClass = createEClass(INTERO);
    createEAttribute(interoEClass, INTERO__VALUE);

    stringaEClass = createEClass(STRINGA);
    createEAttribute(stringaEClass, STRINGA__VALUE);

    nulloEClass = createEClass(NULLO);
    createEAttribute(nulloEClass, NULLO__VALUE);
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
    OmDslPackage theOmDslPackage = (OmDslPackage)EPackage.Registry.INSTANCE.getEPackage(OmDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    referenceEClass.getESuperTypes().add(this.getValue());
    containmentEClass.getESuperTypes().add(this.getValue());
    terminalExpressionEClass.getESuperTypes().add(this.getValue());

    // Initialize classes and features; add operations and parameters
    initEClass(factoryEClass, Factory.class, "Factory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactory_Imports(), this.getImport(), null, "imports", null, 0, -1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactory_Root(), this.getNewObject(), null, "root", null, 0, 1, Factory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeature_EFeature(), theOmDslPackage.getStructuralFeature(), null, "eFeature", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_IsMany(), ecorePackage.getEBoolean(), "isMany", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeature_Value(), this.getValue(), null, "value", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newObjectEClass, NewObject.class, "NewObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewObject_EClass(), theOmDslPackage.getEntity(), null, "eClass", null, 0, 1, NewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, NewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewObject_Features(), this.getFeature(), null, "features", null, 0, -1, NewObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainment_Value(), this.getNewObject(), null, "value", null, 0, 1, Containment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumAttributeEClass, EnumAttribute.class, "EnumAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumAttribute_Value(), theOmDslPackage.getEnumerationLiteral(), null, "value", null, 0, 1, EnumAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(terminalExpressionEClass, TerminalExpression.class, "TerminalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTerminalExpression_This(), this.getThis(), null, "this", null, 0, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalExpression_New(), this.getNew(), null, "new", null, 0, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalExpression_Int(), this.getIntero(), null, "int", null, 0, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalExpression_String(), this.getStringa(), null, "string", null, 0, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTerminalExpression_Null(), this.getNullo(), null, "null", null, 0, 1, TerminalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(thisEClass, This.class, "This", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getThis_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, This.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newEClass, New.class, "New", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNew_Type(), theOmDslPackage.getEntity(), null, "type", null, 0, 1, New.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interoEClass, Intero.class, "Intero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntero_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Intero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringaEClass, Stringa.class, "Stringa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringa_Value(), ecorePackage.getEString(), "value", null, 0, 1, Stringa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nulloEClass, Nullo.class, "Nullo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullo_Value(), ecorePackage.getEString(), "value", null, 0, 1, Nullo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //InstanceDslPackageImpl
