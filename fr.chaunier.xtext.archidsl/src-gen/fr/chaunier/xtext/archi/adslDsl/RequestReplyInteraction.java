/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Reply Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getRequest <em>Request</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getRequestReplyInteraction()
 * @model
 * @generated
 */
public interface RequestReplyInteraction extends MessageInteraction
{
  /**
   * Returns the value of the '<em><b>Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request</em>' containment reference.
   * @see #setRequest(Message)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getRequestReplyInteraction_Request()
   * @model containment="true"
   * @generated
   */
  Message getRequest();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getRequest <em>Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request</em>' containment reference.
   * @see #getRequest()
   * @generated
   */
  void setRequest(Message value);

  /**
   * Returns the value of the '<em><b>Reply</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reply</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reply</em>' containment reference.
   * @see #setReply(Message)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getRequestReplyInteraction_Reply()
   * @model containment="true"
   * @generated
   */
  Message getReply();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getReply <em>Reply</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reply</em>' containment reference.
   * @see #getReply()
   * @generated
   */
  void setReply(Message value);

} // RequestReplyInteraction
