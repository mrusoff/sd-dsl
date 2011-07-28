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
 * A representation of the model object '<em><b>Fuction In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInEntity <em>In Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInAttribute <em>In Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionIn()
 * @model
 * @generated
 */
public interface FuctionIn extends EObject
{
  /**
   * Returns the value of the '<em><b>In Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Entity</em>' reference.
   * @see #setInEntity(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionIn_InEntity()
   * @model
   * @generated
   */
  Entity getInEntity();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInEntity <em>In Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Entity</em>' reference.
   * @see #getInEntity()
   * @generated
   */
  void setInEntity(Entity value);

  /**
   * Returns the value of the '<em><b>In Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Attribute</em>' reference.
   * @see #setInAttribute(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFuctionIn_InAttribute()
   * @model
   * @generated
   */
  Attribute getInAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn#getInAttribute <em>In Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Attribute</em>' reference.
   * @see #getInAttribute()
   * @generated
   */
  void setInAttribute(Attribute value);

} // FuctionIn
