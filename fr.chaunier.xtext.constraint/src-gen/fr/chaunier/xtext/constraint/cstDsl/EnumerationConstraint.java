/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;

import fr.chaunier.xtext.om.omDsl.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getEnumerate <em>Enumerate</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumerationConstraint()
 * @model
 * @generated
 */
public interface EnumerationConstraint extends TypeConstraint {
	/**
	 * Returns the value of the '<em><b>Enumerate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerate</em>' reference.
	 * @see #setEnumerate(Enumeration)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumerationConstraint_Enumerate()
	 * @model
	 * @generated
	 */
	Enumeration getEnumerate();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getEnumerate <em>Enumerate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerate</em>' reference.
	 * @see #getEnumerate()
	 * @generated
	 */
	void setEnumerate(Enumeration value);

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
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumerationConstraint_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

} // EnumerationConstraint
