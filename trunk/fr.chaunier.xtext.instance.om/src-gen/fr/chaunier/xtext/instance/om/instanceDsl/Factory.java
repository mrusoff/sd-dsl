/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.instance.om.instanceDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFactory_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(NewObject)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getFactory_Root()
   * @model containment="true"
   * @generated
   */
  NewObject getRoot();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.Factory#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(NewObject value);

} // Factory
