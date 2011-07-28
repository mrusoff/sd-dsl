/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.FuctionIn;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested In Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedInTransformationParameterImpl#getInRefAttribute <em>In Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedInTransformationParameterImpl extends FuctionInImpl implements NestedInTransformationParameter
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected FuctionIn target;

  /**
   * The cached value of the '{@link #getInRefAttribute() <em>In Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInRefAttribute()
   * @generated
   * @ordered
   */
  protected Attribute inRefAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedInTransformationParameterImpl()
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
    return MapDslPackage.Literals.NESTED_IN_TRANSFORMATION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuctionIn getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(FuctionIn newTarget, NotificationChain msgs)
  {
    FuctionIn oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(FuctionIn newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getInRefAttribute()
  {
    if (inRefAttribute != null && inRefAttribute.eIsProxy())
    {
      InternalEObject oldInRefAttribute = (InternalEObject)inRefAttribute;
      inRefAttribute = (Attribute)eResolveProxy(oldInRefAttribute);
      if (inRefAttribute != oldInRefAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE, oldInRefAttribute, inRefAttribute));
      }
    }
    return inRefAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetInRefAttribute()
  {
    return inRefAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInRefAttribute(Attribute newInRefAttribute)
  {
    Attribute oldInRefAttribute = inRefAttribute;
    inRefAttribute = newInRefAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE, oldInRefAttribute, inRefAttribute));
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
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET:
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
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET:
        return getTarget();
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE:
        if (resolve) return getInRefAttribute();
        return basicGetInRefAttribute();
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
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FuctionIn)newValue);
        return;
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE:
        setInRefAttribute((Attribute)newValue);
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
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FuctionIn)null);
        return;
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE:
        setInRefAttribute((Attribute)null);
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
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__TARGET:
        return target != null;
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER__IN_REF_ATTRIBUTE:
        return inRefAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedInTransformationParameterImpl
