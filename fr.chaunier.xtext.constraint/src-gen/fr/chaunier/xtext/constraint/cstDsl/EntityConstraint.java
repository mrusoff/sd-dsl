/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import fr.chaunier.xtext.om.omDsl.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getEntity <em>Entity</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEntityConstraint()
 * @model
 * @generated
 */
public interface EntityConstraint extends AbstractElementConstraint, TypeConstraint
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEntityConstraint_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

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
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEntityConstraint_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getEntityConstraint_Features()
   * @model containment="true"
   * @generated
   */
  EList<FeatureConstraint> getFeatures();

} // EntityConstraint
