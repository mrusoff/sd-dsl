/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.Model;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl#getMappingModules <em>Mapping Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getMappingModules() <em>Mapping Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingModules()
   * @generated
   * @ordered
   */
  protected EList<MappingModule> mappingModules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SMapDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingModule> getMappingModules()
  {
    if (mappingModules == null)
    {
      mappingModules = new EObjectContainmentEList<MappingModule>(MappingModule.class, this, SMapDslPackage.MODEL__MAPPING_MODULES);
    }
    return mappingModules;
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
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        return ((InternalEList<?>)getMappingModules()).basicRemove(otherEnd, msgs);
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
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        return getMappingModules();
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
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
        getMappingModules().addAll((Collection<? extends MappingModule>)newValue);
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
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
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
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        return mappingModules != null && !mappingModules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
