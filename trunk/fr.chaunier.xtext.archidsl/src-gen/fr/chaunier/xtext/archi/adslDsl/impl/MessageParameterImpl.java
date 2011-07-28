/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.impl;

import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.MessageParameter;

import fr.chaunier.xtext.om.omDsl.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl#getTyperef <em>Typeref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageParameterImpl extends MinimalEObjectImpl.Container implements MessageParameter
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
   * The cached value of the '{@link #getTyperef() <em>Typeref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyperef()
   * @generated
   * @ordered
   */
  protected Entity typeref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageParameterImpl()
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
    return AdslDslPackage.Literals.MESSAGE_PARAMETER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.MESSAGE_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getTyperef()
  {
    if (typeref != null && typeref.eIsProxy())
    {
      InternalEObject oldTyperef = (InternalEObject)typeref;
      typeref = (Entity)eResolveProxy(oldTyperef);
      if (typeref != oldTyperef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdslDslPackage.MESSAGE_PARAMETER__TYPEREF, oldTyperef, typeref));
      }
    }
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetTyperef()
  {
    return typeref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyperef(Entity newTyperef)
  {
    Entity oldTyperef = typeref;
    typeref = newTyperef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdslDslPackage.MESSAGE_PARAMETER__TYPEREF, oldTyperef, typeref));
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
      case AdslDslPackage.MESSAGE_PARAMETER__NAME:
        return getName();
      case AdslDslPackage.MESSAGE_PARAMETER__TYPEREF:
        if (resolve) return getTyperef();
        return basicGetTyperef();
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
      case AdslDslPackage.MESSAGE_PARAMETER__NAME:
        setName((String)newValue);
        return;
      case AdslDslPackage.MESSAGE_PARAMETER__TYPEREF:
        setTyperef((Entity)newValue);
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
      case AdslDslPackage.MESSAGE_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdslDslPackage.MESSAGE_PARAMETER__TYPEREF:
        setTyperef((Entity)null);
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
      case AdslDslPackage.MESSAGE_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdslDslPackage.MESSAGE_PARAMETER__TYPEREF:
        return typeref != null;
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

} //MessageParameterImpl
