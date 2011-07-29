/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;

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
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslFactory
 * @model kind="package"
 * @generated
 */
public interface CstDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cstDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.chaunier.fr/xtext/constraint/CstDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cstDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CstDslPackage eINSTANCE = fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl <em>Domain Model Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDomainModelConstraint()
	 * @generated
	 */
	int DOMAIN_MODEL_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_CONSTRAINT__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_CONSTRAINT__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Domain Model Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.SpecificationImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl <em>File Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFileSpecification()
	 * @generated
	 */
	int FILE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION__FORMAT = SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION__DELIMITER = SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SPECIFICATION_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FreeSpecificationImpl <em>Free Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FreeSpecificationImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFreeSpecification()
	 * @generated
	 */
	int FREE_SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_SPECIFICATION__LINES = SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_SPECIFICATION_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AbstractElementConstraintImpl <em>Abstract Element Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AbstractElementConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAbstractElementConstraint()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_CONSTRAINT = 4;

	/**
	 * The number of structural features of the '<em>Abstract Element Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.ImportImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 5;

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
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl <em>Package Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getPackageConstraint()
	 * @generated
	 */
	int PACKAGE_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Package Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONSTRAINT__PACKAGE_DECLARATION = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONSTRAINT__PREFIX = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONSTRAINT__NAMESPACE = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONSTRAINT__TYPES = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_CONSTRAINT_FEATURE_COUNT = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.TypeConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getTypeConstraint()
	 * @generated
	 */
	int TYPE_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DataTypeConstraintImpl <em>Data Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DataTypeConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDataTypeConstraint()
	 * @generated
	 */
	int DATA_TYPE_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_CONSTRAINT__DESCRIPTION = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_CONSTRAINT__DATA_TYPE = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_CONSTRAINT__CONSTRAINT = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_CONSTRAINT_FEATURE_COUNT = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumerationConstraint()
	 * @generated
	 */
	int ENUMERATION_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__DESCRIPTION = TYPE_CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enumerate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__ENUMERATE = TYPE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT__CONSTRAINT = TYPE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CONSTRAINT_FEATURE_COUNT = TYPE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl <em>Entity Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEntityConstraint()
	 * @generated
	 */
	int ENTITY_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONSTRAINT__DESCRIPTION = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONSTRAINT__ENTITY = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONSTRAINT__FEATURES = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_CONSTRAINT_FEATURE_COUNT = ABSTRACT_ELEMENT_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FeatureConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFeatureConstraint()
	 * @generated
	 */
	int FEATURE_CONSTRAINT = 11;

	/**
	 * The number of structural features of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AttributeConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAttributeConstraint()
	 * @generated
	 */
	int ATTRIBUTE_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__CONSTRAINT = FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__DESCRIPTION = FEATURE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT__ATTRIBUTE = FEATURE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = FEATURE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.ConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 13;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.BoolConstraintImpl <em>Bool Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.BoolConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getBoolConstraint()
	 * @generated
	 */
	int BOOL_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl <em>String Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getStringConstraint()
	 * @generated
	 */
	int STRING_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT__CONSTRAINT_REF = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regular Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT__REGULAR_EXPRESSION = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl <em>Date Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDateTimeConstraint()
	 * @generated
	 */
	int DATE_TIME_CONSTRAINT = 16;

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
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl <em>Decimal Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDecimalConstraint()
	 * @generated
	 */
	int DECIMAL_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTRAINT__CONSTRAINT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTRAINT__CONSTRAINT_REF = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decimal Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumConstraintImpl <em>Enum Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EnumConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumConstraint()
	 * @generated
	 */
	int ENUM_CONSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRAINT__USAGE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixe Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRAINT__FIXE_LEN = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRAINT__HAS_DEFAULT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRAINT__DEFAULT_VALUE_AS_STRING = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enum Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.NumberConstraintImpl <em>Number Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.NumberConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getNumberConstraint()
	 * @generated
	 */
	int NUMBER_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Has Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__HAS_DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Is Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__IS_FIXED = 2;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__FIXED_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__MIN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__MAX_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Min Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__MIN_LEN = 6;

	/**
	 * The feature id for the '<em><b>Max Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__MAX_LEN = 7;

	/**
	 * The feature id for the '<em><b>Fixe Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__FIXE_LEN = 8;

	/**
	 * The feature id for the '<em><b>Paddle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__PADDLE = 9;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__IS_ID = 10;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__NULLABLE = 11;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__DERIVED = 12;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__WRITABLE = 13;

	/**
	 * The feature id for the '<em><b>Is XSD Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT__IS_XSD_ATT = 14;

	/**
	 * The number of structural features of the '<em>Number Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONSTRAINT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AllConstraintImpl <em>All Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AllConstraintImpl
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAllConstraint()
	 * @generated
	 */
	int ALL_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Has Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__HAS_DEFAULT = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Is Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__IS_FIXED = 2;

	/**
	 * The feature id for the '<em><b>Fixed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__FIXED_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Min Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__MIN_LEN = 4;

	/**
	 * The feature id for the '<em><b>Max Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__MAX_LEN = 5;

	/**
	 * The feature id for the '<em><b>Fixe Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__FIXE_LEN = 6;

	/**
	 * The feature id for the '<em><b>Paddle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__PADDLE = 7;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__IS_ID = 8;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__NULLABLE = 9;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__DERIVED = 10;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__WRITABLE = 11;

	/**
	 * The feature id for the '<em><b>Is XSD Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT__IS_XSD_ATT = 12;

	/**
	 * The number of structural features of the '<em>All Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_CONSTRAINT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumUsage <em>Enum Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumUsage
	 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumUsage()
	 * @generated
	 */
	int ENUM_USAGE = 21;


	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint <em>Domain Model Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint
	 * @generated
	 */
	EClass getDomainModelConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getImports()
	 * @see #getDomainModelConstraint()
	 * @generated
	 */
	EReference getDomainModelConstraint_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getElements()
	 * @see #getDomainModelConstraint()
	 * @generated
	 */
	EReference getDomainModelConstraint_Elements();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.FileSpecification <em>File Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Specification</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FileSpecification
	 * @generated
	 */
	EClass getFileSpecification();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.FileSpecification#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FileSpecification#getFormat()
	 * @see #getFileSpecification()
	 * @generated
	 */
	EAttribute getFileSpecification_Format();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.FileSpecification#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FileSpecification#getDelimiter()
	 * @see #getFileSpecification()
	 * @generated
	 */
	EAttribute getFileSpecification_Delimiter();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.FreeSpecification <em>Free Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Specification</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FreeSpecification
	 * @generated
	 */
	EClass getFreeSpecification();

	/**
	 * Returns the meta object for the attribute list '{@link fr.chaunier.xtext.constraint.cstDsl.FreeSpecification#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FreeSpecification#getLines()
	 * @see #getFreeSpecification()
	 * @generated
	 */
	EAttribute getFreeSpecification_Lines();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint <em>Abstract Element Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint
	 * @generated
	 */
	EClass getAbstractElementConstraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint <em>Package Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint
	 * @generated
	 */
	EClass getPackageConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package Declaration</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPackageDeclaration()
	 * @see #getPackageConstraint()
	 * @generated
	 */
	EReference getPackageConstraint_PackageDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPrefix()
	 * @see #getPackageConstraint()
	 * @generated
	 */
	EAttribute getPackageConstraint_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getNamespace()
	 * @see #getPackageConstraint()
	 * @generated
	 */
	EAttribute getPackageConstraint_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getTypes()
	 * @see #getPackageConstraint()
	 * @generated
	 */
	EReference getPackageConstraint_Types();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.TypeConstraint <em>Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.TypeConstraint
	 * @generated
	 */
	EClass getTypeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.TypeConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.TypeConstraint#getDescription()
	 * @see #getTypeConstraint()
	 * @generated
	 */
	EAttribute getTypeConstraint_Description();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint <em>Data Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint
	 * @generated
	 */
	EClass getDataTypeConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDataType()
	 * @see #getDataTypeConstraint()
	 * @generated
	 */
	EReference getDataTypeConstraint_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getConstraint()
	 * @see #getDataTypeConstraint()
	 * @generated
	 */
	EReference getDataTypeConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint <em>Enumeration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint
	 * @generated
	 */
	EClass getEnumerationConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getEnumerate <em>Enumerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumerate</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getEnumerate()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EReference getEnumerationConstraint_Enumerate();

	/**
	 * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getConstraint()
	 * @see #getEnumerationConstraint()
	 * @generated
	 */
	EReference getEnumerationConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint <em>Entity Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EntityConstraint
	 * @generated
	 */
	EClass getEntityConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getEntity()
	 * @see #getEntityConstraint()
	 * @generated
	 */
	EReference getEntityConstraint_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getFeatures()
	 * @see #getEntityConstraint()
	 * @generated
	 */
	EReference getEntityConstraint_Features();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint
	 * @generated
	 */
	EClass getFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint
	 * @generated
	 */
	EClass getAttributeConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getConstraint()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getDescription()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EAttribute getAttributeConstraint_Description();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getAttribute()
	 * @see #getAttributeConstraint()
	 * @generated
	 */
	EReference getAttributeConstraint_Attribute();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.BoolConstraint <em>Bool Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.BoolConstraint
	 * @generated
	 */
	EClass getBoolConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.BoolConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.BoolConstraint#getConstraint()
	 * @see #getBoolConstraint()
	 * @generated
	 */
	EAttribute getBoolConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint <em>String Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.StringConstraint
	 * @generated
	 */
	EClass getStringConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraint()
	 * @see #getStringConstraint()
	 * @generated
	 */
	EAttribute getStringConstraint_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraintRef <em>Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Ref</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraintRef()
	 * @see #getStringConstraint()
	 * @generated
	 */
	EReference getStringConstraint_ConstraintRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regular Expression</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getRegularExpression()
	 * @see #getStringConstraint()
	 * @generated
	 */
	EAttribute getStringConstraint_RegularExpression();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint <em>Date Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint
	 * @generated
	 */
	EClass getDateTimeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getConstraint()
	 * @see #getDateTimeConstraint()
	 * @generated
	 */
	EAttribute getDateTimeConstraint_Constraint();

	/**
	 * Returns the meta object for the reference '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getDataType()
	 * @see #getDateTimeConstraint()
	 * @generated
	 */
	EReference getDateTimeConstraint_DataType();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#isHasDefault <em>Has Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Default</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#isHasDefault()
	 * @see #getDateTimeConstraint()
	 * @generated
	 */
	EAttribute getDateTimeConstraint_HasDefault();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint#getDefaultValue()
	 * @see #getDateTimeConstraint()
	 * @generated
	 */
	EAttribute getDateTimeConstraint_DefaultValue();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint <em>Decimal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint
	 * @generated
	 */
	EClass getDecimalConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint#getConstraint()
	 * @see #getDecimalConstraint()
	 * @generated
	 */
	EAttribute getDecimalConstraint_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint#getConstraintRef <em>Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint Ref</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint#getConstraintRef()
	 * @see #getDecimalConstraint()
	 * @generated
	 */
	EReference getDecimalConstraint_ConstraintRef();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint <em>Enum Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumConstraint
	 * @generated
	 */
	EClass getEnumConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getUsage()
	 * @see #getEnumConstraint()
	 * @generated
	 */
	EAttribute getEnumConstraint_Usage();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getFixeLen <em>Fixe Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixe Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getFixeLen()
	 * @see #getEnumConstraint()
	 * @generated
	 */
	EAttribute getEnumConstraint_FixeLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#isHasDefault <em>Has Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Default</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#isHasDefault()
	 * @see #getEnumConstraint()
	 * @generated
	 */
	EAttribute getEnumConstraint_HasDefault();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getDefaultValueAsString <em>Default Value As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value As String</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getDefaultValueAsString()
	 * @see #getEnumConstraint()
	 * @generated
	 */
	EAttribute getEnumConstraint_DefaultValueAsString();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint <em>Number Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint
	 * @generated
	 */
	EClass getNumberConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isHasDefault <em>Has Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Default</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isHasDefault()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_HasDefault();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getDefaultValue()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsFixed <em>Is Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsFixed()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_IsFixed();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getFixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getFixedValue()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_FixedValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMinValue()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMaxValue()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMinLen <em>Min Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMinLen()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_MinLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMaxLen <em>Max Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getMaxLen()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_MaxLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getFixeLen <em>Fixe Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixe Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getFixeLen()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_FixeLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getPaddle <em>Paddle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddle</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#getPaddle()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_Paddle();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Id</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsId()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_IsId();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isNullable()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isDerived()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_Derived();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isWritable()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_Writable();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsXSDAtt <em>Is XSD Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is XSD Att</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint#isIsXSDAtt()
	 * @see #getNumberConstraint()
	 * @generated
	 */
	EAttribute getNumberConstraint_IsXSDAtt();

	/**
	 * Returns the meta object for class '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint <em>All Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Constraint</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint
	 * @generated
	 */
	EClass getAllConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isHasDefault <em>Has Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Default</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isHasDefault()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_HasDefault();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getDefaultValue()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsFixed <em>Is Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Fixed</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsFixed()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_IsFixed();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Value</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixedValue()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_FixedValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMinLen <em>Min Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMinLen()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_MinLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMaxLen <em>Max Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMaxLen()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_MaxLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixeLen <em>Fixe Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixe Len</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixeLen()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_FixeLen();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getPaddle <em>Paddle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paddle</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getPaddle()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_Paddle();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Id</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsId()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_IsId();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isNullable()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isDerived()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_Derived();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isWritable()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_Writable();

	/**
	 * Returns the meta object for the attribute '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsXSDAtt <em>Is XSD Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is XSD Att</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsXSDAtt()
	 * @see #getAllConstraint()
	 * @generated
	 */
	EAttribute getAllConstraint_IsXSDAtt();

	/**
	 * Returns the meta object for enum '{@link fr.chaunier.xtext.constraint.cstDsl.EnumUsage <em>Enum Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Usage</em>'.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumUsage
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
	CstDslFactory getCstDslFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl <em>Domain Model Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDomainModelConstraint()
		 * @generated
		 */
		EClass DOMAIN_MODEL_CONSTRAINT = eINSTANCE.getDomainModelConstraint();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_CONSTRAINT__IMPORTS = eINSTANCE.getDomainModelConstraint_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_CONSTRAINT__ELEMENTS = eINSTANCE.getDomainModelConstraint_Elements();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.SpecificationImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl <em>File Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFileSpecification()
		 * @generated
		 */
		EClass FILE_SPECIFICATION = eINSTANCE.getFileSpecification();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SPECIFICATION__FORMAT = eINSTANCE.getFileSpecification_Format();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SPECIFICATION__DELIMITER = eINSTANCE.getFileSpecification_Delimiter();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FreeSpecificationImpl <em>Free Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FreeSpecificationImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFreeSpecification()
		 * @generated
		 */
		EClass FREE_SPECIFICATION = eINSTANCE.getFreeSpecification();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_SPECIFICATION__LINES = eINSTANCE.getFreeSpecification_Lines();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AbstractElementConstraintImpl <em>Abstract Element Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AbstractElementConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAbstractElementConstraint()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT_CONSTRAINT = eINSTANCE.getAbstractElementConstraint();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.ImportImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getImport()
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
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl <em>Package Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getPackageConstraint()
		 * @generated
		 */
		EClass PACKAGE_CONSTRAINT = eINSTANCE.getPackageConstraint();

		/**
		 * The meta object literal for the '<em><b>Package Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_CONSTRAINT__PACKAGE_DECLARATION = eINSTANCE.getPackageConstraint_PackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_CONSTRAINT__PREFIX = eINSTANCE.getPackageConstraint_Prefix();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_CONSTRAINT__NAMESPACE = eINSTANCE.getPackageConstraint_Namespace();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_CONSTRAINT__TYPES = eINSTANCE.getPackageConstraint_Types();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.TypeConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getTypeConstraint()
		 * @generated
		 */
		EClass TYPE_CONSTRAINT = eINSTANCE.getTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_CONSTRAINT__DESCRIPTION = eINSTANCE.getTypeConstraint_Description();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DataTypeConstraintImpl <em>Data Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DataTypeConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDataTypeConstraint()
		 * @generated
		 */
		EClass DATA_TYPE_CONSTRAINT = eINSTANCE.getDataTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_CONSTRAINT__DATA_TYPE = eINSTANCE.getDataTypeConstraint_DataType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_CONSTRAINT__CONSTRAINT = eINSTANCE.getDataTypeConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl <em>Enumeration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumerationConstraint()
		 * @generated
		 */
		EClass ENUMERATION_CONSTRAINT = eINSTANCE.getEnumerationConstraint();

		/**
		 * The meta object literal for the '<em><b>Enumerate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_CONSTRAINT__ENUMERATE = eINSTANCE.getEnumerationConstraint_Enumerate();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_CONSTRAINT__CONSTRAINT = eINSTANCE.getEnumerationConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl <em>Entity Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEntityConstraint()
		 * @generated
		 */
		EClass ENTITY_CONSTRAINT = eINSTANCE.getEntityConstraint();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONSTRAINT__ENTITY = eINSTANCE.getEntityConstraint_Entity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_CONSTRAINT__FEATURES = eINSTANCE.getEntityConstraint_Features();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.FeatureConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getFeatureConstraint()
		 * @generated
		 */
		EClass FEATURE_CONSTRAINT = eINSTANCE.getFeatureConstraint();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AttributeConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAttributeConstraint()
		 * @generated
		 */
		EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__CONSTRAINT = eINSTANCE.getAttributeConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONSTRAINT__DESCRIPTION = eINSTANCE.getAttributeConstraint_Description();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONSTRAINT__ATTRIBUTE = eINSTANCE.getAttributeConstraint_Attribute();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.ConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.BoolConstraintImpl <em>Bool Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.BoolConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getBoolConstraint()
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
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl <em>String Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getStringConstraint()
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
		 * The meta object literal for the '<em><b>Constraint Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_CONSTRAINT__CONSTRAINT_REF = eINSTANCE.getStringConstraint_ConstraintRef();

		/**
		 * The meta object literal for the '<em><b>Regular Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTRAINT__REGULAR_EXPRESSION = eINSTANCE.getStringConstraint_RegularExpression();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl <em>Date Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDateTimeConstraint()
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
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl <em>Decimal Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getDecimalConstraint()
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
		 * The meta object literal for the '<em><b>Constraint Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_CONSTRAINT__CONSTRAINT_REF = eINSTANCE.getDecimalConstraint_ConstraintRef();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumConstraintImpl <em>Enum Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.EnumConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumConstraint()
		 * @generated
		 */
		EClass ENUM_CONSTRAINT = eINSTANCE.getEnumConstraint();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTRAINT__USAGE = eINSTANCE.getEnumConstraint_Usage();

		/**
		 * The meta object literal for the '<em><b>Fixe Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTRAINT__FIXE_LEN = eINSTANCE.getEnumConstraint_FixeLen();

		/**
		 * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getEnumConstraint_HasDefault();

		/**
		 * The meta object literal for the '<em><b>Default Value As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_CONSTRAINT__DEFAULT_VALUE_AS_STRING = eINSTANCE.getEnumConstraint_DefaultValueAsString();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.NumberConstraintImpl <em>Number Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.NumberConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getNumberConstraint()
		 * @generated
		 */
		EClass NUMBER_CONSTRAINT = eINSTANCE.getNumberConstraint();

		/**
		 * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getNumberConstraint_HasDefault();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getNumberConstraint_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__IS_FIXED = eINSTANCE.getNumberConstraint_IsFixed();

		/**
		 * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__FIXED_VALUE = eINSTANCE.getNumberConstraint_FixedValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__MIN_VALUE = eINSTANCE.getNumberConstraint_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__MAX_VALUE = eINSTANCE.getNumberConstraint_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__MIN_LEN = eINSTANCE.getNumberConstraint_MinLen();

		/**
		 * The meta object literal for the '<em><b>Max Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__MAX_LEN = eINSTANCE.getNumberConstraint_MaxLen();

		/**
		 * The meta object literal for the '<em><b>Fixe Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__FIXE_LEN = eINSTANCE.getNumberConstraint_FixeLen();

		/**
		 * The meta object literal for the '<em><b>Paddle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__PADDLE = eINSTANCE.getNumberConstraint_Paddle();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__IS_ID = eINSTANCE.getNumberConstraint_IsId();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__NULLABLE = eINSTANCE.getNumberConstraint_Nullable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__DERIVED = eINSTANCE.getNumberConstraint_Derived();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__WRITABLE = eINSTANCE.getNumberConstraint_Writable();

		/**
		 * The meta object literal for the '<em><b>Is XSD Att</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONSTRAINT__IS_XSD_ATT = eINSTANCE.getNumberConstraint_IsXSDAtt();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.impl.AllConstraintImpl <em>All Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.AllConstraintImpl
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getAllConstraint()
		 * @generated
		 */
		EClass ALL_CONSTRAINT = eINSTANCE.getAllConstraint();

		/**
		 * The meta object literal for the '<em><b>Has Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__HAS_DEFAULT = eINSTANCE.getAllConstraint_HasDefault();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__DEFAULT_VALUE = eINSTANCE.getAllConstraint_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__IS_FIXED = eINSTANCE.getAllConstraint_IsFixed();

		/**
		 * The meta object literal for the '<em><b>Fixed Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__FIXED_VALUE = eINSTANCE.getAllConstraint_FixedValue();

		/**
		 * The meta object literal for the '<em><b>Min Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__MIN_LEN = eINSTANCE.getAllConstraint_MinLen();

		/**
		 * The meta object literal for the '<em><b>Max Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__MAX_LEN = eINSTANCE.getAllConstraint_MaxLen();

		/**
		 * The meta object literal for the '<em><b>Fixe Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__FIXE_LEN = eINSTANCE.getAllConstraint_FixeLen();

		/**
		 * The meta object literal for the '<em><b>Paddle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__PADDLE = eINSTANCE.getAllConstraint_Paddle();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__IS_ID = eINSTANCE.getAllConstraint_IsId();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__NULLABLE = eINSTANCE.getAllConstraint_Nullable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__DERIVED = eINSTANCE.getAllConstraint_Derived();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__WRITABLE = eINSTANCE.getAllConstraint_Writable();

		/**
		 * The meta object literal for the '<em><b>Is XSD Att</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_CONSTRAINT__IS_XSD_ATT = eINSTANCE.getAllConstraint_IsXSDAtt();

		/**
		 * The meta object literal for the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumUsage <em>Enum Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.chaunier.xtext.constraint.cstDsl.EnumUsage
		 * @see fr.chaunier.xtext.constraint.cstDsl.impl.CstDslPackageImpl#getEnumUsage()
		 * @generated
		 */
		EEnum ENUM_USAGE = eINSTANCE.getEnumUsage();

	}

} //CstDslPackage
