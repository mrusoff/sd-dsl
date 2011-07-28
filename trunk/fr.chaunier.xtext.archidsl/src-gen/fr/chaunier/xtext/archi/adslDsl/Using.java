/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Using</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Using#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getUsing()
 * @model
 * @generated
 */
public interface Using extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' reference.
   * @see #setSystem(fr.chaunier.xtext.archi.adslDsl.System)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getUsing_System()
   * @model
   * @generated
   */
  fr.chaunier.xtext.archi.adslDsl.System getSystem();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.Using#getSystem <em>System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(fr.chaunier.xtext.archi.adslDsl.System value);

} // Using
