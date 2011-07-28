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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'import'", "'.*'", "'.'", "'root'", "'define rule'", "'op'", "'args'", "'define fonction'", "'in'", "'['", "']'", "'out'", "'module'", "'source'", "'target'", "'{'", "'}'", "';'", "'fuction'", "'map atribute'", "'->'", "'map module'", "'set <-'", "'='", "'set ->'", "'ignore <-'", "'ignore ->'", "'rule'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapDslParser.tokenNames; }
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




    // $ANTLR start "entryRuleModel"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:62:1: ( ruleModel EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:77:1: ( rule__Model__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:90:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:91:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
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
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:117:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:118:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:119:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
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
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:147:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
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
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
            rule__QualifiedName__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRootModule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:173:1: entryRuleRootModule : ruleRootModule EOF ;
    public final void entryRuleRootModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:174:1: ( ruleRootModule EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:175:1: ruleRootModule EOF
            {
             before(grammarAccess.getRootModuleRule()); 
            pushFollow(FOLLOW_ruleRootModule_in_entryRuleRootModule301);
            ruleRootModule();

            state._fsp--;

             after(grammarAccess.getRootModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootModule308); 

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
    // $ANTLR end "entryRuleRootModule"


    // $ANTLR start "ruleRootModule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:182:1: ruleRootModule : ( ( rule__RootModule__Group__0 ) ) ;
    public final void ruleRootModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:186:2: ( ( ( rule__RootModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:187:1: ( ( rule__RootModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:187:1: ( ( rule__RootModule__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:188:1: ( rule__RootModule__Group__0 )
            {
             before(grammarAccess.getRootModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:189:1: ( rule__RootModule__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:189:2: rule__RootModule__Group__0
            {
            pushFollow(FOLLOW_rule__RootModule__Group__0_in_ruleRootModule334);
            rule__RootModule__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleRootModule"


    // $ANTLR start "entryRuleRule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:201:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:202:1: ( ruleRule EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:203:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule361);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule368); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:210:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:214:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:215:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:215:1: ( ( rule__Rule__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:216:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:217:1: ( rule__Rule__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:217:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule394);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFuction"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:229:1: entryRuleFuction : ruleFuction EOF ;
    public final void entryRuleFuction() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:230:1: ( ruleFuction EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:231:1: ruleFuction EOF
            {
             before(grammarAccess.getFuctionRule()); 
            pushFollow(FOLLOW_ruleFuction_in_entryRuleFuction421);
            ruleFuction();

            state._fsp--;

             after(grammarAccess.getFuctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuction428); 

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
    // $ANTLR end "entryRuleFuction"


    // $ANTLR start "ruleFuction"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:238:1: ruleFuction : ( ( rule__Fuction__Group__0 ) ) ;
    public final void ruleFuction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:242:2: ( ( ( rule__Fuction__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:243:1: ( ( rule__Fuction__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:243:1: ( ( rule__Fuction__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:244:1: ( rule__Fuction__Group__0 )
            {
             before(grammarAccess.getFuctionAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:245:1: ( rule__Fuction__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:245:2: rule__Fuction__Group__0
            {
            pushFollow(FOLLOW_rule__Fuction__Group__0_in_ruleFuction454);
            rule__Fuction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFuction"


    // $ANTLR start "entryRuleFuctionIn"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:257:1: entryRuleFuctionIn : ruleFuctionIn EOF ;
    public final void entryRuleFuctionIn() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:258:1: ( ruleFuctionIn EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:259:1: ruleFuctionIn EOF
            {
             before(grammarAccess.getFuctionInRule()); 
            pushFollow(FOLLOW_ruleFuctionIn_in_entryRuleFuctionIn481);
            ruleFuctionIn();

            state._fsp--;

             after(grammarAccess.getFuctionInRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuctionIn488); 

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
    // $ANTLR end "entryRuleFuctionIn"


    // $ANTLR start "ruleFuctionIn"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:266:1: ruleFuctionIn : ( ( rule__FuctionIn__Group__0 ) ) ;
    public final void ruleFuctionIn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:270:2: ( ( ( rule__FuctionIn__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:271:1: ( ( rule__FuctionIn__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:271:1: ( ( rule__FuctionIn__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:272:1: ( rule__FuctionIn__Group__0 )
            {
             before(grammarAccess.getFuctionInAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:273:1: ( rule__FuctionIn__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:273:2: rule__FuctionIn__Group__0
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__0_in_ruleFuctionIn514);
            rule__FuctionIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuctionInAccess().getGroup()); 

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
    // $ANTLR end "ruleFuctionIn"


    // $ANTLR start "entryRuleFuctionOut"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:285:1: entryRuleFuctionOut : ruleFuctionOut EOF ;
    public final void entryRuleFuctionOut() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:286:1: ( ruleFuctionOut EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:287:1: ruleFuctionOut EOF
            {
             before(grammarAccess.getFuctionOutRule()); 
            pushFollow(FOLLOW_ruleFuctionOut_in_entryRuleFuctionOut541);
            ruleFuctionOut();

            state._fsp--;

             after(grammarAccess.getFuctionOutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuctionOut548); 

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
    // $ANTLR end "entryRuleFuctionOut"


    // $ANTLR start "ruleFuctionOut"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:294:1: ruleFuctionOut : ( ( rule__FuctionOut__Group__0 ) ) ;
    public final void ruleFuctionOut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:298:2: ( ( ( rule__FuctionOut__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:299:1: ( ( rule__FuctionOut__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:299:1: ( ( rule__FuctionOut__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:300:1: ( rule__FuctionOut__Group__0 )
            {
             before(grammarAccess.getFuctionOutAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:301:1: ( rule__FuctionOut__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:301:2: rule__FuctionOut__Group__0
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__0_in_ruleFuctionOut574);
            rule__FuctionOut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuctionOutAccess().getGroup()); 

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
    // $ANTLR end "ruleFuctionOut"


    // $ANTLR start "entryRuleMappingModule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:313:1: entryRuleMappingModule : ruleMappingModule EOF ;
    public final void entryRuleMappingModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:314:1: ( ruleMappingModule EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:315:1: ruleMappingModule EOF
            {
             before(grammarAccess.getMappingModuleRule()); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule601);
            ruleMappingModule();

            state._fsp--;

             after(grammarAccess.getMappingModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule608); 

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
    // $ANTLR end "entryRuleMappingModule"


    // $ANTLR start "ruleMappingModule"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:322:1: ruleMappingModule : ( ( rule__MappingModule__Group__0 ) ) ;
    public final void ruleMappingModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:326:2: ( ( ( rule__MappingModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:327:1: ( ( rule__MappingModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:327:1: ( ( rule__MappingModule__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:328:1: ( rule__MappingModule__Group__0 )
            {
             before(grammarAccess.getMappingModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:329:1: ( rule__MappingModule__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:329:2: rule__MappingModule__Group__0
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule634);
            rule__MappingModule__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleMappingModule"


    // $ANTLR start "entryRuleFeatureMap"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:341:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:342:1: ( ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:343:1: ruleFeatureMap EOF
            {
             before(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap661);
            ruleFeatureMap();

            state._fsp--;

             after(grammarAccess.getFeatureMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap668); 

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
    // $ANTLR end "entryRuleFeatureMap"


    // $ANTLR start "ruleFeatureMap"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:350:1: ruleFeatureMap : ( ( rule__FeatureMap__Group__0 ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:354:2: ( ( ( rule__FeatureMap__Group__0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:355:1: ( ( rule__FeatureMap__Group__0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:355:1: ( ( rule__FeatureMap__Group__0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:356:1: ( rule__FeatureMap__Group__0 )
            {
             before(grammarAccess.getFeatureMapAccess().getGroup()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:357:1: ( rule__FeatureMap__Group__0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:357:2: rule__FeatureMap__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__0_in_ruleFeatureMap694);
            rule__FeatureMap__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleFeatureMap"


    // $ANTLR start "entryRuleExpression"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:369:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:370:1: ( ruleExpression EOF )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:371:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression721);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression728); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:378:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:382:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:383:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:383:1: ( ( rule__Expression__Alternatives ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:384:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:385:1: ( rule__Expression__Alternatives )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:385:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression754);
            rule__Expression__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "rule__FeatureMap__Alternatives_0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:397:1: rule__FeatureMap__Alternatives_0 : ( ( ( rule__FeatureMap__Group_0_0__0 ) ) | ( ( rule__FeatureMap__Group_0_1__0 ) ) | ( ( rule__FeatureMap__Group_0_2__0 ) ) | ( ( rule__FeatureMap__Group_0_3__0 ) ) | ( ( rule__FeatureMap__Group_0_4__0 ) ) | ( ( rule__FeatureMap__Group_0_5__0 ) ) | ( ( rule__FeatureMap__Group_0_6__0 ) ) );
    public final void rule__FeatureMap__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:401:1: ( ( ( rule__FeatureMap__Group_0_0__0 ) ) | ( ( rule__FeatureMap__Group_0_1__0 ) ) | ( ( rule__FeatureMap__Group_0_2__0 ) ) | ( ( rule__FeatureMap__Group_0_3__0 ) ) | ( ( rule__FeatureMap__Group_0_4__0 ) ) | ( ( rule__FeatureMap__Group_0_5__0 ) ) | ( ( rule__FeatureMap__Group_0_6__0 ) ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 34:
                {
                alt1=4;
                }
                break;
            case 36:
                {
                alt1=5;
                }
                break;
            case 37:
                {
                alt1=6;
                }
                break;
            case 38:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:402:1: ( ( rule__FeatureMap__Group_0_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:402:1: ( ( rule__FeatureMap__Group_0_0__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:403:1: ( rule__FeatureMap__Group_0_0__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_0()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:404:1: ( rule__FeatureMap__Group_0_0__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:404:2: rule__FeatureMap__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__0_in_rule__FeatureMap__Alternatives_0790);
                    rule__FeatureMap__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:408:6: ( ( rule__FeatureMap__Group_0_1__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:408:6: ( ( rule__FeatureMap__Group_0_1__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:409:1: ( rule__FeatureMap__Group_0_1__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_1()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:410:1: ( rule__FeatureMap__Group_0_1__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:410:2: rule__FeatureMap__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__0_in_rule__FeatureMap__Alternatives_0808);
                    rule__FeatureMap__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:414:6: ( ( rule__FeatureMap__Group_0_2__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:414:6: ( ( rule__FeatureMap__Group_0_2__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:415:1: ( rule__FeatureMap__Group_0_2__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_2()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:416:1: ( rule__FeatureMap__Group_0_2__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:416:2: rule__FeatureMap__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__0_in_rule__FeatureMap__Alternatives_0826);
                    rule__FeatureMap__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:420:6: ( ( rule__FeatureMap__Group_0_3__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:420:6: ( ( rule__FeatureMap__Group_0_3__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:421:1: ( rule__FeatureMap__Group_0_3__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_3()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:422:1: ( rule__FeatureMap__Group_0_3__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:422:2: rule__FeatureMap__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__0_in_rule__FeatureMap__Alternatives_0844);
                    rule__FeatureMap__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:426:6: ( ( rule__FeatureMap__Group_0_4__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:426:6: ( ( rule__FeatureMap__Group_0_4__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:427:1: ( rule__FeatureMap__Group_0_4__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_4()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:428:1: ( rule__FeatureMap__Group_0_4__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:428:2: rule__FeatureMap__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__0_in_rule__FeatureMap__Alternatives_0862);
                    rule__FeatureMap__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:432:6: ( ( rule__FeatureMap__Group_0_5__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:432:6: ( ( rule__FeatureMap__Group_0_5__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:433:1: ( rule__FeatureMap__Group_0_5__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_5()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:434:1: ( rule__FeatureMap__Group_0_5__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:434:2: rule__FeatureMap__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__0_in_rule__FeatureMap__Alternatives_0880);
                    rule__FeatureMap__Group_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:438:6: ( ( rule__FeatureMap__Group_0_6__0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:438:6: ( ( rule__FeatureMap__Group_0_6__0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:439:1: ( rule__FeatureMap__Group_0_6__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0_6()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:440:1: ( rule__FeatureMap__Group_0_6__0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:440:2: rule__FeatureMap__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__0_in_rule__FeatureMap__Alternatives_0898);
                    rule__FeatureMap__Group_0_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0_6()); 

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
    // $ANTLR end "rule__FeatureMap__Alternatives_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:449:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ValueAssignment_0 ) ) | ( ( rule__Expression__IntValueAssignment_1 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:453:1: ( ( ( rule__Expression__ValueAssignment_0 ) ) | ( ( rule__Expression__IntValueAssignment_1 ) ) )
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:454:1: ( ( rule__Expression__ValueAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:454:1: ( ( rule__Expression__ValueAssignment_0 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:455:1: ( rule__Expression__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getValueAssignment_0()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:456:1: ( rule__Expression__ValueAssignment_0 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:456:2: rule__Expression__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression__ValueAssignment_0_in_rule__Expression__Alternatives931);
                    rule__Expression__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:460:6: ( ( rule__Expression__IntValueAssignment_1 ) )
                    {
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:460:6: ( ( rule__Expression__IntValueAssignment_1 ) )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:461:1: ( rule__Expression__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getIntValueAssignment_1()); 
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:462:1: ( rule__Expression__IntValueAssignment_1 )
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:462:2: rule__Expression__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expression__IntValueAssignment_1_in_rule__Expression__Alternatives949);
                    rule__Expression__IntValueAssignment_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:473:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:477:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:478:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0980);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0983);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:485:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:489:1: ( ( 'model' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:490:1: ( 'model' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:490:1: ( 'model' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:491:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl1011); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:504:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:508:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:509:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11042);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11045);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:516:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:520:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:521:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:521:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:522:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:523:1: ( rule__Model__NameAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:523:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1072);
            rule__Model__NameAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:533:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:537:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:538:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21102);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21105);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:545:1: rule__Model__Group__2__Impl : ( ( rule__Model__DocumentationAssignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:549:1: ( ( ( rule__Model__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:550:1: ( ( rule__Model__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:550:1: ( ( rule__Model__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:551:1: ( rule__Model__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getModelAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:552:1: ( rule__Model__DocumentationAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:552:2: rule__Model__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__DocumentationAssignment_2_in_rule__Model__Group__2__Impl1132);
                    rule__Model__DocumentationAssignment_2();

                    state._fsp--;


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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:562:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:566:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:567:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31163);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31166);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:574:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:578:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:579:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:579:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:580:1: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:581:1: ( rule__Model__ImportsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:581:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1193);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:591:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:595:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:596:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41224);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41227);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:603:1: rule__Model__Group__4__Impl : ( ( rule__Model__RulesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:607:1: ( ( ( rule__Model__RulesAssignment_4 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:608:1: ( ( rule__Model__RulesAssignment_4 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:608:1: ( ( rule__Model__RulesAssignment_4 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:609:1: ( rule__Model__RulesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:610:1: ( rule__Model__RulesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:610:2: rule__Model__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__RulesAssignment_4_in_rule__Model__Group__4__Impl1254);
            	    rule__Model__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:620:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:624:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:625:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51285);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51288);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:632:1: rule__Model__Group__5__Impl : ( ( rule__Model__FuctionsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:636:1: ( ( ( rule__Model__FuctionsAssignment_5 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:637:1: ( ( rule__Model__FuctionsAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:637:1: ( ( rule__Model__FuctionsAssignment_5 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:638:1: ( rule__Model__FuctionsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getFuctionsAssignment_5()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:639:1: ( rule__Model__FuctionsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:639:2: rule__Model__FuctionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__FuctionsAssignment_5_in_rule__Model__Group__5__Impl1315);
            	    rule__Model__FuctionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFuctionsAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:649:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:653:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:654:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61346);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61349);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:661:1: rule__Model__Group__6__Impl : ( ( rule__Model__MappingModulesAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:665:1: ( ( ( rule__Model__MappingModulesAssignment_6 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:666:1: ( ( rule__Model__MappingModulesAssignment_6 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:666:1: ( ( rule__Model__MappingModulesAssignment_6 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:667:1: ( rule__Model__MappingModulesAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getMappingModulesAssignment_6()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:668:1: ( rule__Model__MappingModulesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:668:2: rule__Model__MappingModulesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__MappingModulesAssignment_6_in_rule__Model__Group__6__Impl1376);
            	    rule__Model__MappingModulesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMappingModulesAssignment_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:678:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:682:1: ( rule__Model__Group__7__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:683:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71407);
            rule__Model__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:689:1: rule__Model__Group__7__Impl : ( ( rule__Model__RootsAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:693:1: ( ( ( rule__Model__RootsAssignment_7 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:694:1: ( ( rule__Model__RootsAssignment_7 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:694:1: ( ( rule__Model__RootsAssignment_7 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:695:1: ( rule__Model__RootsAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getRootsAssignment_7()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:696:1: ( rule__Model__RootsAssignment_7 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:696:2: rule__Model__RootsAssignment_7
            {
            pushFollow(FOLLOW_rule__Model__RootsAssignment_7_in_rule__Model__Group__7__Impl1434);
            rule__Model__RootsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootsAssignment_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:722:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:726:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:727:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01480);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01483);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:734:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:738:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:739:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:739:1: ( 'import' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:740:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl1511); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:753:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:757:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:758:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11542);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:764:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:768:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:769:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:769:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:770:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:771:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:771:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1569);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:785:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:789:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:790:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01603);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01606);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:797:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:801:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:802:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:802:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:803:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1633);
            ruleQualifiedName();

            state._fsp--;

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:814:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:818:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:819:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11662);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:825:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:829:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:830:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:830:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:831:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:832:1: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:833:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1691); 

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
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:848:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:852:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:853:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01728);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01731);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:860:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:864:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:865:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:865:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:866:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1758); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:877:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:881:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:882:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11787);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:888:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:892:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:893:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:893:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:894:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:895:1: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:895:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1814);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:909:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:913:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:914:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01849);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01852);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:921:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:925:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:926:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:926:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:927:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1880); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:940:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:944:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:945:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11911);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:951:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:955:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:956:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:956:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:957:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1938); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__RootModule__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:972:1: rule__RootModule__Group__0 : rule__RootModule__Group__0__Impl rule__RootModule__Group__1 ;
    public final void rule__RootModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:976:1: ( rule__RootModule__Group__0__Impl rule__RootModule__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:977:2: rule__RootModule__Group__0__Impl rule__RootModule__Group__1
            {
            pushFollow(FOLLOW_rule__RootModule__Group__0__Impl_in_rule__RootModule__Group__01971);
            rule__RootModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootModule__Group__1_in_rule__RootModule__Group__01974);
            rule__RootModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootModule__Group__0"


    // $ANTLR start "rule__RootModule__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:984:1: rule__RootModule__Group__0__Impl : ( 'root' ) ;
    public final void rule__RootModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:988:1: ( ( 'root' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:989:1: ( 'root' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:989:1: ( 'root' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:990:1: 'root'
            {
             before(grammarAccess.getRootModuleAccess().getRootKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__RootModule__Group__0__Impl2002); 
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
    // $ANTLR end "rule__RootModule__Group__0__Impl"


    // $ANTLR start "rule__RootModule__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1003:1: rule__RootModule__Group__1 : rule__RootModule__Group__1__Impl rule__RootModule__Group__2 ;
    public final void rule__RootModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1007:1: ( rule__RootModule__Group__1__Impl rule__RootModule__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1008:2: rule__RootModule__Group__1__Impl rule__RootModule__Group__2
            {
            pushFollow(FOLLOW_rule__RootModule__Group__1__Impl_in_rule__RootModule__Group__12033);
            rule__RootModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootModule__Group__2_in_rule__RootModule__Group__12036);
            rule__RootModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootModule__Group__1"


    // $ANTLR start "rule__RootModule__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1015:1: rule__RootModule__Group__1__Impl : ( ( rule__RootModule__RootRefAssignment_1 ) ) ;
    public final void rule__RootModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1019:1: ( ( ( rule__RootModule__RootRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1020:1: ( ( rule__RootModule__RootRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1020:1: ( ( rule__RootModule__RootRefAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1021:1: ( rule__RootModule__RootRefAssignment_1 )
            {
             before(grammarAccess.getRootModuleAccess().getRootRefAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1022:1: ( rule__RootModule__RootRefAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1022:2: rule__RootModule__RootRefAssignment_1
            {
            pushFollow(FOLLOW_rule__RootModule__RootRefAssignment_1_in_rule__RootModule__Group__1__Impl2063);
            rule__RootModule__RootRefAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__RootModule__Group__1__Impl"


    // $ANTLR start "rule__RootModule__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1032:1: rule__RootModule__Group__2 : rule__RootModule__Group__2__Impl ;
    public final void rule__RootModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1036:1: ( rule__RootModule__Group__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1037:2: rule__RootModule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RootModule__Group__2__Impl_in_rule__RootModule__Group__22093);
            rule__RootModule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootModule__Group__2"


    // $ANTLR start "rule__RootModule__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1043:1: rule__RootModule__Group__2__Impl : ( ( rule__RootModule__DocumentationAssignment_2 )? ) ;
    public final void rule__RootModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1047:1: ( ( ( rule__RootModule__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1048:1: ( ( rule__RootModule__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1048:1: ( ( rule__RootModule__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1049:1: ( rule__RootModule__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getRootModuleAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1050:1: ( rule__RootModule__DocumentationAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1050:2: rule__RootModule__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RootModule__DocumentationAssignment_2_in_rule__RootModule__Group__2__Impl2120);
                    rule__RootModule__DocumentationAssignment_2();

                    state._fsp--;


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
    // $ANTLR end "rule__RootModule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1066:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1070:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1071:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02157);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02160);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1078:1: rule__Rule__Group__0__Impl : ( 'define rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1082:1: ( ( 'define rule' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1083:1: ( 'define rule' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1083:1: ( 'define rule' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1084:1: 'define rule'
            {
             before(grammarAccess.getRuleAccess().getDefineRuleKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Rule__Group__0__Impl2188); 
             after(grammarAccess.getRuleAccess().getDefineRuleKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1097:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1101:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1102:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12219);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12222);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1109:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1113:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1114:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1114:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1115:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1116:1: ( rule__Rule__NameAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1116:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2249);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1126:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1130:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1131:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22279);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22282);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1138:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Group_2__0 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1142:1: ( ( ( rule__Rule__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1143:1: ( ( rule__Rule__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1143:1: ( ( rule__Rule__Group_2__0 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1144:1: ( rule__Rule__Group_2__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1145:1: ( rule__Rule__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1145:2: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_2__0_in_rule__Rule__Group__2__Impl2309);
                    rule__Rule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1155:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1159:1: ( rule__Rule__Group__3__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1160:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32340);
            rule__Rule__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1166:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Group_3__0 )? ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1170:1: ( ( ( rule__Rule__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1171:1: ( ( rule__Rule__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1171:1: ( ( rule__Rule__Group_3__0 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1172:1: ( rule__Rule__Group_3__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1173:1: ( rule__Rule__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1173:2: rule__Rule__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl2367);
                    rule__Rule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group_2__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1191:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1195:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1196:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__0__Impl_in_rule__Rule__Group_2__02406);
            rule__Rule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2__1_in_rule__Rule__Group_2__02409);
            rule__Rule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0"


    // $ANTLR start "rule__Rule__Group_2__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1203:1: rule__Rule__Group_2__0__Impl : ( 'op' ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1207:1: ( ( 'op' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1208:1: ( 'op' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1208:1: ( 'op' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1209:1: 'op'
            {
             before(grammarAccess.getRuleAccess().getOpKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Rule__Group_2__0__Impl2437); 
             after(grammarAccess.getRuleAccess().getOpKeyword_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1222:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1226:1: ( rule__Rule__Group_2__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1227:2: rule__Rule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_2__1__Impl_in_rule__Rule__Group_2__12468);
            rule__Rule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1"


    // $ANTLR start "rule__Rule__Group_2__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1233:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__OperationAssignment_2_1 ) ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1237:1: ( ( ( rule__Rule__OperationAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1238:1: ( ( rule__Rule__OperationAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1238:1: ( ( rule__Rule__OperationAssignment_2_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1239:1: ( rule__Rule__OperationAssignment_2_1 )
            {
             before(grammarAccess.getRuleAccess().getOperationAssignment_2_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1240:1: ( rule__Rule__OperationAssignment_2_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1240:2: rule__Rule__OperationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Rule__OperationAssignment_2_1_in_rule__Rule__Group_2__1__Impl2495);
            rule__Rule__OperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOperationAssignment_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_3__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1254:1: rule__Rule__Group_3__0 : rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 ;
    public final void rule__Rule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1258:1: ( rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1259:2: rule__Rule__Group_3__0__Impl rule__Rule__Group_3__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__02529);
            rule__Rule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__02532);
            rule__Rule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__0"


    // $ANTLR start "rule__Rule__Group_3__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1266:1: rule__Rule__Group_3__0__Impl : ( 'args' ) ;
    public final void rule__Rule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1270:1: ( ( 'args' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1271:1: ( 'args' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1271:1: ( 'args' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1272:1: 'args'
            {
             before(grammarAccess.getRuleAccess().getArgsKeyword_3_0()); 
            match(input,18,FOLLOW_18_in_rule__Rule__Group_3__0__Impl2560); 
             after(grammarAccess.getRuleAccess().getArgsKeyword_3_0()); 

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
    // $ANTLR end "rule__Rule__Group_3__0__Impl"


    // $ANTLR start "rule__Rule__Group_3__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1285:1: rule__Rule__Group_3__1 : rule__Rule__Group_3__1__Impl ;
    public final void rule__Rule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1289:1: ( rule__Rule__Group_3__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1290:2: rule__Rule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__12591);
            rule__Rule__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3__1"


    // $ANTLR start "rule__Rule__Group_3__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1296:1: rule__Rule__Group_3__1__Impl : ( ( rule__Rule__ArgsAssignment_3_1 )* ) ;
    public final void rule__Rule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1300:1: ( ( ( rule__Rule__ArgsAssignment_3_1 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1301:1: ( ( rule__Rule__ArgsAssignment_3_1 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1301:1: ( ( rule__Rule__ArgsAssignment_3_1 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1302:1: ( rule__Rule__ArgsAssignment_3_1 )*
            {
             before(grammarAccess.getRuleAccess().getArgsAssignment_3_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1303:1: ( rule__Rule__ArgsAssignment_3_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1303:2: rule__Rule__ArgsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Rule__ArgsAssignment_3_1_in_rule__Rule__Group_3__1__Impl2618);
            	    rule__Rule__ArgsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getArgsAssignment_3_1()); 

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
    // $ANTLR end "rule__Rule__Group_3__1__Impl"


    // $ANTLR start "rule__Fuction__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1317:1: rule__Fuction__Group__0 : rule__Fuction__Group__0__Impl rule__Fuction__Group__1 ;
    public final void rule__Fuction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1321:1: ( rule__Fuction__Group__0__Impl rule__Fuction__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1322:2: rule__Fuction__Group__0__Impl rule__Fuction__Group__1
            {
            pushFollow(FOLLOW_rule__Fuction__Group__0__Impl_in_rule__Fuction__Group__02653);
            rule__Fuction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fuction__Group__1_in_rule__Fuction__Group__02656);
            rule__Fuction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuction__Group__0"


    // $ANTLR start "rule__Fuction__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1329:1: rule__Fuction__Group__0__Impl : ( 'define fonction' ) ;
    public final void rule__Fuction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1333:1: ( ( 'define fonction' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1334:1: ( 'define fonction' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1334:1: ( 'define fonction' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1335:1: 'define fonction'
            {
             before(grammarAccess.getFuctionAccess().getDefineFonctionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Fuction__Group__0__Impl2684); 
             after(grammarAccess.getFuctionAccess().getDefineFonctionKeyword_0()); 

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
    // $ANTLR end "rule__Fuction__Group__0__Impl"


    // $ANTLR start "rule__Fuction__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1348:1: rule__Fuction__Group__1 : rule__Fuction__Group__1__Impl rule__Fuction__Group__2 ;
    public final void rule__Fuction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1352:1: ( rule__Fuction__Group__1__Impl rule__Fuction__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1353:2: rule__Fuction__Group__1__Impl rule__Fuction__Group__2
            {
            pushFollow(FOLLOW_rule__Fuction__Group__1__Impl_in_rule__Fuction__Group__12715);
            rule__Fuction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fuction__Group__2_in_rule__Fuction__Group__12718);
            rule__Fuction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuction__Group__1"


    // $ANTLR start "rule__Fuction__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1360:1: rule__Fuction__Group__1__Impl : ( ( rule__Fuction__NameAssignment_1 ) ) ;
    public final void rule__Fuction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1364:1: ( ( ( rule__Fuction__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1365:1: ( ( rule__Fuction__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1365:1: ( ( rule__Fuction__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1366:1: ( rule__Fuction__NameAssignment_1 )
            {
             before(grammarAccess.getFuctionAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1367:1: ( rule__Fuction__NameAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1367:2: rule__Fuction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Fuction__NameAssignment_1_in_rule__Fuction__Group__1__Impl2745);
            rule__Fuction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fuction__Group__1__Impl"


    // $ANTLR start "rule__Fuction__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1377:1: rule__Fuction__Group__2 : rule__Fuction__Group__2__Impl rule__Fuction__Group__3 ;
    public final void rule__Fuction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1381:1: ( rule__Fuction__Group__2__Impl rule__Fuction__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1382:2: rule__Fuction__Group__2__Impl rule__Fuction__Group__3
            {
            pushFollow(FOLLOW_rule__Fuction__Group__2__Impl_in_rule__Fuction__Group__22775);
            rule__Fuction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fuction__Group__3_in_rule__Fuction__Group__22778);
            rule__Fuction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuction__Group__2"


    // $ANTLR start "rule__Fuction__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1389:1: rule__Fuction__Group__2__Impl : ( ( rule__Fuction__InAssignment_2 )* ) ;
    public final void rule__Fuction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1393:1: ( ( ( rule__Fuction__InAssignment_2 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1394:1: ( ( rule__Fuction__InAssignment_2 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1394:1: ( ( rule__Fuction__InAssignment_2 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1395:1: ( rule__Fuction__InAssignment_2 )*
            {
             before(grammarAccess.getFuctionAccess().getInAssignment_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1396:1: ( rule__Fuction__InAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1396:2: rule__Fuction__InAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Fuction__InAssignment_2_in_rule__Fuction__Group__2__Impl2805);
            	    rule__Fuction__InAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFuctionAccess().getInAssignment_2()); 

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
    // $ANTLR end "rule__Fuction__Group__2__Impl"


    // $ANTLR start "rule__Fuction__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1406:1: rule__Fuction__Group__3 : rule__Fuction__Group__3__Impl rule__Fuction__Group__4 ;
    public final void rule__Fuction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1410:1: ( rule__Fuction__Group__3__Impl rule__Fuction__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1411:2: rule__Fuction__Group__3__Impl rule__Fuction__Group__4
            {
            pushFollow(FOLLOW_rule__Fuction__Group__3__Impl_in_rule__Fuction__Group__32836);
            rule__Fuction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fuction__Group__4_in_rule__Fuction__Group__32839);
            rule__Fuction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuction__Group__3"


    // $ANTLR start "rule__Fuction__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1418:1: rule__Fuction__Group__3__Impl : ( ( rule__Fuction__OutAssignment_3 )* ) ;
    public final void rule__Fuction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1422:1: ( ( ( rule__Fuction__OutAssignment_3 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1423:1: ( ( rule__Fuction__OutAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1423:1: ( ( rule__Fuction__OutAssignment_3 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1424:1: ( rule__Fuction__OutAssignment_3 )*
            {
             before(grammarAccess.getFuctionAccess().getOutAssignment_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1425:1: ( rule__Fuction__OutAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1425:2: rule__Fuction__OutAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Fuction__OutAssignment_3_in_rule__Fuction__Group__3__Impl2866);
            	    rule__Fuction__OutAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFuctionAccess().getOutAssignment_3()); 

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
    // $ANTLR end "rule__Fuction__Group__3__Impl"


    // $ANTLR start "rule__Fuction__Group__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1435:1: rule__Fuction__Group__4 : rule__Fuction__Group__4__Impl ;
    public final void rule__Fuction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1439:1: ( rule__Fuction__Group__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1440:2: rule__Fuction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Fuction__Group__4__Impl_in_rule__Fuction__Group__42897);
            rule__Fuction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuction__Group__4"


    // $ANTLR start "rule__Fuction__Group__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1446:1: rule__Fuction__Group__4__Impl : ( ( rule__Fuction__DocumentationAssignment_4 )? ) ;
    public final void rule__Fuction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1450:1: ( ( ( rule__Fuction__DocumentationAssignment_4 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1451:1: ( ( rule__Fuction__DocumentationAssignment_4 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1451:1: ( ( rule__Fuction__DocumentationAssignment_4 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1452:1: ( rule__Fuction__DocumentationAssignment_4 )?
            {
             before(grammarAccess.getFuctionAccess().getDocumentationAssignment_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1453:1: ( rule__Fuction__DocumentationAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1453:2: rule__Fuction__DocumentationAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Fuction__DocumentationAssignment_4_in_rule__Fuction__Group__4__Impl2924);
                    rule__Fuction__DocumentationAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuctionAccess().getDocumentationAssignment_4()); 

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
    // $ANTLR end "rule__Fuction__Group__4__Impl"


    // $ANTLR start "rule__FuctionIn__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1473:1: rule__FuctionIn__Group__0 : rule__FuctionIn__Group__0__Impl rule__FuctionIn__Group__1 ;
    public final void rule__FuctionIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1477:1: ( rule__FuctionIn__Group__0__Impl rule__FuctionIn__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1478:2: rule__FuctionIn__Group__0__Impl rule__FuctionIn__Group__1
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__0__Impl_in_rule__FuctionIn__Group__02965);
            rule__FuctionIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group__1_in_rule__FuctionIn__Group__02968);
            rule__FuctionIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group__0"


    // $ANTLR start "rule__FuctionIn__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1485:1: rule__FuctionIn__Group__0__Impl : ( 'in' ) ;
    public final void rule__FuctionIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1489:1: ( ( 'in' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1490:1: ( 'in' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1490:1: ( 'in' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1491:1: 'in'
            {
             before(grammarAccess.getFuctionInAccess().getInKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__FuctionIn__Group__0__Impl2996); 
             after(grammarAccess.getFuctionInAccess().getInKeyword_0()); 

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
    // $ANTLR end "rule__FuctionIn__Group__0__Impl"


    // $ANTLR start "rule__FuctionIn__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1504:1: rule__FuctionIn__Group__1 : rule__FuctionIn__Group__1__Impl rule__FuctionIn__Group__2 ;
    public final void rule__FuctionIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1508:1: ( rule__FuctionIn__Group__1__Impl rule__FuctionIn__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1509:2: rule__FuctionIn__Group__1__Impl rule__FuctionIn__Group__2
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__1__Impl_in_rule__FuctionIn__Group__13027);
            rule__FuctionIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group__2_in_rule__FuctionIn__Group__13030);
            rule__FuctionIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group__1"


    // $ANTLR start "rule__FuctionIn__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1516:1: rule__FuctionIn__Group__1__Impl : ( ( rule__FuctionIn__InEntityAssignment_1 ) ) ;
    public final void rule__FuctionIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1520:1: ( ( ( rule__FuctionIn__InEntityAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1521:1: ( ( rule__FuctionIn__InEntityAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1521:1: ( ( rule__FuctionIn__InEntityAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1522:1: ( rule__FuctionIn__InEntityAssignment_1 )
            {
             before(grammarAccess.getFuctionInAccess().getInEntityAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1523:1: ( rule__FuctionIn__InEntityAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1523:2: rule__FuctionIn__InEntityAssignment_1
            {
            pushFollow(FOLLOW_rule__FuctionIn__InEntityAssignment_1_in_rule__FuctionIn__Group__1__Impl3057);
            rule__FuctionIn__InEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuctionInAccess().getInEntityAssignment_1()); 

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
    // $ANTLR end "rule__FuctionIn__Group__1__Impl"


    // $ANTLR start "rule__FuctionIn__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1533:1: rule__FuctionIn__Group__2 : rule__FuctionIn__Group__2__Impl rule__FuctionIn__Group__3 ;
    public final void rule__FuctionIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1537:1: ( rule__FuctionIn__Group__2__Impl rule__FuctionIn__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1538:2: rule__FuctionIn__Group__2__Impl rule__FuctionIn__Group__3
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__2__Impl_in_rule__FuctionIn__Group__23087);
            rule__FuctionIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group__3_in_rule__FuctionIn__Group__23090);
            rule__FuctionIn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group__2"


    // $ANTLR start "rule__FuctionIn__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1545:1: rule__FuctionIn__Group__2__Impl : ( '[' ) ;
    public final void rule__FuctionIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1549:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1550:1: ( '[' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1550:1: ( '[' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1551:1: '['
            {
             before(grammarAccess.getFuctionInAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__FuctionIn__Group__2__Impl3118); 
             after(grammarAccess.getFuctionInAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__FuctionIn__Group__2__Impl"


    // $ANTLR start "rule__FuctionIn__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1564:1: rule__FuctionIn__Group__3 : rule__FuctionIn__Group__3__Impl rule__FuctionIn__Group__4 ;
    public final void rule__FuctionIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1568:1: ( rule__FuctionIn__Group__3__Impl rule__FuctionIn__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1569:2: rule__FuctionIn__Group__3__Impl rule__FuctionIn__Group__4
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__3__Impl_in_rule__FuctionIn__Group__33149);
            rule__FuctionIn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group__4_in_rule__FuctionIn__Group__33152);
            rule__FuctionIn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group__3"


    // $ANTLR start "rule__FuctionIn__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1576:1: rule__FuctionIn__Group__3__Impl : ( ( rule__FuctionIn__Group_3__0 )? ) ;
    public final void rule__FuctionIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1580:1: ( ( ( rule__FuctionIn__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1581:1: ( ( rule__FuctionIn__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1581:1: ( ( rule__FuctionIn__Group_3__0 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1582:1: ( rule__FuctionIn__Group_3__0 )?
            {
             before(grammarAccess.getFuctionInAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1583:1: ( rule__FuctionIn__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1583:2: rule__FuctionIn__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FuctionIn__Group_3__0_in_rule__FuctionIn__Group__3__Impl3179);
                    rule__FuctionIn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuctionInAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FuctionIn__Group__3__Impl"


    // $ANTLR start "rule__FuctionIn__Group__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1593:1: rule__FuctionIn__Group__4 : rule__FuctionIn__Group__4__Impl ;
    public final void rule__FuctionIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1597:1: ( rule__FuctionIn__Group__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1598:2: rule__FuctionIn__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group__4__Impl_in_rule__FuctionIn__Group__43210);
            rule__FuctionIn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group__4"


    // $ANTLR start "rule__FuctionIn__Group__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1604:1: rule__FuctionIn__Group__4__Impl : ( ']' ) ;
    public final void rule__FuctionIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1608:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1609:1: ( ']' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1609:1: ( ']' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1610:1: ']'
            {
             before(grammarAccess.getFuctionInAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__FuctionIn__Group__4__Impl3238); 
             after(grammarAccess.getFuctionInAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__FuctionIn__Group__4__Impl"


    // $ANTLR start "rule__FuctionIn__Group_3__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1633:1: rule__FuctionIn__Group_3__0 : rule__FuctionIn__Group_3__0__Impl rule__FuctionIn__Group_3__1 ;
    public final void rule__FuctionIn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1637:1: ( rule__FuctionIn__Group_3__0__Impl rule__FuctionIn__Group_3__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1638:2: rule__FuctionIn__Group_3__0__Impl rule__FuctionIn__Group_3__1
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group_3__0__Impl_in_rule__FuctionIn__Group_3__03279);
            rule__FuctionIn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group_3__1_in_rule__FuctionIn__Group_3__03282);
            rule__FuctionIn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3__0"


    // $ANTLR start "rule__FuctionIn__Group_3__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1645:1: rule__FuctionIn__Group_3__0__Impl : ( ( rule__FuctionIn__InAttributeAssignment_3_0 ) ) ;
    public final void rule__FuctionIn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1649:1: ( ( ( rule__FuctionIn__InAttributeAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1650:1: ( ( rule__FuctionIn__InAttributeAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1650:1: ( ( rule__FuctionIn__InAttributeAssignment_3_0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1651:1: ( rule__FuctionIn__InAttributeAssignment_3_0 )
            {
             before(grammarAccess.getFuctionInAccess().getInAttributeAssignment_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1652:1: ( rule__FuctionIn__InAttributeAssignment_3_0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1652:2: rule__FuctionIn__InAttributeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__FuctionIn__InAttributeAssignment_3_0_in_rule__FuctionIn__Group_3__0__Impl3309);
            rule__FuctionIn__InAttributeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFuctionInAccess().getInAttributeAssignment_3_0()); 

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
    // $ANTLR end "rule__FuctionIn__Group_3__0__Impl"


    // $ANTLR start "rule__FuctionIn__Group_3__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1662:1: rule__FuctionIn__Group_3__1 : rule__FuctionIn__Group_3__1__Impl ;
    public final void rule__FuctionIn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1666:1: ( rule__FuctionIn__Group_3__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1667:2: rule__FuctionIn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group_3__1__Impl_in_rule__FuctionIn__Group_3__13339);
            rule__FuctionIn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3__1"


    // $ANTLR start "rule__FuctionIn__Group_3__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1673:1: rule__FuctionIn__Group_3__1__Impl : ( ( rule__FuctionIn__Group_3_1__0 )* ) ;
    public final void rule__FuctionIn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1677:1: ( ( ( rule__FuctionIn__Group_3_1__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1678:1: ( ( rule__FuctionIn__Group_3_1__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1678:1: ( ( rule__FuctionIn__Group_3_1__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1679:1: ( rule__FuctionIn__Group_3_1__0 )*
            {
             before(grammarAccess.getFuctionInAccess().getGroup_3_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1680:1: ( rule__FuctionIn__Group_3_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1680:2: rule__FuctionIn__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__0_in_rule__FuctionIn__Group_3__1__Impl3366);
            	    rule__FuctionIn__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFuctionInAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__FuctionIn__Group_3__1__Impl"


    // $ANTLR start "rule__FuctionIn__Group_3_1__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1694:1: rule__FuctionIn__Group_3_1__0 : rule__FuctionIn__Group_3_1__0__Impl rule__FuctionIn__Group_3_1__1 ;
    public final void rule__FuctionIn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1698:1: ( rule__FuctionIn__Group_3_1__0__Impl rule__FuctionIn__Group_3_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1699:2: rule__FuctionIn__Group_3_1__0__Impl rule__FuctionIn__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__0__Impl_in_rule__FuctionIn__Group_3_1__03401);
            rule__FuctionIn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__1_in_rule__FuctionIn__Group_3_1__03404);
            rule__FuctionIn__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3_1__0"


    // $ANTLR start "rule__FuctionIn__Group_3_1__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1706:1: rule__FuctionIn__Group_3_1__0__Impl : ( () ) ;
    public final void rule__FuctionIn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1710:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1711:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1711:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1712:1: ()
            {
             before(grammarAccess.getFuctionInAccess().getNestedInTransformationParameterTargetAction_3_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1713:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1715:1: 
            {
            }

             after(grammarAccess.getFuctionInAccess().getNestedInTransformationParameterTargetAction_3_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3_1__0__Impl"


    // $ANTLR start "rule__FuctionIn__Group_3_1__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1725:1: rule__FuctionIn__Group_3_1__1 : rule__FuctionIn__Group_3_1__1__Impl rule__FuctionIn__Group_3_1__2 ;
    public final void rule__FuctionIn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1729:1: ( rule__FuctionIn__Group_3_1__1__Impl rule__FuctionIn__Group_3_1__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1730:2: rule__FuctionIn__Group_3_1__1__Impl rule__FuctionIn__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__1__Impl_in_rule__FuctionIn__Group_3_1__13462);
            rule__FuctionIn__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__2_in_rule__FuctionIn__Group_3_1__13465);
            rule__FuctionIn__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3_1__1"


    // $ANTLR start "rule__FuctionIn__Group_3_1__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1737:1: rule__FuctionIn__Group_3_1__1__Impl : ( '.' ) ;
    public final void rule__FuctionIn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1741:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1742:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1742:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1743:1: '.'
            {
             before(grammarAccess.getFuctionInAccess().getFullStopKeyword_3_1_1()); 
            match(input,14,FOLLOW_14_in_rule__FuctionIn__Group_3_1__1__Impl3493); 
             after(grammarAccess.getFuctionInAccess().getFullStopKeyword_3_1_1()); 

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
    // $ANTLR end "rule__FuctionIn__Group_3_1__1__Impl"


    // $ANTLR start "rule__FuctionIn__Group_3_1__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1756:1: rule__FuctionIn__Group_3_1__2 : rule__FuctionIn__Group_3_1__2__Impl ;
    public final void rule__FuctionIn__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1760:1: ( rule__FuctionIn__Group_3_1__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1761:2: rule__FuctionIn__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FuctionIn__Group_3_1__2__Impl_in_rule__FuctionIn__Group_3_1__23524);
            rule__FuctionIn__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionIn__Group_3_1__2"


    // $ANTLR start "rule__FuctionIn__Group_3_1__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1767:1: rule__FuctionIn__Group_3_1__2__Impl : ( ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 ) ) ;
    public final void rule__FuctionIn__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1771:1: ( ( ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1772:1: ( ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1772:1: ( ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1773:1: ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 )
            {
             before(grammarAccess.getFuctionInAccess().getInRefAttributeAssignment_3_1_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1774:1: ( rule__FuctionIn__InRefAttributeAssignment_3_1_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1774:2: rule__FuctionIn__InRefAttributeAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__FuctionIn__InRefAttributeAssignment_3_1_2_in_rule__FuctionIn__Group_3_1__2__Impl3551);
            rule__FuctionIn__InRefAttributeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFuctionInAccess().getInRefAttributeAssignment_3_1_2()); 

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
    // $ANTLR end "rule__FuctionIn__Group_3_1__2__Impl"


    // $ANTLR start "rule__FuctionOut__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1790:1: rule__FuctionOut__Group__0 : rule__FuctionOut__Group__0__Impl rule__FuctionOut__Group__1 ;
    public final void rule__FuctionOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1794:1: ( rule__FuctionOut__Group__0__Impl rule__FuctionOut__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1795:2: rule__FuctionOut__Group__0__Impl rule__FuctionOut__Group__1
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__0__Impl_in_rule__FuctionOut__Group__03587);
            rule__FuctionOut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group__1_in_rule__FuctionOut__Group__03590);
            rule__FuctionOut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group__0"


    // $ANTLR start "rule__FuctionOut__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1802:1: rule__FuctionOut__Group__0__Impl : ( 'out' ) ;
    public final void rule__FuctionOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1806:1: ( ( 'out' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1807:1: ( 'out' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1807:1: ( 'out' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1808:1: 'out'
            {
             before(grammarAccess.getFuctionOutAccess().getOutKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__FuctionOut__Group__0__Impl3618); 
             after(grammarAccess.getFuctionOutAccess().getOutKeyword_0()); 

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
    // $ANTLR end "rule__FuctionOut__Group__0__Impl"


    // $ANTLR start "rule__FuctionOut__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1821:1: rule__FuctionOut__Group__1 : rule__FuctionOut__Group__1__Impl rule__FuctionOut__Group__2 ;
    public final void rule__FuctionOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1825:1: ( rule__FuctionOut__Group__1__Impl rule__FuctionOut__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1826:2: rule__FuctionOut__Group__1__Impl rule__FuctionOut__Group__2
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__1__Impl_in_rule__FuctionOut__Group__13649);
            rule__FuctionOut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group__2_in_rule__FuctionOut__Group__13652);
            rule__FuctionOut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group__1"


    // $ANTLR start "rule__FuctionOut__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1833:1: rule__FuctionOut__Group__1__Impl : ( ( rule__FuctionOut__OutEntityAssignment_1 ) ) ;
    public final void rule__FuctionOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1837:1: ( ( ( rule__FuctionOut__OutEntityAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1838:1: ( ( rule__FuctionOut__OutEntityAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1838:1: ( ( rule__FuctionOut__OutEntityAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1839:1: ( rule__FuctionOut__OutEntityAssignment_1 )
            {
             before(grammarAccess.getFuctionOutAccess().getOutEntityAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1840:1: ( rule__FuctionOut__OutEntityAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1840:2: rule__FuctionOut__OutEntityAssignment_1
            {
            pushFollow(FOLLOW_rule__FuctionOut__OutEntityAssignment_1_in_rule__FuctionOut__Group__1__Impl3679);
            rule__FuctionOut__OutEntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuctionOutAccess().getOutEntityAssignment_1()); 

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
    // $ANTLR end "rule__FuctionOut__Group__1__Impl"


    // $ANTLR start "rule__FuctionOut__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1850:1: rule__FuctionOut__Group__2 : rule__FuctionOut__Group__2__Impl rule__FuctionOut__Group__3 ;
    public final void rule__FuctionOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1854:1: ( rule__FuctionOut__Group__2__Impl rule__FuctionOut__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1855:2: rule__FuctionOut__Group__2__Impl rule__FuctionOut__Group__3
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__2__Impl_in_rule__FuctionOut__Group__23709);
            rule__FuctionOut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group__3_in_rule__FuctionOut__Group__23712);
            rule__FuctionOut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group__2"


    // $ANTLR start "rule__FuctionOut__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1862:1: rule__FuctionOut__Group__2__Impl : ( '[' ) ;
    public final void rule__FuctionOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1866:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1867:1: ( '[' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1867:1: ( '[' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1868:1: '['
            {
             before(grammarAccess.getFuctionOutAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__FuctionOut__Group__2__Impl3740); 
             after(grammarAccess.getFuctionOutAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__FuctionOut__Group__2__Impl"


    // $ANTLR start "rule__FuctionOut__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1881:1: rule__FuctionOut__Group__3 : rule__FuctionOut__Group__3__Impl rule__FuctionOut__Group__4 ;
    public final void rule__FuctionOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1885:1: ( rule__FuctionOut__Group__3__Impl rule__FuctionOut__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1886:2: rule__FuctionOut__Group__3__Impl rule__FuctionOut__Group__4
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__3__Impl_in_rule__FuctionOut__Group__33771);
            rule__FuctionOut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group__4_in_rule__FuctionOut__Group__33774);
            rule__FuctionOut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group__3"


    // $ANTLR start "rule__FuctionOut__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1893:1: rule__FuctionOut__Group__3__Impl : ( ( rule__FuctionOut__Group_3__0 )? ) ;
    public final void rule__FuctionOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1897:1: ( ( ( rule__FuctionOut__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1898:1: ( ( rule__FuctionOut__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1898:1: ( ( rule__FuctionOut__Group_3__0 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1899:1: ( rule__FuctionOut__Group_3__0 )?
            {
             before(grammarAccess.getFuctionOutAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1900:1: ( rule__FuctionOut__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1900:2: rule__FuctionOut__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FuctionOut__Group_3__0_in_rule__FuctionOut__Group__3__Impl3801);
                    rule__FuctionOut__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFuctionOutAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FuctionOut__Group__3__Impl"


    // $ANTLR start "rule__FuctionOut__Group__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1910:1: rule__FuctionOut__Group__4 : rule__FuctionOut__Group__4__Impl ;
    public final void rule__FuctionOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1914:1: ( rule__FuctionOut__Group__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1915:2: rule__FuctionOut__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group__4__Impl_in_rule__FuctionOut__Group__43832);
            rule__FuctionOut__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group__4"


    // $ANTLR start "rule__FuctionOut__Group__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1921:1: rule__FuctionOut__Group__4__Impl : ( ']' ) ;
    public final void rule__FuctionOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1925:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1926:1: ( ']' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1926:1: ( ']' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1927:1: ']'
            {
             before(grammarAccess.getFuctionOutAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__FuctionOut__Group__4__Impl3860); 
             after(grammarAccess.getFuctionOutAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__FuctionOut__Group__4__Impl"


    // $ANTLR start "rule__FuctionOut__Group_3__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1950:1: rule__FuctionOut__Group_3__0 : rule__FuctionOut__Group_3__0__Impl rule__FuctionOut__Group_3__1 ;
    public final void rule__FuctionOut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1954:1: ( rule__FuctionOut__Group_3__0__Impl rule__FuctionOut__Group_3__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1955:2: rule__FuctionOut__Group_3__0__Impl rule__FuctionOut__Group_3__1
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group_3__0__Impl_in_rule__FuctionOut__Group_3__03901);
            rule__FuctionOut__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group_3__1_in_rule__FuctionOut__Group_3__03904);
            rule__FuctionOut__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3__0"


    // $ANTLR start "rule__FuctionOut__Group_3__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1962:1: rule__FuctionOut__Group_3__0__Impl : ( ( rule__FuctionOut__OutAttributeAssignment_3_0 ) ) ;
    public final void rule__FuctionOut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1966:1: ( ( ( rule__FuctionOut__OutAttributeAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1967:1: ( ( rule__FuctionOut__OutAttributeAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1967:1: ( ( rule__FuctionOut__OutAttributeAssignment_3_0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1968:1: ( rule__FuctionOut__OutAttributeAssignment_3_0 )
            {
             before(grammarAccess.getFuctionOutAccess().getOutAttributeAssignment_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1969:1: ( rule__FuctionOut__OutAttributeAssignment_3_0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1969:2: rule__FuctionOut__OutAttributeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__FuctionOut__OutAttributeAssignment_3_0_in_rule__FuctionOut__Group_3__0__Impl3931);
            rule__FuctionOut__OutAttributeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFuctionOutAccess().getOutAttributeAssignment_3_0()); 

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
    // $ANTLR end "rule__FuctionOut__Group_3__0__Impl"


    // $ANTLR start "rule__FuctionOut__Group_3__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1979:1: rule__FuctionOut__Group_3__1 : rule__FuctionOut__Group_3__1__Impl ;
    public final void rule__FuctionOut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1983:1: ( rule__FuctionOut__Group_3__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1984:2: rule__FuctionOut__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group_3__1__Impl_in_rule__FuctionOut__Group_3__13961);
            rule__FuctionOut__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3__1"


    // $ANTLR start "rule__FuctionOut__Group_3__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1990:1: rule__FuctionOut__Group_3__1__Impl : ( ( rule__FuctionOut__Group_3_1__0 )* ) ;
    public final void rule__FuctionOut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1994:1: ( ( ( rule__FuctionOut__Group_3_1__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1995:1: ( ( rule__FuctionOut__Group_3_1__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1995:1: ( ( rule__FuctionOut__Group_3_1__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1996:1: ( rule__FuctionOut__Group_3_1__0 )*
            {
             before(grammarAccess.getFuctionOutAccess().getGroup_3_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1997:1: ( rule__FuctionOut__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==14) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:1997:2: rule__FuctionOut__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__0_in_rule__FuctionOut__Group_3__1__Impl3988);
            	    rule__FuctionOut__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFuctionOutAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__FuctionOut__Group_3__1__Impl"


    // $ANTLR start "rule__FuctionOut__Group_3_1__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2011:1: rule__FuctionOut__Group_3_1__0 : rule__FuctionOut__Group_3_1__0__Impl rule__FuctionOut__Group_3_1__1 ;
    public final void rule__FuctionOut__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2015:1: ( rule__FuctionOut__Group_3_1__0__Impl rule__FuctionOut__Group_3_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2016:2: rule__FuctionOut__Group_3_1__0__Impl rule__FuctionOut__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__0__Impl_in_rule__FuctionOut__Group_3_1__04023);
            rule__FuctionOut__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__1_in_rule__FuctionOut__Group_3_1__04026);
            rule__FuctionOut__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3_1__0"


    // $ANTLR start "rule__FuctionOut__Group_3_1__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2023:1: rule__FuctionOut__Group_3_1__0__Impl : ( () ) ;
    public final void rule__FuctionOut__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2027:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2028:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2028:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2029:1: ()
            {
             before(grammarAccess.getFuctionOutAccess().getNestedOutTransformationParameterTargetAction_3_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2030:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2032:1: 
            {
            }

             after(grammarAccess.getFuctionOutAccess().getNestedOutTransformationParameterTargetAction_3_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3_1__0__Impl"


    // $ANTLR start "rule__FuctionOut__Group_3_1__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2042:1: rule__FuctionOut__Group_3_1__1 : rule__FuctionOut__Group_3_1__1__Impl rule__FuctionOut__Group_3_1__2 ;
    public final void rule__FuctionOut__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2046:1: ( rule__FuctionOut__Group_3_1__1__Impl rule__FuctionOut__Group_3_1__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2047:2: rule__FuctionOut__Group_3_1__1__Impl rule__FuctionOut__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__1__Impl_in_rule__FuctionOut__Group_3_1__14084);
            rule__FuctionOut__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__2_in_rule__FuctionOut__Group_3_1__14087);
            rule__FuctionOut__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3_1__1"


    // $ANTLR start "rule__FuctionOut__Group_3_1__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2054:1: rule__FuctionOut__Group_3_1__1__Impl : ( '.' ) ;
    public final void rule__FuctionOut__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2058:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2059:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2059:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2060:1: '.'
            {
             before(grammarAccess.getFuctionOutAccess().getFullStopKeyword_3_1_1()); 
            match(input,14,FOLLOW_14_in_rule__FuctionOut__Group_3_1__1__Impl4115); 
             after(grammarAccess.getFuctionOutAccess().getFullStopKeyword_3_1_1()); 

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
    // $ANTLR end "rule__FuctionOut__Group_3_1__1__Impl"


    // $ANTLR start "rule__FuctionOut__Group_3_1__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2073:1: rule__FuctionOut__Group_3_1__2 : rule__FuctionOut__Group_3_1__2__Impl ;
    public final void rule__FuctionOut__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2077:1: ( rule__FuctionOut__Group_3_1__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2078:2: rule__FuctionOut__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FuctionOut__Group_3_1__2__Impl_in_rule__FuctionOut__Group_3_1__24146);
            rule__FuctionOut__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuctionOut__Group_3_1__2"


    // $ANTLR start "rule__FuctionOut__Group_3_1__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2084:1: rule__FuctionOut__Group_3_1__2__Impl : ( ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 ) ) ;
    public final void rule__FuctionOut__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2088:1: ( ( ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2089:1: ( ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2089:1: ( ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2090:1: ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 )
            {
             before(grammarAccess.getFuctionOutAccess().getOutRefAttributeAssignment_3_1_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2091:1: ( rule__FuctionOut__OutRefAttributeAssignment_3_1_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2091:2: rule__FuctionOut__OutRefAttributeAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__FuctionOut__OutRefAttributeAssignment_3_1_2_in_rule__FuctionOut__Group_3_1__2__Impl4173);
            rule__FuctionOut__OutRefAttributeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFuctionOutAccess().getOutRefAttributeAssignment_3_1_2()); 

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
    // $ANTLR end "rule__FuctionOut__Group_3_1__2__Impl"


    // $ANTLR start "rule__MappingModule__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2107:1: rule__MappingModule__Group__0 : rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 ;
    public final void rule__MappingModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2111:1: ( rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2112:2: rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__04209);
            rule__MappingModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__04212);
            rule__MappingModule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__0"


    // $ANTLR start "rule__MappingModule__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2119:1: rule__MappingModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__MappingModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2123:1: ( ( 'module' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2124:1: ( 'module' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2124:1: ( 'module' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2125:1: 'module'
            {
             before(grammarAccess.getMappingModuleAccess().getModuleKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__MappingModule__Group__0__Impl4240); 
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
    // $ANTLR end "rule__MappingModule__Group__0__Impl"


    // $ANTLR start "rule__MappingModule__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2138:1: rule__MappingModule__Group__1 : rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 ;
    public final void rule__MappingModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2142:1: ( rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2143:2: rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__14271);
            rule__MappingModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__14274);
            rule__MappingModule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__1"


    // $ANTLR start "rule__MappingModule__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2150:1: rule__MappingModule__Group__1__Impl : ( ( rule__MappingModule__NameAssignment_1 ) ) ;
    public final void rule__MappingModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2154:1: ( ( ( rule__MappingModule__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2155:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2155:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2156:1: ( rule__MappingModule__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModuleAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2157:1: ( rule__MappingModule__NameAssignment_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2157:2: rule__MappingModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl4301);
            rule__MappingModule__NameAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__MappingModule__Group__1__Impl"


    // $ANTLR start "rule__MappingModule__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2167:1: rule__MappingModule__Group__2 : rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 ;
    public final void rule__MappingModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2171:1: ( rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2172:2: rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__24331);
            rule__MappingModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__24334);
            rule__MappingModule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__2"


    // $ANTLR start "rule__MappingModule__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2179:1: rule__MappingModule__Group__2__Impl : ( 'source' ) ;
    public final void rule__MappingModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2183:1: ( ( 'source' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2184:1: ( 'source' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2184:1: ( 'source' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2185:1: 'source'
            {
             before(grammarAccess.getMappingModuleAccess().getSourceKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__MappingModule__Group__2__Impl4362); 
             after(grammarAccess.getMappingModuleAccess().getSourceKeyword_2()); 

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
    // $ANTLR end "rule__MappingModule__Group__2__Impl"


    // $ANTLR start "rule__MappingModule__Group__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2198:1: rule__MappingModule__Group__3 : rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 ;
    public final void rule__MappingModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2202:1: ( rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2203:2: rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__34393);
            rule__MappingModule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__34396);
            rule__MappingModule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__3"


    // $ANTLR start "rule__MappingModule__Group__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2210:1: rule__MappingModule__Group__3__Impl : ( ( rule__MappingModule__EntitySourceAssignment_3 ) ) ;
    public final void rule__MappingModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2214:1: ( ( ( rule__MappingModule__EntitySourceAssignment_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2215:1: ( ( rule__MappingModule__EntitySourceAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2215:1: ( ( rule__MappingModule__EntitySourceAssignment_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2216:1: ( rule__MappingModule__EntitySourceAssignment_3 )
            {
             before(grammarAccess.getMappingModuleAccess().getEntitySourceAssignment_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2217:1: ( rule__MappingModule__EntitySourceAssignment_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2217:2: rule__MappingModule__EntitySourceAssignment_3
            {
            pushFollow(FOLLOW_rule__MappingModule__EntitySourceAssignment_3_in_rule__MappingModule__Group__3__Impl4423);
            rule__MappingModule__EntitySourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getEntitySourceAssignment_3()); 

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
    // $ANTLR end "rule__MappingModule__Group__3__Impl"


    // $ANTLR start "rule__MappingModule__Group__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2227:1: rule__MappingModule__Group__4 : rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 ;
    public final void rule__MappingModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2231:1: ( rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2232:2: rule__MappingModule__Group__4__Impl rule__MappingModule__Group__5
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__44453);
            rule__MappingModule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__44456);
            rule__MappingModule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__4"


    // $ANTLR start "rule__MappingModule__Group__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2239:1: rule__MappingModule__Group__4__Impl : ( 'target' ) ;
    public final void rule__MappingModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2243:1: ( ( 'target' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2244:1: ( 'target' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2244:1: ( 'target' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2245:1: 'target'
            {
             before(grammarAccess.getMappingModuleAccess().getTargetKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__MappingModule__Group__4__Impl4484); 
             after(grammarAccess.getMappingModuleAccess().getTargetKeyword_4()); 

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
    // $ANTLR end "rule__MappingModule__Group__4__Impl"


    // $ANTLR start "rule__MappingModule__Group__5"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2258:1: rule__MappingModule__Group__5 : rule__MappingModule__Group__5__Impl rule__MappingModule__Group__6 ;
    public final void rule__MappingModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2262:1: ( rule__MappingModule__Group__5__Impl rule__MappingModule__Group__6 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2263:2: rule__MappingModule__Group__5__Impl rule__MappingModule__Group__6
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__54515);
            rule__MappingModule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__6_in_rule__MappingModule__Group__54518);
            rule__MappingModule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__5"


    // $ANTLR start "rule__MappingModule__Group__5__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2270:1: rule__MappingModule__Group__5__Impl : ( ( rule__MappingModule__EntityTargetAssignment_5 ) ) ;
    public final void rule__MappingModule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2274:1: ( ( ( rule__MappingModule__EntityTargetAssignment_5 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2275:1: ( ( rule__MappingModule__EntityTargetAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2275:1: ( ( rule__MappingModule__EntityTargetAssignment_5 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2276:1: ( rule__MappingModule__EntityTargetAssignment_5 )
            {
             before(grammarAccess.getMappingModuleAccess().getEntityTargetAssignment_5()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2277:1: ( rule__MappingModule__EntityTargetAssignment_5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2277:2: rule__MappingModule__EntityTargetAssignment_5
            {
            pushFollow(FOLLOW_rule__MappingModule__EntityTargetAssignment_5_in_rule__MappingModule__Group__5__Impl4545);
            rule__MappingModule__EntityTargetAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getEntityTargetAssignment_5()); 

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
    // $ANTLR end "rule__MappingModule__Group__5__Impl"


    // $ANTLR start "rule__MappingModule__Group__6"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2287:1: rule__MappingModule__Group__6 : rule__MappingModule__Group__6__Impl rule__MappingModule__Group__7 ;
    public final void rule__MappingModule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2291:1: ( rule__MappingModule__Group__6__Impl rule__MappingModule__Group__7 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2292:2: rule__MappingModule__Group__6__Impl rule__MappingModule__Group__7
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__6__Impl_in_rule__MappingModule__Group__64575);
            rule__MappingModule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__7_in_rule__MappingModule__Group__64578);
            rule__MappingModule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__6"


    // $ANTLR start "rule__MappingModule__Group__6__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2299:1: rule__MappingModule__Group__6__Impl : ( ( rule__MappingModule__DocumentationAssignment_6 )? ) ;
    public final void rule__MappingModule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2303:1: ( ( ( rule__MappingModule__DocumentationAssignment_6 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2304:1: ( ( rule__MappingModule__DocumentationAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2304:1: ( ( rule__MappingModule__DocumentationAssignment_6 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2305:1: ( rule__MappingModule__DocumentationAssignment_6 )?
            {
             before(grammarAccess.getMappingModuleAccess().getDocumentationAssignment_6()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2306:1: ( rule__MappingModule__DocumentationAssignment_6 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2306:2: rule__MappingModule__DocumentationAssignment_6
                    {
                    pushFollow(FOLLOW_rule__MappingModule__DocumentationAssignment_6_in_rule__MappingModule__Group__6__Impl4605);
                    rule__MappingModule__DocumentationAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModuleAccess().getDocumentationAssignment_6()); 

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
    // $ANTLR end "rule__MappingModule__Group__6__Impl"


    // $ANTLR start "rule__MappingModule__Group__7"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2316:1: rule__MappingModule__Group__7 : rule__MappingModule__Group__7__Impl rule__MappingModule__Group__8 ;
    public final void rule__MappingModule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2320:1: ( rule__MappingModule__Group__7__Impl rule__MappingModule__Group__8 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2321:2: rule__MappingModule__Group__7__Impl rule__MappingModule__Group__8
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__7__Impl_in_rule__MappingModule__Group__74636);
            rule__MappingModule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__8_in_rule__MappingModule__Group__74639);
            rule__MappingModule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__7"


    // $ANTLR start "rule__MappingModule__Group__7__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2328:1: rule__MappingModule__Group__7__Impl : ( '{' ) ;
    public final void rule__MappingModule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2332:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2333:1: ( '{' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2333:1: ( '{' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2334:1: '{'
            {
             before(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__MappingModule__Group__7__Impl4667); 
             after(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__MappingModule__Group__7__Impl"


    // $ANTLR start "rule__MappingModule__Group__8"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2347:1: rule__MappingModule__Group__8 : rule__MappingModule__Group__8__Impl rule__MappingModule__Group__9 ;
    public final void rule__MappingModule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2351:1: ( rule__MappingModule__Group__8__Impl rule__MappingModule__Group__9 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2352:2: rule__MappingModule__Group__8__Impl rule__MappingModule__Group__9
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__8__Impl_in_rule__MappingModule__Group__84698);
            rule__MappingModule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__9_in_rule__MappingModule__Group__84701);
            rule__MappingModule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__8"


    // $ANTLR start "rule__MappingModule__Group__8__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2359:1: rule__MappingModule__Group__8__Impl : ( ( rule__MappingModule__Group_8__0 )* ) ;
    public final void rule__MappingModule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2363:1: ( ( ( rule__MappingModule__Group_8__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2364:1: ( ( rule__MappingModule__Group_8__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2364:1: ( ( rule__MappingModule__Group_8__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2365:1: ( rule__MappingModule__Group_8__0 )*
            {
             before(grammarAccess.getMappingModuleAccess().getGroup_8()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2366:1: ( rule__MappingModule__Group_8__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=30 && LA22_0<=31)||(LA22_0>=33 && LA22_0<=34)||(LA22_0>=36 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2366:2: rule__MappingModule__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__MappingModule__Group_8__0_in_rule__MappingModule__Group__8__Impl4728);
            	    rule__MappingModule__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMappingModuleAccess().getGroup_8()); 

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
    // $ANTLR end "rule__MappingModule__Group__8__Impl"


    // $ANTLR start "rule__MappingModule__Group__9"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2376:1: rule__MappingModule__Group__9 : rule__MappingModule__Group__9__Impl ;
    public final void rule__MappingModule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2380:1: ( rule__MappingModule__Group__9__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2381:2: rule__MappingModule__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__9__Impl_in_rule__MappingModule__Group__94759);
            rule__MappingModule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group__9"


    // $ANTLR start "rule__MappingModule__Group__9__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2387:1: rule__MappingModule__Group__9__Impl : ( '}' ) ;
    public final void rule__MappingModule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2391:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2392:1: ( '}' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2392:1: ( '}' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2393:1: '}'
            {
             before(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_28_in_rule__MappingModule__Group__9__Impl4787); 
             after(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__MappingModule__Group__9__Impl"


    // $ANTLR start "rule__MappingModule__Group_8__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2426:1: rule__MappingModule__Group_8__0 : rule__MappingModule__Group_8__0__Impl rule__MappingModule__Group_8__1 ;
    public final void rule__MappingModule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2430:1: ( rule__MappingModule__Group_8__0__Impl rule__MappingModule__Group_8__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2431:2: rule__MappingModule__Group_8__0__Impl rule__MappingModule__Group_8__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_8__0__Impl_in_rule__MappingModule__Group_8__04838);
            rule__MappingModule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group_8__1_in_rule__MappingModule__Group_8__04841);
            rule__MappingModule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group_8__0"


    // $ANTLR start "rule__MappingModule__Group_8__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2438:1: rule__MappingModule__Group_8__0__Impl : ( ( rule__MappingModule__MappedFeaturesAssignment_8_0 ) ) ;
    public final void rule__MappingModule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2442:1: ( ( ( rule__MappingModule__MappedFeaturesAssignment_8_0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2443:1: ( ( rule__MappingModule__MappedFeaturesAssignment_8_0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2443:1: ( ( rule__MappingModule__MappedFeaturesAssignment_8_0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2444:1: ( rule__MappingModule__MappedFeaturesAssignment_8_0 )
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_8_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2445:1: ( rule__MappingModule__MappedFeaturesAssignment_8_0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2445:2: rule__MappingModule__MappedFeaturesAssignment_8_0
            {
            pushFollow(FOLLOW_rule__MappingModule__MappedFeaturesAssignment_8_0_in_rule__MappingModule__Group_8__0__Impl4868);
            rule__MappingModule__MappedFeaturesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_8_0()); 

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
    // $ANTLR end "rule__MappingModule__Group_8__0__Impl"


    // $ANTLR start "rule__MappingModule__Group_8__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2455:1: rule__MappingModule__Group_8__1 : rule__MappingModule__Group_8__1__Impl ;
    public final void rule__MappingModule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2459:1: ( rule__MappingModule__Group_8__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2460:2: rule__MappingModule__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_8__1__Impl_in_rule__MappingModule__Group_8__14898);
            rule__MappingModule__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModule__Group_8__1"


    // $ANTLR start "rule__MappingModule__Group_8__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2466:1: rule__MappingModule__Group_8__1__Impl : ( ( ';' )? ) ;
    public final void rule__MappingModule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2470:1: ( ( ( ';' )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2471:1: ( ( ';' )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2471:1: ( ( ';' )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2472:1: ( ';' )?
            {
             before(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_8_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2473:1: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2474:2: ';'
                    {
                    match(input,29,FOLLOW_29_in_rule__MappingModule__Group_8__1__Impl4927); 

                    }
                    break;

            }

             after(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_8_1()); 

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
    // $ANTLR end "rule__MappingModule__Group_8__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2489:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2493:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2494:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__0__Impl_in_rule__FeatureMap__Group__04964);
            rule__FeatureMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group__1_in_rule__FeatureMap__Group__04967);
            rule__FeatureMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__0"


    // $ANTLR start "rule__FeatureMap__Group__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2501:1: rule__FeatureMap__Group__0__Impl : ( ( rule__FeatureMap__Alternatives_0 ) ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2505:1: ( ( ( rule__FeatureMap__Alternatives_0 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2506:1: ( ( rule__FeatureMap__Alternatives_0 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2506:1: ( ( rule__FeatureMap__Alternatives_0 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2507:1: ( rule__FeatureMap__Alternatives_0 )
            {
             before(grammarAccess.getFeatureMapAccess().getAlternatives_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2508:1: ( rule__FeatureMap__Alternatives_0 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2508:2: rule__FeatureMap__Alternatives_0
            {
            pushFollow(FOLLOW_rule__FeatureMap__Alternatives_0_in_rule__FeatureMap__Group__0__Impl4994);
            rule__FeatureMap__Alternatives_0();

            state._fsp--;


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
    // $ANTLR end "rule__FeatureMap__Group__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2518:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2522:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2523:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__1__Impl_in_rule__FeatureMap__Group__15024);
            rule__FeatureMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group__2_in_rule__FeatureMap__Group__15027);
            rule__FeatureMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__1"


    // $ANTLR start "rule__FeatureMap__Group__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2530:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__Group_1__0 )? ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2534:1: ( ( ( rule__FeatureMap__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2535:1: ( ( rule__FeatureMap__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2535:1: ( ( rule__FeatureMap__Group_1__0 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2536:1: ( rule__FeatureMap__Group_1__0 )?
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2537:1: ( rule__FeatureMap__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2537:2: rule__FeatureMap__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Group__1__Impl5054);
                    rule__FeatureMap__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__FeatureMap__Group__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2547:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2551:1: ( rule__FeatureMap__Group__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2552:2: rule__FeatureMap__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group__2__Impl_in_rule__FeatureMap__Group__25085);
            rule__FeatureMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__2"


    // $ANTLR start "rule__FeatureMap__Group__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2558:1: rule__FeatureMap__Group__2__Impl : ( ( rule__FeatureMap__DocumentationAssignment_2 )? ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2562:1: ( ( ( rule__FeatureMap__DocumentationAssignment_2 )? ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2563:1: ( ( rule__FeatureMap__DocumentationAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2563:1: ( ( rule__FeatureMap__DocumentationAssignment_2 )? )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2564:1: ( rule__FeatureMap__DocumentationAssignment_2 )?
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2565:1: ( rule__FeatureMap__DocumentationAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2565:2: rule__FeatureMap__DocumentationAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__DocumentationAssignment_2_in_rule__FeatureMap__Group__2__Impl5112);
                    rule__FeatureMap__DocumentationAssignment_2();

                    state._fsp--;


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
    // $ANTLR end "rule__FeatureMap__Group__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_0__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2581:1: rule__FeatureMap__Group_0_0__0 : rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1 ;
    public final void rule__FeatureMap__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2585:1: ( rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2586:2: rule__FeatureMap__Group_0_0__0__Impl rule__FeatureMap__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__0__Impl_in_rule__FeatureMap__Group_0_0__05149);
            rule__FeatureMap__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__1_in_rule__FeatureMap__Group_0_0__05152);
            rule__FeatureMap__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_0__0"


    // $ANTLR start "rule__FeatureMap__Group_0_0__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2593:1: rule__FeatureMap__Group_0_0__0__Impl : ( 'fuction' ) ;
    public final void rule__FeatureMap__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2597:1: ( ( 'fuction' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2598:1: ( 'fuction' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2598:1: ( 'fuction' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2599:1: 'fuction'
            {
             before(grammarAccess.getFeatureMapAccess().getFuctionKeyword_0_0_0()); 
            match(input,30,FOLLOW_30_in_rule__FeatureMap__Group_0_0__0__Impl5180); 
             after(grammarAccess.getFeatureMapAccess().getFuctionKeyword_0_0_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_0__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_0__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2612:1: rule__FeatureMap__Group_0_0__1 : rule__FeatureMap__Group_0_0__1__Impl ;
    public final void rule__FeatureMap__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2616:1: ( rule__FeatureMap__Group_0_0__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2617:2: rule__FeatureMap__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_0__1__Impl_in_rule__FeatureMap__Group_0_0__15211);
            rule__FeatureMap__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_0__1"


    // $ANTLR start "rule__FeatureMap__Group_0_0__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2623:1: rule__FeatureMap__Group_0_0__1__Impl : ( ( rule__FeatureMap__FuctionMapAssignment_0_0_1 ) ) ;
    public final void rule__FeatureMap__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2627:1: ( ( ( rule__FeatureMap__FuctionMapAssignment_0_0_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2628:1: ( ( rule__FeatureMap__FuctionMapAssignment_0_0_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2628:1: ( ( rule__FeatureMap__FuctionMapAssignment_0_0_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2629:1: ( rule__FeatureMap__FuctionMapAssignment_0_0_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getFuctionMapAssignment_0_0_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2630:1: ( rule__FeatureMap__FuctionMapAssignment_0_0_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2630:2: rule__FeatureMap__FuctionMapAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__FuctionMapAssignment_0_0_1_in_rule__FeatureMap__Group_0_0__1__Impl5238);
            rule__FeatureMap__FuctionMapAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getFuctionMapAssignment_0_0_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_0__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2644:1: rule__FeatureMap__Group_0_1__0 : rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1 ;
    public final void rule__FeatureMap__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2648:1: ( rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2649:2: rule__FeatureMap__Group_0_1__0__Impl rule__FeatureMap__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__0__Impl_in_rule__FeatureMap__Group_0_1__05272);
            rule__FeatureMap__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__1_in_rule__FeatureMap__Group_0_1__05275);
            rule__FeatureMap__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1__0"


    // $ANTLR start "rule__FeatureMap__Group_0_1__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2656:1: rule__FeatureMap__Group_0_1__0__Impl : ( 'map atribute' ) ;
    public final void rule__FeatureMap__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2660:1: ( ( 'map atribute' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2661:1: ( 'map atribute' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2661:1: ( 'map atribute' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2662:1: 'map atribute'
            {
             before(grammarAccess.getFeatureMapAccess().getMapAtributeKeyword_0_1_0()); 
            match(input,31,FOLLOW_31_in_rule__FeatureMap__Group_0_1__0__Impl5303); 
             after(grammarAccess.getFeatureMapAccess().getMapAtributeKeyword_0_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2675:1: rule__FeatureMap__Group_0_1__1 : rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2 ;
    public final void rule__FeatureMap__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2679:1: ( rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2680:2: rule__FeatureMap__Group_0_1__1__Impl rule__FeatureMap__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__1__Impl_in_rule__FeatureMap__Group_0_1__15334);
            rule__FeatureMap__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__2_in_rule__FeatureMap__Group_0_1__15337);
            rule__FeatureMap__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1__1"


    // $ANTLR start "rule__FeatureMap__Group_0_1__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2687:1: rule__FeatureMap__Group_0_1__1__Impl : ( ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 ) ) ;
    public final void rule__FeatureMap__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2691:1: ( ( ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2692:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2692:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2693:1: ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_1_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2694:1: ( rule__FeatureMap__AttributeSourceAssignment_0_1_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2694:2: rule__FeatureMap__AttributeSourceAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_1_1_in_rule__FeatureMap__Group_0_1__1__Impl5364);
            rule__FeatureMap__AttributeSourceAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_1_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2704:1: rule__FeatureMap__Group_0_1__2 : rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3 ;
    public final void rule__FeatureMap__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2708:1: ( rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2709:2: rule__FeatureMap__Group_0_1__2__Impl rule__FeatureMap__Group_0_1__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__2__Impl_in_rule__FeatureMap__Group_0_1__25394);
            rule__FeatureMap__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__3_in_rule__FeatureMap__Group_0_1__25397);
            rule__FeatureMap__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1__2"


    // $ANTLR start "rule__FeatureMap__Group_0_1__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2716:1: rule__FeatureMap__Group_0_1__2__Impl : ( '->' ) ;
    public final void rule__FeatureMap__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2720:1: ( ( '->' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2721:1: ( '->' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2721:1: ( '->' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2722:1: '->'
            {
             before(grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_1_2()); 
            match(input,32,FOLLOW_32_in_rule__FeatureMap__Group_0_1__2__Impl5425); 
             after(grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_1_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2735:1: rule__FeatureMap__Group_0_1__3 : rule__FeatureMap__Group_0_1__3__Impl rule__FeatureMap__Group_0_1__4 ;
    public final void rule__FeatureMap__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2739:1: ( rule__FeatureMap__Group_0_1__3__Impl rule__FeatureMap__Group_0_1__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2740:2: rule__FeatureMap__Group_0_1__3__Impl rule__FeatureMap__Group_0_1__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__3__Impl_in_rule__FeatureMap__Group_0_1__35456);
            rule__FeatureMap__Group_0_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__4_in_rule__FeatureMap__Group_0_1__35459);
            rule__FeatureMap__Group_0_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1__3"


    // $ANTLR start "rule__FeatureMap__Group_0_1__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2747:1: rule__FeatureMap__Group_0_1__3__Impl : ( ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 ) ) ;
    public final void rule__FeatureMap__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2751:1: ( ( ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2752:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2752:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2753:1: ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_1_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2754:1: ( rule__FeatureMap__AttributeTargetAssignment_0_1_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2754:2: rule__FeatureMap__AttributeTargetAssignment_0_1_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_1_3_in_rule__FeatureMap__Group_0_1__3__Impl5486);
            rule__FeatureMap__AttributeTargetAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_1_3()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1__3__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2764:1: rule__FeatureMap__Group_0_1__4 : rule__FeatureMap__Group_0_1__4__Impl ;
    public final void rule__FeatureMap__Group_0_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2768:1: ( rule__FeatureMap__Group_0_1__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2769:2: rule__FeatureMap__Group_0_1__4__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1__4__Impl_in_rule__FeatureMap__Group_0_1__45516);
            rule__FeatureMap__Group_0_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1__4"


    // $ANTLR start "rule__FeatureMap__Group_0_1__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2775:1: rule__FeatureMap__Group_0_1__4__Impl : ( ( rule__FeatureMap__Group_0_1_4__0 )* ) ;
    public final void rule__FeatureMap__Group_0_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2779:1: ( ( ( rule__FeatureMap__Group_0_1_4__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2780:1: ( ( rule__FeatureMap__Group_0_1_4__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2780:1: ( ( rule__FeatureMap__Group_0_1_4__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2781:1: ( rule__FeatureMap__Group_0_1_4__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_1_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2782:1: ( rule__FeatureMap__Group_0_1_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==14) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2782:2: rule__FeatureMap__Group_0_1_4__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__0_in_rule__FeatureMap__Group_0_1__4__Impl5543);
            	    rule__FeatureMap__Group_0_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_1_4()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1__4__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2802:1: rule__FeatureMap__Group_0_1_4__0 : rule__FeatureMap__Group_0_1_4__0__Impl rule__FeatureMap__Group_0_1_4__1 ;
    public final void rule__FeatureMap__Group_0_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2806:1: ( rule__FeatureMap__Group_0_1_4__0__Impl rule__FeatureMap__Group_0_1_4__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2807:2: rule__FeatureMap__Group_0_1_4__0__Impl rule__FeatureMap__Group_0_1_4__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__0__Impl_in_rule__FeatureMap__Group_0_1_4__05584);
            rule__FeatureMap__Group_0_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__1_in_rule__FeatureMap__Group_0_1_4__05587);
            rule__FeatureMap__Group_0_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__0"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2814:1: rule__FeatureMap__Group_0_1_4__0__Impl : ( () ) ;
    public final void rule__FeatureMap__Group_0_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2818:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2819:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2819:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2820:1: ()
            {
             before(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_1_4_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2821:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2823:1: 
            {
            }

             after(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_1_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2833:1: rule__FeatureMap__Group_0_1_4__1 : rule__FeatureMap__Group_0_1_4__1__Impl rule__FeatureMap__Group_0_1_4__2 ;
    public final void rule__FeatureMap__Group_0_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2837:1: ( rule__FeatureMap__Group_0_1_4__1__Impl rule__FeatureMap__Group_0_1_4__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2838:2: rule__FeatureMap__Group_0_1_4__1__Impl rule__FeatureMap__Group_0_1_4__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__1__Impl_in_rule__FeatureMap__Group_0_1_4__15645);
            rule__FeatureMap__Group_0_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__2_in_rule__FeatureMap__Group_0_1_4__15648);
            rule__FeatureMap__Group_0_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__1"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2845:1: rule__FeatureMap__Group_0_1_4__1__Impl : ( '.' ) ;
    public final void rule__FeatureMap__Group_0_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2849:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2850:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2850:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2851:1: '.'
            {
             before(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_1_4_1()); 
            match(input,14,FOLLOW_14_in_rule__FeatureMap__Group_0_1_4__1__Impl5676); 
             after(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_1_4_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2864:1: rule__FeatureMap__Group_0_1_4__2 : rule__FeatureMap__Group_0_1_4__2__Impl ;
    public final void rule__FeatureMap__Group_0_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2868:1: ( rule__FeatureMap__Group_0_1_4__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2869:2: rule__FeatureMap__Group_0_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_1_4__2__Impl_in_rule__FeatureMap__Group_0_1_4__25707);
            rule__FeatureMap__Group_0_1_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__2"


    // $ANTLR start "rule__FeatureMap__Group_0_1_4__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2875:1: rule__FeatureMap__Group_0_1_4__2__Impl : ( ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 ) ) ;
    public final void rule__FeatureMap__Group_0_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2879:1: ( ( ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2880:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2880:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2881:1: ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_1_4_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2882:1: ( rule__FeatureMap__RefAttributeAssignment_0_1_4_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2882:2: rule__FeatureMap__RefAttributeAssignment_0_1_4_2
            {
            pushFollow(FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_1_4_2_in_rule__FeatureMap__Group_0_1_4__2__Impl5734);
            rule__FeatureMap__RefAttributeAssignment_0_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_1_4_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_1_4__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2898:1: rule__FeatureMap__Group_0_2__0 : rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1 ;
    public final void rule__FeatureMap__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2902:1: ( rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2903:2: rule__FeatureMap__Group_0_2__0__Impl rule__FeatureMap__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__0__Impl_in_rule__FeatureMap__Group_0_2__05770);
            rule__FeatureMap__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__1_in_rule__FeatureMap__Group_0_2__05773);
            rule__FeatureMap__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__0"


    // $ANTLR start "rule__FeatureMap__Group_0_2__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2910:1: rule__FeatureMap__Group_0_2__0__Impl : ( 'map module' ) ;
    public final void rule__FeatureMap__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2914:1: ( ( 'map module' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2915:1: ( 'map module' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2915:1: ( 'map module' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2916:1: 'map module'
            {
             before(grammarAccess.getFeatureMapAccess().getMapModuleKeyword_0_2_0()); 
            match(input,33,FOLLOW_33_in_rule__FeatureMap__Group_0_2__0__Impl5801); 
             after(grammarAccess.getFeatureMapAccess().getMapModuleKeyword_0_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2929:1: rule__FeatureMap__Group_0_2__1 : rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2 ;
    public final void rule__FeatureMap__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2933:1: ( rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2934:2: rule__FeatureMap__Group_0_2__1__Impl rule__FeatureMap__Group_0_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__1__Impl_in_rule__FeatureMap__Group_0_2__15832);
            rule__FeatureMap__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__2_in_rule__FeatureMap__Group_0_2__15835);
            rule__FeatureMap__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__1"


    // $ANTLR start "rule__FeatureMap__Group_0_2__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2941:1: rule__FeatureMap__Group_0_2__1__Impl : ( ( rule__FeatureMap__WithModuleAssignment_0_2_1 ) ) ;
    public final void rule__FeatureMap__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2945:1: ( ( ( rule__FeatureMap__WithModuleAssignment_0_2_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2946:1: ( ( rule__FeatureMap__WithModuleAssignment_0_2_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2946:1: ( ( rule__FeatureMap__WithModuleAssignment_0_2_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2947:1: ( rule__FeatureMap__WithModuleAssignment_0_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getWithModuleAssignment_0_2_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2948:1: ( rule__FeatureMap__WithModuleAssignment_0_2_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2948:2: rule__FeatureMap__WithModuleAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__WithModuleAssignment_0_2_1_in_rule__FeatureMap__Group_0_2__1__Impl5862);
            rule__FeatureMap__WithModuleAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getWithModuleAssignment_0_2_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2958:1: rule__FeatureMap__Group_0_2__2 : rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3 ;
    public final void rule__FeatureMap__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2962:1: ( rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2963:2: rule__FeatureMap__Group_0_2__2__Impl rule__FeatureMap__Group_0_2__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__2__Impl_in_rule__FeatureMap__Group_0_2__25892);
            rule__FeatureMap__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__3_in_rule__FeatureMap__Group_0_2__25895);
            rule__FeatureMap__Group_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__2"


    // $ANTLR start "rule__FeatureMap__Group_0_2__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2970:1: rule__FeatureMap__Group_0_2__2__Impl : ( ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 ) ) ;
    public final void rule__FeatureMap__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2974:1: ( ( ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2975:1: ( ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2975:1: ( ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2976:1: ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourcesAssignment_0_2_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2977:1: ( rule__FeatureMap__AttributeSourcesAssignment_0_2_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2977:2: rule__FeatureMap__AttributeSourcesAssignment_0_2_2
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeSourcesAssignment_0_2_2_in_rule__FeatureMap__Group_0_2__2__Impl5922);
            rule__FeatureMap__AttributeSourcesAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourcesAssignment_0_2_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2987:1: rule__FeatureMap__Group_0_2__3 : rule__FeatureMap__Group_0_2__3__Impl rule__FeatureMap__Group_0_2__4 ;
    public final void rule__FeatureMap__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2991:1: ( rule__FeatureMap__Group_0_2__3__Impl rule__FeatureMap__Group_0_2__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2992:2: rule__FeatureMap__Group_0_2__3__Impl rule__FeatureMap__Group_0_2__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__3__Impl_in_rule__FeatureMap__Group_0_2__35952);
            rule__FeatureMap__Group_0_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__4_in_rule__FeatureMap__Group_0_2__35955);
            rule__FeatureMap__Group_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__3"


    // $ANTLR start "rule__FeatureMap__Group_0_2__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:2999:1: rule__FeatureMap__Group_0_2__3__Impl : ( '->' ) ;
    public final void rule__FeatureMap__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3003:1: ( ( '->' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3004:1: ( '->' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3004:1: ( '->' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3005:1: '->'
            {
             before(grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_2_3()); 
            match(input,32,FOLLOW_32_in_rule__FeatureMap__Group_0_2__3__Impl5983); 
             after(grammarAccess.getFeatureMapAccess().getHyphenMinusGreaterThanSignKeyword_0_2_3()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__3__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3018:1: rule__FeatureMap__Group_0_2__4 : rule__FeatureMap__Group_0_2__4__Impl rule__FeatureMap__Group_0_2__5 ;
    public final void rule__FeatureMap__Group_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3022:1: ( rule__FeatureMap__Group_0_2__4__Impl rule__FeatureMap__Group_0_2__5 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3023:2: rule__FeatureMap__Group_0_2__4__Impl rule__FeatureMap__Group_0_2__5
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__4__Impl_in_rule__FeatureMap__Group_0_2__46014);
            rule__FeatureMap__Group_0_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__5_in_rule__FeatureMap__Group_0_2__46017);
            rule__FeatureMap__Group_0_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__4"


    // $ANTLR start "rule__FeatureMap__Group_0_2__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3030:1: rule__FeatureMap__Group_0_2__4__Impl : ( ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 ) ) ;
    public final void rule__FeatureMap__Group_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3034:1: ( ( ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3035:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3035:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3036:1: ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_2_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3037:1: ( rule__FeatureMap__AttributeTargetAssignment_0_2_4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3037:2: rule__FeatureMap__AttributeTargetAssignment_0_2_4
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_2_4_in_rule__FeatureMap__Group_0_2__4__Impl6044);
            rule__FeatureMap__AttributeTargetAssignment_0_2_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_2_4()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__4__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2__5"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3047:1: rule__FeatureMap__Group_0_2__5 : rule__FeatureMap__Group_0_2__5__Impl ;
    public final void rule__FeatureMap__Group_0_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3051:1: ( rule__FeatureMap__Group_0_2__5__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3052:2: rule__FeatureMap__Group_0_2__5__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2__5__Impl_in_rule__FeatureMap__Group_0_2__56074);
            rule__FeatureMap__Group_0_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2__5"


    // $ANTLR start "rule__FeatureMap__Group_0_2__5__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3058:1: rule__FeatureMap__Group_0_2__5__Impl : ( ( rule__FeatureMap__Group_0_2_5__0 )* ) ;
    public final void rule__FeatureMap__Group_0_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3062:1: ( ( ( rule__FeatureMap__Group_0_2_5__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3063:1: ( ( rule__FeatureMap__Group_0_2_5__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3063:1: ( ( rule__FeatureMap__Group_0_2_5__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3064:1: ( rule__FeatureMap__Group_0_2_5__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_2_5()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3065:1: ( rule__FeatureMap__Group_0_2_5__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3065:2: rule__FeatureMap__Group_0_2_5__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__0_in_rule__FeatureMap__Group_0_2__5__Impl6101);
            	    rule__FeatureMap__Group_0_2_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_2_5()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2__5__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3087:1: rule__FeatureMap__Group_0_2_5__0 : rule__FeatureMap__Group_0_2_5__0__Impl rule__FeatureMap__Group_0_2_5__1 ;
    public final void rule__FeatureMap__Group_0_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3091:1: ( rule__FeatureMap__Group_0_2_5__0__Impl rule__FeatureMap__Group_0_2_5__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3092:2: rule__FeatureMap__Group_0_2_5__0__Impl rule__FeatureMap__Group_0_2_5__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__0__Impl_in_rule__FeatureMap__Group_0_2_5__06144);
            rule__FeatureMap__Group_0_2_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__1_in_rule__FeatureMap__Group_0_2_5__06147);
            rule__FeatureMap__Group_0_2_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__0"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3099:1: rule__FeatureMap__Group_0_2_5__0__Impl : ( () ) ;
    public final void rule__FeatureMap__Group_0_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3103:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3104:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3104:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3105:1: ()
            {
             before(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_2_5_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3106:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3108:1: 
            {
            }

             after(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_2_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3118:1: rule__FeatureMap__Group_0_2_5__1 : rule__FeatureMap__Group_0_2_5__1__Impl rule__FeatureMap__Group_0_2_5__2 ;
    public final void rule__FeatureMap__Group_0_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3122:1: ( rule__FeatureMap__Group_0_2_5__1__Impl rule__FeatureMap__Group_0_2_5__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3123:2: rule__FeatureMap__Group_0_2_5__1__Impl rule__FeatureMap__Group_0_2_5__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__1__Impl_in_rule__FeatureMap__Group_0_2_5__16205);
            rule__FeatureMap__Group_0_2_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__2_in_rule__FeatureMap__Group_0_2_5__16208);
            rule__FeatureMap__Group_0_2_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__1"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3130:1: rule__FeatureMap__Group_0_2_5__1__Impl : ( '.' ) ;
    public final void rule__FeatureMap__Group_0_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3134:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3135:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3135:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3136:1: '.'
            {
             before(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_2_5_1()); 
            match(input,14,FOLLOW_14_in_rule__FeatureMap__Group_0_2_5__1__Impl6236); 
             after(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_2_5_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3149:1: rule__FeatureMap__Group_0_2_5__2 : rule__FeatureMap__Group_0_2_5__2__Impl ;
    public final void rule__FeatureMap__Group_0_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3153:1: ( rule__FeatureMap__Group_0_2_5__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3154:2: rule__FeatureMap__Group_0_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_2_5__2__Impl_in_rule__FeatureMap__Group_0_2_5__26267);
            rule__FeatureMap__Group_0_2_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__2"


    // $ANTLR start "rule__FeatureMap__Group_0_2_5__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3160:1: rule__FeatureMap__Group_0_2_5__2__Impl : ( ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 ) ) ;
    public final void rule__FeatureMap__Group_0_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3164:1: ( ( ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3165:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3165:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3166:1: ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_2_5_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3167:1: ( rule__FeatureMap__RefAttributeAssignment_0_2_5_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3167:2: rule__FeatureMap__RefAttributeAssignment_0_2_5_2
            {
            pushFollow(FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_2_5_2_in_rule__FeatureMap__Group_0_2_5__2__Impl6294);
            rule__FeatureMap__RefAttributeAssignment_0_2_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_2_5_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_2_5__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_3__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3183:1: rule__FeatureMap__Group_0_3__0 : rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1 ;
    public final void rule__FeatureMap__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3187:1: ( rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3188:2: rule__FeatureMap__Group_0_3__0__Impl rule__FeatureMap__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__0__Impl_in_rule__FeatureMap__Group_0_3__06330);
            rule__FeatureMap__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__1_in_rule__FeatureMap__Group_0_3__06333);
            rule__FeatureMap__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_3__0"


    // $ANTLR start "rule__FeatureMap__Group_0_3__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3195:1: rule__FeatureMap__Group_0_3__0__Impl : ( 'set <-' ) ;
    public final void rule__FeatureMap__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3199:1: ( ( 'set <-' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3200:1: ( 'set <-' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3200:1: ( 'set <-' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3201:1: 'set <-'
            {
             before(grammarAccess.getFeatureMapAccess().getSetKeyword_0_3_0()); 
            match(input,34,FOLLOW_34_in_rule__FeatureMap__Group_0_3__0__Impl6361); 
             after(grammarAccess.getFeatureMapAccess().getSetKeyword_0_3_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_3__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_3__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3214:1: rule__FeatureMap__Group_0_3__1 : rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2 ;
    public final void rule__FeatureMap__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3218:1: ( rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3219:2: rule__FeatureMap__Group_0_3__1__Impl rule__FeatureMap__Group_0_3__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__1__Impl_in_rule__FeatureMap__Group_0_3__16392);
            rule__FeatureMap__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__2_in_rule__FeatureMap__Group_0_3__16395);
            rule__FeatureMap__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_3__1"


    // $ANTLR start "rule__FeatureMap__Group_0_3__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3226:1: rule__FeatureMap__Group_0_3__1__Impl : ( ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 ) ) ;
    public final void rule__FeatureMap__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3230:1: ( ( ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3231:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3231:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3232:1: ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_3_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3233:1: ( rule__FeatureMap__AttributeSourceAssignment_0_3_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3233:2: rule__FeatureMap__AttributeSourceAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_3_1_in_rule__FeatureMap__Group_0_3__1__Impl6422);
            rule__FeatureMap__AttributeSourceAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_3_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_3__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_3__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3243:1: rule__FeatureMap__Group_0_3__2 : rule__FeatureMap__Group_0_3__2__Impl rule__FeatureMap__Group_0_3__3 ;
    public final void rule__FeatureMap__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3247:1: ( rule__FeatureMap__Group_0_3__2__Impl rule__FeatureMap__Group_0_3__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3248:2: rule__FeatureMap__Group_0_3__2__Impl rule__FeatureMap__Group_0_3__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__2__Impl_in_rule__FeatureMap__Group_0_3__26452);
            rule__FeatureMap__Group_0_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__3_in_rule__FeatureMap__Group_0_3__26455);
            rule__FeatureMap__Group_0_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_3__2"


    // $ANTLR start "rule__FeatureMap__Group_0_3__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3255:1: rule__FeatureMap__Group_0_3__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3259:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3260:1: ( '=' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3260:1: ( '=' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3261:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_3_2()); 
            match(input,35,FOLLOW_35_in_rule__FeatureMap__Group_0_3__2__Impl6483); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_3_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_3__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_3__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3274:1: rule__FeatureMap__Group_0_3__3 : rule__FeatureMap__Group_0_3__3__Impl ;
    public final void rule__FeatureMap__Group_0_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3278:1: ( rule__FeatureMap__Group_0_3__3__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3279:2: rule__FeatureMap__Group_0_3__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_3__3__Impl_in_rule__FeatureMap__Group_0_3__36514);
            rule__FeatureMap__Group_0_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_3__3"


    // $ANTLR start "rule__FeatureMap__Group_0_3__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3285:1: rule__FeatureMap__Group_0_3__3__Impl : ( ( rule__FeatureMap__ExprAssignment_0_3_3 ) ) ;
    public final void rule__FeatureMap__Group_0_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3289:1: ( ( ( rule__FeatureMap__ExprAssignment_0_3_3 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3290:1: ( ( rule__FeatureMap__ExprAssignment_0_3_3 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3290:1: ( ( rule__FeatureMap__ExprAssignment_0_3_3 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3291:1: ( rule__FeatureMap__ExprAssignment_0_3_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getExprAssignment_0_3_3()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3292:1: ( rule__FeatureMap__ExprAssignment_0_3_3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3292:2: rule__FeatureMap__ExprAssignment_0_3_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ExprAssignment_0_3_3_in_rule__FeatureMap__Group_0_3__3__Impl6541);
            rule__FeatureMap__ExprAssignment_0_3_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getExprAssignment_0_3_3()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_3__3__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3310:1: rule__FeatureMap__Group_0_4__0 : rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1 ;
    public final void rule__FeatureMap__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3314:1: ( rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3315:2: rule__FeatureMap__Group_0_4__0__Impl rule__FeatureMap__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__0__Impl_in_rule__FeatureMap__Group_0_4__06579);
            rule__FeatureMap__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__1_in_rule__FeatureMap__Group_0_4__06582);
            rule__FeatureMap__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4__0"


    // $ANTLR start "rule__FeatureMap__Group_0_4__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3322:1: rule__FeatureMap__Group_0_4__0__Impl : ( 'set ->' ) ;
    public final void rule__FeatureMap__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3326:1: ( ( 'set ->' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3327:1: ( 'set ->' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3327:1: ( 'set ->' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3328:1: 'set ->'
            {
             before(grammarAccess.getFeatureMapAccess().getSetKeyword_0_4_0()); 
            match(input,36,FOLLOW_36_in_rule__FeatureMap__Group_0_4__0__Impl6610); 
             after(grammarAccess.getFeatureMapAccess().getSetKeyword_0_4_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3341:1: rule__FeatureMap__Group_0_4__1 : rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2 ;
    public final void rule__FeatureMap__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3345:1: ( rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3346:2: rule__FeatureMap__Group_0_4__1__Impl rule__FeatureMap__Group_0_4__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__1__Impl_in_rule__FeatureMap__Group_0_4__16641);
            rule__FeatureMap__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__2_in_rule__FeatureMap__Group_0_4__16644);
            rule__FeatureMap__Group_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4__1"


    // $ANTLR start "rule__FeatureMap__Group_0_4__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3353:1: rule__FeatureMap__Group_0_4__1__Impl : ( ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 ) ) ;
    public final void rule__FeatureMap__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3357:1: ( ( ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3358:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3358:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3359:1: ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_4_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3360:1: ( rule__FeatureMap__AttributeTargetAssignment_0_4_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3360:2: rule__FeatureMap__AttributeTargetAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_4_1_in_rule__FeatureMap__Group_0_4__1__Impl6671);
            rule__FeatureMap__AttributeTargetAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_4_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3370:1: rule__FeatureMap__Group_0_4__2 : rule__FeatureMap__Group_0_4__2__Impl rule__FeatureMap__Group_0_4__3 ;
    public final void rule__FeatureMap__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3374:1: ( rule__FeatureMap__Group_0_4__2__Impl rule__FeatureMap__Group_0_4__3 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3375:2: rule__FeatureMap__Group_0_4__2__Impl rule__FeatureMap__Group_0_4__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__2__Impl_in_rule__FeatureMap__Group_0_4__26701);
            rule__FeatureMap__Group_0_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__3_in_rule__FeatureMap__Group_0_4__26704);
            rule__FeatureMap__Group_0_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4__2"


    // $ANTLR start "rule__FeatureMap__Group_0_4__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3382:1: rule__FeatureMap__Group_0_4__2__Impl : ( ( rule__FeatureMap__Group_0_4_2__0 )* ) ;
    public final void rule__FeatureMap__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3386:1: ( ( ( rule__FeatureMap__Group_0_4_2__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3387:1: ( ( rule__FeatureMap__Group_0_4_2__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3387:1: ( ( rule__FeatureMap__Group_0_4_2__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3388:1: ( rule__FeatureMap__Group_0_4_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_4_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3389:1: ( rule__FeatureMap__Group_0_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3389:2: rule__FeatureMap__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__0_in_rule__FeatureMap__Group_0_4__2__Impl6731);
            	    rule__FeatureMap__Group_0_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "rule__FeatureMap__Group_0_4__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4__3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3399:1: rule__FeatureMap__Group_0_4__3 : rule__FeatureMap__Group_0_4__3__Impl rule__FeatureMap__Group_0_4__4 ;
    public final void rule__FeatureMap__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3403:1: ( rule__FeatureMap__Group_0_4__3__Impl rule__FeatureMap__Group_0_4__4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3404:2: rule__FeatureMap__Group_0_4__3__Impl rule__FeatureMap__Group_0_4__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__3__Impl_in_rule__FeatureMap__Group_0_4__36762);
            rule__FeatureMap__Group_0_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__4_in_rule__FeatureMap__Group_0_4__36765);
            rule__FeatureMap__Group_0_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4__3"


    // $ANTLR start "rule__FeatureMap__Group_0_4__3__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3411:1: rule__FeatureMap__Group_0_4__3__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3415:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3416:1: ( '=' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3416:1: ( '=' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3417:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_4_3()); 
            match(input,35,FOLLOW_35_in_rule__FeatureMap__Group_0_4__3__Impl6793); 
             after(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_0_4_3()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4__3__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4__4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3430:1: rule__FeatureMap__Group_0_4__4 : rule__FeatureMap__Group_0_4__4__Impl ;
    public final void rule__FeatureMap__Group_0_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3434:1: ( rule__FeatureMap__Group_0_4__4__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3435:2: rule__FeatureMap__Group_0_4__4__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4__4__Impl_in_rule__FeatureMap__Group_0_4__46824);
            rule__FeatureMap__Group_0_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4__4"


    // $ANTLR start "rule__FeatureMap__Group_0_4__4__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3441:1: rule__FeatureMap__Group_0_4__4__Impl : ( ( rule__FeatureMap__ExprAssignment_0_4_4 ) ) ;
    public final void rule__FeatureMap__Group_0_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3445:1: ( ( ( rule__FeatureMap__ExprAssignment_0_4_4 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3446:1: ( ( rule__FeatureMap__ExprAssignment_0_4_4 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3446:1: ( ( rule__FeatureMap__ExprAssignment_0_4_4 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3447:1: ( rule__FeatureMap__ExprAssignment_0_4_4 )
            {
             before(grammarAccess.getFeatureMapAccess().getExprAssignment_0_4_4()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3448:1: ( rule__FeatureMap__ExprAssignment_0_4_4 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3448:2: rule__FeatureMap__ExprAssignment_0_4_4
            {
            pushFollow(FOLLOW_rule__FeatureMap__ExprAssignment_0_4_4_in_rule__FeatureMap__Group_0_4__4__Impl6851);
            rule__FeatureMap__ExprAssignment_0_4_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getExprAssignment_0_4_4()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4__4__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3468:1: rule__FeatureMap__Group_0_4_2__0 : rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1 ;
    public final void rule__FeatureMap__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3472:1: ( rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3473:2: rule__FeatureMap__Group_0_4_2__0__Impl rule__FeatureMap__Group_0_4_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__0__Impl_in_rule__FeatureMap__Group_0_4_2__06891);
            rule__FeatureMap__Group_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__1_in_rule__FeatureMap__Group_0_4_2__06894);
            rule__FeatureMap__Group_0_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__0"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3480:1: rule__FeatureMap__Group_0_4_2__0__Impl : ( () ) ;
    public final void rule__FeatureMap__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3484:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3485:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3485:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3486:1: ()
            {
             before(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_4_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3487:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3489:1: 
            {
            }

             after(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_4_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3499:1: rule__FeatureMap__Group_0_4_2__1 : rule__FeatureMap__Group_0_4_2__1__Impl rule__FeatureMap__Group_0_4_2__2 ;
    public final void rule__FeatureMap__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3503:1: ( rule__FeatureMap__Group_0_4_2__1__Impl rule__FeatureMap__Group_0_4_2__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3504:2: rule__FeatureMap__Group_0_4_2__1__Impl rule__FeatureMap__Group_0_4_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__1__Impl_in_rule__FeatureMap__Group_0_4_2__16952);
            rule__FeatureMap__Group_0_4_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__2_in_rule__FeatureMap__Group_0_4_2__16955);
            rule__FeatureMap__Group_0_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__1"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3511:1: rule__FeatureMap__Group_0_4_2__1__Impl : ( '.' ) ;
    public final void rule__FeatureMap__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3515:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3516:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3516:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3517:1: '.'
            {
             before(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_4_2_1()); 
            match(input,14,FOLLOW_14_in_rule__FeatureMap__Group_0_4_2__1__Impl6983); 
             after(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_4_2_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3530:1: rule__FeatureMap__Group_0_4_2__2 : rule__FeatureMap__Group_0_4_2__2__Impl ;
    public final void rule__FeatureMap__Group_0_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3534:1: ( rule__FeatureMap__Group_0_4_2__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3535:2: rule__FeatureMap__Group_0_4_2__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_4_2__2__Impl_in_rule__FeatureMap__Group_0_4_2__27014);
            rule__FeatureMap__Group_0_4_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__2"


    // $ANTLR start "rule__FeatureMap__Group_0_4_2__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3541:1: rule__FeatureMap__Group_0_4_2__2__Impl : ( ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 ) ) ;
    public final void rule__FeatureMap__Group_0_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3545:1: ( ( ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3546:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3546:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3547:1: ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_4_2_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3548:1: ( rule__FeatureMap__RefAttributeAssignment_0_4_2_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3548:2: rule__FeatureMap__RefAttributeAssignment_0_4_2_2
            {
            pushFollow(FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_4_2_2_in_rule__FeatureMap__Group_0_4_2__2__Impl7041);
            rule__FeatureMap__RefAttributeAssignment_0_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_4_2_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_4_2__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_5__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3564:1: rule__FeatureMap__Group_0_5__0 : rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1 ;
    public final void rule__FeatureMap__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3568:1: ( rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3569:2: rule__FeatureMap__Group_0_5__0__Impl rule__FeatureMap__Group_0_5__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__0__Impl_in_rule__FeatureMap__Group_0_5__07077);
            rule__FeatureMap__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__1_in_rule__FeatureMap__Group_0_5__07080);
            rule__FeatureMap__Group_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_5__0"


    // $ANTLR start "rule__FeatureMap__Group_0_5__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3576:1: rule__FeatureMap__Group_0_5__0__Impl : ( 'ignore <-' ) ;
    public final void rule__FeatureMap__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3580:1: ( ( 'ignore <-' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3581:1: ( 'ignore <-' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3581:1: ( 'ignore <-' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3582:1: 'ignore <-'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_5_0()); 
            match(input,37,FOLLOW_37_in_rule__FeatureMap__Group_0_5__0__Impl7108); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_5_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_5__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_5__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3595:1: rule__FeatureMap__Group_0_5__1 : rule__FeatureMap__Group_0_5__1__Impl ;
    public final void rule__FeatureMap__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3599:1: ( rule__FeatureMap__Group_0_5__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3600:2: rule__FeatureMap__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_5__1__Impl_in_rule__FeatureMap__Group_0_5__17139);
            rule__FeatureMap__Group_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_5__1"


    // $ANTLR start "rule__FeatureMap__Group_0_5__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3606:1: rule__FeatureMap__Group_0_5__1__Impl : ( ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 ) ) ;
    public final void rule__FeatureMap__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3610:1: ( ( ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3611:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3611:1: ( ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3612:1: ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_5_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3613:1: ( rule__FeatureMap__AttributeSourceAssignment_0_5_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3613:2: rule__FeatureMap__AttributeSourceAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_5_1_in_rule__FeatureMap__Group_0_5__1__Impl7166);
            rule__FeatureMap__AttributeSourceAssignment_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAssignment_0_5_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_5__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3627:1: rule__FeatureMap__Group_0_6__0 : rule__FeatureMap__Group_0_6__0__Impl rule__FeatureMap__Group_0_6__1 ;
    public final void rule__FeatureMap__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3631:1: ( rule__FeatureMap__Group_0_6__0__Impl rule__FeatureMap__Group_0_6__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3632:2: rule__FeatureMap__Group_0_6__0__Impl rule__FeatureMap__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__0__Impl_in_rule__FeatureMap__Group_0_6__07200);
            rule__FeatureMap__Group_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__1_in_rule__FeatureMap__Group_0_6__07203);
            rule__FeatureMap__Group_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6__0"


    // $ANTLR start "rule__FeatureMap__Group_0_6__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3639:1: rule__FeatureMap__Group_0_6__0__Impl : ( 'ignore ->' ) ;
    public final void rule__FeatureMap__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3643:1: ( ( 'ignore ->' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3644:1: ( 'ignore ->' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3644:1: ( 'ignore ->' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3645:1: 'ignore ->'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_6_0()); 
            match(input,38,FOLLOW_38_in_rule__FeatureMap__Group_0_6__0__Impl7231); 
             after(grammarAccess.getFeatureMapAccess().getIgnoreKeyword_0_6_0()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_6__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3658:1: rule__FeatureMap__Group_0_6__1 : rule__FeatureMap__Group_0_6__1__Impl rule__FeatureMap__Group_0_6__2 ;
    public final void rule__FeatureMap__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3662:1: ( rule__FeatureMap__Group_0_6__1__Impl rule__FeatureMap__Group_0_6__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3663:2: rule__FeatureMap__Group_0_6__1__Impl rule__FeatureMap__Group_0_6__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__1__Impl_in_rule__FeatureMap__Group_0_6__17262);
            rule__FeatureMap__Group_0_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__2_in_rule__FeatureMap__Group_0_6__17265);
            rule__FeatureMap__Group_0_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6__1"


    // $ANTLR start "rule__FeatureMap__Group_0_6__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3670:1: rule__FeatureMap__Group_0_6__1__Impl : ( ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 ) ) ;
    public final void rule__FeatureMap__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3674:1: ( ( ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3675:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3675:1: ( ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3676:1: ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_6_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3677:1: ( rule__FeatureMap__AttributeTargetAssignment_0_6_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3677:2: rule__FeatureMap__AttributeTargetAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_6_1_in_rule__FeatureMap__Group_0_6__1__Impl7292);
            rule__FeatureMap__AttributeTargetAssignment_0_6_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAssignment_0_6_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_6__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3687:1: rule__FeatureMap__Group_0_6__2 : rule__FeatureMap__Group_0_6__2__Impl ;
    public final void rule__FeatureMap__Group_0_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3691:1: ( rule__FeatureMap__Group_0_6__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3692:2: rule__FeatureMap__Group_0_6__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6__2__Impl_in_rule__FeatureMap__Group_0_6__27322);
            rule__FeatureMap__Group_0_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6__2"


    // $ANTLR start "rule__FeatureMap__Group_0_6__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3698:1: rule__FeatureMap__Group_0_6__2__Impl : ( ( rule__FeatureMap__Group_0_6_2__0 )* ) ;
    public final void rule__FeatureMap__Group_0_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3702:1: ( ( ( rule__FeatureMap__Group_0_6_2__0 )* ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3703:1: ( ( rule__FeatureMap__Group_0_6_2__0 )* )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3703:1: ( ( rule__FeatureMap__Group_0_6_2__0 )* )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3704:1: ( rule__FeatureMap__Group_0_6_2__0 )*
            {
             before(grammarAccess.getFeatureMapAccess().getGroup_0_6_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3705:1: ( rule__FeatureMap__Group_0_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==14) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3705:2: rule__FeatureMap__Group_0_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__0_in_rule__FeatureMap__Group_0_6__2__Impl7349);
            	    rule__FeatureMap__Group_0_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFeatureMapAccess().getGroup_0_6_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_6__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3721:1: rule__FeatureMap__Group_0_6_2__0 : rule__FeatureMap__Group_0_6_2__0__Impl rule__FeatureMap__Group_0_6_2__1 ;
    public final void rule__FeatureMap__Group_0_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3725:1: ( rule__FeatureMap__Group_0_6_2__0__Impl rule__FeatureMap__Group_0_6_2__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3726:2: rule__FeatureMap__Group_0_6_2__0__Impl rule__FeatureMap__Group_0_6_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__0__Impl_in_rule__FeatureMap__Group_0_6_2__07386);
            rule__FeatureMap__Group_0_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__1_in_rule__FeatureMap__Group_0_6_2__07389);
            rule__FeatureMap__Group_0_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__0"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3733:1: rule__FeatureMap__Group_0_6_2__0__Impl : ( () ) ;
    public final void rule__FeatureMap__Group_0_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3737:1: ( ( () ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3738:1: ( () )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3738:1: ( () )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3739:1: ()
            {
             before(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_6_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3740:1: ()
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3742:1: 
            {
            }

             after(grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_6_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3752:1: rule__FeatureMap__Group_0_6_2__1 : rule__FeatureMap__Group_0_6_2__1__Impl rule__FeatureMap__Group_0_6_2__2 ;
    public final void rule__FeatureMap__Group_0_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3756:1: ( rule__FeatureMap__Group_0_6_2__1__Impl rule__FeatureMap__Group_0_6_2__2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3757:2: rule__FeatureMap__Group_0_6_2__1__Impl rule__FeatureMap__Group_0_6_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__1__Impl_in_rule__FeatureMap__Group_0_6_2__17447);
            rule__FeatureMap__Group_0_6_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__2_in_rule__FeatureMap__Group_0_6_2__17450);
            rule__FeatureMap__Group_0_6_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__1"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3764:1: rule__FeatureMap__Group_0_6_2__1__Impl : ( '.' ) ;
    public final void rule__FeatureMap__Group_0_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3768:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3769:1: ( '.' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3769:1: ( '.' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3770:1: '.'
            {
             before(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_6_2_1()); 
            match(input,14,FOLLOW_14_in_rule__FeatureMap__Group_0_6_2__1__Impl7478); 
             after(grammarAccess.getFeatureMapAccess().getFullStopKeyword_0_6_2_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3783:1: rule__FeatureMap__Group_0_6_2__2 : rule__FeatureMap__Group_0_6_2__2__Impl ;
    public final void rule__FeatureMap__Group_0_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3787:1: ( rule__FeatureMap__Group_0_6_2__2__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3788:2: rule__FeatureMap__Group_0_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0_6_2__2__Impl_in_rule__FeatureMap__Group_0_6_2__27509);
            rule__FeatureMap__Group_0_6_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__2"


    // $ANTLR start "rule__FeatureMap__Group_0_6_2__2__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3794:1: rule__FeatureMap__Group_0_6_2__2__Impl : ( ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 ) ) ;
    public final void rule__FeatureMap__Group_0_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3798:1: ( ( ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3799:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3799:1: ( ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3800:1: ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_6_2_2()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3801:1: ( rule__FeatureMap__RefAttributeAssignment_0_6_2_2 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3801:2: rule__FeatureMap__RefAttributeAssignment_0_6_2_2
            {
            pushFollow(FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_6_2_2_in_rule__FeatureMap__Group_0_6_2__2__Impl7536);
            rule__FeatureMap__RefAttributeAssignment_0_6_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAssignment_0_6_2_2()); 

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
    // $ANTLR end "rule__FeatureMap__Group_0_6_2__2__Impl"


    // $ANTLR start "rule__FeatureMap__Group_1__0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3817:1: rule__FeatureMap__Group_1__0 : rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 ;
    public final void rule__FeatureMap__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3821:1: ( rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3822:2: rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__07572);
            rule__FeatureMap__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__07575);
            rule__FeatureMap__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_1__0"


    // $ANTLR start "rule__FeatureMap__Group_1__0__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3829:1: rule__FeatureMap__Group_1__0__Impl : ( 'rule' ) ;
    public final void rule__FeatureMap__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3833:1: ( ( 'rule' ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3834:1: ( 'rule' )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3834:1: ( 'rule' )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3835:1: 'rule'
            {
             before(grammarAccess.getFeatureMapAccess().getRuleKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__FeatureMap__Group_1__0__Impl7603); 
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
    // $ANTLR end "rule__FeatureMap__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group_1__1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3848:1: rule__FeatureMap__Group_1__1 : rule__FeatureMap__Group_1__1__Impl ;
    public final void rule__FeatureMap__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3852:1: ( rule__FeatureMap__Group_1__1__Impl )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3853:2: rule__FeatureMap__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__17634);
            rule__FeatureMap__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group_1__1"


    // $ANTLR start "rule__FeatureMap__Group_1__1__Impl"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3859:1: rule__FeatureMap__Group_1__1__Impl : ( ( rule__FeatureMap__RuleAssignment_1_1 ) ) ;
    public final void rule__FeatureMap__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3863:1: ( ( ( rule__FeatureMap__RuleAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3864:1: ( ( rule__FeatureMap__RuleAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3864:1: ( ( rule__FeatureMap__RuleAssignment_1_1 ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3865:1: ( rule__FeatureMap__RuleAssignment_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getRuleAssignment_1_1()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3866:1: ( rule__FeatureMap__RuleAssignment_1_1 )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3866:2: rule__FeatureMap__RuleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__RuleAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl7661);
            rule__FeatureMap__RuleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getRuleAssignment_1_1()); 

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
    // $ANTLR end "rule__FeatureMap__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3881:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3885:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3886:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3886:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3887:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17700); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__DocumentationAssignment_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3896:1: rule__Model__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3900:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3901:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3901:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3902:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__DocumentationAssignment_27731); 
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
    // $ANTLR end "rule__Model__DocumentationAssignment_2"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3911:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3915:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3916:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3916:1: ( ruleImport )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3917:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37762);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__RulesAssignment_4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3926:1: rule__Model__RulesAssignment_4 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3930:1: ( ( ruleRule ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3931:1: ( ruleRule )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3931:1: ( ruleRule )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3932:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment_47793);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__RulesAssignment_4"


    // $ANTLR start "rule__Model__FuctionsAssignment_5"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3941:1: rule__Model__FuctionsAssignment_5 : ( ruleFuction ) ;
    public final void rule__Model__FuctionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3945:1: ( ( ruleFuction ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3946:1: ( ruleFuction )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3946:1: ( ruleFuction )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3947:1: ruleFuction
            {
             before(grammarAccess.getModelAccess().getFuctionsFuctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFuction_in_rule__Model__FuctionsAssignment_57824);
            ruleFuction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFuctionsFuctionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__FuctionsAssignment_5"


    // $ANTLR start "rule__Model__MappingModulesAssignment_6"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3956:1: rule__Model__MappingModulesAssignment_6 : ( ruleMappingModule ) ;
    public final void rule__Model__MappingModulesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3960:1: ( ( ruleMappingModule ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3961:1: ( ruleMappingModule )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3961:1: ( ruleMappingModule )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3962:1: ruleMappingModule
            {
             before(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment_67855);
            ruleMappingModule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__MappingModulesAssignment_6"


    // $ANTLR start "rule__Model__RootsAssignment_7"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3971:1: rule__Model__RootsAssignment_7 : ( ruleRootModule ) ;
    public final void rule__Model__RootsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3975:1: ( ( ruleRootModule ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3976:1: ( ruleRootModule )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3976:1: ( ruleRootModule )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3977:1: ruleRootModule
            {
             before(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRootModule_in_rule__Model__RootsAssignment_77886);
            ruleRootModule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootsRootModuleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__RootsAssignment_7"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3986:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3990:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3991:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3991:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:3992:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17917);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__RootModule__RootRefAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4001:1: rule__RootModule__RootRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RootModule__RootRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4005:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4006:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4006:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4007:1: ( RULE_ID )
            {
             before(grammarAccess.getRootModuleAccess().getRootRefMappingModuleCrossReference_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4008:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4009:1: RULE_ID
            {
             before(grammarAccess.getRootModuleAccess().getRootRefMappingModuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RootModule__RootRefAssignment_17952); 
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
    // $ANTLR end "rule__RootModule__RootRefAssignment_1"


    // $ANTLR start "rule__RootModule__DocumentationAssignment_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4020:1: rule__RootModule__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RootModule__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4024:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4025:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4025:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4026:1: RULE_STRING
            {
             before(grammarAccess.getRootModuleAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RootModule__DocumentationAssignment_27987); 
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
    // $ANTLR end "rule__RootModule__DocumentationAssignment_2"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4035:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4039:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4040:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4040:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4041:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_18018); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__OperationAssignment_2_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4050:1: rule__Rule__OperationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Rule__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4054:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4055:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4055:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4056:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getOperationSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__OperationAssignment_2_18049); 
             after(grammarAccess.getRuleAccess().getOperationSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Rule__OperationAssignment_2_1"


    // $ANTLR start "rule__Rule__ArgsAssignment_3_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4065:1: rule__Rule__ArgsAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Rule__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4069:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4070:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4070:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4071:1: RULE_STRING
            {
             before(grammarAccess.getRuleAccess().getArgsSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__ArgsAssignment_3_18080); 
             after(grammarAccess.getRuleAccess().getArgsSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Rule__ArgsAssignment_3_1"


    // $ANTLR start "rule__Fuction__NameAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4080:1: rule__Fuction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fuction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4084:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4085:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4085:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4086:1: RULE_ID
            {
             before(grammarAccess.getFuctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fuction__NameAssignment_18111); 
             after(grammarAccess.getFuctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fuction__NameAssignment_1"


    // $ANTLR start "rule__Fuction__InAssignment_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4095:1: rule__Fuction__InAssignment_2 : ( ruleFuctionIn ) ;
    public final void rule__Fuction__InAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4099:1: ( ( ruleFuctionIn ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4100:1: ( ruleFuctionIn )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4100:1: ( ruleFuctionIn )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4101:1: ruleFuctionIn
            {
             before(grammarAccess.getFuctionAccess().getInFuctionInParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFuctionIn_in_rule__Fuction__InAssignment_28142);
            ruleFuctionIn();

            state._fsp--;

             after(grammarAccess.getFuctionAccess().getInFuctionInParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Fuction__InAssignment_2"


    // $ANTLR start "rule__Fuction__OutAssignment_3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4110:1: rule__Fuction__OutAssignment_3 : ( ruleFuctionOut ) ;
    public final void rule__Fuction__OutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4114:1: ( ( ruleFuctionOut ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4115:1: ( ruleFuctionOut )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4115:1: ( ruleFuctionOut )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4116:1: ruleFuctionOut
            {
             before(grammarAccess.getFuctionAccess().getOutFuctionOutParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFuctionOut_in_rule__Fuction__OutAssignment_38173);
            ruleFuctionOut();

            state._fsp--;

             after(grammarAccess.getFuctionAccess().getOutFuctionOutParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Fuction__OutAssignment_3"


    // $ANTLR start "rule__Fuction__DocumentationAssignment_4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4125:1: rule__Fuction__DocumentationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Fuction__DocumentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4129:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4130:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4130:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4131:1: RULE_STRING
            {
             before(grammarAccess.getFuctionAccess().getDocumentationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fuction__DocumentationAssignment_48204); 
             after(grammarAccess.getFuctionAccess().getDocumentationSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Fuction__DocumentationAssignment_4"


    // $ANTLR start "rule__FuctionIn__InEntityAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4140:1: rule__FuctionIn__InEntityAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FuctionIn__InEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4144:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4145:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4145:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4146:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFuctionInAccess().getInEntityEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4147:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4148:1: ruleQualifiedName
            {
             before(grammarAccess.getFuctionInAccess().getInEntityEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FuctionIn__InEntityAssignment_18239);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFuctionInAccess().getInEntityEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFuctionInAccess().getInEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__FuctionIn__InEntityAssignment_1"


    // $ANTLR start "rule__FuctionIn__InAttributeAssignment_3_0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4159:1: rule__FuctionIn__InAttributeAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__FuctionIn__InAttributeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4163:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4164:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4164:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4165:1: ( RULE_ID )
            {
             before(grammarAccess.getFuctionInAccess().getInAttributeAttributeCrossReference_3_0_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4166:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4167:1: RULE_ID
            {
             before(grammarAccess.getFuctionInAccess().getInAttributeAttributeIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FuctionIn__InAttributeAssignment_3_08278); 
             after(grammarAccess.getFuctionInAccess().getInAttributeAttributeIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getFuctionInAccess().getInAttributeAttributeCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__FuctionIn__InAttributeAssignment_3_0"


    // $ANTLR start "rule__FuctionIn__InRefAttributeAssignment_3_1_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4178:1: rule__FuctionIn__InRefAttributeAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__FuctionIn__InRefAttributeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4182:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4183:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4183:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4184:1: ( RULE_ID )
            {
             before(grammarAccess.getFuctionInAccess().getInRefAttributeAttributeCrossReference_3_1_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4185:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4186:1: RULE_ID
            {
             before(grammarAccess.getFuctionInAccess().getInRefAttributeAttributeIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FuctionIn__InRefAttributeAssignment_3_1_28317); 
             after(grammarAccess.getFuctionInAccess().getInRefAttributeAttributeIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getFuctionInAccess().getInRefAttributeAttributeCrossReference_3_1_2_0()); 

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
    // $ANTLR end "rule__FuctionIn__InRefAttributeAssignment_3_1_2"


    // $ANTLR start "rule__FuctionOut__OutEntityAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4197:1: rule__FuctionOut__OutEntityAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FuctionOut__OutEntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4201:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4202:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4202:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4203:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFuctionOutAccess().getOutEntityEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4204:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4205:1: ruleQualifiedName
            {
             before(grammarAccess.getFuctionOutAccess().getOutEntityEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FuctionOut__OutEntityAssignment_18356);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFuctionOutAccess().getOutEntityEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFuctionOutAccess().getOutEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__FuctionOut__OutEntityAssignment_1"


    // $ANTLR start "rule__FuctionOut__OutAttributeAssignment_3_0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4216:1: rule__FuctionOut__OutAttributeAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__FuctionOut__OutAttributeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4220:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4221:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4221:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4222:1: ( RULE_ID )
            {
             before(grammarAccess.getFuctionOutAccess().getOutAttributeAttributeCrossReference_3_0_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4223:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4224:1: RULE_ID
            {
             before(grammarAccess.getFuctionOutAccess().getOutAttributeAttributeIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FuctionOut__OutAttributeAssignment_3_08395); 
             after(grammarAccess.getFuctionOutAccess().getOutAttributeAttributeIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getFuctionOutAccess().getOutAttributeAttributeCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__FuctionOut__OutAttributeAssignment_3_0"


    // $ANTLR start "rule__FuctionOut__OutRefAttributeAssignment_3_1_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4235:1: rule__FuctionOut__OutRefAttributeAssignment_3_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__FuctionOut__OutRefAttributeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4239:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4240:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4240:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4241:1: ( RULE_ID )
            {
             before(grammarAccess.getFuctionOutAccess().getOutRefAttributeAttributeCrossReference_3_1_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4242:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4243:1: RULE_ID
            {
             before(grammarAccess.getFuctionOutAccess().getOutRefAttributeAttributeIDTerminalRuleCall_3_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FuctionOut__OutRefAttributeAssignment_3_1_28434); 
             after(grammarAccess.getFuctionOutAccess().getOutRefAttributeAttributeIDTerminalRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getFuctionOutAccess().getOutRefAttributeAttributeCrossReference_3_1_2_0()); 

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
    // $ANTLR end "rule__FuctionOut__OutRefAttributeAssignment_3_1_2"


    // $ANTLR start "rule__MappingModule__NameAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4254:1: rule__MappingModule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MappingModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4258:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4259:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4259:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4260:1: RULE_ID
            {
             before(grammarAccess.getMappingModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MappingModule__NameAssignment_18469); 
             after(grammarAccess.getMappingModuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MappingModule__NameAssignment_1"


    // $ANTLR start "rule__MappingModule__EntitySourceAssignment_3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4269:1: rule__MappingModule__EntitySourceAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingModule__EntitySourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4273:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4274:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4274:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4275:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingModuleAccess().getEntitySourceEntityCrossReference_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4276:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4277:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingModuleAccess().getEntitySourceEntityQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MappingModule__EntitySourceAssignment_38504);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingModuleAccess().getEntitySourceEntityQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMappingModuleAccess().getEntitySourceEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__MappingModule__EntitySourceAssignment_3"


    // $ANTLR start "rule__MappingModule__EntityTargetAssignment_5"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4288:1: rule__MappingModule__EntityTargetAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingModule__EntityTargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4292:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4293:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4293:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4294:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingModuleAccess().getEntityTargetEntityCrossReference_5_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4295:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4296:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingModuleAccess().getEntityTargetEntityQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MappingModule__EntityTargetAssignment_58543);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingModuleAccess().getEntityTargetEntityQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMappingModuleAccess().getEntityTargetEntityCrossReference_5_0()); 

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
    // $ANTLR end "rule__MappingModule__EntityTargetAssignment_5"


    // $ANTLR start "rule__MappingModule__DocumentationAssignment_6"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4307:1: rule__MappingModule__DocumentationAssignment_6 : ( RULE_STRING ) ;
    public final void rule__MappingModule__DocumentationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4311:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4312:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4312:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4313:1: RULE_STRING
            {
             before(grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MappingModule__DocumentationAssignment_68578); 
             after(grammarAccess.getMappingModuleAccess().getDocumentationSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__MappingModule__DocumentationAssignment_6"


    // $ANTLR start "rule__MappingModule__MappedFeaturesAssignment_8_0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4322:1: rule__MappingModule__MappedFeaturesAssignment_8_0 : ( ruleFeatureMap ) ;
    public final void rule__MappingModule__MappedFeaturesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4326:1: ( ( ruleFeatureMap ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4327:1: ( ruleFeatureMap )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4327:1: ( ruleFeatureMap )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4328:1: ruleFeatureMap
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_8_08609);
            ruleFeatureMap();

            state._fsp--;

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__MappingModule__MappedFeaturesAssignment_8_0"


    // $ANTLR start "rule__FeatureMap__FuctionMapAssignment_0_0_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4337:1: rule__FeatureMap__FuctionMapAssignment_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__FuctionMapAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4341:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4342:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4342:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4343:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getFuctionMapFuctionCrossReference_0_0_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4344:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4345:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getFuctionMapFuctionIDTerminalRuleCall_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__FuctionMapAssignment_0_0_18644); 
             after(grammarAccess.getFeatureMapAccess().getFuctionMapFuctionIDTerminalRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getFuctionMapFuctionCrossReference_0_0_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__FuctionMapAssignment_0_0_1"


    // $ANTLR start "rule__FeatureMap__AttributeSourceAssignment_0_1_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4356:1: rule__FeatureMap__AttributeSourceAssignment_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeSourceAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4360:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4361:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4361:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4362:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_1_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4363:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4364:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_1_18683); 
             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_1_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeSourceAssignment_0_1_1"


    // $ANTLR start "rule__FeatureMap__AttributeTargetAssignment_0_1_3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4375:1: rule__FeatureMap__AttributeTargetAssignment_0_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeTargetAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4379:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4380:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4380:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4381:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_1_3_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4382:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4383:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_1_38722); 
             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_1_3_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_1_3_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeTargetAssignment_0_1_3"


    // $ANTLR start "rule__FeatureMap__RefAttributeAssignment_0_1_4_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4394:1: rule__FeatureMap__RefAttributeAssignment_0_1_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RefAttributeAssignment_0_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4398:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4399:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4399:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4400:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_1_4_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4401:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4402:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_1_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_1_4_28761); 
             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_1_4_2_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_1_4_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__RefAttributeAssignment_0_1_4_2"


    // $ANTLR start "rule__FeatureMap__WithModuleAssignment_0_2_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4413:1: rule__FeatureMap__WithModuleAssignment_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__WithModuleAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4417:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4418:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4418:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4419:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getWithModuleMappingModuleCrossReference_0_2_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4420:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4421:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getWithModuleMappingModuleIDTerminalRuleCall_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__WithModuleAssignment_0_2_18800); 
             after(grammarAccess.getFeatureMapAccess().getWithModuleMappingModuleIDTerminalRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getWithModuleMappingModuleCrossReference_0_2_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__WithModuleAssignment_0_2_1"


    // $ANTLR start "rule__FeatureMap__AttributeSourcesAssignment_0_2_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4432:1: rule__FeatureMap__AttributeSourcesAssignment_0_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeSourcesAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4436:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4437:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4437:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4438:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourcesAttributeCrossReference_0_2_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4439:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4440:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourcesAttributeIDTerminalRuleCall_0_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourcesAssignment_0_2_28839); 
             after(grammarAccess.getFeatureMapAccess().getAttributeSourcesAttributeIDTerminalRuleCall_0_2_2_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourcesAttributeCrossReference_0_2_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeSourcesAssignment_0_2_2"


    // $ANTLR start "rule__FeatureMap__AttributeTargetAssignment_0_2_4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4451:1: rule__FeatureMap__AttributeTargetAssignment_0_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeTargetAssignment_0_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4455:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4456:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4456:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4457:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_2_4_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4458:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4459:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_2_48878); 
             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_2_4_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_2_4_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeTargetAssignment_0_2_4"


    // $ANTLR start "rule__FeatureMap__RefAttributeAssignment_0_2_5_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4470:1: rule__FeatureMap__RefAttributeAssignment_0_2_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RefAttributeAssignment_0_2_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4474:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4475:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4475:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4476:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_2_5_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4477:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4478:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_2_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_2_5_28917); 
             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_2_5_2_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_2_5_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__RefAttributeAssignment_0_2_5_2"


    // $ANTLR start "rule__FeatureMap__AttributeSourceAssignment_0_3_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4489:1: rule__FeatureMap__AttributeSourceAssignment_0_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeSourceAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4493:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4494:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4494:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4495:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_3_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4496:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4497:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_3_18956); 
             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_3_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeSourceAssignment_0_3_1"


    // $ANTLR start "rule__FeatureMap__ExprAssignment_0_3_3"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4508:1: rule__FeatureMap__ExprAssignment_0_3_3 : ( ruleExpression ) ;
    public final void rule__FeatureMap__ExprAssignment_0_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4512:1: ( ( ruleExpression ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4513:1: ( ruleExpression )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4513:1: ( ruleExpression )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4514:1: ruleExpression
            {
             before(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_3_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_3_38991);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_3_3_0()); 

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
    // $ANTLR end "rule__FeatureMap__ExprAssignment_0_3_3"


    // $ANTLR start "rule__FeatureMap__AttributeTargetAssignment_0_4_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4523:1: rule__FeatureMap__AttributeTargetAssignment_0_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeTargetAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4527:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4528:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4528:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4529:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_4_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4530:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4531:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_4_19026); 
             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_4_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_4_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeTargetAssignment_0_4_1"


    // $ANTLR start "rule__FeatureMap__RefAttributeAssignment_0_4_2_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4542:1: rule__FeatureMap__RefAttributeAssignment_0_4_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RefAttributeAssignment_0_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4546:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4547:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4547:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4548:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_4_2_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4549:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4550:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_4_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_4_2_29065); 
             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_4_2_2_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_4_2_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__RefAttributeAssignment_0_4_2_2"


    // $ANTLR start "rule__FeatureMap__ExprAssignment_0_4_4"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4561:1: rule__FeatureMap__ExprAssignment_0_4_4 : ( ruleExpression ) ;
    public final void rule__FeatureMap__ExprAssignment_0_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4565:1: ( ( ruleExpression ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4566:1: ( ruleExpression )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4566:1: ( ruleExpression )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4567:1: ruleExpression
            {
             before(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_4_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_4_49100);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFeatureMapAccess().getExprExpressionParserRuleCall_0_4_4_0()); 

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
    // $ANTLR end "rule__FeatureMap__ExprAssignment_0_4_4"


    // $ANTLR start "rule__FeatureMap__AttributeSourceAssignment_0_5_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4576:1: rule__FeatureMap__AttributeSourceAssignment_0_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeSourceAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4580:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4581:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4581:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4582:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_5_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4583:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4584:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_5_19135); 
             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeIDTerminalRuleCall_0_5_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeSourceAttributeCrossReference_0_5_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeSourceAssignment_0_5_1"


    // $ANTLR start "rule__FeatureMap__AttributeTargetAssignment_0_6_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4595:1: rule__FeatureMap__AttributeTargetAssignment_0_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__AttributeTargetAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4599:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4600:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4600:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4601:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_6_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4602:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4603:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_6_19174); 
             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeIDTerminalRuleCall_0_6_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getAttributeTargetAttributeCrossReference_0_6_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__AttributeTargetAssignment_0_6_1"


    // $ANTLR start "rule__FeatureMap__RefAttributeAssignment_0_6_2_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4614:1: rule__FeatureMap__RefAttributeAssignment_0_6_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RefAttributeAssignment_0_6_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4618:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4619:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4619:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4620:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_6_2_2_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4621:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4622:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_6_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_6_2_29213); 
             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeIDTerminalRuleCall_0_6_2_2_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRefAttributeAttributeCrossReference_0_6_2_2_0()); 

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
    // $ANTLR end "rule__FeatureMap__RefAttributeAssignment_0_6_2_2"


    // $ANTLR start "rule__FeatureMap__RuleAssignment_1_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4633:1: rule__FeatureMap__RuleAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4637:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4638:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4638:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4639:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getRuleRuleCrossReference_1_1_0()); 
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4640:1: ( RULE_ID )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4641:1: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getRuleRuleIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeatureMap__RuleAssignment_1_19252); 
             after(grammarAccess.getFeatureMapAccess().getRuleRuleIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getRuleRuleCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__FeatureMap__RuleAssignment_1_1"


    // $ANTLR start "rule__FeatureMap__DocumentationAssignment_2"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4652:1: rule__FeatureMap__DocumentationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__DocumentationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4656:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4657:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4657:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4658:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_29287); 
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
    // $ANTLR end "rule__FeatureMap__DocumentationAssignment_2"


    // $ANTLR start "rule__Expression__ValueAssignment_0"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4667:1: rule__Expression__ValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4671:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4672:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4672:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4673:1: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_09318); 
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
    // $ANTLR end "rule__Expression__ValueAssignment_0"


    // $ANTLR start "rule__Expression__IntValueAssignment_1"
    // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4682:1: rule__Expression__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Expression__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4686:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4687:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4687:1: ( RULE_INT )
            // ../fr.chaunier.xtext.map.ui/src-gen/fr/chaunier/xtext/map/ui/contentassist/antlr/internal/InternalMapDsl.g:4688:1: RULE_INT
            {
             before(grammarAccess.getExpressionAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Expression__IntValueAssignment_19349); 
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
    // $ANTLR end "rule__Expression__IntValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootModule_in_entryRuleRootModule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootModule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__0_in_ruleRootModule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuction_in_entryRuleFuction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__Group__0_in_ruleFuction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionIn_in_entryRuleFuctionIn481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuctionIn488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__0_in_ruleFuctionIn514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionOut_in_entryRuleFuctionOut541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuctionOut548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__0_in_ruleFuctionOut574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__0_in_ruleFeatureMap694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__0_in_rule__FeatureMap__Alternatives_0790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__0_in_rule__FeatureMap__Alternatives_0808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__0_in_rule__FeatureMap__Alternatives_0826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__0_in_rule__FeatureMap__Alternatives_0844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__0_in_rule__FeatureMap__Alternatives_0862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__0_in_rule__FeatureMap__Alternatives_0880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__0_in_rule__FeatureMap__Alternatives_0898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ValueAssignment_0_in_rule__Expression__Alternatives931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__IntValueAssignment_1_in_rule__Expression__Alternatives949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11042 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21102 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DocumentationAssignment_2_in_rule__Model__Group__2__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31163 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1193 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41224 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_4_in_rule__Model__Group__4__Impl1254 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51285 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FuctionsAssignment_5_in_rule__Model__Group__5__Impl1315 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61346 = new BitSet(new long[]{0x0000000001099020L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MappingModulesAssignment_6_in_rule__Model__Group__6__Impl1376 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RootsAssignment_7_in_rule__Model__Group__7__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01728 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1814 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__0__Impl_in_rule__RootModule__Group__01971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RootModule__Group__1_in_rule__RootModule__Group__01974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RootModule__Group__0__Impl2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__1__Impl_in_rule__RootModule__Group__12033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RootModule__Group__2_in_rule__RootModule__Group__12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__RootRefAssignment_1_in_rule__RootModule__Group__1__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__Group__2__Impl_in_rule__RootModule__Group__22093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootModule__DocumentationAssignment_2_in_rule__RootModule__Group__2__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Rule__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12219 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22279 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__0_in_rule__Rule__Group__2__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__0_in_rule__Rule__Group__3__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__0__Impl_in_rule__Rule__Group_2__02406 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__1_in_rule__Rule__Group_2__02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group_2__0__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2__1__Impl_in_rule__Rule__Group_2__12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__OperationAssignment_2_1_in_rule__Rule__Group_2__1__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__0__Impl_in_rule__Rule__Group_3__02529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__1_in_rule__Rule__Group_3__02532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group_3__0__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3__1__Impl_in_rule__Rule__Group_3__12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ArgsAssignment_3_1_in_rule__Rule__Group_3__1__Impl2618 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Fuction__Group__0__Impl_in_rule__Fuction__Group__02653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fuction__Group__1_in_rule__Fuction__Group__02656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Fuction__Group__0__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__Group__1__Impl_in_rule__Fuction__Group__12715 = new BitSet(new long[]{0x0000000000900020L});
    public static final BitSet FOLLOW_rule__Fuction__Group__2_in_rule__Fuction__Group__12718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__NameAssignment_1_in_rule__Fuction__Group__1__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__Group__2__Impl_in_rule__Fuction__Group__22775 = new BitSet(new long[]{0x0000000000900020L});
    public static final BitSet FOLLOW_rule__Fuction__Group__3_in_rule__Fuction__Group__22778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__InAssignment_2_in_rule__Fuction__Group__2__Impl2805 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Fuction__Group__3__Impl_in_rule__Fuction__Group__32836 = new BitSet(new long[]{0x0000000000900020L});
    public static final BitSet FOLLOW_rule__Fuction__Group__4_in_rule__Fuction__Group__32839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__OutAssignment_3_in_rule__Fuction__Group__3__Impl2866 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Fuction__Group__4__Impl_in_rule__Fuction__Group__42897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fuction__DocumentationAssignment_4_in_rule__Fuction__Group__4__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__0__Impl_in_rule__FuctionIn__Group__02965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__1_in_rule__FuctionIn__Group__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FuctionIn__Group__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__1__Impl_in_rule__FuctionIn__Group__13027 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__2_in_rule__FuctionIn__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__InEntityAssignment_1_in_rule__FuctionIn__Group__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__2__Impl_in_rule__FuctionIn__Group__23087 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__3_in_rule__FuctionIn__Group__23090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FuctionIn__Group__2__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__3__Impl_in_rule__FuctionIn__Group__33149 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__4_in_rule__FuctionIn__Group__33152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3__0_in_rule__FuctionIn__Group__3__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group__4__Impl_in_rule__FuctionIn__Group__43210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FuctionIn__Group__4__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3__0__Impl_in_rule__FuctionIn__Group_3__03279 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3__1_in_rule__FuctionIn__Group_3__03282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__InAttributeAssignment_3_0_in_rule__FuctionIn__Group_3__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3__1__Impl_in_rule__FuctionIn__Group_3__13339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__0_in_rule__FuctionIn__Group_3__1__Impl3366 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__0__Impl_in_rule__FuctionIn__Group_3_1__03401 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__1_in_rule__FuctionIn__Group_3_1__03404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__1__Impl_in_rule__FuctionIn__Group_3_1__13462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__2_in_rule__FuctionIn__Group_3_1__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FuctionIn__Group_3_1__1__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__Group_3_1__2__Impl_in_rule__FuctionIn__Group_3_1__23524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionIn__InRefAttributeAssignment_3_1_2_in_rule__FuctionIn__Group_3_1__2__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__0__Impl_in_rule__FuctionOut__Group__03587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__1_in_rule__FuctionOut__Group__03590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FuctionOut__Group__0__Impl3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__1__Impl_in_rule__FuctionOut__Group__13649 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__2_in_rule__FuctionOut__Group__13652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__OutEntityAssignment_1_in_rule__FuctionOut__Group__1__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__2__Impl_in_rule__FuctionOut__Group__23709 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__3_in_rule__FuctionOut__Group__23712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FuctionOut__Group__2__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__3__Impl_in_rule__FuctionOut__Group__33771 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__4_in_rule__FuctionOut__Group__33774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3__0_in_rule__FuctionOut__Group__3__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group__4__Impl_in_rule__FuctionOut__Group__43832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FuctionOut__Group__4__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3__0__Impl_in_rule__FuctionOut__Group_3__03901 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3__1_in_rule__FuctionOut__Group_3__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__OutAttributeAssignment_3_0_in_rule__FuctionOut__Group_3__0__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3__1__Impl_in_rule__FuctionOut__Group_3__13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__0_in_rule__FuctionOut__Group_3__1__Impl3988 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__0__Impl_in_rule__FuctionOut__Group_3_1__04023 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__1_in_rule__FuctionOut__Group_3_1__04026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__1__Impl_in_rule__FuctionOut__Group_3_1__14084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__2_in_rule__FuctionOut__Group_3_1__14087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FuctionOut__Group_3_1__1__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__Group_3_1__2__Impl_in_rule__FuctionOut__Group_3_1__24146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FuctionOut__OutRefAttributeAssignment_3_1_2_in_rule__FuctionOut__Group_3_1__2__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__04209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__04212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MappingModule__Group__0__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__14271 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__24331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__24334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MappingModule__Group__2__Impl4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__34393 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__34396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__EntitySourceAssignment_3_in_rule__MappingModule__Group__3__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__44453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5_in_rule__MappingModule__Group__44456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MappingModule__Group__4__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__5__Impl_in_rule__MappingModule__Group__54515 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__6_in_rule__MappingModule__Group__54518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__EntityTargetAssignment_5_in_rule__MappingModule__Group__5__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__6__Impl_in_rule__MappingModule__Group__64575 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__7_in_rule__MappingModule__Group__64578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__DocumentationAssignment_6_in_rule__MappingModule__Group__6__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__7__Impl_in_rule__MappingModule__Group__74636 = new BitSet(new long[]{0x00000076D0000000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__8_in_rule__MappingModule__Group__74639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MappingModule__Group__7__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__8__Impl_in_rule__MappingModule__Group__84698 = new BitSet(new long[]{0x00000076D0000000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__9_in_rule__MappingModule__Group__84701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_8__0_in_rule__MappingModule__Group__8__Impl4728 = new BitSet(new long[]{0x00000076C0000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__9__Impl_in_rule__MappingModule__Group__94759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MappingModule__Group__9__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_8__0__Impl_in_rule__MappingModule__Group_8__04838 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_8__1_in_rule__MappingModule__Group_8__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__MappedFeaturesAssignment_8_0_in_rule__MappingModule__Group_8__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_8__1__Impl_in_rule__MappingModule__Group_8__14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MappingModule__Group_8__1__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__0__Impl_in_rule__FeatureMap__Group__04964 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__1_in_rule__FeatureMap__Group__04967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Alternatives_0_in_rule__FeatureMap__Group__0__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__1__Impl_in_rule__FeatureMap__Group__15024 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__2_in_rule__FeatureMap__Group__15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Group__1__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group__2__Impl_in_rule__FeatureMap__Group__25085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__DocumentationAssignment_2_in_rule__FeatureMap__Group__2__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__0__Impl_in_rule__FeatureMap__Group_0_0__05149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__1_in_rule__FeatureMap__Group_0_0__05152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FeatureMap__Group_0_0__0__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_0__1__Impl_in_rule__FeatureMap__Group_0_0__15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__FuctionMapAssignment_0_0_1_in_rule__FeatureMap__Group_0_0__1__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__0__Impl_in_rule__FeatureMap__Group_0_1__05272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__1_in_rule__FeatureMap__Group_0_1__05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FeatureMap__Group_0_1__0__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__1__Impl_in_rule__FeatureMap__Group_0_1__15334 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__2_in_rule__FeatureMap__Group_0_1__15337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_1_1_in_rule__FeatureMap__Group_0_1__1__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__2__Impl_in_rule__FeatureMap__Group_0_1__25394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__3_in_rule__FeatureMap__Group_0_1__25397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FeatureMap__Group_0_1__2__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__3__Impl_in_rule__FeatureMap__Group_0_1__35456 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__4_in_rule__FeatureMap__Group_0_1__35459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_1_3_in_rule__FeatureMap__Group_0_1__3__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1__4__Impl_in_rule__FeatureMap__Group_0_1__45516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__0_in_rule__FeatureMap__Group_0_1__4__Impl5543 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__0__Impl_in_rule__FeatureMap__Group_0_1_4__05584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__1_in_rule__FeatureMap__Group_0_1_4__05587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__1__Impl_in_rule__FeatureMap__Group_0_1_4__15645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__2_in_rule__FeatureMap__Group_0_1_4__15648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FeatureMap__Group_0_1_4__1__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_1_4__2__Impl_in_rule__FeatureMap__Group_0_1_4__25707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_1_4_2_in_rule__FeatureMap__Group_0_1_4__2__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__0__Impl_in_rule__FeatureMap__Group_0_2__05770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__1_in_rule__FeatureMap__Group_0_2__05773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FeatureMap__Group_0_2__0__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__1__Impl_in_rule__FeatureMap__Group_0_2__15832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__2_in_rule__FeatureMap__Group_0_2__15835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__WithModuleAssignment_0_2_1_in_rule__FeatureMap__Group_0_2__1__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__2__Impl_in_rule__FeatureMap__Group_0_2__25892 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__3_in_rule__FeatureMap__Group_0_2__25895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeSourcesAssignment_0_2_2_in_rule__FeatureMap__Group_0_2__2__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__3__Impl_in_rule__FeatureMap__Group_0_2__35952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__4_in_rule__FeatureMap__Group_0_2__35955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FeatureMap__Group_0_2__3__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__4__Impl_in_rule__FeatureMap__Group_0_2__46014 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__5_in_rule__FeatureMap__Group_0_2__46017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_2_4_in_rule__FeatureMap__Group_0_2__4__Impl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2__5__Impl_in_rule__FeatureMap__Group_0_2__56074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__0_in_rule__FeatureMap__Group_0_2__5__Impl6101 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__0__Impl_in_rule__FeatureMap__Group_0_2_5__06144 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__1_in_rule__FeatureMap__Group_0_2_5__06147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__1__Impl_in_rule__FeatureMap__Group_0_2_5__16205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__2_in_rule__FeatureMap__Group_0_2_5__16208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FeatureMap__Group_0_2_5__1__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_2_5__2__Impl_in_rule__FeatureMap__Group_0_2_5__26267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_2_5_2_in_rule__FeatureMap__Group_0_2_5__2__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__0__Impl_in_rule__FeatureMap__Group_0_3__06330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__1_in_rule__FeatureMap__Group_0_3__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FeatureMap__Group_0_3__0__Impl6361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__1__Impl_in_rule__FeatureMap__Group_0_3__16392 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__2_in_rule__FeatureMap__Group_0_3__16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_3_1_in_rule__FeatureMap__Group_0_3__1__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__2__Impl_in_rule__FeatureMap__Group_0_3__26452 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__3_in_rule__FeatureMap__Group_0_3__26455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FeatureMap__Group_0_3__2__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_3__3__Impl_in_rule__FeatureMap__Group_0_3__36514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ExprAssignment_0_3_3_in_rule__FeatureMap__Group_0_3__3__Impl6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__0__Impl_in_rule__FeatureMap__Group_0_4__06579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__1_in_rule__FeatureMap__Group_0_4__06582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FeatureMap__Group_0_4__0__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__1__Impl_in_rule__FeatureMap__Group_0_4__16641 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__2_in_rule__FeatureMap__Group_0_4__16644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_4_1_in_rule__FeatureMap__Group_0_4__1__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__2__Impl_in_rule__FeatureMap__Group_0_4__26701 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__3_in_rule__FeatureMap__Group_0_4__26704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__0_in_rule__FeatureMap__Group_0_4__2__Impl6731 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__3__Impl_in_rule__FeatureMap__Group_0_4__36762 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__4_in_rule__FeatureMap__Group_0_4__36765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FeatureMap__Group_0_4__3__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4__4__Impl_in_rule__FeatureMap__Group_0_4__46824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ExprAssignment_0_4_4_in_rule__FeatureMap__Group_0_4__4__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__0__Impl_in_rule__FeatureMap__Group_0_4_2__06891 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__1_in_rule__FeatureMap__Group_0_4_2__06894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__1__Impl_in_rule__FeatureMap__Group_0_4_2__16952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__2_in_rule__FeatureMap__Group_0_4_2__16955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FeatureMap__Group_0_4_2__1__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_4_2__2__Impl_in_rule__FeatureMap__Group_0_4_2__27014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_4_2_2_in_rule__FeatureMap__Group_0_4_2__2__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__0__Impl_in_rule__FeatureMap__Group_0_5__07077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__1_in_rule__FeatureMap__Group_0_5__07080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FeatureMap__Group_0_5__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_5__1__Impl_in_rule__FeatureMap__Group_0_5__17139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeSourceAssignment_0_5_1_in_rule__FeatureMap__Group_0_5__1__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__0__Impl_in_rule__FeatureMap__Group_0_6__07200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__1_in_rule__FeatureMap__Group_0_6__07203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FeatureMap__Group_0_6__0__Impl7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__1__Impl_in_rule__FeatureMap__Group_0_6__17262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__2_in_rule__FeatureMap__Group_0_6__17265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__AttributeTargetAssignment_0_6_1_in_rule__FeatureMap__Group_0_6__1__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6__2__Impl_in_rule__FeatureMap__Group_0_6__27322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__0_in_rule__FeatureMap__Group_0_6__2__Impl7349 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__0__Impl_in_rule__FeatureMap__Group_0_6_2__07386 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__1_in_rule__FeatureMap__Group_0_6_2__07389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__1__Impl_in_rule__FeatureMap__Group_0_6_2__17447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__2_in_rule__FeatureMap__Group_0_6_2__17450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FeatureMap__Group_0_6_2__1__Impl7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0_6_2__2__Impl_in_rule__FeatureMap__Group_0_6_2__27509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RefAttributeAssignment_0_6_2_2_in_rule__FeatureMap__Group_0_6_2__2__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__07572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__07575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FeatureMap__Group_1__0__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__17634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RuleAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_17700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__DocumentationAssignment_27731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment_47793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuction_in_rule__Model__FuctionsAssignment_57824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment_67855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootModule_in_rule__Model__RootsAssignment_77886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RootModule__RootRefAssignment_17952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RootModule__DocumentationAssignment_27987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_18018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__OperationAssignment_2_18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__ArgsAssignment_3_18080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fuction__NameAssignment_18111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionIn_in_rule__Fuction__InAssignment_28142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuctionOut_in_rule__Fuction__OutAssignment_38173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fuction__DocumentationAssignment_48204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FuctionIn__InEntityAssignment_18239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FuctionIn__InAttributeAssignment_3_08278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FuctionIn__InRefAttributeAssignment_3_1_28317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FuctionOut__OutEntityAssignment_18356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FuctionOut__OutAttributeAssignment_3_08395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FuctionOut__OutRefAttributeAssignment_3_1_28434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MappingModule__NameAssignment_18469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MappingModule__EntitySourceAssignment_38504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MappingModule__EntityTargetAssignment_58543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MappingModule__DocumentationAssignment_68578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_8_08609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__FuctionMapAssignment_0_0_18644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_1_18683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_1_38722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_1_4_28761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__WithModuleAssignment_0_2_18800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourcesAssignment_0_2_28839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_2_48878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_2_5_28917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_3_18956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_3_38991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_4_19026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_4_2_29065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FeatureMap__ExprAssignment_0_4_49100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeSourceAssignment_0_5_19135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__AttributeTargetAssignment_0_6_19174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RefAttributeAssignment_0_6_2_29213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMap__RuleAssignment_1_19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_29287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Expression__ValueAssignment_09318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Expression__IntValueAssignment_19349 = new BitSet(new long[]{0x0000000000000002L});

}