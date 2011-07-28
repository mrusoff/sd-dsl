/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;

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
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslFactory
 * @model kind="package"
 * @generated
 */
public interface InstanceDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "instanceDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaunier.fr/xtext/instance/om/InstanceDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "instanceDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InstanceDslPackage eINSTANCE = fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FactoryImpl <em>Factory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.FactoryImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getFactory()
   * @generated
   */
  int FACTORY = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY__ROOT = 1;

  /**
   * The number of structural features of the '<em>Factory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ImportImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getImport()
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
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__EFEATURE = 0;

  /**
   * The feature id for the '<em><b>Is Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__IS_MANY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VALUE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NewObjectImpl <em>New Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NewObjectImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNewObject()
   * @generated
   */
  int NEW_OBJECT = 3;

  /**
   * The feature id for the '<em><b>EClass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_OBJECT__ECLASS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_OBJECT__NAME = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_OBJECT__FEATURES = 2;

  /**
   * The number of structural features of the '<em>New Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_OBJECT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ValueImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 4;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ReferenceImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ContainmentImpl <em>Containment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ContainmentImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getContainment()
   * @generated
   */
  int CONTAINMENT = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Containment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINMENT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.EnumAttributeImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getEnumAttribute()
   * @generated
   */
  int ENUM_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Enum Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getTerminalExpression()
   * @generated
   */
  int TERMINAL_EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__THIS = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__NEW = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__INT = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__STRING = VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION__NULL = VALUE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMINAL_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ThisImpl <em>This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ThisImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getThis()
   * @generated
   */
  int THIS = 9;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NewImpl <em>New</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NewImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNew()
   * @generated
   */
  int NEW = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW__TYPE = 0;

  /**
   * The number of structural features of the '<em>New</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.InteroImpl <em>Intero</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InteroImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getIntero()
   * @generated
   */
  int INTERO = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERO__VALUE = 0;

  /**
   * The number of structural features of the '<em>Intero</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.StringaImpl <em>Stringa</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.StringaImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getStringa()
   * @generated
   */
  int STRINGA = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRINGA__VALUE = 0;

  /**
   * The number of structural features of the '<em>Stringa</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRINGA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NulloImpl <em>Nullo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NulloImpl
   * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNullo()
   * @generated
   */
  int NULLO = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLO__VALUE = 0;

  /**
   * The number of structural features of the '<em>Nullo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLO_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory <em>Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factory</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Factory
   * @generated
   */
  EClass getFactory();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Factory#getImports()
   * @see #getFactory()
   * @generated
   */
  EReference getFactory_Imports();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Factory#getRoot()
   * @see #getFactory()
   * @generated
   */
  EReference getFactory_Root();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getEFeature <em>EFeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EFeature</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Feature#getEFeature()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_EFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#isIsMany <em>Is Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Many</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Feature#isIsMany()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_IsMany();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Feature#getValue()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.NewObject <em>New Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Object</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.NewObject
   * @generated
   */
  EClass getNewObject();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getEClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EClass</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getEClass()
   * @see #getNewObject()
   * @generated
   */
  EReference getNewObject_EClass();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getName()
   * @see #getNewObject()
   * @generated
   */
  EAttribute getNewObject_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.NewObject#getFeatures()
   * @see #getNewObject()
   * @generated
   */
  EReference getNewObject_Features();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.Reference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Reference#getValue()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Containment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Containment</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Containment
   * @generated
   */
  EClass getContainment();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.Containment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Containment#getValue()
   * @see #getContainment()
   * @generated
   */
  EReference getContainment_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute <em>Enum Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Attribute</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute
   * @generated
   */
  EClass getEnumAttribute();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute#getValue()
   * @see #getEnumAttribute()
   * @generated
   */
  EReference getEnumAttribute_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression <em>Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terminal Expression</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression
   * @generated
   */
  EClass getTerminalExpression();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>This</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getThis()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_This();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNew()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_New();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getInt <em>Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Int</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getInt()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_Int();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>String</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getString()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_String();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Null</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNull()
   * @see #getTerminalExpression()
   * @generated
   */
  EReference getTerminalExpression_Null();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.This <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.This
   * @generated
   */
  EClass getThis();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.This#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.This#getVariable()
   * @see #getThis()
   * @generated
   */
  EAttribute getThis_Variable();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.New <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.New
   * @generated
   */
  EClass getNew();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.instance.om.instanceDsl.New#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.New#getType()
   * @see #getNew()
   * @generated
   */
  EReference getNew_Type();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Intero <em>Intero</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intero</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Intero
   * @generated
   */
  EClass getIntero();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.Intero#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Intero#getValue()
   * @see #getIntero()
   * @generated
   */
  EAttribute getIntero_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Stringa <em>Stringa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stringa</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Stringa
   * @generated
   */
  EClass getStringa();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.Stringa#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Stringa#getValue()
   * @see #getStringa()
   * @generated
   */
  EAttribute getStringa_Value();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.instance.om.instanceDsl.Nullo <em>Nullo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nullo</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Nullo
   * @generated
   */
  EClass getNullo();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.instance.om.instanceDsl.Nullo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.Nullo#getValue()
   * @see #getNullo()
   * @generated
   */
  EAttribute getNullo_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InstanceDslFactory getInstanceDslFactory();

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
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FactoryImpl <em>Factory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.FactoryImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getFactory()
     * @generated
     */
    EClass FACTORY = eINSTANCE.getFactory();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTORY__IMPORTS = eINSTANCE.getFactory_Imports();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTORY__ROOT = eINSTANCE.getFactory_Root();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ImportImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>EFeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__EFEATURE = eINSTANCE.getFeature_EFeature();

    /**
     * The meta object literal for the '<em><b>Is Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__IS_MANY = eINSTANCE.getFeature_IsMany();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__VALUE = eINSTANCE.getFeature_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NewObjectImpl <em>New Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NewObjectImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNewObject()
     * @generated
     */
    EClass NEW_OBJECT = eINSTANCE.getNewObject();

    /**
     * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_OBJECT__ECLASS = eINSTANCE.getNewObject_EClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_OBJECT__NAME = eINSTANCE.getNewObject_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_OBJECT__FEATURES = eINSTANCE.getNewObject_Features();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ValueImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ReferenceImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__VALUE = eINSTANCE.getReference_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ContainmentImpl <em>Containment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ContainmentImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getContainment()
     * @generated
     */
    EClass CONTAINMENT = eINSTANCE.getContainment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINMENT__VALUE = eINSTANCE.getContainment_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.EnumAttributeImpl <em>Enum Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.EnumAttributeImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getEnumAttribute()
     * @generated
     */
    EClass ENUM_ATTRIBUTE = eINSTANCE.getEnumAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_ATTRIBUTE__VALUE = eINSTANCE.getEnumAttribute_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl <em>Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getTerminalExpression()
     * @generated
     */
    EClass TERMINAL_EXPRESSION = eINSTANCE.getTerminalExpression();

    /**
     * The meta object literal for the '<em><b>This</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__THIS = eINSTANCE.getTerminalExpression_This();

    /**
     * The meta object literal for the '<em><b>New</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__NEW = eINSTANCE.getTerminalExpression_New();

    /**
     * The meta object literal for the '<em><b>Int</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__INT = eINSTANCE.getTerminalExpression_Int();

    /**
     * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__STRING = eINSTANCE.getTerminalExpression_String();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMINAL_EXPRESSION__NULL = eINSTANCE.getTerminalExpression_Null();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.ThisImpl <em>This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.ThisImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getThis()
     * @generated
     */
    EClass THIS = eINSTANCE.getThis();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THIS__VARIABLE = eINSTANCE.getThis_Variable();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NewImpl <em>New</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NewImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNew()
     * @generated
     */
    EClass NEW = eINSTANCE.getNew();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW__TYPE = eINSTANCE.getNew_Type();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.InteroImpl <em>Intero</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InteroImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getIntero()
     * @generated
     */
    EClass INTERO = eINSTANCE.getIntero();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERO__VALUE = eINSTANCE.getIntero_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.StringaImpl <em>Stringa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.StringaImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getStringa()
     * @generated
     */
    EClass STRINGA = eINSTANCE.getStringa();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRINGA__VALUE = eINSTANCE.getStringa_Value();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.NulloImpl <em>Nullo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.NulloImpl
     * @see fr.chaunier.xtext.instance.om.instanceDsl.impl.InstanceDslPackageImpl#getNullo()
     * @generated
     */
    EClass NULLO = eINSTANCE.getNullo();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULLO__VALUE = eINSTANCE.getNullo_Value();

  }

} //InstanceDslPackage
