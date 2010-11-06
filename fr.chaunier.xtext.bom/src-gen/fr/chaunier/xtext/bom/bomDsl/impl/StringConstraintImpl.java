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
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.StringConstraintImpl#getFixeLength <em>Fixe Length</em>}</li>
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
   * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLength()
   * @generated
   * @ordered
   */
  protected static final int MIN_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinLength()
   * @generated
   * @ordered
   */
  protected int minLength = MIN_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLength()
   * @generated
   * @ordered
   */
  protected static final int MAX_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxLength()
   * @generated
   * @ordered
   */
  protected int maxLength = MAX_LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getFixeLength() <em>Fixe Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixeLength()
   * @generated
   * @ordered
   */
  protected static final int FIXE_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFixeLength() <em>Fixe Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixeLength()
   * @generated
   * @ordered
   */
  protected int fixeLength = FIXE_LENGTH_EDEFAULT;

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
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__HAS_DEFAULT, oldHasDefault, hasDefault));
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
  public int getMinLength()
  {
    return minLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinLength(int newMinLength)
  {
    int oldMinLength = minLength;
    minLength = newMinLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__MIN_LENGTH, oldMinLength, minLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxLength()
  {
    return maxLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxLength(int newMaxLength)
  {
    int oldMaxLength = maxLength;
    maxLength = newMaxLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__MAX_LENGTH, oldMaxLength, maxLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFixeLength()
  {
    return fixeLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixeLength(int newFixeLength)
  {
    int oldFixeLength = fixeLength;
    fixeLength = newFixeLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.STRING_CONSTRAINT__FIXE_LENGTH, oldFixeLength, fixeLength));
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
      case BomDslPackage.STRING_CONSTRAINT__HAS_DEFAULT:
        return isHasDefault();
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        return getDefaultValue();
      case BomDslPackage.STRING_CONSTRAINT__MIN_LENGTH:
        return getMinLength();
      case BomDslPackage.STRING_CONSTRAINT__MAX_LENGTH:
        return getMaxLength();
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LENGTH:
        return getFixeLength();
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
      case BomDslPackage.STRING_CONSTRAINT__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MIN_LENGTH:
        setMinLength((Integer)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LENGTH:
        setMaxLength((Integer)newValue);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LENGTH:
        setFixeLength((Integer)newValue);
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
      case BomDslPackage.STRING_CONSTRAINT__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MIN_LENGTH:
        setMinLength(MIN_LENGTH_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LENGTH:
        setMaxLength(MAX_LENGTH_EDEFAULT);
        return;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LENGTH:
        setFixeLength(FIXE_LENGTH_EDEFAULT);
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
      case BomDslPackage.STRING_CONSTRAINT__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case BomDslPackage.STRING_CONSTRAINT__MIN_LENGTH:
        return minLength != MIN_LENGTH_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__MAX_LENGTH:
        return maxLength != MAX_LENGTH_EDEFAULT;
      case BomDslPackage.STRING_CONSTRAINT__FIXE_LENGTH:
        return fixeLength != FIXE_LENGTH_EDEFAULT;
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
    result.append(", hasDefault: ");
    result.append(hasDefault);
    result.append(", defaultValue: ");
    result.append(defaultValue);
    result.append(", minLength: ");
    result.append(minLength);
    result.append(", maxLength: ");
    result.append(maxLength);
    result.append(", fixeLength: ");
    result.append(fixeLength);
    result.append(", regularExpression: ");
    result.append(regularExpression);
    result.append(')');
    return result.toString();
  }

} //StringConstraintImpl
