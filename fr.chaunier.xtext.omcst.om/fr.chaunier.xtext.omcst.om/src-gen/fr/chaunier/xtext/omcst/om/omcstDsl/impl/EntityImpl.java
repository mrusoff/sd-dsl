/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Annotations;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.EntityType;
import fr.chaunier.xtext.omcst.om.omcstDsl.Feature;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.EntityImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.EntityImpl#getAnno <em>Anno</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends TypeImpl implements Entity
{
  /**
   * The default value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected static final EntityType ENTITY_TYPE_EDEFAULT = EntityType.ABSTRACT;

  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected EntityType entityType = ENTITY_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Entity superType;

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
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return OmcstDslPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityType(EntityType newEntityType)
  {
    EntityType oldEntityType = entityType;
    entityType = newEntityType == null ? ENTITY_TYPE_EDEFAULT : newEntityType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ENTITY__ENTITY_TYPE, oldEntityType, entityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Entity)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OmcstDslPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Entity newSuperType)
  {
    Entity oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ENTITY__SUPER_TYPE, oldSuperType, superType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ENTITY__ANNO, oldAnno, newAnno);
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
        msgs = ((InternalEObject)anno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.ENTITY__ANNO, null, msgs);
      if (newAnno != null)
        msgs = ((InternalEObject)newAnno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmcstDslPackage.ENTITY__ANNO, null, msgs);
      msgs = basicSetAnno(newAnno, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ENTITY__ANNO, newAnno, newAnno));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.ENTITY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, OmcstDslPackage.ENTITY__FEATURES);
    }
    return features;
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
      case OmcstDslPackage.ENTITY__ANNO:
        return basicSetAnno(null, msgs);
      case OmcstDslPackage.ENTITY__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case OmcstDslPackage.ENTITY__ENTITY_TYPE:
        return getEntityType();
      case OmcstDslPackage.ENTITY__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case OmcstDslPackage.ENTITY__ANNO:
        return getAnno();
      case OmcstDslPackage.ENTITY__DESCRIPTION:
        return getDescription();
      case OmcstDslPackage.ENTITY__FEATURES:
        return getFeatures();
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
      case OmcstDslPackage.ENTITY__ENTITY_TYPE:
        setEntityType((EntityType)newValue);
        return;
      case OmcstDslPackage.ENTITY__SUPER_TYPE:
        setSuperType((Entity)newValue);
        return;
      case OmcstDslPackage.ENTITY__ANNO:
        setAnno((Annotations)newValue);
        return;
      case OmcstDslPackage.ENTITY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case OmcstDslPackage.ENTITY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
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
      case OmcstDslPackage.ENTITY__ENTITY_TYPE:
        setEntityType(ENTITY_TYPE_EDEFAULT);
        return;
      case OmcstDslPackage.ENTITY__SUPER_TYPE:
        setSuperType((Entity)null);
        return;
      case OmcstDslPackage.ENTITY__ANNO:
        setAnno((Annotations)null);
        return;
      case OmcstDslPackage.ENTITY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case OmcstDslPackage.ENTITY__FEATURES:
        getFeatures().clear();
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
      case OmcstDslPackage.ENTITY__ENTITY_TYPE:
        return entityType != ENTITY_TYPE_EDEFAULT;
      case OmcstDslPackage.ENTITY__SUPER_TYPE:
        return superType != null;
      case OmcstDslPackage.ENTITY__ANNO:
        return anno != null;
      case OmcstDslPackage.ENTITY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case OmcstDslPackage.ENTITY__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(" (entityType: ");
    result.append(entityType);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
