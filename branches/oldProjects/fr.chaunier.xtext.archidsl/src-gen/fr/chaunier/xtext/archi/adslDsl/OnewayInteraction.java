/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oneway Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.OnewayInteraction#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getOnewayInteraction()
 * @model
 * @generated
 */
public interface OnewayInteraction extends MessageInteraction
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference.
   * @see #setMessage(Message)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getOnewayInteraction_Message()
   * @model containment="true"
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.OnewayInteraction#getMessage <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' containment reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

} // OnewayInteraction
