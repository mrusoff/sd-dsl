/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDomainModelConstraint()
 * @model
 * @generated
 */
public interface DomainModelConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.constraint.cstDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDomainModelConstraint_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getDomainModelConstraint_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElementConstraint> getElements();

} // DomainModelConstraint
