/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl.impl;

import fr.chaunier.xtext.instance.om.instanceDsl.Feature;
import fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage;
import fr.chaunier.xtext.instance.om.instanceDsl.Value;

import fr.chaunier.xtext.om.omDsl.StructuralFeature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.impl.FeatureImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature
{
  /**
   * The cached value of the '{@link #getEFeature() <em>EFeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEFeature()
   * @generated
   * @ordered
   */
  protected StructuralFeature eFeature;

  /**
   * The default value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMany()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMany() <em>Is Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMany()
   * @generated
   * @ordered
   */
  protected boolean isMany = IS_MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return InstanceDslPackage.Literals.FEATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralFeature getEFeature()
  {
    if (eFeature != null && eFeature.eIsProxy())
    {
      InternalEObject oldEFeature = (InternalEObject)eFeature;
      eFeature = (StructuralFeature)eResolveProxy(oldEFeature);
      if (eFeature != oldEFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstanceDslPackage.FEATURE__EFEATURE, oldEFeature, eFeature));
      }
    }
    return eFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralFeature basicGetEFeature()
  {
    return eFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEFeature(StructuralFeature newEFeature)
  {
    StructuralFeature oldEFeature = eFeature;
    eFeature = newEFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.FEATURE__EFEATURE, oldEFeature, eFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMany()
  {
    return isMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMany(boolean newIsMany)
  {
    boolean oldIsMany = isMany;
    isMany = newIsMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.FEATURE__IS_MANY, oldIsMany, isMany));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstanceDslPackage.FEATURE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.FEATURE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstanceDslPackage.FEATURE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InstanceDslPackage.FEATURE__VALUE, newValue, newValue));
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
      case InstanceDslPackage.FEATURE__VALUE:
        return basicSetValue(null, msgs);
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
      case InstanceDslPackage.FEATURE__EFEATURE:
        if (resolve) return getEFeature();
        return basicGetEFeature();
      case InstanceDslPackage.FEATURE__IS_MANY:
        return isIsMany();
      case InstanceDslPackage.FEATURE__VALUE:
        return getValue();
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
      case InstanceDslPackage.FEATURE__EFEATURE:
        setEFeature((StructuralFeature)newValue);
        return;
      case InstanceDslPackage.FEATURE__IS_MANY:
        setIsMany((Boolean)newValue);
        return;
      case InstanceDslPackage.FEATURE__VALUE:
        setValue((Value)newValue);
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
      case InstanceDslPackage.FEATURE__EFEATURE:
        setEFeature((StructuralFeature)null);
        return;
      case InstanceDslPackage.FEATURE__IS_MANY:
        setIsMany(IS_MANY_EDEFAULT);
        return;
      case InstanceDslPackage.FEATURE__VALUE:
        setValue((Value)null);
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
      case InstanceDslPackage.FEATURE__EFEATURE:
        return eFeature != null;
      case InstanceDslPackage.FEATURE__IS_MANY:
        return isMany != IS_MANY_EDEFAULT;
      case InstanceDslPackage.FEATURE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isMany: ");
    result.append(isMany);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
