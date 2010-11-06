/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getBoolConstraint()
 * @model
 * @generated
 */
public interface BoolConstraint extends Constraint
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getBoolConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Default</em>' attribute.
   * @see #setHasDefault(boolean)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getBoolConstraint_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isHasDefault <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Default</em>' attribute.
   * @see #isHasDefault()
   * @generated
   */
  void setHasDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(boolean)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getBoolConstraint_DefaultValue()
   * @model
   * @generated
   */
  boolean isDefaultValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.BoolConstraint#isDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #isDefaultValue()
   * @generated
   */
  void setDefaultValue(boolean value);

} // BoolConstraint
