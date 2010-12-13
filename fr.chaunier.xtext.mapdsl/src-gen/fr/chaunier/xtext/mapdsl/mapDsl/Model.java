/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.mapdsl.mapDsl;

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
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getMappingModules <em>Mapping Modules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getModel_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.Model#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Mapping Modules</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.mapdsl.mapDsl.MappingModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping Modules</em>' containment reference list.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getModel_MappingModules()
   * @model containment="true"
   * @generated
   */
  EList<MappingModule> getMappingModules();

  /**
   * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roots</em>' containment reference list.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getModel_Roots()
   * @model containment="true"
   * @generated
   */
  EList<RootModule> getRoots();

} // Model