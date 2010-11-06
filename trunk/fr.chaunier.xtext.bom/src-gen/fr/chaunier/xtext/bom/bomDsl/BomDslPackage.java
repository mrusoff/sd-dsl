/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslFactory
 * @model kind="package"
 * @generated
 */
public interface BomDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bomDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaunier.fr/xtext/bom/BomDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bomDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BomDslPackage eINSTANCE = fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.DomainModelImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.AbstractElementImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.ImportImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__PREFIX = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.TypeImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.DataTypeImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.EntityImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.TypedElementImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.FeatureImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 7;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.StructuralFeatureImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getStructuralFeature()
   * @generated
   */
  int STRUCTURAL_FEATURE = 8;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__CONSTRAINT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__DESCRIPTION = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__NAME = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE__TYPE = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Structural Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.AttributeImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__CONSTRAINT = STRUCTURAL_FEATURE__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = STRUCTURAL_FEATURE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = STRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = STRUCTURAL_FEATURE__TYPE;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.ReferenceImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__CONSTRAINT = STRUCTURAL_FEATURE__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DESCRIPTION = STRUCTURAL_FEATURE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = STRUCTURAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = STRUCTURAL_FEATURE__TYPE;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.ParameterImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.TypeRefImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 13;

  /**
   * The feature id for the '<em><b>Referenced</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__REFERENCED = 0;

  /**
   * The feature id for the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__MULTI = 1;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__OPTION = 2;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.ConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 14;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.BoolConstraintImpl <em>Bool Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BoolConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getBoolConstraint()
   * @generated
   */
  int BOOL_CONSTRAINT = 15;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTRAINT__DEFAULT_VALUE = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bool Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl <em>String Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getStringConstraint()
   * @generated
   */
  int STRING_CONSTRAINT = 16;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__DEFAULT_VALUE = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__MIN_LENGTH = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__MAX_LENGTH = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Fixe Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__FIXE_LENGTH = CONSTRAINT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Regular Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT__REGULAR_EXPRESSION = CONSTRAINT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>String Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DateTimeConstraintImpl <em>Date Time Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.DateTimeConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDateTimeConstraint()
   * @generated
   */
  int DATE_TIME_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_CONSTRAINT__DATA_TYPE = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_CONSTRAINT__DEFAULT_VALUE = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Date Time Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl <em>Integer Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getIntegerConstraint()
   * @generated
   */
  int INTEGER_CONSTRAINT = 18;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__DEFAULT_VALUE = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__MIN_VALUE = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__MAX_VALUE = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__MAX_LEN = CONSTRAINT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Fixe Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__FIXE_LEN = CONSTRAINT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Paddle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT__PADDLE = CONSTRAINT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Integer Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DecimalConstraintImpl <em>Decimal Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.DecimalConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDecimalConstraint()
   * @generated
   */
  int DECIMAL_CONSTRAINT = 19;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__MIN_VALUE = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__MAX_VALUE = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__MAX_LEN = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fixe Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__FIXE_LEN = CONSTRAINT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Paddle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT__PADDLE = CONSTRAINT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Decimal Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Enumeration Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ENUMERATION_LITERALS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Persisted Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__PERSISTED_VALUE = 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationConstraintImpl
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumerationConstraint()
   * @generated
   */
  int ENUMERATION_CONSTRAINT = 22;

  /**
   * The feature id for the '<em><b>Usage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_CONSTRAINT__USAGE = CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value As String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING = CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enumeration Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.Visibility
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 23;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDateTimeAccuracy()
   * @generated
   */
  int DATE_TIME_ACCURACY = 24;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.bom.bomDsl.EnumUsage <em>Enum Usage</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.bom.bomDsl.EnumUsage
   * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumUsage()
   * @generated
   */
  int ENUM_USAGE = 25;


  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.bom.bomDsl.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prefix</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getPrefix()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Prefix();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getNamespace()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Namespace();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Entity#getDescription()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Description();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Feature</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StructuralFeature
   * @generated
   */
  EClass getStructuralFeature();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getConstraint()
   * @see #getStructuralFeature()
   * @generated
   */
  EReference getStructuralFeature_Constraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getDescription()
   * @see #getStructuralFeature()
   * @generated
   */
  EAttribute getStructuralFeature_Description();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getName()
   * @see #getStructuralFeature()
   * @generated
   */
  EAttribute getStructuralFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StructuralFeature#getType()
   * @see #getStructuralFeature()
   * @generated
   */
  EReference getStructuralFeature_Type();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.bom.bomDsl.Reference#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Reference#getOpposite()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Opposite();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.bom.bomDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.bom.bomDsl.TypeRef#getReferenced <em>Referenced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.TypeRef#getReferenced()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Referenced();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.TypeRef#isMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.TypeRef#isMulti()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_Multi();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.TypeRef#isOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.TypeRef#isOption()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_Option();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint <em>Bool Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.BoolConstraint
   * @generated
   */
  EClass getBoolConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.BoolConstraint#getConstraint()
   * @see #getBoolConstraint()
   * @generated
   */
  EAttribute getBoolConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isHasDefault()
   * @see #getBoolConstraint()
   * @generated
   */
  EAttribute getBoolConstraint_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isDefaultValue()
   * @see #getBoolConstraint()
   * @generated
   */
  EAttribute getBoolConstraint_DefaultValue();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint <em>String Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint
   * @generated
   */
  EClass getStringConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getConstraint()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#isHasDefault()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getDefaultValue()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLength <em>Min Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Length</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLength()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_MinLength();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLength <em>Max Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Length</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLength()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_MaxLength();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLength <em>Fixe Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixe Length</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLength()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_FixeLength();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regular Expression</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.StringConstraint#getRegularExpression()
   * @see #getStringConstraint()
   * @generated
   */
  EAttribute getStringConstraint_RegularExpression();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint <em>Date Time Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Time Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint
   * @generated
   */
  EClass getDateTimeConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getConstraint()
   * @see #getDateTimeConstraint()
   * @generated
   */
  EAttribute getDateTimeConstraint_Constraint();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Type</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getDataType()
   * @see #getDateTimeConstraint()
   * @generated
   */
  EReference getDateTimeConstraint_DataType();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#isHasDefault()
   * @see #getDateTimeConstraint()
   * @generated
   */
  EAttribute getDateTimeConstraint_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint#getDefaultValue()
   * @see #getDateTimeConstraint()
   * @generated
   */
  EAttribute getDateTimeConstraint_DefaultValue();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint <em>Integer Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint
   * @generated
   */
  EClass getIntegerConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraint()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#isHasDefault()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getDefaultValue()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMinValue()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_MinValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMaxValue()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_MaxValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMaxLen <em>Max Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Len</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getMaxLen()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_MaxLen();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getFixeLen <em>Fixe Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixe Len</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getFixeLen()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_FixeLen();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getPaddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paddle</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getPaddle()
   * @see #getIntegerConstraint()
   * @generated
   */
  EAttribute getIntegerConstraint_Paddle();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint <em>Decimal Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint
   * @generated
   */
  EClass getDecimalConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getConstraint()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMinValue()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_MinValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxValue()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_MaxValue();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxLen <em>Max Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Len</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxLen()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_MaxLen();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getFixeLen <em>Fixe Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixe Len</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getFixeLen()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_FixeLen();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getPaddle <em>Paddle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paddle</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getPaddle()
   * @see #getDecimalConstraint()
   * @generated
   */
  EAttribute getDecimalConstraint_Paddle();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.bom.bomDsl.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumeration Literals</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Enumeration#getEnumerationLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_EnumerationLiterals();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral#getName()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persisted Value</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral#getPersistedValue()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_PersistedValue();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint <em>Enumeration Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Constraint</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint
   * @generated
   */
  EClass getEnumerationConstraint();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#getUsage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Usage</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#getUsage()
   * @see #getEnumerationConstraint()
   * @generated
   */
  EAttribute getEnumerationConstraint_Usage();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#isHasDefault <em>Has Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Default</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#isHasDefault()
   * @see #getEnumerationConstraint()
   * @generated
   */
  EAttribute getEnumerationConstraint_HasDefault();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#getDefaultValueAsString <em>Default Value As String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value As String</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint#getDefaultValueAsString()
   * @see #getEnumerationConstraint()
   * @generated
   */
  EAttribute getEnumerationConstraint_DefaultValueAsString();

  /**
   * Returns the meta object for enum '{@link fr.chaunier.xtext.bom.bomDsl.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the meta object for enum '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Date Time Accuracy</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy
   * @generated
   */
  EEnum getDateTimeAccuracy();

  /**
   * Returns the meta object for enum '{@link fr.chaunier.xtext.bom.bomDsl.EnumUsage <em>Enum Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Usage</em>'.
   * @see fr.chaunier.xtext.bom.bomDsl.EnumUsage
   * @generated
   */
  EEnum getEnumUsage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BomDslFactory getBomDslFactory();

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
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.DomainModelImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.AbstractElementImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.ImportImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__PREFIX = eINSTANCE.getPackageDeclaration_Prefix();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAMESPACE = eINSTANCE.getPackageDeclaration_Namespace();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.TypeImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.DataTypeImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.EntityImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__DESCRIPTION = eINSTANCE.getEntity_Description();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.FeatureImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.StructuralFeatureImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getStructuralFeature()
     * @generated
     */
    EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_FEATURE__CONSTRAINT = eINSTANCE.getStructuralFeature_Constraint();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_FEATURE__DESCRIPTION = eINSTANCE.getStructuralFeature_Description();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURAL_FEATURE__NAME = eINSTANCE.getStructuralFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURAL_FEATURE__TYPE = eINSTANCE.getStructuralFeature_Type();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.AttributeImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.ReferenceImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.ParameterImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.TypedElementImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.TypeRefImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__REFERENCED = eINSTANCE.getTypeRef_Referenced();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__MULTI = eINSTANCE.getTypeRef_Multi();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__OPTION = eINSTANCE.getTypeRef_Option();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.ConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.BoolConstraintImpl <em>Bool Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BoolConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getBoolConstraint()
     * @generated
     */
    EClass BOOL_CONSTRAINT = eINSTANCE.getBoolConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTRAINT__CONSTRAINT = eINSTANCE.getBoolConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getBoolConstraint_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getBoolConstraint_DefaultValue();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl <em>String Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getStringConstraint()
     * @generated
     */
    EClass STRING_CONSTRAINT = eINSTANCE.getStringConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__CONSTRAINT = eINSTANCE.getStringConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getStringConstraint_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getStringConstraint_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__MIN_LENGTH = eINSTANCE.getStringConstraint_MinLength();

    /**
     * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__MAX_LENGTH = eINSTANCE.getStringConstraint_MaxLength();

    /**
     * The meta object literal for the '<em><b>Fixe Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__FIXE_LENGTH = eINSTANCE.getStringConstraint_FixeLength();

    /**
     * The meta object literal for the '<em><b>Regular Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_CONSTRAINT__REGULAR_EXPRESSION = eINSTANCE.getStringConstraint_RegularExpression();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DateTimeConstraintImpl <em>Date Time Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.DateTimeConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDateTimeConstraint()
     * @generated
     */
    EClass DATE_TIME_CONSTRAINT = eINSTANCE.getDateTimeConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME_CONSTRAINT__CONSTRAINT = eINSTANCE.getDateTimeConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATE_TIME_CONSTRAINT__DATA_TYPE = eINSTANCE.getDateTimeConstraint_DataType();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getDateTimeConstraint_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getDateTimeConstraint_DefaultValue();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl <em>Integer Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getIntegerConstraint()
     * @generated
     */
    EClass INTEGER_CONSTRAINT = eINSTANCE.getIntegerConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__CONSTRAINT = eINSTANCE.getIntegerConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getIntegerConstraint_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getIntegerConstraint_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__MIN_VALUE = eINSTANCE.getIntegerConstraint_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__MAX_VALUE = eINSTANCE.getIntegerConstraint_MaxValue();

    /**
     * The meta object literal for the '<em><b>Max Len</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__MAX_LEN = eINSTANCE.getIntegerConstraint_MaxLen();

    /**
     * The meta object literal for the '<em><b>Fixe Len</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__FIXE_LEN = eINSTANCE.getIntegerConstraint_FixeLen();

    /**
     * The meta object literal for the '<em><b>Paddle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_CONSTRAINT__PADDLE = eINSTANCE.getIntegerConstraint_Paddle();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.DecimalConstraintImpl <em>Decimal Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.DecimalConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDecimalConstraint()
     * @generated
     */
    EClass DECIMAL_CONSTRAINT = eINSTANCE.getDecimalConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__CONSTRAINT = eINSTANCE.getDecimalConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__MIN_VALUE = eINSTANCE.getDecimalConstraint_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__MAX_VALUE = eINSTANCE.getDecimalConstraint_MaxValue();

    /**
     * The meta object literal for the '<em><b>Max Len</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__MAX_LEN = eINSTANCE.getDecimalConstraint_MaxLen();

    /**
     * The meta object literal for the '<em><b>Fixe Len</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__FIXE_LEN = eINSTANCE.getDecimalConstraint_FixeLen();

    /**
     * The meta object literal for the '<em><b>Paddle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_CONSTRAINT__PADDLE = eINSTANCE.getDecimalConstraint_Paddle();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Enumeration Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__ENUMERATION_LITERALS = eINSTANCE.getEnumeration_EnumerationLiterals();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Persisted Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__PERSISTED_VALUE = eINSTANCE.getEnumerationLiteral_PersistedValue();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.impl.EnumerationConstraintImpl
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumerationConstraint()
     * @generated
     */
    EClass ENUMERATION_CONSTRAINT = eINSTANCE.getEnumerationConstraint();

    /**
     * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_CONSTRAINT__USAGE = eINSTANCE.getEnumerationConstraint_Usage();

    /**
     * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getEnumerationConstraint_HasDefault();

    /**
     * The meta object literal for the '<em><b>Default Value As String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING = eINSTANCE.getEnumerationConstraint_DefaultValueAsString();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.Visibility
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy <em>Date Time Accuracy</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.DateTimeAccuracy
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getDateTimeAccuracy()
     * @generated
     */
    EEnum DATE_TIME_ACCURACY = eINSTANCE.getDateTimeAccuracy();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.bom.bomDsl.EnumUsage <em>Enum Usage</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.bom.bomDsl.EnumUsage
     * @see fr.chaunier.xtext.bom.bomDsl.impl.BomDslPackageImpl#getEnumUsage()
     * @generated
     */
    EEnum ENUM_USAGE = eINSTANCE.getEnumUsage();

  }

} //BomDslPackage
