/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLength <em>Fixe Length</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint()
 * @model
 * @generated
 */
public interface StringConstraint extends Constraint
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Default</em>' attribute.
   * @see #setHasDefault(boolean)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isHasDefault <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Default</em>' attribute.
   * @see #isHasDefault()
   * @generated
   */
  void setHasDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Min Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Length</em>' attribute.
   * @see #setMinLength(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_MinLength()
   * @model
   * @generated
   */
  int getMinLength();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLength <em>Min Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Length</em>' attribute.
   * @see #getMinLength()
   * @generated
   */
  void setMinLength(int value);

  /**
   * Returns the value of the '<em><b>Max Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Length</em>' attribute.
   * @see #setMaxLength(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_MaxLength()
   * @model
   * @generated
   */
  int getMaxLength();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLength <em>Max Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Length</em>' attribute.
   * @see #getMaxLength()
   * @generated
   */
  void setMaxLength(int value);

  /**
   * Returns the value of the '<em><b>Fixe Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixe Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixe Length</em>' attribute.
   * @see #setFixeLength(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_FixeLength()
   * @model
   * @generated
   */
  int getFixeLength();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLength <em>Fixe Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixe Length</em>' attribute.
   * @see #getFixeLength()
   * @generated
   */
  void setFixeLength(int value);

  /**
   * Returns the value of the '<em><b>Regular Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regular Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regular Expression</em>' attribute.
   * @see #setRegularExpression(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_RegularExpression()
   * @model
   * @generated
   */
  String getRegularExpression();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getRegularExpression <em>Regular Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Regular Expression</em>' attribute.
   * @see #getRegularExpression()
   * @generated
   */
  void setRegularExpression(String value);

} // StringConstraint
