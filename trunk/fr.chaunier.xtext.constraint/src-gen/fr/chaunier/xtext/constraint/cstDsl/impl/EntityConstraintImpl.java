/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint;

import fr.chaunier.xtext.om.omDsl.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EntityConstraintImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityConstraintImpl extends AbstractElementConstraintImpl implements EntityConstraint
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<FeatureConstraint> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityConstraintImpl()
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
    return CstDslPackage.Literals.ENTITY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CstDslPackage.ENTITY_CONSTRAINT__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENTITY_CONSTRAINT__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENTITY_CONSTRAINT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureConstraint> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<FeatureConstraint>(FeatureConstraint.class, this, CstDslPackage.ENTITY_CONSTRAINT__FEATURES);
    }
    return features;
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
      case CstDslPackage.ENTITY_CONSTRAINT__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case CstDslPackage.ENTITY_CONSTRAINT__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case CstDslPackage.ENTITY_CONSTRAINT__DESCRIPTION:
        return getDescription();
      case CstDslPackage.ENTITY_CONSTRAINT__FEATURES:
        return getFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CstDslPackage.ENTITY_CONSTRAINT__ENTITY:
        setEntity((Entity)newValue);
        return;
      case CstDslPackage.ENTITY_CONSTRAINT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case CstDslPackage.ENTITY_CONSTRAINT__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends FeatureConstraint>)newValue);
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
      case CstDslPackage.ENTITY_CONSTRAINT__ENTITY:
        setEntity((Entity)null);
        return;
      case CstDslPackage.ENTITY_CONSTRAINT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case CstDslPackage.ENTITY_CONSTRAINT__FEATURES:
        getFeatures().clear();
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
      case CstDslPackage.ENTITY_CONSTRAINT__ENTITY:
        return entity != null;
      case CstDslPackage.ENTITY_CONSTRAINT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case CstDslPackage.ENTITY_CONSTRAINT__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EntityConstraintImpl
