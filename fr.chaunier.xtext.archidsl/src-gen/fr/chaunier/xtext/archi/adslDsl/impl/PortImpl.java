/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.impl;

import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.Interface;
import fr.chaunier.xtext.archi.adslDsl.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl#isIsToMany <em>Is To Many</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port
{
  /**
   * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean IS_MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsMandatory()
   * @generated
   * @ordered
   */
  protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isIsToMany() <em>Is To Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsToMany()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TO_MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsToMany() <em>Is To Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsToMany()
   * @generated
   * @ordered
   */
  protected boolean isToMany = IS_TO_MANY_EDEFAULT;

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
   * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface()
   * @generated
   * @ordered
   */
  protected Interface interface_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return AdslDslPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsMandatory()
  {
    return isMandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMandatory(boolean newIsMandatory)
  {
    boolean oldIsMandatory = isMandatory;
    isMandatory = newIsMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.PORT__IS_MANDATORY, oldIsMandatory, isMandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsToMany()
  {
    return isToMany;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsToMany(boolean newIsToMany)
  {
    boolean oldIsToMany = isToMany;
    isToMany = newIsToMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.PORT__IS_TO_MANY, oldIsToMany, isToMany));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterface()
  {
    if (interface_ != null && interface_.eIsProxy())
    {
      InternalEObject oldInterface = (InternalEObject)interface_;
      interface_ = (Interface)eResolveProxy(oldInterface);
      if (interface_ != oldInterface)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslDslPackage.PORT__INTERFACE, oldInterface, interface_));
      }
    }
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(Interface newInterface)
  {
    Interface oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.PORT__INTERFACE, oldInterface, interface_));
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
      case AdslDslPackage.PORT__IS_MANDATORY:
        return isIsMandatory();
      case AdslDslPackage.PORT__IS_TO_MANY:
        return isIsToMany();
      case AdslDslPackage.PORT__NAME:
        return getName();
      case AdslDslPackage.PORT__INTERFACE:
        if (resolve) return getInterface();
        return basicGetInterface();
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
      case AdslDslPackage.PORT__IS_MANDATORY:
        setIsMandatory((Boolean)newValue);
        return;
      case AdslDslPackage.PORT__IS_TO_MANY:
        setIsToMany((Boolean)newValue);
        return;
      case AdslDslPackage.PORT__NAME:
        setName((String)newValue);
        return;
      case AdslDslPackage.PORT__INTERFACE:
        setInterface((Interface)newValue);
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
      case AdslDslPackage.PORT__IS_MANDATORY:
        setIsMandatory(IS_MANDATORY_EDEFAULT);
        return;
      case AdslDslPackage.PORT__IS_TO_MANY:
        setIsToMany(IS_TO_MANY_EDEFAULT);
        return;
      case AdslDslPackage.PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslDslPackage.PORT__INTERFACE:
        setInterface((Interface)null);
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
      case AdslDslPackage.PORT__IS_MANDATORY:
        return isMandatory != IS_MANDATORY_EDEFAULT;
      case AdslDslPackage.PORT__IS_TO_MANY:
        return isToMany != IS_TO_MANY_EDEFAULT;
      case AdslDslPackage.PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslDslPackage.PORT__INTERFACE:
        return interface_ != null;
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
    result.append(" (isMandatory: ");
    result.append(isMandatory);
    result.append(", isToMany: ");
    result.append(isToMany);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PortImpl
