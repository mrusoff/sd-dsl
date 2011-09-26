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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.System#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.System#getUsings <em>Usings</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.System#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.System#getComponents <em>Components</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.System#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
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
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Usings</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.Using}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usings</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem_Usings()
   * @model containment="true"
   * @generated
   */
  EList<Using> getUsings();

  /**
   * Returns the value of the '<em><b>Sub Systems</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Systems</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem_SubSystems()
   * @model containment="true"
   * @generated
   */
  EList<System> getSubSystems();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.archi.adslDsl.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getSystem_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterfaces();

} // System
