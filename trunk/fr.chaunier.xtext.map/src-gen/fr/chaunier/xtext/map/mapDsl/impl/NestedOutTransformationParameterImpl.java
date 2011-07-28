/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.FuctionOut;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Out Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedOutTransformationParameterImpl#getOutRefAttribute <em>Out Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedOutTransformationParameterImpl extends FuctionOutImpl implements NestedOutTransformationParameter
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected FuctionOut target;

  /**
   * The cached value of the '{@link #getOutRefAttribute() <em>Out Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutRefAttribute()
   * @generated
   * @ordered
   */
  protected Attribute outRefAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedOutTransformationParameterImpl()
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
    return MapDslPackage.Literals.NESTED_OUT_TRANSFORMATION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuctionOut getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(FuctionOut newTarget, NotificationChain msgs)
  {
    FuctionOut oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(FuctionOut newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getOutRefAttribute()
  {
    if (outRefAttribute != null && outRefAttribute.eIsProxy())
    {
      InternalEObject oldOutRefAttribute = (InternalEObject)outRefAttribute;
      outRefAttribute = (Attribute)eResolveProxy(oldOutRefAttribute);
      if (outRefAttribute != oldOutRefAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE, oldOutRefAttribute, outRefAttribute));
      }
    }
    return outRefAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetOutRefAttribute()
  {
    return outRefAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutRefAttribute(Attribute newOutRefAttribute)
  {
    Attribute oldOutRefAttribute = outRefAttribute;
    outRefAttribute = newOutRefAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE, oldOutRefAttribute, outRefAttribute));
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
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET:
        return basicSetTarget(null, msgs);
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
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET:
        return getTarget();
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE:
        if (resolve) return getOutRefAttribute();
        return basicGetOutRefAttribute();
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
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FuctionOut)newValue);
        return;
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE:
        setOutRefAttribute((Attribute)newValue);
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
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FuctionOut)null);
        return;
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE:
        setOutRefAttribute((Attribute)null);
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
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__TARGET:
        return target != null;
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER__OUT_REF_ATTRIBUTE:
        return outRefAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedOutTransformationParameterImpl
