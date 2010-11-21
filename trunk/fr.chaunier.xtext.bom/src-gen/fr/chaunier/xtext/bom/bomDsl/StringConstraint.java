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
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLen <em>Min Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isIsXSDAtt <em>Is XSD Att</em>}</li>
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
   * Returns the value of the '<em><b>Is Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fixed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fixed</em>' attribute.
   * @see #setIsFixed(boolean)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_IsFixed()
   * @model
   * @generated
   */
  boolean isIsFixed();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isIsFixed <em>Is Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Fixed</em>' attribute.
   * @see #isIsFixed()
   * @generated
   */
  void setIsFixed(boolean value);

  /**
   * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed Value</em>' attribute.
   * @see #setFixedValue(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

  /**
   * Returns the value of the '<em><b>Min Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Len</em>' attribute.
   * @see #setMinLen(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_MinLen()
   * @model
   * @generated
   */
  int getMinLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMinLen <em>Min Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Len</em>' attribute.
   * @see #getMinLen()
   * @generated
   */
  void setMinLen(int value);

  /**
   * Returns the value of the '<em><b>Max Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Len</em>' attribute.
   * @see #setMaxLen(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_MaxLen()
   * @model
   * @generated
   */
  int getMaxLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getMaxLen <em>Max Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Len</em>' attribute.
   * @see #getMaxLen()
   * @generated
   */
  void setMaxLen(int value);

  /**
   * Returns the value of the '<em><b>Fixe Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixe Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixe Len</em>' attribute.
   * @see #setFixeLen(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_FixeLen()
   * @model
   * @generated
   */
  int getFixeLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#getFixeLen <em>Fixe Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixe Len</em>' attribute.
   * @see #getFixeLen()
   * @generated
   */
  void setFixeLen(int value);

  /**
   * Returns the value of the '<em><b>Is XSD Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is XSD Att</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is XSD Att</em>' attribute.
   * @see #setIsXSDAtt(boolean)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getStringConstraint_IsXSDAtt()
   * @model
   * @generated
   */
  boolean isIsXSDAtt();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.StringConstraint#isIsXSDAtt <em>Is XSD Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is XSD Att</em>' attribute.
   * @see #isIsXSDAtt()
   * @generated
   */
  void setIsXSDAtt(boolean value);

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
