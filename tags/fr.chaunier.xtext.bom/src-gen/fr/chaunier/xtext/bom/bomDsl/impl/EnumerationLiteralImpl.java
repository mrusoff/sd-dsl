/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.EnumerationLiteralImpl#getPersistedValue <em>Persisted Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends MinimalEObjectImpl.Container implements EnumerationLiteral
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
   * The default value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistedValue()
   * @generated
   * @ordered
   */
  protected static final int PERSISTED_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPersistedValue() <em>Persisted Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersistedValue()
   * @generated
   * @ordered
   */
  protected int persistedValue = PERSISTED_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationLiteralImpl()
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
    return BomDslPackage.Literals.ENUMERATION_LITERAL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.ENUMERATION_LITERAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPersistedValue()
  {
    return persistedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistedValue(int newPersistedValue)
  {
    int oldPersistedValue = persistedValue;
    persistedValue = newPersistedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.ENUMERATION_LITERAL__PERSISTED_VALUE, oldPersistedValue, persistedValue));
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
      case BomDslPackage.ENUMERATION_LITERAL__NAME:
        return getName();
      case BomDslPackage.ENUMERATION_LITERAL__PERSISTED_VALUE:
        return getPersistedValue();
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
      case BomDslPackage.ENUMERATION_LITERAL__NAME:
        setName((String)newValue);
        return;
      case BomDslPackage.ENUMERATION_LITERAL__PERSISTED_VALUE:
        setPersistedValue((Integer)newValue);
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
      case BomDslPackage.ENUMERATION_LITERAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BomDslPackage.ENUMERATION_LITERAL__PERSISTED_VALUE:
        setPersistedValue(PERSISTED_VALUE_EDEFAULT);
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
      case BomDslPackage.ENUMERATION_LITERAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BomDslPackage.ENUMERATION_LITERAL__PERSISTED_VALUE:
        return persistedValue != PERSISTED_VALUE_EDEFAULT;
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
    result.append(", persistedValue: ");
    result.append(persistedValue);
    result.append(')');
    return result.toString();
  }

} //EnumerationLiteralImpl
