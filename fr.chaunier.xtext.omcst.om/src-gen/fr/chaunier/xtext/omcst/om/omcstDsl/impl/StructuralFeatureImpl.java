/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Annotations;
import fr.chaunier.xtext.omcst.om.omcstDsl.Constraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;
import fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature;
import fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.StructuralFeatureImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.StructuralFeatureImpl#getAnno <em>Anno</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.StructuralFeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.StructuralFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature
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
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeRef type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructuralFeatureImpl()
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
    return OmcstDslPackage.Literals.STRUCTURAL_FEATURE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT, oldConstraint, newConstraint);
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
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT, newConstraint, newConstraint));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__ANNO, oldAnno, newAnno);
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
        msgs = ((InternalEObject)anno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__ANNO, null, msgs);
      if (newAnno != null)
        msgs = ((InternalEObject)newAnno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__ANNO, null, msgs);
      msgs = basicSetAnno(newAnno, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__ANNO, newAnno, newAnno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeRef newType, NotificationChain msgs)
  {
    TypeRef oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeRef newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.STRUCTURAL_FEATURE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.STRUCTURAL_FEATURE__TYPE, newType, newType));
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
      case OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case OmcstDslPackage.STRUCTURAL_FEATURE__ANNO:
        return basicSetAnno(null, msgs);
      case OmcstDslPackage.STRUCTURAL_FEATURE__TYPE:
        return basicSetType(null, msgs);
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
      case OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT:
        return getConstraint();
      case OmcstDslPackage.STRUCTURAL_FEATURE__ANNO:
        return getAnno();
      case OmcstDslPackage.STRUCTURAL_FEATURE__DESCRIPTION:
        return getDescription();
      case OmcstDslPackage.STRUCTURAL_FEATURE__NAME:
        return getName();
      case OmcstDslPackage.STRUCTURAL_FEATURE__TYPE:
        return getType();
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
      case OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__ANNO:
        setAnno((Annotations)newValue);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__NAME:
        setName((String)newValue);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__TYPE:
        setType((TypeRef)newValue);
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
      case OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__ANNO:
        setAnno((Annotations)null);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OmcstDslPackage.STRUCTURAL_FEATURE__TYPE:
        setType((TypeRef)null);
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
      case OmcstDslPackage.STRUCTURAL_FEATURE__CONSTRAINT:
        return constraint != null;
      case OmcstDslPackage.STRUCTURAL_FEATURE__ANNO:
        return anno != null;
      case OmcstDslPackage.STRUCTURAL_FEATURE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OmcstDslPackage.STRUCTURAL_FEATURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OmcstDslPackage.STRUCTURAL_FEATURE__TYPE:
        return type != null;
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
    result.append(" (description: ");
    result.append(description);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StructuralFeatureImpl