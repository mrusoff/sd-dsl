package fr.chaunier.xtext.simplemap.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.chaunier.xtext.simplemap.services.SMapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMapDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'.'", "'root'", "'module'", "'{'", "'}'", "';'", "'map'", "'=>'", "','", "'set left'", "'='", "'set right'", "'ignore left'", "'ignore right'", "'call module'", "'rule'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSMapDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g"; }


     
     	private SMapDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SMapDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:62:1: ( ruleModel EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:77:1: ( rule__Model__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:91:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:92:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:93:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName123);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:100:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:104:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:105:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:105:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:106:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:107:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:107:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName156);
            rule__QualifiedName__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleRootModule
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:119:1: entryRuleRootModule : ruleRootModule EOF ;
    public final void entryRuleRootModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:120:1: ( ruleRootModule EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:121:1: ruleRootModule EOF
            {
             before(grammarAccess.getRootModuleRule()); 
            pushFollow(FOLLOW_ruleRootModule_in_entryRuleRootModule183);
            ruleRootModule();
            _fsp--;

             after(grammarAccess.getRootModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootModule190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRootModule


    // $ANTLR start ruleRootModule
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:128:1: ruleRootModule : ( ( rule__RootModule__Group__0 ) ) ;
    public final void ruleRootModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:132:2: ( ( ( rule__RootModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:133:1: ( ( rule__RootModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:133:1: ( ( rule__RootModule__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:134:1: ( rule__RootModule__Group__0 )
            {
             before(grammarAccess.getRootModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:135:1: ( rule__RootModule__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:135:2: rule__RootModule__Group__0
            {
            pushFollow(FOLLOW_rule__RootModule__Group__0_in_ruleRootModule216);
            rule__RootModule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRootModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRootModule


    // $ANTLR start entryRuleMappingModule
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:147:1: entryRuleMappingModule : ruleMappingModule EOF ;
    public final void entryRuleMappingModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:148:1: ( ruleMappingModule EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:149:1: ruleMappingModule EOF
            {
             before(grammarAccess.getMappingModuleRule()); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule243);
            ruleMappingModule();
            _fsp--;

             after(grammarAccess.getMappingModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleMappingModule


    // $ANTLR start ruleMappingModule
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:156:1: ruleMappingModule : ( ( rule__MappingModule__Group__0 ) ) ;
    public final void ruleMappingModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:160:2: ( ( ( rule__MappingModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:161:1: ( ( rule__MappingModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:161:1: ( ( rule__MappingModule__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:162:1: ( rule__MappingModule__Group__0 )
            {
             before(grammarAccess.getMappingModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:163:1: ( rule__MappingModule__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:163:2: rule__MappingModule__Group__0
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule276);
            rule__MappingModule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMappingModule


    // $ANTLR start entryRuleFeatureMap
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:175:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:176:1: ( ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:177:1: ruleFeatureMap EOF
            {
             before(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap303);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getFeatureMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFeatureMap


    // $ANTLR start ruleFeatureMap
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:184:1: ruleFeatureMap : ( ( rule__FeatureMap__Group__0 ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:188:2: ( ( ( rule__FeatureMap__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:189:1: ( ( rule__FeatureMap__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:189:1: ( ( rule__FeatureMap__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:190:1: ( rule__FeatureMap__Group__0 )
            {
             before(grammarAccess.getFeatureMapAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:191:1: ( rule__FeatureMap__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:191:2: rule__FeatureMap__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__0_in_ruleFeatureMap336);
            rule__FeatureMap__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeatureMap


    // $ANTLR start entryRuleExpression
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:204:1: ( ruleExpression EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression363);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:212:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:216:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:217:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:217:1: ( ( rule__Expression__Alternatives ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:218:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:219:1: ( rule__Expression__Alternatives )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:219:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression396);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start rule__FeatureMap__Alternatives_0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:231:1: rule__FeatureMap__Alternatives_0 : ( ( ( rule__FeatureMap__Group_0_0__0 ) ) | ( ( rule__FeatureMap__Group_0_1__0 ) ) | ( ( rule__FeatureMap__Group_0_2__0 ) ) | ( ( rule__FeatureMap__Group_0_3__0 ) ) | ( ( rule__FeatureMap__Group_0_4__0 ) ) | ( ( rule__FeatureMap__Group_0_5__0 ) ) );
    public final void rule__FeatureMap__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:235:1: ( ( ( rule__FeatureMap__Group_0_0__0 ) ) | ( ( rule__FeatureMap__Group_0_1__0 ) ) | ( ( rule__FeatureMap__Group_0_2__0 ) ) | ( ( rule__FeatureMap__Group_0_3__0 ) ) | ( ( rule__FeatureMap__Group_0_4__0 ) ) | ( ( rule__FeatureMap__Group_0_5__0 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case 26:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("231:1: rule__FeatureMap__Alternatives_0 : ( ( ( rule__FeatureMap__Group_0_0__0 ) ) | ( ( rule__FeatureMap__Group_0_1__0 ) ) | ( ( rule__FeatureMap__Group_0_2__0 ) ) | ( ( rule__FeatureMap__Group_0_3__0 ) ) | ( ( rule__FeatureMap__Group_0_4__0 ) ) | ( ( rule__FeatureMap__Group_0_5__0 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:236:1: ( ( rule__FeatureMap__Group_0_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:236:1: ( ( rule__FeatureMap__Group_0_0__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:237:1: ( rule__FeatureMap__Group_0_0__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_0()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:238:1: ( rule__FeatureMap__Group_0_0__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:238:2: rule__FeatureMap__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__0_in_rule__FeatureMap__Alternatives_0432);
                    rule__FeatureMap__Group_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:242:6: ( ( rule__FeatureMap__Group_0_1__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:242:6: ( ( rule__FeatureMap__Group_0_1__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:243:1: ( rule__FeatureMap__Group_0_1__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_1()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:244:1: ( rule__FeatureMap__Group_0_1__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:244:2: rule__FeatureMap__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__0_in_rule__FeatureMap__Alternatives_0450);
                    rule__FeatureMap__Group_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:248:6: ( ( rule__FeatureMap__Group_0_2__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:248:6: ( ( rule__FeatureMap__Group_0_2__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:249:1: ( rule__FeatureMap__Group_0_2__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_2()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:250:1: ( rule__FeatureMap__Group_0_2__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:250:2: rule__FeatureMap__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__0_in_rule__FeatureMap__Alternatives_0468);
                    rule__FeatureMap__Group_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:254:6: ( ( rule__FeatureMap__Group_0_3__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:254:6: ( ( rule__FeatureMap__Group_0_3__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:255:1: ( rule__FeatureMap__Group_0_3__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_3()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:256:1: ( rule__FeatureMap__Group_0_3__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:256:2: rule__FeatureMap__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__0_in_rule__FeatureMap__Alternatives_0486);
                    rule__FeatureMap__Group_0_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:260:6: ( ( rule__FeatureMap__Group_0_4__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:260:6: ( ( rule__FeatureMap__Group_0_4__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:261:1: ( rule__FeatureMap__Group_0_4__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_4()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:262:1: ( rule__FeatureMap__Group_0_4__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:262:2: rule__FeatureMap__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__0_in_rule__FeatureMap__Alternatives_0504);
                    rule__FeatureMap__Group_0_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:266:6: ( ( rule__FeatureMap__Group_0_5__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:266:6: ( ( rule__FeatureMap__Group_0_5__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:267:1: ( rule__FeatureMap__Group_0_5__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_5()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:268:1: ( rule__FeatureMap__Group_0_5__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:268:2: rule__FeatureMap__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__0_in_rule__FeatureMap__Alternatives_0522);
                    rule__FeatureMap__Group_0_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Alternatives_0


    // $ANTLR start rule__Expression__Alternatives
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:277:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ValueAssignment_0 ) ) | ( ( rule__Expression__IntValueAssignment_1 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:281:1: ( ( ( rule__Expression__ValueAssignment_0 ) ) | ( ( rule__Expression__IntValueAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("277:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ValueAssignment_0 ) ) | ( ( rule__Expression__IntValueAssignment_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:282:1: ( ( rule__Expression__ValueAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:282:1: ( ( rule__Expression__ValueAssignment_0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:283:1: ( rule__Expression__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getValueAssignment_0()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:284:1: ( rule__Expression__ValueAssignment_0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:284:2: rule__Expression__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression__ValueAssignment_0_in_rule__Expression__Alternatives555);
                    rule__Expression__ValueAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:288:6: ( ( rule__Expression__IntValueAssignment_1 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:288:6: ( ( rule__Expression__IntValueAssignment_1 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:289:1: ( rule__Expression__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getIntValueAssignment_1()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:290:1: ( rule__Expression__IntValueAssignment_1 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:290:2: rule__Expression__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression__IntValueAssignment_1_in_rule__Expression__Alternatives573);
                    rule__Expression__IntValueAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:301:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:305:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:306:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0604);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0607);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:313:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:317:1: ( ( 'model' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:318:1: ( 'model' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:318:1: ( 'model' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:319:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl635); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:332:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:336:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:337:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1666);
            rule__Model__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1669);
            rule__Model__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:344:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:348:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:349:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:349:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:350:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:351:1: ( rule__Model__NameAssignment_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:351:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl696);
            rule__Model__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:361:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:365:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:366:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2726);
            rule__Model__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2729);
            rule__Model__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:373:1: rule__Model__Group__2__Impl : ( ( rule__Model__DocumentationAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:377:1: ( ( ( rule__Model__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:378:1: ( ( rule__Model__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:378:1: ( ( rule__Model__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:379:1: ( rule__Model__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:380:1: ( rule__Model__DocumentationAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:380:2: rule__Model__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__DocumentationAssignment_2_in_rule__Model__Group__2__Impl756);
                    rule__Model__DocumentationAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDocumentationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2__Impl


    // $ANTLR start rule__Model__Group__3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:390:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:394:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:395:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3787);
            rule__Model__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3790);
            rule__Model__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Model__Group__3__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:402:1: rule__Model__Group__3__Impl : ( ( rule__Model__MappingModulesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:406:1: ( ( ( rule__Model__MappingModulesAssignment_3 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:407:1: ( ( rule__Model__MappingModulesAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:407:1: ( ( rule__Model__MappingModulesAssignment_3 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:408:1: ( rule__Model__MappingModulesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getMappingModulesAssignment_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:409:1: ( rule__Model__MappingModulesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:409:2: rule__Model__MappingModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__MappingModulesAssignment_3_in_rule__Model__Group__3__Impl817);
            	    rule__Model__MappingModulesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMappingModulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__3__Impl


    // $ANTLR start rule__Model__Group__4
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:419:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:423:1: ( rule__Model__Group__4__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:424:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4848);
            rule__Model__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__4


    // $ANTLR start rule__Model__Group__4__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:430:1: rule__Model__Group__4__Impl : ( ( rule__Model__RootsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:434:1: ( ( ( rule__Model__RootsAssignment_4 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:435:1: ( ( rule__Model__RootsAssignment_4 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:435:1: ( ( rule__Model__RootsAssignment_4 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:436:1: ( rule__Model__RootsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getRootsAssignment_4()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:437:1: ( rule__Model__RootsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:437:2: rule__Model__RootsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__RootsAssignment_4_in_rule__Model__Group__4__Impl875);
            	    rule__Model__RootsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRootsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__4__Impl


    // $ANTLR start rule__QualifiedName__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:458:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:462:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:463:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0917);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0920);
            rule__QualifiedName__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__0


    // $ANTLR start rule__QualifiedName__Group__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:470:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:474:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:475:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:475:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:476:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl947); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__0__Impl


    // $ANTLR start rule__QualifiedName__Group__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:487:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:491:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:492:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1976);
            rule__QualifiedName__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__1


    // $ANTLR start rule__QualifiedName__Group__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:498:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:502:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:503:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:503:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:504:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:505:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:505:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1003);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group__1__Impl


    // $ANTLR start rule__QualifiedName__Group_1__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:519:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:523:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:524:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01038);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01041);
            rule__QualifiedName__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__0


    // $ANTLR start rule__QualifiedName__Group_1__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:531:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:535:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:536:1: ( '.' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:536:1: ( '.' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:537:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl1069); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__0__Impl


    // $ANTLR start rule__QualifiedName__Group_1__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:550:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:554:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:555:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11100);
            rule__QualifiedName__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__1


    // $ANTLR start rule__QualifiedName__Group_1__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:561:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:565:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:566:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:566:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:567:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1127); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualifiedName__Group_1__1__Impl


    // $ANTLR start rule__RootModule__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:582:1: rule__RootModule__Group__0 : rule__RootModule__Group__0__Impl rule__RootModule__Group__1 ;
    public final void rule__RootModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:586:1: ( rule__RootModule__Group__0__Impl rule__RootModule__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:587:2: rule__RootModule__Group__0__Impl rule__RootModule__Group__1
            {
            pushFollow(FOLLOW_rule__RootModule__Group__0__Impl_in_rule__RootModule__Group__01160);
            rule__RootModule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootModule__Group__1_in_rule__RootModule__Group__01163);
            rule__RootModule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__0


    // $ANTLR start rule__RootModule__Group__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:594:1: rule__RootModule__Group__0__Impl : ( 'root' ) ;
    public final void rule__RootModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:598:1: ( ( 'root' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:599:1: ( 'root' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:599:1: ( 'root' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:600:1: 'root'
            {
             before(grammarAccess.getRootModuleAccess().getRootKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__RootModule__Group__0__Impl1191); 
             after(grammarAccess.getRootModuleAccess().getRootKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__0__Impl


    // $ANTLR start rule__RootModule__Group__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:613:1: rule__RootModule__Group__1 : rule__RootModule__Group__1__Impl rule__RootModule__Group__2 ;
    public final void rule__RootModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:617:1: ( rule__RootModule__Group__1__Impl rule__RootModule__Group__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:618:2: rule__RootModule__Group__1__Impl rule__RootModule__Group__2
            {
            pushFollow(FOLLOW_rule__RootModule__Group__1__Impl_in_rule__RootModule__Group__11222);
            rule__RootModule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__RootModule__Group__2_in_rule__RootModule__Group__11225);
            rule__RootModule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__1


    // $ANTLR start rule__RootModule__Group__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:625:1: rule__RootModule__Group__1__Impl : ( ( rule__RootModule__RootRefAssignment_1 ) ) ;
    public final void rule__RootModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:629:1: ( ( ( rule__RootModule__RootRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:630:1: ( ( rule__RootModule__RootRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:630:1: ( ( rule__RootModule__RootRefAssignment_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:631:1: ( rule__RootModule__RootRefAssignment_1 )
            {
             before(grammarAccess.getRootModuleAccess().getRootRefAssignment_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:632:1: ( rule__RootModule__RootRefAssignment_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:632:2: rule__RootModule__RootRefAssignment_1
            {
            pushFollow(FOLLOW_rule__RootModule__RootRefAssignment_1_in_rule__RootModule__Group__1__Impl1252);
            rule__RootModule__RootRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRootModuleAccess().getRootRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__1__Impl


    // $ANTLR start rule__RootModule__Group__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:642:1: rule__RootModule__Group__2 : rule__RootModule__Group__2__Impl ;
    public final void rule__RootModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:646:1: ( rule__RootModule__Group__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:647:2: rule__RootModule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootModule__Group__2__Impl_in_rule__RootModule__Group__21282);
            rule__RootModule__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__2


    // $ANTLR start rule__RootModule__Group__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:653:1: rule__RootModule__Group__2__Impl : ( ( rule__RootModule__DocumentationAssignment_2 )? ) ;
    public final void rule__RootModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:657:1: ( ( ( rule__RootModule__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:658:1: ( ( rule__RootModule__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:658:1: ( ( rule__RootModule__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:659:1: ( rule__RootModule__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getRootModuleAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:660:1: ( rule__RootModule__DocumentationAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:660:2: rule__RootModule__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RootModule__DocumentationAssignment_2_in_rule__RootModule__Group__2__Impl1309);
                    rule__RootModule__DocumentationAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootModuleAccess().getDocumentationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__Group__2__Impl


    // $ANTLR start rule__MappingModule__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:676:1: rule__MappingModule__Group__0 : rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 ;
    public final void rule__MappingModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:680:1: ( rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:681:2: rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__01346);
            rule__MappingModule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__01349);
            rule__MappingModule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__0


    // $ANTLR start rule__MappingModule__Group__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:688:1: rule__MappingModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__MappingModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:692:1: ( ( 'module' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:693:1: ( 'module' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:693:1: ( 'module' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:694:1: 'module'
            {
             before(grammarAccess.getMappingModuleAccess().getModuleKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MappingModule__Group__0__Impl1377); 
             after(grammarAccess.getMappingModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__0__Impl


    // $ANTLR start rule__MappingModule__Group__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:707:1: rule__MappingModule__Group__1 : rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 ;
    public final void rule__MappingModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:711:1: ( rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:712:2: rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__11408);
            rule__MappingModule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__11411);
            rule__MappingModule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__1


    // $ANTLR start rule__MappingModule__Group__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:719:1: rule__MappingModule__Group__1__Impl : ( ( rule__MappingModule__NameAssignment_1 ) ) ;
    public final void rule__MappingModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:723:1: ( ( ( rule__MappingModule__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:724:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:724:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:725:1: ( rule__MappingModule__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModuleAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:726:1: ( rule__MappingModule__NameAssignment_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:726:2: rule__MappingModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl1438);
            rule__MappingModule__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__1__Impl


    // $ANTLR start rule__MappingModule__Group__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:736:1: rule__MappingModule__Group__2 : rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 ;
    public final void rule__MappingModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:740:1: ( rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:741:2: rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__21468);
            rule__MappingModule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__21471);
            rule__MappingModule__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__2


    // $ANTLR start rule__MappingModule__Group__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:748:1: rule__MappingModule__Group__2__Impl : ( ( rule__MappingModule__DocumentationAssignment_2 )? ) ;
    public final void rule__MappingModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:752:1: ( ( ( rule__MappingModule__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:753:1: ( ( rule__MappingModule__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:753:1: ( ( rule__MappingModule__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:754:1: ( rule__MappingModule__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getMappingModuleAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:755:1: ( rule__MappingModule__DocumentationAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:755:2: rule__MappingModule__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MappingModule__DocumentationAssignment_2_in_rule__MappingModule__Group__2__Impl1498);
                    rule__MappingModule__DocumentationAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModuleAccess().getDocumentationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__2__Impl


    // $ANTLR start rule__MappingModule__Group__3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:765:1: rule__MappingModule__Group__3 : rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 ;
    public final void rule__MappingModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:769:1: ( rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:770:2: rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__31529);
            rule__MappingModule__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__31532);
            rule__MappingModule__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__3


    // $ANTLR start rule__MappingModule__Group__3__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:777:1: rule__MappingModule__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:781:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:782:1: ( '{' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:782:1: ( '{' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:783:1: '{'
            {
             before(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__MappingModule__Group__3__Impl1560); 
             after(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__3__Impl


    // $ANTLR start rule__MappingModule__Group__4
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:796:1: rule__MappingModule__Group__4 : rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 ;
    public final void rule__MappingModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:800:1: ( rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:801:2: rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__41591);
            rule__MappingModule__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__41594);
            rule__MappingModule__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__4


    // $ANTLR start rule__MappingModule__Group__4__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:808:1: rule__MappingModule__Group__4__Impl : ( ( rule__MappingModule__Group_4__0 )* ) ;
    public final void rule__MappingModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:812:1: ( ( ( rule__MappingModule__Group_4__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:813:1: ( ( rule__MappingModule__Group_4__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:813:1: ( ( rule__MappingModule__Group_4__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:814:1: ( rule__MappingModule__Group_4__0 )*
            {
             before(grammarAccess.getMappingModuleAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:815:1: ( rule__MappingModule__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==21||(LA9_0>=23 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:815:2: rule__MappingModule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MappingModule__Group_4__0_in_rule__MappingModule__Group__4__Impl1621);
            	    rule__MappingModule__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMappingModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__4__Impl


    // $ANTLR start rule__MappingModule__Group__5
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:825:1: rule__MappingModule__Group__5 : rule__MappingModule__Group__5__Impl ;
    public final void rule__MappingModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:829:1: ( rule__MappingModule__Group__5__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:830:2: rule__MappingModule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__51652);
            rule__MappingModule__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__5


    // $ANTLR start rule__MappingModule__Group__5__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:836:1: rule__MappingModule__Group__5__Impl : ( '}' ) ;
    public final void rule__MappingModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:840:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:841:1: ( '}' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:841:1: ( '}' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:842:1: '}'
            {
             before(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__MappingModule__Group__5__Impl1680); 
             after(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group__5__Impl


    // $ANTLR start rule__MappingModule__Group_4__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:867:1: rule__MappingModule__Group_4__0 : rule__MappingModule__Group_4__0__Impl rule__MappingModule__Group_4__1 ;
    public final void rule__MappingModule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:871:1: ( rule__MappingModule__Group_4__0__Impl rule__MappingModule__Group_4__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:872:2: rule__MappingModule__Group_4__0__Impl rule__MappingModule__Group_4__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_4__0__Impl_in_rule__MappingModule__Group_4__01723);
            rule__MappingModule__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group_4__1_in_rule__MappingModule__Group_4__01726);
            rule__MappingModule__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_4__0


    // $ANTLR start rule__MappingModule__Group_4__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:879:1: rule__MappingModule__Group_4__0__Impl : ( ( rule__MappingModule__MappedFeaturesAssignment_4_0 ) ) ;
    public final void rule__MappingModule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:883:1: ( ( ( rule__MappingModule__MappedFeaturesAssignment_4_0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:884:1: ( ( rule__MappingModule__MappedFeaturesAssignment_4_0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:884:1: ( ( rule__MappingModule__MappedFeaturesAssignment_4_0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:885:1: ( rule__MappingModule__MappedFeaturesAssignment_4_0 )
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_4_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:886:1: ( rule__MappingModule__MappedFeaturesAssignment_4_0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:886:2: rule__MappingModule__MappedFeaturesAssignment_4_0
            {
            pushFollow(FOLLOW_rule__MappingModule__MappedFeaturesAssignment_4_0_in_rule__MappingModule__Group_4__0__Impl1753);
            rule__MappingModule__MappedFeaturesAssignment_4_0();
            _fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_4__0__Impl


    // $ANTLR start rule__MappingModule__Group_4__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:896:1: rule__MappingModule__Group_4__1 : rule__MappingModule__Group_4__1__Impl ;
    public final void rule__MappingModule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:900:1: ( rule__MappingModule__Group_4__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:901:2: rule__MappingModule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_4__1__Impl_in_rule__MappingModule__Group_4__11783);
            rule__MappingModule__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_4__1


    // $ANTLR start rule__MappingModule__Group_4__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:907:1: rule__MappingModule__Group_4__1__Impl : ( ( ';' )? ) ;
    public final void rule__MappingModule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:911:1: ( ( ( ';' )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:912:1: ( ( ';' )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:912:1: ( ( ';' )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:913:1: ( ';' )?
            {
             before(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_4_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:914:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:915:2: ';'
                    {
                    match(input,17,FOLLOW_17_in_rule__MappingModule__Group_4__1__Impl1812); 

                    }
                    break;

            }

             after(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_4__1__Impl


    // $ANTLR start rule__FeatureMap__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:930:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:934:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:935:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__0__Impl_in_rule__FeatureMap__Group__01849);
            rule__FeatureMap__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group__1_in_rule__FeatureMap__Group__01852);
            rule__FeatureMap__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__0


    // $ANTLR start rule__FeatureMap__Group__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:942:1: rule__FeatureMap__Group__0__Impl : ( ( rule__FeatureMap__Alternatives_0 ) ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:946:1: ( ( ( rule__FeatureMap__Alternatives_0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:947:1: ( ( rule__FeatureMap__Alternatives_0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:947:1: ( ( rule__FeatureMap__Alternatives_0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:948:1: ( rule__FeatureMap__Alternatives_0 )
            {
             before(grammarAccess.getFeatureMapAccess().getAlternatives_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:949:1: ( rule__FeatureMap__Alternatives_0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:949:2: rule__FeatureMap__Alternatives_0
            {
            pushFollow(FOLLOW_rule__FeatureMap__Alternatives_0_in_rule__FeatureMap__Group__0__Impl1879);
            rule__FeatureMap__Alternatives_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__0__Impl


    // $ANTLR start rule__FeatureMap__Group__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:959:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:963:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:964:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__1__Impl_in_rule__FeatureMap__Group__11909);
            rule__FeatureMap__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group__2_in_rule__FeatureMap__Group__11912);
            rule__FeatureMap__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__1


    // $ANTLR start rule__FeatureMap__Group__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:971:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__Group_1__0 )? ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:975:1: ( ( ( rule__FeatureMap__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:976:1: ( ( rule__FeatureMap__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:976:1: ( ( rule__FeatureMap__Group_1__0 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:977:1: ( rule__FeatureMap__Group_1__0 )?
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:978:1: ( rule__FeatureMap__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:978:2: rule__FeatureMap__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Group__1__Impl1939);
                    rule__FeatureMap__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMapAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__1__Impl


    // $ANTLR start rule__FeatureMap__Group__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:988:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:992:1: ( rule__FeatureMap__Group__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:993:2: rule__FeatureMap__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__2__Impl_in_rule__FeatureMap__Group__21970);
            rule__FeatureMap__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__2


    // $ANTLR start rule__FeatureMap__Group__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:999:1: rule__FeatureMap__Group__2__Impl : ( ( rule__FeatureMap__DocumentationAssignment_2 )? ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1003:1: ( ( ( rule__FeatureMap__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1004:1: ( ( rule__FeatureMap__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1004:1: ( ( rule__FeatureMap__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1005:1: ( rule__FeatureMap__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1006:1: ( rule__FeatureMap__DocumentationAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1006:2: rule__FeatureMap__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__DocumentationAssignment_2_in_rule__FeatureMap__Group__2__Impl1997);
                    rule__FeatureMap__DocumentationAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1022:1: rule__FeatureMap__Group_0_0__0 : rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1 ;
    public final void rule__FeatureMap__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1026:1: ( rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1027:2: rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__0__Impl_in_rule__FeatureMap__Group_0_0__02034);
            rule__FeatureMap__Group_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__1_in_rule__FeatureMap__Group_0_0__02037);
            rule__FeatureMap__Group_0_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__0


    // $ANTLR start rule__FeatureMap__Group_0_0__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1034:1: rule__FeatureMap__Group_0_0__0__Impl : ( 'map' ) ;
    public final void rule__FeatureMap__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1038:1: ( ( 'map' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1039:1: ( 'map' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1039:1: ( 'map' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1040:1: 'map'
            {
             before(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0_0()); 
            match(input,18,FOLLOW_18_in_rule__FeatureMap__Group_0_0__0__Impl2065); 
             after(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1053:1: rule__FeatureMap__Group_0_0__1 : rule__FeatureMap__Group_0_0__1__Impl rule__FeatureMap__Group_0_0__2 ;
    public final void rule__FeatureMap__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1057:1: ( rule__FeatureMap__Group_0_0__1__Impl rule__FeatureMap__Group_0_0__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1058:2: rule__FeatureMap__Group_0_0__1__Impl rule__FeatureMap__Group_0_0__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__1__Impl_in_rule__FeatureMap__Group_0_0__12096);
            rule__FeatureMap__Group_0_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__2_in_rule__FeatureMap__Group_0_0__12099);
            rule__FeatureMap__Group_0_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__1


    // $ANTLR start rule__FeatureMap__Group_0_0__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1065:1: rule__FeatureMap__Group_0_0__1__Impl : ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 ) ) ;
    public final void rule__FeatureMap__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1069:1: ( ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1070:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1070:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1071:1: ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_0_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1072:1: ( rule__FeatureMap__LeftFieldsAssignment_0_0_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1072:2: rule__FeatureMap__LeftFieldsAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_0_1_in_rule__FeatureMap__Group_0_0__1__Impl2126);
            rule__FeatureMap__LeftFieldsAssignment_0_0_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1082:1: rule__FeatureMap__Group_0_0__2 : rule__FeatureMap__Group_0_0__2__Impl rule__FeatureMap__Group_0_0__3 ;
    public final void rule__FeatureMap__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1086:1: ( rule__FeatureMap__Group_0_0__2__Impl rule__FeatureMap__Group_0_0__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1087:2: rule__FeatureMap__Group_0_0__2__Impl rule__FeatureMap__Group_0_0__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__2__Impl_in_rule__FeatureMap__Group_0_0__22156);
            rule__FeatureMap__Group_0_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__3_in_rule__FeatureMap__Group_0_0__22159);
            rule__FeatureMap__Group_0_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__2


    // $ANTLR start rule__FeatureMap__Group_0_0__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1094:1: rule__FeatureMap__Group_0_0__2__Impl : ( ( rule__FeatureMap__Group_0_0_2__0 )* ) ;
    public final void rule__FeatureMap__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1098:1: ( ( ( rule__FeatureMap__Group_0_0_2__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1099:1: ( ( rule__FeatureMap__Group_0_0_2__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1099:1: ( ( rule__FeatureMap__Group_0_0_2__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1100:1: ( rule__FeatureMap__Group_0_0_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_0_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1101:1: ( rule__FeatureMap__Group_0_0_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1101:2: rule__FeatureMap__Group_0_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_2__0_in_rule__FeatureMap__Group_0_0__2__Impl2186);
            	    rule__FeatureMap__Group_0_0_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1111:1: rule__FeatureMap__Group_0_0__3 : rule__FeatureMap__Group_0_0__3__Impl rule__FeatureMap__Group_0_0__4 ;
    public final void rule__FeatureMap__Group_0_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1115:1: ( rule__FeatureMap__Group_0_0__3__Impl rule__FeatureMap__Group_0_0__4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1116:2: rule__FeatureMap__Group_0_0__3__Impl rule__FeatureMap__Group_0_0__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__3__Impl_in_rule__FeatureMap__Group_0_0__32217);
            rule__FeatureMap__Group_0_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__4_in_rule__FeatureMap__Group_0_0__32220);
            rule__FeatureMap__Group_0_0__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__3


    // $ANTLR start rule__FeatureMap__Group_0_0__3__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1123:1: rule__FeatureMap__Group_0_0__3__Impl : ( '=>' ) ;
    public final void rule__FeatureMap__Group_0_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1127:1: ( ( '=>' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1128:1: ( '=>' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1128:1: ( '=>' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1129:1: '=>'
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_0_3()); 
            match(input,19,FOLLOW_19_in_rule__FeatureMap__Group_0_0__3__Impl2248); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__3__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__4
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1142:1: rule__FeatureMap__Group_0_0__4 : rule__FeatureMap__Group_0_0__4__Impl rule__FeatureMap__Group_0_0__5 ;
    public final void rule__FeatureMap__Group_0_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1146:1: ( rule__FeatureMap__Group_0_0__4__Impl rule__FeatureMap__Group_0_0__5 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1147:2: rule__FeatureMap__Group_0_0__4__Impl rule__FeatureMap__Group_0_0__5
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__4__Impl_in_rule__FeatureMap__Group_0_0__42279);
            rule__FeatureMap__Group_0_0__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__5_in_rule__FeatureMap__Group_0_0__42282);
            rule__FeatureMap__Group_0_0__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__4


    // $ANTLR start rule__FeatureMap__Group_0_0__4__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1154:1: rule__FeatureMap__Group_0_0__4__Impl : ( ( rule__FeatureMap__RightFieldsAssignment_0_0_4 ) ) ;
    public final void rule__FeatureMap__Group_0_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1158:1: ( ( ( rule__FeatureMap__RightFieldsAssignment_0_0_4 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1159:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_0_4 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1159:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_0_4 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1160:1: ( rule__FeatureMap__RightFieldsAssignment_0_0_4 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_0_4()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1161:1: ( rule__FeatureMap__RightFieldsAssignment_0_0_4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1161:2: rule__FeatureMap__RightFieldsAssignment_0_0_4
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_0_4_in_rule__FeatureMap__Group_0_0__4__Impl2309);
            rule__FeatureMap__RightFieldsAssignment_0_0_4();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__4__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0__5
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1171:1: rule__FeatureMap__Group_0_0__5 : rule__FeatureMap__Group_0_0__5__Impl ;
    public final void rule__FeatureMap__Group_0_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1175:1: ( rule__FeatureMap__Group_0_0__5__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1176:2: rule__FeatureMap__Group_0_0__5__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__5__Impl_in_rule__FeatureMap__Group_0_0__52339);
            rule__FeatureMap__Group_0_0__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__5


    // $ANTLR start rule__FeatureMap__Group_0_0__5__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1182:1: rule__FeatureMap__Group_0_0__5__Impl : ( ( rule__FeatureMap__Group_0_0_5__0 )* ) ;
    public final void rule__FeatureMap__Group_0_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1186:1: ( ( ( rule__FeatureMap__Group_0_0_5__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1187:1: ( ( rule__FeatureMap__Group_0_0_5__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1187:1: ( ( rule__FeatureMap__Group_0_0_5__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1188:1: ( rule__FeatureMap__Group_0_0_5__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_0_5()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1189:1: ( rule__FeatureMap__Group_0_0_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1189:2: rule__FeatureMap__Group_0_0_5__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_5__0_in_rule__FeatureMap__Group_0_0__5__Impl2366);
            	    rule__FeatureMap__Group_0_0_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0__5__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0_2__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1211:1: rule__FeatureMap__Group_0_0_2__0 : rule__FeatureMap__Group_0_0_2__0__Impl rule__FeatureMap__Group_0_0_2__1 ;
    public final void rule__FeatureMap__Group_0_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1215:1: ( rule__FeatureMap__Group_0_0_2__0__Impl rule__FeatureMap__Group_0_0_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1216:2: rule__FeatureMap__Group_0_0_2__0__Impl rule__FeatureMap__Group_0_0_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_2__0__Impl_in_rule__FeatureMap__Group_0_0_2__02409);
            rule__FeatureMap__Group_0_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_2__1_in_rule__FeatureMap__Group_0_0_2__02412);
            rule__FeatureMap__Group_0_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_2__0


    // $ANTLR start rule__FeatureMap__Group_0_0_2__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1223:1: rule__FeatureMap__Group_0_0_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureMap__Group_0_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1227:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1228:1: ( ',' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1228:1: ( ',' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1229:1: ','
            {
             before(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_0_0_2__0__Impl2440); 
             after(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0_2__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1242:1: rule__FeatureMap__Group_0_0_2__1 : rule__FeatureMap__Group_0_0_2__1__Impl ;
    public final void rule__FeatureMap__Group_0_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1246:1: ( rule__FeatureMap__Group_0_0_2__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1247:2: rule__FeatureMap__Group_0_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_2__1__Impl_in_rule__FeatureMap__Group_0_0_2__12471);
            rule__FeatureMap__Group_0_0_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_2__1


    // $ANTLR start rule__FeatureMap__Group_0_0_2__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1253:1: rule__FeatureMap__Group_0_0_2__1__Impl : ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 ) ) ;
    public final void rule__FeatureMap__Group_0_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1257:1: ( ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1258:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1258:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1259:1: ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_0_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1260:1: ( rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1260:2: rule__FeatureMap__LeftFieldsAssignment_0_0_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_0_2_1_in_rule__FeatureMap__Group_0_0_2__1__Impl2498);
            rule__FeatureMap__LeftFieldsAssignment_0_0_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_2__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0_5__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1274:1: rule__FeatureMap__Group_0_0_5__0 : rule__FeatureMap__Group_0_0_5__0__Impl rule__FeatureMap__Group_0_0_5__1 ;
    public final void rule__FeatureMap__Group_0_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1278:1: ( rule__FeatureMap__Group_0_0_5__0__Impl rule__FeatureMap__Group_0_0_5__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1279:2: rule__FeatureMap__Group_0_0_5__0__Impl rule__FeatureMap__Group_0_0_5__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_5__0__Impl_in_rule__FeatureMap__Group_0_0_5__02532);
            rule__FeatureMap__Group_0_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_5__1_in_rule__FeatureMap__Group_0_0_5__02535);
            rule__FeatureMap__Group_0_0_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_5__0


    // $ANTLR start rule__FeatureMap__Group_0_0_5__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1286:1: rule__FeatureMap__Group_0_0_5__0__Impl : ( ',' ) ;
    public final void rule__FeatureMap__Group_0_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1290:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1291:1: ( ',' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1291:1: ( ',' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1292:1: ','
            {
             before(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_5_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_0_0_5__0__Impl2563); 
             after(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_5__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_0_5__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1305:1: rule__FeatureMap__Group_0_0_5__1 : rule__FeatureMap__Group_0_0_5__1__Impl ;
    public final void rule__FeatureMap__Group_0_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1309:1: ( rule__FeatureMap__Group_0_0_5__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1310:2: rule__FeatureMap__Group_0_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0_5__1__Impl_in_rule__FeatureMap__Group_0_0_5__12594);
            rule__FeatureMap__Group_0_0_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_5__1


    // $ANTLR start rule__FeatureMap__Group_0_0_5__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1316:1: rule__FeatureMap__Group_0_0_5__1__Impl : ( ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 ) ) ;
    public final void rule__FeatureMap__Group_0_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1320:1: ( ( ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1321:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1321:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1322:1: ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_0_5_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1323:1: ( rule__FeatureMap__RightFieldsAssignment_0_0_5_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1323:2: rule__FeatureMap__RightFieldsAssignment_0_0_5_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_0_5_1_in_rule__FeatureMap__Group_0_0_5__1__Impl2621);
            rule__FeatureMap__RightFieldsAssignment_0_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_0_5__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_1__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1337:1: rule__FeatureMap__Group_0_1__0 : rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1 ;
    public final void rule__FeatureMap__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1341:1: ( rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1342:2: rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__0__Impl_in_rule__FeatureMap__Group_0_1__02655);
            rule__FeatureMap__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__1_in_rule__FeatureMap__Group_0_1__02658);
            rule__FeatureMap__Group_0_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__0


    // $ANTLR start rule__FeatureMap__Group_0_1__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1349:1: rule__FeatureMap__Group_0_1__0__Impl : ( 'set left' ) ;
    public final void rule__FeatureMap__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1353:1: ( ( 'set left' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1354:1: ( 'set left' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1354:1: ( 'set left' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1355:1: 'set left'
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_0_1_0()); 
            match(input,21,FOLLOW_21_in_rule__FeatureMap__Group_0_1__0__Impl2686); 
             after(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_1__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1368:1: rule__FeatureMap__Group_0_1__1 : rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2 ;
    public final void rule__FeatureMap__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1372:1: ( rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1373:2: rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__1__Impl_in_rule__FeatureMap__Group_0_1__12717);
            rule__FeatureMap__Group_0_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__2_in_rule__FeatureMap__Group_0_1__12720);
            rule__FeatureMap__Group_0_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__1


    // $ANTLR start rule__FeatureMap__Group_0_1__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1380:1: rule__FeatureMap__Group_0_1__1__Impl : ( ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 ) ) ;
    public final void rule__FeatureMap__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1384:1: ( ( ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1385:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1385:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1386:1: ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAssignment_0_1_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1387:1: ( rule__FeatureMap__SetLeftFieldAssignment_0_1_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1387:2: rule__FeatureMap__SetLeftFieldAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_0_1_1_in_rule__FeatureMap__Group_0_1__1__Impl2747);
            rule__FeatureMap__SetLeftFieldAssignment_0_1_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_1__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1397:1: rule__FeatureMap__Group_0_1__2 : rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3 ;
    public final void rule__FeatureMap__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1401:1: ( rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1402:2: rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__2__Impl_in_rule__FeatureMap__Group_0_1__22777);
            rule__FeatureMap__Group_0_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__3_in_rule__FeatureMap__Group_0_1__22780);
            rule__FeatureMap__Group_0_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__2


    // $ANTLR start rule__FeatureMap__Group_0_1__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1409:1: rule__FeatureMap__Group_0_1__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1413:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1414:1: ( '=' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1414:1: ( '=' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1415:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_1_2()); 
            match(input,22,FOLLOW_22_in_rule__FeatureMap__Group_0_1__2__Impl2808); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_1__3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1428:1: rule__FeatureMap__Group_0_1__3 : rule__FeatureMap__Group_0_1__3__Impl ;
    public final void rule__FeatureMap__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1432:1: ( rule__FeatureMap__Group_0_1__3__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1433:2: rule__FeatureMap__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__3__Impl_in_rule__FeatureMap__Group_0_1__32839);
            rule__FeatureMap__Group_0_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__3


    // $ANTLR start rule__FeatureMap__Group_0_1__3__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1439:1: rule__FeatureMap__Group_0_1__3__Impl : ( ( rule__FeatureMap__ExprAssignment_0_1_3 ) ) ;
    public final void rule__FeatureMap__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1443:1: ( ( ( rule__FeatureMap__ExprAssignment_0_1_3 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1444:1: ( ( rule__FeatureMap__ExprAssignment_0_1_3 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1444:1: ( ( rule__FeatureMap__ExprAssignment_0_1_3 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1445:1: ( rule__FeatureMap__ExprAssignment_0_1_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getExprAssignment_0_1_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1446:1: ( rule__FeatureMap__ExprAssignment_0_1_3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1446:2: rule__FeatureMap__ExprAssignment_0_1_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ExprAssignment_0_1_3_in_rule__FeatureMap__Group_0_1__3__Impl2866);
            rule__FeatureMap__ExprAssignment_0_1_3();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getExprAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_1__3__Impl


    // $ANTLR start rule__FeatureMap__Group_0_2__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1464:1: rule__FeatureMap__Group_0_2__0 : rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1 ;
    public final void rule__FeatureMap__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1468:1: ( rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1469:2: rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__0__Impl_in_rule__FeatureMap__Group_0_2__02904);
            rule__FeatureMap__Group_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__1_in_rule__FeatureMap__Group_0_2__02907);
            rule__FeatureMap__Group_0_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__0


    // $ANTLR start rule__FeatureMap__Group_0_2__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1476:1: rule__FeatureMap__Group_0_2__0__Impl : ( 'set right' ) ;
    public final void rule__FeatureMap__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1480:1: ( ( 'set right' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1481:1: ( 'set right' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1481:1: ( 'set right' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1482:1: 'set right'
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightKeyword_0_2_0()); 
            match(input,23,FOLLOW_23_in_rule__FeatureMap__Group_0_2__0__Impl2935); 
             after(grammarAccess.getFeatureMapAccess().getSetRightKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_2__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1495:1: rule__FeatureMap__Group_0_2__1 : rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2 ;
    public final void rule__FeatureMap__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1499:1: ( rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1500:2: rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__1__Impl_in_rule__FeatureMap__Group_0_2__12966);
            rule__FeatureMap__Group_0_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__2_in_rule__FeatureMap__Group_0_2__12969);
            rule__FeatureMap__Group_0_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__1


    // $ANTLR start rule__FeatureMap__Group_0_2__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1507:1: rule__FeatureMap__Group_0_2__1__Impl : ( ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 ) ) ;
    public final void rule__FeatureMap__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1511:1: ( ( ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1512:1: ( ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1512:1: ( ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1513:1: ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAssignment_0_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1514:1: ( rule__FeatureMap__SetRightFieldAssignment_0_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1514:2: rule__FeatureMap__SetRightFieldAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetRightFieldAssignment_0_2_1_in_rule__FeatureMap__Group_0_2__1__Impl2996);
            rule__FeatureMap__SetRightFieldAssignment_0_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_2__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1524:1: rule__FeatureMap__Group_0_2__2 : rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3 ;
    public final void rule__FeatureMap__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1528:1: ( rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1529:2: rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__2__Impl_in_rule__FeatureMap__Group_0_2__23026);
            rule__FeatureMap__Group_0_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__3_in_rule__FeatureMap__Group_0_2__23029);
            rule__FeatureMap__Group_0_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__2


    // $ANTLR start rule__FeatureMap__Group_0_2__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1536:1: rule__FeatureMap__Group_0_2__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1540:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1541:1: ( '=' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1541:1: ( '=' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1542:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_2_2()); 
            match(input,22,FOLLOW_22_in_rule__FeatureMap__Group_0_2__2__Impl3057); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_2__3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1555:1: rule__FeatureMap__Group_0_2__3 : rule__FeatureMap__Group_0_2__3__Impl ;
    public final void rule__FeatureMap__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1559:1: ( rule__FeatureMap__Group_0_2__3__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1560:2: rule__FeatureMap__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__3__Impl_in_rule__FeatureMap__Group_0_2__33088);
            rule__FeatureMap__Group_0_2__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__3


    // $ANTLR start rule__FeatureMap__Group_0_2__3__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1566:1: rule__FeatureMap__Group_0_2__3__Impl : ( ( rule__FeatureMap__ExprAssignment_0_2_3 ) ) ;
    public final void rule__FeatureMap__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1570:1: ( ( ( rule__FeatureMap__ExprAssignment_0_2_3 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1571:1: ( ( rule__FeatureMap__ExprAssignment_0_2_3 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1571:1: ( ( rule__FeatureMap__ExprAssignment_0_2_3 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1572:1: ( rule__FeatureMap__ExprAssignment_0_2_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getExprAssignment_0_2_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1573:1: ( rule__FeatureMap__ExprAssignment_0_2_3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1573:2: rule__FeatureMap__ExprAssignment_0_2_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ExprAssignment_0_2_3_in_rule__FeatureMap__Group_0_2__3__Impl3115);
            rule__FeatureMap__ExprAssignment_0_2_3();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getExprAssignment_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_2__3__Impl


    // $ANTLR start rule__FeatureMap__Group_0_3__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1591:1: rule__FeatureMap__Group_0_3__0 : rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1 ;
    public final void rule__FeatureMap__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1595:1: ( rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1596:2: rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__0__Impl_in_rule__FeatureMap__Group_0_3__03153);
            rule__FeatureMap__Group_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__1_in_rule__FeatureMap__Group_0_3__03156);
            rule__FeatureMap__Group_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__0


    // $ANTLR start rule__FeatureMap__Group_0_3__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1603:1: rule__FeatureMap__Group_0_3__0__Impl : ( 'ignore left' ) ;
    public final void rule__FeatureMap__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1607:1: ( ( 'ignore left' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1608:1: ( 'ignore left' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1608:1: ( 'ignore left' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1609:1: 'ignore left'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_0_3_0()); 
            match(input,24,FOLLOW_24_in_rule__FeatureMap__Group_0_3__0__Impl3184); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_3__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1622:1: rule__FeatureMap__Group_0_3__1 : rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2 ;
    public final void rule__FeatureMap__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1626:1: ( rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1627:2: rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__1__Impl_in_rule__FeatureMap__Group_0_3__13215);
            rule__FeatureMap__Group_0_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__2_in_rule__FeatureMap__Group_0_3__13218);
            rule__FeatureMap__Group_0_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__1


    // $ANTLR start rule__FeatureMap__Group_0_3__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1634:1: rule__FeatureMap__Group_0_3__1__Impl : ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 ) ) ;
    public final void rule__FeatureMap__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1638:1: ( ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1639:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1639:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1640:1: ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_3_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1641:1: ( rule__FeatureMap__LeftFieldsAssignment_0_3_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1641:2: rule__FeatureMap__LeftFieldsAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_3_1_in_rule__FeatureMap__Group_0_3__1__Impl3245);
            rule__FeatureMap__LeftFieldsAssignment_0_3_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_3__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1651:1: rule__FeatureMap__Group_0_3__2 : rule__FeatureMap__Group_0_3__2__Impl ;
    public final void rule__FeatureMap__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1655:1: ( rule__FeatureMap__Group_0_3__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1656:2: rule__FeatureMap__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__2__Impl_in_rule__FeatureMap__Group_0_3__23275);
            rule__FeatureMap__Group_0_3__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__2


    // $ANTLR start rule__FeatureMap__Group_0_3__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1662:1: rule__FeatureMap__Group_0_3__2__Impl : ( ( rule__FeatureMap__Group_0_3_2__0 )* ) ;
    public final void rule__FeatureMap__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1666:1: ( ( ( rule__FeatureMap__Group_0_3_2__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1667:1: ( ( rule__FeatureMap__Group_0_3_2__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1667:1: ( ( rule__FeatureMap__Group_0_3_2__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1668:1: ( rule__FeatureMap__Group_0_3_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_3_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1669:1: ( rule__FeatureMap__Group_0_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1669:2: rule__FeatureMap__Group_0_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_3_2__0_in_rule__FeatureMap__Group_0_3__2__Impl3302);
            	    rule__FeatureMap__Group_0_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_3_2__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1685:1: rule__FeatureMap__Group_0_3_2__0 : rule__FeatureMap__Group_0_3_2__0__Impl rule__FeatureMap__Group_0_3_2__1 ;
    public final void rule__FeatureMap__Group_0_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1689:1: ( rule__FeatureMap__Group_0_3_2__0__Impl rule__FeatureMap__Group_0_3_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1690:2: rule__FeatureMap__Group_0_3_2__0__Impl rule__FeatureMap__Group_0_3_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3_2__0__Impl_in_rule__FeatureMap__Group_0_3_2__03339);
            rule__FeatureMap__Group_0_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3_2__1_in_rule__FeatureMap__Group_0_3_2__03342);
            rule__FeatureMap__Group_0_3_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3_2__0


    // $ANTLR start rule__FeatureMap__Group_0_3_2__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1697:1: rule__FeatureMap__Group_0_3_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureMap__Group_0_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1701:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1702:1: ( ',' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1702:1: ( ',' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1703:1: ','
            {
             before(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_3_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_0_3_2__0__Impl3370); 
             after(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_3_2__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1716:1: rule__FeatureMap__Group_0_3_2__1 : rule__FeatureMap__Group_0_3_2__1__Impl ;
    public final void rule__FeatureMap__Group_0_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1720:1: ( rule__FeatureMap__Group_0_3_2__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1721:2: rule__FeatureMap__Group_0_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3_2__1__Impl_in_rule__FeatureMap__Group_0_3_2__13401);
            rule__FeatureMap__Group_0_3_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3_2__1


    // $ANTLR start rule__FeatureMap__Group_0_3_2__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1727:1: rule__FeatureMap__Group_0_3_2__1__Impl : ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 ) ) ;
    public final void rule__FeatureMap__Group_0_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1731:1: ( ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1732:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1732:1: ( ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1733:1: ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_3_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1734:1: ( rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1734:2: rule__FeatureMap__LeftFieldsAssignment_0_3_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_3_2_1_in_rule__FeatureMap__Group_0_3_2__1__Impl3428);
            rule__FeatureMap__LeftFieldsAssignment_0_3_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAssignment_0_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_3_2__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_4__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1748:1: rule__FeatureMap__Group_0_4__0 : rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1 ;
    public final void rule__FeatureMap__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1752:1: ( rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1753:2: rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__0__Impl_in_rule__FeatureMap__Group_0_4__03462);
            rule__FeatureMap__Group_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__1_in_rule__FeatureMap__Group_0_4__03465);
            rule__FeatureMap__Group_0_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__0


    // $ANTLR start rule__FeatureMap__Group_0_4__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1760:1: rule__FeatureMap__Group_0_4__0__Impl : ( 'ignore right' ) ;
    public final void rule__FeatureMap__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1764:1: ( ( 'ignore right' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1765:1: ( 'ignore right' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1765:1: ( 'ignore right' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1766:1: 'ignore right'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreRightKeyword_0_4_0()); 
            match(input,25,FOLLOW_25_in_rule__FeatureMap__Group_0_4__0__Impl3493); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreRightKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_4__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1779:1: rule__FeatureMap__Group_0_4__1 : rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2 ;
    public final void rule__FeatureMap__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1783:1: ( rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1784:2: rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__1__Impl_in_rule__FeatureMap__Group_0_4__13524);
            rule__FeatureMap__Group_0_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__2_in_rule__FeatureMap__Group_0_4__13527);
            rule__FeatureMap__Group_0_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__1


    // $ANTLR start rule__FeatureMap__Group_0_4__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1791:1: rule__FeatureMap__Group_0_4__1__Impl : ( ( rule__FeatureMap__RightFieldsAssignment_0_4_1 ) ) ;
    public final void rule__FeatureMap__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1795:1: ( ( ( rule__FeatureMap__RightFieldsAssignment_0_4_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1796:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_4_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1796:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_4_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1797:1: ( rule__FeatureMap__RightFieldsAssignment_0_4_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_4_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1798:1: ( rule__FeatureMap__RightFieldsAssignment_0_4_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1798:2: rule__FeatureMap__RightFieldsAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_4_1_in_rule__FeatureMap__Group_0_4__1__Impl3554);
            rule__FeatureMap__RightFieldsAssignment_0_4_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_4__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1808:1: rule__FeatureMap__Group_0_4__2 : rule__FeatureMap__Group_0_4__2__Impl ;
    public final void rule__FeatureMap__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1812:1: ( rule__FeatureMap__Group_0_4__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1813:2: rule__FeatureMap__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__2__Impl_in_rule__FeatureMap__Group_0_4__23584);
            rule__FeatureMap__Group_0_4__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__2


    // $ANTLR start rule__FeatureMap__Group_0_4__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1819:1: rule__FeatureMap__Group_0_4__2__Impl : ( ( rule__FeatureMap__Group_0_4_2__0 )* ) ;
    public final void rule__FeatureMap__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1823:1: ( ( ( rule__FeatureMap__Group_0_4_2__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1824:1: ( ( rule__FeatureMap__Group_0_4_2__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1824:1: ( ( rule__FeatureMap__Group_0_4_2__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1825:1: ( rule__FeatureMap__Group_0_4_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_4_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1826:1: ( rule__FeatureMap__Group_0_4_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1826:2: rule__FeatureMap__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__0_in_rule__FeatureMap__Group_0_4__2__Impl3611);
            	    rule__FeatureMap__Group_0_4_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0_4_2__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1842:1: rule__FeatureMap__Group_0_4_2__0 : rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1 ;
    public final void rule__FeatureMap__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1846:1: ( rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1847:2: rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__0__Impl_in_rule__FeatureMap__Group_0_4_2__03648);
            rule__FeatureMap__Group_0_4_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__1_in_rule__FeatureMap__Group_0_4_2__03651);
            rule__FeatureMap__Group_0_4_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4_2__0


    // $ANTLR start rule__FeatureMap__Group_0_4_2__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1854:1: rule__FeatureMap__Group_0_4_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureMap__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1858:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1859:1: ( ',' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1859:1: ( ',' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1860:1: ','
            {
             before(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_4_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_0_4_2__0__Impl3679); 
             after(grammarAccess.getFeatureMapAccess().getCommaKeyword_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_4_2__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1873:1: rule__FeatureMap__Group_0_4_2__1 : rule__FeatureMap__Group_0_4_2__1__Impl ;
    public final void rule__FeatureMap__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1877:1: ( rule__FeatureMap__Group_0_4_2__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1878:2: rule__FeatureMap__Group_0_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__1__Impl_in_rule__FeatureMap__Group_0_4_2__13710);
            rule__FeatureMap__Group_0_4_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4_2__1


    // $ANTLR start rule__FeatureMap__Group_0_4_2__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1884:1: rule__FeatureMap__Group_0_4_2__1__Impl : ( ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 ) ) ;
    public final void rule__FeatureMap__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1888:1: ( ( ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1889:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1889:1: ( ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1890:1: ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_4_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1891:1: ( rule__FeatureMap__RightFieldsAssignment_0_4_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1891:2: rule__FeatureMap__RightFieldsAssignment_0_4_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_4_2_1_in_rule__FeatureMap__Group_0_4_2__1__Impl3737);
            rule__FeatureMap__RightFieldsAssignment_0_4_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAssignment_0_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_4_2__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0_5__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1905:1: rule__FeatureMap__Group_0_5__0 : rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1 ;
    public final void rule__FeatureMap__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1909:1: ( rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1910:2: rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__0__Impl_in_rule__FeatureMap__Group_0_5__03771);
            rule__FeatureMap__Group_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__1_in_rule__FeatureMap__Group_0_5__03774);
            rule__FeatureMap__Group_0_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_5__0


    // $ANTLR start rule__FeatureMap__Group_0_5__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1917:1: rule__FeatureMap__Group_0_5__0__Impl : ( 'call module' ) ;
    public final void rule__FeatureMap__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1921:1: ( ( 'call module' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1922:1: ( 'call module' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1922:1: ( 'call module' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1923:1: 'call module'
            {
             before(grammarAccess.getFeatureMapAccess().getCallModuleKeyword_0_5_0()); 
            match(input,26,FOLLOW_26_in_rule__FeatureMap__Group_0_5__0__Impl3802); 
             after(grammarAccess.getFeatureMapAccess().getCallModuleKeyword_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_5__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0_5__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1936:1: rule__FeatureMap__Group_0_5__1 : rule__FeatureMap__Group_0_5__1__Impl ;
    public final void rule__FeatureMap__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1940:1: ( rule__FeatureMap__Group_0_5__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1941:2: rule__FeatureMap__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__1__Impl_in_rule__FeatureMap__Group_0_5__13833);
            rule__FeatureMap__Group_0_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_5__1


    // $ANTLR start rule__FeatureMap__Group_0_5__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1947:1: rule__FeatureMap__Group_0_5__1__Impl : ( ( rule__FeatureMap__ModuleAssignment_0_5_1 ) ) ;
    public final void rule__FeatureMap__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1951:1: ( ( ( rule__FeatureMap__ModuleAssignment_0_5_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1952:1: ( ( rule__FeatureMap__ModuleAssignment_0_5_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1952:1: ( ( rule__FeatureMap__ModuleAssignment_0_5_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1953:1: ( rule__FeatureMap__ModuleAssignment_0_5_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getModuleAssignment_0_5_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1954:1: ( rule__FeatureMap__ModuleAssignment_0_5_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1954:2: rule__FeatureMap__ModuleAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__ModuleAssignment_0_5_1_in_rule__FeatureMap__Group_0_5__1__Impl3860);
            rule__FeatureMap__ModuleAssignment_0_5_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getModuleAssignment_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_0_5__1__Impl


    // $ANTLR start rule__FeatureMap__Group_1__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1968:1: rule__FeatureMap__Group_1__0 : rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 ;
    public final void rule__FeatureMap__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1972:1: ( rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1973:2: rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__03894);
            rule__FeatureMap__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__03897);
            rule__FeatureMap__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__0


    // $ANTLR start rule__FeatureMap__Group_1__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1980:1: rule__FeatureMap__Group_1__0__Impl : ( 'rule' ) ;
    public final void rule__FeatureMap__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1984:1: ( ( 'rule' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1985:1: ( 'rule' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1985:1: ( 'rule' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1986:1: 'rule'
            {
             before(grammarAccess.getFeatureMapAccess().getRuleKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FeatureMap__Group_1__0__Impl3925); 
             after(grammarAccess.getFeatureMapAccess().getRuleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__0__Impl


    // $ANTLR start rule__FeatureMap__Group_1__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1999:1: rule__FeatureMap__Group_1__1 : rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 ;
    public final void rule__FeatureMap__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2003:1: ( rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2004:2: rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__13956);
            rule__FeatureMap__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__13959);
            rule__FeatureMap__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__1


    // $ANTLR start rule__FeatureMap__Group_1__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2011:1: rule__FeatureMap__Group_1__1__Impl : ( ( rule__FeatureMap__RulesAssignment_1_1 ) ) ;
    public final void rule__FeatureMap__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2015:1: ( ( ( rule__FeatureMap__RulesAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2016:1: ( ( rule__FeatureMap__RulesAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2016:1: ( ( rule__FeatureMap__RulesAssignment_1_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2017:1: ( rule__FeatureMap__RulesAssignment_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRulesAssignment_1_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2018:1: ( rule__FeatureMap__RulesAssignment_1_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2018:2: rule__FeatureMap__RulesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RulesAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl3986);
            rule__FeatureMap__RulesAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRulesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__1__Impl


    // $ANTLR start rule__FeatureMap__Group_1__2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2028:1: rule__FeatureMap__Group_1__2 : rule__FeatureMap__Group_1__2__Impl ;
    public final void rule__FeatureMap__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2032:1: ( rule__FeatureMap__Group_1__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2033:2: rule__FeatureMap__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__24016);
            rule__FeatureMap__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__2


    // $ANTLR start rule__FeatureMap__Group_1__2__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2039:1: rule__FeatureMap__Group_1__2__Impl : ( ( rule__FeatureMap__Group_1_2__0 )* ) ;
    public final void rule__FeatureMap__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2043:1: ( ( ( rule__FeatureMap__Group_1_2__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2044:1: ( ( rule__FeatureMap__Group_1_2__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2044:1: ( ( rule__FeatureMap__Group_1_2__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2045:1: ( rule__FeatureMap__Group_1_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_1_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2046:1: ( rule__FeatureMap__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2046:2: rule__FeatureMap__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_1_2__0_in_rule__FeatureMap__Group_1__2__Impl4043);
            	    rule__FeatureMap__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1__2__Impl


    // $ANTLR start rule__FeatureMap__Group_1_2__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2062:1: rule__FeatureMap__Group_1_2__0 : rule__FeatureMap__Group_1_2__0__Impl rule__FeatureMap__Group_1_2__1 ;
    public final void rule__FeatureMap__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2066:1: ( rule__FeatureMap__Group_1_2__0__Impl rule__FeatureMap__Group_1_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2067:2: rule__FeatureMap__Group_1_2__0__Impl rule__FeatureMap__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1_2__0__Impl_in_rule__FeatureMap__Group_1_2__04080);
            rule__FeatureMap__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1_2__1_in_rule__FeatureMap__Group_1_2__04083);
            rule__FeatureMap__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1_2__0


    // $ANTLR start rule__FeatureMap__Group_1_2__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2074:1: rule__FeatureMap__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__FeatureMap__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2078:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2079:1: ( ',' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2079:1: ( ',' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2080:1: ','
            {
             before(grammarAccess.getFeatureMapAccess().getCommaKeyword_1_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_1_2__0__Impl4111); 
             after(grammarAccess.getFeatureMapAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_1_2__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2093:1: rule__FeatureMap__Group_1_2__1 : rule__FeatureMap__Group_1_2__1__Impl ;
    public final void rule__FeatureMap__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2097:1: ( rule__FeatureMap__Group_1_2__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2098:2: rule__FeatureMap__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1_2__1__Impl_in_rule__FeatureMap__Group_1_2__14142);
            rule__FeatureMap__Group_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1_2__1


    // $ANTLR start rule__FeatureMap__Group_1_2__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2104:1: rule__FeatureMap__Group_1_2__1__Impl : ( ( rule__FeatureMap__RulesAssignment_1_2_1 ) ) ;
    public final void rule__FeatureMap__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2108:1: ( ( ( rule__FeatureMap__RulesAssignment_1_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2109:1: ( ( rule__FeatureMap__RulesAssignment_1_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2109:1: ( ( rule__FeatureMap__RulesAssignment_1_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2110:1: ( rule__FeatureMap__RulesAssignment_1_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRulesAssignment_1_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2111:1: ( rule__FeatureMap__RulesAssignment_1_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2111:2: rule__FeatureMap__RulesAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RulesAssignment_1_2_1_in_rule__FeatureMap__Group_1_2__1__Impl4169);
            rule__FeatureMap__RulesAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRulesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__Group_1_2__1__Impl


    // $ANTLR start rule__Model__NameAssignment_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2126:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2130:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2131:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2131:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2132:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14208);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NameAssignment_1


    // $ANTLR start rule__Model__DocumentationAssignment_2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2141:1: rule__Model__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2145:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2146:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2146:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2147:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__DocumentationAssignment_24239); 
             after(grammarAccess.getModelAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DocumentationAssignment_2


    // $ANTLR start rule__Model__MappingModulesAssignment_3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2156:1: rule__Model__MappingModulesAssignment_3 : ( ruleMappingModule ) ;
    public final void rule__Model__MappingModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2160:1: ( ( ruleMappingModule ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2161:1: ( ruleMappingModule )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2161:1: ( ruleMappingModule )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2162:1: ruleMappingModule
            {
             before(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment_34270);
            ruleMappingModule();
            _fsp--;

             after(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__MappingModulesAssignment_3


    // $ANTLR start rule__Model__RootsAssignment_4
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2171:1: rule__Model__RootsAssignment_4 : ( ruleRootModule ) ;
    public final void rule__Model__RootsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2175:1: ( ( ruleRootModule ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2176:1: ( ruleRootModule )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2176:1: ( ruleRootModule )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2177:1: ruleRootModule
            {
             before(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRootModule_in_rule__Model__RootsAssignment_44301);
            ruleRootModule();
            _fsp--;

             after(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__RootsAssignment_4


    // $ANTLR start rule__RootModule__RootRefAssignment_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2186:1: rule__RootModule__RootRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RootModule__RootRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2190:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2191:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2191:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2192:1: ( RULE_ID )
            {
             before(grammarAccess.getRootModuleAccess().getRootRefMappingModuleCrossReference_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2193:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2194:1: RULE_ID
            {
             before(grammarAccess.getRootModuleAccess().getRootRefMappingModuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootModule__RootRefAssignment_14336); 
             after(grammarAccess.getRootModuleAccess().getRootRefMappingModuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRootModuleAccess().getRootRefMappingModuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__RootRefAssignment_1


    // $ANTLR start rule__RootModule__DocumentationAssignment_2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2205:1: rule__RootModule__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RootModule__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2209:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2210:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2210:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2211:1: RULE_STRING
            {
             before(grammarAccess.getRootModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RootModule__DocumentationAssignment_24371); 
             after(grammarAccess.getRootModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RootModule__DocumentationAssignment_2


    // $ANTLR start rule__MappingModule__NameAssignment_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2220:1: rule__MappingModule__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__MappingModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2224:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2225:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2225:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2226:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_14402);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__NameAssignment_1


    // $ANTLR start rule__MappingModule__DocumentationAssignment_2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2235:1: rule__MappingModule__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MappingModule__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2239:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2240:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2240:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2241:1: RULE_STRING
            {
             before(grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MappingModule__DocumentationAssignment_24433); 
             after(grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__DocumentationAssignment_2


    // $ANTLR start rule__MappingModule__MappedFeaturesAssignment_4_0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2250:1: rule__MappingModule__MappedFeaturesAssignment_4_0 : ( ruleFeatureMap ) ;
    public final void rule__MappingModule__MappedFeaturesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2254:1: ( ( ruleFeatureMap ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2255:1: ( ruleFeatureMap )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2255:1: ( ruleFeatureMap )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2256:1: ruleFeatureMap
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_4_04464);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__MappedFeaturesAssignment_4_0


    // $ANTLR start rule__FeatureMap__LeftFieldsAssignment_0_0_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2265:1: rule__FeatureMap__LeftFieldsAssignment_0_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldsAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2269:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2270:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2270:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2271:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2272:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2273:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_0_14499);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__LeftFieldsAssignment_0_0_1


    // $ANTLR start rule__FeatureMap__LeftFieldsAssignment_0_0_2_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2284:1: rule__FeatureMap__LeftFieldsAssignment_0_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldsAssignment_0_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2288:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2289:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2289:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2290:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_2_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2291:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2292:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_0_2_14538);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_0_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__LeftFieldsAssignment_0_0_2_1


    // $ANTLR start rule__FeatureMap__RightFieldsAssignment_0_0_4
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2303:1: rule__FeatureMap__RightFieldsAssignment_0_0_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__RightFieldsAssignment_0_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2307:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2308:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2308:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2309:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_4_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2310:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2311:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_0_44577);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_4_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RightFieldsAssignment_0_0_4


    // $ANTLR start rule__FeatureMap__RightFieldsAssignment_0_0_5_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2322:1: rule__FeatureMap__RightFieldsAssignment_0_0_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__RightFieldsAssignment_0_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2326:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2327:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2327:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2328:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_5_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2329:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2330:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_5_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_0_5_14616);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_0_5_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RightFieldsAssignment_0_0_5_1


    // $ANTLR start rule__FeatureMap__SetLeftFieldAssignment_0_1_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2341:1: rule__FeatureMap__SetLeftFieldAssignment_0_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__SetLeftFieldAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2345:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2346:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2346:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2347:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_0_1_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2348:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2349:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeQualifiedNameParserRuleCall_0_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetLeftFieldAssignment_0_1_14655);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeQualifiedNameParserRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__SetLeftFieldAssignment_0_1_1


    // $ANTLR start rule__FeatureMap__ExprAssignment_0_1_3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2360:1: rule__FeatureMap__ExprAssignment_0_1_3 : ( ruleExpression ) ;
    public final void rule__FeatureMap__ExprAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2364:1: ( ( ruleExpression ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2365:1: ( ruleExpression )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2365:1: ( ruleExpression )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2366:1: ruleExpression
            {
             before(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_1_34690);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__ExprAssignment_0_1_3


    // $ANTLR start rule__FeatureMap__SetRightFieldAssignment_0_2_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2375:1: rule__FeatureMap__SetRightFieldAssignment_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__SetRightFieldAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2379:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2380:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2380:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2381:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_0_2_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2382:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2383:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeQualifiedNameParserRuleCall_0_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetRightFieldAssignment_0_2_14725);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeQualifiedNameParserRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__SetRightFieldAssignment_0_2_1


    // $ANTLR start rule__FeatureMap__ExprAssignment_0_2_3
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2394:1: rule__FeatureMap__ExprAssignment_0_2_3 : ( ruleExpression ) ;
    public final void rule__FeatureMap__ExprAssignment_0_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2398:1: ( ( ruleExpression ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2399:1: ( ruleExpression )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2399:1: ( ruleExpression )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2400:1: ruleExpression
            {
             before(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_2_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_2_34760);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__ExprAssignment_0_2_3


    // $ANTLR start rule__FeatureMap__LeftFieldsAssignment_0_3_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2409:1: rule__FeatureMap__LeftFieldsAssignment_0_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2413:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2414:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2414:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2415:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2416:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2417:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_3_14795);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__LeftFieldsAssignment_0_3_1


    // $ANTLR start rule__FeatureMap__LeftFieldsAssignment_0_3_2_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2428:1: rule__FeatureMap__LeftFieldsAssignment_0_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldsAssignment_0_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2432:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2433:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2433:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2434:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_2_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2435:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2436:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_3_2_14834);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeQualifiedNameParserRuleCall_0_3_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldsAttributeCrossReference_0_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__LeftFieldsAssignment_0_3_2_1


    // $ANTLR start rule__FeatureMap__RightFieldsAssignment_0_4_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2447:1: rule__FeatureMap__RightFieldsAssignment_0_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__RightFieldsAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2451:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2452:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2452:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2453:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2454:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2455:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_4_14873);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RightFieldsAssignment_0_4_1


    // $ANTLR start rule__FeatureMap__RightFieldsAssignment_0_4_2_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2466:1: rule__FeatureMap__RightFieldsAssignment_0_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__RightFieldsAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2470:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2471:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2471:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2472:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_2_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2473:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2474:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_4_2_14912);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeQualifiedNameParserRuleCall_0_4_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldsAttributeCrossReference_0_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RightFieldsAssignment_0_4_2_1


    // $ANTLR start rule__FeatureMap__ModuleAssignment_0_5_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2485:1: rule__FeatureMap__ModuleAssignment_0_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__ModuleAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2489:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2490:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2490:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2491:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getModuleMappingModuleCrossReference_0_5_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2492:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2493:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getModuleMappingModuleIDTerminalRuleCall_0_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__ModuleAssignment_0_5_14951); 
             after(grammarAccess.getFeatureMapAccess().getModuleMappingModuleIDTerminalRuleCall_0_5_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getModuleMappingModuleCrossReference_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__ModuleAssignment_0_5_1


    // $ANTLR start rule__FeatureMap__RulesAssignment_1_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2504:1: rule__FeatureMap__RulesAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__RulesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2508:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2509:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2509:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2510:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__RulesAssignment_1_14986); 
             after(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RulesAssignment_1_1


    // $ANTLR start rule__FeatureMap__RulesAssignment_1_2_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2519:1: rule__FeatureMap__RulesAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__RulesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2523:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2524:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2524:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2525:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__RulesAssignment_1_2_15017); 
             after(grammarAccess.getFeatureMapAccess().getRulesSTRINGTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__RulesAssignment_1_2_1


    // $ANTLR start rule__FeatureMap__DocumentationAssignment_2
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2534:1: rule__FeatureMap__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2538:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2539:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2539:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2540:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_25048); 
             after(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FeatureMap__DocumentationAssignment_2


    // $ANTLR start rule__Expression__ValueAssignment_0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2549:1: rule__Expression__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2553:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2554:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2554:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2555:1: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_05079); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__ValueAssignment_0


    // $ANTLR start rule__Expression__IntValueAssignment_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2564:1: rule__Expression__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Expression__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2568:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2569:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2569:1: ( RULE_INT )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:2570:1: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Expression__IntValueAssignment_15110); 
             after(grammarAccess.getExpressionAccess().getIntValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__IntValueAssignment_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootModule_in_entryRuleRootModule183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootModule190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__0_in_ruleRootModule216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__0_in_ruleFeatureMap336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__0_in_rule__FeatureMap__Alternatives_0432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__0_in_rule__FeatureMap__Alternatives_0450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__0_in_rule__FeatureMap__Alternatives_0468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__0_in_rule__FeatureMap__Alternatives_0486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__0_in_rule__FeatureMap__Alternatives_0504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__0_in_rule__FeatureMap__Alternatives_0522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAssignment_0_in_rule__Expression__Alternatives555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__IntValueAssignment_1_in_rule__Expression__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1666 = new BitSet(new long[]{0x0000000000006022L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2726 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DocumentationAssignment_2_in_rule__Model__Group__2__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3787 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MappingModulesAssignment_3_in_rule__Model__Group__3__Impl817 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RootsAssignment_4_in_rule__Model__Group__4__Impl875 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0917 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1003 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedName__Group_1__0__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__0__Impl_in_rule__RootModule__Group__01160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootModule__Group__1_in_rule__RootModule__Group__01163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RootModule__Group__0__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__1__Impl_in_rule__RootModule__Group__11222 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__RootModule__Group__2_in_rule__RootModule__Group__11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__RootRefAssignment_1_in_rule__RootModule__Group__1__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__2__Impl_in_rule__RootModule__Group__21282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__DocumentationAssignment_2_in_rule__RootModule__Group__2__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__01346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MappingModule__Group__0__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__11408 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__21468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__21471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__DocumentationAssignment_2_in_rule__MappingModule__Group__2__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__31529 = new BitSet(new long[]{0x0000000007A50000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__31532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MappingModule__Group__3__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__41591 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__41594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_4__0_in_rule__MappingModule__Group__4__Impl1621 = new BitSet(new long[]{0x0000000007A40002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__51652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MappingModule__Group__5__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_4__0__Impl_in_rule__MappingModule__Group_4__01723 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_4__1_in_rule__MappingModule__Group_4__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__MappedFeaturesAssignment_4_0_in_rule__MappingModule__Group_4__0__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_4__1__Impl_in_rule__MappingModule__Group_4__11783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MappingModule__Group_4__1__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__0__Impl_in_rule__FeatureMap__Group__01849 = new BitSet(new long[]{0x0000000008000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__1_in_rule__FeatureMap__Group__01852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Alternatives_0_in_rule__FeatureMap__Group__0__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__1__Impl_in_rule__FeatureMap__Group__11909 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__2_in_rule__FeatureMap__Group__11912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Group__1__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__2__Impl_in_rule__FeatureMap__Group__21970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__DocumentationAssignment_2_in_rule__FeatureMap__Group__2__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__0__Impl_in_rule__FeatureMap__Group_0_0__02034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__1_in_rule__FeatureMap__Group_0_0__02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FeatureMap__Group_0_0__0__Impl2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__1__Impl_in_rule__FeatureMap__Group_0_0__12096 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__2_in_rule__FeatureMap__Group_0_0__12099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_0_1_in_rule__FeatureMap__Group_0_0__1__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__2__Impl_in_rule__FeatureMap__Group_0_0__22156 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__3_in_rule__FeatureMap__Group_0_0__22159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_2__0_in_rule__FeatureMap__Group_0_0__2__Impl2186 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__3__Impl_in_rule__FeatureMap__Group_0_0__32217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__4_in_rule__FeatureMap__Group_0_0__32220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeatureMap__Group_0_0__3__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__4__Impl_in_rule__FeatureMap__Group_0_0__42279 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__5_in_rule__FeatureMap__Group_0_0__42282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_0_4_in_rule__FeatureMap__Group_0_0__4__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__5__Impl_in_rule__FeatureMap__Group_0_0__52339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_5__0_in_rule__FeatureMap__Group_0_0__5__Impl2366 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_2__0__Impl_in_rule__FeatureMap__Group_0_0_2__02409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_2__1_in_rule__FeatureMap__Group_0_0_2__02412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_0_0_2__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_2__1__Impl_in_rule__FeatureMap__Group_0_0_2__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_0_2_1_in_rule__FeatureMap__Group_0_0_2__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_5__0__Impl_in_rule__FeatureMap__Group_0_0_5__02532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_5__1_in_rule__FeatureMap__Group_0_0_5__02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_0_0_5__0__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0_5__1__Impl_in_rule__FeatureMap__Group_0_0_5__12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_0_5_1_in_rule__FeatureMap__Group_0_0_5__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__0__Impl_in_rule__FeatureMap__Group_0_1__02655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__1_in_rule__FeatureMap__Group_0_1__02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FeatureMap__Group_0_1__0__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__1__Impl_in_rule__FeatureMap__Group_0_1__12717 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__2_in_rule__FeatureMap__Group_0_1__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_0_1_1_in_rule__FeatureMap__Group_0_1__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__2__Impl_in_rule__FeatureMap__Group_0_1__22777 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__3_in_rule__FeatureMap__Group_0_1__22780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FeatureMap__Group_0_1__2__Impl2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__3__Impl_in_rule__FeatureMap__Group_0_1__32839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ExprAssignment_0_1_3_in_rule__FeatureMap__Group_0_1__3__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__0__Impl_in_rule__FeatureMap__Group_0_2__02904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__1_in_rule__FeatureMap__Group_0_2__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FeatureMap__Group_0_2__0__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__1__Impl_in_rule__FeatureMap__Group_0_2__12966 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__2_in_rule__FeatureMap__Group_0_2__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetRightFieldAssignment_0_2_1_in_rule__FeatureMap__Group_0_2__1__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__2__Impl_in_rule__FeatureMap__Group_0_2__23026 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__3_in_rule__FeatureMap__Group_0_2__23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FeatureMap__Group_0_2__2__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__3__Impl_in_rule__FeatureMap__Group_0_2__33088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ExprAssignment_0_2_3_in_rule__FeatureMap__Group_0_2__3__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__0__Impl_in_rule__FeatureMap__Group_0_3__03153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__1_in_rule__FeatureMap__Group_0_3__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FeatureMap__Group_0_3__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__1__Impl_in_rule__FeatureMap__Group_0_3__13215 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__2_in_rule__FeatureMap__Group_0_3__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_3_1_in_rule__FeatureMap__Group_0_3__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__2__Impl_in_rule__FeatureMap__Group_0_3__23275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3_2__0_in_rule__FeatureMap__Group_0_3__2__Impl3302 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3_2__0__Impl_in_rule__FeatureMap__Group_0_3_2__03339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3_2__1_in_rule__FeatureMap__Group_0_3_2__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_0_3_2__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3_2__1__Impl_in_rule__FeatureMap__Group_0_3_2__13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldsAssignment_0_3_2_1_in_rule__FeatureMap__Group_0_3_2__1__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__0__Impl_in_rule__FeatureMap__Group_0_4__03462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__1_in_rule__FeatureMap__Group_0_4__03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FeatureMap__Group_0_4__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__1__Impl_in_rule__FeatureMap__Group_0_4__13524 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__2_in_rule__FeatureMap__Group_0_4__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_4_1_in_rule__FeatureMap__Group_0_4__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__2__Impl_in_rule__FeatureMap__Group_0_4__23584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__0_in_rule__FeatureMap__Group_0_4__2__Impl3611 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__0__Impl_in_rule__FeatureMap__Group_0_4_2__03648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__1_in_rule__FeatureMap__Group_0_4_2__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_0_4_2__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__1__Impl_in_rule__FeatureMap__Group_0_4_2__13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldsAssignment_0_4_2_1_in_rule__FeatureMap__Group_0_4_2__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__0__Impl_in_rule__FeatureMap__Group_0_5__03771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__1_in_rule__FeatureMap__Group_0_5__03774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FeatureMap__Group_0_5__0__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__1__Impl_in_rule__FeatureMap__Group_0_5__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ModuleAssignment_0_5_1_in_rule__FeatureMap__Group_0_5__1__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__03894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__03897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FeatureMap__Group_1__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__13956 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RulesAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__24016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1_2__0_in_rule__FeatureMap__Group_1__2__Impl4043 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1_2__0__Impl_in_rule__FeatureMap__Group_1_2__04080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1_2__1_in_rule__FeatureMap__Group_1_2__04083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_1_2__0__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1_2__1__Impl_in_rule__FeatureMap__Group_1_2__14142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RulesAssignment_1_2_1_in_rule__FeatureMap__Group_1_2__1__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__DocumentationAssignment_24239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment_34270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootModule_in_rule__Model__RootsAssignment_44301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootModule__RootRefAssignment_14336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RootModule__DocumentationAssignment_24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MappingModule__DocumentationAssignment_24433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_4_04464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_0_14499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_0_2_14538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_0_44577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_0_5_14616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetLeftFieldAssignment_0_1_14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_1_34690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetRightFieldAssignment_0_2_14725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_2_34760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_3_14795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldsAssignment_0_3_2_14834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_4_14873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldsAssignment_0_4_2_14912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__ModuleAssignment_0_5_14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__RulesAssignment_1_14986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__RulesAssignment_1_2_15017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_25048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_05079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Expression__IntValueAssignment_15110 = new BitSet(new long[]{0x0000000000000002L});

}