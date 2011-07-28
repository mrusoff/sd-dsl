/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.AllConstraint;
import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.StringConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl#getConstraintRef <em>Constraint Ref</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.StringConstraintImpl#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringConstraintImpl extends ConstraintImpl implements StringConstraint
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
  protected AllConstraint constraintRef;

  /**
   * The default value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularExpression()
   * @generated
   * @ordered
   */
  protected static final String REGULAR_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegularExpression()
   * @generated
   * @ordered
   */
  protected String regularExpression = REGULAR_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringConstraintImpl()
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
    return CstDslPackage.Literals.STRING_CONSTRAINT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.STRING_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllConstraint getConstraintRef()
  {
    return constraintRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraintRef(AllConstraint newConstraintRef, NotificationChain msgs)
  {
    AllConstraint oldConstraintRef = constraintRef;
    constraintRef = newConstraintRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF, oldConstraintRef, newConstraintRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintRef(AllConstraint newConstraintRef)
  {
    if (newConstraintRef != constraintRef)
    {
      NotificationChain msgs = null;
      if (constraintRef != null)
        msgs = ((InternalEObject)constraintRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF, null, msgs);
      if (newConstraintRef != null)
        msgs = ((InternalEObject)newConstraintRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF, null, msgs);
      msgs = basicSetConstraintRef(newConstraintRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF, newConstraintRef, newConstraintRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegularExpression()
  {
    return regularExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegularExpression(String newRegularExpression)
  {
    String oldRegularExpression = regularExpression;
    regularExpression = newRegularExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
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
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF:
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
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF:
        return getConstraintRef();
      case CstDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        return getRegularExpression();
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
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF:
        setConstraintRef((AllConstraint)newValue);
        return;
      case CstDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        setRegularExpression((String)newValue);
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
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF:
        setConstraintRef((AllConstraint)null);
        return;
      case CstDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        setRegularExpression(REGULAR_EXPRESSION_EDEFAULT);
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
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case CstDslPackage.STRING_CONSTRAINT__CONSTRAINT_REF:
        return constraintRef != null;
      case CstDslPackage.STRING_CONSTRAINT__REGULAR_EXPRESSION:
        return REGULAR_EXPRESSION_EDEFAULT == null ? regularExpression != null : !REGULAR_EXPRESSION_EDEFAULT.equals(regularExpression);
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
    result.append(", regularExpression: ");
    result.append(regularExpression);
    result.append(')');
    return result.toString();
  }

} //StringConstraintImpl
