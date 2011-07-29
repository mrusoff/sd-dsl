/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraintRef <em>Constraint Ref</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getStringConstraint()
 * @model
 * @generated
 */
public interface StringConstraint extends Constraint {
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
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getStringConstraint_Constraint()
	 * @model
	 * @generated
	 */
	String getConstraint();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraint <em>Constraint</em>}' attribute.
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
	 * @see #setConstraintRef(AllConstraint)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getStringConstraint_ConstraintRef()
	 * @model containment="true"
	 * @generated
	 */
	AllConstraint getConstraintRef();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getConstraintRef <em>Constraint Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Ref</em>' containment reference.
	 * @see #getConstraintRef()
	 * @generated
	 */
	void setConstraintRef(AllConstraint value);

	/**
	 * Returns the value of the '<em><b>Regular Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regular Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular Expression</em>' attribute.
	 * @see #setRegularExpression(String)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getStringConstraint_RegularExpression()
	 * @model
	 * @generated
	 */
	String getRegularExpression();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regular Expression</em>' attribute.
	 * @see #getRegularExpression()
	 * @generated
	 */
	void setRegularExpression(String value);

} // StringConstraint
