/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.FeatureMap;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.NestedTransformationParameterImpl#getRefAttribute <em>Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedTransformationParameterImpl extends FeatureMapImpl implements NestedTransformationParameter
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected FeatureMap target;

  /**
   * The cached value of the '{@link #getRefAttribute() <em>Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAttribute()
   * @generated
   * @ordered
   */
  protected Attribute refAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedTransformationParameterImpl()
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
    return MapDslPackage.Literals.NESTED_TRANSFORMATION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(FeatureMap newTarget, NotificationChain msgs)
  {
    FeatureMap oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(FeatureMap newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRefAttribute()
  {
    if (refAttribute != null && refAttribute.eIsProxy())
    {
      InternalEObject oldRefAttribute = (InternalEObject)refAttribute;
      refAttribute = (Attribute)eResolveProxy(oldRefAttribute);
      if (refAttribute != oldRefAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE, oldRefAttribute, refAttribute));
      }
    }
    return refAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRefAttribute()
  {
    return refAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAttribute(Attribute newRefAttribute)
  {
    Attribute oldRefAttribute = refAttribute;
    refAttribute = newRefAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE, oldRefAttribute, refAttribute));
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
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET:
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
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET:
        return getTarget();
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE:
        if (resolve) return getRefAttribute();
        return basicGetRefAttribute();
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
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FeatureMap)newValue);
        return;
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE:
        setRefAttribute((Attribute)newValue);
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
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET:
        setTarget((FeatureMap)null);
        return;
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE:
        setRefAttribute((Attribute)null);
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
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__TARGET:
        return target != null;
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER__REF_ATTRIBUTE:
        return refAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedTransformationParameterImpl
