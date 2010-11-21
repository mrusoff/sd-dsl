/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.Attribute;

import fr.chaunier.xtext.simplemap.sMapDsl.Expression;
import fr.chaunier.xtext.simplemap.sMapDsl.FeatureMap;
import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getLeftFields <em>Left Fields</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getRightFields <em>Right Fields</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getSetLeftField <em>Set Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getSetRightField <em>Set Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.FeatureMapImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMapImpl extends MinimalEObjectImpl.Container implements FeatureMap
{
  /**
   * The cached value of the '{@link #getLeftFields() <em>Left Fields</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftFields()
   * @generated
   * @ordered
   */
  protected EList<Attribute> leftFields;

  /**
   * The cached value of the '{@link #getRightFields() <em>Right Fields</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightFields()
   * @generated
   * @ordered
   */
  protected EList<Attribute> rightFields;

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
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

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
   * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected MappingModule module;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<String> rules;

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
  public EList<Attribute> getLeftFields()
  {
    if (leftFields == null)
    {
      leftFields = new EObjectResolvingEList<Attribute>(Attribute.class, this, SMapDslPackage.FEATURE_MAP__LEFT_FIELDS);
    }
    return leftFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getRightFields()
  {
    if (rightFields == null)
    {
      rightFields = new EObjectResolvingEList<Attribute>(Attribute.class, this, SMapDslPackage.FEATURE_MAP__RIGHT_FIELDS);
    }
    return rightFields;
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
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SMapDslPackage.FEATURE_MAP__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SMapDslPackage.FEATURE_MAP__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__EXPR, newExpr, newExpr));
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
  public MappingModule getModule()
  {
    if (module != null && module.eIsProxy())
    {
      InternalEObject oldModule = (InternalEObject)module;
      module = (MappingModule)eResolveProxy(oldModule);
      if (module != oldModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.FEATURE_MAP__MODULE, oldModule, module));
      }
    }
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule basicGetModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(MappingModule newModule)
  {
    MappingModule oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.FEATURE_MAP__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRules()
  {
    if (rules == null)
    {
      rules = new EDataTypeEList<String>(String.class, this, SMapDslPackage.FEATURE_MAP__RULES);
    }
    return rules;
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SMapDslPackage.FEATURE_MAP__EXPR:
        return basicSetExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELDS:
        return getLeftFields();
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELDS:
        return getRightFields();
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        if (resolve) return getSetLeftField();
        return basicGetSetLeftField();
      case SMapDslPackage.FEATURE_MAP__EXPR:
        return getExpr();
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        if (resolve) return getSetRightField();
        return basicGetSetRightField();
      case SMapDslPackage.FEATURE_MAP__MODULE:
        if (resolve) return getModule();
        return basicGetModule();
      case SMapDslPackage.FEATURE_MAP__RULES:
        return getRules();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELDS:
        getLeftFields().clear();
        getLeftFields().addAll((Collection<? extends Attribute>)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELDS:
        getRightFields().clear();
        getRightFields().addAll((Collection<? extends Attribute>)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        setSetLeftField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__EXPR:
        setExpr((Expression)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        setSetRightField((Attribute)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__MODULE:
        setModule((MappingModule)newValue);
        return;
      case SMapDslPackage.FEATURE_MAP__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends String>)newValue);
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELDS:
        getLeftFields().clear();
        return;
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELDS:
        getRightFields().clear();
        return;
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        setSetLeftField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__EXPR:
        setExpr((Expression)null);
        return;
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        setSetRightField((Attribute)null);
        return;
      case SMapDslPackage.FEATURE_MAP__MODULE:
        setModule((MappingModule)null);
        return;
      case SMapDslPackage.FEATURE_MAP__RULES:
        getRules().clear();
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
      case SMapDslPackage.FEATURE_MAP__LEFT_FIELDS:
        return leftFields != null && !leftFields.isEmpty();
      case SMapDslPackage.FEATURE_MAP__RIGHT_FIELDS:
        return rightFields != null && !rightFields.isEmpty();
      case SMapDslPackage.FEATURE_MAP__SET_LEFT_FIELD:
        return setLeftField != null;
      case SMapDslPackage.FEATURE_MAP__EXPR:
        return expr != null;
      case SMapDslPackage.FEATURE_MAP__SET_RIGHT_FIELD:
        return setRightField != null;
      case SMapDslPackage.FEATURE_MAP__MODULE:
        return module != null;
      case SMapDslPackage.FEATURE_MAP__RULES:
        return rules != null && !rules.isEmpty();
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
    result.append(" (rules: ");
    result.append(rules);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //FeatureMapImpl
