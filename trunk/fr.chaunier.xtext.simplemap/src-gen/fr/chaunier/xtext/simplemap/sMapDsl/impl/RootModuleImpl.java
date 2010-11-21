/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.simplemap.sMapDsl.MappingModule;
import fr.chaunier.xtext.simplemap.sMapDsl.RootModule;
import fr.chaunier.xtext.simplemap.sMapDsl.SMapDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.RootModuleImpl#getRootRef <em>Root Ref</em>}</li>
 *   <li>{@link fr.chaunier.xtext.simplemap.sMapDsl.impl.RootModuleImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootModuleImpl extends MinimalEObjectImpl.Container implements RootModule
{
  /**
   * The cached value of the '{@link #getRootRef() <em>Root Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootRef()
   * @generated
   * @ordered
   */
  protected MappingModule rootRef;

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
  protected RootModuleImpl()
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
    return SMapDslPackage.Literals.ROOT_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule getRootRef()
  {
    if (rootRef != null && rootRef.eIsProxy())
    {
      InternalEObject oldRootRef = (InternalEObject)rootRef;
      rootRef = (MappingModule)eResolveProxy(oldRootRef);
      if (rootRef != oldRootRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SMapDslPackage.ROOT_MODULE__ROOT_REF, oldRootRef, rootRef));
      }
    }
    return rootRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule basicGetRootRef()
  {
    return rootRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootRef(MappingModule newRootRef)
  {
    MappingModule oldRootRef = rootRef;
    rootRef = newRootRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.ROOT_MODULE__ROOT_REF, oldRootRef, rootRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SMapDslPackage.ROOT_MODULE__DOCUMENTATION, oldDocumentation, documentation));
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
      case SMapDslPackage.ROOT_MODULE__ROOT_REF:
        if (resolve) return getRootRef();
        return basicGetRootRef();
      case SMapDslPackage.ROOT_MODULE__DOCUMENTATION:
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
      case SMapDslPackage.ROOT_MODULE__ROOT_REF:
        setRootRef((MappingModule)newValue);
        return;
      case SMapDslPackage.ROOT_MODULE__DOCUMENTATION:
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
      case SMapDslPackage.ROOT_MODULE__ROOT_REF:
        setRootRef((MappingModule)null);
        return;
      case SMapDslPackage.ROOT_MODULE__DOCUMENTATION:
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
      case SMapDslPackage.ROOT_MODULE__ROOT_REF:
        return rootRef != null;
      case SMapDslPackage.ROOT_MODULE__DOCUMENTATION:
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

} //RootModuleImpl
