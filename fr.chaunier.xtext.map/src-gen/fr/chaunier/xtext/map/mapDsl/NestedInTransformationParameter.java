/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested In Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getInRefAttribute <em>In Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedInTransformationParameter()
 * @model
 * @generated
 */
public interface NestedInTransformationParameter extends FuctionIn
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(FuctionIn)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedInTransformationParameter_Target()
   * @model containment="true"
   * @generated
   */
  FuctionIn getTarget();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FuctionIn value);

  /**
   * Returns the value of the '<em><b>In Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Ref Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Ref Attribute</em>' reference.
   * @see #setInRefAttribute(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedInTransformationParameter_InRefAttribute()
   * @model
   * @generated
   */
  Attribute getInRefAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter#getInRefAttribute <em>In Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Ref Attribute</em>' reference.
   * @see #getInRefAttribute()
   * @generated
   */
  void setInRefAttribute(Attribute value);

} // NestedInTransformationParameter
