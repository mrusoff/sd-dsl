/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;
import fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xsd Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.impl.XsdElementImpl#getXsdElement <em>Xsd Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XsdElementImpl extends AbstractElementImpl implements XsdElement
{
  /**
   * The cached value of the '{@link #getXsdElement() <em>Xsd Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXsdElement()
   * @generated
   * @ordered
   */
  protected Entity xsdElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XsdElementImpl()
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
    return OmcstDslPackage.Literals.XSD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getXsdElement()
  {
    if (xsdElement != null && xsdElement.eIsProxy())
    {
      InternalEObject oldXsdElement = (InternalEObject)xsdElement;
      xsdElement = (Entity)eResolveProxy(oldXsdElement);
      if (xsdElement != oldXsdElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT, oldXsdElement, xsdElement));
      }
    }
    return xsdElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetXsdElement()
  {
    return xsdElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXsdElement(Entity newXsdElement)
  {
    Entity oldXsdElement = xsdElement;
    xsdElement = newXsdElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT, oldXsdElement, xsdElement));
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
      case OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT:
        if (resolve) return getXsdElement();
        return basicGetXsdElement();
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
      case OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT:
        setXsdElement((Entity)newValue);
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
      case OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT:
        setXsdElement((Entity)null);
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
      case OmcstDslPackage.XSD_ELEMENT__XSD_ELEMENT:
        return xsdElement != null;
    }
    return super.eIsSet(featureID);
  }

} //XsdElementImpl
