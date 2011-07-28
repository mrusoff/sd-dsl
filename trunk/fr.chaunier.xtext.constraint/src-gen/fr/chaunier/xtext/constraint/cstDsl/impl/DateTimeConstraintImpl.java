/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint;

import fr.chaunier.xtext.om.omDsl.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DateTimeConstraintImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTimeConstraintImpl extends ConstraintImpl implements DateTimeConstraint
{
  /**
   * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected String constraint = CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected DataType dataType;

  /**
   * The default value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDefault()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasDefault() <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasDefault()
   * @generated
   * @ordered
   */
  protected boolean hasDefault = HAS_DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DateTimeConstraintImpl()
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
    return CstDslPackage.Literals.DATE_TIME_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(String newConstraint)
  {
    String oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DATE_TIME_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDataType()
  {
    if (dataType != null && dataType.eIsProxy())
    {
      InternalEObject oldDataType = (InternalEObject)dataType;
      dataType = (DataType)eResolveProxy(oldDataType);
      if (dataType != oldDataType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE, oldDataType, dataType));
      }
    }
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(DataType newDataType)
  {
    DataType oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasDefault()
  {
    return hasDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasDefault(boolean newHasDefault)
  {
    boolean oldHasDefault = hasDefault;
    hasDefault = newHasDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DATE_TIME_CONSTRAINT__HAS_DEFAULT, oldHasDefault, hasDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(String newDefaultValue)
  {
    String oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DATE_TIME_CONSTRAINT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
      case CstDslPackage.DATE_TIME_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE:
        if (resolve) return getDataType();
        return basicGetDataType();
      case CstDslPackage.DATE_TIME_CONSTRAINT__HAS_DEFAULT:
        return isHasDefault();
      case CstDslPackage.DATE_TIME_CONSTRAINT__DEFAULT_VALUE:
        return getDefaultValue();
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
      case CstDslPackage.DATE_TIME_CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE:
        setDataType((DataType)newValue);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
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
      case CstDslPackage.DATE_TIME_CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE:
        setDataType((DataType)null);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case CstDslPackage.DATE_TIME_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
      case CstDslPackage.DATE_TIME_CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case CstDslPackage.DATE_TIME_CONSTRAINT__DATA_TYPE:
        return dataType != null;
      case CstDslPackage.DATE_TIME_CONSTRAINT__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case CstDslPackage.DATE_TIME_CONSTRAINT__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
    result.append(" (constraint: ");
    result.append(constraint);
    result.append(", hasDefault: ");
    result.append(hasDefault);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(')');
    return result.toString();
  }

} //DateTimeConstraintImpl
