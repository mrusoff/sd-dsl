/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage
 * @generated
 */
public interface CstDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CstDslFactory eINSTANCE = fr.chaunier.xtext.constraint.cstDsl.impl.CstDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model Constraint</em>'.
   * @generated
   */
  DomainModelConstraint createDomainModelConstraint();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  Specification createSpecification();

  /**
   * Returns a new object of class '<em>File Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Specification</em>'.
   * @generated
   */
  FileSpecification createFileSpecification();

  /**
   * Returns a new object of class '<em>Free Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Free Specification</em>'.
   * @generated
   */
  FreeSpecification createFreeSpecification();

  /**
   * Returns a new object of class '<em>Abstract Element Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element Constraint</em>'.
   * @generated
   */
  AbstractElementConstraint createAbstractElementConstraint();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Package Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Constraint</em>'.
   * @generated
   */
  PackageConstraint createPackageConstraint();

  /**
   * Returns a new object of class '<em>Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Constraint</em>'.
   * @generated
   */
  TypeConstraint createTypeConstraint();

  /**
   * Returns a new object of class '<em>Data Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Constraint</em>'.
   * @generated
   */
  DataTypeConstraint createDataTypeConstraint();

  /**
   * Returns a new object of class '<em>Entity Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Constraint</em>'.
   * @generated
   */
  EntityConstraint createEntityConstraint();

  /**
   * Returns a new object of class '<em>Feature Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Constraint</em>'.
   * @generated
   */
  FeatureConstraint createFeatureConstraint();

  /**
   * Returns a new object of class '<em>Attribute Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Constraint</em>'.
   * @generated
   */
  AttributeConstraint createAttributeConstraint();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  Constraint createConstraint();

  /**
   * Returns a new object of class '<em>Bool Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constraint</em>'.
   * @generated
   */
  BoolConstraint createBoolConstraint();

  /**
   * Returns a new object of class '<em>String Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constraint</em>'.
   * @generated
   */
  StringConstraint createStringConstraint();

  /**
   * Returns a new object of class '<em>Date Time Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Time Constraint</em>'.
   * @generated
   */
  DateTimeConstraint createDateTimeConstraint();

  /**
   * Returns a new object of class '<em>Decimal Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Constraint</em>'.
   * @generated
   */
  DecimalConstraint createDecimalConstraint();

  /**
   * Returns a new object of class '<em>Enumeration Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Constraint</em>'.
   * @generated
   */
  EnumerationConstraint createEnumerationConstraint();

  /**
   * Returns a new object of class '<em>Number Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Constraint</em>'.
   * @generated
   */
  NumberConstraint createNumberConstraint();

  /**
   * Returns a new object of class '<em>All Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Constraint</em>'.
   * @generated
   */
  AllConstraint createAllConstraint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CstDslPackage getCstDslPackage();

} //CstDslFactory
