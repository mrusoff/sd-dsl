/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type
{
  /**
   * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEnumeration_EnumerationLiterals()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationLiteral> getEnumerationLiterals();

} // Enumeration
