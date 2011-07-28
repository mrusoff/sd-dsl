/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.AllConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getMinLen <em>Min Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#getPaddle <em>Paddle</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isIsId <em>Is Id</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isWritable <em>Writable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.AllConstraintImpl#isIsXSDAtt <em>Is XSD Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllConstraintImpl extends MinimalEObjectImpl.Container implements AllConstraint
{
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
   * The default value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsId()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsId()
   * @generated
   * @ordered
   */
  protected boolean isId = IS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected static final boolean DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected boolean derived = DERIVED_EDEFAULT;

  /**
   * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWritable()
   * @generated
   * @ordered
   */
  protected static final boolean WRITABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWritable()
   * @generated
   * @ordered
   */
  protected boolean writable = WRITABLE_EDEFAULT;

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
  protected AllConstraintImpl()
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
    return OmcstDslPackage.Literals.ALL_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__HAS_DEFAULT, oldHasDefault, hasDefault));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__IS_FIXED, oldIsFixed, isFixed));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__FIXED_VALUE, oldFixedValue, fixedValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__MIN_LEN, oldMinLen, minLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__MAX_LEN, oldMaxLen, maxLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__FIXE_LEN, oldFixeLen, fixeLen));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__PADDLE, oldPaddle, paddle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsId()
  {
    return isId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsId(boolean newIsId)
  {
    boolean oldIsId = isId;
    isId = newIsId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__IS_ID, oldIsId, isId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable)
  {
    boolean oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDerived()
  {
    return derived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerived(boolean newDerived)
  {
    boolean oldDerived = derived;
    derived = newDerived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__DERIVED, oldDerived, derived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWritable()
  {
    return writable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWritable(boolean newWritable)
  {
    boolean oldWritable = writable;
    writable = newWritable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__WRITABLE, oldWritable, writable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ALL_CONSTRAINT__IS_XSD_ATT, oldIsXSDAtt, isXSDAtt));
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
      case OmcstDslPackage.ALL_CONSTRAINT__HAS_DEFAULT:
        return isHasDefault();
      case OmcstDslPackage.ALL_CONSTRAINT__DEFAULT_VALUE:
        return getDefaultValue();
      case OmcstDslPackage.ALL_CONSTRAINT__IS_FIXED:
        return isIsFixed();
      case OmcstDslPackage.ALL_CONSTRAINT__FIXED_VALUE:
        return getFixedValue();
      case OmcstDslPackage.ALL_CONSTRAINT__MIN_LEN:
        return getMinLen();
      case OmcstDslPackage.ALL_CONSTRAINT__MAX_LEN:
        return getMaxLen();
      case OmcstDslPackage.ALL_CONSTRAINT__FIXE_LEN:
        return getFixeLen();
      case OmcstDslPackage.ALL_CONSTRAINT__PADDLE:
        return getPaddle();
      case OmcstDslPackage.ALL_CONSTRAINT__IS_ID:
        return isIsId();
      case OmcstDslPackage.ALL_CONSTRAINT__NULLABLE:
        return isNullable();
      case OmcstDslPackage.ALL_CONSTRAINT__DERIVED:
        return isDerived();
      case OmcstDslPackage.ALL_CONSTRAINT__WRITABLE:
        return isWritable();
      case OmcstDslPackage.ALL_CONSTRAINT__IS_XSD_ATT:
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
      case OmcstDslPackage.ALL_CONSTRAINT__HAS_DEFAULT:
        setHasDefault((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue((String)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_FIXED:
        setIsFixed((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXED_VALUE:
        setFixedValue((String)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__MIN_LEN:
        setMinLen((Integer)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__MAX_LEN:
        setMaxLen((Integer)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXE_LEN:
        setFixeLen((Integer)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__PADDLE:
        setPaddle((String)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_ID:
        setIsId((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__NULLABLE:
        setNullable((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__DERIVED:
        setDerived((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__WRITABLE:
        setWritable((Boolean)newValue);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_XSD_ATT:
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
      case OmcstDslPackage.ALL_CONSTRAINT__HAS_DEFAULT:
        setHasDefault(HAS_DEFAULT_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__DEFAULT_VALUE:
        setDefaultValue(DEFAULT_VALUE_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_FIXED:
        setIsFixed(IS_FIXED_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXED_VALUE:
        setFixedValue(FIXED_VALUE_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__MIN_LEN:
        setMinLen(MIN_LEN_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__MAX_LEN:
        setMaxLen(MAX_LEN_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXE_LEN:
        setFixeLen(FIXE_LEN_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__PADDLE:
        setPaddle(PADDLE_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_ID:
        setIsId(IS_ID_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__DERIVED:
        setDerived(DERIVED_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__WRITABLE:
        setWritable(WRITABLE_EDEFAULT);
        return;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_XSD_ATT:
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
      case OmcstDslPackage.ALL_CONSTRAINT__HAS_DEFAULT:
        return hasDefault != HAS_DEFAULT_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__DEFAULT_VALUE:
        return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
      case OmcstDslPackage.ALL_CONSTRAINT__IS_FIXED:
        return isFixed != IS_FIXED_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXED_VALUE:
        return FIXED_VALUE_EDEFAULT == null ? fixedValue != null : !FIXED_VALUE_EDEFAULT.equals(fixedValue);
      case OmcstDslPackage.ALL_CONSTRAINT__MIN_LEN:
        return minLen != MIN_LEN_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__MAX_LEN:
        return maxLen != MAX_LEN_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__FIXE_LEN:
        return fixeLen != FIXE_LEN_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__PADDLE:
        return PADDLE_EDEFAULT == null ? paddle != null : !PADDLE_EDEFAULT.equals(paddle);
      case OmcstDslPackage.ALL_CONSTRAINT__IS_ID:
        return isId != IS_ID_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__NULLABLE:
        return nullable != NULLABLE_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__DERIVED:
        return derived != DERIVED_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__WRITABLE:
        return writable != WRITABLE_EDEFAULT;
      case OmcstDslPackage.ALL_CONSTRAINT__IS_XSD_ATT:
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
    result.append(" (hasDefault: ");
    result.append(hasDefault);
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
    result.append(", paddle: ");
    result.append(paddle);
    result.append(", isId: ");
    result.append(isId);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(", derived: ");
    result.append(derived);
    result.append(", writable: ");
    result.append(writable);
    result.append(", isXSDAtt: ");
    result.append(isXSDAtt);
    result.append(')');
    return result.toString();
  }

} //AllConstraintImpl
