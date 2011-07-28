/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Out Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getOutRefAttribute <em>Out Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedOutTransformationParameter()
 * @model
 * @generated
 */
public interface NestedOutTransformationParameter extends FuctionOut
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
   * @see #setTarget(FuctionOut)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedOutTransformationParameter_Target()
   * @model containment="true"
   * @generated
   */
  FuctionOut getTarget();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FuctionOut value);

  /**
   * Returns the value of the '<em><b>Out Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Ref Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Ref Attribute</em>' reference.
   * @see #setOutRefAttribute(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedOutTransformationParameter_OutRefAttribute()
   * @model
   * @generated
   */
  Attribute getOutRefAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter#getOutRefAttribute <em>Out Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Ref Attribute</em>' reference.
   * @see #getOutRefAttribute()
   * @generated
   */
  void setOutRefAttribute(Attribute value);

} // NestedOutTransformationParameter
