/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslFactory
 * @model kind="package"
 * @generated
 */
public interface AdslDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adslDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.chaunier.fr/xtext/archi/AdslDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adslDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdslDslPackage eINSTANCE = fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ArchiModelImpl <em>Archi Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.ArchiModelImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getArchiModel()
   * @generated
   */
  int ARCHI_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHI_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHI_MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Archi Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHI_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.ImportImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__USINGS = 1;

  /**
   * The feature id for the '<em><b>Sub Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SUB_SYSTEMS = 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__COMPONENTS = 3;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__INTERFACES = 4;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.UsingImpl <em>Using</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.UsingImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getUsing()
   * @generated
   */
  int USING = 3;

  /**
   * The feature id for the '<em><b>System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING__SYSTEM = 0;

  /**
   * The number of structural features of the '<em>Using</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.ComponentImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.PortImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getPort()
   * @generated
   */
  int PORT = 5;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__IS_MANDATORY = 0;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__IS_TO_MANY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 2;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__INTERFACE = 3;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.ProvidedPortImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getProvidedPort()
   * @generated
   */
  int PROVIDED_PORT = 6;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__IS_MANDATORY = PORT__IS_MANDATORY;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__IS_TO_MANY = PORT__IS_TO_MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__INTERFACE = PORT__INTERFACE;

  /**
   * The number of structural features of the '<em>Provided Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.RequiredPortImpl <em>Required Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.RequiredPortImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getRequiredPort()
   * @generated
   */
  int REQUIRED_PORT = 7;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__IS_MANDATORY = PORT__IS_MANDATORY;

  /**
   * The feature id for the '<em><b>Is To Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__IS_TO_MANY = PORT__IS_TO_MANY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__INTERFACE = PORT__INTERFACE;

  /**
   * The number of structural features of the '<em>Required Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.InterfaceImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__INTERACTIONS = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageInteractionImpl <em>Message Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageInteractionImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessageInteraction()
   * @generated
   */
  int MESSAGE_INTERACTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INTERACTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Message Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_INTERACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.OnewayInteractionImpl <em>Oneway Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.OnewayInteractionImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getOnewayInteraction()
   * @generated
   */
  int ONEWAY_INTERACTION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEWAY_INTERACTION__NAME = MESSAGE_INTERACTION__NAME;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEWAY_INTERACTION__MESSAGE = MESSAGE_INTERACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Oneway Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONEWAY_INTERACTION_FEATURE_COUNT = MESSAGE_INTERACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl <em>Request Reply Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getRequestReplyInteraction()
   * @generated
   */
  int REQUEST_REPLY_INTERACTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_REPLY_INTERACTION__NAME = MESSAGE_INTERACTION__NAME;

  /**
   * The feature id for the '<em><b>Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_REPLY_INTERACTION__REQUEST = MESSAGE_INTERACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reply</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_REPLY_INTERACTION__REPLY = MESSAGE_INTERACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Request Reply Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_REPLY_INTERACTION_FEATURE_COUNT = MESSAGE_INTERACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 12;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl <em>Message Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl
   * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessageParameter()
   * @generated
   */
  int MESSAGE_PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Typeref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAMETER__TYPEREF = 1;

  /**
   * The number of structural features of the '<em>Message Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAMETER_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel <em>Archi Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Archi Model</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.ArchiModel
   * @generated
   */
  EClass getArchiModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.ArchiModel#getImports()
   * @see #getArchiModel()
   * @generated
   */
  EReference getArchiModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.ArchiModel#getElements()
   * @see #getArchiModel()
   * @generated
   */
  EReference getArchiModel_Elements();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.System#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System#getUsings()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.System#getSubSystems <em>Sub Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Systems</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System#getSubSystems()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_SubSystems();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.System#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System#getComponents()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Components();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.System#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.System#getInterfaces()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Interfaces();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Using
   * @generated
   */
  EClass getUsing();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.archi.adslDsl.Using#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>System</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Using#getSystem()
   * @see #getUsing()
   * @generated
   */
  EReference getUsing_System();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsMandatory <em>Is Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Mandatory</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Port#isIsMandatory()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_IsMandatory();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Port#isIsToMany <em>Is To Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is To Many</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Port#isIsToMany()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_IsToMany();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.archi.adslDsl.Port#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Port#getInterface()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Interface();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Port</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.ProvidedPort
   * @generated
   */
  EClass getProvidedPort();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Port</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.RequiredPort
   * @generated
   */
  EClass getRequiredPort();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.Interface#getInteractions <em>Interactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactions</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Interface#getInteractions()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Interactions();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.MessageInteraction <em>Message Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Interaction</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageInteraction
   * @generated
   */
  EClass getMessageInteraction();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.MessageInteraction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageInteraction#getName()
   * @see #getMessageInteraction()
   * @generated
   */
  EAttribute getMessageInteraction_Name();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.OnewayInteraction <em>Oneway Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Oneway Interaction</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.OnewayInteraction
   * @generated
   */
  EClass getOnewayInteraction();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.archi.adslDsl.OnewayInteraction#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.OnewayInteraction#getMessage()
   * @see #getOnewayInteraction()
   * @generated
   */
  EReference getOnewayInteraction_Message();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction <em>Request Reply Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request Reply Interaction</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction
   * @generated
   */
  EClass getRequestReplyInteraction();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getRequest <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getRequest()
   * @see #getRequestReplyInteraction()
   * @generated
   */
  EReference getRequestReplyInteraction_Request();

  /**
   * Returns the meta object for the containment reference '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getReply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reply</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction#getReply()
   * @see #getRequestReplyInteraction()
   * @generated
   */
  EReference getRequestReplyInteraction_Reply();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference list '{@link fr.chaunier.xtext.archi.adslDsl.Message#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.Message#getParameters()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parameters();

  /**
   * Returns the meta object for class '{@link fr.chaunier.xtext.archi.adslDsl.MessageParameter <em>Message Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Parameter</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageParameter
   * @generated
   */
  EClass getMessageParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.chaunier.xtext.archi.adslDsl.MessageParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageParameter#getName()
   * @see #getMessageParameter()
   * @generated
   */
  EAttribute getMessageParameter_Name();

  /**
   * Returns the meta object for the reference '{@link fr.chaunier.xtext.archi.adslDsl.MessageParameter#getTyperef <em>Typeref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Typeref</em>'.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageParameter#getTyperef()
   * @see #getMessageParameter()
   * @generated
   */
  EReference getMessageParameter_Typeref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdslDslFactory getAdslDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ArchiModelImpl <em>Archi Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.ArchiModelImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getArchiModel()
     * @generated
     */
    EClass ARCHI_MODEL = eINSTANCE.getArchiModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHI_MODEL__IMPORTS = eINSTANCE.getArchiModel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHI_MODEL__ELEMENTS = eINSTANCE.getArchiModel_Elements();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.ImportImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.SystemImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__USINGS = eINSTANCE.getSystem_Usings();

    /**
     * The meta object literal for the '<em><b>Sub Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SUB_SYSTEMS = eINSTANCE.getSystem_SubSystems();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__INTERFACES = eINSTANCE.getSystem_Interfaces();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.UsingImpl <em>Using</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.UsingImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getUsing()
     * @generated
     */
    EClass USING = eINSTANCE.getUsing();

    /**
     * The meta object literal for the '<em><b>System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USING__SYSTEM = eINSTANCE.getUsing_System();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.ComponentImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.PortImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__IS_MANDATORY = eINSTANCE.getPort_IsMandatory();

    /**
     * The meta object literal for the '<em><b>Is To Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__IS_TO_MANY = eINSTANCE.getPort_IsToMany();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.ProvidedPortImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getProvidedPort()
     * @generated
     */
    EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.RequiredPortImpl <em>Required Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.RequiredPortImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getRequiredPort()
     * @generated
     */
    EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.InterfaceImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__INTERACTIONS = eINSTANCE.getInterface_Interactions();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageInteractionImpl <em>Message Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageInteractionImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessageInteraction()
     * @generated
     */
    EClass MESSAGE_INTERACTION = eINSTANCE.getMessageInteraction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_INTERACTION__NAME = eINSTANCE.getMessageInteraction_Name();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.OnewayInteractionImpl <em>Oneway Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.OnewayInteractionImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getOnewayInteraction()
     * @generated
     */
    EClass ONEWAY_INTERACTION = eINSTANCE.getOnewayInteraction();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONEWAY_INTERACTION__MESSAGE = eINSTANCE.getOnewayInteraction_Message();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl <em>Request Reply Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.RequestReplyInteractionImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getRequestReplyInteraction()
     * @generated
     */
    EClass REQUEST_REPLY_INTERACTION = eINSTANCE.getRequestReplyInteraction();

    /**
     * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_REPLY_INTERACTION__REQUEST = eINSTANCE.getRequestReplyInteraction_Request();

    /**
     * The meta object literal for the '<em><b>Reply</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUEST_REPLY_INTERACTION__REPLY = eINSTANCE.getRequestReplyInteraction_Reply();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

    /**
     * The meta object literal for the '{@link fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl <em>Message Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.chaunier.xtext.archi.adslDsl.impl.MessageParameterImpl
     * @see fr.chaunier.xtext.archi.adslDsl.impl.AdslDslPackageImpl#getMessageParameter()
     * @generated
     */
    EClass MESSAGE_PARAMETER = eINSTANCE.getMessageParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE_PARAMETER__NAME = eINSTANCE.getMessageParameter_Name();

    /**
     * The meta object literal for the '<em><b>Typeref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_PARAMETER__TYPEREF = eINSTANCE.getMessageParameter_Typeref();

  }

} //AdslDslPackage
