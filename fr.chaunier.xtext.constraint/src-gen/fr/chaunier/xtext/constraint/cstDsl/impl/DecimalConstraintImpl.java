/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint;
import fr.chaunier.xtext.constraint.cstDsl.NumberConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.DecimalConstraintImpl#getConstraintRef <em>Constraint Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalConstraintImpl extends ConstraintImpl implements DecimalConstraint
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
   * The cached value of the '{@link #getConstraintRef() <em>Constraint Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintRef()
   * @generated
   * @ordered
   */
  protected NumberConstraint constraintRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecimalConstraintImpl()
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
    return CstDslPackage.Literals.DECIMAL_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberConstraint getConstraintRef()
  {
    return constraintRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraintRef(NumberConstraint newConstraintRef, NotificationChain msgs)
  {
    NumberConstraint oldConstraintRef = constraintRef;
    constraintRef = newConstraintRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF, oldConstraintRef, newConstraintRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintRef(NumberConstraint newConstraintRef)
  {
    if (newConstraintRef != constraintRef)
    {
      NotificationChain msgs = null;
      if (constraintRef != null)
        msgs = ((InternalEObject)constraintRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF, null, msgs);
      if (newConstraintRef != null)
        msgs = ((InternalEObject)newConstraintRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF, null, msgs);
      msgs = basicSetConstraintRef(newConstraintRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF, newConstraintRef, newConstraintRef));
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
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF:
        return basicSetConstraintRef(null, msgs);
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
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF:
        return getConstraintRef();
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
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF:
        setConstraintRef((NumberConstraint)newValue);
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
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF:
        setConstraintRef((NumberConstraint)null);
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
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case CstDslPackage.DECIMAL_CONSTRAINT__CONSTRAINT_REF:
        return constraintRef != null;
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
    result.append(')');
    return result.toString();
  }

} //DecimalConstraintImpl
