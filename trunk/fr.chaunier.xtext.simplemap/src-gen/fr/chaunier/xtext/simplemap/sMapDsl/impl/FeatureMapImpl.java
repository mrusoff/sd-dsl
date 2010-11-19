/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.Attribute;

import fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getLeftField <em>Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getRightField <em>Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getSetLeftField <em>Set Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getValLeft <em>Val Left</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getSetRightField <em>Set Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getValRight <em>Val Right</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getIgnoreLeftField <em>Ignore Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMapImpl extends MinimalEObjectImpl.Container implements FeatureMap
{
  /**
   * The cached value of the '{@link #getLeftField() <em>Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftField()
   * @generated
   * @ordered
   */
  protected Attribute leftField;

  /**
   * The cached value of the '{@link #getRightField() <em>Right Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightField()
   * @generated
   * @ordered
   */
  protected Attribute rightField;

  /**
   * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected static final String RULE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected String rule = RULE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSetLeftField() <em>Set Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetLeftField()
   * @generated
   * @ordered
   */
  protected Attribute setLeftField;

  /**
   * The default value of the '{@link #getValLeft() <em>Val Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValLeft()
   * @generated
   * @ordered
   */
  protected static final String VAL_LEFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValLeft() <em>Val Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValLeft()
   * @generated
   * @ordered
   */
  protected String valLeft = VAL_LEFT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSetRightField() <em>Set Right Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetRightField()
   * @generated
   * @ordered
   */
  protected Attribute setRightField;

  /**
   * The default value of the '{@link #getValRight() <em>Val Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValRight()
   * @generated
   * @ordered
   */
  protected static final String VAL_RIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValRight() <em>Val Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValRight()
   * @generated
   * @ordered
   */
  protected String valRight = VAL_RIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIgnoreLeftField() <em>Ignore Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIgnoreLeftField()
   * @generated
   * @ordered
   */
  protected Attribute ignoreLeftField;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureMapImpl()
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
    return SMapDslPackage.Literals.FEATURE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getLeftField()
  {
    if (leftField != null && leftField.eIsProxy())
    {
      InternalEObject oldLeftField = (InternalEObject)leftField;
      leftField = (Attribute)eResolveProxy(oldLeftField);
      if (leftField != oldLeftField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__LEFT_FIELD, oldLeftField, leftField));
      }
    }
    return leftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetLeftField()
  {
    return leftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftField(Attribute newLeftField)
  {
    Attribute oldLeftField = leftField;
    leftField = newLeftField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__LEFT_FIELD, oldLeftField, leftField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getRightField()
  {
    if (rightField != null && rightField.eIsProxy())
    {
      InternalEObject oldRightField = (InternalEObject)rightField;
      rightField = (Attribute)eResolveProxy(oldRightField);
      if (rightField != oldRightField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__RIGHT_FIELD, oldRightField, rightField));
      }
    }
    return rightField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetRightField()
  {
    return rightField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightField(Attribute newRightField)
  {
    Attribute oldRightField = rightField;
    rightField = newRightField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__RIGHT_FIELD, oldRightField, rightField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(String newRule)
  {
    String oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__RULE, oldRule, rule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getSetLeftField()
  {
    if (setLeftField != null && setLeftField.eIsProxy())
    {
      InternalEObject oldSetLeftField = (InternalEObject)setLeftField;
      setLeftField = (Attribute)eResolveProxy(oldSetLeftField);
      if (setLeftField != oldSetLeftField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD, oldSetLeftField, setLeftField));
      }
    }
    return setLeftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetSetLeftField()
  {
    return setLeftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetLeftField(Attribute newSetLeftField)
  {
    Attribute oldSetLeftField = setLeftField;
    setLeftField = newSetLeftField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD, oldSetLeftField, setLeftField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValLeft()
  {
    return valLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValLeft(String newValLeft)
  {
    String oldValLeft = valLeft;
    valLeft = newValLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__VAL_LEFT, oldValLeft, valLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getSetRightField()
  {
    if (setRightField != null && setRightField.eIsProxy())
    {
      InternalEObject oldSetRightField = (InternalEObject)setRightField;
      setRightField = (Attribute)eResolveProxy(oldSetRightField);
      if (setRightField != oldSetRightField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD, oldSetRightField, setRightField));
      }
    }
    return setRightField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetSetRightField()
  {
    return setRightField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetRightField(Attribute newSetRightField)
  {
    Attribute oldSetRightField = setRightField;
    setRightField = newSetRightField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD, oldSetRightField, setRightField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValRight()
  {
    return valRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValRight(String newValRight)
  {
    String oldValRight = valRight;
    valRight = newValRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__VAL_RIGHT, oldValRight, valRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getIgnoreLeftField()
  {
    if (ignoreLeftField != null && ignoreLeftField.eIsProxy())
    {
      InternalEObject oldIgnoreLeftField = (InternalEObject)ignoreLeftField;
      ignoreLeftField = (Attribute)eResolveProxy(oldIgnoreLeftField);
      if (ignoreLeftField != oldIgnoreLeftField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD, oldIgnoreLeftField, ignoreLeftField));
      }
    }
    return ignoreLeftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetIgnoreLeftField()
  {
    return ignoreLeftField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIgnoreLeftField(Attribute newIgnoreLeftField)
  {
    Attribute oldIgnoreLeftField = ignoreLeftField;
    ignoreLeftField = newIgnoreLeftField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD, oldIgnoreLeftField, ignoreLeftField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__DOCUMENTATION, oldDocumentation, documentation));
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELD:
        if (resolve) return getLeftField();
        return basicGetLeftField();
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELD:
        if (resolve) return getRightField();
        return basicGetRightField();
      case SMapDslPackage.FEATURE_MAP__RULE:
        return getRule();
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        if (resolve) return getSetLeftField();
        return basicGetSetLeftField();
      case SMapDslPackage.FEATURE_MAP__VAL_LEFT:
        return getValLeft();
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        if (resolve) return getSetRightField();
        return basicGetSetRightField();
      case SMapDslPackage.FEATURE_MAP__VAL_RIGHT:
        return getValRight();
      case SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD:
        if (resolve) return getIgnoreLeftField();
        return basicGetIgnoreLeftField();
      case SMapDslPackage.FEATURE_MAP__DOCUMENTATION:
        return getDocumentation();
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELD:
        setLeftField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELD:
        setRightField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__RULE:
        setRule((String)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        setSetLeftField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__VAL_LEFT:
        setValLeft((String)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        setSetRightField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__VAL_RIGHT:
        setValRight((String)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD:
        setIgnoreLeftField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__DOCUMENTATION:
        setDocumentation((String)newValue);
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELD:
        setLeftField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELD:
        setRightField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__RULE:
        setRule(RULE_EDEFAULT);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        setSetLeftField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__VAL_LEFT:
        setValLeft(VAL_LEFT_EDEFAULT);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        setSetRightField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__VAL_RIGHT:
        setValRight(VAL_RIGHT_EDEFAULT);
        return;
      case SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD:
        setIgnoreLeftField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELD:
        return leftField != null;
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELD:
        return rightField != null;
      case SMapDslPackage.FEATURE_MAP__RULE:
        return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        return setLeftField != null;
      case SMapDslPackage.FEATURE_MAP__VAL_LEFT:
        return VAL_LEFT_EDEFAULT == null ? valLeft != null : !VAL_LEFT_EDEFAULT.equals(valLeft);
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        return setRightField != null;
      case SMapDslPackage.FEATURE_MAP__VAL_RIGHT:
        return VAL_RIGHT_EDEFAULT == null ? valRight != null : !VAL_RIGHT_EDEFAULT.equals(valRight);
      case SMapDslPackage.FEATURE_MAP__IGNORE_LEFT_FIELD:
        return ignoreLeftField != null;
      case SMapDslPackage.FEATURE_MAP__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
    result.append(" (rule: ");
    result.append(rule);
    result.append(", valLeft: ");
    result.append(valLeft);
    result.append(", valRight: ");
    result.append(valRight);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //FeatureMapImpl
