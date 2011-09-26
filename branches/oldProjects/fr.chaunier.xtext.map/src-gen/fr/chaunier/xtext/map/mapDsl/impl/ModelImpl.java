/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.Fuction;
import fr.chaunier.xtext.map.mapDsl.Import;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.MappingModule;
import fr.chaunier.xtext.map.mapDsl.Model;
import fr.chaunier.xtext.map.mapDsl.RootModule;
import fr.chaunier.xtext.map.mapDsl.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getFuctions <em>Fuctions</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getMappingModules <em>Mapping Modules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.impl.ModelImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getFuctions() <em>Fuctions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuctions()
   * @generated
   * @ordered
   */
  protected EList<Fuction> fuctions;

  /**
   * The cached value of the '{@link #getMappingModules() <em>Mapping Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingModules()
   * @generated
   * @ordered
   */
  protected EList<MappingModule> mappingModules;

  /**
   * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoots()
   * @generated
   * @ordered
   */
  protected RootModule roots;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MapDslPackage.Literals.MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MODEL__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MODEL__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MapDslPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, MapDslPackage.MODEL__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fuction> getFuctions()
  {
    if (fuctions == null)
    {
      fuctions = new EObjectContainmentEList<Fuction>(Fuction.class, this, MapDslPackage.MODEL__FUCTIONS);
    }
    return fuctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MappingModule> getMappingModules()
  {
    if (mappingModules == null)
    {
      mappingModules = new EObjectContainmentEList<MappingModule>(MappingModule.class, this, MapDslPackage.MODEL__MAPPING_MODULES);
    }
    return mappingModules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootModule getRoots()
  {
    return roots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoots(RootModule newRoots, NotificationChain msgs)
  {
    RootModule oldRoots = roots;
    roots = newRoots;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapDslPackage.MODEL__ROOTS, oldRoots, newRoots);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoots(RootModule newRoots)
  {
    if (newRoots != roots)
    {
      NotificationChain msgs = null;
      if (roots != null)
        msgs = ((InternalEObject)roots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.MODEL__ROOTS, null, msgs);
      if (newRoots != null)
        msgs = ((InternalEObject)newRoots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MapDslPackage.MODEL__ROOTS, null, msgs);
      msgs = basicSetRoots(newRoots, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MODEL__ROOTS, newRoots, newRoots));
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
      case MapDslPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MapDslPackage.MODEL__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case MapDslPackage.MODEL__FUCTIONS:
        return ((InternalEList<?>)getFuctions()).basicRemove(otherEnd, msgs);
      case MapDslPackage.MODEL__MAPPING_MODULES:
        return ((InternalEList<?>)getMappingModules()).basicRemove(otherEnd, msgs);
      case MapDslPackage.MODEL__ROOTS:
        return basicSetRoots(null, msgs);
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
      case MapDslPackage.MODEL__NAME:
        return getName();
      case MapDslPackage.MODEL__DOCUMENTATION:
        return getDocumentation();
      case MapDslPackage.MODEL__IMPORTS:
        return getImports();
      case MapDslPackage.MODEL__RULES:
        return getRules();
      case MapDslPackage.MODEL__FUCTIONS:
        return getFuctions();
      case MapDslPackage.MODEL__MAPPING_MODULES:
        return getMappingModules();
      case MapDslPackage.MODEL__ROOTS:
        return getRoots();
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
      case MapDslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case MapDslPackage.MODEL__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case MapDslPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MapDslPackage.MODEL__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case MapDslPackage.MODEL__FUCTIONS:
        getFuctions().clear();
        getFuctions().addAll((Collection<? extends Fuction>)newValue);
        return;
      case MapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
        getMappingModules().addAll((Collection<? extends MappingModule>)newValue);
        return;
      case MapDslPackage.MODEL__ROOTS:
        setRoots((RootModule)newValue);
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
      case MapDslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MapDslPackage.MODEL__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case MapDslPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case MapDslPackage.MODEL__RULES:
        getRules().clear();
        return;
      case MapDslPackage.MODEL__FUCTIONS:
        getFuctions().clear();
        return;
      case MapDslPackage.MODEL__MAPPING_MODULES:
        getMappingModules().clear();
        return;
      case MapDslPackage.MODEL__ROOTS:
        setRoots((RootModule)null);
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
      case MapDslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MapDslPackage.MODEL__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case MapDslPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MapDslPackage.MODEL__RULES:
        return rules != null && !rules.isEmpty();
      case MapDslPackage.MODEL__FUCTIONS:
        return fuctions != null && !fuctions.isEmpty();
      case MapDslPackage.MODEL__MAPPING_MODULES:
        return mappingModules != null && !mappingModules.isEmpty();
      case MapDslPackage.MODEL__ROOTS:
        return roots != null;
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
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
