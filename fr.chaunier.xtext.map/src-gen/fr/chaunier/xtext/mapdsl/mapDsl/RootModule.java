/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.mapdsl.mapDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getRootRef <em>Root Ref</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getRootModule()
 * @model
 * @generated
 */
public interface RootModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Root Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Ref</em>' reference.
   * @see #setRootRef(MappingModule)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getRootModule_RootRef()
   * @model
   * @generated
   */
  MappingModule getRootRef();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getRootRef <em>Root Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Ref</em>' reference.
   * @see #getRootRef()
   * @generated
   */
  void setRootRef(MappingModule value);

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
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getRootModule_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.RootModule#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // RootModule
