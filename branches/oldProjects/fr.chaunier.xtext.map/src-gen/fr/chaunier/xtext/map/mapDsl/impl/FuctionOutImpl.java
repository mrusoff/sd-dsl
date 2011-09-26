/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.FuctionOut;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuction Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl#getOutEntity <em>Out Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionOutImpl#getOutAttribute <em>Out Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuctionOutImpl extends MinimalEObjectImpl.Container implements FuctionOut
{
  /**
   * The cached value of the '{@link #getOutEntity() <em>Out Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutEntity()
   * @generated
   * @ordered
   */
  protected Entity outEntity;

  /**
   * The cached value of the '{@link #getOutAttribute() <em>Out Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutAttribute()
   * @generated
   * @ordered
   */
  protected Attribute outAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuctionOutImpl()
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
    return MapDslPackage.Literals.FUCTION_OUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getOutEntity()
  {
    if (outEntity != null && outEntity.eIsProxy())
    {
      InternalEObject oldOutEntity = (InternalEObject)outEntity;
      outEntity = (Entity)eResolveProxy(oldOutEntity);
      if (outEntity != oldOutEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FUCTION_OUT__OUT_ENTITY, oldOutEntity, outEntity));
      }
    }
    return outEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetOutEntity()
  {
    return outEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutEntity(Entity newOutEntity)
  {
    Entity oldOutEntity = outEntity;
    outEntity = newOutEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FUCTION_OUT__OUT_ENTITY, oldOutEntity, outEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getOutAttribute()
  {
    if (outAttribute != null && outAttribute.eIsProxy())
    {
      InternalEObject oldOutAttribute = (InternalEObject)outAttribute;
      outAttribute = (Attribute)eResolveProxy(oldOutAttribute);
      if (outAttribute != oldOutAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE, oldOutAttribute, outAttribute));
      }
    }
    return outAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetOutAttribute()
  {
    return outAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutAttribute(Attribute newOutAttribute)
  {
    Attribute oldOutAttribute = outAttribute;
    outAttribute = newOutAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE, oldOutAttribute, outAttribute));
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
      case MapDslPackage.FUCTION_OUT__OUT_ENTITY:
        if (resolve) return getOutEntity();
        return basicGetOutEntity();
      case MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE:
        if (resolve) return getOutAttribute();
        return basicGetOutAttribute();
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
      case MapDslPackage.FUCTION_OUT__OUT_ENTITY:
        setOutEntity((Entity)newValue);
        return;
      case MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE:
        setOutAttribute((Attribute)newValue);
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
      case MapDslPackage.FUCTION_OUT__OUT_ENTITY:
        setOutEntity((Entity)null);
        return;
      case MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE:
        setOutAttribute((Attribute)null);
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
      case MapDslPackage.FUCTION_OUT__OUT_ENTITY:
        return outEntity != null;
      case MapDslPackage.FUCTION_OUT__OUT_ATTRIBUTE:
        return outAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //FuctionOutImpl
