package fr.chaunier.xtext.archi.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.archi.services.AdslDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdslDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'system'", "'{'", "'}'", "'using'", "';'", "'component'", "'provides'", "':'", "'requires'", "'interface'", "'oneway'", "'rr'", "'request'", "'='", "'reply'", "'('", "')'", "','", "'mandatory'", "'toMany'"
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
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
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


        public InternalAdslDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdslDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdslDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g"; }


     
     	private AdslDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AdslDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleArchiModel"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:61:1: entryRuleArchiModel : ruleArchiModel EOF ;
    public final void entryRuleArchiModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:62:1: ( ruleArchiModel EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:63:1: ruleArchiModel EOF
            {
             before(grammarAccess.getArchiModelRule()); 
            pushFollow(FOLLOW_ruleArchiModel_in_entryRuleArchiModel61);
            ruleArchiModel();

            state._fsp--;

             after(grammarAccess.getArchiModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchiModel68); 

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
    // $ANTLR end "entryRuleArchiModel"


    // $ANTLR start "ruleArchiModel"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:70:1: ruleArchiModel : ( ( rule__ArchiModel__Group__0 ) ) ;
    public final void ruleArchiModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:74:2: ( ( ( rule__ArchiModel__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:75:1: ( ( rule__ArchiModel__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:75:1: ( ( rule__ArchiModel__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:76:1: ( rule__ArchiModel__Group__0 )
            {
             before(grammarAccess.getArchiModelAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:77:1: ( rule__ArchiModel__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:77:2: rule__ArchiModel__Group__0
            {
            pushFollow(FOLLOW_rule__ArchiModel__Group__0_in_ruleArchiModel94);
            rule__ArchiModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchiModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchiModel"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:90:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:91:1: ruleImport EOF
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:105:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:105:2: rule__Import__Group__0
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:117:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:118:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:119:1: ruleQualifiedNameWithWildCard EOF
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:126:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:130:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:131:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:132:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:133:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:133:2: rule__QualifiedNameWithWildCard__Group__0
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:146:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:147:1: ruleQualifiedName EOF
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:161:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleSystem"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:173:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:174:1: ( ruleSystem EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:175:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem301);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem308); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:182:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:186:2: ( ( ( rule__System__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:187:1: ( ( rule__System__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:187:1: ( ( rule__System__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:188:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:189:1: ( rule__System__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:189:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem334);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleUsing"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:201:1: entryRuleUsing : ruleUsing EOF ;
    public final void entryRuleUsing() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:202:1: ( ruleUsing EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:203:1: ruleUsing EOF
            {
             before(grammarAccess.getUsingRule()); 
            pushFollow(FOLLOW_ruleUsing_in_entryRuleUsing361);
            ruleUsing();

            state._fsp--;

             after(grammarAccess.getUsingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsing368); 

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
    // $ANTLR end "entryRuleUsing"


    // $ANTLR start "ruleUsing"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:210:1: ruleUsing : ( ( rule__Using__Group__0 ) ) ;
    public final void ruleUsing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:214:2: ( ( ( rule__Using__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:215:1: ( ( rule__Using__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:215:1: ( ( rule__Using__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:216:1: ( rule__Using__Group__0 )
            {
             before(grammarAccess.getUsingAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:217:1: ( rule__Using__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:217:2: rule__Using__Group__0
            {
            pushFollow(FOLLOW_rule__Using__Group__0_in_ruleUsing394);
            rule__Using__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsing"


    // $ANTLR start "entryRuleComponent"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:229:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:230:1: ( ruleComponent EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:231:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent421);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent428); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:238:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:242:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:243:1: ( ( rule__Component__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:243:1: ( ( rule__Component__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:244:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:245:1: ( rule__Component__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:245:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent454);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:257:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:258:1: ( rulePort EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:259:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort481);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort488); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:266:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:270:2: ( ( ( rule__Port__Alternatives ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:271:1: ( ( rule__Port__Alternatives ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:271:1: ( ( rule__Port__Alternatives ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:272:1: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:273:1: ( rule__Port__Alternatives )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:273:2: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_rule__Port__Alternatives_in_rulePort514);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProvidedPort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:285:1: entryRuleProvidedPort : ruleProvidedPort EOF ;
    public final void entryRuleProvidedPort() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:286:1: ( ruleProvidedPort EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:287:1: ruleProvidedPort EOF
            {
             before(grammarAccess.getProvidedPortRule()); 
            pushFollow(FOLLOW_ruleProvidedPort_in_entryRuleProvidedPort541);
            ruleProvidedPort();

            state._fsp--;

             after(grammarAccess.getProvidedPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedPort548); 

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
    // $ANTLR end "entryRuleProvidedPort"


    // $ANTLR start "ruleProvidedPort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:294:1: ruleProvidedPort : ( ( rule__ProvidedPort__Group__0 ) ) ;
    public final void ruleProvidedPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:298:2: ( ( ( rule__ProvidedPort__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:299:1: ( ( rule__ProvidedPort__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:299:1: ( ( rule__ProvidedPort__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:300:1: ( rule__ProvidedPort__Group__0 )
            {
             before(grammarAccess.getProvidedPortAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:301:1: ( rule__ProvidedPort__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:301:2: rule__ProvidedPort__Group__0
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__0_in_ruleProvidedPort574);
            rule__ProvidedPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedPort"


    // $ANTLR start "entryRuleRequiredPort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:313:1: entryRuleRequiredPort : ruleRequiredPort EOF ;
    public final void entryRuleRequiredPort() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:314:1: ( ruleRequiredPort EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:315:1: ruleRequiredPort EOF
            {
             before(grammarAccess.getRequiredPortRule()); 
            pushFollow(FOLLOW_ruleRequiredPort_in_entryRuleRequiredPort601);
            ruleRequiredPort();

            state._fsp--;

             after(grammarAccess.getRequiredPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredPort608); 

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
    // $ANTLR end "entryRuleRequiredPort"


    // $ANTLR start "ruleRequiredPort"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:322:1: ruleRequiredPort : ( ( rule__RequiredPort__Group__0 ) ) ;
    public final void ruleRequiredPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:326:2: ( ( ( rule__RequiredPort__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:327:1: ( ( rule__RequiredPort__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:327:1: ( ( rule__RequiredPort__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:328:1: ( rule__RequiredPort__Group__0 )
            {
             before(grammarAccess.getRequiredPortAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:329:1: ( rule__RequiredPort__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:329:2: rule__RequiredPort__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__0_in_ruleRequiredPort634);
            rule__RequiredPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredPort"


    // $ANTLR start "entryRuleInterface"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:341:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:342:1: ( ruleInterface EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:343:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface661);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface668); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:350:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:354:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:355:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:355:1: ( ( rule__Interface__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:356:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:357:1: ( rule__Interface__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:357:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface694);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleMessageInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:369:1: entryRuleMessageInteraction : ruleMessageInteraction EOF ;
    public final void entryRuleMessageInteraction() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:370:1: ( ruleMessageInteraction EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:371:1: ruleMessageInteraction EOF
            {
             before(grammarAccess.getMessageInteractionRule()); 
            pushFollow(FOLLOW_ruleMessageInteraction_in_entryRuleMessageInteraction721);
            ruleMessageInteraction();

            state._fsp--;

             after(grammarAccess.getMessageInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageInteraction728); 

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
    // $ANTLR end "entryRuleMessageInteraction"


    // $ANTLR start "ruleMessageInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:378:1: ruleMessageInteraction : ( ( rule__MessageInteraction__Alternatives ) ) ;
    public final void ruleMessageInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:382:2: ( ( ( rule__MessageInteraction__Alternatives ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:383:1: ( ( rule__MessageInteraction__Alternatives ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:383:1: ( ( rule__MessageInteraction__Alternatives ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:384:1: ( rule__MessageInteraction__Alternatives )
            {
             before(grammarAccess.getMessageInteractionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:385:1: ( rule__MessageInteraction__Alternatives )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:385:2: rule__MessageInteraction__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageInteraction__Alternatives_in_ruleMessageInteraction754);
            rule__MessageInteraction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageInteractionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageInteraction"


    // $ANTLR start "entryRuleOnewayInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:397:1: entryRuleOnewayInteraction : ruleOnewayInteraction EOF ;
    public final void entryRuleOnewayInteraction() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:398:1: ( ruleOnewayInteraction EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:399:1: ruleOnewayInteraction EOF
            {
             before(grammarAccess.getOnewayInteractionRule()); 
            pushFollow(FOLLOW_ruleOnewayInteraction_in_entryRuleOnewayInteraction781);
            ruleOnewayInteraction();

            state._fsp--;

             after(grammarAccess.getOnewayInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnewayInteraction788); 

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
    // $ANTLR end "entryRuleOnewayInteraction"


    // $ANTLR start "ruleOnewayInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:406:1: ruleOnewayInteraction : ( ( rule__OnewayInteraction__Group__0 ) ) ;
    public final void ruleOnewayInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:410:2: ( ( ( rule__OnewayInteraction__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:411:1: ( ( rule__OnewayInteraction__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:411:1: ( ( rule__OnewayInteraction__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:412:1: ( rule__OnewayInteraction__Group__0 )
            {
             before(grammarAccess.getOnewayInteractionAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:413:1: ( rule__OnewayInteraction__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:413:2: rule__OnewayInteraction__Group__0
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__Group__0_in_ruleOnewayInteraction814);
            rule__OnewayInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnewayInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnewayInteraction"


    // $ANTLR start "entryRuleRequestReplyInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:425:1: entryRuleRequestReplyInteraction : ruleRequestReplyInteraction EOF ;
    public final void entryRuleRequestReplyInteraction() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:426:1: ( ruleRequestReplyInteraction EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:427:1: ruleRequestReplyInteraction EOF
            {
             before(grammarAccess.getRequestReplyInteractionRule()); 
            pushFollow(FOLLOW_ruleRequestReplyInteraction_in_entryRuleRequestReplyInteraction841);
            ruleRequestReplyInteraction();

            state._fsp--;

             after(grammarAccess.getRequestReplyInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestReplyInteraction848); 

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
    // $ANTLR end "entryRuleRequestReplyInteraction"


    // $ANTLR start "ruleRequestReplyInteraction"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:434:1: ruleRequestReplyInteraction : ( ( rule__RequestReplyInteraction__Group__0 ) ) ;
    public final void ruleRequestReplyInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:438:2: ( ( ( rule__RequestReplyInteraction__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:439:1: ( ( rule__RequestReplyInteraction__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:439:1: ( ( rule__RequestReplyInteraction__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:440:1: ( rule__RequestReplyInteraction__Group__0 )
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:441:1: ( rule__RequestReplyInteraction__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:441:2: rule__RequestReplyInteraction__Group__0
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__0_in_ruleRequestReplyInteraction874);
            rule__RequestReplyInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestReplyInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestReplyInteraction"


    // $ANTLR start "entryRuleMessage"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:453:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:454:1: ( ruleMessage EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:455:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage901);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage908); 

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:462:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:466:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:467:1: ( ( rule__Message__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:467:1: ( ( rule__Message__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:468:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:469:1: ( rule__Message__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:469:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage934);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageParameter"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:481:1: entryRuleMessageParameter : ruleMessageParameter EOF ;
    public final void entryRuleMessageParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:482:1: ( ruleMessageParameter EOF )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:483:1: ruleMessageParameter EOF
            {
             before(grammarAccess.getMessageParameterRule()); 
            pushFollow(FOLLOW_ruleMessageParameter_in_entryRuleMessageParameter961);
            ruleMessageParameter();

            state._fsp--;

             after(grammarAccess.getMessageParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageParameter968); 

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
    // $ANTLR end "entryRuleMessageParameter"


    // $ANTLR start "ruleMessageParameter"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:490:1: ruleMessageParameter : ( ( rule__MessageParameter__Group__0 ) ) ;
    public final void ruleMessageParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:494:2: ( ( ( rule__MessageParameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:495:1: ( ( rule__MessageParameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:495:1: ( ( rule__MessageParameter__Group__0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:496:1: ( rule__MessageParameter__Group__0 )
            {
             before(grammarAccess.getMessageParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:497:1: ( rule__MessageParameter__Group__0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:497:2: rule__MessageParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MessageParameter__Group__0_in_ruleMessageParameter994);
            rule__MessageParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageParameter"


    // $ANTLR start "rule__System__Alternatives_4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:509:1: rule__System__Alternatives_4 : ( ( ( rule__System__SubSystemsAssignment_4_0 ) ) | ( ( rule__System__ComponentsAssignment_4_1 ) ) | ( ( rule__System__InterfacesAssignment_4_2 ) ) );
    public final void rule__System__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:513:1: ( ( ( rule__System__SubSystemsAssignment_4_0 ) ) | ( ( rule__System__ComponentsAssignment_4_1 ) ) | ( ( rule__System__InterfacesAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:514:1: ( ( rule__System__SubSystemsAssignment_4_0 ) )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:514:1: ( ( rule__System__SubSystemsAssignment_4_0 ) )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:515:1: ( rule__System__SubSystemsAssignment_4_0 )
                    {
                     before(grammarAccess.getSystemAccess().getSubSystemsAssignment_4_0()); 
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:516:1: ( rule__System__SubSystemsAssignment_4_0 )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:516:2: rule__System__SubSystemsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__System__SubSystemsAssignment_4_0_in_rule__System__Alternatives_41030);
                    rule__System__SubSystemsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getSubSystemsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:520:6: ( ( rule__System__ComponentsAssignment_4_1 ) )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:520:6: ( ( rule__System__ComponentsAssignment_4_1 ) )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:521:1: ( rule__System__ComponentsAssignment_4_1 )
                    {
                     before(grammarAccess.getSystemAccess().getComponentsAssignment_4_1()); 
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:522:1: ( rule__System__ComponentsAssignment_4_1 )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:522:2: rule__System__ComponentsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__System__ComponentsAssignment_4_1_in_rule__System__Alternatives_41048);
                    rule__System__ComponentsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getComponentsAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:526:6: ( ( rule__System__InterfacesAssignment_4_2 ) )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:526:6: ( ( rule__System__InterfacesAssignment_4_2 ) )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:527:1: ( rule__System__InterfacesAssignment_4_2 )
                    {
                     before(grammarAccess.getSystemAccess().getInterfacesAssignment_4_2()); 
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:528:1: ( rule__System__InterfacesAssignment_4_2 )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:528:2: rule__System__InterfacesAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__System__InterfacesAssignment_4_2_in_rule__System__Alternatives_41066);
                    rule__System__InterfacesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSystemAccess().getInterfacesAssignment_4_2()); 

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
    // $ANTLR end "rule__System__Alternatives_4"


    // $ANTLR start "rule__Port__Alternatives"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:537:1: rule__Port__Alternatives : ( ( ruleProvidedPort ) | ( ruleRequiredPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:541:1: ( ( ruleProvidedPort ) | ( ruleRequiredPort ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:542:1: ( ruleProvidedPort )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:542:1: ( ruleProvidedPort )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:543:1: ruleProvidedPort
                    {
                     before(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProvidedPort_in_rule__Port__Alternatives1099);
                    ruleProvidedPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:548:6: ( ruleRequiredPort )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:548:6: ( ruleRequiredPort )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:549:1: ruleRequiredPort
                    {
                     before(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequiredPort_in_rule__Port__Alternatives1116);
                    ruleRequiredPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_1()); 

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
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__MessageInteraction__Alternatives"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:559:1: rule__MessageInteraction__Alternatives : ( ( ruleOnewayInteraction ) | ( ruleRequestReplyInteraction ) );
    public final void rule__MessageInteraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:563:1: ( ( ruleOnewayInteraction ) | ( ruleRequestReplyInteraction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:564:1: ( ruleOnewayInteraction )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:564:1: ( ruleOnewayInteraction )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:565:1: ruleOnewayInteraction
                    {
                     before(grammarAccess.getMessageInteractionAccess().getOnewayInteractionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOnewayInteraction_in_rule__MessageInteraction__Alternatives1148);
                    ruleOnewayInteraction();

                    state._fsp--;

                     after(grammarAccess.getMessageInteractionAccess().getOnewayInteractionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:570:6: ( ruleRequestReplyInteraction )
                    {
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:570:6: ( ruleRequestReplyInteraction )
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:571:1: ruleRequestReplyInteraction
                    {
                     before(grammarAccess.getMessageInteractionAccess().getRequestReplyInteractionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequestReplyInteraction_in_rule__MessageInteraction__Alternatives1165);
                    ruleRequestReplyInteraction();

                    state._fsp--;

                     after(grammarAccess.getMessageInteractionAccess().getRequestReplyInteractionParserRuleCall_1()); 

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
    // $ANTLR end "rule__MessageInteraction__Alternatives"


    // $ANTLR start "rule__ArchiModel__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:583:1: rule__ArchiModel__Group__0 : rule__ArchiModel__Group__0__Impl rule__ArchiModel__Group__1 ;
    public final void rule__ArchiModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:587:1: ( rule__ArchiModel__Group__0__Impl rule__ArchiModel__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:588:2: rule__ArchiModel__Group__0__Impl rule__ArchiModel__Group__1
            {
            pushFollow(FOLLOW_rule__ArchiModel__Group__0__Impl_in_rule__ArchiModel__Group__01195);
            rule__ArchiModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArchiModel__Group__1_in_rule__ArchiModel__Group__01198);
            rule__ArchiModel__Group__1();

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
    // $ANTLR end "rule__ArchiModel__Group__0"


    // $ANTLR start "rule__ArchiModel__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:595:1: rule__ArchiModel__Group__0__Impl : ( ( rule__ArchiModel__ImportsAssignment_0 )* ) ;
    public final void rule__ArchiModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:599:1: ( ( ( rule__ArchiModel__ImportsAssignment_0 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:600:1: ( ( rule__ArchiModel__ImportsAssignment_0 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:600:1: ( ( rule__ArchiModel__ImportsAssignment_0 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:601:1: ( rule__ArchiModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getArchiModelAccess().getImportsAssignment_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:602:1: ( rule__ArchiModel__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:602:2: rule__ArchiModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ArchiModel__ImportsAssignment_0_in_rule__ArchiModel__Group__0__Impl1225);
            	    rule__ArchiModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArchiModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiModel__Group__0__Impl"


    // $ANTLR start "rule__ArchiModel__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:612:1: rule__ArchiModel__Group__1 : rule__ArchiModel__Group__1__Impl ;
    public final void rule__ArchiModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:616:1: ( rule__ArchiModel__Group__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:617:2: rule__ArchiModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArchiModel__Group__1__Impl_in_rule__ArchiModel__Group__11256);
            rule__ArchiModel__Group__1__Impl();

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
    // $ANTLR end "rule__ArchiModel__Group__1"


    // $ANTLR start "rule__ArchiModel__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:623:1: rule__ArchiModel__Group__1__Impl : ( ( rule__ArchiModel__ElementsAssignment_1 )* ) ;
    public final void rule__ArchiModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:627:1: ( ( ( rule__ArchiModel__ElementsAssignment_1 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:628:1: ( ( rule__ArchiModel__ElementsAssignment_1 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:628:1: ( ( rule__ArchiModel__ElementsAssignment_1 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:629:1: ( rule__ArchiModel__ElementsAssignment_1 )*
            {
             before(grammarAccess.getArchiModelAccess().getElementsAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:630:1: ( rule__ArchiModel__ElementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:630:2: rule__ArchiModel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ArchiModel__ElementsAssignment_1_in_rule__ArchiModel__Group__1__Impl1283);
            	    rule__ArchiModel__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getArchiModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiModel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:644:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:648:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:649:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01318);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01321);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:656:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:660:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:661:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:661:1: ( 'import' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:662:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Import__Group__0__Impl1349); 
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:675:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:679:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:680:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11380);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:686:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:690:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:691:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:691:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:692:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:693:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:693:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1407);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:707:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:711:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:712:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01441);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01444);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:719:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:723:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:724:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:724:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:725:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1471);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:736:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:740:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:741:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11500);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:747:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:751:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:752:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:752:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:753:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:754:1: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:755:2: '.*'
                    {
                    match(input,12,FOLLOW_12_in_rule__QualifiedNameWithWildCard__Group__1__Impl1529); 

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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:770:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:774:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:775:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01566);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01569);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:782:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:786:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:787:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:787:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:788:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1596); 
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:799:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:803:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:804:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11625);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:810:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:814:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:815:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:815:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:816:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:817:1: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:817:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1652);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:831:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:835:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:836:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01687);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01690);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:843:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:847:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:848:1: ( '.' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:848:1: ( '.' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:849:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl1718); 
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:862:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:866:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:867:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11749);
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
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:873:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:877:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:878:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:878:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:879:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1776); 
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


    // $ANTLR start "rule__System__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:894:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:898:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:899:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01809);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__01812);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:906:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:910:1: ( ( 'system' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:911:1: ( 'system' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:911:1: ( 'system' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:912:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__System__Group__0__Impl1840); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:925:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:929:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:930:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11871);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__11874);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:937:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:941:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:942:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:942:1: ( ( rule__System__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:943:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:944:1: ( rule__System__NameAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:944:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1901);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:954:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:958:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:959:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21931);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__21934);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:966:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:970:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:971:1: ( '{' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:971:1: ( '{' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:972:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__System__Group__2__Impl1962); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:985:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:989:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:990:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31993);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__31996);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:997:1: rule__System__Group__3__Impl : ( ( rule__System__UsingsAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1001:1: ( ( ( rule__System__UsingsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1002:1: ( ( rule__System__UsingsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1002:1: ( ( rule__System__UsingsAssignment_3 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1003:1: ( rule__System__UsingsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getUsingsAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1004:1: ( rule__System__UsingsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1004:2: rule__System__UsingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__UsingsAssignment_3_in_rule__System__Group__3__Impl2023);
            	    rule__System__UsingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getUsingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1014:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1018:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1019:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__42054);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__42057);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1026:1: rule__System__Group__4__Impl : ( ( rule__System__Alternatives_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1030:1: ( ( ( rule__System__Alternatives_4 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1031:1: ( ( rule__System__Alternatives_4 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1031:1: ( ( rule__System__Alternatives_4 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1032:1: ( rule__System__Alternatives_4 )*
            {
             before(grammarAccess.getSystemAccess().getAlternatives_4()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1033:1: ( rule__System__Alternatives_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||LA9_0==19||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1033:2: rule__System__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__System__Alternatives_4_in_rule__System__Group__4__Impl2084);
            	    rule__System__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1043:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1047:1: ( rule__System__Group__5__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1048:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__52115);
            rule__System__Group__5__Impl();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1054:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1058:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1059:1: ( '}' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1059:1: ( '}' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1060:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__System__Group__5__Impl2143); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Using__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1085:1: rule__Using__Group__0 : rule__Using__Group__0__Impl rule__Using__Group__1 ;
    public final void rule__Using__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1089:1: ( rule__Using__Group__0__Impl rule__Using__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1090:2: rule__Using__Group__0__Impl rule__Using__Group__1
            {
            pushFollow(FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02186);
            rule__Using__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02189);
            rule__Using__Group__1();

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
    // $ANTLR end "rule__Using__Group__0"


    // $ANTLR start "rule__Using__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1097:1: rule__Using__Group__0__Impl : ( 'using' ) ;
    public final void rule__Using__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1101:1: ( ( 'using' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1102:1: ( 'using' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1102:1: ( 'using' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1103:1: 'using'
            {
             before(grammarAccess.getUsingAccess().getUsingKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Using__Group__0__Impl2217); 
             after(grammarAccess.getUsingAccess().getUsingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Using__Group__0__Impl"


    // $ANTLR start "rule__Using__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1116:1: rule__Using__Group__1 : rule__Using__Group__1__Impl rule__Using__Group__2 ;
    public final void rule__Using__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1120:1: ( rule__Using__Group__1__Impl rule__Using__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1121:2: rule__Using__Group__1__Impl rule__Using__Group__2
            {
            pushFollow(FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12248);
            rule__Using__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Using__Group__2_in_rule__Using__Group__12251);
            rule__Using__Group__2();

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
    // $ANTLR end "rule__Using__Group__1"


    // $ANTLR start "rule__Using__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1128:1: rule__Using__Group__1__Impl : ( ( rule__Using__SystemAssignment_1 ) ) ;
    public final void rule__Using__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1132:1: ( ( ( rule__Using__SystemAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1133:1: ( ( rule__Using__SystemAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1133:1: ( ( rule__Using__SystemAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1134:1: ( rule__Using__SystemAssignment_1 )
            {
             before(grammarAccess.getUsingAccess().getSystemAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1135:1: ( rule__Using__SystemAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1135:2: rule__Using__SystemAssignment_1
            {
            pushFollow(FOLLOW_rule__Using__SystemAssignment_1_in_rule__Using__Group__1__Impl2278);
            rule__Using__SystemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsingAccess().getSystemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Using__Group__1__Impl"


    // $ANTLR start "rule__Using__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1145:1: rule__Using__Group__2 : rule__Using__Group__2__Impl ;
    public final void rule__Using__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1149:1: ( rule__Using__Group__2__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1150:2: rule__Using__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Using__Group__2__Impl_in_rule__Using__Group__22308);
            rule__Using__Group__2__Impl();

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
    // $ANTLR end "rule__Using__Group__2"


    // $ANTLR start "rule__Using__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1156:1: rule__Using__Group__2__Impl : ( ';' ) ;
    public final void rule__Using__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1160:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1161:1: ( ';' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1161:1: ( ';' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1162:1: ';'
            {
             before(grammarAccess.getUsingAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Using__Group__2__Impl2336); 
             after(grammarAccess.getUsingAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Using__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1181:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1185:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1186:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02373);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02376);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1193:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1197:1: ( ( 'component' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1198:1: ( 'component' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1198:1: ( 'component' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1199:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Component__Group__0__Impl2404); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1212:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1216:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1217:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12435);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12438);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1224:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1228:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1229:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1229:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1230:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1231:1: ( rule__Component__NameAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1231:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl2465);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1241:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1245:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1246:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22495);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22498);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1253:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1257:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1258:1: ( '{' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1258:1: ( '{' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1259:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group__2__Impl2526); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1272:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1276:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1277:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32557);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32560);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1284:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1288:1: ( ( ( rule__Component__PortsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1289:1: ( ( rule__Component__PortsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1289:1: ( ( rule__Component__PortsAssignment_3 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1290:1: ( rule__Component__PortsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1291:1: ( rule__Component__PortsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1291:2: rule__Component__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl2587);
            	    rule__Component__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPortsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1301:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1305:1: ( rule__Component__Group__4__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1306:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42618);
            rule__Component__Group__4__Impl();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1312:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1316:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1317:1: ( '}' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1317:1: ( '}' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1318:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group__4__Impl2646); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1341:1: rule__ProvidedPort__Group__0 : rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 ;
    public final void rule__ProvidedPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1345:1: ( rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1346:2: rule__ProvidedPort__Group__0__Impl rule__ProvidedPort__Group__1
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__0__Impl_in_rule__ProvidedPort__Group__02687);
            rule__ProvidedPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPort__Group__1_in_rule__ProvidedPort__Group__02690);
            rule__ProvidedPort__Group__1();

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
    // $ANTLR end "rule__ProvidedPort__Group__0"


    // $ANTLR start "rule__ProvidedPort__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1353:1: rule__ProvidedPort__Group__0__Impl : ( 'provides' ) ;
    public final void rule__ProvidedPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1357:1: ( ( 'provides' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1358:1: ( 'provides' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1358:1: ( 'provides' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1359:1: 'provides'
            {
             before(grammarAccess.getProvidedPortAccess().getProvidesKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ProvidedPort__Group__0__Impl2718); 
             after(grammarAccess.getProvidedPortAccess().getProvidesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__0__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1372:1: rule__ProvidedPort__Group__1 : rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 ;
    public final void rule__ProvidedPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1376:1: ( rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1377:2: rule__ProvidedPort__Group__1__Impl rule__ProvidedPort__Group__2
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__1__Impl_in_rule__ProvidedPort__Group__12749);
            rule__ProvidedPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPort__Group__2_in_rule__ProvidedPort__Group__12752);
            rule__ProvidedPort__Group__2();

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
    // $ANTLR end "rule__ProvidedPort__Group__1"


    // $ANTLR start "rule__ProvidedPort__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1384:1: rule__ProvidedPort__Group__1__Impl : ( ( rule__ProvidedPort__IsMandatoryAssignment_1 )? ) ;
    public final void rule__ProvidedPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1388:1: ( ( ( rule__ProvidedPort__IsMandatoryAssignment_1 )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1389:1: ( ( rule__ProvidedPort__IsMandatoryAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1389:1: ( ( rule__ProvidedPort__IsMandatoryAssignment_1 )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1390:1: ( rule__ProvidedPort__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getProvidedPortAccess().getIsMandatoryAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1391:1: ( rule__ProvidedPort__IsMandatoryAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1391:2: rule__ProvidedPort__IsMandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProvidedPort__IsMandatoryAssignment_1_in_rule__ProvidedPort__Group__1__Impl2779);
                    rule__ProvidedPort__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProvidedPortAccess().getIsMandatoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__1__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1401:1: rule__ProvidedPort__Group__2 : rule__ProvidedPort__Group__2__Impl rule__ProvidedPort__Group__3 ;
    public final void rule__ProvidedPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1405:1: ( rule__ProvidedPort__Group__2__Impl rule__ProvidedPort__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1406:2: rule__ProvidedPort__Group__2__Impl rule__ProvidedPort__Group__3
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__2__Impl_in_rule__ProvidedPort__Group__22810);
            rule__ProvidedPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPort__Group__3_in_rule__ProvidedPort__Group__22813);
            rule__ProvidedPort__Group__3();

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
    // $ANTLR end "rule__ProvidedPort__Group__2"


    // $ANTLR start "rule__ProvidedPort__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1413:1: rule__ProvidedPort__Group__2__Impl : ( ( rule__ProvidedPort__IsToManyAssignment_2 )? ) ;
    public final void rule__ProvidedPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1417:1: ( ( ( rule__ProvidedPort__IsToManyAssignment_2 )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1418:1: ( ( rule__ProvidedPort__IsToManyAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1418:1: ( ( rule__ProvidedPort__IsToManyAssignment_2 )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1419:1: ( rule__ProvidedPort__IsToManyAssignment_2 )?
            {
             before(grammarAccess.getProvidedPortAccess().getIsToManyAssignment_2()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1420:1: ( rule__ProvidedPort__IsToManyAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1420:2: rule__ProvidedPort__IsToManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProvidedPort__IsToManyAssignment_2_in_rule__ProvidedPort__Group__2__Impl2840);
                    rule__ProvidedPort__IsToManyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProvidedPortAccess().getIsToManyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__2__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1430:1: rule__ProvidedPort__Group__3 : rule__ProvidedPort__Group__3__Impl rule__ProvidedPort__Group__4 ;
    public final void rule__ProvidedPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1434:1: ( rule__ProvidedPort__Group__3__Impl rule__ProvidedPort__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1435:2: rule__ProvidedPort__Group__3__Impl rule__ProvidedPort__Group__4
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__3__Impl_in_rule__ProvidedPort__Group__32871);
            rule__ProvidedPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPort__Group__4_in_rule__ProvidedPort__Group__32874);
            rule__ProvidedPort__Group__4();

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
    // $ANTLR end "rule__ProvidedPort__Group__3"


    // $ANTLR start "rule__ProvidedPort__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1442:1: rule__ProvidedPort__Group__3__Impl : ( ( rule__ProvidedPort__NameAssignment_3 ) ) ;
    public final void rule__ProvidedPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1446:1: ( ( ( rule__ProvidedPort__NameAssignment_3 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1447:1: ( ( rule__ProvidedPort__NameAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1447:1: ( ( rule__ProvidedPort__NameAssignment_3 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1448:1: ( rule__ProvidedPort__NameAssignment_3 )
            {
             before(grammarAccess.getProvidedPortAccess().getNameAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1449:1: ( rule__ProvidedPort__NameAssignment_3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1449:2: rule__ProvidedPort__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ProvidedPort__NameAssignment_3_in_rule__ProvidedPort__Group__3__Impl2901);
            rule__ProvidedPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__3__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1459:1: rule__ProvidedPort__Group__4 : rule__ProvidedPort__Group__4__Impl rule__ProvidedPort__Group__5 ;
    public final void rule__ProvidedPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1463:1: ( rule__ProvidedPort__Group__4__Impl rule__ProvidedPort__Group__5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1464:2: rule__ProvidedPort__Group__4__Impl rule__ProvidedPort__Group__5
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__4__Impl_in_rule__ProvidedPort__Group__42931);
            rule__ProvidedPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProvidedPort__Group__5_in_rule__ProvidedPort__Group__42934);
            rule__ProvidedPort__Group__5();

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
    // $ANTLR end "rule__ProvidedPort__Group__4"


    // $ANTLR start "rule__ProvidedPort__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1471:1: rule__ProvidedPort__Group__4__Impl : ( ':' ) ;
    public final void rule__ProvidedPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1475:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1476:1: ( ':' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1476:1: ( ':' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1477:1: ':'
            {
             before(grammarAccess.getProvidedPortAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__ProvidedPort__Group__4__Impl2962); 
             after(grammarAccess.getProvidedPortAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__4__Impl"


    // $ANTLR start "rule__ProvidedPort__Group__5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1490:1: rule__ProvidedPort__Group__5 : rule__ProvidedPort__Group__5__Impl ;
    public final void rule__ProvidedPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1494:1: ( rule__ProvidedPort__Group__5__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1495:2: rule__ProvidedPort__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ProvidedPort__Group__5__Impl_in_rule__ProvidedPort__Group__52993);
            rule__ProvidedPort__Group__5__Impl();

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
    // $ANTLR end "rule__ProvidedPort__Group__5"


    // $ANTLR start "rule__ProvidedPort__Group__5__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1501:1: rule__ProvidedPort__Group__5__Impl : ( ( rule__ProvidedPort__InterfaceAssignment_5 ) ) ;
    public final void rule__ProvidedPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1505:1: ( ( ( rule__ProvidedPort__InterfaceAssignment_5 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1506:1: ( ( rule__ProvidedPort__InterfaceAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1506:1: ( ( rule__ProvidedPort__InterfaceAssignment_5 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1507:1: ( rule__ProvidedPort__InterfaceAssignment_5 )
            {
             before(grammarAccess.getProvidedPortAccess().getInterfaceAssignment_5()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1508:1: ( rule__ProvidedPort__InterfaceAssignment_5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1508:2: rule__ProvidedPort__InterfaceAssignment_5
            {
            pushFollow(FOLLOW_rule__ProvidedPort__InterfaceAssignment_5_in_rule__ProvidedPort__Group__5__Impl3020);
            rule__ProvidedPort__InterfaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProvidedPortAccess().getInterfaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__Group__5__Impl"


    // $ANTLR start "rule__RequiredPort__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1530:1: rule__RequiredPort__Group__0 : rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 ;
    public final void rule__RequiredPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1534:1: ( rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1535:2: rule__RequiredPort__Group__0__Impl rule__RequiredPort__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__0__Impl_in_rule__RequiredPort__Group__03062);
            rule__RequiredPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPort__Group__1_in_rule__RequiredPort__Group__03065);
            rule__RequiredPort__Group__1();

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
    // $ANTLR end "rule__RequiredPort__Group__0"


    // $ANTLR start "rule__RequiredPort__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1542:1: rule__RequiredPort__Group__0__Impl : ( 'requires' ) ;
    public final void rule__RequiredPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1546:1: ( ( 'requires' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1547:1: ( 'requires' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1547:1: ( 'requires' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1548:1: 'requires'
            {
             before(grammarAccess.getRequiredPortAccess().getRequiresKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RequiredPort__Group__0__Impl3093); 
             after(grammarAccess.getRequiredPortAccess().getRequiresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__0__Impl"


    // $ANTLR start "rule__RequiredPort__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1561:1: rule__RequiredPort__Group__1 : rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 ;
    public final void rule__RequiredPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1565:1: ( rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1566:2: rule__RequiredPort__Group__1__Impl rule__RequiredPort__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__1__Impl_in_rule__RequiredPort__Group__13124);
            rule__RequiredPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPort__Group__2_in_rule__RequiredPort__Group__13127);
            rule__RequiredPort__Group__2();

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
    // $ANTLR end "rule__RequiredPort__Group__1"


    // $ANTLR start "rule__RequiredPort__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1573:1: rule__RequiredPort__Group__1__Impl : ( ( rule__RequiredPort__IsMandatoryAssignment_1 )? ) ;
    public final void rule__RequiredPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1577:1: ( ( ( rule__RequiredPort__IsMandatoryAssignment_1 )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1578:1: ( ( rule__RequiredPort__IsMandatoryAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1578:1: ( ( rule__RequiredPort__IsMandatoryAssignment_1 )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1579:1: ( rule__RequiredPort__IsMandatoryAssignment_1 )?
            {
             before(grammarAccess.getRequiredPortAccess().getIsMandatoryAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1580:1: ( rule__RequiredPort__IsMandatoryAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1580:2: rule__RequiredPort__IsMandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RequiredPort__IsMandatoryAssignment_1_in_rule__RequiredPort__Group__1__Impl3154);
                    rule__RequiredPort__IsMandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredPortAccess().getIsMandatoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__1__Impl"


    // $ANTLR start "rule__RequiredPort__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1590:1: rule__RequiredPort__Group__2 : rule__RequiredPort__Group__2__Impl rule__RequiredPort__Group__3 ;
    public final void rule__RequiredPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1594:1: ( rule__RequiredPort__Group__2__Impl rule__RequiredPort__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1595:2: rule__RequiredPort__Group__2__Impl rule__RequiredPort__Group__3
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__2__Impl_in_rule__RequiredPort__Group__23185);
            rule__RequiredPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPort__Group__3_in_rule__RequiredPort__Group__23188);
            rule__RequiredPort__Group__3();

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
    // $ANTLR end "rule__RequiredPort__Group__2"


    // $ANTLR start "rule__RequiredPort__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1602:1: rule__RequiredPort__Group__2__Impl : ( ( rule__RequiredPort__IsToManyAssignment_2 )? ) ;
    public final void rule__RequiredPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1606:1: ( ( ( rule__RequiredPort__IsToManyAssignment_2 )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1607:1: ( ( rule__RequiredPort__IsToManyAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1607:1: ( ( rule__RequiredPort__IsToManyAssignment_2 )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1608:1: ( rule__RequiredPort__IsToManyAssignment_2 )?
            {
             before(grammarAccess.getRequiredPortAccess().getIsToManyAssignment_2()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1609:1: ( rule__RequiredPort__IsToManyAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1609:2: rule__RequiredPort__IsToManyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RequiredPort__IsToManyAssignment_2_in_rule__RequiredPort__Group__2__Impl3215);
                    rule__RequiredPort__IsToManyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredPortAccess().getIsToManyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__2__Impl"


    // $ANTLR start "rule__RequiredPort__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1619:1: rule__RequiredPort__Group__3 : rule__RequiredPort__Group__3__Impl rule__RequiredPort__Group__4 ;
    public final void rule__RequiredPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1623:1: ( rule__RequiredPort__Group__3__Impl rule__RequiredPort__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1624:2: rule__RequiredPort__Group__3__Impl rule__RequiredPort__Group__4
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__3__Impl_in_rule__RequiredPort__Group__33246);
            rule__RequiredPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPort__Group__4_in_rule__RequiredPort__Group__33249);
            rule__RequiredPort__Group__4();

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
    // $ANTLR end "rule__RequiredPort__Group__3"


    // $ANTLR start "rule__RequiredPort__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1631:1: rule__RequiredPort__Group__3__Impl : ( ( rule__RequiredPort__NameAssignment_3 ) ) ;
    public final void rule__RequiredPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1635:1: ( ( ( rule__RequiredPort__NameAssignment_3 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1636:1: ( ( rule__RequiredPort__NameAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1636:1: ( ( rule__RequiredPort__NameAssignment_3 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1637:1: ( rule__RequiredPort__NameAssignment_3 )
            {
             before(grammarAccess.getRequiredPortAccess().getNameAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1638:1: ( rule__RequiredPort__NameAssignment_3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1638:2: rule__RequiredPort__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__RequiredPort__NameAssignment_3_in_rule__RequiredPort__Group__3__Impl3276);
            rule__RequiredPort__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__3__Impl"


    // $ANTLR start "rule__RequiredPort__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1648:1: rule__RequiredPort__Group__4 : rule__RequiredPort__Group__4__Impl rule__RequiredPort__Group__5 ;
    public final void rule__RequiredPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1652:1: ( rule__RequiredPort__Group__4__Impl rule__RequiredPort__Group__5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1653:2: rule__RequiredPort__Group__4__Impl rule__RequiredPort__Group__5
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__4__Impl_in_rule__RequiredPort__Group__43306);
            rule__RequiredPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredPort__Group__5_in_rule__RequiredPort__Group__43309);
            rule__RequiredPort__Group__5();

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
    // $ANTLR end "rule__RequiredPort__Group__4"


    // $ANTLR start "rule__RequiredPort__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1660:1: rule__RequiredPort__Group__4__Impl : ( ':' ) ;
    public final void rule__RequiredPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1664:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1665:1: ( ':' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1665:1: ( ':' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1666:1: ':'
            {
             before(grammarAccess.getRequiredPortAccess().getColonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__RequiredPort__Group__4__Impl3337); 
             after(grammarAccess.getRequiredPortAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__4__Impl"


    // $ANTLR start "rule__RequiredPort__Group__5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1679:1: rule__RequiredPort__Group__5 : rule__RequiredPort__Group__5__Impl ;
    public final void rule__RequiredPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1683:1: ( rule__RequiredPort__Group__5__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1684:2: rule__RequiredPort__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RequiredPort__Group__5__Impl_in_rule__RequiredPort__Group__53368);
            rule__RequiredPort__Group__5__Impl();

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
    // $ANTLR end "rule__RequiredPort__Group__5"


    // $ANTLR start "rule__RequiredPort__Group__5__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1690:1: rule__RequiredPort__Group__5__Impl : ( ( rule__RequiredPort__InterfaceAssignment_5 ) ) ;
    public final void rule__RequiredPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1694:1: ( ( ( rule__RequiredPort__InterfaceAssignment_5 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1695:1: ( ( rule__RequiredPort__InterfaceAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1695:1: ( ( rule__RequiredPort__InterfaceAssignment_5 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1696:1: ( rule__RequiredPort__InterfaceAssignment_5 )
            {
             before(grammarAccess.getRequiredPortAccess().getInterfaceAssignment_5()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1697:1: ( rule__RequiredPort__InterfaceAssignment_5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1697:2: rule__RequiredPort__InterfaceAssignment_5
            {
            pushFollow(FOLLOW_rule__RequiredPort__InterfaceAssignment_5_in_rule__RequiredPort__Group__5__Impl3395);
            rule__RequiredPort__InterfaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRequiredPortAccess().getInterfaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1719:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1723:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1724:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__03437);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__03440);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1731:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1735:1: ( ( 'interface' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1736:1: ( 'interface' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1736:1: ( 'interface' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1737:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Interface__Group__0__Impl3468); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1750:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1754:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1755:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__13499);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__13502);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1762:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1766:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1767:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1767:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1768:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1769:1: ( rule__Interface__NameAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1769:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl3529);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1779:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1783:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1784:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23559);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23562);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1791:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1795:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1796:1: ( '{' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1796:1: ( '{' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1797:1: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Interface__Group__2__Impl3590); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1810:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1814:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1815:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33621);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33624);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1822:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__InteractionsAssignment_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1826:1: ( ( ( rule__Interface__InteractionsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1827:1: ( ( rule__Interface__InteractionsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1827:1: ( ( rule__Interface__InteractionsAssignment_3 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1828:1: ( rule__Interface__InteractionsAssignment_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getInteractionsAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1829:1: ( rule__Interface__InteractionsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=24 && LA15_0<=25)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1829:2: rule__Interface__InteractionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Interface__InteractionsAssignment_3_in_rule__Interface__Group__3__Impl3651);
            	    rule__Interface__InteractionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getInteractionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1839:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1843:1: ( rule__Interface__Group__4__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1844:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43682);
            rule__Interface__Group__4__Impl();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1850:1: rule__Interface__Group__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1854:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1855:1: ( '}' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1855:1: ( '}' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1856:1: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Interface__Group__4__Impl3710); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__OnewayInteraction__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1879:1: rule__OnewayInteraction__Group__0 : rule__OnewayInteraction__Group__0__Impl rule__OnewayInteraction__Group__1 ;
    public final void rule__OnewayInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1883:1: ( rule__OnewayInteraction__Group__0__Impl rule__OnewayInteraction__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1884:2: rule__OnewayInteraction__Group__0__Impl rule__OnewayInteraction__Group__1
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__Group__0__Impl_in_rule__OnewayInteraction__Group__03751);
            rule__OnewayInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnewayInteraction__Group__1_in_rule__OnewayInteraction__Group__03754);
            rule__OnewayInteraction__Group__1();

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
    // $ANTLR end "rule__OnewayInteraction__Group__0"


    // $ANTLR start "rule__OnewayInteraction__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1891:1: rule__OnewayInteraction__Group__0__Impl : ( 'oneway' ) ;
    public final void rule__OnewayInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1895:1: ( ( 'oneway' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1896:1: ( 'oneway' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1896:1: ( 'oneway' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1897:1: 'oneway'
            {
             before(grammarAccess.getOnewayInteractionAccess().getOnewayKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__OnewayInteraction__Group__0__Impl3782); 
             after(grammarAccess.getOnewayInteractionAccess().getOnewayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__Group__0__Impl"


    // $ANTLR start "rule__OnewayInteraction__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1910:1: rule__OnewayInteraction__Group__1 : rule__OnewayInteraction__Group__1__Impl rule__OnewayInteraction__Group__2 ;
    public final void rule__OnewayInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1914:1: ( rule__OnewayInteraction__Group__1__Impl rule__OnewayInteraction__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1915:2: rule__OnewayInteraction__Group__1__Impl rule__OnewayInteraction__Group__2
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__Group__1__Impl_in_rule__OnewayInteraction__Group__13813);
            rule__OnewayInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnewayInteraction__Group__2_in_rule__OnewayInteraction__Group__13816);
            rule__OnewayInteraction__Group__2();

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
    // $ANTLR end "rule__OnewayInteraction__Group__1"


    // $ANTLR start "rule__OnewayInteraction__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1922:1: rule__OnewayInteraction__Group__1__Impl : ( ( rule__OnewayInteraction__NameAssignment_1 ) ) ;
    public final void rule__OnewayInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1926:1: ( ( ( rule__OnewayInteraction__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1927:1: ( ( rule__OnewayInteraction__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1927:1: ( ( rule__OnewayInteraction__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1928:1: ( rule__OnewayInteraction__NameAssignment_1 )
            {
             before(grammarAccess.getOnewayInteractionAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1929:1: ( rule__OnewayInteraction__NameAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1929:2: rule__OnewayInteraction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__NameAssignment_1_in_rule__OnewayInteraction__Group__1__Impl3843);
            rule__OnewayInteraction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnewayInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__Group__1__Impl"


    // $ANTLR start "rule__OnewayInteraction__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1939:1: rule__OnewayInteraction__Group__2 : rule__OnewayInteraction__Group__2__Impl rule__OnewayInteraction__Group__3 ;
    public final void rule__OnewayInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1943:1: ( rule__OnewayInteraction__Group__2__Impl rule__OnewayInteraction__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1944:2: rule__OnewayInteraction__Group__2__Impl rule__OnewayInteraction__Group__3
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__Group__2__Impl_in_rule__OnewayInteraction__Group__23873);
            rule__OnewayInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnewayInteraction__Group__3_in_rule__OnewayInteraction__Group__23876);
            rule__OnewayInteraction__Group__3();

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
    // $ANTLR end "rule__OnewayInteraction__Group__2"


    // $ANTLR start "rule__OnewayInteraction__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1951:1: rule__OnewayInteraction__Group__2__Impl : ( ':' ) ;
    public final void rule__OnewayInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1955:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1956:1: ( ':' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1956:1: ( ':' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1957:1: ':'
            {
             before(grammarAccess.getOnewayInteractionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__OnewayInteraction__Group__2__Impl3904); 
             after(grammarAccess.getOnewayInteractionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__Group__2__Impl"


    // $ANTLR start "rule__OnewayInteraction__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1970:1: rule__OnewayInteraction__Group__3 : rule__OnewayInteraction__Group__3__Impl ;
    public final void rule__OnewayInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1974:1: ( rule__OnewayInteraction__Group__3__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1975:2: rule__OnewayInteraction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__Group__3__Impl_in_rule__OnewayInteraction__Group__33935);
            rule__OnewayInteraction__Group__3__Impl();

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
    // $ANTLR end "rule__OnewayInteraction__Group__3"


    // $ANTLR start "rule__OnewayInteraction__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1981:1: rule__OnewayInteraction__Group__3__Impl : ( ( rule__OnewayInteraction__MessageAssignment_3 ) ) ;
    public final void rule__OnewayInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1985:1: ( ( ( rule__OnewayInteraction__MessageAssignment_3 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1986:1: ( ( rule__OnewayInteraction__MessageAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1986:1: ( ( rule__OnewayInteraction__MessageAssignment_3 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1987:1: ( rule__OnewayInteraction__MessageAssignment_3 )
            {
             before(grammarAccess.getOnewayInteractionAccess().getMessageAssignment_3()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1988:1: ( rule__OnewayInteraction__MessageAssignment_3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:1988:2: rule__OnewayInteraction__MessageAssignment_3
            {
            pushFollow(FOLLOW_rule__OnewayInteraction__MessageAssignment_3_in_rule__OnewayInteraction__Group__3__Impl3962);
            rule__OnewayInteraction__MessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOnewayInteractionAccess().getMessageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__Group__3__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2006:1: rule__RequestReplyInteraction__Group__0 : rule__RequestReplyInteraction__Group__0__Impl rule__RequestReplyInteraction__Group__1 ;
    public final void rule__RequestReplyInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2010:1: ( rule__RequestReplyInteraction__Group__0__Impl rule__RequestReplyInteraction__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2011:2: rule__RequestReplyInteraction__Group__0__Impl rule__RequestReplyInteraction__Group__1
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__0__Impl_in_rule__RequestReplyInteraction__Group__04000);
            rule__RequestReplyInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__1_in_rule__RequestReplyInteraction__Group__04003);
            rule__RequestReplyInteraction__Group__1();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__0"


    // $ANTLR start "rule__RequestReplyInteraction__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2018:1: rule__RequestReplyInteraction__Group__0__Impl : ( 'rr' ) ;
    public final void rule__RequestReplyInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2022:1: ( ( 'rr' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2023:1: ( 'rr' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2023:1: ( 'rr' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2024:1: 'rr'
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getRrKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__RequestReplyInteraction__Group__0__Impl4031); 
             after(grammarAccess.getRequestReplyInteractionAccess().getRrKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__0__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2037:1: rule__RequestReplyInteraction__Group__1 : rule__RequestReplyInteraction__Group__1__Impl rule__RequestReplyInteraction__Group__2 ;
    public final void rule__RequestReplyInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2041:1: ( rule__RequestReplyInteraction__Group__1__Impl rule__RequestReplyInteraction__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2042:2: rule__RequestReplyInteraction__Group__1__Impl rule__RequestReplyInteraction__Group__2
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__1__Impl_in_rule__RequestReplyInteraction__Group__14062);
            rule__RequestReplyInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__2_in_rule__RequestReplyInteraction__Group__14065);
            rule__RequestReplyInteraction__Group__2();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__1"


    // $ANTLR start "rule__RequestReplyInteraction__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2049:1: rule__RequestReplyInteraction__Group__1__Impl : ( ( rule__RequestReplyInteraction__NameAssignment_1 ) ) ;
    public final void rule__RequestReplyInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2053:1: ( ( ( rule__RequestReplyInteraction__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2054:1: ( ( rule__RequestReplyInteraction__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2054:1: ( ( rule__RequestReplyInteraction__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2055:1: ( rule__RequestReplyInteraction__NameAssignment_1 )
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2056:1: ( rule__RequestReplyInteraction__NameAssignment_1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2056:2: rule__RequestReplyInteraction__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__NameAssignment_1_in_rule__RequestReplyInteraction__Group__1__Impl4092);
            rule__RequestReplyInteraction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestReplyInteractionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__1__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2066:1: rule__RequestReplyInteraction__Group__2 : rule__RequestReplyInteraction__Group__2__Impl rule__RequestReplyInteraction__Group__3 ;
    public final void rule__RequestReplyInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2070:1: ( rule__RequestReplyInteraction__Group__2__Impl rule__RequestReplyInteraction__Group__3 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2071:2: rule__RequestReplyInteraction__Group__2__Impl rule__RequestReplyInteraction__Group__3
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__2__Impl_in_rule__RequestReplyInteraction__Group__24122);
            rule__RequestReplyInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__3_in_rule__RequestReplyInteraction__Group__24125);
            rule__RequestReplyInteraction__Group__3();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__2"


    // $ANTLR start "rule__RequestReplyInteraction__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2078:1: rule__RequestReplyInteraction__Group__2__Impl : ( ':' ) ;
    public final void rule__RequestReplyInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2082:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2083:1: ( ':' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2083:1: ( ':' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2084:1: ':'
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__RequestReplyInteraction__Group__2__Impl4153); 
             after(grammarAccess.getRequestReplyInteractionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__2__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2097:1: rule__RequestReplyInteraction__Group__3 : rule__RequestReplyInteraction__Group__3__Impl rule__RequestReplyInteraction__Group__4 ;
    public final void rule__RequestReplyInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2101:1: ( rule__RequestReplyInteraction__Group__3__Impl rule__RequestReplyInteraction__Group__4 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2102:2: rule__RequestReplyInteraction__Group__3__Impl rule__RequestReplyInteraction__Group__4
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__3__Impl_in_rule__RequestReplyInteraction__Group__34184);
            rule__RequestReplyInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__4_in_rule__RequestReplyInteraction__Group__34187);
            rule__RequestReplyInteraction__Group__4();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__3"


    // $ANTLR start "rule__RequestReplyInteraction__Group__3__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2109:1: rule__RequestReplyInteraction__Group__3__Impl : ( 'request' ) ;
    public final void rule__RequestReplyInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2113:1: ( ( 'request' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2114:1: ( 'request' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2114:1: ( 'request' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2115:1: 'request'
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getRequestKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__RequestReplyInteraction__Group__3__Impl4215); 
             after(grammarAccess.getRequestReplyInteractionAccess().getRequestKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__3__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__4"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2128:1: rule__RequestReplyInteraction__Group__4 : rule__RequestReplyInteraction__Group__4__Impl rule__RequestReplyInteraction__Group__5 ;
    public final void rule__RequestReplyInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2132:1: ( rule__RequestReplyInteraction__Group__4__Impl rule__RequestReplyInteraction__Group__5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2133:2: rule__RequestReplyInteraction__Group__4__Impl rule__RequestReplyInteraction__Group__5
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__4__Impl_in_rule__RequestReplyInteraction__Group__44246);
            rule__RequestReplyInteraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__5_in_rule__RequestReplyInteraction__Group__44249);
            rule__RequestReplyInteraction__Group__5();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__4"


    // $ANTLR start "rule__RequestReplyInteraction__Group__4__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2140:1: rule__RequestReplyInteraction__Group__4__Impl : ( '=' ) ;
    public final void rule__RequestReplyInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2144:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2145:1: ( '=' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2145:1: ( '=' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2146:1: '='
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__RequestReplyInteraction__Group__4__Impl4277); 
             after(grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__4__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2159:1: rule__RequestReplyInteraction__Group__5 : rule__RequestReplyInteraction__Group__5__Impl rule__RequestReplyInteraction__Group__6 ;
    public final void rule__RequestReplyInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2163:1: ( rule__RequestReplyInteraction__Group__5__Impl rule__RequestReplyInteraction__Group__6 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2164:2: rule__RequestReplyInteraction__Group__5__Impl rule__RequestReplyInteraction__Group__6
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__5__Impl_in_rule__RequestReplyInteraction__Group__54308);
            rule__RequestReplyInteraction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__6_in_rule__RequestReplyInteraction__Group__54311);
            rule__RequestReplyInteraction__Group__6();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__5"


    // $ANTLR start "rule__RequestReplyInteraction__Group__5__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2171:1: rule__RequestReplyInteraction__Group__5__Impl : ( ( rule__RequestReplyInteraction__RequestAssignment_5 ) ) ;
    public final void rule__RequestReplyInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2175:1: ( ( ( rule__RequestReplyInteraction__RequestAssignment_5 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2176:1: ( ( rule__RequestReplyInteraction__RequestAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2176:1: ( ( rule__RequestReplyInteraction__RequestAssignment_5 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2177:1: ( rule__RequestReplyInteraction__RequestAssignment_5 )
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getRequestAssignment_5()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2178:1: ( rule__RequestReplyInteraction__RequestAssignment_5 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2178:2: rule__RequestReplyInteraction__RequestAssignment_5
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__RequestAssignment_5_in_rule__RequestReplyInteraction__Group__5__Impl4338);
            rule__RequestReplyInteraction__RequestAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRequestReplyInteractionAccess().getRequestAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__5__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__6"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2188:1: rule__RequestReplyInteraction__Group__6 : rule__RequestReplyInteraction__Group__6__Impl rule__RequestReplyInteraction__Group__7 ;
    public final void rule__RequestReplyInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2192:1: ( rule__RequestReplyInteraction__Group__6__Impl rule__RequestReplyInteraction__Group__7 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2193:2: rule__RequestReplyInteraction__Group__6__Impl rule__RequestReplyInteraction__Group__7
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__6__Impl_in_rule__RequestReplyInteraction__Group__64368);
            rule__RequestReplyInteraction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__7_in_rule__RequestReplyInteraction__Group__64371);
            rule__RequestReplyInteraction__Group__7();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__6"


    // $ANTLR start "rule__RequestReplyInteraction__Group__6__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2200:1: rule__RequestReplyInteraction__Group__6__Impl : ( 'reply' ) ;
    public final void rule__RequestReplyInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2204:1: ( ( 'reply' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2205:1: ( 'reply' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2205:1: ( 'reply' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2206:1: 'reply'
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getReplyKeyword_6()); 
            match(input,28,FOLLOW_28_in_rule__RequestReplyInteraction__Group__6__Impl4399); 
             after(grammarAccess.getRequestReplyInteractionAccess().getReplyKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__6__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__7"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2219:1: rule__RequestReplyInteraction__Group__7 : rule__RequestReplyInteraction__Group__7__Impl rule__RequestReplyInteraction__Group__8 ;
    public final void rule__RequestReplyInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2223:1: ( rule__RequestReplyInteraction__Group__7__Impl rule__RequestReplyInteraction__Group__8 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2224:2: rule__RequestReplyInteraction__Group__7__Impl rule__RequestReplyInteraction__Group__8
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__7__Impl_in_rule__RequestReplyInteraction__Group__74430);
            rule__RequestReplyInteraction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__8_in_rule__RequestReplyInteraction__Group__74433);
            rule__RequestReplyInteraction__Group__8();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__7"


    // $ANTLR start "rule__RequestReplyInteraction__Group__7__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2231:1: rule__RequestReplyInteraction__Group__7__Impl : ( '=' ) ;
    public final void rule__RequestReplyInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2235:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2236:1: ( '=' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2236:1: ( '=' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2237:1: '='
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_7()); 
            match(input,27,FOLLOW_27_in_rule__RequestReplyInteraction__Group__7__Impl4461); 
             after(grammarAccess.getRequestReplyInteractionAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__7__Impl"


    // $ANTLR start "rule__RequestReplyInteraction__Group__8"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2250:1: rule__RequestReplyInteraction__Group__8 : rule__RequestReplyInteraction__Group__8__Impl ;
    public final void rule__RequestReplyInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2254:1: ( rule__RequestReplyInteraction__Group__8__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2255:2: rule__RequestReplyInteraction__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__Group__8__Impl_in_rule__RequestReplyInteraction__Group__84492);
            rule__RequestReplyInteraction__Group__8__Impl();

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
    // $ANTLR end "rule__RequestReplyInteraction__Group__8"


    // $ANTLR start "rule__RequestReplyInteraction__Group__8__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2261:1: rule__RequestReplyInteraction__Group__8__Impl : ( ( rule__RequestReplyInteraction__ReplyAssignment_8 ) ) ;
    public final void rule__RequestReplyInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2265:1: ( ( ( rule__RequestReplyInteraction__ReplyAssignment_8 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2266:1: ( ( rule__RequestReplyInteraction__ReplyAssignment_8 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2266:1: ( ( rule__RequestReplyInteraction__ReplyAssignment_8 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2267:1: ( rule__RequestReplyInteraction__ReplyAssignment_8 )
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getReplyAssignment_8()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2268:1: ( rule__RequestReplyInteraction__ReplyAssignment_8 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2268:2: rule__RequestReplyInteraction__ReplyAssignment_8
            {
            pushFollow(FOLLOW_rule__RequestReplyInteraction__ReplyAssignment_8_in_rule__RequestReplyInteraction__Group__8__Impl4519);
            rule__RequestReplyInteraction__ReplyAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRequestReplyInteractionAccess().getReplyAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__Group__8__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2296:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2300:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2301:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__04567);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__04570);
            rule__Message__Group__1();

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
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2308:1: rule__Message__Group__0__Impl : ( '(' ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2312:1: ( ( '(' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2313:1: ( '(' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2313:1: ( '(' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2314:1: '('
            {
             before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Message__Group__0__Impl4598); 
             after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2327:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2331:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2332:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__14629);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__14632);
            rule__Message__Group__2();

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
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2339:1: rule__Message__Group__1__Impl : ( ( rule__Message__Group_1__0 )* ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2343:1: ( ( ( rule__Message__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2344:1: ( ( rule__Message__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2344:1: ( ( rule__Message__Group_1__0 )* )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2345:1: ( rule__Message__Group_1__0 )*
            {
             before(grammarAccess.getMessageAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2346:1: ( rule__Message__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2346:2: rule__Message__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl4659);
            	    rule__Message__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2356:1: rule__Message__Group__2 : rule__Message__Group__2__Impl ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2360:1: ( rule__Message__Group__2__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2361:2: rule__Message__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24690);
            rule__Message__Group__2__Impl();

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
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2367:1: rule__Message__Group__2__Impl : ( ')' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2371:1: ( ( ')' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2372:1: ( ')' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2372:1: ( ')' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2373:1: ')'
            {
             before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Message__Group__2__Impl4718); 
             after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group_1__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2392:1: rule__Message__Group_1__0 : rule__Message__Group_1__0__Impl rule__Message__Group_1__1 ;
    public final void rule__Message__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2396:1: ( rule__Message__Group_1__0__Impl rule__Message__Group_1__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2397:2: rule__Message__Group_1__0__Impl rule__Message__Group_1__1
            {
            pushFollow(FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__04755);
            rule__Message__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__04758);
            rule__Message__Group_1__1();

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
    // $ANTLR end "rule__Message__Group_1__0"


    // $ANTLR start "rule__Message__Group_1__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2404:1: rule__Message__Group_1__0__Impl : ( ( rule__Message__ParametersAssignment_1_0 ) ) ;
    public final void rule__Message__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2408:1: ( ( ( rule__Message__ParametersAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2409:1: ( ( rule__Message__ParametersAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2409:1: ( ( rule__Message__ParametersAssignment_1_0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2410:1: ( rule__Message__ParametersAssignment_1_0 )
            {
             before(grammarAccess.getMessageAccess().getParametersAssignment_1_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2411:1: ( rule__Message__ParametersAssignment_1_0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2411:2: rule__Message__ParametersAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Message__ParametersAssignment_1_0_in_rule__Message__Group_1__0__Impl4785);
            rule__Message__ParametersAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getParametersAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__0__Impl"


    // $ANTLR start "rule__Message__Group_1__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2421:1: rule__Message__Group_1__1 : rule__Message__Group_1__1__Impl ;
    public final void rule__Message__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2425:1: ( rule__Message__Group_1__1__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2426:2: rule__Message__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__14815);
            rule__Message__Group_1__1__Impl();

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
    // $ANTLR end "rule__Message__Group_1__1"


    // $ANTLR start "rule__Message__Group_1__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2432:1: rule__Message__Group_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Message__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2436:1: ( ( ( ',' )? ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2437:1: ( ( ',' )? )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2437:1: ( ( ',' )? )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2438:1: ( ',' )?
            {
             before(grammarAccess.getMessageAccess().getCommaKeyword_1_1()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2439:1: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2440:2: ','
                    {
                    match(input,31,FOLLOW_31_in_rule__Message__Group_1__1__Impl4844); 

                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_1__1__Impl"


    // $ANTLR start "rule__MessageParameter__Group__0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2455:1: rule__MessageParameter__Group__0 : rule__MessageParameter__Group__0__Impl rule__MessageParameter__Group__1 ;
    public final void rule__MessageParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2459:1: ( rule__MessageParameter__Group__0__Impl rule__MessageParameter__Group__1 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2460:2: rule__MessageParameter__Group__0__Impl rule__MessageParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MessageParameter__Group__0__Impl_in_rule__MessageParameter__Group__04881);
            rule__MessageParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageParameter__Group__1_in_rule__MessageParameter__Group__04884);
            rule__MessageParameter__Group__1();

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
    // $ANTLR end "rule__MessageParameter__Group__0"


    // $ANTLR start "rule__MessageParameter__Group__0__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2467:1: rule__MessageParameter__Group__0__Impl : ( ( rule__MessageParameter__NameAssignment_0 ) ) ;
    public final void rule__MessageParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2471:1: ( ( ( rule__MessageParameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2472:1: ( ( rule__MessageParameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2472:1: ( ( rule__MessageParameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2473:1: ( rule__MessageParameter__NameAssignment_0 )
            {
             before(grammarAccess.getMessageParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2474:1: ( rule__MessageParameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2474:2: rule__MessageParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageParameter__NameAssignment_0_in_rule__MessageParameter__Group__0__Impl4911);
            rule__MessageParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageParameter__Group__0__Impl"


    // $ANTLR start "rule__MessageParameter__Group__1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2484:1: rule__MessageParameter__Group__1 : rule__MessageParameter__Group__1__Impl rule__MessageParameter__Group__2 ;
    public final void rule__MessageParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2488:1: ( rule__MessageParameter__Group__1__Impl rule__MessageParameter__Group__2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2489:2: rule__MessageParameter__Group__1__Impl rule__MessageParameter__Group__2
            {
            pushFollow(FOLLOW_rule__MessageParameter__Group__1__Impl_in_rule__MessageParameter__Group__14941);
            rule__MessageParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageParameter__Group__2_in_rule__MessageParameter__Group__14944);
            rule__MessageParameter__Group__2();

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
    // $ANTLR end "rule__MessageParameter__Group__1"


    // $ANTLR start "rule__MessageParameter__Group__1__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2496:1: rule__MessageParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__MessageParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2500:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2501:1: ( ':' )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2501:1: ( ':' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2502:1: ':'
            {
             before(grammarAccess.getMessageParameterAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__MessageParameter__Group__1__Impl4972); 
             after(grammarAccess.getMessageParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageParameter__Group__1__Impl"


    // $ANTLR start "rule__MessageParameter__Group__2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2515:1: rule__MessageParameter__Group__2 : rule__MessageParameter__Group__2__Impl ;
    public final void rule__MessageParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2519:1: ( rule__MessageParameter__Group__2__Impl )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2520:2: rule__MessageParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MessageParameter__Group__2__Impl_in_rule__MessageParameter__Group__25003);
            rule__MessageParameter__Group__2__Impl();

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
    // $ANTLR end "rule__MessageParameter__Group__2"


    // $ANTLR start "rule__MessageParameter__Group__2__Impl"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2526:1: rule__MessageParameter__Group__2__Impl : ( ( rule__MessageParameter__TyperefAssignment_2 ) ) ;
    public final void rule__MessageParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2530:1: ( ( ( rule__MessageParameter__TyperefAssignment_2 ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2531:1: ( ( rule__MessageParameter__TyperefAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2531:1: ( ( rule__MessageParameter__TyperefAssignment_2 ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2532:1: ( rule__MessageParameter__TyperefAssignment_2 )
            {
             before(grammarAccess.getMessageParameterAccess().getTyperefAssignment_2()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2533:1: ( rule__MessageParameter__TyperefAssignment_2 )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2533:2: rule__MessageParameter__TyperefAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageParameter__TyperefAssignment_2_in_rule__MessageParameter__Group__2__Impl5030);
            rule__MessageParameter__TyperefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageParameterAccess().getTyperefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageParameter__Group__2__Impl"


    // $ANTLR start "rule__ArchiModel__ImportsAssignment_0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2550:1: rule__ArchiModel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__ArchiModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2554:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2555:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2555:1: ( ruleImport )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2556:1: ruleImport
            {
             before(grammarAccess.getArchiModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ArchiModel__ImportsAssignment_05071);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getArchiModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiModel__ImportsAssignment_0"


    // $ANTLR start "rule__ArchiModel__ElementsAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2565:1: rule__ArchiModel__ElementsAssignment_1 : ( ruleSystem ) ;
    public final void rule__ArchiModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2569:1: ( ( ruleSystem ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2570:1: ( ruleSystem )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2570:1: ( ruleSystem )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2571:1: ruleSystem
            {
             before(grammarAccess.getArchiModelAccess().getElementsSystemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__ArchiModel__ElementsAssignment_15102);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getArchiModelAccess().getElementsSystemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiModel__ElementsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2580:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2584:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2585:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2585:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2586:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15133);
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


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2595:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2599:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2600:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2600:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2601:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_15164); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__UsingsAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2610:1: rule__System__UsingsAssignment_3 : ( ruleUsing ) ;
    public final void rule__System__UsingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2614:1: ( ( ruleUsing ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2615:1: ( ruleUsing )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2615:1: ( ruleUsing )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2616:1: ruleUsing
            {
             before(grammarAccess.getSystemAccess().getUsingsUsingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUsing_in_rule__System__UsingsAssignment_35195);
            ruleUsing();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getUsingsUsingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__UsingsAssignment_3"


    // $ANTLR start "rule__System__SubSystemsAssignment_4_0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2625:1: rule__System__SubSystemsAssignment_4_0 : ( ruleSystem ) ;
    public final void rule__System__SubSystemsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2629:1: ( ( ruleSystem ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2630:1: ( ruleSystem )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2630:1: ( ruleSystem )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2631:1: ruleSystem
            {
             before(grammarAccess.getSystemAccess().getSubSystemsSystemParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__System__SubSystemsAssignment_4_05226);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSubSystemsSystemParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SubSystemsAssignment_4_0"


    // $ANTLR start "rule__System__ComponentsAssignment_4_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2640:1: rule__System__ComponentsAssignment_4_1 : ( ruleComponent ) ;
    public final void rule__System__ComponentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2644:1: ( ( ruleComponent ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2645:1: ( ruleComponent )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2645:1: ( ruleComponent )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2646:1: ruleComponent
            {
             before(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_15257);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ComponentsAssignment_4_1"


    // $ANTLR start "rule__System__InterfacesAssignment_4_2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2655:1: rule__System__InterfacesAssignment_4_2 : ( ruleInterface ) ;
    public final void rule__System__InterfacesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2659:1: ( ( ruleInterface ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2660:1: ( ruleInterface )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2660:1: ( ruleInterface )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2661:1: ruleInterface
            {
             before(grammarAccess.getSystemAccess().getInterfacesInterfaceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__System__InterfacesAssignment_4_25288);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getInterfacesInterfaceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__InterfacesAssignment_4_2"


    // $ANTLR start "rule__Using__SystemAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2670:1: rule__Using__SystemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Using__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2674:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2675:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2675:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2676:1: ( RULE_ID )
            {
             before(grammarAccess.getUsingAccess().getSystemSystemCrossReference_1_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2677:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2678:1: RULE_ID
            {
             before(grammarAccess.getUsingAccess().getSystemSystemIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Using__SystemAssignment_15323); 
             after(grammarAccess.getUsingAccess().getSystemSystemIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUsingAccess().getSystemSystemCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Using__SystemAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2689:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2693:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2694:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2694:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2695:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_15358); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__PortsAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2704:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2708:1: ( ( rulePort ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2709:1: ( rulePort )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2709:1: ( rulePort )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2710:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_35389);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PortsAssignment_3"


    // $ANTLR start "rule__ProvidedPort__IsMandatoryAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2719:1: rule__ProvidedPort__IsMandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__ProvidedPort__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2723:1: ( ( ( 'mandatory' ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2724:1: ( ( 'mandatory' ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2724:1: ( ( 'mandatory' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2725:1: ( 'mandatory' )
            {
             before(grammarAccess.getProvidedPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2726:1: ( 'mandatory' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2727:1: 'mandatory'
            {
             before(grammarAccess.getProvidedPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__ProvidedPort__IsMandatoryAssignment_15425); 
             after(grammarAccess.getProvidedPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getProvidedPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__IsMandatoryAssignment_1"


    // $ANTLR start "rule__ProvidedPort__IsToManyAssignment_2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2742:1: rule__ProvidedPort__IsToManyAssignment_2 : ( ( 'toMany' ) ) ;
    public final void rule__ProvidedPort__IsToManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2746:1: ( ( ( 'toMany' ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2747:1: ( ( 'toMany' ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2747:1: ( ( 'toMany' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2748:1: ( 'toMany' )
            {
             before(grammarAccess.getProvidedPortAccess().getIsToManyToManyKeyword_2_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2749:1: ( 'toMany' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2750:1: 'toMany'
            {
             before(grammarAccess.getProvidedPortAccess().getIsToManyToManyKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__ProvidedPort__IsToManyAssignment_25469); 
             after(grammarAccess.getProvidedPortAccess().getIsToManyToManyKeyword_2_0()); 

            }

             after(grammarAccess.getProvidedPortAccess().getIsToManyToManyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__IsToManyAssignment_2"


    // $ANTLR start "rule__ProvidedPort__NameAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2765:1: rule__ProvidedPort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ProvidedPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2769:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2770:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2770:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2771:1: RULE_ID
            {
             before(grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedPort__NameAssignment_35508); 
             after(grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__NameAssignment_3"


    // $ANTLR start "rule__ProvidedPort__InterfaceAssignment_5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2780:1: rule__ProvidedPort__InterfaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedPort__InterfaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2784:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2785:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2785:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2786:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidedPortAccess().getInterfaceInterfaceCrossReference_5_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2787:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2788:1: RULE_ID
            {
             before(grammarAccess.getProvidedPortAccess().getInterfaceInterfaceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProvidedPort__InterfaceAssignment_55543); 
             after(grammarAccess.getProvidedPortAccess().getInterfaceInterfaceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getProvidedPortAccess().getInterfaceInterfaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedPort__InterfaceAssignment_5"


    // $ANTLR start "rule__RequiredPort__IsMandatoryAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2799:1: rule__RequiredPort__IsMandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__RequiredPort__IsMandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2803:1: ( ( ( 'mandatory' ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2804:1: ( ( 'mandatory' ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2804:1: ( ( 'mandatory' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2805:1: ( 'mandatory' )
            {
             before(grammarAccess.getRequiredPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2806:1: ( 'mandatory' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2807:1: 'mandatory'
            {
             before(grammarAccess.getRequiredPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__RequiredPort__IsMandatoryAssignment_15583); 
             after(grammarAccess.getRequiredPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getRequiredPortAccess().getIsMandatoryMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__IsMandatoryAssignment_1"


    // $ANTLR start "rule__RequiredPort__IsToManyAssignment_2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2822:1: rule__RequiredPort__IsToManyAssignment_2 : ( ( 'toMany' ) ) ;
    public final void rule__RequiredPort__IsToManyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2826:1: ( ( ( 'toMany' ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2827:1: ( ( 'toMany' ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2827:1: ( ( 'toMany' ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2828:1: ( 'toMany' )
            {
             before(grammarAccess.getRequiredPortAccess().getIsToManyToManyKeyword_2_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2829:1: ( 'toMany' )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2830:1: 'toMany'
            {
             before(grammarAccess.getRequiredPortAccess().getIsToManyToManyKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__RequiredPort__IsToManyAssignment_25627); 
             after(grammarAccess.getRequiredPortAccess().getIsToManyToManyKeyword_2_0()); 

            }

             after(grammarAccess.getRequiredPortAccess().getIsToManyToManyKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__IsToManyAssignment_2"


    // $ANTLR start "rule__RequiredPort__NameAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2845:1: rule__RequiredPort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RequiredPort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2849:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2850:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2850:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2851:1: RULE_ID
            {
             before(grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredPort__NameAssignment_35666); 
             after(grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__NameAssignment_3"


    // $ANTLR start "rule__RequiredPort__InterfaceAssignment_5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2860:1: rule__RequiredPort__InterfaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredPort__InterfaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2864:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2865:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2865:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2866:1: ( RULE_ID )
            {
             before(grammarAccess.getRequiredPortAccess().getInterfaceInterfaceCrossReference_5_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2867:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2868:1: RULE_ID
            {
             before(grammarAccess.getRequiredPortAccess().getInterfaceInterfaceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequiredPort__InterfaceAssignment_55701); 
             after(grammarAccess.getRequiredPortAccess().getInterfaceInterfaceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRequiredPortAccess().getInterfaceInterfaceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredPort__InterfaceAssignment_5"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2879:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2883:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2884:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2884:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2885:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_15736); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__InteractionsAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2894:1: rule__Interface__InteractionsAssignment_3 : ( ruleMessageInteraction ) ;
    public final void rule__Interface__InteractionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2898:1: ( ( ruleMessageInteraction ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2899:1: ( ruleMessageInteraction )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2899:1: ( ruleMessageInteraction )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2900:1: ruleMessageInteraction
            {
             before(grammarAccess.getInterfaceAccess().getInteractionsMessageInteractionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMessageInteraction_in_rule__Interface__InteractionsAssignment_35767);
            ruleMessageInteraction();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getInteractionsMessageInteractionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__InteractionsAssignment_3"


    // $ANTLR start "rule__OnewayInteraction__NameAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2909:1: rule__OnewayInteraction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OnewayInteraction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2913:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2914:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2914:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2915:1: RULE_ID
            {
             before(grammarAccess.getOnewayInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OnewayInteraction__NameAssignment_15798); 
             after(grammarAccess.getOnewayInteractionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__NameAssignment_1"


    // $ANTLR start "rule__OnewayInteraction__MessageAssignment_3"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2924:1: rule__OnewayInteraction__MessageAssignment_3 : ( ruleMessage ) ;
    public final void rule__OnewayInteraction__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2928:1: ( ( ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2929:1: ( ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2929:1: ( ruleMessage )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2930:1: ruleMessage
            {
             before(grammarAccess.getOnewayInteractionAccess().getMessageMessageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__OnewayInteraction__MessageAssignment_35829);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getOnewayInteractionAccess().getMessageMessageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnewayInteraction__MessageAssignment_3"


    // $ANTLR start "rule__RequestReplyInteraction__NameAssignment_1"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2939:1: rule__RequestReplyInteraction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestReplyInteraction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2943:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2944:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2944:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2945:1: RULE_ID
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequestReplyInteraction__NameAssignment_15860); 
             after(grammarAccess.getRequestReplyInteractionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__NameAssignment_1"


    // $ANTLR start "rule__RequestReplyInteraction__RequestAssignment_5"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2954:1: rule__RequestReplyInteraction__RequestAssignment_5 : ( ruleMessage ) ;
    public final void rule__RequestReplyInteraction__RequestAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2958:1: ( ( ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2959:1: ( ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2959:1: ( ruleMessage )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2960:1: ruleMessage
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getRequestMessageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__RequestReplyInteraction__RequestAssignment_55891);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getRequestReplyInteractionAccess().getRequestMessageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__RequestAssignment_5"


    // $ANTLR start "rule__RequestReplyInteraction__ReplyAssignment_8"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2969:1: rule__RequestReplyInteraction__ReplyAssignment_8 : ( ruleMessage ) ;
    public final void rule__RequestReplyInteraction__ReplyAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2973:1: ( ( ruleMessage ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2974:1: ( ruleMessage )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2974:1: ( ruleMessage )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2975:1: ruleMessage
            {
             before(grammarAccess.getRequestReplyInteractionAccess().getReplyMessageParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleMessage_in_rule__RequestReplyInteraction__ReplyAssignment_85922);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getRequestReplyInteractionAccess().getReplyMessageParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestReplyInteraction__ReplyAssignment_8"


    // $ANTLR start "rule__Message__ParametersAssignment_1_0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2984:1: rule__Message__ParametersAssignment_1_0 : ( ruleMessageParameter ) ;
    public final void rule__Message__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2988:1: ( ( ruleMessageParameter ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2989:1: ( ruleMessageParameter )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2989:1: ( ruleMessageParameter )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2990:1: ruleMessageParameter
            {
             before(grammarAccess.getMessageAccess().getParametersMessageParameterParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleMessageParameter_in_rule__Message__ParametersAssignment_1_05953);
            ruleMessageParameter();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getParametersMessageParameterParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ParametersAssignment_1_0"


    // $ANTLR start "rule__MessageParameter__NameAssignment_0"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:2999:1: rule__MessageParameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3003:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3004:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3004:1: ( RULE_ID )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3005:1: RULE_ID
            {
             before(grammarAccess.getMessageParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageParameter__NameAssignment_05984); 
             after(grammarAccess.getMessageParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageParameter__NameAssignment_0"


    // $ANTLR start "rule__MessageParameter__TyperefAssignment_2"
    // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3014:1: rule__MessageParameter__TyperefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MessageParameter__TyperefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3018:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3019:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3019:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3020:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMessageParameterAccess().getTyperefEntityCrossReference_2_0()); 
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3021:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.archidsl.ui/src-gen/fr/chaunier/xtext/archi/ui/contentassist/antlr/internal/InternalAdslDsl.g:3022:1: ruleQualifiedName
            {
             before(grammarAccess.getMessageParameterAccess().getTyperefEntityQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MessageParameter__TyperefAssignment_26019);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMessageParameterAccess().getTyperefEntityQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMessageParameterAccess().getTyperefEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageParameter__TyperefAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArchiModel_in_entryRuleArchiModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchiModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchiModel__Group__0_in_ruleArchiModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsing_in_entryRuleUsing361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsing368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__0_in_ruleUsing394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Alternatives_in_rulePort514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPort_in_entryRuleProvidedPort541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedPort548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__0_in_ruleProvidedPort574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPort_in_entryRuleRequiredPort601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredPort608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__0_in_ruleRequiredPort634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInteraction_in_entryRuleMessageInteraction721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageInteraction728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageInteraction__Alternatives_in_ruleMessageInteraction754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnewayInteraction_in_entryRuleOnewayInteraction781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnewayInteraction788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__0_in_ruleOnewayInteraction814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestReplyInteraction_in_entryRuleRequestReplyInteraction841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestReplyInteraction848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__0_in_ruleRequestReplyInteraction874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParameter_in_entryRuleMessageParameter961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageParameter968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__0_in_ruleMessageParameter994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__SubSystemsAssignment_4_0_in_rule__System__Alternatives_41030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ComponentsAssignment_4_1_in_rule__System__Alternatives_41048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__InterfacesAssignment_4_2_in_rule__System__Alternatives_41066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedPort_in_rule__Port__Alternatives1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredPort_in_rule__Port__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnewayInteraction_in_rule__MessageInteraction__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestReplyInteraction_in_rule__MessageInteraction__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchiModel__Group__0__Impl_in_rule__ArchiModel__Group__01195 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ArchiModel__Group__1_in_rule__ArchiModel__Group__01198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchiModel__ImportsAssignment_0_in_rule__ArchiModel__Group__0__Impl1225 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__ArchiModel__Group__1__Impl_in_rule__ArchiModel__Group__11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArchiModel__ElementsAssignment_1_in_rule__ArchiModel__Group__1__Impl1283 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Import__Group__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__QualifiedNameWithWildCard__Group__1__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1652 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedName__Group_1__0__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__01812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__System__Group__0__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11871 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21931 = new BitSet(new long[]{0x00000000008B4000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__21934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group__2__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__31993 = new BitSet(new long[]{0x00000000008B4000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__31996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__UsingsAssignment_3_in_rule__System__Group__3__Impl2023 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__42054 = new BitSet(new long[]{0x00000000008B4000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__42057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Alternatives_4_in_rule__System__Group__4__Impl2084 = new BitSet(new long[]{0x0000000000884002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__52115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__System__Group__5__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__0__Impl_in_rule__Using__Group__02186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Using__Group__1_in_rule__Using__Group__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Using__Group__0__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__1__Impl_in_rule__Using__Group__12248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Using__Group__2_in_rule__Using__Group__12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__SystemAssignment_1_in_rule__Using__Group__1__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Using__Group__2__Impl_in_rule__Using__Group__22308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Using__Group__2__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Component__Group__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12435 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__22495 = new BitSet(new long[]{0x0000000000510000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__22498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group__2__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__32557 = new BitSet(new long[]{0x0000000000510000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__32560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl2587 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__42618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group__4__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__0__Impl_in_rule__ProvidedPort__Group__02687 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__1_in_rule__ProvidedPort__Group__02690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ProvidedPort__Group__0__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__1__Impl_in_rule__ProvidedPort__Group__12749 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__2_in_rule__ProvidedPort__Group__12752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__IsMandatoryAssignment_1_in_rule__ProvidedPort__Group__1__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__2__Impl_in_rule__ProvidedPort__Group__22810 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__3_in_rule__ProvidedPort__Group__22813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__IsToManyAssignment_2_in_rule__ProvidedPort__Group__2__Impl2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__3__Impl_in_rule__ProvidedPort__Group__32871 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__4_in_rule__ProvidedPort__Group__32874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__NameAssignment_3_in_rule__ProvidedPort__Group__3__Impl2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__4__Impl_in_rule__ProvidedPort__Group__42931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__5_in_rule__ProvidedPort__Group__42934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ProvidedPort__Group__4__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__Group__5__Impl_in_rule__ProvidedPort__Group__52993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProvidedPort__InterfaceAssignment_5_in_rule__ProvidedPort__Group__5__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__0__Impl_in_rule__RequiredPort__Group__03062 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__1_in_rule__RequiredPort__Group__03065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RequiredPort__Group__0__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__1__Impl_in_rule__RequiredPort__Group__13124 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__2_in_rule__RequiredPort__Group__13127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__IsMandatoryAssignment_1_in_rule__RequiredPort__Group__1__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__2__Impl_in_rule__RequiredPort__Group__23185 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__3_in_rule__RequiredPort__Group__23188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__IsToManyAssignment_2_in_rule__RequiredPort__Group__2__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__3__Impl_in_rule__RequiredPort__Group__33246 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__4_in_rule__RequiredPort__Group__33249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__NameAssignment_3_in_rule__RequiredPort__Group__3__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__4__Impl_in_rule__RequiredPort__Group__43306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__5_in_rule__RequiredPort__Group__43309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RequiredPort__Group__4__Impl3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__Group__5__Impl_in_rule__RequiredPort__Group__53368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredPort__InterfaceAssignment_5_in_rule__RequiredPort__Group__5__Impl3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__03437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__03440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface__Group__0__Impl3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__13499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23559 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Interface__Group__2__Impl3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__33621 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__33624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__InteractionsAssignment_3_in_rule__Interface__Group__3__Impl3651 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__43682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Interface__Group__4__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__0__Impl_in_rule__OnewayInteraction__Group__03751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__1_in_rule__OnewayInteraction__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OnewayInteraction__Group__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__1__Impl_in_rule__OnewayInteraction__Group__13813 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__2_in_rule__OnewayInteraction__Group__13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__NameAssignment_1_in_rule__OnewayInteraction__Group__1__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__2__Impl_in_rule__OnewayInteraction__Group__23873 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__3_in_rule__OnewayInteraction__Group__23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OnewayInteraction__Group__2__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__Group__3__Impl_in_rule__OnewayInteraction__Group__33935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnewayInteraction__MessageAssignment_3_in_rule__OnewayInteraction__Group__3__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__0__Impl_in_rule__RequestReplyInteraction__Group__04000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__1_in_rule__RequestReplyInteraction__Group__04003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RequestReplyInteraction__Group__0__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__1__Impl_in_rule__RequestReplyInteraction__Group__14062 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__2_in_rule__RequestReplyInteraction__Group__14065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__NameAssignment_1_in_rule__RequestReplyInteraction__Group__1__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__2__Impl_in_rule__RequestReplyInteraction__Group__24122 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__3_in_rule__RequestReplyInteraction__Group__24125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RequestReplyInteraction__Group__2__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__3__Impl_in_rule__RequestReplyInteraction__Group__34184 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__4_in_rule__RequestReplyInteraction__Group__34187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RequestReplyInteraction__Group__3__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__4__Impl_in_rule__RequestReplyInteraction__Group__44246 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__5_in_rule__RequestReplyInteraction__Group__44249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RequestReplyInteraction__Group__4__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__5__Impl_in_rule__RequestReplyInteraction__Group__54308 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__6_in_rule__RequestReplyInteraction__Group__54311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__RequestAssignment_5_in_rule__RequestReplyInteraction__Group__5__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__6__Impl_in_rule__RequestReplyInteraction__Group__64368 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__7_in_rule__RequestReplyInteraction__Group__64371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RequestReplyInteraction__Group__6__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__7__Impl_in_rule__RequestReplyInteraction__Group__74430 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__8_in_rule__RequestReplyInteraction__Group__74433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RequestReplyInteraction__Group__7__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__Group__8__Impl_in_rule__RequestReplyInteraction__Group__84492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestReplyInteraction__ReplyAssignment_8_in_rule__RequestReplyInteraction__Group__8__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__04567 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__04570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Message__Group__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__14629 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0_in_rule__Message__Group__1__Impl4659 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__24690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Message__Group__2__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__0__Impl_in_rule__Message__Group_1__04755 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1_in_rule__Message__Group_1__04758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ParametersAssignment_1_0_in_rule__Message__Group_1__0__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group_1__1__Impl_in_rule__Message__Group_1__14815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Message__Group_1__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__0__Impl_in_rule__MessageParameter__Group__04881 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__1_in_rule__MessageParameter__Group__04884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__NameAssignment_0_in_rule__MessageParameter__Group__0__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__1__Impl_in_rule__MessageParameter__Group__14941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__2_in_rule__MessageParameter__Group__14944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MessageParameter__Group__1__Impl4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__Group__2__Impl_in_rule__MessageParameter__Group__25003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageParameter__TyperefAssignment_2_in_rule__MessageParameter__Group__2__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ArchiModel__ImportsAssignment_05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__ArchiModel__ElementsAssignment_15102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_15133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_15164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsing_in_rule__System__UsingsAssignment_35195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__System__SubSystemsAssignment_4_05226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_4_15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__System__InterfacesAssignment_4_25288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Using__SystemAssignment_15323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_15358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_35389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ProvidedPort__IsMandatoryAssignment_15425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ProvidedPort__IsToManyAssignment_25469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedPort__NameAssignment_35508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProvidedPort__InterfaceAssignment_55543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RequiredPort__IsMandatoryAssignment_15583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RequiredPort__IsToManyAssignment_25627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredPort__NameAssignment_35666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequiredPort__InterfaceAssignment_55701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_15736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageInteraction_in_rule__Interface__InteractionsAssignment_35767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OnewayInteraction__NameAssignment_15798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__OnewayInteraction__MessageAssignment_35829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequestReplyInteraction__NameAssignment_15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__RequestReplyInteraction__RequestAssignment_55891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__RequestReplyInteraction__ReplyAssignment_85922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageParameter_in_rule__Message__ParametersAssignment_1_05953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageParameter__NameAssignment_05984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MessageParameter__TyperefAssignment_26019 = new BitSet(new long[]{0x0000000000000002L});

}