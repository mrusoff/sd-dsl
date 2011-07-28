/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Transformation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getRefAttribute <em>Ref Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedTransformationParameter()
 * @model
 * @generated
 */
public interface NestedTransformationParameter extends FeatureMap
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
   * @see #setTarget(FeatureMap)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedTransformationParameter_Target()
   * @model containment="true"
   * @generated
   */
  FeatureMap getTarget();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FeatureMap value);

  /**
   * Returns the value of the '<em><b>Ref Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Attribute</em>' reference.
   * @see #setRefAttribute(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getNestedTransformationParameter_RefAttribute()
   * @model
   * @generated
   */
  Attribute getRefAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter#getRefAttribute <em>Ref Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Attribute</em>' reference.
   * @see #getRefAttribute()
   * @generated
   */
  void setRefAttribute(Attribute value);

} // NestedTransformationParameter
