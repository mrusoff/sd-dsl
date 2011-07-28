/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;

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
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getFuctionMap <em>Fuction Map</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSource <em>Attribute Source</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeTarget <em>Attribute Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getWithModule <em>With Module</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSources <em>Attribute Sources</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getExpr <em>Expr</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap()
 * @model
 * @generated
 */
public interface FeatureMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Fuction Map</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuction Map</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuction Map</em>' reference.
   * @see #setFuctionMap(Fuction)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_FuctionMap()
   * @model
   * @generated
   */
  Fuction getFuctionMap();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getFuctionMap <em>Fuction Map</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fuction Map</em>' reference.
   * @see #getFuctionMap()
   * @generated
   */
  void setFuctionMap(Fuction value);

  /**
   * Returns the value of the '<em><b>Attribute Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Source</em>' reference.
   * @see #setAttributeSource(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_AttributeSource()
   * @model
   * @generated
   */
  Attribute getAttributeSource();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeSource <em>Attribute Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Source</em>' reference.
   * @see #getAttributeSource()
   * @generated
   */
  void setAttributeSource(Attribute value);

  /**
   * Returns the value of the '<em><b>Attribute Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Target</em>' reference.
   * @see #setAttributeTarget(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_AttributeTarget()
   * @model
   * @generated
   */
  Attribute getAttributeTarget();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getAttributeTarget <em>Attribute Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Target</em>' reference.
   * @see #getAttributeTarget()
   * @generated
   */
  void setAttributeTarget(Attribute value);

  /**
   * Returns the value of the '<em><b>With Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>With Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Module</em>' reference.
   * @see #setWithModule(MappingModule)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_WithModule()
   * @model
   * @generated
   */
  MappingModule getWithModule();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getWithModule <em>With Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Module</em>' reference.
   * @see #getWithModule()
   * @generated
   */
  void setWithModule(MappingModule value);

  /**
   * Returns the value of the '<em><b>Attribute Sources</b></em>' reference list.
   * The list contents are of type {@link fr.chaunier.xtext.omcst.om.omcstDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Sources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Sources</em>' reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_AttributeSources()
   * @model
   * @generated
   */
  EList<Attribute> getAttributeSources();

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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' reference.
   * @see #setRule(Rule)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_Rule()
   * @model
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // FeatureMap
