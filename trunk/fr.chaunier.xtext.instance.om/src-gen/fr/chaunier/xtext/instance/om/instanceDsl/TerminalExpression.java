/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getThis <em>This</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNew <em>New</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getInt <em>Int</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getString <em>String</em>}</li>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression()
 * @model
 * @generated
 */
public interface TerminalExpression extends Value
{
  /**
   * Returns the value of the '<em><b>This</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' containment reference.
   * @see #setThis(This)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression_This()
   * @model containment="true"
   * @generated
   */
  This getThis();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getThis <em>This</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' containment reference.
   * @see #getThis()
   * @generated
   */
  void setThis(This value);

  /**
   * Returns the value of the '<em><b>New</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' containment reference.
   * @see #setNew(New)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression_New()
   * @model containment="true"
   * @generated
   */
  New getNew();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNew <em>New</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' containment reference.
   * @see #getNew()
   * @generated
   */
  void setNew(New value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' containment reference.
   * @see #setInt(Intero)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression_Int()
   * @model containment="true"
   * @generated
   */
  Intero getInt();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getInt <em>Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' containment reference.
   * @see #getInt()
   * @generated
   */
  void setInt(Intero value);

  /**
   * Returns the value of the '<em><b>String</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' containment reference.
   * @see #setString(Stringa)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression_String()
   * @model containment="true"
   * @generated
   */
  Stringa getString();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getString <em>String</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' containment reference.
   * @see #getString()
   * @generated
   */
  void setString(Stringa value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' containment reference.
   * @see #setNull(Nullo)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getTerminalExpression_Null()
   * @model containment="true"
   * @generated
   */
  Nullo getNull();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression#getNull <em>Null</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' containment reference.
   * @see #getNull()
   * @generated
   */
  void setNull(Nullo value);

} // TerminalExpression
