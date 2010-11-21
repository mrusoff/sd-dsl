/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap;
import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

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
 * An implementation of the model object '<em><b>Mapping Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.MappingModuleImpl#getMappedFeatures <em>Mapped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingModuleImpl extends MinimalEObjectImpl.Container implements MappingModule
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
  protected MappingModuleImpl()
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
    return SMapDslPackage.Literals.MAPPING_MODULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.MAPPING_MODULE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.MAPPING_MODULE__DOCUMENTATION, oldDocumentation, documentation));
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
      mappedFeatures = new EObjectContainmentEList<FeatureMap>(FeatureMap.class, this, SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES);
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
      case SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES:
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
      case SMapDslPackage.MAPPING_MODULE__NAME:
        return getName();
      case SMapDslPackage.MAPPING_MODULE__DOCUMENTATION:
        return getDocumentation();
      case SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES:
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
      case SMapDslPackage.MAPPING_MODULE__NAME:
        setName((String)newValue);
        return;
      case SMapDslPackage.MAPPING_MODULE__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES:
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
      case SMapDslPackage.MAPPING_MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SMapDslPackage.MAPPING_MODULE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES:
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
      case SMapDslPackage.MAPPING_MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SMapDslPackage.MAPPING_MODULE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SMapDslPackage.MAPPING_MODULE__MAPPED_FEATURES:
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

} //MappingModuleImpl
