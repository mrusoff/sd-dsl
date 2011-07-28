/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.TypeRef#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.TypeRef#isMulti <em>Multi</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.TypeRef#isOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Referenced</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced</em>' reference.
   * @see #setReferenced(Type)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getTypeRef_Referenced()
   * @model
   * @generated
   */
  Type getReferenced();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.TypeRef#getReferenced <em>Referenced</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced</em>' reference.
   * @see #getReferenced()
   * @generated
   */
  void setReferenced(Type value);

  /**
   * Returns the value of the '<em><b>Multi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' attribute.
   * @see #setMulti(boolean)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getTypeRef_Multi()
   * @model
   * @generated
   */
  boolean isMulti();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.TypeRef#isMulti <em>Multi</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi</em>' attribute.
   * @see #isMulti()
   * @generated
   */
  void setMulti(boolean value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(boolean)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getTypeRef_Option()
   * @model
   * @generated
   */
  boolean isOption();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.TypeRef#isOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #isOption()
   * @generated
   */
  void setOption(boolean value);

} // TypeRef
