/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.EnumUsage;
import fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.EnumerationConstraintImpl#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationConstraintImpl extends ConstraintImpl implements EnumerationConstraint
{
  /**
   * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsage()
   * @generated
   * @ordered
   */
  protected static final EnumUsage USAGE_EDEFAULT = EnumUsage.AS_STRING;

  /**
   * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsage()
   * @generated
   * @ordered
   */
  protected EnumUsage usage = USAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getFixeLen() <em>Fixe Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixeLen()
   * @generated
   * @ordered
   */
  protected static final int FIXE_LEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFixeLen() <em>Fixe Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixeLen()
   * @generated
   * @ordered
   */
  protected int fixeLen = FIXE_LEN_EDEFAULT;

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
   * The default value of the '{@link #getDefaultValueAsString() <em>Default Value As String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueAsString()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_VALUE_AS_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultValueAsString() <em>Default Value As String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueAsString()
   * @generated
   * @ordered
   */
  protected String defaultValueAsString = DEFAULT_VALUE_AS_STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationConstraintImpl()
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
    return CstDslPackage.Literals.ENUMERATION_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumUsage getUsage()
  {
    return usage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsage(EnumUsage newUsage)
  {
    EnumUsage oldUsage = usage;
    usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENUMERATION_CONSTRAINT__USAGE, oldUsage, usage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFixeLen()
  {
    return fixeLen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixeLen(int newFixeLen)
  {
    int oldFixeLen = fixeLen;
    fixeLen = newFixeLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENUMERATION_CONSTRAINT__FIXE_LEN, oldFixeLen, fixeLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENUMERATION_CONSTRAINT__HAS_DEFAULT, oldHasDefault, hasDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultValueAsString()
  {
    return defaultValueAsString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValueAsString(String newDefaultValueAsString)
  {
    String oldDefaultValueAsString = defaultValueAsString;
    defaultValueAsString = newDefaultValueAsString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING, oldDefaultValueAsString, defaultValueAsString));
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
      case CstDslPackage.ENUMERATION_CONSTRAINT__USAGE:
        return getUsage();
      case CstDslPackage.ENUMERATION_CONSTRAINT__FIXE_LEN:
        return getFixeLen();
      case CstDslPackage.ENUMERATION_CONSTRAINT__HAS_DEFAULT:
        return isHasDefault();
      case CstDslPackage.ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING:
        return getDefaultValueAsString();
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
      case CstDslPackage.ENUMERATION_CONSTRAINT__USAGE:
        setUsage((EnumUsage)newValue);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__FIXE_LEN:
        setFixeLen((Integer)newValue);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING:
        setDefaultValueAsString((String)newValue);
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
      case CstDslPackage.ENUMERATION_CONSTRAINT__USAGE:
        setUsage(USAGE_EDEFAULT);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__FIXE_LEN:
        setFixeLen(FIXE_LEN_EDEFAULT);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case CstDslPackage.ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING:
        setDefaultValueAsString(DEFAULT_VALUE_AS_STRING_EDEFAULT);
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
      case CstDslPackage.ENUMERATION_CONSTRAINT__USAGE:
        return usage != USAGE_EDEFAULT;
      case CstDslPackage.ENUMERATION_CONSTRAINT__FIXE_LEN:
        return fixeLen != FIXE_LEN_EDEFAULT;
      case CstDslPackage.ENUMERATION_CONSTRAINT__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case CstDslPackage.ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING:
        return DEFAULT_VALUE_AS_STRING_EDEFAULT == null ? defaultValueAsString != null : !DEFAULT_VALUE_AS_STRING_EDEFAULT.equals(defaultValueAsString);
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
    result.append(" (usage: ");
    result.append(usage);
    result.append(", fixeLen: ");
    result.append(fixeLen);
    result.append(", hasDefault: ");
    result.append(hasDefault);
    result.append(", defaultValueAsString: ");
    result.append(defaultValueAsString);
    result.append(')');
    return result.toString();
  }

} //EnumerationConstraintImpl
