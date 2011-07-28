/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint;
import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint;
import fr.chaunier.xtext.constraint.cstDsl.Import;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Model Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DomainModelConstraintImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelConstraintImpl extends MinimalEObjectImpl.Container implements DomainModelConstraint
{
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
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElementConstraint> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainModelConstraintImpl()
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
    return CstDslPackage.Literals.DOMAIN_MODEL_CONSTRAINT;
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElementConstraint> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElementConstraint>(AbstractElementConstraint.class, this, CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS);
    }
    return elements;
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS:
        return getImports();
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS:
        return getElements();
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElementConstraint>)newValue);
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS:
        getImports().clear();
        return;
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS:
        getElements().clear();
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DomainModelConstraintImpl
