/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archi Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getArchiModel()
 * @model
 * @generated
 */
public interface ArchiModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getArchiModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getArchiModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<fr.chaunier.xtext.archi.adslDsl.System> getElements();

} // ArchiModel
