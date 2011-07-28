/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.impl;

import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.Message;
import fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Reply Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestReplyInteractionImpl extends MessageInteractionImpl implements RequestReplyInteraction
{
  /**
   * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequest()
   * @generated
   * @ordered
   */
  protected Message request;

  /**
   * The cached value of the '{@link #getReply() <em>Reply</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReply()
   * @generated
   * @ordered
   */
  protected Message reply;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequestReplyInteractionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdslDslPackage.Literals.REQUEST_REPLY_INTERACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getRequest()
  {
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequest(Message newRequest, NotificationChain msgs)
  {
    Message oldRequest = request;
    request = newRequest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST, oldRequest, newRequest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequest(Message newRequest)
  {
    if (newRequest != request)
    {
      NotificationChain msgs = null;
      if (request != null)
        msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST, null, msgs);
      if (newRequest != null)
        msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST, null, msgs);
      msgs = basicSetRequest(newRequest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST, newRequest, newRequest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getReply()
  {
    return reply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReply(Message newReply, NotificationChain msgs)
  {
    Message oldReply = reply;
    reply = newReply;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY, oldReply, newReply);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReply(Message newReply)
  {
    if (newReply != reply)
    {
      NotificationChain msgs = null;
      if (reply != null)
        msgs = ((InternalEObject)reply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY, null, msgs);
      if (newReply != null)
        msgs = ((InternalEObject)newReply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY, null, msgs);
      msgs = basicSetReply(newReply, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY, newReply, newReply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST:
        return basicSetRequest(null, msgs);
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY:
        return basicSetReply(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST:
        return getRequest();
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY:
        return getReply();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST:
        setRequest((Message)newValue);
        return;
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY:
        setReply((Message)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST:
        setRequest((Message)null);
        return;
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY:
        setReply((Message)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REQUEST:
        return request != null;
      case AdslDslPackage.REQUEST_REPLY_INTERACTION__REPLY:
        return reply != null;
    }
    return super.eIsSet(featureID);
  }

} //RequestReplyInteractionImpl
