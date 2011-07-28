/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;

import fr.chaunier.xtext.om.omDsl.StructuralFeature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getEFeature <em>EFeature</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#isIsMany <em>Is Many</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>EFeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EFeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EFeature</em>' reference.
   * @see #setEFeature(StructuralFeature)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFeature_EFeature()
   * @model
   * @generated
   */
  StructuralFeature getEFeature();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getEFeature <em>EFeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EFeature</em>' reference.
   * @see #getEFeature()
   * @generated
   */
  void setEFeature(StructuralFeature value);

  /**
   * Returns the value of the '<em><b>Is Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Many</em>' attribute.
   * @see #setIsMany(boolean)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFeature_IsMany()
   * @model
   * @generated
   */
  boolean isIsMany();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#isIsMany <em>Is Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Many</em>' attribute.
   * @see #isIsMany()
   * @generated
   */
  void setIsMany(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFeature_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.Feature#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // Feature
