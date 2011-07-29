/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getDefaultValueAsString <em>Default Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumConstraint()
 * @model
 * @generated
 */
public interface EnumConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.chaunier.xtext.constraint.cstDsl.EnumUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumUsage
	 * @see #setUsage(EnumUsage)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumConstraint_Usage()
	 * @model
	 * @generated
	 */
	EnumUsage getUsage();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see fr.chaunier.xtext.constraint.cstDsl.EnumUsage
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(EnumUsage value);

	/**
	 * Returns the value of the '<em><b>Fixe Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixe Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixe Len</em>' attribute.
	 * @see #setFixeLen(int)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumConstraint_FixeLen()
	 * @model
	 * @generated
	 */
	int getFixeLen();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getFixeLen <em>Fixe Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixe Len</em>' attribute.
	 * @see #getFixeLen()
	 * @generated
	 */
	void setFixeLen(int value);

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
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumConstraint_HasDefault()
	 * @model
	 * @generated
	 */
	boolean isHasDefault();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#isHasDefault <em>Has Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Default</em>' attribute.
	 * @see #isHasDefault()
	 * @generated
	 */
	void setHasDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value As String</em>' attribute.
	 * @see #setDefaultValueAsString(String)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEnumConstraint_DefaultValueAsString()
	 * @model
	 * @generated
	 */
	String getDefaultValueAsString();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EnumConstraint#getDefaultValueAsString <em>Default Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value As String</em>' attribute.
	 * @see #getDefaultValueAsString()
	 * @generated
	 */
	void setDefaultValueAsString(String value);

} // EnumConstraint
