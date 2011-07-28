/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.Expression;
import fr.chaunier.xtext.map.mapDsl.FeatureMap;
import fr.chaunier.xtext.map.mapDsl.Fuction;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.MappingModule;
import fr.chaunier.xtext.map.mapDsl.Rule;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getFuctionMap <em>Fuction Map</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getAttributeSource <em>Attribute Source</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getAttributeTarget <em>Attribute Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getWithModule <em>With Module</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getAttributeSources <em>Attribute Sources</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.FeatureMapImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMapImpl extends MinimalEObjectImpl.Container implements FeatureMap
{
  /**
   * The cached value of the '{@link #getFuctionMap() <em>Fuction Map</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuctionMap()
   * @generated
   * @ordered
   */
  protected Fuction fuctionMap;

  /**
   * The cached value of the '{@link #getAttributeSource() <em>Attribute Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeSource()
   * @generated
   * @ordered
   */
  protected Attribute attributeSource;

  /**
   * The cached value of the '{@link #getAttributeTarget() <em>Attribute Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeTarget()
   * @generated
   * @ordered
   */
  protected Attribute attributeTarget;

  /**
   * The cached value of the '{@link #getWithModule() <em>With Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithModule()
   * @generated
   * @ordered
   */
  protected MappingModule withModule;

  /**
   * The cached value of the '{@link #getAttributeSources() <em>Attribute Sources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeSources()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributeSources;

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
   * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRule()
   * @generated
   * @ordered
   */
  protected Rule rule;

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
    return MapDslPackage.Literals.FEATURE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fuction getFuctionMap()
  {
    if (fuctionMap != null && fuctionMap.eIsProxy())
    {
      InternalEObject oldFuctionMap = (InternalEObject)fuctionMap;
      fuctionMap = (Fuction)eResolveProxy(oldFuctionMap);
      if (fuctionMap != oldFuctionMap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FEATURE_MAP__FUCTION_MAP, oldFuctionMap, fuctionMap));
      }
    }
    return fuctionMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fuction basicGetFuctionMap()
  {
    return fuctionMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuctionMap(Fuction newFuctionMap)
  {
    Fuction oldFuctionMap = fuctionMap;
    fuctionMap = newFuctionMap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__FUCTION_MAP, oldFuctionMap, fuctionMap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributeSource()
  {
    if (attributeSource != null && attributeSource.eIsProxy())
    {
      InternalEObject oldAttributeSource = (InternalEObject)attributeSource;
      attributeSource = (Attribute)eResolveProxy(oldAttributeSource);
      if (attributeSource != oldAttributeSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE, oldAttributeSource, attributeSource));
      }
    }
    return attributeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttributeSource()
  {
    return attributeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeSource(Attribute newAttributeSource)
  {
    Attribute oldAttributeSource = attributeSource;
    attributeSource = newAttributeSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE, oldAttributeSource, attributeSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributeTarget()
  {
    if (attributeTarget != null && attributeTarget.eIsProxy())
    {
      InternalEObject oldAttributeTarget = (InternalEObject)attributeTarget;
      attributeTarget = (Attribute)eResolveProxy(oldAttributeTarget);
      if (attributeTarget != oldAttributeTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET, oldAttributeTarget, attributeTarget));
      }
    }
    return attributeTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttributeTarget()
  {
    return attributeTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeTarget(Attribute newAttributeTarget)
  {
    Attribute oldAttributeTarget = attributeTarget;
    attributeTarget = newAttributeTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET, oldAttributeTarget, attributeTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule getWithModule()
  {
    if (withModule != null && withModule.eIsProxy())
    {
      InternalEObject oldWithModule = (InternalEObject)withModule;
      withModule = (MappingModule)eResolveProxy(oldWithModule);
      if (withModule != oldWithModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FEATURE_MAP__WITH_MODULE, oldWithModule, withModule));
      }
    }
    return withModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule basicGetWithModule()
  {
    return withModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWithModule(MappingModule newWithModule)
  {
    MappingModule oldWithModule = withModule;
    withModule = newWithModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__WITH_MODULE, oldWithModule, withModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributeSources()
  {
    if (attributeSources == null)
    {
      attributeSources = new EObjectResolvingEList<Attribute>(Attribute.class, this, MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCES);
    }
    return attributeSources;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.FEATURE_MAP__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.FEATURE_MAP__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule getRule()
  {
    if (rule != null && rule.eIsProxy())
    {
      InternalEObject oldRule = (InternalEObject)rule;
      rule = (Rule)eResolveProxy(oldRule);
      if (rule != oldRule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.FEATURE_MAP__RULE, oldRule, rule));
      }
    }
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule basicGetRule()
  {
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRule(Rule newRule)
  {
    Rule oldRule = rule;
    rule = newRule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__RULE, oldRule, rule));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.FEATURE_MAP__DOCUMENTATION, oldDocumentation, documentation));
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
      case MapDslPackage.FEATURE_MAP__EXPR:
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
      case MapDslPackage.FEATURE_MAP__FUCTION_MAP:
        if (resolve) return getFuctionMap();
        return basicGetFuctionMap();
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE:
        if (resolve) return getAttributeSource();
        return basicGetAttributeSource();
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET:
        if (resolve) return getAttributeTarget();
        return basicGetAttributeTarget();
      case MapDslPackage.FEATURE_MAP__WITH_MODULE:
        if (resolve) return getWithModule();
        return basicGetWithModule();
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCES:
        return getAttributeSources();
      case MapDslPackage.FEATURE_MAP__EXPR:
        return getExpr();
      case MapDslPackage.FEATURE_MAP__RULE:
        if (resolve) return getRule();
        return basicGetRule();
      case MapDslPackage.FEATURE_MAP__DOCUMENTATION:
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
      case MapDslPackage.FEATURE_MAP__FUCTION_MAP:
        setFuctionMap((Fuction)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE:
        setAttributeSource((Attribute)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET:
        setAttributeTarget((Attribute)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__WITH_MODULE:
        setWithModule((MappingModule)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCES:
        getAttributeSources().clear();
        getAttributeSources().addAll((Collection<? extends Attribute>)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__EXPR:
        setExpr((Expression)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__RULE:
        setRule((Rule)newValue);
        return;
      case MapDslPackage.FEATURE_MAP__DOCUMENTATION:
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
      case MapDslPackage.FEATURE_MAP__FUCTION_MAP:
        setFuctionMap((Fuction)null);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE:
        setAttributeSource((Attribute)null);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET:
        setAttributeTarget((Attribute)null);
        return;
      case MapDslPackage.FEATURE_MAP__WITH_MODULE:
        setWithModule((MappingModule)null);
        return;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCES:
        getAttributeSources().clear();
        return;
      case MapDslPackage.FEATURE_MAP__EXPR:
        setExpr((Expression)null);
        return;
      case MapDslPackage.FEATURE_MAP__RULE:
        setRule((Rule)null);
        return;
      case MapDslPackage.FEATURE_MAP__DOCUMENTATION:
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
      case MapDslPackage.FEATURE_MAP__FUCTION_MAP:
        return fuctionMap != null;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCE:
        return attributeSource != null;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_TARGET:
        return attributeTarget != null;
      case MapDslPackage.FEATURE_MAP__WITH_MODULE:
        return withModule != null;
      case MapDslPackage.FEATURE_MAP__ATTRIBUTE_SOURCES:
        return attributeSources != null && !attributeSources.isEmpty();
      case MapDslPackage.FEATURE_MAP__EXPR:
        return expr != null;
      case MapDslPackage.FEATURE_MAP__RULE:
        return rule != null;
      case MapDslPackage.FEATURE_MAP__DOCUMENTATION:
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
    result.append(" (documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //FeatureMapImpl
