/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuction Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutEntity <em>Out Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutAttribute <em>Out Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionOut()
 * @model
 * @generated
 */
public interface FuctionOut extends EObject
{
  /**
   * Returns the value of the '<em><b>Out Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Entity</em>' reference.
   * @see #setOutEntity(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionOut_OutEntity()
   * @model
   * @generated
   */
  Entity getOutEntity();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutEntity <em>Out Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Entity</em>' reference.
   * @see #getOutEntity()
   * @generated
   */
  void setOutEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Out Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Attribute</em>' reference.
   * @see #setOutAttribute(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionOut_OutAttribute()
   * @model
   * @generated
   */
  Attribute getOutAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut#getOutAttribute <em>Out Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Attribute</em>' reference.
   * @see #getOutAttribute()
   * @generated
   */
  void setOutAttribute(Attribute value);

} // FuctionOut
