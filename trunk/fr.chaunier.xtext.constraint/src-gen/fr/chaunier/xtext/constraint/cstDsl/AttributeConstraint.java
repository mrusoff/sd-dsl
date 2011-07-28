/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import fr.chaunier.xtext.om.omDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAttributeConstraint()
 * @model
 * @generated
 */
public interface AttributeConstraint extends FeatureConstraint
{
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
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAttributeConstraint_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getConstraint <em>Constraint</em>}' containment reference.
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
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAttributeConstraint_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAttributeConstraint_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // AttributeConstraint
