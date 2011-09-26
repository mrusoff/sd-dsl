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
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getFuctions <em>Fuctions</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getMappingModules <em>Mapping Modules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Model#getRoots <em>Roots</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Model#getName <em>Name</em>}' attribute.
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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Model#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.map.mapDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.map.mapDsl.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>Fuctions</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.map.mapDsl.Fuction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuctions</em>' containment reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Fuctions()
   * @model containment="true"
   * @generated
   */
  EList<Fuction> getFuctions();

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

  /**
   * Returns the value of the '<em><b>Roots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roots</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roots</em>' containment reference.
   * @see #setRoots(RootModule)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getModel_Roots()
   * @model containment="true"
   * @generated
   */
  RootModule getRoots();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Model#getRoots <em>Roots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roots</em>' containment reference.
   * @see #getRoots()
   * @generated
   */
  void setRoots(RootModule value);

} // Model
