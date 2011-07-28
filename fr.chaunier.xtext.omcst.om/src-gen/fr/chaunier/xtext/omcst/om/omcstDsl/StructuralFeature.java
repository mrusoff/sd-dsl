/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getAnno <em>Anno</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature()
 * @model
 * @generated
 */
public interface StructuralFeature extends Feature
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(Constraint)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature_Constraint()
   * @model containment="true"
   * @generated
   */
  Constraint getConstraint();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(Constraint value);

  /**
   * Returns the value of the '<em><b>Anno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anno</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anno</em>' containment reference.
   * @see #setAnno(Annotations)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature_Anno()
   * @model containment="true"
   * @generated
   */
  Annotations getAnno();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getAnno <em>Anno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anno</em>' containment reference.
   * @see #getAnno()
   * @generated
   */
  void setAnno(Annotations value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getName <em>Name</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getStructuralFeature_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

} // StructuralFeature
