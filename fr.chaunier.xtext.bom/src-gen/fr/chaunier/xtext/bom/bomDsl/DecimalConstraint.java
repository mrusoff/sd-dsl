/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getPaddle <em>Paddle</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint()
 * @model
 * @generated
 */
public interface DecimalConstraint extends Constraint
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
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' attribute.
   * @see #setMinValue(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_MinValue()
   * @model
   * @generated
   */
  int getMinValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMinValue <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' attribute.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(int value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute.
   * @see #setMaxValue(int)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_MaxValue()
   * @model
   * @generated
   */
  int getMaxValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxValue <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' attribute.
   * @see #getMaxValue()
   * @generated
   */
  void setMaxValue(int value);

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
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_MaxLen()
   * @model
   * @generated
   */
  int getMaxLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getMaxLen <em>Max Len</em>}' attribute.
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
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_FixeLen()
   * @model
   * @generated
   */
  int getFixeLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getFixeLen <em>Fixe Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixe Len</em>' attribute.
   * @see #getFixeLen()
   * @generated
   */
  void setFixeLen(int value);

  /**
   * Returns the value of the '<em><b>Paddle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paddle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paddle</em>' attribute.
   * @see #setPaddle(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getDecimalConstraint_Paddle()
   * @model
   * @generated
   */
  String getPaddle();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.DecimalConstraint#getPaddle <em>Paddle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paddle</em>' attribute.
   * @see #getPaddle()
   * @generated
   */
  void setPaddle(String value);

} // DecimalConstraint
