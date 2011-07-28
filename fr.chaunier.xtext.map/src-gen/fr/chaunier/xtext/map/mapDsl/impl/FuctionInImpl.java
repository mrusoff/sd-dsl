/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.FuctionIn;
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
 * An implementation of the model object '<em><b>Fuction In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl#getInEntity <em>In Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FuctionInImpl#getInAttribute <em>In Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuctionInImpl extends MinimalEObjectImpl.Container implements FuctionIn
{
  /**
   * The cached value of the '{@link #getInEntity() <em>In Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInEntity()
   * @generated
   * @ordered
   */
  protected Entity inEntity;

  /**
   * The cached value of the '{@link #getInAttribute() <em>In Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInAttribute()
   * @generated
   * @ordered
   */
  protected Attribute inAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuctionInImpl()
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
    return MapDslPackage.Literals.FUCTION_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getInEntity()
  {
    if (inEntity != null && inEntity.eIsProxy())
    {
      InternalEObject oldInEntity = (InternalEObject)inEntity;
      inEntity = (Entity)eResolveProxy(oldInEntity);
      if (inEntity != oldInEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FUCTION_IN__IN_ENTITY, oldInEntity, inEntity));
      }
    }
    return inEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetInEntity()
  {
    return inEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInEntity(Entity newInEntity)
  {
    Entity oldInEntity = inEntity;
    inEntity = newInEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FUCTION_IN__IN_ENTITY, oldInEntity, inEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getInAttribute()
  {
    if (inAttribute != null && inAttribute.eIsProxy())
    {
      InternalEObject oldInAttribute = (InternalEObject)inAttribute;
      inAttribute = (Attribute)eResolveProxy(oldInAttribute);
      if (inAttribute != oldInAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FUCTION_IN__IN_ATTRIBUTE, oldInAttribute, inAttribute));
      }
    }
    return inAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetInAttribute()
  {
    return inAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInAttribute(Attribute newInAttribute)
  {
    Attribute oldInAttribute = inAttribute;
    inAttribute = newInAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FUCTION_IN__IN_ATTRIBUTE, oldInAttribute, inAttribute));
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
      case MapDslPackage.FUCTION_IN__IN_ENTITY:
        if (resolve) return getInEntity();
        return basicGetInEntity();
      case MapDslPackage.FUCTION_IN__IN_ATTRIBUTE:
        if (resolve) return getInAttribute();
        return basicGetInAttribute();
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
      case MapDslPackage.FUCTION_IN__IN_ENTITY:
        setInEntity((Entity)newValue);
        return;
      case MapDslPackage.FUCTION_IN__IN_ATTRIBUTE:
        setInAttribute((Attribute)newValue);
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
      case MapDslPackage.FUCTION_IN__IN_ENTITY:
        setInEntity((Entity)null);
        return;
      case MapDslPackage.FUCTION_IN__IN_ATTRIBUTE:
        setInAttribute((Attribute)null);
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
      case MapDslPackage.FUCTION_IN__IN_ENTITY:
        return inEntity != null;
      case MapDslPackage.FUCTION_IN__IN_ATTRIBUTE:
        return inAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //FuctionInImpl
