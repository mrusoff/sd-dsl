/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Annotations;
import fr.chaunier.xtext.omcst.om.omcstDsl.Constraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DataType;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.DataTypeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.DataTypeImpl#getAnno <em>Anno</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends TypeImpl implements DataType
{
  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected Constraint constraint;

  /**
   * The cached value of the '{@link #getAnno() <em>Anno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnno()
   * @generated
   * @ordered
   */
  protected Annotations anno;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return OmcstDslPackage.Literals.DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
  {
    Constraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.DATA_TYPE__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(Constraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.DATA_TYPE__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.DATA_TYPE__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.DATA_TYPE__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotations getAnno()
  {
    return anno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnno(Annotations newAnno, NotificationChain msgs)
  {
    Annotations oldAnno = anno;
    anno = newAnno;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.DATA_TYPE__ANNO, oldAnno, newAnno);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnno(Annotations newAnno)
  {
    if (newAnno != anno)
    {
      NotificationChain msgs = null;
      if (anno != null)
        msgs = ((InternalEObject)anno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.DATA_TYPE__ANNO, null, msgs);
      if (newAnno != null)
        msgs = ((InternalEObject)newAnno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.DATA_TYPE__ANNO, null, msgs);
      msgs = basicSetAnno(newAnno, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.DATA_TYPE__ANNO, newAnno, newAnno));
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
      case OmcstDslPackage.DATA_TYPE__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case OmcstDslPackage.DATA_TYPE__ANNO:
        return basicSetAnno(null, msgs);
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
      case OmcstDslPackage.DATA_TYPE__CONSTRAINT:
        return getConstraint();
      case OmcstDslPackage.DATA_TYPE__ANNO:
        return getAnno();
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
      case OmcstDslPackage.DATA_TYPE__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case OmcstDslPackage.DATA_TYPE__ANNO:
        setAnno((Annotations)newValue);
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
      case OmcstDslPackage.DATA_TYPE__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case OmcstDslPackage.DATA_TYPE__ANNO:
        setAnno((Annotations)null);
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
      case OmcstDslPackage.DATA_TYPE__CONSTRAINT:
        return constraint != null;
      case OmcstDslPackage.DATA_TYPE__ANNO:
        return anno != null;
    }
    return super.eIsSet(featureID);
  }

} //DataTypeImpl
