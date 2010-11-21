/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.IntegerConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#getPaddle <em>Paddle</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.IntegerConstraintImpl#isIsXSDAtt <em>Is XSD Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerConstraintImpl extends ConstraintImpl implements IntegerConstraint
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
  protected static final int DEFAULT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

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
  protected static final int FIXED_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFixedValue() <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixedValue()
   * @generated
   * @ordered
   */
  protected int fixedValue = FIXED_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected static final int MIN_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected int minValue = MIN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected static final int MAX_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected int maxValue = MAX_VALUE_EDEFAULT;

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
   * The default value of the '{@link #getPaddle() <em>Paddle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaddle()
   * @generated
   * @ordered
   */
  protected static final String PADDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPaddle() <em>Paddle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaddle()
   * @generated
   * @ordered
   */
  protected String paddle = PADDLE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerConstraintImpl()
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
    return BomDslPackage.Literals.INTEGER_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(int newDefaultValue)
  {
    int oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__IS_FIXED, oldIsFixed, isFixed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFixedValue()
  {
    return fixedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixedValue(int newFixedValue)
  {
    int oldFixedValue = fixedValue;
    fixedValue = newFixedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__FIXED_VALUE, oldFixedValue, fixedValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinValue()
  {
    return minValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinValue(int newMinValue)
  {
    int oldMinValue = minValue;
    minValue = newMinValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__MIN_VALUE, oldMinValue, minValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxValue()
  {
    return maxValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxValue(int newMaxValue)
  {
    int oldMaxValue = maxValue;
    maxValue = newMaxValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__MAX_VALUE, oldMaxValue, maxValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__MAX_LEN, oldMaxLen, maxLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__FIXE_LEN, oldFixeLen, fixeLen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPaddle()
  {
    return paddle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPaddle(String newPaddle)
  {
    String oldPaddle = paddle;
    paddle = newPaddle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__PADDLE, oldPaddle, paddle));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.INTEGER_CONSTRAINT__IS_XSD_ATT, oldIsXSDAtt, isXSDAtt));
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
      case BomDslPackage.INTEGER_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case BomDslPackage.INTEGER_CONSTRAINT__DEFAULT_VALUE:
        return getDefaultValue();
      case BomDslPackage.INTEGER_CONSTRAINT__IS_FIXED:
        return isIsFixed();
      case BomDslPackage.INTEGER_CONSTRAINT__FIXED_VALUE:
        return getFixedValue();
      case BomDslPackage.INTEGER_CONSTRAINT__MIN_VALUE:
        return getMinValue();
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_VALUE:
        return getMaxValue();
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_LEN:
        return getMaxLen();
      case BomDslPackage.INTEGER_CONSTRAINT__FIXE_LEN:
        return getFixeLen();
      case BomDslPackage.INTEGER_CONSTRAINT__PADDLE:
        return getPaddle();
      case BomDslPackage.INTEGER_CONSTRAINT__IS_XSD_ATT:
        return isIsXSDAtt();
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
      case BomDslPackage.INTEGER_CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__IS_FIXED:
        setIsFixed((Boolean)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXED_VALUE:
        setFixedValue((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MIN_VALUE:
        setMinValue((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_VALUE:
        setMaxValue((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_LEN:
        setMaxLen((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXE_LEN:
        setFixeLen((Integer)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__PADDLE:
        setPaddle((String)newValue);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__IS_XSD_ATT:
        setIsXSDAtt((Boolean)newValue);
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
      case BomDslPackage.INTEGER_CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__IS_FIXED:
        setIsFixed(IS_FIXED_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXED_VALUE:
        setFixedValue(FIXED_VALUE_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MIN_VALUE:
        setMinValue(MIN_VALUE_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_VALUE:
        setMaxValue(MAX_VALUE_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_LEN:
        setMaxLen(MAX_LEN_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXE_LEN:
        setFixeLen(FIXE_LEN_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__PADDLE:
        setPaddle(PADDLE_EDEFAULT);
        return;
      case BomDslPackage.INTEGER_CONSTRAINT__IS_XSD_ATT:
        setIsXSDAtt(IS_XSD_ATT_EDEFAULT);
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
      case BomDslPackage.INTEGER_CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case BomDslPackage.INTEGER_CONSTRAINT__DEFAULT_VALUE:
        return defaultValue != DEFAULT_VALUE_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__IS_FIXED:
        return isFixed != IS_FIXED_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXED_VALUE:
        return fixedValue != FIXED_VALUE_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__MIN_VALUE:
        return minValue != MIN_VALUE_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_VALUE:
        return maxValue != MAX_VALUE_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__MAX_LEN:
        return maxLen != MAX_LEN_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__FIXE_LEN:
        return fixeLen != FIXE_LEN_EDEFAULT;
      case BomDslPackage.INTEGER_CONSTRAINT__PADDLE:
        return PADDLE_EDEFAULT == null ? paddle != null : !PADDLE_EDEFAULT.equals(paddle);
      case BomDslPackage.INTEGER_CONSTRAINT__IS_XSD_ATT:
        return isXSDAtt != IS_XSD_ATT_EDEFAULT;
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
    result.append(", minValue: ");
    result.append(minValue);
    result.append(", maxValue: ");
    result.append(maxValue);
    result.append(", maxLen: ");
    result.append(maxLen);
    result.append(", fixeLen: ");
    result.append(fixeLen);
    result.append(", paddle: ");
    result.append(paddle);
    result.append(", isXSDAtt: ");
    result.append(isXSDAtt);
    result.append(')');
    return result.toString();
  }

} //IntegerConstraintImpl
