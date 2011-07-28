/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage
 * @generated
 */
public interface OmcstDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OmcstDslFactory eINSTANCE = fr.chaunier.xtext.omcst.om.omcstDsl.impl.OmcstDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Model</em>'.
   * @generated
   */
  DomainModel createDomainModel();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Xsd Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xsd Element</em>'.
   * @generated
   */
  XsdElement createXsdElement();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Structural Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structural Feature</em>'.
   * @generated
   */
  StructuralFeature createStructuralFeature();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal</em>'.
   * @generated
   */
  EnumerationLiteral createEnumerationLiteral();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Element</em>'.
   * @generated
   */
  TypedElement createTypedElement();

  /**
   * Returns a new object of class '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Ref</em>'.
   * @generated
   */
  TypeRef createTypeRef();

  /**
   * Returns a new object of class '<em>Annotations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotations</em>'.
   * @generated
   */
  Annotations createAnnotations();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

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
  OmcstDslPackage getOmcstDslPackage();

} //OmcstDslFactory