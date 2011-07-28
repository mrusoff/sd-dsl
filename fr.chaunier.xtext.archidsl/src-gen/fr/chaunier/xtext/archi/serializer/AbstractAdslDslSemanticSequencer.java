package fr.chaunier.xtext.archi.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.ArchiModel;
import fr.chaunier.xtext.archi.adslDsl.Component;
import fr.chaunier.xtext.archi.adslDsl.Import;
import fr.chaunier.xtext.archi.adslDsl.Interface;
import fr.chaunier.xtext.archi.adslDsl.Message;
import fr.chaunier.xtext.archi.adslDsl.MessageParameter;
import fr.chaunier.xtext.archi.adslDsl.OnewayInteraction;
import fr.chaunier.xtext.archi.adslDsl.ProvidedPort;
import fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction;
import fr.chaunier.xtext.archi.adslDsl.RequiredPort;
import fr.chaunier.xtext.archi.adslDsl.Using;
import fr.chaunier.xtext.archi.services.AdslDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractAdslDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected AdslDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AdslDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AdslDslPackage.ARCHI_MODEL:
				if(context == grammarAccess.getArchiModelRule()) {
					sequence_ArchiModel_ArchiModel(context, (ArchiModel) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.MESSAGE_PARAMETER:
				if(context == grammarAccess.getMessageParameterRule()) {
					sequence_MessageParameter_MessageParameter(context, (MessageParameter) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.ONEWAY_INTERACTION:
				if(context == grammarAccess.getMessageInteractionRule() ||
				   context == grammarAccess.getOnewayInteractionRule()) {
					sequence_OnewayInteraction_OnewayInteraction(context, (OnewayInteraction) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.PROVIDED_PORT:
				if(context == grammarAccess.getPortRule() ||
				   context == grammarAccess.getProvidedPortRule()) {
					sequence_ProvidedPort_ProvidedPort(context, (ProvidedPort) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.REQUEST_REPLY_INTERACTION:
				if(context == grammarAccess.getMessageInteractionRule() ||
				   context == grammarAccess.getRequestReplyInteractionRule()) {
					sequence_RequestReplyInteraction_RequestReplyInteraction(context, (RequestReplyInteraction) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.REQUIRED_PORT:
				if(context == grammarAccess.getPortRule() ||
				   context == grammarAccess.getRequiredPortRule()) {
					sequence_RequiredPort_RequiredPort(context, (RequiredPort) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System_System(context, (fr.chaunier.xtext.archi.adslDsl.System) semanticObject); 
					return; 
				}
				else break;
			case AdslDslPackage.USING:
				if(context == grammarAccess.getUsingRule()) {
					sequence_Using_Using(context, (Using) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (imports+=Import* elements+=System*)
	 *
	 * Features:
	 *    imports[0, *]
	 *    elements[0, *]
	 */
	protected void sequence_ArchiModel_ArchiModel(EObject context, ArchiModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ports+=Port*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    ports[0, *]
	 */
	protected void sequence_Component_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 *
	 * Features:
	 *    importedNamespace[1, 1]
	 */
	protected void sequence_Import_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interactions+=MessageInteraction*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    interactions[0, *]
	 */
	protected void sequence_Interface_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typeref=[Entity|QualifiedName])
	 *
	 * Features:
	 *    name[1, 1]
	 *    typeref[1, 1]
	 */
	protected void sequence_MessageParameter_MessageParameter(EObject context, MessageParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.MESSAGE_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.MESSAGE_PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.MESSAGE_PARAMETER__TYPEREF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.MESSAGE_PARAMETER__TYPEREF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMessageParameterAccess().getTyperefEntityQualifiedNameParserRuleCall_2_0_1(), semanticObject.getTyperef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=MessageParameter*
	 *
	 * Features:
	 *    parameters[0, *]
	 */
	protected void sequence_Message_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID message=Message)
	 *
	 * Features:
	 *    name[1, 1]
	 *    message[1, 1]
	 */
	protected void sequence_OnewayInteraction_OnewayInteraction(EObject context, OnewayInteraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.MESSAGE_INTERACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.MESSAGE_INTERACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.ONEWAY_INTERACTION__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.ONEWAY_INTERACTION__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOnewayInteractionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOnewayInteractionAccess().getMessageMessageParserRuleCall_3_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='mandatory'? isToMany?='toMany'? name=ID interface=[Interface|ID])
	 *
	 * Features:
	 *    isMandatory[0, 1]
	 *    isToMany[0, 1]
	 *    name[1, 1]
	 *    interface[1, 1]
	 */
	protected void sequence_ProvidedPort_ProvidedPort(EObject context, ProvidedPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID request=Message reply=Message)
	 *
	 * Features:
	 *    name[1, 1]
	 *    request[1, 1]
	 *    reply[1, 1]
	 */
	protected void sequence_RequestReplyInteraction_RequestReplyInteraction(EObject context, RequestReplyInteraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.MESSAGE_INTERACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.MESSAGE_INTERACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.REQUEST_REPLY_INTERACTION__REQUEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.REQUEST_REPLY_INTERACTION__REQUEST));
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.REQUEST_REPLY_INTERACTION__REPLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.REQUEST_REPLY_INTERACTION__REPLY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequestReplyInteractionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequestReplyInteractionAccess().getRequestMessageParserRuleCall_5_0(), semanticObject.getRequest());
		feeder.accept(grammarAccess.getRequestReplyInteractionAccess().getReplyMessageParserRuleCall_8_0(), semanticObject.getReply());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='mandatory'? isToMany?='toMany'? name=ID interface=[Interface|ID])
	 *
	 * Features:
	 *    isMandatory[0, 1]
	 *    isToMany[0, 1]
	 *    name[1, 1]
	 *    interface[1, 1]
	 */
	protected void sequence_RequiredPort_RequiredPort(EObject context, RequiredPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID usings+=Using* (subSystems+=System | components+=Component | interfaces+=Interface)*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    usings[0, *]
	 *    subSystems[0, *]
	 *    components[0, *]
	 *    interfaces[0, *]
	 */
	protected void sequence_System_System(EObject context, fr.chaunier.xtext.archi.adslDsl.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     system=[System|ID]
	 *
	 * Features:
	 *    system[1, 1]
	 */
	protected void sequence_Using_Using(EObject context, Using semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdslDslPackage.Literals.USING__SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdslDslPackage.Literals.USING__SYSTEM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsingAccess().getSystemSystemIDTerminalRuleCall_1_0_1(), semanticObject.getSystem());
		feeder.finish();
	}
}
