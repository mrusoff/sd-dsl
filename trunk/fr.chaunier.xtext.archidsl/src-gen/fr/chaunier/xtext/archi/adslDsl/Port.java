/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsToMany <em>Is To Many</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Port#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.archi.adslDsl.Port#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Mandatory</em>' attribute.
   * @see #setIsMandatory(boolean)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getPort_IsMandatory()
   * @model
   * @generated
   */
  boolean isIsMandatory();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsMandatory <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Mandatory</em>' attribute.
   * @see #isIsMandatory()
   * @generated
   */
  void setIsMandatory(boolean value);

  /**
   * Returns the value of the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is To Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is To Many</em>' attribute.
   * @see #setIsToMany(boolean)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getPort_IsToMany()
   * @model
   * @generated
   */
  boolean isIsToMany();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsToMany <em>Is To Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is To Many</em>' attribute.
   * @see #isIsToMany()
   * @generated
   */
  void setIsToMany(boolean value);

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
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(Interface)
   * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage#getPort_Interface()
   * @model
   * @generated
   */
  Interface getInterface();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.archi.adslDsl.Port#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface value);

} // Port
