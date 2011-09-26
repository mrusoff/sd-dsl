/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.EnumerationLiteral#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends EObject
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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getEnumerationLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.EnumerationLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Persisted Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persisted Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persisted Value</em>' attribute.
   * @see #setPersistedValue(int)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getEnumerationLiteral_PersistedValue()
   * @model
   * @generated
   */
  int getPersistedValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.EnumerationLiteral#getPersistedValue <em>Persisted Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Persisted Value</em>' attribute.
   * @see #getPersistedValue()
   * @generated
   */
  void setPersistedValue(int value);

} // EnumerationLiteral
