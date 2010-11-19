package fr.chaunier.xtext.map.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.map.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'module'", "'{'", "'}'", "'mapClass'", "'between'", "'and'", "';'", "'map'", "'=>'", "'set left'", "'='", "'set right'", "'ignore left'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMapDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g"; }


     
     	private MapDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapDslGrammarAccess grammarAccess) {
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:62:1: ( ruleModel EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:63:1: ruleModel EOF
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:70:1: ruleModel : ( ( rule__Model__MappingModulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:74:2: ( ( ( rule__Model__MappingModulesAssignment )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:75:1: ( ( rule__Model__MappingModulesAssignment )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:75:1: ( ( rule__Model__MappingModulesAssignment )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:76:1: ( rule__Model__MappingModulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getMappingModulesAssignment()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:77:1: ( rule__Model__MappingModulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:77:2: rule__Model__MappingModulesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__MappingModulesAssignment_in_ruleModel94);
            	    rule__Model__MappingModulesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMappingModulesAssignment()); 

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


    // $ANTLR start entryRuleImport
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:90:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:91:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport122);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport129); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:105:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport155);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:117:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:118:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:119:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard182);
            ruleQualifiedNameWithWildCard();
            _fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard189); 

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
    // $ANTLR end entryRuleQualifiedNameWithWildCard


    // $ANTLR start ruleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:126:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:130:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:132:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:133:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:133:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard215);
            rule__QualifiedNameWithWildCard__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 

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
    // $ANTLR end ruleQualifiedNameWithWildCard


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:147:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName249); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275);
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


    // $ANTLR start entryRuleMappingModule
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:173:1: entryRuleMappingModule : ruleMappingModule EOF ;
    public final void entryRuleMappingModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:174:1: ( ruleMappingModule EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:175:1: ruleMappingModule EOF
            {
             before(grammarAccess.getMappingModuleRule()); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule302);
            ruleMappingModule();
            _fsp--;

             after(grammarAccess.getMappingModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule309); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:182:1: ruleMappingModule : ( ( rule__MappingModule__Group__0 ) ) ;
    public final void ruleMappingModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:186:2: ( ( ( rule__MappingModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:187:1: ( ( rule__MappingModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:187:1: ( ( rule__MappingModule__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:188:1: ( rule__MappingModule__Group__0 )
            {
             before(grammarAccess.getMappingModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:189:1: ( rule__MappingModule__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:189:2: rule__MappingModule__Group__0
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule335);
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


    // $ANTLR start entryRuleMapping
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:201:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:202:1: ( ruleMapping EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:203:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping362);
            ruleMapping();
            _fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping369); 

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
    // $ANTLR end entryRuleMapping


    // $ANTLR start ruleMapping
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:210:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:214:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:215:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:215:1: ( ( rule__Mapping__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:216:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:217:1: ( rule__Mapping__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:217:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping395);
            rule__Mapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

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
    // $ANTLR end ruleMapping


    // $ANTLR start entryRuleFeatureMap
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:229:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:230:1: ( ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:231:1: ruleFeatureMap EOF
            {
             before(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap422);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getFeatureMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap429); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:238:1: ruleFeatureMap : ( ( rule__FeatureMap__Alternatives ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:242:2: ( ( ( rule__FeatureMap__Alternatives ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:243:1: ( ( rule__FeatureMap__Alternatives ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:243:1: ( ( rule__FeatureMap__Alternatives ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:244:1: ( rule__FeatureMap__Alternatives )
            {
             before(grammarAccess.getFeatureMapAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:245:1: ( rule__FeatureMap__Alternatives )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:245:2: rule__FeatureMap__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureMap__Alternatives_in_ruleFeatureMap455);
            rule__FeatureMap__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAlternatives()); 

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


    // $ANTLR start rule__FeatureMap__Alternatives
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:257:1: rule__FeatureMap__Alternatives : ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) );
    public final void rule__FeatureMap__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:261:1: ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("257:1: rule__FeatureMap__Alternatives : ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:262:1: ( ( rule__FeatureMap__Group_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:262:1: ( ( rule__FeatureMap__Group_0__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:263:1: ( rule__FeatureMap__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:264:1: ( rule__FeatureMap__Group_0__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:264:2: rule__FeatureMap__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0__0_in_rule__FeatureMap__Alternatives491);
                    rule__FeatureMap__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:268:6: ( ( rule__FeatureMap__Group_1__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:268:6: ( ( rule__FeatureMap__Group_1__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:269:1: ( rule__FeatureMap__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_1()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:270:1: ( rule__FeatureMap__Group_1__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:270:2: rule__FeatureMap__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Alternatives509);
                    rule__FeatureMap__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:274:6: ( ( rule__FeatureMap__Group_2__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:274:6: ( ( rule__FeatureMap__Group_2__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:275:1: ( rule__FeatureMap__Group_2__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_2()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:276:1: ( rule__FeatureMap__Group_2__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:276:2: rule__FeatureMap__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_2__0_in_rule__FeatureMap__Alternatives527);
                    rule__FeatureMap__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:280:6: ( ( rule__FeatureMap__Group_3__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:280:6: ( ( rule__FeatureMap__Group_3__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:281:1: ( rule__FeatureMap__Group_3__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_3()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:282:1: ( rule__FeatureMap__Group_3__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:282:2: rule__FeatureMap__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_3__0_in_rule__FeatureMap__Alternatives545);
                    rule__FeatureMap__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_3()); 

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
    // $ANTLR end rule__FeatureMap__Alternatives


    // $ANTLR start rule__Import__Group__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:293:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:297:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:298:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0576);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0579);
            rule__Import__Group__1();
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
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:305:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:309:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:310:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:310:1: ( 'import' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:311:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl607); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end rule__Import__Group__0__Impl


    // $ANTLR start rule__Import__Group__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:324:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:328:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:329:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1638);
            rule__Import__Group__1__Impl();
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
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Import__Group__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:335:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:339:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:340:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:340:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:341:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:342:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:342:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl665);
            rule__Import__ImportedNamespaceAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end rule__Import__Group__1__Impl


    // $ANTLR start rule__QualifiedNameWithWildCard__Group__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:356:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:360:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:361:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__0699);
            rule__QualifiedNameWithWildCard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__0702);
            rule__QualifiedNameWithWildCard__Group__1();
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
    // $ANTLR end rule__QualifiedNameWithWildCard__Group__0


    // $ANTLR start rule__QualifiedNameWithWildCard__Group__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:368:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:372:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:373:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:373:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:374:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl729);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end rule__QualifiedNameWithWildCard__Group__0__Impl


    // $ANTLR start rule__QualifiedNameWithWildCard__Group__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:385:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:389:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:390:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__1758);
            rule__QualifiedNameWithWildCard__Group__1__Impl();
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
    // $ANTLR end rule__QualifiedNameWithWildCard__Group__1


    // $ANTLR start rule__QualifiedNameWithWildCard__Group__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:396:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:400:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:401:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:401:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:402:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:403:1: ( '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:404:2: '.*'
                    {
                    match(input,12,FOLLOW_12_in_rule__QualifiedNameWithWildCard__Group__1__Impl787); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end rule__QualifiedNameWithWildCard__Group__1__Impl


    // $ANTLR start rule__QualifiedName__Group__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:419:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:423:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:424:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0824);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0827);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:431:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:435:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:436:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:436:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:437:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl854); 
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:448:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:452:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:453:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1883);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:459:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:463:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:464:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:464:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:465:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:466:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:466:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl910);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:480:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:484:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:485:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0945);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0948);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:492:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:496:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:497:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:497:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:498:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl976); 
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:511:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:515:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:516:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11007);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:522:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:526:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:527:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:527:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:528:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1034); 
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


    // $ANTLR start rule__MappingModule__Group__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:543:1: rule__MappingModule__Group__0 : rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 ;
    public final void rule__MappingModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:547:1: ( rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:548:2: rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__01067);
            rule__MappingModule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__01070);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:555:1: rule__MappingModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__MappingModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:559:1: ( ( 'module' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:560:1: ( 'module' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:560:1: ( 'module' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:561:1: 'module'
            {
             before(grammarAccess.getMappingModuleAccess().getModuleKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__MappingModule__Group__0__Impl1098); 
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:574:1: rule__MappingModule__Group__1 : rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 ;
    public final void rule__MappingModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:578:1: ( rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:579:2: rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__11129);
            rule__MappingModule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__11132);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:586:1: rule__MappingModule__Group__1__Impl : ( ( rule__MappingModule__NameAssignment_1 ) ) ;
    public final void rule__MappingModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:590:1: ( ( ( rule__MappingModule__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:591:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:591:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:592:1: ( rule__MappingModule__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModuleAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:593:1: ( rule__MappingModule__NameAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:593:2: rule__MappingModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl1159);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:603:1: rule__MappingModule__Group__2 : rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 ;
    public final void rule__MappingModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:607:1: ( rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:608:2: rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__21189);
            rule__MappingModule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__21192);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:615:1: rule__MappingModule__Group__2__Impl : ( '{' ) ;
    public final void rule__MappingModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:619:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:620:1: ( '{' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:620:1: ( '{' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:621:1: '{'
            {
             before(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__MappingModule__Group__2__Impl1220); 
             after(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:634:1: rule__MappingModule__Group__3 : rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 ;
    public final void rule__MappingModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:638:1: ( rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:639:2: rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__31251);
            rule__MappingModule__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__31254);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:646:1: rule__MappingModule__Group__3__Impl : ( ( rule__MappingModule__ImportsAssignment_3 )* ) ;
    public final void rule__MappingModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:650:1: ( ( ( rule__MappingModule__ImportsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:651:1: ( ( rule__MappingModule__ImportsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:651:1: ( ( rule__MappingModule__ImportsAssignment_3 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:652:1: ( rule__MappingModule__ImportsAssignment_3 )*
            {
             before(grammarAccess.getMappingModuleAccess().getImportsAssignment_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:653:1: ( rule__MappingModule__ImportsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:653:2: rule__MappingModule__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MappingModule__ImportsAssignment_3_in_rule__MappingModule__Group__3__Impl1281);
            	    rule__MappingModule__ImportsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMappingModuleAccess().getImportsAssignment_3()); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:663:1: rule__MappingModule__Group__4 : rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 ;
    public final void rule__MappingModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:667:1: ( rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:668:2: rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__41312);
            rule__MappingModule__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__41315);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:675:1: rule__MappingModule__Group__4__Impl : ( ( rule__MappingModule__MappingsAssignment_4 )* ) ;
    public final void rule__MappingModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:679:1: ( ( ( rule__MappingModule__MappingsAssignment_4 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:680:1: ( ( rule__MappingModule__MappingsAssignment_4 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:680:1: ( ( rule__MappingModule__MappingsAssignment_4 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:681:1: ( rule__MappingModule__MappingsAssignment_4 )*
            {
             before(grammarAccess.getMappingModuleAccess().getMappingsAssignment_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:682:1: ( rule__MappingModule__MappingsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:682:2: rule__MappingModule__MappingsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__MappingModule__MappingsAssignment_4_in_rule__MappingModule__Group__4__Impl1342);
            	    rule__MappingModule__MappingsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMappingModuleAccess().getMappingsAssignment_4()); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:692:1: rule__MappingModule__Group__5 : rule__MappingModule__Group__5__Impl ;
    public final void rule__MappingModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:696:1: ( rule__MappingModule__Group__5__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:697:2: rule__MappingModule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__51373);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:703:1: rule__MappingModule__Group__5__Impl : ( '}' ) ;
    public final void rule__MappingModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:707:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:708:1: ( '}' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:708:1: ( '}' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:709:1: '}'
            {
             before(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__MappingModule__Group__5__Impl1401); 
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


    // $ANTLR start rule__Mapping__Group__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:734:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:738:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:739:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__01444);
            rule__Mapping__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__01447);
            rule__Mapping__Group__1();
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
    // $ANTLR end rule__Mapping__Group__0


    // $ANTLR start rule__Mapping__Group__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:746:1: rule__Mapping__Group__0__Impl : ( 'mapClass' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:750:1: ( ( 'mapClass' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:751:1: ( 'mapClass' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:751:1: ( 'mapClass' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:752:1: 'mapClass'
            {
             before(grammarAccess.getMappingAccess().getMapClassKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Mapping__Group__0__Impl1475); 
             after(grammarAccess.getMappingAccess().getMapClassKeyword_0()); 

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
    // $ANTLR end rule__Mapping__Group__0__Impl


    // $ANTLR start rule__Mapping__Group__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:765:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:769:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:770:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__11506);
            rule__Mapping__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__11509);
            rule__Mapping__Group__2();
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
    // $ANTLR end rule__Mapping__Group__1


    // $ANTLR start rule__Mapping__Group__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:777:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 )? ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:781:1: ( ( ( rule__Mapping__NameAssignment_1 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:782:1: ( ( rule__Mapping__NameAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:782:1: ( ( rule__Mapping__NameAssignment_1 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:783:1: ( rule__Mapping__NameAssignment_1 )?
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:784:1: ( rule__Mapping__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:784:2: rule__Mapping__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl1536);
                    rule__Mapping__NameAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__Mapping__Group__1__Impl


    // $ANTLR start rule__Mapping__Group__2
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:794:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:798:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:799:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__21567);
            rule__Mapping__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__21570);
            rule__Mapping__Group__3();
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
    // $ANTLR end rule__Mapping__Group__2


    // $ANTLR start rule__Mapping__Group__2__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:806:1: rule__Mapping__Group__2__Impl : ( 'between' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:810:1: ( ( 'between' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:811:1: ( 'between' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:811:1: ( 'between' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:812:1: 'between'
            {
             before(grammarAccess.getMappingAccess().getBetweenKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Mapping__Group__2__Impl1598); 
             after(grammarAccess.getMappingAccess().getBetweenKeyword_2()); 

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
    // $ANTLR end rule__Mapping__Group__2__Impl


    // $ANTLR start rule__Mapping__Group__3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:825:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:829:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:830:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__31629);
            rule__Mapping__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__31632);
            rule__Mapping__Group__4();
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
    // $ANTLR end rule__Mapping__Group__3


    // $ANTLR start rule__Mapping__Group__3__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:837:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__LeftClassAssignment_3 ) ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:841:1: ( ( ( rule__Mapping__LeftClassAssignment_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:842:1: ( ( rule__Mapping__LeftClassAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:842:1: ( ( rule__Mapping__LeftClassAssignment_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:843:1: ( rule__Mapping__LeftClassAssignment_3 )
            {
             before(grammarAccess.getMappingAccess().getLeftClassAssignment_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:844:1: ( rule__Mapping__LeftClassAssignment_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:844:2: rule__Mapping__LeftClassAssignment_3
            {
            pushFollow(FOLLOW_rule__Mapping__LeftClassAssignment_3_in_rule__Mapping__Group__3__Impl1659);
            rule__Mapping__LeftClassAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getLeftClassAssignment_3()); 

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
    // $ANTLR end rule__Mapping__Group__3__Impl


    // $ANTLR start rule__Mapping__Group__4
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:854:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:858:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:859:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__41689);
            rule__Mapping__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__5_in_rule__Mapping__Group__41692);
            rule__Mapping__Group__5();
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
    // $ANTLR end rule__Mapping__Group__4


    // $ANTLR start rule__Mapping__Group__4__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:866:1: rule__Mapping__Group__4__Impl : ( 'and' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:870:1: ( ( 'and' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:871:1: ( 'and' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:871:1: ( 'and' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:872:1: 'and'
            {
             before(grammarAccess.getMappingAccess().getAndKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Mapping__Group__4__Impl1720); 
             after(grammarAccess.getMappingAccess().getAndKeyword_4()); 

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
    // $ANTLR end rule__Mapping__Group__4__Impl


    // $ANTLR start rule__Mapping__Group__5
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:885:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:889:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:890:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_rule__Mapping__Group__5__Impl_in_rule__Mapping__Group__51751);
            rule__Mapping__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__6_in_rule__Mapping__Group__51754);
            rule__Mapping__Group__6();
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
    // $ANTLR end rule__Mapping__Group__5


    // $ANTLR start rule__Mapping__Group__5__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:897:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__RightClassAssignment_5 ) ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:901:1: ( ( ( rule__Mapping__RightClassAssignment_5 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:902:1: ( ( rule__Mapping__RightClassAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:902:1: ( ( rule__Mapping__RightClassAssignment_5 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:903:1: ( rule__Mapping__RightClassAssignment_5 )
            {
             before(grammarAccess.getMappingAccess().getRightClassAssignment_5()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:904:1: ( rule__Mapping__RightClassAssignment_5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:904:2: rule__Mapping__RightClassAssignment_5
            {
            pushFollow(FOLLOW_rule__Mapping__RightClassAssignment_5_in_rule__Mapping__Group__5__Impl1781);
            rule__Mapping__RightClassAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getRightClassAssignment_5()); 

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
    // $ANTLR end rule__Mapping__Group__5__Impl


    // $ANTLR start rule__Mapping__Group__6
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:914:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:918:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:919:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_rule__Mapping__Group__6__Impl_in_rule__Mapping__Group__61811);
            rule__Mapping__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__7_in_rule__Mapping__Group__61814);
            rule__Mapping__Group__7();
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
    // $ANTLR end rule__Mapping__Group__6


    // $ANTLR start rule__Mapping__Group__6__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:926:1: rule__Mapping__Group__6__Impl : ( ( rule__Mapping__DocumentationAssignment_6 )? ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:930:1: ( ( ( rule__Mapping__DocumentationAssignment_6 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:931:1: ( ( rule__Mapping__DocumentationAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:931:1: ( ( rule__Mapping__DocumentationAssignment_6 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:932:1: ( rule__Mapping__DocumentationAssignment_6 )?
            {
             before(grammarAccess.getMappingAccess().getDocumentationAssignment_6()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:933:1: ( rule__Mapping__DocumentationAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:933:2: rule__Mapping__DocumentationAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Mapping__DocumentationAssignment_6_in_rule__Mapping__Group__6__Impl1841);
                    rule__Mapping__DocumentationAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getDocumentationAssignment_6()); 

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
    // $ANTLR end rule__Mapping__Group__6__Impl


    // $ANTLR start rule__Mapping__Group__7
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:943:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl rule__Mapping__Group__8 ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:947:1: ( rule__Mapping__Group__7__Impl rule__Mapping__Group__8 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:948:2: rule__Mapping__Group__7__Impl rule__Mapping__Group__8
            {
            pushFollow(FOLLOW_rule__Mapping__Group__7__Impl_in_rule__Mapping__Group__71872);
            rule__Mapping__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__8_in_rule__Mapping__Group__71875);
            rule__Mapping__Group__8();
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
    // $ANTLR end rule__Mapping__Group__7


    // $ANTLR start rule__Mapping__Group__7__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:955:1: rule__Mapping__Group__7__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:959:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:960:1: ( '{' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:960:1: ( '{' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:961:1: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Mapping__Group__7__Impl1903); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end rule__Mapping__Group__7__Impl


    // $ANTLR start rule__Mapping__Group__8
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:974:1: rule__Mapping__Group__8 : rule__Mapping__Group__8__Impl rule__Mapping__Group__9 ;
    public final void rule__Mapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:978:1: ( rule__Mapping__Group__8__Impl rule__Mapping__Group__9 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:979:2: rule__Mapping__Group__8__Impl rule__Mapping__Group__9
            {
            pushFollow(FOLLOW_rule__Mapping__Group__8__Impl_in_rule__Mapping__Group__81934);
            rule__Mapping__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__9_in_rule__Mapping__Group__81937);
            rule__Mapping__Group__9();
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
    // $ANTLR end rule__Mapping__Group__8


    // $ANTLR start rule__Mapping__Group__8__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:986:1: rule__Mapping__Group__8__Impl : ( ( rule__Mapping__Group_8__0 )* ) ;
    public final void rule__Mapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:990:1: ( ( ( rule__Mapping__Group_8__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:991:1: ( ( rule__Mapping__Group_8__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:991:1: ( ( rule__Mapping__Group_8__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:992:1: ( rule__Mapping__Group_8__0 )*
            {
             before(grammarAccess.getMappingAccess().getGroup_8()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:993:1: ( rule__Mapping__Group_8__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==23||(LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:993:2: rule__Mapping__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Mapping__Group_8__0_in_rule__Mapping__Group__8__Impl1964);
            	    rule__Mapping__Group_8__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getGroup_8()); 

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
    // $ANTLR end rule__Mapping__Group__8__Impl


    // $ANTLR start rule__Mapping__Group__9
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1003:1: rule__Mapping__Group__9 : rule__Mapping__Group__9__Impl ;
    public final void rule__Mapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1007:1: ( rule__Mapping__Group__9__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1008:2: rule__Mapping__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__9__Impl_in_rule__Mapping__Group__91995);
            rule__Mapping__Group__9__Impl();
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
    // $ANTLR end rule__Mapping__Group__9


    // $ANTLR start rule__Mapping__Group__9__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1014:1: rule__Mapping__Group__9__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1018:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1019:1: ( '}' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1019:1: ( '}' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1020:1: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_16_in_rule__Mapping__Group__9__Impl2023); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end rule__Mapping__Group__9__Impl


    // $ANTLR start rule__Mapping__Group_8__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1053:1: rule__Mapping__Group_8__0 : rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1 ;
    public final void rule__Mapping__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1057:1: ( rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1058:2: rule__Mapping__Group_8__0__Impl rule__Mapping__Group_8__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group_8__0__Impl_in_rule__Mapping__Group_8__02074);
            rule__Mapping__Group_8__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group_8__1_in_rule__Mapping__Group_8__02077);
            rule__Mapping__Group_8__1();
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
    // $ANTLR end rule__Mapping__Group_8__0


    // $ANTLR start rule__Mapping__Group_8__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1065:1: rule__Mapping__Group_8__0__Impl : ( ( rule__Mapping__MappedFeaturesAssignment_8_0 ) ) ;
    public final void rule__Mapping__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1069:1: ( ( ( rule__Mapping__MappedFeaturesAssignment_8_0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1070:1: ( ( rule__Mapping__MappedFeaturesAssignment_8_0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1070:1: ( ( rule__Mapping__MappedFeaturesAssignment_8_0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1071:1: ( rule__Mapping__MappedFeaturesAssignment_8_0 )
            {
             before(grammarAccess.getMappingAccess().getMappedFeaturesAssignment_8_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1072:1: ( rule__Mapping__MappedFeaturesAssignment_8_0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1072:2: rule__Mapping__MappedFeaturesAssignment_8_0
            {
            pushFollow(FOLLOW_rule__Mapping__MappedFeaturesAssignment_8_0_in_rule__Mapping__Group_8__0__Impl2104);
            rule__Mapping__MappedFeaturesAssignment_8_0();
            _fsp--;


            }

             after(grammarAccess.getMappingAccess().getMappedFeaturesAssignment_8_0()); 

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
    // $ANTLR end rule__Mapping__Group_8__0__Impl


    // $ANTLR start rule__Mapping__Group_8__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1082:1: rule__Mapping__Group_8__1 : rule__Mapping__Group_8__1__Impl ;
    public final void rule__Mapping__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1086:1: ( rule__Mapping__Group_8__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1087:2: rule__Mapping__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group_8__1__Impl_in_rule__Mapping__Group_8__12134);
            rule__Mapping__Group_8__1__Impl();
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
    // $ANTLR end rule__Mapping__Group_8__1


    // $ANTLR start rule__Mapping__Group_8__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1093:1: rule__Mapping__Group_8__1__Impl : ( ( ';' )? ) ;
    public final void rule__Mapping__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1097:1: ( ( ( ';' )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1098:1: ( ( ';' )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1098:1: ( ( ';' )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1099:1: ( ';' )?
            {
             before(grammarAccess.getMappingAccess().getSemicolonKeyword_8_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1100:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1101:2: ';'
                    {
                    match(input,20,FOLLOW_20_in_rule__Mapping__Group_8__1__Impl2163); 

                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getSemicolonKeyword_8_1()); 

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
    // $ANTLR end rule__Mapping__Group_8__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1116:1: rule__FeatureMap__Group_0__0 : rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1 ;
    public final void rule__FeatureMap__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1120:1: ( rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1121:2: rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__0__Impl_in_rule__FeatureMap__Group_0__02200);
            rule__FeatureMap__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__1_in_rule__FeatureMap__Group_0__02203);
            rule__FeatureMap__Group_0__1();
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
    // $ANTLR end rule__FeatureMap__Group_0__0


    // $ANTLR start rule__FeatureMap__Group_0__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1128:1: rule__FeatureMap__Group_0__0__Impl : ( 'map' ) ;
    public final void rule__FeatureMap__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1132:1: ( ( 'map' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1133:1: ( 'map' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1133:1: ( 'map' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1134:1: 'map'
            {
             before(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__FeatureMap__Group_0__0__Impl2231); 
             after(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0()); 

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
    // $ANTLR end rule__FeatureMap__Group_0__0__Impl


    // $ANTLR start rule__FeatureMap__Group_0__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1147:1: rule__FeatureMap__Group_0__1 : rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2 ;
    public final void rule__FeatureMap__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1151:1: ( rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1152:2: rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__1__Impl_in_rule__FeatureMap__Group_0__12262);
            rule__FeatureMap__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__2_in_rule__FeatureMap__Group_0__12265);
            rule__FeatureMap__Group_0__2();
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
    // $ANTLR end rule__FeatureMap__Group_0__1


    // $ANTLR start rule__FeatureMap__Group_0__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1159:1: rule__FeatureMap__Group_0__1__Impl : ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) ) ;
    public final void rule__FeatureMap__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1163:1: ( ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1164:1: ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1164:1: ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1165:1: ( rule__FeatureMap__LeftFieldAssignment_0_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAssignment_0_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1166:1: ( rule__FeatureMap__LeftFieldAssignment_0_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1166:2: rule__FeatureMap__LeftFieldAssignment_0_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldAssignment_0_1_in_rule__FeatureMap__Group_0__1__Impl2292);
            rule__FeatureMap__LeftFieldAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldAssignment_0_1()); 

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
    // $ANTLR end rule__FeatureMap__Group_0__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0__2
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1176:1: rule__FeatureMap__Group_0__2 : rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3 ;
    public final void rule__FeatureMap__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1180:1: ( rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1181:2: rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__2__Impl_in_rule__FeatureMap__Group_0__22322);
            rule__FeatureMap__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__3_in_rule__FeatureMap__Group_0__22325);
            rule__FeatureMap__Group_0__3();
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
    // $ANTLR end rule__FeatureMap__Group_0__2


    // $ANTLR start rule__FeatureMap__Group_0__2__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1188:1: rule__FeatureMap__Group_0__2__Impl : ( '=>' ) ;
    public final void rule__FeatureMap__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1192:1: ( ( '=>' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1193:1: ( '=>' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1193:1: ( '=>' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1194:1: '=>'
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__FeatureMap__Group_0__2__Impl2353); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_2()); 

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
    // $ANTLR end rule__FeatureMap__Group_0__2__Impl


    // $ANTLR start rule__FeatureMap__Group_0__3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1207:1: rule__FeatureMap__Group_0__3 : rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4 ;
    public final void rule__FeatureMap__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1211:1: ( rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1212:2: rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__3__Impl_in_rule__FeatureMap__Group_0__32384);
            rule__FeatureMap__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__4_in_rule__FeatureMap__Group_0__32387);
            rule__FeatureMap__Group_0__4();
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
    // $ANTLR end rule__FeatureMap__Group_0__3


    // $ANTLR start rule__FeatureMap__Group_0__3__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1219:1: rule__FeatureMap__Group_0__3__Impl : ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) ) ;
    public final void rule__FeatureMap__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1223:1: ( ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1224:1: ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1224:1: ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1225:1: ( rule__FeatureMap__RightFieldAssignment_0_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAssignment_0_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1226:1: ( rule__FeatureMap__RightFieldAssignment_0_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1226:2: rule__FeatureMap__RightFieldAssignment_0_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldAssignment_0_3_in_rule__FeatureMap__Group_0__3__Impl2414);
            rule__FeatureMap__RightFieldAssignment_0_3();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldAssignment_0_3()); 

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
    // $ANTLR end rule__FeatureMap__Group_0__3__Impl


    // $ANTLR start rule__FeatureMap__Group_0__4
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1236:1: rule__FeatureMap__Group_0__4 : rule__FeatureMap__Group_0__4__Impl ;
    public final void rule__FeatureMap__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1240:1: ( rule__FeatureMap__Group_0__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1241:2: rule__FeatureMap__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__4__Impl_in_rule__FeatureMap__Group_0__42444);
            rule__FeatureMap__Group_0__4__Impl();
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
    // $ANTLR end rule__FeatureMap__Group_0__4


    // $ANTLR start rule__FeatureMap__Group_0__4__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1247:1: rule__FeatureMap__Group_0__4__Impl : ( ( rule__FeatureMap__RuleAssignment_0_4 )? ) ;
    public final void rule__FeatureMap__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1251:1: ( ( ( rule__FeatureMap__RuleAssignment_0_4 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1252:1: ( ( rule__FeatureMap__RuleAssignment_0_4 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1252:1: ( ( rule__FeatureMap__RuleAssignment_0_4 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1253:1: ( rule__FeatureMap__RuleAssignment_0_4 )?
            {
             before(grammarAccess.getFeatureMapAccess().getRuleAssignment_0_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1254:1: ( rule__FeatureMap__RuleAssignment_0_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1254:2: rule__FeatureMap__RuleAssignment_0_4
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__RuleAssignment_0_4_in_rule__FeatureMap__Group_0__4__Impl2471);
                    rule__FeatureMap__RuleAssignment_0_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMapAccess().getRuleAssignment_0_4()); 

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
    // $ANTLR end rule__FeatureMap__Group_0__4__Impl


    // $ANTLR start rule__FeatureMap__Group_1__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1274:1: rule__FeatureMap__Group_1__0 : rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 ;
    public final void rule__FeatureMap__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1278:1: ( rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1279:2: rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__02512);
            rule__FeatureMap__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__02515);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1286:1: rule__FeatureMap__Group_1__0__Impl : ( 'set left' ) ;
    public final void rule__FeatureMap__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1290:1: ( ( 'set left' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1291:1: ( 'set left' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1291:1: ( 'set left' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1292:1: 'set left'
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__FeatureMap__Group_1__0__Impl2543); 
             after(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_1_0()); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1305:1: rule__FeatureMap__Group_1__1 : rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 ;
    public final void rule__FeatureMap__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1309:1: ( rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1310:2: rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__12574);
            rule__FeatureMap__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__12577);
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1317:1: rule__FeatureMap__Group_1__1__Impl : ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) ) ;
    public final void rule__FeatureMap__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1321:1: ( ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1322:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1322:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1323:1: ( rule__FeatureMap__SetLeftFieldAssignment_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAssignment_1_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1324:1: ( rule__FeatureMap__SetLeftFieldAssignment_1_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1324:2: rule__FeatureMap__SetLeftFieldAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl2604);
            rule__FeatureMap__SetLeftFieldAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAssignment_1_1()); 

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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1334:1: rule__FeatureMap__Group_1__2 : rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3 ;
    public final void rule__FeatureMap__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1338:1: ( rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1339:2: rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__22634);
            rule__FeatureMap__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__3_in_rule__FeatureMap__Group_1__22637);
            rule__FeatureMap__Group_1__3();
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
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1346:1: rule__FeatureMap__Group_1__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1350:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1351:1: ( '=' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1351:1: ( '=' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1352:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_1_2()); 
            match(input,24,FOLLOW_24_in_rule__FeatureMap__Group_1__2__Impl2665); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_1_2()); 

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


    // $ANTLR start rule__FeatureMap__Group_1__3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1365:1: rule__FeatureMap__Group_1__3 : rule__FeatureMap__Group_1__3__Impl ;
    public final void rule__FeatureMap__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1369:1: ( rule__FeatureMap__Group_1__3__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1370:2: rule__FeatureMap__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__3__Impl_in_rule__FeatureMap__Group_1__32696);
            rule__FeatureMap__Group_1__3__Impl();
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
    // $ANTLR end rule__FeatureMap__Group_1__3


    // $ANTLR start rule__FeatureMap__Group_1__3__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1376:1: rule__FeatureMap__Group_1__3__Impl : ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) ) ;
    public final void rule__FeatureMap__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1380:1: ( ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1381:1: ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1381:1: ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1382:1: ( rule__FeatureMap__ValLeftAssignment_1_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getValLeftAssignment_1_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1383:1: ( rule__FeatureMap__ValLeftAssignment_1_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1383:2: rule__FeatureMap__ValLeftAssignment_1_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ValLeftAssignment_1_3_in_rule__FeatureMap__Group_1__3__Impl2723);
            rule__FeatureMap__ValLeftAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getValLeftAssignment_1_3()); 

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
    // $ANTLR end rule__FeatureMap__Group_1__3__Impl


    // $ANTLR start rule__FeatureMap__Group_2__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1401:1: rule__FeatureMap__Group_2__0 : rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1 ;
    public final void rule__FeatureMap__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1405:1: ( rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1406:2: rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__0__Impl_in_rule__FeatureMap__Group_2__02761);
            rule__FeatureMap__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__1_in_rule__FeatureMap__Group_2__02764);
            rule__FeatureMap__Group_2__1();
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
    // $ANTLR end rule__FeatureMap__Group_2__0


    // $ANTLR start rule__FeatureMap__Group_2__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1413:1: rule__FeatureMap__Group_2__0__Impl : ( 'set right' ) ;
    public final void rule__FeatureMap__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1417:1: ( ( 'set right' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1418:1: ( 'set right' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1418:1: ( 'set right' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1419:1: 'set right'
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__FeatureMap__Group_2__0__Impl2792); 
             after(grammarAccess.getFeatureMapAccess().getSetRightKeyword_2_0()); 

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
    // $ANTLR end rule__FeatureMap__Group_2__0__Impl


    // $ANTLR start rule__FeatureMap__Group_2__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1432:1: rule__FeatureMap__Group_2__1 : rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2 ;
    public final void rule__FeatureMap__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1436:1: ( rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1437:2: rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__1__Impl_in_rule__FeatureMap__Group_2__12823);
            rule__FeatureMap__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__2_in_rule__FeatureMap__Group_2__12826);
            rule__FeatureMap__Group_2__2();
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
    // $ANTLR end rule__FeatureMap__Group_2__1


    // $ANTLR start rule__FeatureMap__Group_2__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1444:1: rule__FeatureMap__Group_2__1__Impl : ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) ) ;
    public final void rule__FeatureMap__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1448:1: ( ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1449:1: ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1449:1: ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1450:1: ( rule__FeatureMap__SetRightFieldAssignment_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAssignment_2_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1451:1: ( rule__FeatureMap__SetRightFieldAssignment_2_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1451:2: rule__FeatureMap__SetRightFieldAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetRightFieldAssignment_2_1_in_rule__FeatureMap__Group_2__1__Impl2853);
            rule__FeatureMap__SetRightFieldAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAssignment_2_1()); 

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
    // $ANTLR end rule__FeatureMap__Group_2__1__Impl


    // $ANTLR start rule__FeatureMap__Group_2__2
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1461:1: rule__FeatureMap__Group_2__2 : rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3 ;
    public final void rule__FeatureMap__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1465:1: ( rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1466:2: rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__2__Impl_in_rule__FeatureMap__Group_2__22883);
            rule__FeatureMap__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__3_in_rule__FeatureMap__Group_2__22886);
            rule__FeatureMap__Group_2__3();
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
    // $ANTLR end rule__FeatureMap__Group_2__2


    // $ANTLR start rule__FeatureMap__Group_2__2__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1473:1: rule__FeatureMap__Group_2__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1477:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1478:1: ( '=' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1478:1: ( '=' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1479:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__FeatureMap__Group_2__2__Impl2914); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_2_2()); 

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
    // $ANTLR end rule__FeatureMap__Group_2__2__Impl


    // $ANTLR start rule__FeatureMap__Group_2__3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1492:1: rule__FeatureMap__Group_2__3 : rule__FeatureMap__Group_2__3__Impl ;
    public final void rule__FeatureMap__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1496:1: ( rule__FeatureMap__Group_2__3__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1497:2: rule__FeatureMap__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__3__Impl_in_rule__FeatureMap__Group_2__32945);
            rule__FeatureMap__Group_2__3__Impl();
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
    // $ANTLR end rule__FeatureMap__Group_2__3


    // $ANTLR start rule__FeatureMap__Group_2__3__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1503:1: rule__FeatureMap__Group_2__3__Impl : ( ( rule__FeatureMap__ValRightAssignment_2_3 ) ) ;
    public final void rule__FeatureMap__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1507:1: ( ( ( rule__FeatureMap__ValRightAssignment_2_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1508:1: ( ( rule__FeatureMap__ValRightAssignment_2_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1508:1: ( ( rule__FeatureMap__ValRightAssignment_2_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1509:1: ( rule__FeatureMap__ValRightAssignment_2_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getValRightAssignment_2_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1510:1: ( rule__FeatureMap__ValRightAssignment_2_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1510:2: rule__FeatureMap__ValRightAssignment_2_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ValRightAssignment_2_3_in_rule__FeatureMap__Group_2__3__Impl2972);
            rule__FeatureMap__ValRightAssignment_2_3();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getValRightAssignment_2_3()); 

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
    // $ANTLR end rule__FeatureMap__Group_2__3__Impl


    // $ANTLR start rule__FeatureMap__Group_3__0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1528:1: rule__FeatureMap__Group_3__0 : rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1 ;
    public final void rule__FeatureMap__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1532:1: ( rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1533:2: rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__0__Impl_in_rule__FeatureMap__Group_3__03010);
            rule__FeatureMap__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_3__1_in_rule__FeatureMap__Group_3__03013);
            rule__FeatureMap__Group_3__1();
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
    // $ANTLR end rule__FeatureMap__Group_3__0


    // $ANTLR start rule__FeatureMap__Group_3__0__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1540:1: rule__FeatureMap__Group_3__0__Impl : ( 'ignore left' ) ;
    public final void rule__FeatureMap__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1544:1: ( ( 'ignore left' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1545:1: ( 'ignore left' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1545:1: ( 'ignore left' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1546:1: 'ignore left'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__FeatureMap__Group_3__0__Impl3041); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_3_0()); 

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
    // $ANTLR end rule__FeatureMap__Group_3__0__Impl


    // $ANTLR start rule__FeatureMap__Group_3__1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1559:1: rule__FeatureMap__Group_3__1 : rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2 ;
    public final void rule__FeatureMap__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1563:1: ( rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1564:2: rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__1__Impl_in_rule__FeatureMap__Group_3__13072);
            rule__FeatureMap__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_3__2_in_rule__FeatureMap__Group_3__13075);
            rule__FeatureMap__Group_3__2();
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
    // $ANTLR end rule__FeatureMap__Group_3__1


    // $ANTLR start rule__FeatureMap__Group_3__1__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1571:1: rule__FeatureMap__Group_3__1__Impl : ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) ) ;
    public final void rule__FeatureMap__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1575:1: ( ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1576:1: ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1576:1: ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1577:1: ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAssignment_3_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1578:1: ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1578:2: rule__FeatureMap__IgnoreLeftFieldAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__IgnoreLeftFieldAssignment_3_1_in_rule__FeatureMap__Group_3__1__Impl3102);
            rule__FeatureMap__IgnoreLeftFieldAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAssignment_3_1()); 

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
    // $ANTLR end rule__FeatureMap__Group_3__1__Impl


    // $ANTLR start rule__FeatureMap__Group_3__2
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1588:1: rule__FeatureMap__Group_3__2 : rule__FeatureMap__Group_3__2__Impl ;
    public final void rule__FeatureMap__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1592:1: ( rule__FeatureMap__Group_3__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1593:2: rule__FeatureMap__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__2__Impl_in_rule__FeatureMap__Group_3__23132);
            rule__FeatureMap__Group_3__2__Impl();
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
    // $ANTLR end rule__FeatureMap__Group_3__2


    // $ANTLR start rule__FeatureMap__Group_3__2__Impl
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1599:1: rule__FeatureMap__Group_3__2__Impl : ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? ) ;
    public final void rule__FeatureMap__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1603:1: ( ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1604:1: ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1604:1: ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1605:1: ( rule__FeatureMap__DocumentationAssignment_3_2 )?
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_3_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1606:1: ( rule__FeatureMap__DocumentationAssignment_3_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1606:2: rule__FeatureMap__DocumentationAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__DocumentationAssignment_3_2_in_rule__FeatureMap__Group_3__2__Impl3159);
                    rule__FeatureMap__DocumentationAssignment_3_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_3_2()); 

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
    // $ANTLR end rule__FeatureMap__Group_3__2__Impl


    // $ANTLR start rule__Model__MappingModulesAssignment
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1623:1: rule__Model__MappingModulesAssignment : ( ruleMappingModule ) ;
    public final void rule__Model__MappingModulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1627:1: ( ( ruleMappingModule ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1628:1: ( ruleMappingModule )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1628:1: ( ruleMappingModule )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1629:1: ruleMappingModule
            {
             before(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment3201);
            ruleMappingModule();
            _fsp--;

             after(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_0()); 

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
    // $ANTLR end rule__Model__MappingModulesAssignment


    // $ANTLR start rule__Import__ImportedNamespaceAssignment_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1638:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1642:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1643:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1643:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1644:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13232);
            ruleQualifiedNameWithWildCard();
            _fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end rule__Import__ImportedNamespaceAssignment_1


    // $ANTLR start rule__MappingModule__NameAssignment_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1653:1: rule__MappingModule__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__MappingModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1657:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1658:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1658:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1659:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_13263);
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


    // $ANTLR start rule__MappingModule__ImportsAssignment_3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1668:1: rule__MappingModule__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__MappingModule__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1672:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1673:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1673:1: ( ruleImport )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1674:1: ruleImport
            {
             before(grammarAccess.getMappingModuleAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__MappingModule__ImportsAssignment_33294);
            ruleImport();
            _fsp--;

             after(grammarAccess.getMappingModuleAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end rule__MappingModule__ImportsAssignment_3


    // $ANTLR start rule__MappingModule__MappingsAssignment_4
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1683:1: rule__MappingModule__MappingsAssignment_4 : ( ruleMapping ) ;
    public final void rule__MappingModule__MappingsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1687:1: ( ( ruleMapping ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1688:1: ( ruleMapping )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1688:1: ( ruleMapping )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1689:1: ruleMapping
            {
             before(grammarAccess.getMappingModuleAccess().getMappingsMappingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__MappingModule__MappingsAssignment_43325);
            ruleMapping();
            _fsp--;

             after(grammarAccess.getMappingModuleAccess().getMappingsMappingParserRuleCall_4_0()); 

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
    // $ANTLR end rule__MappingModule__MappingsAssignment_4


    // $ANTLR start rule__Mapping__NameAssignment_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1698:1: rule__Mapping__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1702:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1703:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1703:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1704:1: RULE_STRING
            {
             before(grammarAccess.getMappingAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapping__NameAssignment_13356); 
             after(grammarAccess.getMappingAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__Mapping__NameAssignment_1


    // $ANTLR start rule__Mapping__LeftClassAssignment_3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1713:1: rule__Mapping__LeftClassAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__LeftClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1717:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1718:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1718:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1719:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getLeftClassEntityCrossReference_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1720:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1721:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getLeftClassEntityQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Mapping__LeftClassAssignment_33391);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getMappingAccess().getLeftClassEntityQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getLeftClassEntityCrossReference_3_0()); 

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
    // $ANTLR end rule__Mapping__LeftClassAssignment_3


    // $ANTLR start rule__Mapping__RightClassAssignment_5
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1732:1: rule__Mapping__RightClassAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__RightClassAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1736:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1737:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1737:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1738:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getRightClassEntityCrossReference_5_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1739:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1740:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getRightClassEntityQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Mapping__RightClassAssignment_53430);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getMappingAccess().getRightClassEntityQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getRightClassEntityCrossReference_5_0()); 

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
    // $ANTLR end rule__Mapping__RightClassAssignment_5


    // $ANTLR start rule__Mapping__DocumentationAssignment_6
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1751:1: rule__Mapping__DocumentationAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Mapping__DocumentationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1755:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1756:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1756:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1757:1: RULE_STRING
            {
             before(grammarAccess.getMappingAccess().getDocumentationSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapping__DocumentationAssignment_63465); 
             after(grammarAccess.getMappingAccess().getDocumentationSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end rule__Mapping__DocumentationAssignment_6


    // $ANTLR start rule__Mapping__MappedFeaturesAssignment_8_0
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1766:1: rule__Mapping__MappedFeaturesAssignment_8_0 : ( ruleFeatureMap ) ;
    public final void rule__Mapping__MappedFeaturesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1770:1: ( ( ruleFeatureMap ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1771:1: ( ruleFeatureMap )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1771:1: ( ruleFeatureMap )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1772:1: ruleFeatureMap
            {
             before(grammarAccess.getMappingAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_rule__Mapping__MappedFeaturesAssignment_8_03496);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getMappingAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0()); 

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
    // $ANTLR end rule__Mapping__MappedFeaturesAssignment_8_0


    // $ANTLR start rule__FeatureMap__LeftFieldAssignment_0_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1781:1: rule__FeatureMap__LeftFieldAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1785:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1786:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1786:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1787:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeCrossReference_0_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1788:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1789:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeQualifiedNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldAssignment_0_13531);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeQualifiedNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeCrossReference_0_1_0()); 

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
    // $ANTLR end rule__FeatureMap__LeftFieldAssignment_0_1


    // $ANTLR start rule__FeatureMap__RightFieldAssignment_0_3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1800:1: rule__FeatureMap__RightFieldAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RightFieldAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1804:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1805:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1805:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1806:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAttributeCrossReference_0_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1807:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1808:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAttributeIDTerminalRuleCall_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RightFieldAssignment_0_33570); 
             after(grammarAccess.getFeatureMapAccess().getRightFieldAttributeIDTerminalRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRightFieldAttributeCrossReference_0_3_0()); 

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
    // $ANTLR end rule__FeatureMap__RightFieldAssignment_0_3


    // $ANTLR start rule__FeatureMap__RuleAssignment_0_4
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1819:1: rule__FeatureMap__RuleAssignment_0_4 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__RuleAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1823:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1824:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1824:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1825:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getRuleSTRINGTerminalRuleCall_0_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__RuleAssignment_0_43605); 
             after(grammarAccess.getFeatureMapAccess().getRuleSTRINGTerminalRuleCall_0_4_0()); 

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
    // $ANTLR end rule__FeatureMap__RuleAssignment_0_4


    // $ANTLR start rule__FeatureMap__SetLeftFieldAssignment_1_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1834:1: rule__FeatureMap__SetLeftFieldAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__SetLeftFieldAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1838:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1839:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1839:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1840:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_1_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1841:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1842:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__SetLeftFieldAssignment_1_13640); 
             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_1_1_0()); 

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
    // $ANTLR end rule__FeatureMap__SetLeftFieldAssignment_1_1


    // $ANTLR start rule__FeatureMap__ValLeftAssignment_1_3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1853:1: rule__FeatureMap__ValLeftAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__ValLeftAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1857:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1858:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1858:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1859:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getValLeftSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__ValLeftAssignment_1_33675); 
             after(grammarAccess.getFeatureMapAccess().getValLeftSTRINGTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end rule__FeatureMap__ValLeftAssignment_1_3


    // $ANTLR start rule__FeatureMap__SetRightFieldAssignment_2_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1868:1: rule__FeatureMap__SetRightFieldAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__SetRightFieldAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1872:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1873:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1873:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1874:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_2_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1875:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1876:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__SetRightFieldAssignment_2_13710); 
             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_2_1_0()); 

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
    // $ANTLR end rule__FeatureMap__SetRightFieldAssignment_2_1


    // $ANTLR start rule__FeatureMap__ValRightAssignment_2_3
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1887:1: rule__FeatureMap__ValRightAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__ValRightAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1891:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1892:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1892:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1893:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getValRightSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__ValRightAssignment_2_33745); 
             after(grammarAccess.getFeatureMapAccess().getValRightSTRINGTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end rule__FeatureMap__ValRightAssignment_2_3


    // $ANTLR start rule__FeatureMap__IgnoreLeftFieldAssignment_3_1
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1902:1: rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__IgnoreLeftFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1906:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1907:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1907:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1908:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1909:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1910:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__IgnoreLeftFieldAssignment_3_13780); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeCrossReference_3_1_0()); 

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
    // $ANTLR end rule__FeatureMap__IgnoreLeftFieldAssignment_3_1


    // $ANTLR start rule__FeatureMap__DocumentationAssignment_3_2
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1921:1: rule__FeatureMap__DocumentationAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__DocumentationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1925:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1926:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1926:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1927:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_3_23815); 
             after(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end rule__FeatureMap__DocumentationAssignment_3_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MappingModulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Alternatives_in_ruleFeatureMap455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__0_in_rule__FeatureMap__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Alternatives509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__0_in_rule__FeatureMap__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__0_in_rule__FeatureMap__Alternatives545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__0699 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__0702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedNameWithWildCard__Group__1__Impl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0824 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl910 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__01067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__01070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MappingModule__Group__0__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__11129 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__21189 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__21192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MappingModule__Group__2__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__31251 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__31254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__ImportsAssignment_3_in_rule__MappingModule__Group__3__Impl1281 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__41312 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__41315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__MappingsAssignment_4_in_rule__MappingModule__Group__4__Impl1342 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__51373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MappingModule__Group__5__Impl1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__01444 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__01447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mapping__Group__0__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__11506 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__21567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__21570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mapping__Group__2__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__31629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__31632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__LeftClassAssignment_3_in_rule__Mapping__Group__3__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__41689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__5_in_rule__Mapping__Group__41692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Mapping__Group__4__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__5__Impl_in_rule__Mapping__Group__51751 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Mapping__Group__6_in_rule__Mapping__Group__51754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__RightClassAssignment_5_in_rule__Mapping__Group__5__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__6__Impl_in_rule__Mapping__Group__61811 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__7_in_rule__Mapping__Group__61814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__DocumentationAssignment_6_in_rule__Mapping__Group__6__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__7__Impl_in_rule__Mapping__Group__71872 = new BitSet(new long[]{0x0000000006A10000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__8_in_rule__Mapping__Group__71875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mapping__Group__7__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__8__Impl_in_rule__Mapping__Group__81934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__9_in_rule__Mapping__Group__81937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_8__0_in_rule__Mapping__Group__8__Impl1964 = new BitSet(new long[]{0x0000000006A00002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__9__Impl_in_rule__Mapping__Group__91995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mapping__Group__9__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_8__0__Impl_in_rule__Mapping__Group_8__02074 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_8__1_in_rule__Mapping__Group_8__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappedFeaturesAssignment_8_0_in_rule__Mapping__Group_8__0__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group_8__1__Impl_in_rule__Mapping__Group_8__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Mapping__Group_8__1__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__0__Impl_in_rule__FeatureMap__Group_0__02200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__1_in_rule__FeatureMap__Group_0__02203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FeatureMap__Group_0__0__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__1__Impl_in_rule__FeatureMap__Group_0__12262 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__2_in_rule__FeatureMap__Group_0__12265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldAssignment_0_1_in_rule__FeatureMap__Group_0__1__Impl2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__2__Impl_in_rule__FeatureMap__Group_0__22322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__3_in_rule__FeatureMap__Group_0__22325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FeatureMap__Group_0__2__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__3__Impl_in_rule__FeatureMap__Group_0__32384 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__4_in_rule__FeatureMap__Group_0__32387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldAssignment_0_3_in_rule__FeatureMap__Group_0__3__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__4__Impl_in_rule__FeatureMap__Group_0__42444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RuleAssignment_0_4_in_rule__FeatureMap__Group_0__4__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__02512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FeatureMap__Group_1__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__12574 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__22634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__3_in_rule__FeatureMap__Group_1__22637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FeatureMap__Group_1__2__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__3__Impl_in_rule__FeatureMap__Group_1__32696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ValLeftAssignment_1_3_in_rule__FeatureMap__Group_1__3__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__0__Impl_in_rule__FeatureMap__Group_2__02761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__1_in_rule__FeatureMap__Group_2__02764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FeatureMap__Group_2__0__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__1__Impl_in_rule__FeatureMap__Group_2__12823 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__2_in_rule__FeatureMap__Group_2__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetRightFieldAssignment_2_1_in_rule__FeatureMap__Group_2__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__2__Impl_in_rule__FeatureMap__Group_2__22883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__3_in_rule__FeatureMap__Group_2__22886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FeatureMap__Group_2__2__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__3__Impl_in_rule__FeatureMap__Group_2__32945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ValRightAssignment_2_3_in_rule__FeatureMap__Group_2__3__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__0__Impl_in_rule__FeatureMap__Group_3__03010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__1_in_rule__FeatureMap__Group_3__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FeatureMap__Group_3__0__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__1__Impl_in_rule__FeatureMap__Group_3__13072 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__2_in_rule__FeatureMap__Group_3__13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__IgnoreLeftFieldAssignment_3_1_in_rule__FeatureMap__Group_3__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__2__Impl_in_rule__FeatureMap__Group_3__23132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__DocumentationAssignment_3_2_in_rule__FeatureMap__Group_3__2__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_13263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__MappingModule__ImportsAssignment_33294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__MappingModule__MappingsAssignment_43325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapping__NameAssignment_13356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Mapping__LeftClassAssignment_33391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Mapping__RightClassAssignment_53430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapping__DocumentationAssignment_63465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_rule__Mapping__MappedFeaturesAssignment_8_03496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldAssignment_0_13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RightFieldAssignment_0_33570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__RuleAssignment_0_43605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__SetLeftFieldAssignment_1_13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__ValLeftAssignment_1_33675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__SetRightFieldAssignment_2_13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__ValRightAssignment_2_33745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__IgnoreLeftFieldAssignment_3_13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_3_23815 = new BitSet(new long[]{0x0000000000000002L});

}