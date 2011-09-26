/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Message#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.MessageParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getMessage_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<MessageParameter> getParameters();

} // Message
