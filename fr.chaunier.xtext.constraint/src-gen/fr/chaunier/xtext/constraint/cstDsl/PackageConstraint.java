/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;

import fr.chaunier.xtext.om.omDsl.PackageDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getPackageConstraint()
 * @model
 * @generated
 */
public interface PackageConstraint extends AbstractElementConstraint {
	/**
	 * Returns the value of the '<em><b>Package Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Declaration</em>' reference.
	 * @see #setPackageDeclaration(PackageDeclaration)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getPackageConstraint_PackageDeclaration()
	 * @model
	 * @generated
	 */
	PackageDeclaration getPackageDeclaration();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPackageDeclaration <em>Package Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Declaration</em>' reference.
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	void setPackageDeclaration(PackageDeclaration value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getPackageConstraint_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getPackageConstraint_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.chaunier.xtext.constraint.cstDsl.TypeConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getPackageConstraint_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeConstraint> getTypes();

} // PackageConstraint
