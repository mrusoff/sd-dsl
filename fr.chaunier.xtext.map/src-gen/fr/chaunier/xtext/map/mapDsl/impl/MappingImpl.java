/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.Entity;

import fr.chaunier.xtext.map.mapDsl.FeatureMap;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.Mapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl#getLeftClass <em>Left Class</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl#getRightClass <em>Right Class</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.MappingImpl#getMappedFeatures <em>Mapped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftClass() <em>Left Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftClass()
   * @generated
   * @ordered
   */
  protected Entity leftClass;

  /**
   * The cached value of the '{@link #getRightClass() <em>Right Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightClass()
   * @generated
   * @ordered
   */
  protected Entity rightClass;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getMappedFeatures() <em>Mapped Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedFeatures()
   * @generated
   * @ordered
   */
  protected EList<FeatureMap> mappedFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return MapDslPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getLeftClass()
  {
    if (leftClass != null && leftClass.eIsProxy())
    {
      InternalEObject oldLeftClass = (InternalEObject)leftClass;
      leftClass = (Entity)eResolveProxy(oldLeftClass);
      if (leftClass != oldLeftClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.MAPPING__LEFT_CLASS, oldLeftClass, leftClass));
      }
    }
    return leftClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetLeftClass()
  {
    return leftClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftClass(Entity newLeftClass)
  {
    Entity oldLeftClass = leftClass;
    leftClass = newLeftClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__LEFT_CLASS, oldLeftClass, leftClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getRightClass()
  {
    if (rightClass != null && rightClass.eIsProxy())
    {
      InternalEObject oldRightClass = (InternalEObject)rightClass;
      rightClass = (Entity)eResolveProxy(oldRightClass);
      if (rightClass != oldRightClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.MAPPING__RIGHT_CLASS, oldRightClass, rightClass));
      }
    }
    return rightClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetRightClass()
  {
    return rightClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightClass(Entity newRightClass)
  {
    Entity oldRightClass = rightClass;
    rightClass = newRightClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__RIGHT_CLASS, oldRightClass, rightClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureMap> getMappedFeatures()
  {
    if (mappedFeatures == null)
    {
      mappedFeatures = new EObjectContainmentEList<FeatureMap>(FeatureMap.class, this, MapDslPackage.MAPPING__MAPPED_FEATURES);
    }
    return mappedFeatures;
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
      case MapDslPackage.MAPPING__MAPPED_FEATURES:
        return ((InternalEList<?>)getMappedFeatures()).basicRemove(otherEnd, msgs);
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
      case MapDslPackage.MAPPING__NAME:
        return getName();
      case MapDslPackage.MAPPING__LEFT_CLASS:
        if (resolve) return getLeftClass();
        return basicGetLeftClass();
      case MapDslPackage.MAPPING__RIGHT_CLASS:
        if (resolve) return getRightClass();
        return basicGetRightClass();
      case MapDslPackage.MAPPING__DOCUMENTATION:
        return getDocumentation();
      case MapDslPackage.MAPPING__MAPPED_FEATURES:
        return getMappedFeatures();
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
      case MapDslPackage.MAPPING__NAME:
        setName((String)newValue);
        return;
      case MapDslPackage.MAPPING__LEFT_CLASS:
        setLeftClass((Entity)newValue);
        return;
      case MapDslPackage.MAPPING__RIGHT_CLASS:
        setRightClass((Entity)newValue);
        return;
      case MapDslPackage.MAPPING__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case MapDslPackage.MAPPING__MAPPED_FEATURES:
        getMappedFeatures().clear();
        getMappedFeatures().addAll((Collection<? extends FeatureMap>)newValue);
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
      case MapDslPackage.MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapDslPackage.MAPPING__LEFT_CLASS:
        setLeftClass((Entity)null);
        return;
      case MapDslPackage.MAPPING__RIGHT_CLASS:
        setRightClass((Entity)null);
        return;
      case MapDslPackage.MAPPING__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case MapDslPackage.MAPPING__MAPPED_FEATURES:
        getMappedFeatures().clear();
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
      case MapDslPackage.MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapDslPackage.MAPPING__LEFT_CLASS:
        return leftClass != null;
      case MapDslPackage.MAPPING__RIGHT_CLASS:
        return rightClass != null;
      case MapDslPackage.MAPPING__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case MapDslPackage.MAPPING__MAPPED_FEATURES:
        return mappedFeatures != null && !mappedFeatures.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //MappingImpl
