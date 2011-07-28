/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraintRef <em>Constraint Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getIntegerConstraint()
 * @model
 * @generated
 */
public interface IntegerConstraint extends Constraint
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
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getIntegerConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Constraint Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint Ref</em>' containment reference.
   * @see #setConstraintRef(NumberConstraint)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getIntegerConstraint_ConstraintRef()
   * @model containment="true"
   * @generated
   */
  NumberConstraint getConstraintRef();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.IntegerConstraint#getConstraintRef <em>Constraint Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint Ref</em>' containment reference.
   * @see #getConstraintRef()
   * @generated
   */
  void setConstraintRef(NumberConstraint value);

} // IntegerConstraint
