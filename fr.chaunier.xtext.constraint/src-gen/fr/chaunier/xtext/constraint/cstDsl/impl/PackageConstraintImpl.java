/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.cstDsl.TypeConstraint;

import fr.chaunier.xtext.om.omDsl.PackageDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.PackageConstraintImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageConstraintImpl extends AbstractElementConstraintImpl implements PackageConstraint
{
  /**
   * The cached value of the '{@link #getPackageDeclaration() <em>Package Declaration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageDeclaration()
   * @generated
   * @ordered
   */
  protected PackageDeclaration packageDeclaration;

  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeConstraint> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageConstraintImpl()
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
    return CstDslPackage.Literals.PACKAGE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration getPackageDeclaration()
  {
    if (packageDeclaration != null && packageDeclaration.eIsProxy())
    {
      InternalEObject oldPackageDeclaration = (InternalEObject)packageDeclaration;
      packageDeclaration = (PackageDeclaration)eResolveProxy(oldPackageDeclaration);
      if (packageDeclaration != oldPackageDeclaration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION, oldPackageDeclaration, packageDeclaration));
      }
    }
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration basicGetPackageDeclaration()
  {
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageDeclaration(PackageDeclaration newPackageDeclaration)
  {
    PackageDeclaration oldPackageDeclaration = packageDeclaration;
    packageDeclaration = newPackageDeclaration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION, oldPackageDeclaration, packageDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.PACKAGE_CONSTRAINT__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.PACKAGE_CONSTRAINT__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeConstraint> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<TypeConstraint>(TypeConstraint.class, this, CstDslPackage.PACKAGE_CONSTRAINT__TYPES);
    }
    return types;
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
      case CstDslPackage.PACKAGE_CONSTRAINT__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
      case CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION:
        if (resolve) return getPackageDeclaration();
        return basicGetPackageDeclaration();
      case CstDslPackage.PACKAGE_CONSTRAINT__PREFIX:
        return getPrefix();
      case CstDslPackage.PACKAGE_CONSTRAINT__NAMESPACE:
        return getNamespace();
      case CstDslPackage.PACKAGE_CONSTRAINT__TYPES:
        return getTypes();
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
      case CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION:
        setPackageDeclaration((PackageDeclaration)newValue);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__PREFIX:
        setPrefix((String)newValue);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeConstraint>)newValue);
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
      case CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION:
        setPackageDeclaration((PackageDeclaration)null);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case CstDslPackage.PACKAGE_CONSTRAINT__TYPES:
        getTypes().clear();
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
      case CstDslPackage.PACKAGE_CONSTRAINT__PACKAGE_DECLARATION:
        return packageDeclaration != null;
      case CstDslPackage.PACKAGE_CONSTRAINT__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case CstDslPackage.PACKAGE_CONSTRAINT__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case CstDslPackage.PACKAGE_CONSTRAINT__TYPES:
        return types != null && !types.isEmpty();
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
    result.append(" (prefix: ");
    result.append(prefix);
    result.append(", namespace: ");
    result.append(namespace);
    result.append(')');
    return result.toString();
  }

} //PackageConstraintImpl
