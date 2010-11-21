/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.Model;
import fr.chaunier.xtext.simplemap.sMapDsl.RootModule;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl#getMappingModules <em>Mapping Modules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.ModelImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getMappingModules() <em>Mapping Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingModules()
   * @generated
   * @ordered
   */
  protected EList<MappingModule> mappingModules;

  /**
   * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoots()
   * @generated
   * @ordered
   */
  protected EList<RootModule> roots;

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
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.MODEL__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.MODEL__DOCUMENTATION, oldDocumentation, documentation));
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
  public EList<RootModule> getRoots()
  {
    if (roots == null)
    {
      roots = new EObjectContainmentEList<RootModule>(RootModule.class, this, SMapDslPackage.MODEL__ROOTS);
    }
    return roots;
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
      case SMapDslPackage.MODEL__ROOTS:
        return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
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
      case SMapDslPackage.MODEL__NAME:
        return getName();
      case SMapDslPackage.MODEL__DOCUMENTATION:
        return getDocumentation();
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        return getMappingModules();
      case SMapDslPackage.MODEL__ROOTS:
        return getRoots();
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
      case SMapDslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case SMapDslPackage.MODEL__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
        getMappingModules().addAll((Collection<? extends MappingModule>)newValue);
        return;
      case SMapDslPackage.MODEL__ROOTS:
        getRoots().clear();
        getRoots().addAll((Collection<? extends RootModule>)newValue);
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
      case SMapDslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SMapDslPackage.MODEL__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
        return;
      case SMapDslPackage.MODEL__ROOTS:
        getRoots().clear();
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
      case SMapDslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SMapDslPackage.MODEL__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SMapDslPackage.MODEL__MAPPING_MODULES:
        return mappingModules != null && !mappingModules.isEmpty();
      case SMapDslPackage.MODEL__ROOTS:
        return roots != null && !roots.isEmpty();
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

} //ModelImpl
