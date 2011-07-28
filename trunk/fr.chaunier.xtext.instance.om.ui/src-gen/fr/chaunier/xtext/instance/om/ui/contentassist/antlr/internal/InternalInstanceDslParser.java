package fr.chaunier.xtext.instance.om.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.instance.om.services.InstanceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInstanceDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'import'", "'.*'", "'.'", "'{'", "'}'", "'new'", "'+='", "'this'", "'null'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInstanceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInstanceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInstanceDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g"; }


     
     	private InstanceDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InstanceDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleFactory"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:61:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:62:1: ( ruleFactory EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:63:1: ruleFactory EOF
            {
             before(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_ruleFactory_in_entryRuleFactory61);
            ruleFactory();

            state._fsp--;

             after(grammarAccess.getFactoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactory68); 

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
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:70:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:74:2: ( ( ( rule__Factory__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:75:1: ( ( rule__Factory__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:75:1: ( ( rule__Factory__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:76:1: ( rule__Factory__Group__0 )
            {
             before(grammarAccess.getFactoryAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:77:1: ( rule__Factory__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:77:2: rule__Factory__Group__0
            {
            pushFollow(FOLLOW_rule__Factory__Group__0_in_ruleFactory94);
            rule__Factory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:90:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:91:1: ruleImport EOF
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:105:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:105:2: rule__Import__Group__0
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:117:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:118:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:119:1: ruleQualifiedNameWithWildCard EOF
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:126:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:130:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:132:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:133:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:133:2: rule__QualifiedNameWithWildCard__Group__0
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:147:1: ruleQualifiedName EOF
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:161:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleFeature"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:173:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:174:1: ( ruleFeature EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:175:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature301);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature308); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:182:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:186:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:187:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:187:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:188:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:189:1: ( rule__Feature__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:189:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature334);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleNewObject"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:201:1: entryRuleNewObject : ruleNewObject EOF ;
    public final void entryRuleNewObject() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:202:1: ( ruleNewObject EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:203:1: ruleNewObject EOF
            {
             before(grammarAccess.getNewObjectRule()); 
            pushFollow(FOLLOW_ruleNewObject_in_entryRuleNewObject361);
            ruleNewObject();

            state._fsp--;

             after(grammarAccess.getNewObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewObject368); 

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
    // $ANTLR end "entryRuleNewObject"


    // $ANTLR start "ruleNewObject"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:210:1: ruleNewObject : ( ( rule__NewObject__Group__0 ) ) ;
    public final void ruleNewObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:214:2: ( ( ( rule__NewObject__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:215:1: ( ( rule__NewObject__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:215:1: ( ( rule__NewObject__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:216:1: ( rule__NewObject__Group__0 )
            {
             before(grammarAccess.getNewObjectAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:217:1: ( rule__NewObject__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:217:2: rule__NewObject__Group__0
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0_in_ruleNewObject394);
            rule__NewObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewObject"


    // $ANTLR start "entryRuleValue"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:229:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:230:1: ( ruleValue EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:231:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue421);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue428); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:238:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:242:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:243:1: ( ( rule__Value__Alternatives ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:243:1: ( ( rule__Value__Alternatives ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:244:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:245:1: ( rule__Value__Alternatives )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:245:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue454);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleReference"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:257:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:258:1: ( ruleReference EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:259:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference481);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference488); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:266:1: ruleReference : ( ( rule__Reference__ValueAssignment ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:270:2: ( ( ( rule__Reference__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:271:1: ( ( rule__Reference__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:271:1: ( ( rule__Reference__ValueAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:272:1: ( rule__Reference__ValueAssignment )
            {
             before(grammarAccess.getReferenceAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:273:1: ( rule__Reference__ValueAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:273:2: rule__Reference__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Reference__ValueAssignment_in_ruleReference514);
            rule__Reference__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleContainment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:285:1: entryRuleContainment : ruleContainment EOF ;
    public final void entryRuleContainment() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:286:1: ( ruleContainment EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:287:1: ruleContainment EOF
            {
             before(grammarAccess.getContainmentRule()); 
            pushFollow(FOLLOW_ruleContainment_in_entryRuleContainment541);
            ruleContainment();

            state._fsp--;

             after(grammarAccess.getContainmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainment548); 

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
    // $ANTLR end "entryRuleContainment"


    // $ANTLR start "ruleContainment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:294:1: ruleContainment : ( ( rule__Containment__ValueAssignment ) ) ;
    public final void ruleContainment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:298:2: ( ( ( rule__Containment__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:299:1: ( ( rule__Containment__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:299:1: ( ( rule__Containment__ValueAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:300:1: ( rule__Containment__ValueAssignment )
            {
             before(grammarAccess.getContainmentAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:301:1: ( rule__Containment__ValueAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:301:2: rule__Containment__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment574);
            rule__Containment__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getContainmentAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainment"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:315:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:316:1: ( ruleTerminalExpression EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:317:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression603);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression610); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:324:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:328:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:329:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:329:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:330:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:331:1: ( rule__TerminalExpression__Alternatives )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:331:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression636);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleThis"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:343:1: entryRuleThis : ruleThis EOF ;
    public final void entryRuleThis() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:344:1: ( ruleThis EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:345:1: ruleThis EOF
            {
             before(grammarAccess.getThisRule()); 
            pushFollow(FOLLOW_ruleThis_in_entryRuleThis663);
            ruleThis();

            state._fsp--;

             after(grammarAccess.getThisRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThis670); 

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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:352:1: ruleThis : ( ( rule__This__VariableAssignment ) ) ;
    public final void ruleThis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:356:2: ( ( ( rule__This__VariableAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:357:1: ( ( rule__This__VariableAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:357:1: ( ( rule__This__VariableAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:358:1: ( rule__This__VariableAssignment )
            {
             before(grammarAccess.getThisAccess().getVariableAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:359:1: ( rule__This__VariableAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:359:2: rule__This__VariableAssignment
            {
            pushFollow(FOLLOW_rule__This__VariableAssignment_in_ruleThis696);
            rule__This__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getThisAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleNew"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:371:1: entryRuleNew : ruleNew EOF ;
    public final void entryRuleNew() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:372:1: ( ruleNew EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:373:1: ruleNew EOF
            {
             before(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew723);
            ruleNew();

            state._fsp--;

             after(grammarAccess.getNewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew730); 

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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:380:1: ruleNew : ( ( rule__New__Group__0 ) ) ;
    public final void ruleNew() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:384:2: ( ( ( rule__New__Group__0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:385:1: ( ( rule__New__Group__0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:385:1: ( ( rule__New__Group__0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:386:1: ( rule__New__Group__0 )
            {
             before(grammarAccess.getNewAccess().getGroup()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:387:1: ( rule__New__Group__0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:387:2: rule__New__Group__0
            {
            pushFollow(FOLLOW_rule__New__Group__0_in_ruleNew756);
            rule__New__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleIntero"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:399:1: entryRuleIntero : ruleIntero EOF ;
    public final void entryRuleIntero() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:400:1: ( ruleIntero EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:401:1: ruleIntero EOF
            {
             before(grammarAccess.getInteroRule()); 
            pushFollow(FOLLOW_ruleIntero_in_entryRuleIntero783);
            ruleIntero();

            state._fsp--;

             after(grammarAccess.getInteroRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntero790); 

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
    // $ANTLR end "entryRuleIntero"


    // $ANTLR start "ruleIntero"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:408:1: ruleIntero : ( ( rule__Intero__ValueAssignment ) ) ;
    public final void ruleIntero() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:412:2: ( ( ( rule__Intero__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:413:1: ( ( rule__Intero__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:413:1: ( ( rule__Intero__ValueAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:414:1: ( rule__Intero__ValueAssignment )
            {
             before(grammarAccess.getInteroAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:415:1: ( rule__Intero__ValueAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:415:2: rule__Intero__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Intero__ValueAssignment_in_ruleIntero816);
            rule__Intero__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInteroAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntero"


    // $ANTLR start "entryRuleStringa"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:427:1: entryRuleStringa : ruleStringa EOF ;
    public final void entryRuleStringa() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:428:1: ( ruleStringa EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:429:1: ruleStringa EOF
            {
             before(grammarAccess.getStringaRule()); 
            pushFollow(FOLLOW_ruleStringa_in_entryRuleStringa843);
            ruleStringa();

            state._fsp--;

             after(grammarAccess.getStringaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringa850); 

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
    // $ANTLR end "entryRuleStringa"


    // $ANTLR start "ruleStringa"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:436:1: ruleStringa : ( ( rule__Stringa__ValueAssignment ) ) ;
    public final void ruleStringa() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:440:2: ( ( ( rule__Stringa__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:441:1: ( ( rule__Stringa__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:441:1: ( ( rule__Stringa__ValueAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:442:1: ( rule__Stringa__ValueAssignment )
            {
             before(grammarAccess.getStringaAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:443:1: ( rule__Stringa__ValueAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:443:2: rule__Stringa__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Stringa__ValueAssignment_in_ruleStringa876);
            rule__Stringa__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringaAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringa"


    // $ANTLR start "entryRuleNullo"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:455:1: entryRuleNullo : ruleNullo EOF ;
    public final void entryRuleNullo() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:456:1: ( ruleNullo EOF )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:457:1: ruleNullo EOF
            {
             before(grammarAccess.getNulloRule()); 
            pushFollow(FOLLOW_ruleNullo_in_entryRuleNullo903);
            ruleNullo();

            state._fsp--;

             after(grammarAccess.getNulloRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullo910); 

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
    // $ANTLR end "entryRuleNullo"


    // $ANTLR start "ruleNullo"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:464:1: ruleNullo : ( ( rule__Nullo__ValueAssignment ) ) ;
    public final void ruleNullo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:468:2: ( ( ( rule__Nullo__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:469:1: ( ( rule__Nullo__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:469:1: ( ( rule__Nullo__ValueAssignment ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:470:1: ( rule__Nullo__ValueAssignment )
            {
             before(grammarAccess.getNulloAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:471:1: ( rule__Nullo__ValueAssignment )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:471:2: rule__Nullo__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Nullo__ValueAssignment_in_ruleNullo936);
            rule__Nullo__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNulloAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullo"


    // $ANTLR start "rule__Feature__Alternatives_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:483:1: rule__Feature__Alternatives_1 : ( ( ( rule__Feature__IsManyAssignment_1_0 ) ) | ( '=' ) );
    public final void rule__Feature__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:487:1: ( ( ( rule__Feature__IsManyAssignment_1_0 ) ) | ( '=' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:488:1: ( ( rule__Feature__IsManyAssignment_1_0 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:488:1: ( ( rule__Feature__IsManyAssignment_1_0 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:489:1: ( rule__Feature__IsManyAssignment_1_0 )
                    {
                     before(grammarAccess.getFeatureAccess().getIsManyAssignment_1_0()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:490:1: ( rule__Feature__IsManyAssignment_1_0 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:490:2: rule__Feature__IsManyAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Feature__IsManyAssignment_1_0_in_rule__Feature__Alternatives_1972);
                    rule__Feature__IsManyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getIsManyAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:494:6: ( '=' )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:494:6: ( '=' )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:495:1: '='
                    {
                     before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__Feature__Alternatives_1991); 
                     after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Feature__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:507:1: rule__Value__Alternatives : ( ( ruleTerminalExpression ) | ( ruleReference ) | ( ruleContainment ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:511:1: ( ( ruleTerminalExpression ) | ( ruleReference ) | ( ruleContainment ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==17||(LA2_0>=19 && LA2_0<=20)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 16:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==11||LA2_4==18) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==15) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 15:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:512:1: ( ruleTerminalExpression )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:512:1: ( ruleTerminalExpression )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:513:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getValueAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rule__Value__Alternatives1025);
                    ruleTerminalExpression();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:518:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:518:6: ( ruleReference )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:519:1: ruleReference
                    {
                     before(grammarAccess.getValueAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__Value__Alternatives1042);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:524:6: ( ruleContainment )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:524:6: ( ruleContainment )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:525:1: ruleContainment
                    {
                     before(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleContainment_in_rule__Value__Alternatives1059);
                    ruleContainment();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getContainmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:535:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__ThisAssignment_0 ) ) | ( ( rule__TerminalExpression__NewAssignment_1 ) ) | ( ( rule__TerminalExpression__IntAssignment_2 ) ) | ( ( rule__TerminalExpression__StringAssignment_3 ) ) | ( ( rule__TerminalExpression__NullAssignment_4 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:539:1: ( ( ( rule__TerminalExpression__ThisAssignment_0 ) ) | ( ( rule__TerminalExpression__NewAssignment_1 ) ) | ( ( rule__TerminalExpression__IntAssignment_2 ) ) | ( ( rule__TerminalExpression__StringAssignment_3 ) ) | ( ( rule__TerminalExpression__NullAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            case RULE_STRING:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:540:1: ( ( rule__TerminalExpression__ThisAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:540:1: ( ( rule__TerminalExpression__ThisAssignment_0 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:541:1: ( rule__TerminalExpression__ThisAssignment_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getThisAssignment_0()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:542:1: ( rule__TerminalExpression__ThisAssignment_0 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:542:2: rule__TerminalExpression__ThisAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__ThisAssignment_0_in_rule__TerminalExpression__Alternatives1091);
                    rule__TerminalExpression__ThisAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getThisAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:546:6: ( ( rule__TerminalExpression__NewAssignment_1 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:546:6: ( ( rule__TerminalExpression__NewAssignment_1 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:547:1: ( rule__TerminalExpression__NewAssignment_1 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNewAssignment_1()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:548:1: ( rule__TerminalExpression__NewAssignment_1 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:548:2: rule__TerminalExpression__NewAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__NewAssignment_1_in_rule__TerminalExpression__Alternatives1109);
                    rule__TerminalExpression__NewAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getNewAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:552:6: ( ( rule__TerminalExpression__IntAssignment_2 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:552:6: ( ( rule__TerminalExpression__IntAssignment_2 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:553:1: ( rule__TerminalExpression__IntAssignment_2 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getIntAssignment_2()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:554:1: ( rule__TerminalExpression__IntAssignment_2 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:554:2: rule__TerminalExpression__IntAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__IntAssignment_2_in_rule__TerminalExpression__Alternatives1127);
                    rule__TerminalExpression__IntAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getIntAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:558:6: ( ( rule__TerminalExpression__StringAssignment_3 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:558:6: ( ( rule__TerminalExpression__StringAssignment_3 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:559:1: ( rule__TerminalExpression__StringAssignment_3 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getStringAssignment_3()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:560:1: ( rule__TerminalExpression__StringAssignment_3 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:560:2: rule__TerminalExpression__StringAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__StringAssignment_3_in_rule__TerminalExpression__Alternatives1145);
                    rule__TerminalExpression__StringAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getStringAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:564:6: ( ( rule__TerminalExpression__NullAssignment_4 ) )
                    {
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:564:6: ( ( rule__TerminalExpression__NullAssignment_4 ) )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:565:1: ( rule__TerminalExpression__NullAssignment_4 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNullAssignment_4()); 
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:566:1: ( rule__TerminalExpression__NullAssignment_4 )
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:566:2: rule__TerminalExpression__NullAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__NullAssignment_4_in_rule__TerminalExpression__Alternatives1163);
                    rule__TerminalExpression__NullAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getNullAssignment_4()); 

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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__Factory__Group__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:577:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:581:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:582:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01194);
            rule__Factory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01197);
            rule__Factory__Group__1();

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
    // $ANTLR end "rule__Factory__Group__0"


    // $ANTLR start "rule__Factory__Group__0__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:589:1: rule__Factory__Group__0__Impl : ( ( rule__Factory__ImportsAssignment_0 )* ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:593:1: ( ( ( rule__Factory__ImportsAssignment_0 )* ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:594:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:594:1: ( ( rule__Factory__ImportsAssignment_0 )* )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:595:1: ( rule__Factory__ImportsAssignment_0 )*
            {
             before(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:596:1: ( rule__Factory__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:596:2: rule__Factory__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1224);
            	    rule__Factory__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__0__Impl"


    // $ANTLR start "rule__Factory__Group__1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:606:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:610:1: ( rule__Factory__Group__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:611:2: rule__Factory__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11255);
            rule__Factory__Group__1__Impl();

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
    // $ANTLR end "rule__Factory__Group__1"


    // $ANTLR start "rule__Factory__Group__1__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:617:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__RootAssignment_1 ) ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:621:1: ( ( ( rule__Factory__RootAssignment_1 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:622:1: ( ( rule__Factory__RootAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:622:1: ( ( rule__Factory__RootAssignment_1 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:623:1: ( rule__Factory__RootAssignment_1 )
            {
             before(grammarAccess.getFactoryAccess().getRootAssignment_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:624:1: ( rule__Factory__RootAssignment_1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:624:2: rule__Factory__RootAssignment_1
            {
            pushFollow(FOLLOW_rule__Factory__RootAssignment_1_in_rule__Factory__Group__1__Impl1282);
            rule__Factory__RootAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getRootAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:638:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:642:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:643:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01316);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01319);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:650:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:654:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:655:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:655:1: ( 'import' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:656:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl1347); 
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:669:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:673:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:674:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11378);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:680:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:684:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:685:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:685:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:686:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:687:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:687:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1405);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:701:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:705:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:706:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01439);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01442);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:713:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:717:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:718:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:718:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:719:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1469);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:730:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:734:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:735:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11498);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:741:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:745:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:746:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:746:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:747:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:748:1: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:749:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1527); 

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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:764:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:768:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:769:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01564);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01567);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:776:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:780:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:781:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:781:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:782:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1594); 
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:793:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:797:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:798:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11623);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:804:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:808:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:809:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:809:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:810:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:811:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:811:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1650);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:825:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:829:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:830:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01685);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01688);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:837:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:841:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:842:1: ( '.' )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:842:1: ( '.' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:843:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1716); 
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:856:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:860:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:861:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11747);
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
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:867:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:871:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:872:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:872:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:873:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1774); 
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


    // $ANTLR start "rule__Feature__Group__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:888:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:892:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:893:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01807);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01810);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:900:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__EFeatureAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:904:1: ( ( ( rule__Feature__EFeatureAssignment_0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:905:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:905:1: ( ( rule__Feature__EFeatureAssignment_0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:906:1: ( rule__Feature__EFeatureAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:907:1: ( rule__Feature__EFeatureAssignment_0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:907:2: rule__Feature__EFeatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl1837);
            rule__Feature__EFeatureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getEFeatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:917:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:921:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:922:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11867);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11870);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:929:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__Alternatives_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:933:1: ( ( ( rule__Feature__Alternatives_1 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:934:1: ( ( rule__Feature__Alternatives_1 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:934:1: ( ( rule__Feature__Alternatives_1 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:935:1: ( rule__Feature__Alternatives_1 )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:936:1: ( rule__Feature__Alternatives_1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:936:2: rule__Feature__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_1_in_rule__Feature__Group__1__Impl1897);
            rule__Feature__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:946:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:950:1: ( rule__Feature__Group__2__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:951:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21927);
            rule__Feature__Group__2__Impl();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:957:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:961:1: ( ( ( rule__Feature__ValueAssignment_2 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:962:1: ( ( rule__Feature__ValueAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:962:1: ( ( rule__Feature__ValueAssignment_2 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:963:1: ( rule__Feature__ValueAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:964:1: ( rule__Feature__ValueAssignment_2 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:964:2: rule__Feature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1954);
            rule__Feature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__NewObject__Group__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:980:1: rule__NewObject__Group__0 : rule__NewObject__Group__0__Impl rule__NewObject__Group__1 ;
    public final void rule__NewObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:984:1: ( rule__NewObject__Group__0__Impl rule__NewObject__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:985:2: rule__NewObject__Group__0__Impl rule__NewObject__Group__1
            {
            pushFollow(FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__01990);
            rule__NewObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__01993);
            rule__NewObject__Group__1();

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
    // $ANTLR end "rule__NewObject__Group__0"


    // $ANTLR start "rule__NewObject__Group__0__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:992:1: rule__NewObject__Group__0__Impl : ( ( rule__NewObject__EClassAssignment_0 ) ) ;
    public final void rule__NewObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:996:1: ( ( ( rule__NewObject__EClassAssignment_0 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:997:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:997:1: ( ( rule__NewObject__EClassAssignment_0 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:998:1: ( rule__NewObject__EClassAssignment_0 )
            {
             before(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:999:1: ( rule__NewObject__EClassAssignment_0 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:999:2: rule__NewObject__EClassAssignment_0
            {
            pushFollow(FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2020);
            rule__NewObject__EClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNewObjectAccess().getEClassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__0__Impl"


    // $ANTLR start "rule__NewObject__Group__1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1009:1: rule__NewObject__Group__1 : rule__NewObject__Group__1__Impl rule__NewObject__Group__2 ;
    public final void rule__NewObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1013:1: ( rule__NewObject__Group__1__Impl rule__NewObject__Group__2 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1014:2: rule__NewObject__Group__1__Impl rule__NewObject__Group__2
            {
            pushFollow(FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12050);
            rule__NewObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12053);
            rule__NewObject__Group__2();

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
    // $ANTLR end "rule__NewObject__Group__1"


    // $ANTLR start "rule__NewObject__Group__1__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1021:1: rule__NewObject__Group__1__Impl : ( ( rule__NewObject__NameAssignment_1 )? ) ;
    public final void rule__NewObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1025:1: ( ( ( rule__NewObject__NameAssignment_1 )? ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1026:1: ( ( rule__NewObject__NameAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1026:1: ( ( rule__NewObject__NameAssignment_1 )? )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1027:1: ( rule__NewObject__NameAssignment_1 )?
            {
             before(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1028:1: ( rule__NewObject__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1028:2: rule__NewObject__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2080);
                    rule__NewObject__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__1__Impl"


    // $ANTLR start "rule__NewObject__Group__2"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1038:1: rule__NewObject__Group__2 : rule__NewObject__Group__2__Impl rule__NewObject__Group__3 ;
    public final void rule__NewObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1042:1: ( rule__NewObject__Group__2__Impl rule__NewObject__Group__3 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1043:2: rule__NewObject__Group__2__Impl rule__NewObject__Group__3
            {
            pushFollow(FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22111);
            rule__NewObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22114);
            rule__NewObject__Group__3();

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
    // $ANTLR end "rule__NewObject__Group__2"


    // $ANTLR start "rule__NewObject__Group__2__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1050:1: rule__NewObject__Group__2__Impl : ( '{' ) ;
    public final void rule__NewObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1054:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1055:1: ( '{' )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1055:1: ( '{' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1056:1: '{'
            {
             before(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__NewObject__Group__2__Impl2142); 
             after(grammarAccess.getNewObjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__2__Impl"


    // $ANTLR start "rule__NewObject__Group__3"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1069:1: rule__NewObject__Group__3 : rule__NewObject__Group__3__Impl rule__NewObject__Group__4 ;
    public final void rule__NewObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1073:1: ( rule__NewObject__Group__3__Impl rule__NewObject__Group__4 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1074:2: rule__NewObject__Group__3__Impl rule__NewObject__Group__4
            {
            pushFollow(FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32173);
            rule__NewObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32176);
            rule__NewObject__Group__4();

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
    // $ANTLR end "rule__NewObject__Group__3"


    // $ANTLR start "rule__NewObject__Group__3__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1081:1: rule__NewObject__Group__3__Impl : ( ( rule__NewObject__FeaturesAssignment_3 )* ) ;
    public final void rule__NewObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1085:1: ( ( ( rule__NewObject__FeaturesAssignment_3 )* ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1086:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1086:1: ( ( rule__NewObject__FeaturesAssignment_3 )* )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1087:1: ( rule__NewObject__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1088:1: ( rule__NewObject__FeaturesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1088:2: rule__NewObject__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2203);
            	    rule__NewObject__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getNewObjectAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__3__Impl"


    // $ANTLR start "rule__NewObject__Group__4"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1098:1: rule__NewObject__Group__4 : rule__NewObject__Group__4__Impl ;
    public final void rule__NewObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1102:1: ( rule__NewObject__Group__4__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1103:2: rule__NewObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42234);
            rule__NewObject__Group__4__Impl();

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
    // $ANTLR end "rule__NewObject__Group__4"


    // $ANTLR start "rule__NewObject__Group__4__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1109:1: rule__NewObject__Group__4__Impl : ( '}' ) ;
    public final void rule__NewObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1113:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1114:1: ( '}' )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1114:1: ( '}' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1115:1: '}'
            {
             before(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__NewObject__Group__4__Impl2262); 
             after(grammarAccess.getNewObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__Group__4__Impl"


    // $ANTLR start "rule__New__Group__0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1139:1: rule__New__Group__0 : rule__New__Group__0__Impl rule__New__Group__1 ;
    public final void rule__New__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1143:1: ( rule__New__Group__0__Impl rule__New__Group__1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1144:2: rule__New__Group__0__Impl rule__New__Group__1
            {
            pushFollow(FOLLOW_rule__New__Group__0__Impl_in_rule__New__Group__02304);
            rule__New__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__1_in_rule__New__Group__02307);
            rule__New__Group__1();

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
    // $ANTLR end "rule__New__Group__0"


    // $ANTLR start "rule__New__Group__0__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1151:1: rule__New__Group__0__Impl : ( 'new' ) ;
    public final void rule__New__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1155:1: ( ( 'new' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1156:1: ( 'new' )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1156:1: ( 'new' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1157:1: 'new'
            {
             before(grammarAccess.getNewAccess().getNewKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__New__Group__0__Impl2335); 
             after(grammarAccess.getNewAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__New__Group__0__Impl"


    // $ANTLR start "rule__New__Group__1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1170:1: rule__New__Group__1 : rule__New__Group__1__Impl ;
    public final void rule__New__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1174:1: ( rule__New__Group__1__Impl )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1175:2: rule__New__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__New__Group__1__Impl_in_rule__New__Group__12366);
            rule__New__Group__1__Impl();

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
    // $ANTLR end "rule__New__Group__1"


    // $ANTLR start "rule__New__Group__1__Impl"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1181:1: rule__New__Group__1__Impl : ( ( rule__New__TypeAssignment_1 ) ) ;
    public final void rule__New__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1185:1: ( ( ( rule__New__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1186:1: ( ( rule__New__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1186:1: ( ( rule__New__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1187:1: ( rule__New__TypeAssignment_1 )
            {
             before(grammarAccess.getNewAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1188:1: ( rule__New__TypeAssignment_1 )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1188:2: rule__New__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__New__TypeAssignment_1_in_rule__New__Group__1__Impl2393);
            rule__New__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__New__Group__1__Impl"


    // $ANTLR start "rule__Factory__ImportsAssignment_0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1203:1: rule__Factory__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Factory__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1207:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1208:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1208:1: ( ruleImport )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1209:1: ruleImport
            {
             before(grammarAccess.getFactoryAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Factory__ImportsAssignment_02432);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__ImportsAssignment_0"


    // $ANTLR start "rule__Factory__RootAssignment_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1218:1: rule__Factory__RootAssignment_1 : ( ruleNewObject ) ;
    public final void rule__Factory__RootAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1222:1: ( ( ruleNewObject ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1223:1: ( ruleNewObject )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1223:1: ( ruleNewObject )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1224:1: ruleNewObject
            {
             before(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_12463);
            ruleNewObject();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getRootNewObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__RootAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1233:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1237:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1238:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1238:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1239:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_12494);
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


    // $ANTLR start "rule__Feature__EFeatureAssignment_0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1248:1: rule__Feature__EFeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__EFeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1252:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1253:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1253:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1254:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getEFeatureStructuralFeatureCrossReference_0_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1255:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1256:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getEFeatureStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_02529); 
             after(grammarAccess.getFeatureAccess().getEFeatureStructuralFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getEFeatureStructuralFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__EFeatureAssignment_0"


    // $ANTLR start "rule__Feature__IsManyAssignment_1_0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1267:1: rule__Feature__IsManyAssignment_1_0 : ( ( '+=' ) ) ;
    public final void rule__Feature__IsManyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1271:1: ( ( ( '+=' ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1272:1: ( ( '+=' ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1272:1: ( ( '+=' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1273:1: ( '+=' )
            {
             before(grammarAccess.getFeatureAccess().getIsManyPlusSignEqualsSignKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1274:1: ( '+=' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1275:1: '+='
            {
             before(grammarAccess.getFeatureAccess().getIsManyPlusSignEqualsSignKeyword_1_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Feature__IsManyAssignment_1_02569); 
             after(grammarAccess.getFeatureAccess().getIsManyPlusSignEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIsManyPlusSignEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IsManyAssignment_1_0"


    // $ANTLR start "rule__Feature__ValueAssignment_2"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1290:1: rule__Feature__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1294:1: ( ( ruleValue ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1295:1: ( ruleValue )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1295:1: ( ruleValue )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1296:1: ruleValue
            {
             before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_22608);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ValueAssignment_2"


    // $ANTLR start "rule__NewObject__EClassAssignment_0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1305:1: rule__NewObject__EClassAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NewObject__EClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1309:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1310:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1310:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1311:1: ( RULE_ID )
            {
             before(grammarAccess.getNewObjectAccess().getEClassEntityCrossReference_0_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1312:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1313:1: RULE_ID
            {
             before(grammarAccess.getNewObjectAccess().getEClassEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewObject__EClassAssignment_02643); 
             after(grammarAccess.getNewObjectAccess().getEClassEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNewObjectAccess().getEClassEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__EClassAssignment_0"


    // $ANTLR start "rule__NewObject__NameAssignment_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1324:1: rule__NewObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1328:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1329:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1329:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1330:1: RULE_ID
            {
             before(grammarAccess.getNewObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewObject__NameAssignment_12678); 
             after(grammarAccess.getNewObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__NameAssignment_1"


    // $ANTLR start "rule__NewObject__FeaturesAssignment_3"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1339:1: rule__NewObject__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__NewObject__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1343:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1344:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1344:1: ( ruleFeature )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1345:1: ruleFeature
            {
             before(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_32709);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getNewObjectAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewObject__FeaturesAssignment_3"


    // $ANTLR start "rule__Reference__ValueAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1354:1: rule__Reference__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Reference__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1358:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1359:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1359:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1360:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1361:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1362:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getValueEObjectIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__ValueAssignment2744); 
             after(grammarAccess.getReferenceAccess().getValueEObjectIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getValueEObjectCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ValueAssignment"


    // $ANTLR start "rule__Containment__ValueAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1373:1: rule__Containment__ValueAssignment : ( ruleNewObject ) ;
    public final void rule__Containment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1377:1: ( ( ruleNewObject ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1378:1: ( ruleNewObject )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1378:1: ( ruleNewObject )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1379:1: ruleNewObject
            {
             before(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment2779);
            ruleNewObject();

            state._fsp--;

             after(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Containment__ValueAssignment"


    // $ANTLR start "rule__TerminalExpression__ThisAssignment_0"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1389:1: rule__TerminalExpression__ThisAssignment_0 : ( ruleThis ) ;
    public final void rule__TerminalExpression__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1393:1: ( ( ruleThis ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1394:1: ( ruleThis )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1394:1: ( ruleThis )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1395:1: ruleThis
            {
             before(grammarAccess.getTerminalExpressionAccess().getThisThisParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleThis_in_rule__TerminalExpression__ThisAssignment_02811);
            ruleThis();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getThisThisParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__ThisAssignment_0"


    // $ANTLR start "rule__TerminalExpression__NewAssignment_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1404:1: rule__TerminalExpression__NewAssignment_1 : ( ruleNew ) ;
    public final void rule__TerminalExpression__NewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1408:1: ( ( ruleNew ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1409:1: ( ruleNew )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1409:1: ( ruleNew )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1410:1: ruleNew
            {
             before(grammarAccess.getTerminalExpressionAccess().getNewNewParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNew_in_rule__TerminalExpression__NewAssignment_12842);
            ruleNew();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getNewNewParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__NewAssignment_1"


    // $ANTLR start "rule__TerminalExpression__IntAssignment_2"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1419:1: rule__TerminalExpression__IntAssignment_2 : ( ruleIntero ) ;
    public final void rule__TerminalExpression__IntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1423:1: ( ( ruleIntero ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1424:1: ( ruleIntero )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1424:1: ( ruleIntero )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1425:1: ruleIntero
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntInteroParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntero_in_rule__TerminalExpression__IntAssignment_22873);
            ruleIntero();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getIntInteroParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__IntAssignment_2"


    // $ANTLR start "rule__TerminalExpression__StringAssignment_3"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1434:1: rule__TerminalExpression__StringAssignment_3 : ( ruleStringa ) ;
    public final void rule__TerminalExpression__StringAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1438:1: ( ( ruleStringa ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1439:1: ( ruleStringa )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1439:1: ( ruleStringa )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1440:1: ruleStringa
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringStringaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStringa_in_rule__TerminalExpression__StringAssignment_32904);
            ruleStringa();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getStringStringaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__StringAssignment_3"


    // $ANTLR start "rule__TerminalExpression__NullAssignment_4"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1449:1: rule__TerminalExpression__NullAssignment_4 : ( ruleNullo ) ;
    public final void rule__TerminalExpression__NullAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1453:1: ( ( ruleNullo ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1454:1: ( ruleNullo )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1454:1: ( ruleNullo )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1455:1: ruleNullo
            {
             before(grammarAccess.getTerminalExpressionAccess().getNullNulloParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNullo_in_rule__TerminalExpression__NullAssignment_42935);
            ruleNullo();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getNullNulloParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__NullAssignment_4"


    // $ANTLR start "rule__This__VariableAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1464:1: rule__This__VariableAssignment : ( ( 'this' ) ) ;
    public final void rule__This__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1468:1: ( ( ( 'this' ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1469:1: ( ( 'this' ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1469:1: ( ( 'this' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1470:1: ( 'this' )
            {
             before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1471:1: ( 'this' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1472:1: 'this'
            {
             before(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__This__VariableAssignment2971); 
             after(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 

            }

             after(grammarAccess.getThisAccess().getVariableThisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__This__VariableAssignment"


    // $ANTLR start "rule__New__TypeAssignment_1"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1487:1: rule__New__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__New__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1491:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1492:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1492:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1493:1: ( RULE_ID )
            {
             before(grammarAccess.getNewAccess().getTypeEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1494:1: ( RULE_ID )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1495:1: RULE_ID
            {
             before(grammarAccess.getNewAccess().getTypeEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__New__TypeAssignment_13014); 
             after(grammarAccess.getNewAccess().getTypeEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNewAccess().getTypeEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__New__TypeAssignment_1"


    // $ANTLR start "rule__Intero__ValueAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1506:1: rule__Intero__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Intero__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1510:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1511:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1511:1: ( RULE_INT )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1512:1: RULE_INT
            {
             before(grammarAccess.getInteroAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Intero__ValueAssignment3049); 
             after(grammarAccess.getInteroAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intero__ValueAssignment"


    // $ANTLR start "rule__Stringa__ValueAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1521:1: rule__Stringa__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Stringa__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1525:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1526:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1526:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1527:1: RULE_STRING
            {
             before(grammarAccess.getStringaAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Stringa__ValueAssignment3080); 
             after(grammarAccess.getStringaAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stringa__ValueAssignment"


    // $ANTLR start "rule__Nullo__ValueAssignment"
    // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1536:1: rule__Nullo__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__Nullo__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1540:1: ( ( ( 'null' ) ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1541:1: ( ( 'null' ) )
            {
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1541:1: ( ( 'null' ) )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1542:1: ( 'null' )
            {
             before(grammarAccess.getNulloAccess().getValueNullKeyword_0()); 
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1543:1: ( 'null' )
            // ../fr.chaunier.xtext.instance.om.ui/src-gen/fr/chaunier/xtext/instance/om/ui/contentassist/antlr/internal/InternalInstanceDsl.g:1544:1: 'null'
            {
             before(grammarAccess.getNulloAccess().getValueNullKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Nullo__ValueAssignment3116); 
             after(grammarAccess.getNulloAccess().getValueNullKeyword_0()); 

            }

             after(grammarAccess.getNulloAccess().getValueNullKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nullo__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFactory_in_entryRuleFactory61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactory68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0_in_ruleFactory94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_entryRuleNewObject361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewObject368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0_in_ruleNewObject394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ValueAssignment_in_ruleReference514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_entryRuleContainment541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Containment__ValueAssignment_in_ruleContainment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_entryRuleThis663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThis670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__This__VariableAssignment_in_ruleThis696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__0_in_ruleNew756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntero_in_entryRuleIntero783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntero790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intero__ValueAssignment_in_ruleIntero816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringa_in_entryRuleStringa843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringa850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stringa__ValueAssignment_in_ruleStringa876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullo_in_entryRuleNullo903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullo910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nullo__ValueAssignment_in_ruleNullo936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__IsManyAssignment_1_0_in_rule__Feature__Alternatives_1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Feature__Alternatives_1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__Value__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Value__Alternatives1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainment_in_rule__Value__Alternatives1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ThisAssignment_0_in_rule__TerminalExpression__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__NewAssignment_1_in_rule__TerminalExpression__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__IntAssignment_2_in_rule__TerminalExpression__Alternatives1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__StringAssignment_3_in_rule__TerminalExpression__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__NullAssignment_4_in_rule__TerminalExpression__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__Group__0__Impl_in_rule__Factory__Group__01194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Factory__Group__1_in_rule__Factory__Group__01197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__ImportsAssignment_0_in_rule__Factory__Group__0__Impl1224 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Factory__Group__1__Impl_in_rule__Factory__Group__11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factory__RootAssignment_1_in_rule__Factory__Group__1__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01439 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01564 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1650 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01807 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__EFeatureAssignment_0_in_rule__Feature__Group__0__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11867 = new BitSet(new long[]{0x00000000001A0070L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_1_in_rule__Feature__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__0__Impl_in_rule__NewObject__Group__01990 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1_in_rule__NewObject__Group__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__EClassAssignment_0_in_rule__NewObject__Group__0__Impl2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__1__Impl_in_rule__NewObject__Group__12050 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2_in_rule__NewObject__Group__12053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__NameAssignment_1_in_rule__NewObject__Group__1__Impl2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__2__Impl_in_rule__NewObject__Group__22111 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3_in_rule__NewObject__Group__22114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NewObject__Group__2__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__Group__3__Impl_in_rule__NewObject__Group__32173 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4_in_rule__NewObject__Group__32176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewObject__FeaturesAssignment_3_in_rule__NewObject__Group__3__Impl2203 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NewObject__Group__4__Impl_in_rule__NewObject__Group__42234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NewObject__Group__4__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__0__Impl_in_rule__New__Group__02304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__New__Group__1_in_rule__New__Group__02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__New__Group__0__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__1__Impl_in_rule__New__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__TypeAssignment_1_in_rule__New__Group__1__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Factory__ImportsAssignment_02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Factory__RootAssignment_12463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__EFeatureAssignment_02529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__IsManyAssignment_1_02569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Feature__ValueAssignment_22608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewObject__EClassAssignment_02643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewObject__NameAssignment_12678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__NewObject__FeaturesAssignment_32709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__ValueAssignment2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewObject_in_rule__Containment__ValueAssignment2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThis_in_rule__TerminalExpression__ThisAssignment_02811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_rule__TerminalExpression__NewAssignment_12842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntero_in_rule__TerminalExpression__IntAssignment_22873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringa_in_rule__TerminalExpression__StringAssignment_32904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullo_in_rule__TerminalExpression__NullAssignment_42935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__This__VariableAssignment2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__New__TypeAssignment_13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Intero__ValueAssignment3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Stringa__ValueAssignment3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Nullo__ValueAssignment3116 = new BitSet(new long[]{0x0000000000000002L});

}