/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl.impl;

import fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage;
import fr.chaunier.xtext.instance.om.instanceDsl.Intero;
import fr.chaunier.xtext.instance.om.instanceDsl.New;
import fr.chaunier.xtext.instance.om.instanceDsl.Nullo;
import fr.chaunier.xtext.instance.om.instanceDsl.Stringa;
import fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression;
import fr.chaunier.xtext.instance.om.instanceDsl.This;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl#getThis <em>This</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl#getNew <em>New</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl#getInt <em>Int</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl#getString <em>String</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.TerminalExpressionImpl#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalExpressionImpl extends ValueImpl implements TerminalExpression
{
  /**
   * The cached value of the '{@link #getThis() <em>This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThis()
   * @generated
   * @ordered
   */
  protected This this_;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected New new_;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected Intero int_;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected Stringa string;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected Nullo null_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TerminalExpressionImpl()
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
    return InstanceDslPackage.Literals.TERMINAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This getThis()
  {
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThis(This newThis, NotificationChain msgs)
  {
    This oldThis = this_;
    this_ = newThis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__THIS, oldThis, newThis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThis(This newThis)
  {
    if (newThis != this_)
    {
      NotificationChain msgs = null;
      if (this_ != null)
        msgs = ((InternalEObject)this_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__THIS, null, msgs);
      if (newThis != null)
        msgs = ((InternalEObject)newThis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__THIS, null, msgs);
      msgs = basicSetThis(newThis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__THIS, newThis, newThis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public New getNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNew(New newNew, NotificationChain msgs)
  {
    New oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__NEW, oldNew, newNew);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(New newNew)
  {
    if (newNew != new_)
    {
      NotificationChain msgs = null;
      if (new_ != null)
        msgs = ((InternalEObject)new_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__NEW, null, msgs);
      if (newNew != null)
        msgs = ((InternalEObject)newNew).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__NEW, null, msgs);
      msgs = basicSetNew(newNew, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__NEW, newNew, newNew));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intero getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInt(Intero newInt, NotificationChain msgs)
  {
    Intero oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__INT, oldInt, newInt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(Intero newInt)
  {
    if (newInt != int_)
    {
      NotificationChain msgs = null;
      if (int_ != null)
        msgs = ((InternalEObject)int_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__INT, null, msgs);
      if (newInt != null)
        msgs = ((InternalEObject)newInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__INT, null, msgs);
      msgs = basicSetInt(newInt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__INT, newInt, newInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stringa getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetString(Stringa newString, NotificationChain msgs)
  {
    Stringa oldString = string;
    string = newString;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__STRING, oldString, newString);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(Stringa newString)
  {
    if (newString != string)
    {
      NotificationChain msgs = null;
      if (string != null)
        msgs = ((InternalEObject)string).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__STRING, null, msgs);
      if (newString != null)
        msgs = ((InternalEObject)newString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__STRING, null, msgs);
      msgs = basicSetString(newString, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__STRING, newString, newString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nullo getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNull(Nullo newNull, NotificationChain msgs)
  {
    Nullo oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__NULL, oldNull, newNull);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(Nullo newNull)
  {
    if (newNull != null_)
    {
      NotificationChain msgs = null;
      if (null_ != null)
        msgs = ((InternalEObject)null_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__NULL, null, msgs);
      if (newNull != null)
        msgs = ((InternalEObject)newNull).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.TERMINAL_EXPRESSION__NULL, null, msgs);
      msgs = basicSetNull(newNull, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.TERMINAL_EXPRESSION__NULL, newNull, newNull));
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
      case InstanceDslPackage.TERMINAL_EXPRESSION__THIS:
        return basicSetThis(null, msgs);
      case InstanceDslPackage.TERMINAL_EXPRESSION__NEW:
        return basicSetNew(null, msgs);
      case InstanceDslPackage.TERMINAL_EXPRESSION__INT:
        return basicSetInt(null, msgs);
      case InstanceDslPackage.TERMINAL_EXPRESSION__STRING:
        return basicSetString(null, msgs);
      case InstanceDslPackage.TERMINAL_EXPRESSION__NULL:
        return basicSetNull(null, msgs);
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
      case InstanceDslPackage.TERMINAL_EXPRESSION__THIS:
        return getThis();
      case InstanceDslPackage.TERMINAL_EXPRESSION__NEW:
        return getNew();
      case InstanceDslPackage.TERMINAL_EXPRESSION__INT:
        return getInt();
      case InstanceDslPackage.TERMINAL_EXPRESSION__STRING:
        return getString();
      case InstanceDslPackage.TERMINAL_EXPRESSION__NULL:
        return getNull();
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
      case InstanceDslPackage.TERMINAL_EXPRESSION__THIS:
        setThis((This)newValue);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NEW:
        setNew((New)newValue);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__INT:
        setInt((Intero)newValue);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__STRING:
        setString((Stringa)newValue);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NULL:
        setNull((Nullo)newValue);
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
      case InstanceDslPackage.TERMINAL_EXPRESSION__THIS:
        setThis((This)null);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NEW:
        setNew((New)null);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__INT:
        setInt((Intero)null);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__STRING:
        setString((Stringa)null);
        return;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NULL:
        setNull((Nullo)null);
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
      case InstanceDslPackage.TERMINAL_EXPRESSION__THIS:
        return this_ != null;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NEW:
        return new_ != null;
      case InstanceDslPackage.TERMINAL_EXPRESSION__INT:
        return int_ != null;
      case InstanceDslPackage.TERMINAL_EXPRESSION__STRING:
        return string != null;
      case InstanceDslPackage.TERMINAL_EXPRESSION__NULL:
        return null_ != null;
    }
    return super.eIsSet(featureID);
  }

} //TerminalExpressionImpl
