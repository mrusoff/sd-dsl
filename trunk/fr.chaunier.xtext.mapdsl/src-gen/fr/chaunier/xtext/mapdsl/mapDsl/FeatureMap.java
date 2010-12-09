/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.mapdsl.mapDsl;

import fr.chaunier.xtext.bom.bomDsl.Attribute;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getLeftFields <em>Left Fields</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRightFields <em>Right Fields</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getModule <em>Module</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getRules <em>Rules</em>}</li>
 *   <li>{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap()
 * @model
 * @generated
 */
public interface FeatureMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Fields</b></em>' reference list.
   * The list contents are of type {@link fr.chaunier.xtext.bom.bomDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Fields</em>' reference list.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_LeftFields()
   * @model
   * @generated
   */
  EList<Attribute> getLeftFields();

  /**
   * Returns the value of the '<em><b>Right Fields</b></em>' reference list.
   * The list contents are of type {@link fr.chaunier.xtext.bom.bomDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Fields</em>' reference list.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_RightFields()
   * @model
   * @generated
   */
  EList<Attribute> getRightFields();

  /**
   * Returns the value of the '<em><b>Set Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Left Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Left Field</em>' reference.
   * @see #setSetLeftField(Attribute)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_SetLeftField()
   * @model
   * @generated
   */
  Attribute getSetLeftField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Left Field</em>' reference.
   * @see #getSetLeftField()
   * @generated
   */
  void setSetLeftField(Attribute value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Set Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Right Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Right Field</em>' reference.
   * @see #setSetRightField(Attribute)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_SetRightField()
   * @model
   * @generated
   */
  Attribute getSetRightField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Right Field</em>' reference.
   * @see #getSetRightField()
   * @generated
   */
  void setSetRightField(Attribute value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' reference.
   * @see #setModule(MappingModule)
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_Module()
   * @model
   * @generated
   */
  MappingModule getModule();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(MappingModule value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' attribute list.
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_Rules()
   * @model unique="false"
   * @generated
   */
  EList<String> getRules();

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
   * @see fr.chaunier.xtext.mapdsl.mapDsl.MapDslPackage#getFeatureMap_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.mapdsl.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // FeatureMap
