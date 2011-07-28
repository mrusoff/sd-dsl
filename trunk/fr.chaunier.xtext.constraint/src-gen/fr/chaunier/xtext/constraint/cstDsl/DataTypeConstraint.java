/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import fr.chaunier.xtext.om.omDsl.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDataTypeConstraint()
 * @model
 * @generated
 */
public interface DataTypeConstraint extends AbstractElementConstraint, TypeConstraint
{
  /**
   * Returns the value of the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' reference.
   * @see #setDataType(DataType)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDataTypeConstraint_DataType()
   * @model
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(Constraint)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDataTypeConstraint_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(Constraint value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDataTypeConstraint_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // DataTypeConstraint
