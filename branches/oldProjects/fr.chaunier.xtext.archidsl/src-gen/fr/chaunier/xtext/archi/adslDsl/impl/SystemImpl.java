/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.impl;

import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.Component;
import fr.chaunier.xtext.archi.adslDsl.Interface;
import fr.chaunier.xtext.archi.adslDsl.Using;

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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements fr.chaunier.xtext.archi.adslDsl.System
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
   * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsings()
   * @generated
   * @ordered
   */
  protected EList<Using> usings;

  /**
   * The cached value of the '{@link #getSubSystems() <em>Sub Systems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystems()
   * @generated
   * @ordered
   */
  protected EList<fr.chaunier.xtext.archi.adslDsl.System> subSystems;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return AdslDslPackage.Literals.SYSTEM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using> getUsings()
  {
    if (usings == null)
    {
      usings = new EObjectContainmentEList<Using>(Using.class, this, AdslDslPackage.SYSTEM__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<fr.chaunier.xtext.archi.adslDsl.System> getSubSystems()
  {
    if (subSystems == null)
    {
      subSystems = new EObjectContainmentEList<fr.chaunier.xtext.archi.adslDsl.System>(fr.chaunier.xtext.archi.adslDsl.System.class, this, AdslDslPackage.SYSTEM__SUB_SYSTEMS);
    }
    return subSystems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, AdslDslPackage.SYSTEM__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, AdslDslPackage.SYSTEM__INTERFACES);
    }
    return interfaces;
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
      case AdslDslPackage.SYSTEM__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case AdslDslPackage.SYSTEM__SUB_SYSTEMS:
        return ((InternalEList<?>)getSubSystems()).basicRemove(otherEnd, msgs);
      case AdslDslPackage.SYSTEM__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case AdslDslPackage.SYSTEM__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
      case AdslDslPackage.SYSTEM__NAME:
        return getName();
      case AdslDslPackage.SYSTEM__USINGS:
        return getUsings();
      case AdslDslPackage.SYSTEM__SUB_SYSTEMS:
        return getSubSystems();
      case AdslDslPackage.SYSTEM__COMPONENTS:
        return getComponents();
      case AdslDslPackage.SYSTEM__INTERFACES:
        return getInterfaces();
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
      case AdslDslPackage.SYSTEM__NAME:
        setName((String)newValue);
        return;
      case AdslDslPackage.SYSTEM__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using>)newValue);
        return;
      case AdslDslPackage.SYSTEM__SUB_SYSTEMS:
        getSubSystems().clear();
        getSubSystems().addAll((Collection<? extends fr.chaunier.xtext.archi.adslDsl.System>)newValue);
        return;
      case AdslDslPackage.SYSTEM__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case AdslDslPackage.SYSTEM__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
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
      case AdslDslPackage.SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslDslPackage.SYSTEM__USINGS:
        getUsings().clear();
        return;
      case AdslDslPackage.SYSTEM__SUB_SYSTEMS:
        getSubSystems().clear();
        return;
      case AdslDslPackage.SYSTEM__COMPONENTS:
        getComponents().clear();
        return;
      case AdslDslPackage.SYSTEM__INTERFACES:
        getInterfaces().clear();
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
      case AdslDslPackage.SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslDslPackage.SYSTEM__USINGS:
        return usings != null && !usings.isEmpty();
      case AdslDslPackage.SYSTEM__SUB_SYSTEMS:
        return subSystems != null && !subSystems.isEmpty();
      case AdslDslPackage.SYSTEM__COMPONENTS:
        return components != null && !components.isEmpty();
      case AdslDslPackage.SYSTEM__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //SystemImpl
