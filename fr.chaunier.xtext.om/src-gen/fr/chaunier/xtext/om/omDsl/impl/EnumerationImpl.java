/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl.impl;

import fr.chaunier.xtext.om.omDsl.Enumeration;
import fr.chaunier.xtext.om.omDsl.EnumerationLiteral;
import fr.chaunier.xtext.om.omDsl.OmDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends TypeImpl implements Enumeration
{
  /**
   * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerationLiterals()
   * @generated
   * @ordered
   */
  protected EList<EnumerationLiteral> enumerationLiterals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
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
    return OmDslPackage.Literals.ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumerationLiteral> getEnumerationLiterals()
  {
    if (enumerationLiterals == null)
    {
      enumerationLiterals = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, OmDslPackage.ENUMERATION__ENUMERATION_LITERALS);
    }
    return enumerationLiterals;
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
      case OmDslPackage.ENUMERATION__ENUMERATION_LITERALS:
        return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
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
      case OmDslPackage.ENUMERATION__ENUMERATION_LITERALS:
        return getEnumerationLiterals();
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
      case OmDslPackage.ENUMERATION__ENUMERATION_LITERALS:
        getEnumerationLiterals().clear();
        getEnumerationLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
      case OmDslPackage.ENUMERATION__ENUMERATION_LITERALS:
        getEnumerationLiterals().clear();
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
      case OmDslPackage.ENUMERATION__ENUMERATION_LITERALS:
        return enumerationLiterals != null && !enumerationLiterals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumerationImpl
