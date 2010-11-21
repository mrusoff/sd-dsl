/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.StringConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getMinLen <em>Min Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#isIsXSDAtt <em>Is XSD Att</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringConstraintImpl extends ConstraintImpl implements StringConstraint
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
   * The default value of the '{@link #isIsFixed() <em>Is Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFixed()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FIXED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFixed() <em>Is Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFixed()
   * @generated
   * @ordered
   */
  protected boolean isFixed = IS_FIXED_EDEFAULT;

  /**
   * The default value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedValue()
   * @generated
   * @ordered
   */
  protected static final String FIXED_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedValue()
   * @generated
   * @ordered
   */
  protected String fixedValue = FIXED_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinLen() <em>Min Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLen()
   * @generated
   * @ordered
   */
  protected static final int MIN_LEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinLen() <em>Min Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLen()
   * @generated
   * @ordered
   */
  protected int minLen = MIN_LEN_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxLen() <em>Max Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLen()
   * @generated
   * @ordered
   */
  protected static final int MAX_LEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxLen() <em>Max Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLen()
   * @generated
   * @ordered
   */
  protected int maxLen = MAX_LEN_EDEFAULT;

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
   * The default value of the '{@link #isIsXSDAtt() <em>Is XSD Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsXSDAtt()
   * @generated
   * @ordered
   */
  protected static final boolean IS_XSD_ATT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsXSDAtt() <em>Is XSD Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsXSDAtt()
   * @generated
   * @ordered
   */
  protected boolean isXSDAtt = IS_XSD_ATT_EDEFAULT;

  /**
   * The default value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularExpression()
   * @generated
   * @ordered
   */
  protected static final String REGULAR_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularExpression()
   * @generated
   * @ordered
   */
  protected String regularExpression = REGULAR_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringConstraintImpl()
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
    return BomDslPackage.Literals.STRING_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFixed()
  {
    return isFixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFixed(boolean newIsFixed)
  {
    boolean oldIsFixed = isFixed;
    isFixed = newIsFixed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__IS_FIXED, oldIsFixed, isFixed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixedValue()
  {
    return fixedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedValue(String newFixedValue)
  {
    String oldFixedValue = fixedValue;
    fixedValue = newFixedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__FIXED_VALUE, oldFixedValue, fixedValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinLen()
  {
    return minLen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinLen(int newMinLen)
  {
    int oldMinLen = minLen;
    minLen = newMinLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__MIN_LEN, oldMinLen, minLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxLen()
  {
    return maxLen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxLen(int newMaxLen)
  {
    int oldMaxLen = maxLen;
    maxLen = newMaxLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__MAX_LEN, oldMaxLen, maxLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__FIXE_LEN, oldFixeLen, fixeLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsXSDAtt()
  {
    return isXSDAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsXSDAtt(boolean newIsXSDAtt)
  {
    boolean oldIsXSDAtt = isXSDAtt;
    isXSDAtt = newIsXSDAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__IS_XSD_ATT, oldIsXSDAtt, isXSDAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegularExpression()
  {
    return regularExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegularExpression(String newRegularExpression)
  {
    String oldRegularExpression = regularExpression;
    regularExpression = newRegularExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
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
      case BomDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        return getDefaultValue();
      case BomDslPackage.STRING_CONSTRAINT__IS_FIXED:
        return isIsFixed();
      case BomDslPackage.STRING_CONSTRAINT__FIXED_VALUE:
        return getFixedValue();
      case BomDslPackage.STRING_CONSTRAINT__MIN_LEN:
        return getMinLen();
      case BomDslPackage.STRING_CONSTRAINT__MAX_LEN:
        return getMaxLen();
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LEN:
        return getFixeLen();
      case BomDslPackage.STRING_CONSTRAINT__IS_XSD_ATT:
        return isIsXSDAtt();
      case BomDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        return getRegularExpression();
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
      case BomDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__IS_FIXED:
        setIsFixed((Boolean)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXED_VALUE:
        setFixedValue((String)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MIN_LEN:
        setMinLen((Integer)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LEN:
        setMaxLen((Integer)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LEN:
        setFixeLen((Integer)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__IS_XSD_ATT:
        setIsXSDAtt((Boolean)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        setRegularExpression((String)newValue);
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
      case BomDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__IS_FIXED:
        setIsFixed(IS_FIXED_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXED_VALUE:
        setFixedValue(FIXED_VALUE_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MIN_LEN:
        setMinLen(MIN_LEN_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LEN:
        setMaxLen(MAX_LEN_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LEN:
        setFixeLen(FIXE_LEN_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__IS_XSD_ATT:
        setIsXSDAtt(IS_XSD_ATT_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        setRegularExpression(REGULAR_EXPRESSION_EDEFAULT);
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
      case BomDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case BomDslPackage.STRING_CONSTRAINT__IS_FIXED:
        return isFixed != IS_FIXED_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__FIXED_VALUE:
        return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
      case BomDslPackage.STRING_CONSTRAINT__MIN_LEN:
        return minLen != MIN_LEN_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LEN:
        return maxLen != MAX_LEN_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LEN:
        return fixeLen != FIXE_LEN_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__IS_XSD_ATT:
        return isXSDAtt != IS_XSD_ATT_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        return REGULAR_EXPRESSION_EDEFAULT == null ? regularExpression != null : !REGULAR_EXPRESSION_EDEFAULT.equals(regularExpression);
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
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", isFixed: ");
    result.append(isFixed);
    result.append(", fixedValue: ");
    result.append(fixedValue);
    result.append(", minLen: ");
    result.append(minLen);
    result.append(", maxLen: ");
    result.append(maxLen);
    result.append(", fixeLen: ");
    result.append(fixeLen);
    result.append(", isXSDAtt: ");
    result.append(isXSDAtt);
    result.append(", regularExpression: ");
    result.append(regularExpression);
    result.append(')');
    return result.toString();
  }

} //StringConstraintImpl
