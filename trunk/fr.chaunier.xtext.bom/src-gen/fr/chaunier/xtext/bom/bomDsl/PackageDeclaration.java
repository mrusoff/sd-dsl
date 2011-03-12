/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getLines <em>Lines</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' attribute.
   * @see #setNamespace(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Namespace()
   * @model
   * @generated
   */
  String getNamespace();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getNamespace <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' attribute.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(String value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' attribute.
   * @see #setDelimiter(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Delimiter()
   * @model
   * @generated
   */
  String getDelimiter();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.PackageDeclaration#getDelimiter <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' attribute.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(String value);

  /**
   * Returns the value of the '<em><b>Lines</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' attribute list.
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Lines()
   * @model unique="false"
   * @generated
   */
  EList<String> getLines();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.bom.bomDsl.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getPackageDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // PackageDeclaration
