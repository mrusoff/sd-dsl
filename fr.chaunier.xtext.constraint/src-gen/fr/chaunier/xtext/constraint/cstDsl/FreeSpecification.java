/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.chaunier.xtext.constraint.cstDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.FreeSpecification#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getFreeSpecification()
 * @model
 * @generated
 */
public interface FreeSpecification extends Specification {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute list.
	 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getFreeSpecification_Lines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLines();

} // FreeSpecification
