/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeRef)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

} // Parameter