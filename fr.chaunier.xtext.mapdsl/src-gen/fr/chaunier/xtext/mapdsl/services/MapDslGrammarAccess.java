/*
* generated by Xtext
*/

package fr.chaunier.xtext.mapdsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MapDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDocumentationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDocumentationSTRINGTerminalRuleCall_2_0 = (RuleCall)cDocumentationAssignment_2.eContents().get(0);
		private final Assignment cMappingModulesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMappingModulesMappingModuleParserRuleCall_3_0 = (RuleCall)cMappingModulesAssignment_3.eContents().get(0);
		private final Assignment cRootsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRootsRootModuleParserRuleCall_4_0 = (RuleCall)cRootsAssignment_4.eContents().get(0);
		
		//Model:
		//	"model" name=QualifiedName documentation=STRING? mappingModules+=MappingModule* roots+=RootModule*;
		public ParserRule getRule() { return rule; }

		//"model" name=QualifiedName documentation=STRING? mappingModules+=MappingModule* roots+=RootModule*
		public Group getGroup() { return cGroup; }

		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//documentation=STRING?
		public Assignment getDocumentationAssignment_2() { return cDocumentationAssignment_2; }

		//STRING
		public RuleCall getDocumentationSTRINGTerminalRuleCall_2_0() { return cDocumentationSTRINGTerminalRuleCall_2_0; }

		//mappingModules+=MappingModule*
		public Assignment getMappingModulesAssignment_3() { return cMappingModulesAssignment_3; }

		//MappingModule
		public RuleCall getMappingModulesMappingModuleParserRuleCall_3_0() { return cMappingModulesMappingModuleParserRuleCall_3_0; }

		//roots+=RootModule*
		public Assignment getRootsAssignment_4() { return cRootsAssignment_4; }

		//RootModule
		public RuleCall getRootsRootModuleParserRuleCall_4_0() { return cRootsRootModuleParserRuleCall_4_0; }
	}

	public class QualifiedNameWithWildCardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildCard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildCard returns ecore::EString:
		//	QualifiedName ".*"?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName returns ecore::EString:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class RootModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootModule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRootKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRootRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRootRefMappingModuleCrossReference_1_0 = (CrossReference)cRootRefAssignment_1.eContents().get(0);
		private final RuleCall cRootRefMappingModuleIDTerminalRuleCall_1_0_1 = (RuleCall)cRootRefMappingModuleCrossReference_1_0.eContents().get(1);
		private final Assignment cDocumentationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDocumentationSTRINGTerminalRuleCall_2_0 = (RuleCall)cDocumentationAssignment_2.eContents().get(0);
		
		//RootModule:
		//	"root" rootRef=[MappingModule] documentation=STRING?;
		public ParserRule getRule() { return rule; }

		//"root" rootRef=[MappingModule] documentation=STRING?
		public Group getGroup() { return cGroup; }

		//"root"
		public Keyword getRootKeyword_0() { return cRootKeyword_0; }

		//rootRef=[MappingModule]
		public Assignment getRootRefAssignment_1() { return cRootRefAssignment_1; }

		//[MappingModule]
		public CrossReference getRootRefMappingModuleCrossReference_1_0() { return cRootRefMappingModuleCrossReference_1_0; }

		//ID
		public RuleCall getRootRefMappingModuleIDTerminalRuleCall_1_0_1() { return cRootRefMappingModuleIDTerminalRuleCall_1_0_1; }

		//documentation=STRING?
		public Assignment getDocumentationAssignment_2() { return cDocumentationAssignment_2; }

		//STRING
		public RuleCall getDocumentationSTRINGTerminalRuleCall_2_0() { return cDocumentationSTRINGTerminalRuleCall_2_0; }
	}

	public class MappingModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MappingModule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDocumentationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDocumentationSTRINGTerminalRuleCall_2_0 = (RuleCall)cDocumentationAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cMappedFeaturesAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cMappedFeaturesFeatureMapParserRuleCall_4_0_0 = (RuleCall)cMappedFeaturesAssignment_4_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MappingModule:
		//	"module" name=QualifiedName documentation=STRING? "{" (mappedFeatures+=FeatureMap ";"?)* "}";
		public ParserRule getRule() { return rule; }

		//"module" name=QualifiedName documentation=STRING? "{" (mappedFeatures+=FeatureMap ";"?)* "}"
		public Group getGroup() { return cGroup; }

		//"module"
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//documentation=STRING?
		public Assignment getDocumentationAssignment_2() { return cDocumentationAssignment_2; }

		//STRING
		public RuleCall getDocumentationSTRINGTerminalRuleCall_2_0() { return cDocumentationSTRINGTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//(mappedFeatures+=FeatureMap ";"?)*
		public Group getGroup_4() { return cGroup_4; }

		//mappedFeatures+=FeatureMap
		public Assignment getMappedFeaturesAssignment_4_0() { return cMappedFeaturesAssignment_4_0; }

		//FeatureMap
		public RuleCall getMappedFeaturesFeatureMapParserRuleCall_4_0_0() { return cMappedFeaturesFeatureMapParserRuleCall_4_0_0; }

		//";"?
		public Keyword getSemicolonKeyword_4_1() { return cSemicolonKeyword_4_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureMapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureMap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Keyword cMapKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Assignment cLeftFieldsAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final CrossReference cLeftFieldsAttributeCrossReference_0_0_1_0 = (CrossReference)cLeftFieldsAssignment_0_0_1.eContents().get(0);
		private final RuleCall cLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_1_0_1 = (RuleCall)cLeftFieldsAttributeCrossReference_0_0_1_0.eContents().get(1);
		private final Group cGroup_0_0_2 = (Group)cGroup_0_0.eContents().get(2);
		private final Keyword cCommaKeyword_0_0_2_0 = (Keyword)cGroup_0_0_2.eContents().get(0);
		private final Assignment cLeftFieldsAssignment_0_0_2_1 = (Assignment)cGroup_0_0_2.eContents().get(1);
		private final CrossReference cLeftFieldsAttributeCrossReference_0_0_2_1_0 = (CrossReference)cLeftFieldsAssignment_0_0_2_1.eContents().get(0);
		private final RuleCall cLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_2_1_0_1 = (RuleCall)cLeftFieldsAttributeCrossReference_0_0_2_1_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_0_0_3 = (Keyword)cGroup_0_0.eContents().get(3);
		private final Assignment cRightFieldsAssignment_0_0_4 = (Assignment)cGroup_0_0.eContents().get(4);
		private final CrossReference cRightFieldsAttributeCrossReference_0_0_4_0 = (CrossReference)cRightFieldsAssignment_0_0_4.eContents().get(0);
		private final RuleCall cRightFieldsAttributeQualifiedNameParserRuleCall_0_0_4_0_1 = (RuleCall)cRightFieldsAttributeCrossReference_0_0_4_0.eContents().get(1);
		private final Group cGroup_0_0_5 = (Group)cGroup_0_0.eContents().get(5);
		private final Keyword cCommaKeyword_0_0_5_0 = (Keyword)cGroup_0_0_5.eContents().get(0);
		private final Assignment cRightFieldsAssignment_0_0_5_1 = (Assignment)cGroup_0_0_5.eContents().get(1);
		private final CrossReference cRightFieldsAttributeCrossReference_0_0_5_1_0 = (CrossReference)cRightFieldsAssignment_0_0_5_1.eContents().get(0);
		private final RuleCall cRightFieldsAttributeQualifiedNameParserRuleCall_0_0_5_1_0_1 = (RuleCall)cRightFieldsAttributeCrossReference_0_0_5_1_0.eContents().get(1);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Keyword cSetLeftKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cSetLeftFieldAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final CrossReference cSetLeftFieldAttributeCrossReference_0_1_1_0 = (CrossReference)cSetLeftFieldAssignment_0_1_1.eContents().get(0);
		private final RuleCall cSetLeftFieldAttributeQualifiedNameParserRuleCall_0_1_1_0_1 = (RuleCall)cSetLeftFieldAttributeCrossReference_0_1_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0_1_2 = (Keyword)cGroup_0_1.eContents().get(2);
		private final Assignment cExprAssignment_0_1_3 = (Assignment)cGroup_0_1.eContents().get(3);
		private final RuleCall cExprExpressionParserRuleCall_0_1_3_0 = (RuleCall)cExprAssignment_0_1_3.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cAlternatives_0.eContents().get(2);
		private final Keyword cSetRightKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cSetRightFieldAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final CrossReference cSetRightFieldAttributeCrossReference_0_2_1_0 = (CrossReference)cSetRightFieldAssignment_0_2_1.eContents().get(0);
		private final RuleCall cSetRightFieldAttributeQualifiedNameParserRuleCall_0_2_1_0_1 = (RuleCall)cSetRightFieldAttributeCrossReference_0_2_1_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0_2_2 = (Keyword)cGroup_0_2.eContents().get(2);
		private final Assignment cExprAssignment_0_2_3 = (Assignment)cGroup_0_2.eContents().get(3);
		private final RuleCall cExprExpressionParserRuleCall_0_2_3_0 = (RuleCall)cExprAssignment_0_2_3.eContents().get(0);
		private final Group cGroup_0_3 = (Group)cAlternatives_0.eContents().get(3);
		private final Keyword cIgnoreLeftKeyword_0_3_0 = (Keyword)cGroup_0_3.eContents().get(0);
		private final Assignment cLeftFieldsAssignment_0_3_1 = (Assignment)cGroup_0_3.eContents().get(1);
		private final CrossReference cLeftFieldsAttributeCrossReference_0_3_1_0 = (CrossReference)cLeftFieldsAssignment_0_3_1.eContents().get(0);
		private final RuleCall cLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_1_0_1 = (RuleCall)cLeftFieldsAttributeCrossReference_0_3_1_0.eContents().get(1);
		private final Group cGroup_0_3_2 = (Group)cGroup_0_3.eContents().get(2);
		private final Keyword cCommaKeyword_0_3_2_0 = (Keyword)cGroup_0_3_2.eContents().get(0);
		private final Assignment cLeftFieldsAssignment_0_3_2_1 = (Assignment)cGroup_0_3_2.eContents().get(1);
		private final CrossReference cLeftFieldsAttributeCrossReference_0_3_2_1_0 = (CrossReference)cLeftFieldsAssignment_0_3_2_1.eContents().get(0);
		private final RuleCall cLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_2_1_0_1 = (RuleCall)cLeftFieldsAttributeCrossReference_0_3_2_1_0.eContents().get(1);
		private final Group cGroup_0_4 = (Group)cAlternatives_0.eContents().get(4);
		private final Keyword cIgnoreRightKeyword_0_4_0 = (Keyword)cGroup_0_4.eContents().get(0);
		private final Assignment cRightFieldsAssignment_0_4_1 = (Assignment)cGroup_0_4.eContents().get(1);
		private final CrossReference cRightFieldsAttributeCrossReference_0_4_1_0 = (CrossReference)cRightFieldsAssignment_0_4_1.eContents().get(0);
		private final RuleCall cRightFieldsAttributeQualifiedNameParserRuleCall_0_4_1_0_1 = (RuleCall)cRightFieldsAttributeCrossReference_0_4_1_0.eContents().get(1);
		private final Group cGroup_0_4_2 = (Group)cGroup_0_4.eContents().get(2);
		private final Keyword cCommaKeyword_0_4_2_0 = (Keyword)cGroup_0_4_2.eContents().get(0);
		private final Assignment cRightFieldsAssignment_0_4_2_1 = (Assignment)cGroup_0_4_2.eContents().get(1);
		private final CrossReference cRightFieldsAttributeCrossReference_0_4_2_1_0 = (CrossReference)cRightFieldsAssignment_0_4_2_1.eContents().get(0);
		private final RuleCall cRightFieldsAttributeQualifiedNameParserRuleCall_0_4_2_1_0_1 = (RuleCall)cRightFieldsAttributeCrossReference_0_4_2_1_0.eContents().get(1);
		private final Group cGroup_0_5 = (Group)cAlternatives_0.eContents().get(5);
		private final Keyword cCallModuleKeyword_0_5_0 = (Keyword)cGroup_0_5.eContents().get(0);
		private final Assignment cModuleAssignment_0_5_1 = (Assignment)cGroup_0_5.eContents().get(1);
		private final CrossReference cModuleMappingModuleCrossReference_0_5_1_0 = (CrossReference)cModuleAssignment_0_5_1.eContents().get(0);
		private final RuleCall cModuleMappingModuleIDTerminalRuleCall_0_5_1_0_1 = (RuleCall)cModuleMappingModuleCrossReference_0_5_1_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cRuleKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cRulesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRulesSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cRulesAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cRulesAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cRulesSTRINGTerminalRuleCall_1_2_1_0 = (RuleCall)cRulesAssignment_1_2_1.eContents().get(0);
		private final Assignment cDocumentationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDocumentationSTRINGTerminalRuleCall_2_0 = (RuleCall)cDocumentationAssignment_2.eContents().get(0);
		
		//FeatureMap:
		//	("map" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* "=>"
		//	rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "set left"
		//	setLeftField=[mm::Attribute|QualifiedName] "=" expr=Expression | "set right"
		//	setRightField=[mm::Attribute|QualifiedName] "=" expr=Expression | "ignore left"
		//	leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* | "ignore right"
		//	rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "call module"
		//	module=[MappingModule]) ("rule" rules+=STRING ("," rules+=STRING)*)? documentation=STRING?;
		public ParserRule getRule() { return rule; }

		//("map" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* "=>"
		//rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "set left"
		//setLeftField=[mm::Attribute|QualifiedName] "=" expr=Expression | "set right"
		//setRightField=[mm::Attribute|QualifiedName] "=" expr=Expression | "ignore left"
		//leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* | "ignore right"
		//rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "call module"
		//module=[MappingModule]) ("rule" rules+=STRING ("," rules+=STRING)*)? documentation=STRING?
		public Group getGroup() { return cGroup; }

		//"map" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* "=>"
		//rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "set left"
		//setLeftField=[mm::Attribute|QualifiedName] "=" expr=Expression | "set right"
		//setRightField=[mm::Attribute|QualifiedName] "=" expr=Expression | "ignore left"
		//leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* | "ignore right"
		//rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "call module"
		//module=[MappingModule]
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//"map" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* "=>"
		//rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_0() { return cGroup_0_0; }

		//"map"
		public Keyword getMapKeyword_0_0_0() { return cMapKeyword_0_0_0; }

		//leftFields+=[mm::Attribute|QualifiedName]
		public Assignment getLeftFieldsAssignment_0_0_1() { return cLeftFieldsAssignment_0_0_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getLeftFieldsAttributeCrossReference_0_0_1_0() { return cLeftFieldsAttributeCrossReference_0_0_1_0; }

		//QualifiedName
		public RuleCall getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_1_0_1() { return cLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_1_0_1; }

		//("," leftFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_0_2() { return cGroup_0_0_2; }

		//","
		public Keyword getCommaKeyword_0_0_2_0() { return cCommaKeyword_0_0_2_0; }

		//leftFields+=[mm::Attribute|QualifiedName]
		public Assignment getLeftFieldsAssignment_0_0_2_1() { return cLeftFieldsAssignment_0_0_2_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getLeftFieldsAttributeCrossReference_0_0_2_1_0() { return cLeftFieldsAttributeCrossReference_0_0_2_1_0; }

		//QualifiedName
		public RuleCall getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_2_1_0_1() { return cLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_2_1_0_1; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_0_0_3() { return cEqualsSignGreaterThanSignKeyword_0_0_3; }

		//rightFields+=[mm::Attribute|QualifiedName]
		public Assignment getRightFieldsAssignment_0_0_4() { return cRightFieldsAssignment_0_0_4; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getRightFieldsAttributeCrossReference_0_0_4_0() { return cRightFieldsAttributeCrossReference_0_0_4_0; }

		//QualifiedName
		public RuleCall getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_4_0_1() { return cRightFieldsAttributeQualifiedNameParserRuleCall_0_0_4_0_1; }

		//("," rightFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_0_5() { return cGroup_0_0_5; }

		//","
		public Keyword getCommaKeyword_0_0_5_0() { return cCommaKeyword_0_0_5_0; }

		//rightFields+=[mm::Attribute|QualifiedName]
		public Assignment getRightFieldsAssignment_0_0_5_1() { return cRightFieldsAssignment_0_0_5_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getRightFieldsAttributeCrossReference_0_0_5_1_0() { return cRightFieldsAttributeCrossReference_0_0_5_1_0; }

		//QualifiedName
		public RuleCall getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_5_1_0_1() { return cRightFieldsAttributeQualifiedNameParserRuleCall_0_0_5_1_0_1; }

		//"set left" setLeftField=[mm::Attribute|QualifiedName] "=" expr=Expression
		public Group getGroup_0_1() { return cGroup_0_1; }

		//"set left"
		public Keyword getSetLeftKeyword_0_1_0() { return cSetLeftKeyword_0_1_0; }

		//setLeftField=[mm::Attribute|QualifiedName]
		public Assignment getSetLeftFieldAssignment_0_1_1() { return cSetLeftFieldAssignment_0_1_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getSetLeftFieldAttributeCrossReference_0_1_1_0() { return cSetLeftFieldAttributeCrossReference_0_1_1_0; }

		//QualifiedName
		public RuleCall getSetLeftFieldAttributeQualifiedNameParserRuleCall_0_1_1_0_1() { return cSetLeftFieldAttributeQualifiedNameParserRuleCall_0_1_1_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_0_1_2() { return cEqualsSignKeyword_0_1_2; }

		//expr=Expression
		public Assignment getExprAssignment_0_1_3() { return cExprAssignment_0_1_3; }

		//Expression
		public RuleCall getExprExpressionParserRuleCall_0_1_3_0() { return cExprExpressionParserRuleCall_0_1_3_0; }

		//"set right" setRightField=[mm::Attribute|QualifiedName] "=" expr=Expression
		public Group getGroup_0_2() { return cGroup_0_2; }

		//"set right"
		public Keyword getSetRightKeyword_0_2_0() { return cSetRightKeyword_0_2_0; }

		//setRightField=[mm::Attribute|QualifiedName]
		public Assignment getSetRightFieldAssignment_0_2_1() { return cSetRightFieldAssignment_0_2_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getSetRightFieldAttributeCrossReference_0_2_1_0() { return cSetRightFieldAttributeCrossReference_0_2_1_0; }

		//QualifiedName
		public RuleCall getSetRightFieldAttributeQualifiedNameParserRuleCall_0_2_1_0_1() { return cSetRightFieldAttributeQualifiedNameParserRuleCall_0_2_1_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_0_2_2() { return cEqualsSignKeyword_0_2_2; }

		//expr=Expression
		public Assignment getExprAssignment_0_2_3() { return cExprAssignment_0_2_3; }

		//Expression
		public RuleCall getExprExpressionParserRuleCall_0_2_3_0() { return cExprExpressionParserRuleCall_0_2_3_0; }

		//"ignore left" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_3() { return cGroup_0_3; }

		//"ignore left"
		public Keyword getIgnoreLeftKeyword_0_3_0() { return cIgnoreLeftKeyword_0_3_0; }

		//leftFields+=[mm::Attribute|QualifiedName]
		public Assignment getLeftFieldsAssignment_0_3_1() { return cLeftFieldsAssignment_0_3_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getLeftFieldsAttributeCrossReference_0_3_1_0() { return cLeftFieldsAttributeCrossReference_0_3_1_0; }

		//QualifiedName
		public RuleCall getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_1_0_1() { return cLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_1_0_1; }

		//("," leftFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_3_2() { return cGroup_0_3_2; }

		//","
		public Keyword getCommaKeyword_0_3_2_0() { return cCommaKeyword_0_3_2_0; }

		//leftFields+=[mm::Attribute|QualifiedName]
		public Assignment getLeftFieldsAssignment_0_3_2_1() { return cLeftFieldsAssignment_0_3_2_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getLeftFieldsAttributeCrossReference_0_3_2_1_0() { return cLeftFieldsAttributeCrossReference_0_3_2_1_0; }

		//QualifiedName
		public RuleCall getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_2_1_0_1() { return cLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_2_1_0_1; }

		//"ignore right" rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_4() { return cGroup_0_4; }

		//"ignore right"
		public Keyword getIgnoreRightKeyword_0_4_0() { return cIgnoreRightKeyword_0_4_0; }

		//rightFields+=[mm::Attribute|QualifiedName]
		public Assignment getRightFieldsAssignment_0_4_1() { return cRightFieldsAssignment_0_4_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getRightFieldsAttributeCrossReference_0_4_1_0() { return cRightFieldsAttributeCrossReference_0_4_1_0; }

		//QualifiedName
		public RuleCall getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_1_0_1() { return cRightFieldsAttributeQualifiedNameParserRuleCall_0_4_1_0_1; }

		//("," rightFields+=[mm::Attribute|QualifiedName])*
		public Group getGroup_0_4_2() { return cGroup_0_4_2; }

		//","
		public Keyword getCommaKeyword_0_4_2_0() { return cCommaKeyword_0_4_2_0; }

		//rightFields+=[mm::Attribute|QualifiedName]
		public Assignment getRightFieldsAssignment_0_4_2_1() { return cRightFieldsAssignment_0_4_2_1; }

		//[mm::Attribute|QualifiedName]
		public CrossReference getRightFieldsAttributeCrossReference_0_4_2_1_0() { return cRightFieldsAttributeCrossReference_0_4_2_1_0; }

		//QualifiedName
		public RuleCall getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_2_1_0_1() { return cRightFieldsAttributeQualifiedNameParserRuleCall_0_4_2_1_0_1; }

		//"call module" module=[MappingModule]
		public Group getGroup_0_5() { return cGroup_0_5; }

		//"call module"
		public Keyword getCallModuleKeyword_0_5_0() { return cCallModuleKeyword_0_5_0; }

		//module=[MappingModule]
		public Assignment getModuleAssignment_0_5_1() { return cModuleAssignment_0_5_1; }

		//[MappingModule]
		public CrossReference getModuleMappingModuleCrossReference_0_5_1_0() { return cModuleMappingModuleCrossReference_0_5_1_0; }

		//ID
		public RuleCall getModuleMappingModuleIDTerminalRuleCall_0_5_1_0_1() { return cModuleMappingModuleIDTerminalRuleCall_0_5_1_0_1; }

		//("rule" rules+=STRING ("," rules+=STRING)*)?
		public Group getGroup_1() { return cGroup_1; }

		//"rule"
		public Keyword getRuleKeyword_1_0() { return cRuleKeyword_1_0; }

		//rules+=STRING
		public Assignment getRulesAssignment_1_1() { return cRulesAssignment_1_1; }

		//STRING
		public RuleCall getRulesSTRINGTerminalRuleCall_1_1_0() { return cRulesSTRINGTerminalRuleCall_1_1_0; }

		//("," rules+=STRING)*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//","
		public Keyword getCommaKeyword_1_2_0() { return cCommaKeyword_1_2_0; }

		//rules+=STRING
		public Assignment getRulesAssignment_1_2_1() { return cRulesAssignment_1_2_1; }

		//STRING
		public RuleCall getRulesSTRINGTerminalRuleCall_1_2_1_0() { return cRulesSTRINGTerminalRuleCall_1_2_1_0; }

		//documentation=STRING?
		public Assignment getDocumentationAssignment_2() { return cDocumentationAssignment_2; }

		//STRING
		public RuleCall getDocumentationSTRINGTerminalRuleCall_2_0() { return cDocumentationSTRINGTerminalRuleCall_2_0; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cIntValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntValueINTTerminalRuleCall_1_0 = (RuleCall)cIntValueAssignment_1.eContents().get(0);
		
		//Expression:
		//	value=STRING | intValue=INT;
		public ParserRule getRule() { return rule; }

		//value=STRING | intValue=INT
		public Alternatives getAlternatives() { return cAlternatives; }

		//value=STRING
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_0() { return cValueSTRINGTerminalRuleCall_0_0; }

		//intValue=INT
		public Assignment getIntValueAssignment_1() { return cIntValueAssignment_1; }

		//INT
		public RuleCall getIntValueINTTerminalRuleCall_1_0() { return cIntValueINTTerminalRuleCall_1_0; }
	}
	
	
	private ModelElements pModel;
	private QualifiedNameWithWildCardElements pQualifiedNameWithWildCard;
	private QualifiedNameElements pQualifiedName;
	private RootModuleElements pRootModule;
	private MappingModuleElements pMappingModule;
	private FeatureMapElements pFeatureMap;
	private ExpressionElements pExpression;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public MapDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"model" name=QualifiedName documentation=STRING? mappingModules+=MappingModule* roots+=RootModule*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//QualifiedNameWithWildCard returns ecore::EString:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildCardElements getQualifiedNameWithWildCardAccess() {
		return (pQualifiedNameWithWildCard != null) ? pQualifiedNameWithWildCard : (pQualifiedNameWithWildCard = new QualifiedNameWithWildCardElements());
	}
	
	public ParserRule getQualifiedNameWithWildCardRule() {
		return getQualifiedNameWithWildCardAccess().getRule();
	}

	//QualifiedName returns ecore::EString:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//RootModule:
	//	"root" rootRef=[MappingModule] documentation=STRING?;
	public RootModuleElements getRootModuleAccess() {
		return (pRootModule != null) ? pRootModule : (pRootModule = new RootModuleElements());
	}
	
	public ParserRule getRootModuleRule() {
		return getRootModuleAccess().getRule();
	}

	//MappingModule:
	//	"module" name=QualifiedName documentation=STRING? "{" (mappedFeatures+=FeatureMap ";"?)* "}";
	public MappingModuleElements getMappingModuleAccess() {
		return (pMappingModule != null) ? pMappingModule : (pMappingModule = new MappingModuleElements());
	}
	
	public ParserRule getMappingModuleRule() {
		return getMappingModuleAccess().getRule();
	}

	//FeatureMap:
	//	("map" leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* "=>"
	//	rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "set left"
	//	setLeftField=[mm::Attribute|QualifiedName] "=" expr=Expression | "set right"
	//	setRightField=[mm::Attribute|QualifiedName] "=" expr=Expression | "ignore left"
	//	leftFields+=[mm::Attribute|QualifiedName] ("," leftFields+=[mm::Attribute|QualifiedName])* | "ignore right"
	//	rightFields+=[mm::Attribute|QualifiedName] ("," rightFields+=[mm::Attribute|QualifiedName])* | "call module"
	//	module=[MappingModule]) ("rule" rules+=STRING ("," rules+=STRING)*)? documentation=STRING?;
	public FeatureMapElements getFeatureMapAccess() {
		return (pFeatureMap != null) ? pFeatureMap : (pFeatureMap = new FeatureMapElements());
	}
	
	public ParserRule getFeatureMapRule() {
		return getFeatureMapAccess().getRule();
	}

	//Expression:
	//	value=STRING | intValue=INT;
	public ExpressionElements getExpressionAccess() {
		return (pExpression != null) ? pExpression : (pExpression = new ExpressionElements());
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
