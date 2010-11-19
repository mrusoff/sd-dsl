/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getMappingModules <em>Mapping Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Mapping Modules</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.map.mapDsl.MappingModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Modules</em>' containment reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_MappingModules()
   * @model containment="true"
   * @generated
   */
  EList<MappingModule> getMappingModules();

} // Model
