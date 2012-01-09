package fr.chaunier.xtext.path.map.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.chaunier.xtext.path.map.services.PathDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPathDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BIGINT", "RULE_NUMBER", "RULE_DATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'In'", "'Out'", "'['", "']'", "'import'", "'.*'", "'.'", "'mapping'", "'Entity source'", "'Entity target'", "'('", "')'", "'use mapping'", "'whith map'", "'doc'", "'define rule'", "'operation'", "'fonction'", "'{'", "'}'", "'rule'", "'set'", "'='", "'from'", "'to'", "'source path'", "'target path'", "'info'", "'version'", "'comment'", "'for each'", "'null'", "'true'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_BIGINT=6;
    public static final int T__29=29;
    public static final int RULE_DATE=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=7;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalPathDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPathDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPathDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g"; }


     
     	private PathDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PathDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModelMap"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:60:1: entryRuleModelMap : ruleModelMap EOF ;
    public final void entryRuleModelMap() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:61:1: ( ruleModelMap EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:62:1: ruleModelMap EOF
            {
             before(grammarAccess.getModelMapRule()); 
            pushFollow(FOLLOW_ruleModelMap_in_entryRuleModelMap61);
            ruleModelMap();

            state._fsp--;

             after(grammarAccess.getModelMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMap68); 

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
    // $ANTLR end "entryRuleModelMap"


    // $ANTLR start "ruleModelMap"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:69:1: ruleModelMap : ( ( rule__ModelMap__Group__0 ) ) ;
    public final void ruleModelMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:73:2: ( ( ( rule__ModelMap__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:74:1: ( ( rule__ModelMap__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:74:1: ( ( rule__ModelMap__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:75:1: ( rule__ModelMap__Group__0 )
            {
             before(grammarAccess.getModelMapAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:76:1: ( rule__ModelMap__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:76:2: rule__ModelMap__Group__0
            {
            pushFollow(FOLLOW_rule__ModelMap__Group__0_in_ruleModelMap94);
            rule__ModelMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelMap"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:89:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:90:1: ruleImport EOF
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:104:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:104:2: rule__Import__Group__0
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:116:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:117:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:118:1: ruleQualifiedNameWithWildCard EOF
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:125:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:129:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:130:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:130:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:131:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:132:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:132:2: rule__QualifiedNameWithWildCard__Group__0
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:145:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:146:1: ruleQualifiedName EOF
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:160:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleMapEntity"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:172:1: entryRuleMapEntity : ruleMapEntity EOF ;
    public final void entryRuleMapEntity() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:173:1: ( ruleMapEntity EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:174:1: ruleMapEntity EOF
            {
             before(grammarAccess.getMapEntityRule()); 
            pushFollow(FOLLOW_ruleMapEntity_in_entryRuleMapEntity301);
            ruleMapEntity();

            state._fsp--;

             after(grammarAccess.getMapEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapEntity308); 

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
    // $ANTLR end "entryRuleMapEntity"


    // $ANTLR start "ruleMapEntity"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:181:1: ruleMapEntity : ( ( rule__MapEntity__Group__0 ) ) ;
    public final void ruleMapEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:185:2: ( ( ( rule__MapEntity__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:186:1: ( ( rule__MapEntity__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:186:1: ( ( rule__MapEntity__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:187:1: ( rule__MapEntity__Group__0 )
            {
             before(grammarAccess.getMapEntityAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:188:1: ( rule__MapEntity__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:188:2: rule__MapEntity__Group__0
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__0_in_ruleMapEntity334);
            rule__MapEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapEntity"


    // $ANTLR start "entryRuleCallMapEntity"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:200:1: entryRuleCallMapEntity : ruleCallMapEntity EOF ;
    public final void entryRuleCallMapEntity() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:201:1: ( ruleCallMapEntity EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:202:1: ruleCallMapEntity EOF
            {
             before(grammarAccess.getCallMapEntityRule()); 
            pushFollow(FOLLOW_ruleCallMapEntity_in_entryRuleCallMapEntity361);
            ruleCallMapEntity();

            state._fsp--;

             after(grammarAccess.getCallMapEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMapEntity368); 

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
    // $ANTLR end "entryRuleCallMapEntity"


    // $ANTLR start "ruleCallMapEntity"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:209:1: ruleCallMapEntity : ( ( rule__CallMapEntity__Group__0 ) ) ;
    public final void ruleCallMapEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:213:2: ( ( ( rule__CallMapEntity__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:214:1: ( ( rule__CallMapEntity__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:214:1: ( ( rule__CallMapEntity__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:215:1: ( rule__CallMapEntity__Group__0 )
            {
             before(grammarAccess.getCallMapEntityAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:216:1: ( rule__CallMapEntity__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:216:2: rule__CallMapEntity__Group__0
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group__0_in_ruleCallMapEntity394);
            rule__CallMapEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallMapEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallMapEntity"


    // $ANTLR start "entryRuleAction"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:229:1: ( ruleAction EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:230:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction421);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction428); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:237:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:241:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:242:1: ( ( rule__Action__Alternatives ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:242:1: ( ( rule__Action__Alternatives ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:243:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:244:1: ( rule__Action__Alternatives )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:244:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction454);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDocument"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:256:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:257:1: ( ruleDocument EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:258:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument481);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument488); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:265:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:269:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:270:1: ( ( rule__Document__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:270:1: ( ( rule__Document__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:271:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:272:1: ( rule__Document__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:272:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument514);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleRuleDef"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:284:1: entryRuleRuleDef : ruleRuleDef EOF ;
    public final void entryRuleRuleDef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:285:1: ( ruleRuleDef EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:286:1: ruleRuleDef EOF
            {
             before(grammarAccess.getRuleDefRule()); 
            pushFollow(FOLLOW_ruleRuleDef_in_entryRuleRuleDef541);
            ruleRuleDef();

            state._fsp--;

             after(grammarAccess.getRuleDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleDef548); 

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
    // $ANTLR end "entryRuleRuleDef"


    // $ANTLR start "ruleRuleDef"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:293:1: ruleRuleDef : ( ( rule__RuleDef__Group__0 ) ) ;
    public final void ruleRuleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:297:2: ( ( ( rule__RuleDef__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:298:1: ( ( rule__RuleDef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:298:1: ( ( rule__RuleDef__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:299:1: ( rule__RuleDef__Group__0 )
            {
             before(grammarAccess.getRuleDefAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:300:1: ( rule__RuleDef__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:300:2: rule__RuleDef__Group__0
            {
            pushFollow(FOLLOW_rule__RuleDef__Group__0_in_ruleRuleDef574);
            rule__RuleDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleDef"


    // $ANTLR start "entryRuleFunctionDef"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:312:1: entryRuleFunctionDef : ruleFunctionDef EOF ;
    public final void entryRuleFunctionDef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:313:1: ( ruleFunctionDef EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:314:1: ruleFunctionDef EOF
            {
             before(grammarAccess.getFunctionDefRule()); 
            pushFollow(FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef601);
            ruleFunctionDef();

            state._fsp--;

             after(grammarAccess.getFunctionDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDef608); 

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
    // $ANTLR end "entryRuleFunctionDef"


    // $ANTLR start "ruleFunctionDef"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:321:1: ruleFunctionDef : ( ( rule__FunctionDef__Group__0 ) ) ;
    public final void ruleFunctionDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:325:2: ( ( ( rule__FunctionDef__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:326:1: ( ( rule__FunctionDef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:326:1: ( ( rule__FunctionDef__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:327:1: ( rule__FunctionDef__Group__0 )
            {
             before(grammarAccess.getFunctionDefAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:328:1: ( rule__FunctionDef__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:328:2: rule__FunctionDef__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__0_in_ruleFunctionDef634);
            rule__FunctionDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDef"


    // $ANTLR start "entryRuleFunctionParam"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:340:1: entryRuleFunctionParam : ruleFunctionParam EOF ;
    public final void entryRuleFunctionParam() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:341:1: ( ruleFunctionParam EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:342:1: ruleFunctionParam EOF
            {
             before(grammarAccess.getFunctionParamRule()); 
            pushFollow(FOLLOW_ruleFunctionParam_in_entryRuleFunctionParam661);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParam668); 

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
    // $ANTLR end "entryRuleFunctionParam"


    // $ANTLR start "ruleFunctionParam"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:349:1: ruleFunctionParam : ( ( rule__FunctionParam__Group__0 ) ) ;
    public final void ruleFunctionParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:353:2: ( ( ( rule__FunctionParam__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:354:1: ( ( rule__FunctionParam__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:354:1: ( ( rule__FunctionParam__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:355:1: ( rule__FunctionParam__Group__0 )
            {
             before(grammarAccess.getFunctionParamAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:356:1: ( rule__FunctionParam__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:356:2: rule__FunctionParam__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParam__Group__0_in_ruleFunctionParam694);
            rule__FunctionParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionParam"


    // $ANTLR start "entryRuleFeaturePath"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:368:1: entryRuleFeaturePath : ruleFeaturePath EOF ;
    public final void entryRuleFeaturePath() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:369:1: ( ruleFeaturePath EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:370:1: ruleFeaturePath EOF
            {
             before(grammarAccess.getFeaturePathRule()); 
            pushFollow(FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath721);
            ruleFeaturePath();

            state._fsp--;

             after(grammarAccess.getFeaturePathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturePath728); 

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
    // $ANTLR end "entryRuleFeaturePath"


    // $ANTLR start "ruleFeaturePath"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:377:1: ruleFeaturePath : ( ( rule__FeaturePath__Group__0 ) ) ;
    public final void ruleFeaturePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:381:2: ( ( ( rule__FeaturePath__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:382:1: ( ( rule__FeaturePath__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:382:1: ( ( rule__FeaturePath__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:383:1: ( rule__FeaturePath__Group__0 )
            {
             before(grammarAccess.getFeaturePathAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:384:1: ( rule__FeaturePath__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:384:2: rule__FeaturePath__Group__0
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__0_in_ruleFeaturePath754);
            rule__FeaturePath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeaturePath"


    // $ANTLR start "entryRuleFeatureSet"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:396:1: entryRuleFeatureSet : ruleFeatureSet EOF ;
    public final void entryRuleFeatureSet() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:397:1: ( ruleFeatureSet EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:398:1: ruleFeatureSet EOF
            {
             before(grammarAccess.getFeatureSetRule()); 
            pushFollow(FOLLOW_ruleFeatureSet_in_entryRuleFeatureSet781);
            ruleFeatureSet();

            state._fsp--;

             after(grammarAccess.getFeatureSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureSet788); 

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
    // $ANTLR end "entryRuleFeatureSet"


    // $ANTLR start "ruleFeatureSet"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:405:1: ruleFeatureSet : ( ( rule__FeatureSet__Group__0 ) ) ;
    public final void ruleFeatureSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:409:2: ( ( ( rule__FeatureSet__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:410:1: ( ( rule__FeatureSet__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:410:1: ( ( rule__FeatureSet__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:411:1: ( rule__FeatureSet__Group__0 )
            {
             before(grammarAccess.getFeatureSetAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:412:1: ( rule__FeatureSet__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:412:2: rule__FeatureSet__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__0_in_ruleFeatureSet814);
            rule__FeatureSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureSet"


    // $ANTLR start "entryRuleFeaturePathFrom"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:424:1: entryRuleFeaturePathFrom : ruleFeaturePathFrom EOF ;
    public final void entryRuleFeaturePathFrom() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:425:1: ( ruleFeaturePathFrom EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:426:1: ruleFeaturePathFrom EOF
            {
             before(grammarAccess.getFeaturePathFromRule()); 
            pushFollow(FOLLOW_ruleFeaturePathFrom_in_entryRuleFeaturePathFrom841);
            ruleFeaturePathFrom();

            state._fsp--;

             after(grammarAccess.getFeaturePathFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturePathFrom848); 

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
    // $ANTLR end "entryRuleFeaturePathFrom"


    // $ANTLR start "ruleFeaturePathFrom"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:433:1: ruleFeaturePathFrom : ( ( rule__FeaturePathFrom__Group__0 ) ) ;
    public final void ruleFeaturePathFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:437:2: ( ( ( rule__FeaturePathFrom__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:438:1: ( ( rule__FeaturePathFrom__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:438:1: ( ( rule__FeaturePathFrom__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:439:1: ( rule__FeaturePathFrom__Group__0 )
            {
             before(grammarAccess.getFeaturePathFromAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:440:1: ( rule__FeaturePathFrom__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:440:2: rule__FeaturePathFrom__Group__0
            {
            pushFollow(FOLLOW_rule__FeaturePathFrom__Group__0_in_ruleFeaturePathFrom874);
            rule__FeaturePathFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeaturePathFrom"


    // $ANTLR start "entryRuleFeaturePathTo"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:452:1: entryRuleFeaturePathTo : ruleFeaturePathTo EOF ;
    public final void entryRuleFeaturePathTo() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:453:1: ( ruleFeaturePathTo EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:454:1: ruleFeaturePathTo EOF
            {
             before(grammarAccess.getFeaturePathToRule()); 
            pushFollow(FOLLOW_ruleFeaturePathTo_in_entryRuleFeaturePathTo901);
            ruleFeaturePathTo();

            state._fsp--;

             after(grammarAccess.getFeaturePathToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeaturePathTo908); 

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
    // $ANTLR end "entryRuleFeaturePathTo"


    // $ANTLR start "ruleFeaturePathTo"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:461:1: ruleFeaturePathTo : ( ( rule__FeaturePathTo__Group__0 ) ) ;
    public final void ruleFeaturePathTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:465:2: ( ( ( rule__FeaturePathTo__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:466:1: ( ( rule__FeaturePathTo__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:466:1: ( ( rule__FeaturePathTo__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:467:1: ( rule__FeaturePathTo__Group__0 )
            {
             before(grammarAccess.getFeaturePathToAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:468:1: ( rule__FeaturePathTo__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:468:2: rule__FeaturePathTo__Group__0
            {
            pushFollow(FOLLOW_rule__FeaturePathTo__Group__0_in_ruleFeaturePathTo934);
            rule__FeaturePathTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeaturePathTo"


    // $ANTLR start "entryRulePathHead"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:480:1: entryRulePathHead : rulePathHead EOF ;
    public final void entryRulePathHead() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:481:1: ( rulePathHead EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:482:1: rulePathHead EOF
            {
             before(grammarAccess.getPathHeadRule()); 
            pushFollow(FOLLOW_rulePathHead_in_entryRulePathHead961);
            rulePathHead();

            state._fsp--;

             after(grammarAccess.getPathHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathHead968); 

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
    // $ANTLR end "entryRulePathHead"


    // $ANTLR start "rulePathHead"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:489:1: rulePathHead : ( ( rule__PathHead__Group__0 ) ) ;
    public final void rulePathHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:493:2: ( ( ( rule__PathHead__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:494:1: ( ( rule__PathHead__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:494:1: ( ( rule__PathHead__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:495:1: ( rule__PathHead__Group__0 )
            {
             before(grammarAccess.getPathHeadAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:496:1: ( rule__PathHead__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:496:2: rule__PathHead__Group__0
            {
            pushFollow(FOLLOW_rule__PathHead__Group__0_in_rulePathHead994);
            rule__PathHead__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathHeadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathHead"


    // $ANTLR start "entryRulePathTail"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:508:1: entryRulePathTail : rulePathTail EOF ;
    public final void entryRulePathTail() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:509:1: ( rulePathTail EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:510:1: rulePathTail EOF
            {
             before(grammarAccess.getPathTailRule()); 
            pushFollow(FOLLOW_rulePathTail_in_entryRulePathTail1021);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getPathTailRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathTail1028); 

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
    // $ANTLR end "entryRulePathTail"


    // $ANTLR start "rulePathTail"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:517:1: rulePathTail : ( ( rule__PathTail__Group__0 ) ) ;
    public final void rulePathTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:521:2: ( ( ( rule__PathTail__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:522:1: ( ( rule__PathTail__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:522:1: ( ( rule__PathTail__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:523:1: ( rule__PathTail__Group__0 )
            {
             before(grammarAccess.getPathTailAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:524:1: ( rule__PathTail__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:524:2: rule__PathTail__Group__0
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0_in_rulePathTail1054);
            rule__PathTail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathTailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathTail"


    // $ANTLR start "entryRuleFileSpecModel"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:538:1: entryRuleFileSpecModel : ruleFileSpecModel EOF ;
    public final void entryRuleFileSpecModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:539:1: ( ruleFileSpecModel EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:540:1: ruleFileSpecModel EOF
            {
             before(grammarAccess.getFileSpecModelRule()); 
            pushFollow(FOLLOW_ruleFileSpecModel_in_entryRuleFileSpecModel1083);
            ruleFileSpecModel();

            state._fsp--;

             after(grammarAccess.getFileSpecModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileSpecModel1090); 

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
    // $ANTLR end "entryRuleFileSpecModel"


    // $ANTLR start "ruleFileSpecModel"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:547:1: ruleFileSpecModel : ( ( rule__FileSpecModel__Group__0 ) ) ;
    public final void ruleFileSpecModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:551:2: ( ( ( rule__FileSpecModel__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:552:1: ( ( rule__FileSpecModel__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:552:1: ( ( rule__FileSpecModel__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:553:1: ( rule__FileSpecModel__Group__0 )
            {
             before(grammarAccess.getFileSpecModelAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:554:1: ( rule__FileSpecModel__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:554:2: rule__FileSpecModel__Group__0
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group__0_in_ruleFileSpecModel1116);
            rule__FileSpecModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileSpecModel"


    // $ANTLR start "entryRuleSpecLine"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:566:1: entryRuleSpecLine : ruleSpecLine EOF ;
    public final void entryRuleSpecLine() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:567:1: ( ruleSpecLine EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:568:1: ruleSpecLine EOF
            {
             before(grammarAccess.getSpecLineRule()); 
            pushFollow(FOLLOW_ruleSpecLine_in_entryRuleSpecLine1143);
            ruleSpecLine();

            state._fsp--;

             after(grammarAccess.getSpecLineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecLine1150); 

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
    // $ANTLR end "entryRuleSpecLine"


    // $ANTLR start "ruleSpecLine"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:575:1: ruleSpecLine : ( ( rule__SpecLine__Alternatives ) ) ;
    public final void ruleSpecLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:579:2: ( ( ( rule__SpecLine__Alternatives ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:580:1: ( ( rule__SpecLine__Alternatives ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:580:1: ( ( rule__SpecLine__Alternatives ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:581:1: ( rule__SpecLine__Alternatives )
            {
             before(grammarAccess.getSpecLineAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:582:1: ( rule__SpecLine__Alternatives )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:582:2: rule__SpecLine__Alternatives
            {
            pushFollow(FOLLOW_rule__SpecLine__Alternatives_in_ruleSpecLine1176);
            rule__SpecLine__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecLineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecLine"


    // $ANTLR start "entryRuleSpecInfo"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:594:1: entryRuleSpecInfo : ruleSpecInfo EOF ;
    public final void entryRuleSpecInfo() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:595:1: ( ruleSpecInfo EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:596:1: ruleSpecInfo EOF
            {
             before(grammarAccess.getSpecInfoRule()); 
            pushFollow(FOLLOW_ruleSpecInfo_in_entryRuleSpecInfo1203);
            ruleSpecInfo();

            state._fsp--;

             after(grammarAccess.getSpecInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecInfo1210); 

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
    // $ANTLR end "entryRuleSpecInfo"


    // $ANTLR start "ruleSpecInfo"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:603:1: ruleSpecInfo : ( ( rule__SpecInfo__Group__0 ) ) ;
    public final void ruleSpecInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:607:2: ( ( ( rule__SpecInfo__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:608:1: ( ( rule__SpecInfo__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:608:1: ( ( rule__SpecInfo__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:609:1: ( rule__SpecInfo__Group__0 )
            {
             before(grammarAccess.getSpecInfoAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:610:1: ( rule__SpecInfo__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:610:2: rule__SpecInfo__Group__0
            {
            pushFollow(FOLLOW_rule__SpecInfo__Group__0_in_ruleSpecInfo1236);
            rule__SpecInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecInfo"


    // $ANTLR start "entryRuleSpecVersion"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:622:1: entryRuleSpecVersion : ruleSpecVersion EOF ;
    public final void entryRuleSpecVersion() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:623:1: ( ruleSpecVersion EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:624:1: ruleSpecVersion EOF
            {
             before(grammarAccess.getSpecVersionRule()); 
            pushFollow(FOLLOW_ruleSpecVersion_in_entryRuleSpecVersion1263);
            ruleSpecVersion();

            state._fsp--;

             after(grammarAccess.getSpecVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecVersion1270); 

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
    // $ANTLR end "entryRuleSpecVersion"


    // $ANTLR start "ruleSpecVersion"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:631:1: ruleSpecVersion : ( ( rule__SpecVersion__Group__0 ) ) ;
    public final void ruleSpecVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:635:2: ( ( ( rule__SpecVersion__Group__0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:636:1: ( ( rule__SpecVersion__Group__0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:636:1: ( ( rule__SpecVersion__Group__0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:637:1: ( rule__SpecVersion__Group__0 )
            {
             before(grammarAccess.getSpecVersionAccess().getGroup()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:638:1: ( rule__SpecVersion__Group__0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:638:2: rule__SpecVersion__Group__0
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group__0_in_ruleSpecVersion1296);
            rule__SpecVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecVersion"


    // $ANTLR start "entryRuleTerminalExpression"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:650:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:651:1: ( ruleTerminalExpression EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:652:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1323);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1330); 

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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:659:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:663:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:664:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:664:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:665:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:666:1: ( rule__TerminalExpression__Alternatives )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:666:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1356);
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


    // $ANTLR start "entryRuleIntVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:678:1: entryRuleIntVar : ruleIntVar EOF ;
    public final void entryRuleIntVar() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:679:1: ( ruleIntVar EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:680:1: ruleIntVar EOF
            {
             before(grammarAccess.getIntVarRule()); 
            pushFollow(FOLLOW_ruleIntVar_in_entryRuleIntVar1383);
            ruleIntVar();

            state._fsp--;

             after(grammarAccess.getIntVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVar1390); 

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
    // $ANTLR end "entryRuleIntVar"


    // $ANTLR start "ruleIntVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:687:1: ruleIntVar : ( ( rule__IntVar__ValueAssignment ) ) ;
    public final void ruleIntVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:691:2: ( ( ( rule__IntVar__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:692:1: ( ( rule__IntVar__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:692:1: ( ( rule__IntVar__ValueAssignment ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:693:1: ( rule__IntVar__ValueAssignment )
            {
             before(grammarAccess.getIntVarAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:694:1: ( rule__IntVar__ValueAssignment )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:694:2: rule__IntVar__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntVar__ValueAssignment_in_ruleIntVar1416);
            rule__IntVar__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVar"


    // $ANTLR start "entryRuleNumberVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:706:1: entryRuleNumberVar : ruleNumberVar EOF ;
    public final void entryRuleNumberVar() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:707:1: ( ruleNumberVar EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:708:1: ruleNumberVar EOF
            {
             before(grammarAccess.getNumberVarRule()); 
            pushFollow(FOLLOW_ruleNumberVar_in_entryRuleNumberVar1443);
            ruleNumberVar();

            state._fsp--;

             after(grammarAccess.getNumberVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberVar1450); 

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
    // $ANTLR end "entryRuleNumberVar"


    // $ANTLR start "ruleNumberVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:715:1: ruleNumberVar : ( ( rule__NumberVar__ValueAssignment ) ) ;
    public final void ruleNumberVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:719:2: ( ( ( rule__NumberVar__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:720:1: ( ( rule__NumberVar__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:720:1: ( ( rule__NumberVar__ValueAssignment ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:721:1: ( rule__NumberVar__ValueAssignment )
            {
             before(grammarAccess.getNumberVarAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:722:1: ( rule__NumberVar__ValueAssignment )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:722:2: rule__NumberVar__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberVar__ValueAssignment_in_ruleNumberVar1476);
            rule__NumberVar__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberVarAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberVar"


    // $ANTLR start "entryRuleStringVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:734:1: entryRuleStringVar : ruleStringVar EOF ;
    public final void entryRuleStringVar() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:735:1: ( ruleStringVar EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:736:1: ruleStringVar EOF
            {
             before(grammarAccess.getStringVarRule()); 
            pushFollow(FOLLOW_ruleStringVar_in_entryRuleStringVar1503);
            ruleStringVar();

            state._fsp--;

             after(grammarAccess.getStringVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVar1510); 

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
    // $ANTLR end "entryRuleStringVar"


    // $ANTLR start "ruleStringVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:743:1: ruleStringVar : ( ( rule__StringVar__ValueAssignment ) ) ;
    public final void ruleStringVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:747:2: ( ( ( rule__StringVar__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:748:1: ( ( rule__StringVar__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:748:1: ( ( rule__StringVar__ValueAssignment ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:749:1: ( rule__StringVar__ValueAssignment )
            {
             before(grammarAccess.getStringVarAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:750:1: ( rule__StringVar__ValueAssignment )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:750:2: rule__StringVar__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringVar__ValueAssignment_in_ruleStringVar1536);
            rule__StringVar__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringVarAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringVar"


    // $ANTLR start "entryRuleNullVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:762:1: entryRuleNullVar : ruleNullVar EOF ;
    public final void entryRuleNullVar() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:763:1: ( ruleNullVar EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:764:1: ruleNullVar EOF
            {
             before(grammarAccess.getNullVarRule()); 
            pushFollow(FOLLOW_ruleNullVar_in_entryRuleNullVar1563);
            ruleNullVar();

            state._fsp--;

             after(grammarAccess.getNullVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullVar1570); 

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
    // $ANTLR end "entryRuleNullVar"


    // $ANTLR start "ruleNullVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:771:1: ruleNullVar : ( ( rule__NullVar__ValueAssignment ) ) ;
    public final void ruleNullVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:775:2: ( ( ( rule__NullVar__ValueAssignment ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:776:1: ( ( rule__NullVar__ValueAssignment ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:776:1: ( ( rule__NullVar__ValueAssignment ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:777:1: ( rule__NullVar__ValueAssignment )
            {
             before(grammarAccess.getNullVarAccess().getValueAssignment()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:778:1: ( rule__NullVar__ValueAssignment )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:778:2: rule__NullVar__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NullVar__ValueAssignment_in_ruleNullVar1596);
            rule__NullVar__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullVarAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullVar"


    // $ANTLR start "entryRuleBoolVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:790:1: entryRuleBoolVar : ruleBoolVar EOF ;
    public final void entryRuleBoolVar() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:791:1: ( ruleBoolVar EOF )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:792:1: ruleBoolVar EOF
            {
             before(grammarAccess.getBoolVarRule()); 
            pushFollow(FOLLOW_ruleBoolVar_in_entryRuleBoolVar1623);
            ruleBoolVar();

            state._fsp--;

             after(grammarAccess.getBoolVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolVar1630); 

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
    // $ANTLR end "entryRuleBoolVar"


    // $ANTLR start "ruleBoolVar"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:799:1: ruleBoolVar : ( ( rule__BoolVar__Alternatives ) ) ;
    public final void ruleBoolVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:803:2: ( ( ( rule__BoolVar__Alternatives ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:804:1: ( ( rule__BoolVar__Alternatives ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:804:1: ( ( rule__BoolVar__Alternatives ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:805:1: ( rule__BoolVar__Alternatives )
            {
             before(grammarAccess.getBoolVarAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:806:1: ( rule__BoolVar__Alternatives )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:806:2: rule__BoolVar__Alternatives
            {
            pushFollow(FOLLOW_rule__BoolVar__Alternatives_in_ruleBoolVar1656);
            rule__BoolVar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolVarAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolVar"


    // $ANTLR start "ruleInOut"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:819:1: ruleInOut : ( ( rule__InOut__Alternatives ) ) ;
    public final void ruleInOut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:823:1: ( ( ( rule__InOut__Alternatives ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:824:1: ( ( rule__InOut__Alternatives ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:824:1: ( ( rule__InOut__Alternatives ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:825:1: ( rule__InOut__Alternatives )
            {
             before(grammarAccess.getInOutAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:826:1: ( rule__InOut__Alternatives )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:826:2: rule__InOut__Alternatives
            {
            pushFollow(FOLLOW_rule__InOut__Alternatives_in_ruleInOut1693);
            rule__InOut__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInOutAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInOut"


    // $ANTLR start "rule__Action__Alternatives"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:837:1: rule__Action__Alternatives : ( ( ruleFunctionDef ) | ( ruleRuleDef ) | ( ruleFeatureSet ) | ( ruleFeaturePath ) | ( ruleCallMapEntity ) | ( ruleDocument ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:841:1: ( ( ruleFunctionDef ) | ( ruleRuleDef ) | ( ruleFeatureSet ) | ( ruleFeaturePath ) | ( ruleCallMapEntity ) | ( ruleDocument ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case 29:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:842:1: ( ruleFunctionDef )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:842:1: ( ruleFunctionDef )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:843:1: ruleFunctionDef
                    {
                     before(grammarAccess.getActionAccess().getFunctionDefParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionDef_in_rule__Action__Alternatives1728);
                    ruleFunctionDef();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFunctionDefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:848:6: ( ruleRuleDef )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:848:6: ( ruleRuleDef )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:849:1: ruleRuleDef
                    {
                     before(grammarAccess.getActionAccess().getRuleDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRuleDef_in_rule__Action__Alternatives1745);
                    ruleRuleDef();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getRuleDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:854:6: ( ruleFeatureSet )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:854:6: ( ruleFeatureSet )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:855:1: ruleFeatureSet
                    {
                     before(grammarAccess.getActionAccess().getFeatureSetParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFeatureSet_in_rule__Action__Alternatives1762);
                    ruleFeatureSet();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFeatureSetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:860:6: ( ruleFeaturePath )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:860:6: ( ruleFeaturePath )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:861:1: ruleFeaturePath
                    {
                     before(grammarAccess.getActionAccess().getFeaturePathParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFeaturePath_in_rule__Action__Alternatives1779);
                    ruleFeaturePath();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFeaturePathParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:866:6: ( ruleCallMapEntity )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:866:6: ( ruleCallMapEntity )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:867:1: ruleCallMapEntity
                    {
                     before(grammarAccess.getActionAccess().getCallMapEntityParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCallMapEntity_in_rule__Action__Alternatives1796);
                    ruleCallMapEntity();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getCallMapEntityParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:872:6: ( ruleDocument )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:872:6: ( ruleDocument )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:873:1: ruleDocument
                    {
                     before(grammarAccess.getActionAccess().getDocumentParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleDocument_in_rule__Action__Alternatives1813);
                    ruleDocument();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getDocumentParserRuleCall_5()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__SpecLine__Alternatives"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:884:1: rule__SpecLine__Alternatives : ( ( ruleSpecInfo ) | ( ruleSpecVersion ) );
    public final void rule__SpecLine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:888:1: ( ( ruleSpecInfo ) | ( ruleSpecVersion ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:889:1: ( ruleSpecInfo )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:889:1: ( ruleSpecInfo )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:890:1: ruleSpecInfo
                    {
                     before(grammarAccess.getSpecLineAccess().getSpecInfoParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSpecInfo_in_rule__SpecLine__Alternatives1846);
                    ruleSpecInfo();

                    state._fsp--;

                     after(grammarAccess.getSpecLineAccess().getSpecInfoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:895:6: ( ruleSpecVersion )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:895:6: ( ruleSpecVersion )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:896:1: ruleSpecVersion
                    {
                     before(grammarAccess.getSpecLineAccess().getSpecVersionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSpecVersion_in_rule__SpecLine__Alternatives1863);
                    ruleSpecVersion();

                    state._fsp--;

                     after(grammarAccess.getSpecLineAccess().getSpecVersionParserRuleCall_1()); 

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
    // $ANTLR end "rule__SpecLine__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:906:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__IntAssignment_0 ) ) | ( ( rule__TerminalExpression__NumberAssignment_1 ) ) | ( ( rule__TerminalExpression__NullAssignment_2 ) ) | ( ( rule__TerminalExpression__BoolAssignment_3 ) ) | ( ( rule__TerminalExpression__StringAssignment_4 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:910:1: ( ( ( rule__TerminalExpression__IntAssignment_0 ) ) | ( ( rule__TerminalExpression__NumberAssignment_1 ) ) | ( ( rule__TerminalExpression__NullAssignment_2 ) ) | ( ( rule__TerminalExpression__BoolAssignment_3 ) ) | ( ( rule__TerminalExpression__StringAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_BIGINT:
                {
                alt3=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt3=2;
                }
                break;
            case 46:
                {
                alt3=3;
                }
                break;
            case 14:
            case 47:
                {
                alt3=4;
                }
                break;
            case RULE_STRING:
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
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:911:1: ( ( rule__TerminalExpression__IntAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:911:1: ( ( rule__TerminalExpression__IntAssignment_0 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:912:1: ( rule__TerminalExpression__IntAssignment_0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getIntAssignment_0()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:913:1: ( rule__TerminalExpression__IntAssignment_0 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:913:2: rule__TerminalExpression__IntAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__IntAssignment_0_in_rule__TerminalExpression__Alternatives1895);
                    rule__TerminalExpression__IntAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getIntAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:917:6: ( ( rule__TerminalExpression__NumberAssignment_1 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:917:6: ( ( rule__TerminalExpression__NumberAssignment_1 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:918:1: ( rule__TerminalExpression__NumberAssignment_1 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNumberAssignment_1()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:919:1: ( rule__TerminalExpression__NumberAssignment_1 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:919:2: rule__TerminalExpression__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__NumberAssignment_1_in_rule__TerminalExpression__Alternatives1913);
                    rule__TerminalExpression__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:923:6: ( ( rule__TerminalExpression__NullAssignment_2 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:923:6: ( ( rule__TerminalExpression__NullAssignment_2 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:924:1: ( rule__TerminalExpression__NullAssignment_2 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getNullAssignment_2()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:925:1: ( rule__TerminalExpression__NullAssignment_2 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:925:2: rule__TerminalExpression__NullAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__NullAssignment_2_in_rule__TerminalExpression__Alternatives1931);
                    rule__TerminalExpression__NullAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getNullAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:929:6: ( ( rule__TerminalExpression__BoolAssignment_3 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:929:6: ( ( rule__TerminalExpression__BoolAssignment_3 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:930:1: ( rule__TerminalExpression__BoolAssignment_3 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_3()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:931:1: ( rule__TerminalExpression__BoolAssignment_3 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:931:2: rule__TerminalExpression__BoolAssignment_3
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__BoolAssignment_3_in_rule__TerminalExpression__Alternatives1949);
                    rule__TerminalExpression__BoolAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getBoolAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:935:6: ( ( rule__TerminalExpression__StringAssignment_4 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:935:6: ( ( rule__TerminalExpression__StringAssignment_4 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:936:1: ( rule__TerminalExpression__StringAssignment_4 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getStringAssignment_4()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:937:1: ( rule__TerminalExpression__StringAssignment_4 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:937:2: rule__TerminalExpression__StringAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__StringAssignment_4_in_rule__TerminalExpression__Alternatives1967);
                    rule__TerminalExpression__StringAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getStringAssignment_4()); 

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


    // $ANTLR start "rule__BoolVar__Alternatives"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:946:1: rule__BoolVar__Alternatives : ( ( ( rule__BoolVar__ValueAssignment_0 ) ) | ( 'false' ) );
    public final void rule__BoolVar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:950:1: ( ( ( rule__BoolVar__ValueAssignment_0 ) ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:951:1: ( ( rule__BoolVar__ValueAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:951:1: ( ( rule__BoolVar__ValueAssignment_0 ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:952:1: ( rule__BoolVar__ValueAssignment_0 )
                    {
                     before(grammarAccess.getBoolVarAccess().getValueAssignment_0()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:953:1: ( rule__BoolVar__ValueAssignment_0 )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:953:2: rule__BoolVar__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BoolVar__ValueAssignment_0_in_rule__BoolVar__Alternatives2000);
                    rule__BoolVar__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoolVarAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:957:6: ( 'false' )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:957:6: ( 'false' )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:958:1: 'false'
                    {
                     before(grammarAccess.getBoolVarAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__BoolVar__Alternatives2019); 
                     after(grammarAccess.getBoolVarAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__BoolVar__Alternatives"


    // $ANTLR start "rule__InOut__Alternatives"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:970:1: rule__InOut__Alternatives : ( ( ( 'In' ) ) | ( ( 'Out' ) ) );
    public final void rule__InOut__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:974:1: ( ( ( 'In' ) ) | ( ( 'Out' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:975:1: ( ( 'In' ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:975:1: ( ( 'In' ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:976:1: ( 'In' )
                    {
                     before(grammarAccess.getInOutAccess().getInEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:977:1: ( 'In' )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:977:3: 'In'
                    {
                    match(input,15,FOLLOW_15_in_rule__InOut__Alternatives2054); 

                    }

                     after(grammarAccess.getInOutAccess().getInEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:982:6: ( ( 'Out' ) )
                    {
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:982:6: ( ( 'Out' ) )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:983:1: ( 'Out' )
                    {
                     before(grammarAccess.getInOutAccess().getOutEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:984:1: ( 'Out' )
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:984:3: 'Out'
                    {
                    match(input,16,FOLLOW_16_in_rule__InOut__Alternatives2075); 

                    }

                     after(grammarAccess.getInOutAccess().getOutEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__InOut__Alternatives"


    // $ANTLR start "rule__ModelMap__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:996:1: rule__ModelMap__Group__0 : rule__ModelMap__Group__0__Impl rule__ModelMap__Group__1 ;
    public final void rule__ModelMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1000:1: ( rule__ModelMap__Group__0__Impl rule__ModelMap__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1001:2: rule__ModelMap__Group__0__Impl rule__ModelMap__Group__1
            {
            pushFollow(FOLLOW_rule__ModelMap__Group__0__Impl_in_rule__ModelMap__Group__02108);
            rule__ModelMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMap__Group__1_in_rule__ModelMap__Group__02111);
            rule__ModelMap__Group__1();

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
    // $ANTLR end "rule__ModelMap__Group__0"


    // $ANTLR start "rule__ModelMap__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1008:1: rule__ModelMap__Group__0__Impl : ( ( rule__ModelMap__Group_0__0 )? ) ;
    public final void rule__ModelMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1012:1: ( ( ( rule__ModelMap__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1013:1: ( ( rule__ModelMap__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1013:1: ( ( rule__ModelMap__Group_0__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1014:1: ( rule__ModelMap__Group_0__0 )?
            {
             before(grammarAccess.getModelMapAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1015:1: ( rule__ModelMap__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1015:2: rule__ModelMap__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ModelMap__Group_0__0_in_rule__ModelMap__Group__0__Impl2138);
                    rule__ModelMap__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelMapAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group__0__Impl"


    // $ANTLR start "rule__ModelMap__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1025:1: rule__ModelMap__Group__1 : rule__ModelMap__Group__1__Impl rule__ModelMap__Group__2 ;
    public final void rule__ModelMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1029:1: ( rule__ModelMap__Group__1__Impl rule__ModelMap__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1030:2: rule__ModelMap__Group__1__Impl rule__ModelMap__Group__2
            {
            pushFollow(FOLLOW_rule__ModelMap__Group__1__Impl_in_rule__ModelMap__Group__12169);
            rule__ModelMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMap__Group__2_in_rule__ModelMap__Group__12172);
            rule__ModelMap__Group__2();

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
    // $ANTLR end "rule__ModelMap__Group__1"


    // $ANTLR start "rule__ModelMap__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1037:1: rule__ModelMap__Group__1__Impl : ( ( rule__ModelMap__ImportsAssignment_1 )* ) ;
    public final void rule__ModelMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1041:1: ( ( ( rule__ModelMap__ImportsAssignment_1 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1042:1: ( ( rule__ModelMap__ImportsAssignment_1 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1042:1: ( ( rule__ModelMap__ImportsAssignment_1 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1043:1: ( rule__ModelMap__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelMapAccess().getImportsAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1044:1: ( rule__ModelMap__ImportsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1044:2: rule__ModelMap__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ModelMap__ImportsAssignment_1_in_rule__ModelMap__Group__1__Impl2199);
            	    rule__ModelMap__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelMapAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group__1__Impl"


    // $ANTLR start "rule__ModelMap__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1054:1: rule__ModelMap__Group__2 : rule__ModelMap__Group__2__Impl rule__ModelMap__Group__3 ;
    public final void rule__ModelMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1058:1: ( rule__ModelMap__Group__2__Impl rule__ModelMap__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1059:2: rule__ModelMap__Group__2__Impl rule__ModelMap__Group__3
            {
            pushFollow(FOLLOW_rule__ModelMap__Group__2__Impl_in_rule__ModelMap__Group__22230);
            rule__ModelMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMap__Group__3_in_rule__ModelMap__Group__22233);
            rule__ModelMap__Group__3();

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
    // $ANTLR end "rule__ModelMap__Group__2"


    // $ANTLR start "rule__ModelMap__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1066:1: rule__ModelMap__Group__2__Impl : ( ( rule__ModelMap__RulesAssignment_2 )* ) ;
    public final void rule__ModelMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1070:1: ( ( ( rule__ModelMap__RulesAssignment_2 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1071:1: ( ( rule__ModelMap__RulesAssignment_2 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1071:1: ( ( rule__ModelMap__RulesAssignment_2 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1072:1: ( rule__ModelMap__RulesAssignment_2 )*
            {
             before(grammarAccess.getModelMapAccess().getRulesAssignment_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1073:1: ( rule__ModelMap__RulesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1073:2: rule__ModelMap__RulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ModelMap__RulesAssignment_2_in_rule__ModelMap__Group__2__Impl2260);
            	    rule__ModelMap__RulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelMapAccess().getRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group__2__Impl"


    // $ANTLR start "rule__ModelMap__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1083:1: rule__ModelMap__Group__3 : rule__ModelMap__Group__3__Impl ;
    public final void rule__ModelMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1087:1: ( rule__ModelMap__Group__3__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1088:2: rule__ModelMap__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelMap__Group__3__Impl_in_rule__ModelMap__Group__32291);
            rule__ModelMap__Group__3__Impl();

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
    // $ANTLR end "rule__ModelMap__Group__3"


    // $ANTLR start "rule__ModelMap__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1094:1: rule__ModelMap__Group__3__Impl : ( ( rule__ModelMap__MappingAssignment_3 )* ) ;
    public final void rule__ModelMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1098:1: ( ( ( rule__ModelMap__MappingAssignment_3 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1099:1: ( ( rule__ModelMap__MappingAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1099:1: ( ( rule__ModelMap__MappingAssignment_3 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1100:1: ( rule__ModelMap__MappingAssignment_3 )*
            {
             before(grammarAccess.getModelMapAccess().getMappingAssignment_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1101:1: ( rule__ModelMap__MappingAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1101:2: rule__ModelMap__MappingAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ModelMap__MappingAssignment_3_in_rule__ModelMap__Group__3__Impl2318);
            	    rule__ModelMap__MappingAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelMapAccess().getMappingAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group__3__Impl"


    // $ANTLR start "rule__ModelMap__Group_0__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1119:1: rule__ModelMap__Group_0__0 : rule__ModelMap__Group_0__0__Impl rule__ModelMap__Group_0__1 ;
    public final void rule__ModelMap__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1123:1: ( rule__ModelMap__Group_0__0__Impl rule__ModelMap__Group_0__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1124:2: rule__ModelMap__Group_0__0__Impl rule__ModelMap__Group_0__1
            {
            pushFollow(FOLLOW_rule__ModelMap__Group_0__0__Impl_in_rule__ModelMap__Group_0__02357);
            rule__ModelMap__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMap__Group_0__1_in_rule__ModelMap__Group_0__02360);
            rule__ModelMap__Group_0__1();

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
    // $ANTLR end "rule__ModelMap__Group_0__0"


    // $ANTLR start "rule__ModelMap__Group_0__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1131:1: rule__ModelMap__Group_0__0__Impl : ( '[' ) ;
    public final void rule__ModelMap__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1135:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1136:1: ( '[' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1136:1: ( '[' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1137:1: '['
            {
             before(grammarAccess.getModelMapAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__ModelMap__Group_0__0__Impl2388); 
             after(grammarAccess.getModelMapAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group_0__0__Impl"


    // $ANTLR start "rule__ModelMap__Group_0__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1150:1: rule__ModelMap__Group_0__1 : rule__ModelMap__Group_0__1__Impl rule__ModelMap__Group_0__2 ;
    public final void rule__ModelMap__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1154:1: ( rule__ModelMap__Group_0__1__Impl rule__ModelMap__Group_0__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1155:2: rule__ModelMap__Group_0__1__Impl rule__ModelMap__Group_0__2
            {
            pushFollow(FOLLOW_rule__ModelMap__Group_0__1__Impl_in_rule__ModelMap__Group_0__12419);
            rule__ModelMap__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMap__Group_0__2_in_rule__ModelMap__Group_0__12422);
            rule__ModelMap__Group_0__2();

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
    // $ANTLR end "rule__ModelMap__Group_0__1"


    // $ANTLR start "rule__ModelMap__Group_0__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1162:1: rule__ModelMap__Group_0__1__Impl : ( ( rule__ModelMap__SpecAssignment_0_1 ) ) ;
    public final void rule__ModelMap__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1166:1: ( ( ( rule__ModelMap__SpecAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1167:1: ( ( rule__ModelMap__SpecAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1167:1: ( ( rule__ModelMap__SpecAssignment_0_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1168:1: ( rule__ModelMap__SpecAssignment_0_1 )
            {
             before(grammarAccess.getModelMapAccess().getSpecAssignment_0_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1169:1: ( rule__ModelMap__SpecAssignment_0_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1169:2: rule__ModelMap__SpecAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ModelMap__SpecAssignment_0_1_in_rule__ModelMap__Group_0__1__Impl2449);
            rule__ModelMap__SpecAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelMapAccess().getSpecAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group_0__1__Impl"


    // $ANTLR start "rule__ModelMap__Group_0__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1179:1: rule__ModelMap__Group_0__2 : rule__ModelMap__Group_0__2__Impl ;
    public final void rule__ModelMap__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1183:1: ( rule__ModelMap__Group_0__2__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1184:2: rule__ModelMap__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelMap__Group_0__2__Impl_in_rule__ModelMap__Group_0__22479);
            rule__ModelMap__Group_0__2__Impl();

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
    // $ANTLR end "rule__ModelMap__Group_0__2"


    // $ANTLR start "rule__ModelMap__Group_0__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1190:1: rule__ModelMap__Group_0__2__Impl : ( ']' ) ;
    public final void rule__ModelMap__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1194:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1195:1: ( ']' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1195:1: ( ']' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1196:1: ']'
            {
             before(grammarAccess.getModelMapAccess().getRightSquareBracketKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__ModelMap__Group_0__2__Impl2507); 
             after(grammarAccess.getModelMapAccess().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__Group_0__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1215:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1219:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1220:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02544);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02547);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1227:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1231:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1232:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1232:1: ( 'import' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1233:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl2575); 
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1246:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1250:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1251:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12606);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1257:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1261:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1262:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1262:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1263:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1264:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1264:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2633);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1278:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1282:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1283:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02667);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02670);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1290:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1294:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1295:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1295:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1296:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2697);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1307:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1311:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1312:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12726);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1318:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1322:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1323:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1323:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1324:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1325:1: ( '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1326:2: '.*'
                    {
                    match(input,20,FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group__1__Impl2755); 

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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1341:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1345:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1346:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02792);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02795);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1353:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1357:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1358:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1358:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1359:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2822); 
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1370:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1374:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1375:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12851);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1381:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1385:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1386:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1386:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1387:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1388:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1388:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2878);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1402:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1406:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1407:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02913);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02916);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1414:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1418:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1419:1: ( '.' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1419:1: ( '.' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1420:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2944); 
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1433:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1437:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1438:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12975);
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
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1444:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1448:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1449:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1449:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1450:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3002); 
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


    // $ANTLR start "rule__MapEntity__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1465:1: rule__MapEntity__Group__0 : rule__MapEntity__Group__0__Impl rule__MapEntity__Group__1 ;
    public final void rule__MapEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1469:1: ( rule__MapEntity__Group__0__Impl rule__MapEntity__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1470:2: rule__MapEntity__Group__0__Impl rule__MapEntity__Group__1
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__0__Impl_in_rule__MapEntity__Group__03035);
            rule__MapEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__1_in_rule__MapEntity__Group__03038);
            rule__MapEntity__Group__1();

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
    // $ANTLR end "rule__MapEntity__Group__0"


    // $ANTLR start "rule__MapEntity__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1477:1: rule__MapEntity__Group__0__Impl : ( 'mapping' ) ;
    public final void rule__MapEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1481:1: ( ( 'mapping' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1482:1: ( 'mapping' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1482:1: ( 'mapping' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1483:1: 'mapping'
            {
             before(grammarAccess.getMapEntityAccess().getMappingKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__MapEntity__Group__0__Impl3066); 
             after(grammarAccess.getMapEntityAccess().getMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__0__Impl"


    // $ANTLR start "rule__MapEntity__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1496:1: rule__MapEntity__Group__1 : rule__MapEntity__Group__1__Impl rule__MapEntity__Group__2 ;
    public final void rule__MapEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1500:1: ( rule__MapEntity__Group__1__Impl rule__MapEntity__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1501:2: rule__MapEntity__Group__1__Impl rule__MapEntity__Group__2
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__1__Impl_in_rule__MapEntity__Group__13097);
            rule__MapEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__2_in_rule__MapEntity__Group__13100);
            rule__MapEntity__Group__2();

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
    // $ANTLR end "rule__MapEntity__Group__1"


    // $ANTLR start "rule__MapEntity__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1508:1: rule__MapEntity__Group__1__Impl : ( ( rule__MapEntity__NameAssignment_1 ) ) ;
    public final void rule__MapEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1512:1: ( ( ( rule__MapEntity__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1513:1: ( ( rule__MapEntity__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1513:1: ( ( rule__MapEntity__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1514:1: ( rule__MapEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMapEntityAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1515:1: ( rule__MapEntity__NameAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1515:2: rule__MapEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapEntity__NameAssignment_1_in_rule__MapEntity__Group__1__Impl3127);
            rule__MapEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__1__Impl"


    // $ANTLR start "rule__MapEntity__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1525:1: rule__MapEntity__Group__2 : rule__MapEntity__Group__2__Impl rule__MapEntity__Group__3 ;
    public final void rule__MapEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1529:1: ( rule__MapEntity__Group__2__Impl rule__MapEntity__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1530:2: rule__MapEntity__Group__2__Impl rule__MapEntity__Group__3
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__2__Impl_in_rule__MapEntity__Group__23157);
            rule__MapEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__3_in_rule__MapEntity__Group__23160);
            rule__MapEntity__Group__3();

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
    // $ANTLR end "rule__MapEntity__Group__2"


    // $ANTLR start "rule__MapEntity__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1537:1: rule__MapEntity__Group__2__Impl : ( 'Entity source' ) ;
    public final void rule__MapEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1541:1: ( ( 'Entity source' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1542:1: ( 'Entity source' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1542:1: ( 'Entity source' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1543:1: 'Entity source'
            {
             before(grammarAccess.getMapEntityAccess().getEntitySourceKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__MapEntity__Group__2__Impl3188); 
             after(grammarAccess.getMapEntityAccess().getEntitySourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__2__Impl"


    // $ANTLR start "rule__MapEntity__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1556:1: rule__MapEntity__Group__3 : rule__MapEntity__Group__3__Impl rule__MapEntity__Group__4 ;
    public final void rule__MapEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1560:1: ( rule__MapEntity__Group__3__Impl rule__MapEntity__Group__4 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1561:2: rule__MapEntity__Group__3__Impl rule__MapEntity__Group__4
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__3__Impl_in_rule__MapEntity__Group__33219);
            rule__MapEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__4_in_rule__MapEntity__Group__33222);
            rule__MapEntity__Group__4();

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
    // $ANTLR end "rule__MapEntity__Group__3"


    // $ANTLR start "rule__MapEntity__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1568:1: rule__MapEntity__Group__3__Impl : ( ( rule__MapEntity__EntityFromAssignment_3 ) ) ;
    public final void rule__MapEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1572:1: ( ( ( rule__MapEntity__EntityFromAssignment_3 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1573:1: ( ( rule__MapEntity__EntityFromAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1573:1: ( ( rule__MapEntity__EntityFromAssignment_3 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1574:1: ( rule__MapEntity__EntityFromAssignment_3 )
            {
             before(grammarAccess.getMapEntityAccess().getEntityFromAssignment_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1575:1: ( rule__MapEntity__EntityFromAssignment_3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1575:2: rule__MapEntity__EntityFromAssignment_3
            {
            pushFollow(FOLLOW_rule__MapEntity__EntityFromAssignment_3_in_rule__MapEntity__Group__3__Impl3249);
            rule__MapEntity__EntityFromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapEntityAccess().getEntityFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__3__Impl"


    // $ANTLR start "rule__MapEntity__Group__4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1585:1: rule__MapEntity__Group__4 : rule__MapEntity__Group__4__Impl rule__MapEntity__Group__5 ;
    public final void rule__MapEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1589:1: ( rule__MapEntity__Group__4__Impl rule__MapEntity__Group__5 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1590:2: rule__MapEntity__Group__4__Impl rule__MapEntity__Group__5
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__4__Impl_in_rule__MapEntity__Group__43279);
            rule__MapEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__5_in_rule__MapEntity__Group__43282);
            rule__MapEntity__Group__5();

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
    // $ANTLR end "rule__MapEntity__Group__4"


    // $ANTLR start "rule__MapEntity__Group__4__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1597:1: rule__MapEntity__Group__4__Impl : ( 'Entity target' ) ;
    public final void rule__MapEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1601:1: ( ( 'Entity target' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1602:1: ( 'Entity target' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1602:1: ( 'Entity target' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1603:1: 'Entity target'
            {
             before(grammarAccess.getMapEntityAccess().getEntityTargetKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__MapEntity__Group__4__Impl3310); 
             after(grammarAccess.getMapEntityAccess().getEntityTargetKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__4__Impl"


    // $ANTLR start "rule__MapEntity__Group__5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1616:1: rule__MapEntity__Group__5 : rule__MapEntity__Group__5__Impl rule__MapEntity__Group__6 ;
    public final void rule__MapEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1620:1: ( rule__MapEntity__Group__5__Impl rule__MapEntity__Group__6 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1621:2: rule__MapEntity__Group__5__Impl rule__MapEntity__Group__6
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__5__Impl_in_rule__MapEntity__Group__53341);
            rule__MapEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__6_in_rule__MapEntity__Group__53344);
            rule__MapEntity__Group__6();

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
    // $ANTLR end "rule__MapEntity__Group__5"


    // $ANTLR start "rule__MapEntity__Group__5__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1628:1: rule__MapEntity__Group__5__Impl : ( ( rule__MapEntity__EntityToAssignment_5 ) ) ;
    public final void rule__MapEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1632:1: ( ( ( rule__MapEntity__EntityToAssignment_5 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1633:1: ( ( rule__MapEntity__EntityToAssignment_5 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1633:1: ( ( rule__MapEntity__EntityToAssignment_5 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1634:1: ( rule__MapEntity__EntityToAssignment_5 )
            {
             before(grammarAccess.getMapEntityAccess().getEntityToAssignment_5()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1635:1: ( rule__MapEntity__EntityToAssignment_5 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1635:2: rule__MapEntity__EntityToAssignment_5
            {
            pushFollow(FOLLOW_rule__MapEntity__EntityToAssignment_5_in_rule__MapEntity__Group__5__Impl3371);
            rule__MapEntity__EntityToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMapEntityAccess().getEntityToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__5__Impl"


    // $ANTLR start "rule__MapEntity__Group__6"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1645:1: rule__MapEntity__Group__6 : rule__MapEntity__Group__6__Impl rule__MapEntity__Group__7 ;
    public final void rule__MapEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1649:1: ( rule__MapEntity__Group__6__Impl rule__MapEntity__Group__7 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1650:2: rule__MapEntity__Group__6__Impl rule__MapEntity__Group__7
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__6__Impl_in_rule__MapEntity__Group__63401);
            rule__MapEntity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__7_in_rule__MapEntity__Group__63404);
            rule__MapEntity__Group__7();

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
    // $ANTLR end "rule__MapEntity__Group__6"


    // $ANTLR start "rule__MapEntity__Group__6__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1657:1: rule__MapEntity__Group__6__Impl : ( '(' ) ;
    public final void rule__MapEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1661:1: ( ( '(' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1662:1: ( '(' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1662:1: ( '(' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1663:1: '('
            {
             before(grammarAccess.getMapEntityAccess().getLeftParenthesisKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__MapEntity__Group__6__Impl3432); 
             after(grammarAccess.getMapEntityAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__6__Impl"


    // $ANTLR start "rule__MapEntity__Group__7"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1676:1: rule__MapEntity__Group__7 : rule__MapEntity__Group__7__Impl rule__MapEntity__Group__8 ;
    public final void rule__MapEntity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1680:1: ( rule__MapEntity__Group__7__Impl rule__MapEntity__Group__8 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1681:2: rule__MapEntity__Group__7__Impl rule__MapEntity__Group__8
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__7__Impl_in_rule__MapEntity__Group__73463);
            rule__MapEntity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapEntity__Group__8_in_rule__MapEntity__Group__73466);
            rule__MapEntity__Group__8();

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
    // $ANTLR end "rule__MapEntity__Group__7"


    // $ANTLR start "rule__MapEntity__Group__7__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1688:1: rule__MapEntity__Group__7__Impl : ( ( rule__MapEntity__ActionsAssignment_7 )* ) ;
    public final void rule__MapEntity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1692:1: ( ( ( rule__MapEntity__ActionsAssignment_7 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1693:1: ( ( rule__MapEntity__ActionsAssignment_7 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1693:1: ( ( rule__MapEntity__ActionsAssignment_7 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1694:1: ( rule__MapEntity__ActionsAssignment_7 )*
            {
             before(grammarAccess.getMapEntityAccess().getActionsAssignment_7()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1695:1: ( rule__MapEntity__ActionsAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27||(LA12_0>=29 && LA12_0<=30)||LA12_0==32||LA12_0==36||LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1695:2: rule__MapEntity__ActionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__MapEntity__ActionsAssignment_7_in_rule__MapEntity__Group__7__Impl3493);
            	    rule__MapEntity__ActionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMapEntityAccess().getActionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__7__Impl"


    // $ANTLR start "rule__MapEntity__Group__8"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1705:1: rule__MapEntity__Group__8 : rule__MapEntity__Group__8__Impl ;
    public final void rule__MapEntity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1709:1: ( rule__MapEntity__Group__8__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1710:2: rule__MapEntity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__MapEntity__Group__8__Impl_in_rule__MapEntity__Group__83524);
            rule__MapEntity__Group__8__Impl();

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
    // $ANTLR end "rule__MapEntity__Group__8"


    // $ANTLR start "rule__MapEntity__Group__8__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1716:1: rule__MapEntity__Group__8__Impl : ( ')' ) ;
    public final void rule__MapEntity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1720:1: ( ( ')' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1721:1: ( ')' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1721:1: ( ')' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1722:1: ')'
            {
             before(grammarAccess.getMapEntityAccess().getRightParenthesisKeyword_8()); 
            match(input,26,FOLLOW_26_in_rule__MapEntity__Group__8__Impl3552); 
             after(grammarAccess.getMapEntityAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__Group__8__Impl"


    // $ANTLR start "rule__CallMapEntity__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1753:1: rule__CallMapEntity__Group__0 : rule__CallMapEntity__Group__0__Impl rule__CallMapEntity__Group__1 ;
    public final void rule__CallMapEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1757:1: ( rule__CallMapEntity__Group__0__Impl rule__CallMapEntity__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1758:2: rule__CallMapEntity__Group__0__Impl rule__CallMapEntity__Group__1
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group__0__Impl_in_rule__CallMapEntity__Group__03601);
            rule__CallMapEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallMapEntity__Group__1_in_rule__CallMapEntity__Group__03604);
            rule__CallMapEntity__Group__1();

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
    // $ANTLR end "rule__CallMapEntity__Group__0"


    // $ANTLR start "rule__CallMapEntity__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1765:1: rule__CallMapEntity__Group__0__Impl : ( 'use mapping' ) ;
    public final void rule__CallMapEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1769:1: ( ( 'use mapping' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1770:1: ( 'use mapping' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1770:1: ( 'use mapping' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1771:1: 'use mapping'
            {
             before(grammarAccess.getCallMapEntityAccess().getUseMappingKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__CallMapEntity__Group__0__Impl3632); 
             after(grammarAccess.getCallMapEntityAccess().getUseMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__Group__0__Impl"


    // $ANTLR start "rule__CallMapEntity__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1784:1: rule__CallMapEntity__Group__1 : rule__CallMapEntity__Group__1__Impl rule__CallMapEntity__Group__2 ;
    public final void rule__CallMapEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1788:1: ( rule__CallMapEntity__Group__1__Impl rule__CallMapEntity__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1789:2: rule__CallMapEntity__Group__1__Impl rule__CallMapEntity__Group__2
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group__1__Impl_in_rule__CallMapEntity__Group__13663);
            rule__CallMapEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallMapEntity__Group__2_in_rule__CallMapEntity__Group__13666);
            rule__CallMapEntity__Group__2();

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
    // $ANTLR end "rule__CallMapEntity__Group__1"


    // $ANTLR start "rule__CallMapEntity__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1796:1: rule__CallMapEntity__Group__1__Impl : ( ( rule__CallMapEntity__MappingAssignment_1 ) ) ;
    public final void rule__CallMapEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1800:1: ( ( ( rule__CallMapEntity__MappingAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1801:1: ( ( rule__CallMapEntity__MappingAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1801:1: ( ( rule__CallMapEntity__MappingAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1802:1: ( rule__CallMapEntity__MappingAssignment_1 )
            {
             before(grammarAccess.getCallMapEntityAccess().getMappingAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1803:1: ( rule__CallMapEntity__MappingAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1803:2: rule__CallMapEntity__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__CallMapEntity__MappingAssignment_1_in_rule__CallMapEntity__Group__1__Impl3693);
            rule__CallMapEntity__MappingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCallMapEntityAccess().getMappingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__Group__1__Impl"


    // $ANTLR start "rule__CallMapEntity__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1813:1: rule__CallMapEntity__Group__2 : rule__CallMapEntity__Group__2__Impl ;
    public final void rule__CallMapEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1817:1: ( rule__CallMapEntity__Group__2__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1818:2: rule__CallMapEntity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group__2__Impl_in_rule__CallMapEntity__Group__23723);
            rule__CallMapEntity__Group__2__Impl();

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
    // $ANTLR end "rule__CallMapEntity__Group__2"


    // $ANTLR start "rule__CallMapEntity__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1824:1: rule__CallMapEntity__Group__2__Impl : ( ( rule__CallMapEntity__Group_2__0 )? ) ;
    public final void rule__CallMapEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1828:1: ( ( ( rule__CallMapEntity__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1829:1: ( ( rule__CallMapEntity__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1829:1: ( ( rule__CallMapEntity__Group_2__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1830:1: ( rule__CallMapEntity__Group_2__0 )?
            {
             before(grammarAccess.getCallMapEntityAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1831:1: ( rule__CallMapEntity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1831:2: rule__CallMapEntity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CallMapEntity__Group_2__0_in_rule__CallMapEntity__Group__2__Impl3750);
                    rule__CallMapEntity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallMapEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__Group__2__Impl"


    // $ANTLR start "rule__CallMapEntity__Group_2__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1847:1: rule__CallMapEntity__Group_2__0 : rule__CallMapEntity__Group_2__0__Impl rule__CallMapEntity__Group_2__1 ;
    public final void rule__CallMapEntity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1851:1: ( rule__CallMapEntity__Group_2__0__Impl rule__CallMapEntity__Group_2__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1852:2: rule__CallMapEntity__Group_2__0__Impl rule__CallMapEntity__Group_2__1
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group_2__0__Impl_in_rule__CallMapEntity__Group_2__03787);
            rule__CallMapEntity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CallMapEntity__Group_2__1_in_rule__CallMapEntity__Group_2__03790);
            rule__CallMapEntity__Group_2__1();

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
    // $ANTLR end "rule__CallMapEntity__Group_2__0"


    // $ANTLR start "rule__CallMapEntity__Group_2__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1859:1: rule__CallMapEntity__Group_2__0__Impl : ( 'whith map' ) ;
    public final void rule__CallMapEntity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1863:1: ( ( 'whith map' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1864:1: ( 'whith map' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1864:1: ( 'whith map' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1865:1: 'whith map'
            {
             before(grammarAccess.getCallMapEntityAccess().getWhithMapKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__CallMapEntity__Group_2__0__Impl3818); 
             after(grammarAccess.getCallMapEntityAccess().getWhithMapKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__Group_2__0__Impl"


    // $ANTLR start "rule__CallMapEntity__Group_2__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1878:1: rule__CallMapEntity__Group_2__1 : rule__CallMapEntity__Group_2__1__Impl ;
    public final void rule__CallMapEntity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1882:1: ( rule__CallMapEntity__Group_2__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1883:2: rule__CallMapEntity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMapEntity__Group_2__1__Impl_in_rule__CallMapEntity__Group_2__13849);
            rule__CallMapEntity__Group_2__1__Impl();

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
    // $ANTLR end "rule__CallMapEntity__Group_2__1"


    // $ANTLR start "rule__CallMapEntity__Group_2__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1889:1: rule__CallMapEntity__Group_2__1__Impl : ( ( rule__CallMapEntity__FeaturePathAssignment_2_1 ) ) ;
    public final void rule__CallMapEntity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1893:1: ( ( ( rule__CallMapEntity__FeaturePathAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1894:1: ( ( rule__CallMapEntity__FeaturePathAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1894:1: ( ( rule__CallMapEntity__FeaturePathAssignment_2_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1895:1: ( rule__CallMapEntity__FeaturePathAssignment_2_1 )
            {
             before(grammarAccess.getCallMapEntityAccess().getFeaturePathAssignment_2_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1896:1: ( rule__CallMapEntity__FeaturePathAssignment_2_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1896:2: rule__CallMapEntity__FeaturePathAssignment_2_1
            {
            pushFollow(FOLLOW_rule__CallMapEntity__FeaturePathAssignment_2_1_in_rule__CallMapEntity__Group_2__1__Impl3876);
            rule__CallMapEntity__FeaturePathAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCallMapEntityAccess().getFeaturePathAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__Group_2__1__Impl"


    // $ANTLR start "rule__Document__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1910:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1914:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1915:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03910);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03913);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1922:1: rule__Document__Group__0__Impl : ( 'doc' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1926:1: ( ( 'doc' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1927:1: ( 'doc' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1927:1: ( 'doc' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1928:1: 'doc'
            {
             before(grammarAccess.getDocumentAccess().getDocKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Document__Group__0__Impl3941); 
             after(grammarAccess.getDocumentAccess().getDocKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1941:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1945:1: ( rule__Document__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1946:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13972);
            rule__Document__Group__1__Impl();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1952:1: rule__Document__Group__1__Impl : ( ( rule__Document__DocumentAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1956:1: ( ( ( rule__Document__DocumentAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1957:1: ( ( rule__Document__DocumentAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1957:1: ( ( rule__Document__DocumentAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1958:1: ( rule__Document__DocumentAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getDocumentAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1959:1: ( rule__Document__DocumentAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1959:2: rule__Document__DocumentAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__DocumentAssignment_1_in_rule__Document__Group__1__Impl3999);
            rule__Document__DocumentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getDocumentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__RuleDef__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1973:1: rule__RuleDef__Group__0 : rule__RuleDef__Group__0__Impl rule__RuleDef__Group__1 ;
    public final void rule__RuleDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1977:1: ( rule__RuleDef__Group__0__Impl rule__RuleDef__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1978:2: rule__RuleDef__Group__0__Impl rule__RuleDef__Group__1
            {
            pushFollow(FOLLOW_rule__RuleDef__Group__0__Impl_in_rule__RuleDef__Group__04033);
            rule__RuleDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDef__Group__1_in_rule__RuleDef__Group__04036);
            rule__RuleDef__Group__1();

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
    // $ANTLR end "rule__RuleDef__Group__0"


    // $ANTLR start "rule__RuleDef__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1985:1: rule__RuleDef__Group__0__Impl : ( 'define rule' ) ;
    public final void rule__RuleDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1989:1: ( ( 'define rule' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1990:1: ( 'define rule' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1990:1: ( 'define rule' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:1991:1: 'define rule'
            {
             before(grammarAccess.getRuleDefAccess().getDefineRuleKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__RuleDef__Group__0__Impl4064); 
             after(grammarAccess.getRuleDefAccess().getDefineRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group__0__Impl"


    // $ANTLR start "rule__RuleDef__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2004:1: rule__RuleDef__Group__1 : rule__RuleDef__Group__1__Impl rule__RuleDef__Group__2 ;
    public final void rule__RuleDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2008:1: ( rule__RuleDef__Group__1__Impl rule__RuleDef__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2009:2: rule__RuleDef__Group__1__Impl rule__RuleDef__Group__2
            {
            pushFollow(FOLLOW_rule__RuleDef__Group__1__Impl_in_rule__RuleDef__Group__14095);
            rule__RuleDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDef__Group__2_in_rule__RuleDef__Group__14098);
            rule__RuleDef__Group__2();

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
    // $ANTLR end "rule__RuleDef__Group__1"


    // $ANTLR start "rule__RuleDef__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2016:1: rule__RuleDef__Group__1__Impl : ( ( rule__RuleDef__NameAssignment_1 ) ) ;
    public final void rule__RuleDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2020:1: ( ( ( rule__RuleDef__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2021:1: ( ( rule__RuleDef__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2021:1: ( ( rule__RuleDef__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2022:1: ( rule__RuleDef__NameAssignment_1 )
            {
             before(grammarAccess.getRuleDefAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2023:1: ( rule__RuleDef__NameAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2023:2: rule__RuleDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RuleDef__NameAssignment_1_in_rule__RuleDef__Group__1__Impl4125);
            rule__RuleDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group__1__Impl"


    // $ANTLR start "rule__RuleDef__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2033:1: rule__RuleDef__Group__2 : rule__RuleDef__Group__2__Impl rule__RuleDef__Group__3 ;
    public final void rule__RuleDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2037:1: ( rule__RuleDef__Group__2__Impl rule__RuleDef__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2038:2: rule__RuleDef__Group__2__Impl rule__RuleDef__Group__3
            {
            pushFollow(FOLLOW_rule__RuleDef__Group__2__Impl_in_rule__RuleDef__Group__24155);
            rule__RuleDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDef__Group__3_in_rule__RuleDef__Group__24158);
            rule__RuleDef__Group__3();

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
    // $ANTLR end "rule__RuleDef__Group__2"


    // $ANTLR start "rule__RuleDef__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2045:1: rule__RuleDef__Group__2__Impl : ( ( rule__RuleDef__Group_2__0 )? ) ;
    public final void rule__RuleDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2049:1: ( ( ( rule__RuleDef__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2050:1: ( ( rule__RuleDef__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2050:1: ( ( rule__RuleDef__Group_2__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2051:1: ( rule__RuleDef__Group_2__0 )?
            {
             before(grammarAccess.getRuleDefAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2052:1: ( rule__RuleDef__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2052:2: rule__RuleDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RuleDef__Group_2__0_in_rule__RuleDef__Group__2__Impl4185);
                    rule__RuleDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group__2__Impl"


    // $ANTLR start "rule__RuleDef__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2062:1: rule__RuleDef__Group__3 : rule__RuleDef__Group__3__Impl ;
    public final void rule__RuleDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2066:1: ( rule__RuleDef__Group__3__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2067:2: rule__RuleDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RuleDef__Group__3__Impl_in_rule__RuleDef__Group__34216);
            rule__RuleDef__Group__3__Impl();

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
    // $ANTLR end "rule__RuleDef__Group__3"


    // $ANTLR start "rule__RuleDef__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2073:1: rule__RuleDef__Group__3__Impl : ( ( rule__RuleDef__DescriptionAssignment_3 )? ) ;
    public final void rule__RuleDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2077:1: ( ( ( rule__RuleDef__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2078:1: ( ( rule__RuleDef__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2078:1: ( ( rule__RuleDef__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2079:1: ( rule__RuleDef__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getRuleDefAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2080:1: ( rule__RuleDef__DescriptionAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2080:2: rule__RuleDef__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RuleDef__DescriptionAssignment_3_in_rule__RuleDef__Group__3__Impl4243);
                    rule__RuleDef__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleDefAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group__3__Impl"


    // $ANTLR start "rule__RuleDef__Group_2__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2098:1: rule__RuleDef__Group_2__0 : rule__RuleDef__Group_2__0__Impl rule__RuleDef__Group_2__1 ;
    public final void rule__RuleDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2102:1: ( rule__RuleDef__Group_2__0__Impl rule__RuleDef__Group_2__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2103:2: rule__RuleDef__Group_2__0__Impl rule__RuleDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__RuleDef__Group_2__0__Impl_in_rule__RuleDef__Group_2__04282);
            rule__RuleDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RuleDef__Group_2__1_in_rule__RuleDef__Group_2__04285);
            rule__RuleDef__Group_2__1();

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
    // $ANTLR end "rule__RuleDef__Group_2__0"


    // $ANTLR start "rule__RuleDef__Group_2__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2110:1: rule__RuleDef__Group_2__0__Impl : ( 'operation' ) ;
    public final void rule__RuleDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2114:1: ( ( 'operation' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2115:1: ( 'operation' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2115:1: ( 'operation' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2116:1: 'operation'
            {
             before(grammarAccess.getRuleDefAccess().getOperationKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__RuleDef__Group_2__0__Impl4313); 
             after(grammarAccess.getRuleDefAccess().getOperationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group_2__0__Impl"


    // $ANTLR start "rule__RuleDef__Group_2__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2129:1: rule__RuleDef__Group_2__1 : rule__RuleDef__Group_2__1__Impl ;
    public final void rule__RuleDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2133:1: ( rule__RuleDef__Group_2__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2134:2: rule__RuleDef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RuleDef__Group_2__1__Impl_in_rule__RuleDef__Group_2__14344);
            rule__RuleDef__Group_2__1__Impl();

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
    // $ANTLR end "rule__RuleDef__Group_2__1"


    // $ANTLR start "rule__RuleDef__Group_2__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2140:1: rule__RuleDef__Group_2__1__Impl : ( ( rule__RuleDef__OperationAssignment_2_1 ) ) ;
    public final void rule__RuleDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2144:1: ( ( ( rule__RuleDef__OperationAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2145:1: ( ( rule__RuleDef__OperationAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2145:1: ( ( rule__RuleDef__OperationAssignment_2_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2146:1: ( rule__RuleDef__OperationAssignment_2_1 )
            {
             before(grammarAccess.getRuleDefAccess().getOperationAssignment_2_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2147:1: ( rule__RuleDef__OperationAssignment_2_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2147:2: rule__RuleDef__OperationAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RuleDef__OperationAssignment_2_1_in_rule__RuleDef__Group_2__1__Impl4371);
            rule__RuleDef__OperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleDefAccess().getOperationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2161:1: rule__FunctionDef__Group__0 : rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1 ;
    public final void rule__FunctionDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2165:1: ( rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2166:2: rule__FunctionDef__Group__0__Impl rule__FunctionDef__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__0__Impl_in_rule__FunctionDef__Group__04405);
            rule__FunctionDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__1_in_rule__FunctionDef__Group__04408);
            rule__FunctionDef__Group__1();

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
    // $ANTLR end "rule__FunctionDef__Group__0"


    // $ANTLR start "rule__FunctionDef__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2173:1: rule__FunctionDef__Group__0__Impl : ( 'fonction' ) ;
    public final void rule__FunctionDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2177:1: ( ( 'fonction' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2178:1: ( 'fonction' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2178:1: ( 'fonction' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2179:1: 'fonction'
            {
             before(grammarAccess.getFunctionDefAccess().getFonctionKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__FunctionDef__Group__0__Impl4436); 
             after(grammarAccess.getFunctionDefAccess().getFonctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2192:1: rule__FunctionDef__Group__1 : rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2 ;
    public final void rule__FunctionDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2196:1: ( rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2197:2: rule__FunctionDef__Group__1__Impl rule__FunctionDef__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__1__Impl_in_rule__FunctionDef__Group__14467);
            rule__FunctionDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__2_in_rule__FunctionDef__Group__14470);
            rule__FunctionDef__Group__2();

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
    // $ANTLR end "rule__FunctionDef__Group__1"


    // $ANTLR start "rule__FunctionDef__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2204:1: rule__FunctionDef__Group__1__Impl : ( ( rule__FunctionDef__NameAssignment_1 ) ) ;
    public final void rule__FunctionDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2208:1: ( ( ( rule__FunctionDef__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2209:1: ( ( rule__FunctionDef__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2209:1: ( ( rule__FunctionDef__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2210:1: ( rule__FunctionDef__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2211:1: ( rule__FunctionDef__NameAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2211:2: rule__FunctionDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionDef__NameAssignment_1_in_rule__FunctionDef__Group__1__Impl4497);
            rule__FunctionDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__1__Impl"


    // $ANTLR start "rule__FunctionDef__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2221:1: rule__FunctionDef__Group__2 : rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3 ;
    public final void rule__FunctionDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2225:1: ( rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2226:2: rule__FunctionDef__Group__2__Impl rule__FunctionDef__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__2__Impl_in_rule__FunctionDef__Group__24527);
            rule__FunctionDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__3_in_rule__FunctionDef__Group__24530);
            rule__FunctionDef__Group__3();

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
    // $ANTLR end "rule__FunctionDef__Group__2"


    // $ANTLR start "rule__FunctionDef__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2233:1: rule__FunctionDef__Group__2__Impl : ( ( rule__FunctionDef__Group_2__0 )? ) ;
    public final void rule__FunctionDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2237:1: ( ( ( rule__FunctionDef__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2238:1: ( ( rule__FunctionDef__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2238:1: ( ( rule__FunctionDef__Group_2__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2239:1: ( rule__FunctionDef__Group_2__0 )?
            {
             before(grammarAccess.getFunctionDefAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2240:1: ( rule__FunctionDef__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2240:2: rule__FunctionDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDef__Group_2__0_in_rule__FunctionDef__Group__2__Impl4557);
                    rule__FunctionDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__2__Impl"


    // $ANTLR start "rule__FunctionDef__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2250:1: rule__FunctionDef__Group__3 : rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4 ;
    public final void rule__FunctionDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2254:1: ( rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2255:2: rule__FunctionDef__Group__3__Impl rule__FunctionDef__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__3__Impl_in_rule__FunctionDef__Group__34588);
            rule__FunctionDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__4_in_rule__FunctionDef__Group__34591);
            rule__FunctionDef__Group__4();

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
    // $ANTLR end "rule__FunctionDef__Group__3"


    // $ANTLR start "rule__FunctionDef__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2262:1: rule__FunctionDef__Group__3__Impl : ( ( rule__FunctionDef__DescriptionAssignment_3 )? ) ;
    public final void rule__FunctionDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2266:1: ( ( ( rule__FunctionDef__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2267:1: ( ( rule__FunctionDef__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2267:1: ( ( rule__FunctionDef__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2268:1: ( rule__FunctionDef__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getFunctionDefAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2269:1: ( rule__FunctionDef__DescriptionAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2269:2: rule__FunctionDef__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__FunctionDef__DescriptionAssignment_3_in_rule__FunctionDef__Group__3__Impl4618);
                    rule__FunctionDef__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDefAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__3__Impl"


    // $ANTLR start "rule__FunctionDef__Group__4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2279:1: rule__FunctionDef__Group__4 : rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5 ;
    public final void rule__FunctionDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2283:1: ( rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2284:2: rule__FunctionDef__Group__4__Impl rule__FunctionDef__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__4__Impl_in_rule__FunctionDef__Group__44649);
            rule__FunctionDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__5_in_rule__FunctionDef__Group__44652);
            rule__FunctionDef__Group__5();

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
    // $ANTLR end "rule__FunctionDef__Group__4"


    // $ANTLR start "rule__FunctionDef__Group__4__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2291:1: rule__FunctionDef__Group__4__Impl : ( '{' ) ;
    public final void rule__FunctionDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2295:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2296:1: ( '{' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2296:1: ( '{' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2297:1: '{'
            {
             before(grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__FunctionDef__Group__4__Impl4680); 
             after(grammarAccess.getFunctionDefAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__4__Impl"


    // $ANTLR start "rule__FunctionDef__Group__5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2310:1: rule__FunctionDef__Group__5 : rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6 ;
    public final void rule__FunctionDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2314:1: ( rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2315:2: rule__FunctionDef__Group__5__Impl rule__FunctionDef__Group__6
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__5__Impl_in_rule__FunctionDef__Group__54711);
            rule__FunctionDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group__6_in_rule__FunctionDef__Group__54714);
            rule__FunctionDef__Group__6();

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
    // $ANTLR end "rule__FunctionDef__Group__5"


    // $ANTLR start "rule__FunctionDef__Group__5__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2322:1: rule__FunctionDef__Group__5__Impl : ( ( rule__FunctionDef__ParamsAssignment_5 )* ) ;
    public final void rule__FunctionDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2326:1: ( ( ( rule__FunctionDef__ParamsAssignment_5 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2327:1: ( ( rule__FunctionDef__ParamsAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2327:1: ( ( rule__FunctionDef__ParamsAssignment_5 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2328:1: ( rule__FunctionDef__ParamsAssignment_5 )*
            {
             before(grammarAccess.getFunctionDefAccess().getParamsAssignment_5()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2329:1: ( rule__FunctionDef__ParamsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=15 && LA18_0<=16)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2329:2: rule__FunctionDef__ParamsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDef__ParamsAssignment_5_in_rule__FunctionDef__Group__5__Impl4741);
            	    rule__FunctionDef__ParamsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getFunctionDefAccess().getParamsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__5__Impl"


    // $ANTLR start "rule__FunctionDef__Group__6"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2339:1: rule__FunctionDef__Group__6 : rule__FunctionDef__Group__6__Impl ;
    public final void rule__FunctionDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2343:1: ( rule__FunctionDef__Group__6__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2344:2: rule__FunctionDef__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group__6__Impl_in_rule__FunctionDef__Group__64772);
            rule__FunctionDef__Group__6__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group__6"


    // $ANTLR start "rule__FunctionDef__Group__6__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2350:1: rule__FunctionDef__Group__6__Impl : ( '}' ) ;
    public final void rule__FunctionDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2354:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2355:1: ( '}' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2355:1: ( '}' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2356:1: '}'
            {
             before(grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__FunctionDef__Group__6__Impl4800); 
             after(grammarAccess.getFunctionDefAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group__6__Impl"


    // $ANTLR start "rule__FunctionDef__Group_2__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2383:1: rule__FunctionDef__Group_2__0 : rule__FunctionDef__Group_2__0__Impl rule__FunctionDef__Group_2__1 ;
    public final void rule__FunctionDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2387:1: ( rule__FunctionDef__Group_2__0__Impl rule__FunctionDef__Group_2__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2388:2: rule__FunctionDef__Group_2__0__Impl rule__FunctionDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group_2__0__Impl_in_rule__FunctionDef__Group_2__04845);
            rule__FunctionDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDef__Group_2__1_in_rule__FunctionDef__Group_2__04848);
            rule__FunctionDef__Group_2__1();

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
    // $ANTLR end "rule__FunctionDef__Group_2__0"


    // $ANTLR start "rule__FunctionDef__Group_2__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2395:1: rule__FunctionDef__Group_2__0__Impl : ( 'rule' ) ;
    public final void rule__FunctionDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2399:1: ( ( 'rule' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2400:1: ( 'rule' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2400:1: ( 'rule' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2401:1: 'rule'
            {
             before(grammarAccess.getFunctionDefAccess().getRuleKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__FunctionDef__Group_2__0__Impl4876); 
             after(grammarAccess.getFunctionDefAccess().getRuleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionDef__Group_2__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2414:1: rule__FunctionDef__Group_2__1 : rule__FunctionDef__Group_2__1__Impl ;
    public final void rule__FunctionDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2418:1: ( rule__FunctionDef__Group_2__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2419:2: rule__FunctionDef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDef__Group_2__1__Impl_in_rule__FunctionDef__Group_2__14907);
            rule__FunctionDef__Group_2__1__Impl();

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
    // $ANTLR end "rule__FunctionDef__Group_2__1"


    // $ANTLR start "rule__FunctionDef__Group_2__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2425:1: rule__FunctionDef__Group_2__1__Impl : ( ( rule__FunctionDef__RuleAssignment_2_1 ) ) ;
    public final void rule__FunctionDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2429:1: ( ( ( rule__FunctionDef__RuleAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2430:1: ( ( rule__FunctionDef__RuleAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2430:1: ( ( rule__FunctionDef__RuleAssignment_2_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2431:1: ( rule__FunctionDef__RuleAssignment_2_1 )
            {
             before(grammarAccess.getFunctionDefAccess().getRuleAssignment_2_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2432:1: ( rule__FunctionDef__RuleAssignment_2_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2432:2: rule__FunctionDef__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FunctionDef__RuleAssignment_2_1_in_rule__FunctionDef__Group_2__1__Impl4934);
            rule__FunctionDef__RuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefAccess().getRuleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionParam__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2446:1: rule__FunctionParam__Group__0 : rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1 ;
    public final void rule__FunctionParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2450:1: ( rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2451:2: rule__FunctionParam__Group__0__Impl rule__FunctionParam__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParam__Group__0__Impl_in_rule__FunctionParam__Group__04968);
            rule__FunctionParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionParam__Group__1_in_rule__FunctionParam__Group__04971);
            rule__FunctionParam__Group__1();

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
    // $ANTLR end "rule__FunctionParam__Group__0"


    // $ANTLR start "rule__FunctionParam__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2458:1: rule__FunctionParam__Group__0__Impl : ( ( rule__FunctionParam__InAssignment_0 ) ) ;
    public final void rule__FunctionParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2462:1: ( ( ( rule__FunctionParam__InAssignment_0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2463:1: ( ( rule__FunctionParam__InAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2463:1: ( ( rule__FunctionParam__InAssignment_0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2464:1: ( rule__FunctionParam__InAssignment_0 )
            {
             before(grammarAccess.getFunctionParamAccess().getInAssignment_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2465:1: ( rule__FunctionParam__InAssignment_0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2465:2: rule__FunctionParam__InAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionParam__InAssignment_0_in_rule__FunctionParam__Group__0__Impl4998);
            rule__FunctionParam__InAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getInAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParam__Group__0__Impl"


    // $ANTLR start "rule__FunctionParam__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2475:1: rule__FunctionParam__Group__1 : rule__FunctionParam__Group__1__Impl ;
    public final void rule__FunctionParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2479:1: ( rule__FunctionParam__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2480:2: rule__FunctionParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParam__Group__1__Impl_in_rule__FunctionParam__Group__15028);
            rule__FunctionParam__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionParam__Group__1"


    // $ANTLR start "rule__FunctionParam__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2486:1: rule__FunctionParam__Group__1__Impl : ( ( rule__FunctionParam__PathAssignment_1 ) ) ;
    public final void rule__FunctionParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2490:1: ( ( ( rule__FunctionParam__PathAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2491:1: ( ( rule__FunctionParam__PathAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2491:1: ( ( rule__FunctionParam__PathAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2492:1: ( rule__FunctionParam__PathAssignment_1 )
            {
             before(grammarAccess.getFunctionParamAccess().getPathAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2493:1: ( rule__FunctionParam__PathAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2493:2: rule__FunctionParam__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionParam__PathAssignment_1_in_rule__FunctionParam__Group__1__Impl5055);
            rule__FunctionParam__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParam__Group__1__Impl"


    // $ANTLR start "rule__FeaturePath__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2507:1: rule__FeaturePath__Group__0 : rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 ;
    public final void rule__FeaturePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2511:1: ( rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2512:2: rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__05089);
            rule__FeaturePath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__05092);
            rule__FeaturePath__Group__1();

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
    // $ANTLR end "rule__FeaturePath__Group__0"


    // $ANTLR start "rule__FeaturePath__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2519:1: rule__FeaturePath__Group__0__Impl : ( ( rule__FeaturePath__FromAssignment_0 ) ) ;
    public final void rule__FeaturePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2523:1: ( ( ( rule__FeaturePath__FromAssignment_0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2524:1: ( ( rule__FeaturePath__FromAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2524:1: ( ( rule__FeaturePath__FromAssignment_0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2525:1: ( rule__FeaturePath__FromAssignment_0 )
            {
             before(grammarAccess.getFeaturePathAccess().getFromAssignment_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2526:1: ( rule__FeaturePath__FromAssignment_0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2526:2: rule__FeaturePath__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__FeaturePath__FromAssignment_0_in_rule__FeaturePath__Group__0__Impl5119);
            rule__FeaturePath__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group__0__Impl"


    // $ANTLR start "rule__FeaturePath__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2536:1: rule__FeaturePath__Group__1 : rule__FeaturePath__Group__1__Impl rule__FeaturePath__Group__2 ;
    public final void rule__FeaturePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2540:1: ( rule__FeaturePath__Group__1__Impl rule__FeaturePath__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2541:2: rule__FeaturePath__Group__1__Impl rule__FeaturePath__Group__2
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__15149);
            rule__FeaturePath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePath__Group__2_in_rule__FeaturePath__Group__15152);
            rule__FeaturePath__Group__2();

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
    // $ANTLR end "rule__FeaturePath__Group__1"


    // $ANTLR start "rule__FeaturePath__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2548:1: rule__FeaturePath__Group__1__Impl : ( ( rule__FeaturePath__ToAssignment_1 ) ) ;
    public final void rule__FeaturePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2552:1: ( ( ( rule__FeaturePath__ToAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2553:1: ( ( rule__FeaturePath__ToAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2553:1: ( ( rule__FeaturePath__ToAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2554:1: ( rule__FeaturePath__ToAssignment_1 )
            {
             before(grammarAccess.getFeaturePathAccess().getToAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2555:1: ( rule__FeaturePath__ToAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2555:2: rule__FeaturePath__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__FeaturePath__ToAssignment_1_in_rule__FeaturePath__Group__1__Impl5179);
            rule__FeaturePath__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getToAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group__1__Impl"


    // $ANTLR start "rule__FeaturePath__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2565:1: rule__FeaturePath__Group__2 : rule__FeaturePath__Group__2__Impl rule__FeaturePath__Group__3 ;
    public final void rule__FeaturePath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2569:1: ( rule__FeaturePath__Group__2__Impl rule__FeaturePath__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2570:2: rule__FeaturePath__Group__2__Impl rule__FeaturePath__Group__3
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__2__Impl_in_rule__FeaturePath__Group__25209);
            rule__FeaturePath__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePath__Group__3_in_rule__FeaturePath__Group__25212);
            rule__FeaturePath__Group__3();

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
    // $ANTLR end "rule__FeaturePath__Group__2"


    // $ANTLR start "rule__FeaturePath__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2577:1: rule__FeaturePath__Group__2__Impl : ( ( rule__FeaturePath__ForEachAssignment_2 )? ) ;
    public final void rule__FeaturePath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2581:1: ( ( ( rule__FeaturePath__ForEachAssignment_2 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2582:1: ( ( rule__FeaturePath__ForEachAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2582:1: ( ( rule__FeaturePath__ForEachAssignment_2 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2583:1: ( rule__FeaturePath__ForEachAssignment_2 )?
            {
             before(grammarAccess.getFeaturePathAccess().getForEachAssignment_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2584:1: ( rule__FeaturePath__ForEachAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2584:2: rule__FeaturePath__ForEachAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeaturePath__ForEachAssignment_2_in_rule__FeaturePath__Group__2__Impl5239);
                    rule__FeaturePath__ForEachAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturePathAccess().getForEachAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group__2__Impl"


    // $ANTLR start "rule__FeaturePath__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2594:1: rule__FeaturePath__Group__3 : rule__FeaturePath__Group__3__Impl rule__FeaturePath__Group__4 ;
    public final void rule__FeaturePath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2598:1: ( rule__FeaturePath__Group__3__Impl rule__FeaturePath__Group__4 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2599:2: rule__FeaturePath__Group__3__Impl rule__FeaturePath__Group__4
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__3__Impl_in_rule__FeaturePath__Group__35270);
            rule__FeaturePath__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePath__Group__4_in_rule__FeaturePath__Group__35273);
            rule__FeaturePath__Group__4();

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
    // $ANTLR end "rule__FeaturePath__Group__3"


    // $ANTLR start "rule__FeaturePath__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2606:1: rule__FeaturePath__Group__3__Impl : ( ( rule__FeaturePath__Group_3__0 )? ) ;
    public final void rule__FeaturePath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2610:1: ( ( ( rule__FeaturePath__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2611:1: ( ( rule__FeaturePath__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2611:1: ( ( rule__FeaturePath__Group_3__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2612:1: ( rule__FeaturePath__Group_3__0 )?
            {
             before(grammarAccess.getFeaturePathAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2613:1: ( rule__FeaturePath__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2613:2: rule__FeaturePath__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FeaturePath__Group_3__0_in_rule__FeaturePath__Group__3__Impl5300);
                    rule__FeaturePath__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturePathAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group__3__Impl"


    // $ANTLR start "rule__FeaturePath__Group__4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2623:1: rule__FeaturePath__Group__4 : rule__FeaturePath__Group__4__Impl ;
    public final void rule__FeaturePath__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2627:1: ( rule__FeaturePath__Group__4__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2628:2: rule__FeaturePath__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group__4__Impl_in_rule__FeaturePath__Group__45331);
            rule__FeaturePath__Group__4__Impl();

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
    // $ANTLR end "rule__FeaturePath__Group__4"


    // $ANTLR start "rule__FeaturePath__Group__4__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2634:1: rule__FeaturePath__Group__4__Impl : ( ( rule__FeaturePath__DescriptionAssignment_4 )? ) ;
    public final void rule__FeaturePath__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2638:1: ( ( ( rule__FeaturePath__DescriptionAssignment_4 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2639:1: ( ( rule__FeaturePath__DescriptionAssignment_4 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2639:1: ( ( rule__FeaturePath__DescriptionAssignment_4 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2640:1: ( rule__FeaturePath__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getFeaturePathAccess().getDescriptionAssignment_4()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2641:1: ( rule__FeaturePath__DescriptionAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2641:2: rule__FeaturePath__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__FeaturePath__DescriptionAssignment_4_in_rule__FeaturePath__Group__4__Impl5358);
                    rule__FeaturePath__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeaturePathAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group__4__Impl"


    // $ANTLR start "rule__FeaturePath__Group_3__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2661:1: rule__FeaturePath__Group_3__0 : rule__FeaturePath__Group_3__0__Impl rule__FeaturePath__Group_3__1 ;
    public final void rule__FeaturePath__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2665:1: ( rule__FeaturePath__Group_3__0__Impl rule__FeaturePath__Group_3__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2666:2: rule__FeaturePath__Group_3__0__Impl rule__FeaturePath__Group_3__1
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group_3__0__Impl_in_rule__FeaturePath__Group_3__05399);
            rule__FeaturePath__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePath__Group_3__1_in_rule__FeaturePath__Group_3__05402);
            rule__FeaturePath__Group_3__1();

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
    // $ANTLR end "rule__FeaturePath__Group_3__0"


    // $ANTLR start "rule__FeaturePath__Group_3__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2673:1: rule__FeaturePath__Group_3__0__Impl : ( 'rule' ) ;
    public final void rule__FeaturePath__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2677:1: ( ( 'rule' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2678:1: ( 'rule' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2678:1: ( 'rule' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2679:1: 'rule'
            {
             before(grammarAccess.getFeaturePathAccess().getRuleKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__FeaturePath__Group_3__0__Impl5430); 
             after(grammarAccess.getFeaturePathAccess().getRuleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group_3__0__Impl"


    // $ANTLR start "rule__FeaturePath__Group_3__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2692:1: rule__FeaturePath__Group_3__1 : rule__FeaturePath__Group_3__1__Impl ;
    public final void rule__FeaturePath__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2696:1: ( rule__FeaturePath__Group_3__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2697:2: rule__FeaturePath__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturePath__Group_3__1__Impl_in_rule__FeaturePath__Group_3__15461);
            rule__FeaturePath__Group_3__1__Impl();

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
    // $ANTLR end "rule__FeaturePath__Group_3__1"


    // $ANTLR start "rule__FeaturePath__Group_3__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2703:1: rule__FeaturePath__Group_3__1__Impl : ( ( rule__FeaturePath__RuleAssignment_3_1 ) ) ;
    public final void rule__FeaturePath__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2707:1: ( ( ( rule__FeaturePath__RuleAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2708:1: ( ( rule__FeaturePath__RuleAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2708:1: ( ( rule__FeaturePath__RuleAssignment_3_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2709:1: ( rule__FeaturePath__RuleAssignment_3_1 )
            {
             before(grammarAccess.getFeaturePathAccess().getRuleAssignment_3_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2710:1: ( rule__FeaturePath__RuleAssignment_3_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2710:2: rule__FeaturePath__RuleAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FeaturePath__RuleAssignment_3_1_in_rule__FeaturePath__Group_3__1__Impl5488);
            rule__FeaturePath__RuleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getRuleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__Group_3__1__Impl"


    // $ANTLR start "rule__FeatureSet__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2724:1: rule__FeatureSet__Group__0 : rule__FeatureSet__Group__0__Impl rule__FeatureSet__Group__1 ;
    public final void rule__FeatureSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2728:1: ( rule__FeatureSet__Group__0__Impl rule__FeatureSet__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2729:2: rule__FeatureSet__Group__0__Impl rule__FeatureSet__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__0__Impl_in_rule__FeatureSet__Group__05522);
            rule__FeatureSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureSet__Group__1_in_rule__FeatureSet__Group__05525);
            rule__FeatureSet__Group__1();

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
    // $ANTLR end "rule__FeatureSet__Group__0"


    // $ANTLR start "rule__FeatureSet__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2736:1: rule__FeatureSet__Group__0__Impl : ( 'set' ) ;
    public final void rule__FeatureSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2740:1: ( ( 'set' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2741:1: ( 'set' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2741:1: ( 'set' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2742:1: 'set'
            {
             before(grammarAccess.getFeatureSetAccess().getSetKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__FeatureSet__Group__0__Impl5553); 
             after(grammarAccess.getFeatureSetAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__0__Impl"


    // $ANTLR start "rule__FeatureSet__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2755:1: rule__FeatureSet__Group__1 : rule__FeatureSet__Group__1__Impl rule__FeatureSet__Group__2 ;
    public final void rule__FeatureSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2759:1: ( rule__FeatureSet__Group__1__Impl rule__FeatureSet__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2760:2: rule__FeatureSet__Group__1__Impl rule__FeatureSet__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__1__Impl_in_rule__FeatureSet__Group__15584);
            rule__FeatureSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureSet__Group__2_in_rule__FeatureSet__Group__15587);
            rule__FeatureSet__Group__2();

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
    // $ANTLR end "rule__FeatureSet__Group__1"


    // $ANTLR start "rule__FeatureSet__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2767:1: rule__FeatureSet__Group__1__Impl : ( ( rule__FeatureSet__InAssignment_1 ) ) ;
    public final void rule__FeatureSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2771:1: ( ( ( rule__FeatureSet__InAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2772:1: ( ( rule__FeatureSet__InAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2772:1: ( ( rule__FeatureSet__InAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2773:1: ( rule__FeatureSet__InAssignment_1 )
            {
             before(grammarAccess.getFeatureSetAccess().getInAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2774:1: ( rule__FeatureSet__InAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2774:2: rule__FeatureSet__InAssignment_1
            {
            pushFollow(FOLLOW_rule__FeatureSet__InAssignment_1_in_rule__FeatureSet__Group__1__Impl5614);
            rule__FeatureSet__InAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureSetAccess().getInAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__1__Impl"


    // $ANTLR start "rule__FeatureSet__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2784:1: rule__FeatureSet__Group__2 : rule__FeatureSet__Group__2__Impl rule__FeatureSet__Group__3 ;
    public final void rule__FeatureSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2788:1: ( rule__FeatureSet__Group__2__Impl rule__FeatureSet__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2789:2: rule__FeatureSet__Group__2__Impl rule__FeatureSet__Group__3
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__2__Impl_in_rule__FeatureSet__Group__25644);
            rule__FeatureSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureSet__Group__3_in_rule__FeatureSet__Group__25647);
            rule__FeatureSet__Group__3();

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
    // $ANTLR end "rule__FeatureSet__Group__2"


    // $ANTLR start "rule__FeatureSet__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2796:1: rule__FeatureSet__Group__2__Impl : ( ( rule__FeatureSet__PathAssignment_2 ) ) ;
    public final void rule__FeatureSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2800:1: ( ( ( rule__FeatureSet__PathAssignment_2 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2801:1: ( ( rule__FeatureSet__PathAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2801:1: ( ( rule__FeatureSet__PathAssignment_2 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2802:1: ( rule__FeatureSet__PathAssignment_2 )
            {
             before(grammarAccess.getFeatureSetAccess().getPathAssignment_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2803:1: ( rule__FeatureSet__PathAssignment_2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2803:2: rule__FeatureSet__PathAssignment_2
            {
            pushFollow(FOLLOW_rule__FeatureSet__PathAssignment_2_in_rule__FeatureSet__Group__2__Impl5674);
            rule__FeatureSet__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureSetAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__2__Impl"


    // $ANTLR start "rule__FeatureSet__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2813:1: rule__FeatureSet__Group__3 : rule__FeatureSet__Group__3__Impl rule__FeatureSet__Group__4 ;
    public final void rule__FeatureSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2817:1: ( rule__FeatureSet__Group__3__Impl rule__FeatureSet__Group__4 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2818:2: rule__FeatureSet__Group__3__Impl rule__FeatureSet__Group__4
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__3__Impl_in_rule__FeatureSet__Group__35704);
            rule__FeatureSet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureSet__Group__4_in_rule__FeatureSet__Group__35707);
            rule__FeatureSet__Group__4();

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
    // $ANTLR end "rule__FeatureSet__Group__3"


    // $ANTLR start "rule__FeatureSet__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2825:1: rule__FeatureSet__Group__3__Impl : ( '=' ) ;
    public final void rule__FeatureSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2829:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2830:1: ( '=' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2830:1: ( '=' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2831:1: '='
            {
             before(grammarAccess.getFeatureSetAccess().getEqualsSignKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__FeatureSet__Group__3__Impl5735); 
             after(grammarAccess.getFeatureSetAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__3__Impl"


    // $ANTLR start "rule__FeatureSet__Group__4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2844:1: rule__FeatureSet__Group__4 : rule__FeatureSet__Group__4__Impl rule__FeatureSet__Group__5 ;
    public final void rule__FeatureSet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2848:1: ( rule__FeatureSet__Group__4__Impl rule__FeatureSet__Group__5 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2849:2: rule__FeatureSet__Group__4__Impl rule__FeatureSet__Group__5
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__4__Impl_in_rule__FeatureSet__Group__45766);
            rule__FeatureSet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureSet__Group__5_in_rule__FeatureSet__Group__45769);
            rule__FeatureSet__Group__5();

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
    // $ANTLR end "rule__FeatureSet__Group__4"


    // $ANTLR start "rule__FeatureSet__Group__4__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2856:1: rule__FeatureSet__Group__4__Impl : ( ( rule__FeatureSet__ValueAssignment_4 ) ) ;
    public final void rule__FeatureSet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2860:1: ( ( ( rule__FeatureSet__ValueAssignment_4 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2861:1: ( ( rule__FeatureSet__ValueAssignment_4 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2861:1: ( ( rule__FeatureSet__ValueAssignment_4 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2862:1: ( rule__FeatureSet__ValueAssignment_4 )
            {
             before(grammarAccess.getFeatureSetAccess().getValueAssignment_4()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2863:1: ( rule__FeatureSet__ValueAssignment_4 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2863:2: rule__FeatureSet__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__FeatureSet__ValueAssignment_4_in_rule__FeatureSet__Group__4__Impl5796);
            rule__FeatureSet__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureSetAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__4__Impl"


    // $ANTLR start "rule__FeatureSet__Group__5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2873:1: rule__FeatureSet__Group__5 : rule__FeatureSet__Group__5__Impl ;
    public final void rule__FeatureSet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2877:1: ( rule__FeatureSet__Group__5__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2878:2: rule__FeatureSet__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FeatureSet__Group__5__Impl_in_rule__FeatureSet__Group__55826);
            rule__FeatureSet__Group__5__Impl();

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
    // $ANTLR end "rule__FeatureSet__Group__5"


    // $ANTLR start "rule__FeatureSet__Group__5__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2884:1: rule__FeatureSet__Group__5__Impl : ( ( rule__FeatureSet__DescriptionAssignment_5 )? ) ;
    public final void rule__FeatureSet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2888:1: ( ( ( rule__FeatureSet__DescriptionAssignment_5 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2889:1: ( ( rule__FeatureSet__DescriptionAssignment_5 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2889:1: ( ( rule__FeatureSet__DescriptionAssignment_5 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2890:1: ( rule__FeatureSet__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getFeatureSetAccess().getDescriptionAssignment_5()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2891:1: ( rule__FeatureSet__DescriptionAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2891:2: rule__FeatureSet__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__FeatureSet__DescriptionAssignment_5_in_rule__FeatureSet__Group__5__Impl5853);
                    rule__FeatureSet__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureSetAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__Group__5__Impl"


    // $ANTLR start "rule__FeaturePathFrom__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2913:1: rule__FeaturePathFrom__Group__0 : rule__FeaturePathFrom__Group__0__Impl rule__FeaturePathFrom__Group__1 ;
    public final void rule__FeaturePathFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2917:1: ( rule__FeaturePathFrom__Group__0__Impl rule__FeaturePathFrom__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2918:2: rule__FeaturePathFrom__Group__0__Impl rule__FeaturePathFrom__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturePathFrom__Group__0__Impl_in_rule__FeaturePathFrom__Group__05896);
            rule__FeaturePathFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePathFrom__Group__1_in_rule__FeaturePathFrom__Group__05899);
            rule__FeaturePathFrom__Group__1();

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
    // $ANTLR end "rule__FeaturePathFrom__Group__0"


    // $ANTLR start "rule__FeaturePathFrom__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2925:1: rule__FeaturePathFrom__Group__0__Impl : ( 'from' ) ;
    public final void rule__FeaturePathFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2929:1: ( ( 'from' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2930:1: ( 'from' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2930:1: ( 'from' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2931:1: 'from'
            {
             before(grammarAccess.getFeaturePathFromAccess().getFromKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__FeaturePathFrom__Group__0__Impl5927); 
             after(grammarAccess.getFeaturePathFromAccess().getFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathFrom__Group__0__Impl"


    // $ANTLR start "rule__FeaturePathFrom__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2944:1: rule__FeaturePathFrom__Group__1 : rule__FeaturePathFrom__Group__1__Impl ;
    public final void rule__FeaturePathFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2948:1: ( rule__FeaturePathFrom__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2949:2: rule__FeaturePathFrom__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturePathFrom__Group__1__Impl_in_rule__FeaturePathFrom__Group__15958);
            rule__FeaturePathFrom__Group__1__Impl();

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
    // $ANTLR end "rule__FeaturePathFrom__Group__1"


    // $ANTLR start "rule__FeaturePathFrom__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2955:1: rule__FeaturePathFrom__Group__1__Impl : ( ( rule__FeaturePathFrom__PathAssignment_1 ) ) ;
    public final void rule__FeaturePathFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2959:1: ( ( ( rule__FeaturePathFrom__PathAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2960:1: ( ( rule__FeaturePathFrom__PathAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2960:1: ( ( rule__FeaturePathFrom__PathAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2961:1: ( rule__FeaturePathFrom__PathAssignment_1 )
            {
             before(grammarAccess.getFeaturePathFromAccess().getPathAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2962:1: ( rule__FeaturePathFrom__PathAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2962:2: rule__FeaturePathFrom__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__FeaturePathFrom__PathAssignment_1_in_rule__FeaturePathFrom__Group__1__Impl5985);
            rule__FeaturePathFrom__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathFromAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathFrom__Group__1__Impl"


    // $ANTLR start "rule__FeaturePathTo__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2976:1: rule__FeaturePathTo__Group__0 : rule__FeaturePathTo__Group__0__Impl rule__FeaturePathTo__Group__1 ;
    public final void rule__FeaturePathTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2980:1: ( rule__FeaturePathTo__Group__0__Impl rule__FeaturePathTo__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2981:2: rule__FeaturePathTo__Group__0__Impl rule__FeaturePathTo__Group__1
            {
            pushFollow(FOLLOW_rule__FeaturePathTo__Group__0__Impl_in_rule__FeaturePathTo__Group__06019);
            rule__FeaturePathTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeaturePathTo__Group__1_in_rule__FeaturePathTo__Group__06022);
            rule__FeaturePathTo__Group__1();

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
    // $ANTLR end "rule__FeaturePathTo__Group__0"


    // $ANTLR start "rule__FeaturePathTo__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2988:1: rule__FeaturePathTo__Group__0__Impl : ( 'to' ) ;
    public final void rule__FeaturePathTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2992:1: ( ( 'to' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2993:1: ( 'to' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2993:1: ( 'to' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:2994:1: 'to'
            {
             before(grammarAccess.getFeaturePathToAccess().getToKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__FeaturePathTo__Group__0__Impl6050); 
             after(grammarAccess.getFeaturePathToAccess().getToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathTo__Group__0__Impl"


    // $ANTLR start "rule__FeaturePathTo__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3007:1: rule__FeaturePathTo__Group__1 : rule__FeaturePathTo__Group__1__Impl ;
    public final void rule__FeaturePathTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3011:1: ( rule__FeaturePathTo__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3012:2: rule__FeaturePathTo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FeaturePathTo__Group__1__Impl_in_rule__FeaturePathTo__Group__16081);
            rule__FeaturePathTo__Group__1__Impl();

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
    // $ANTLR end "rule__FeaturePathTo__Group__1"


    // $ANTLR start "rule__FeaturePathTo__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3018:1: rule__FeaturePathTo__Group__1__Impl : ( ( rule__FeaturePathTo__PathAssignment_1 ) ) ;
    public final void rule__FeaturePathTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3022:1: ( ( ( rule__FeaturePathTo__PathAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3023:1: ( ( rule__FeaturePathTo__PathAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3023:1: ( ( rule__FeaturePathTo__PathAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3024:1: ( rule__FeaturePathTo__PathAssignment_1 )
            {
             before(grammarAccess.getFeaturePathToAccess().getPathAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3025:1: ( rule__FeaturePathTo__PathAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3025:2: rule__FeaturePathTo__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__FeaturePathTo__PathAssignment_1_in_rule__FeaturePathTo__Group__1__Impl6108);
            rule__FeaturePathTo__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathToAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathTo__Group__1__Impl"


    // $ANTLR start "rule__PathHead__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3039:1: rule__PathHead__Group__0 : rule__PathHead__Group__0__Impl rule__PathHead__Group__1 ;
    public final void rule__PathHead__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3043:1: ( rule__PathHead__Group__0__Impl rule__PathHead__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3044:2: rule__PathHead__Group__0__Impl rule__PathHead__Group__1
            {
            pushFollow(FOLLOW_rule__PathHead__Group__0__Impl_in_rule__PathHead__Group__06142);
            rule__PathHead__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathHead__Group__1_in_rule__PathHead__Group__06145);
            rule__PathHead__Group__1();

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
    // $ANTLR end "rule__PathHead__Group__0"


    // $ANTLR start "rule__PathHead__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3051:1: rule__PathHead__Group__0__Impl : ( ( rule__PathHead__EntityAssignment_0 ) ) ;
    public final void rule__PathHead__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3055:1: ( ( ( rule__PathHead__EntityAssignment_0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3056:1: ( ( rule__PathHead__EntityAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3056:1: ( ( rule__PathHead__EntityAssignment_0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3057:1: ( rule__PathHead__EntityAssignment_0 )
            {
             before(grammarAccess.getPathHeadAccess().getEntityAssignment_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3058:1: ( rule__PathHead__EntityAssignment_0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3058:2: rule__PathHead__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__PathHead__EntityAssignment_0_in_rule__PathHead__Group__0__Impl6172);
            rule__PathHead__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPathHeadAccess().getEntityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathHead__Group__0__Impl"


    // $ANTLR start "rule__PathHead__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3068:1: rule__PathHead__Group__1 : rule__PathHead__Group__1__Impl ;
    public final void rule__PathHead__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3072:1: ( rule__PathHead__Group__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3073:2: rule__PathHead__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathHead__Group__1__Impl_in_rule__PathHead__Group__16202);
            rule__PathHead__Group__1__Impl();

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
    // $ANTLR end "rule__PathHead__Group__1"


    // $ANTLR start "rule__PathHead__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3079:1: rule__PathHead__Group__1__Impl : ( ( rule__PathHead__TailAssignment_1 ) ) ;
    public final void rule__PathHead__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3083:1: ( ( ( rule__PathHead__TailAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3084:1: ( ( rule__PathHead__TailAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3084:1: ( ( rule__PathHead__TailAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3085:1: ( rule__PathHead__TailAssignment_1 )
            {
             before(grammarAccess.getPathHeadAccess().getTailAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3086:1: ( rule__PathHead__TailAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3086:2: rule__PathHead__TailAssignment_1
            {
            pushFollow(FOLLOW_rule__PathHead__TailAssignment_1_in_rule__PathHead__Group__1__Impl6229);
            rule__PathHead__TailAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathHeadAccess().getTailAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathHead__Group__1__Impl"


    // $ANTLR start "rule__PathTail__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3100:1: rule__PathTail__Group__0 : rule__PathTail__Group__0__Impl rule__PathTail__Group__1 ;
    public final void rule__PathTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3104:1: ( rule__PathTail__Group__0__Impl rule__PathTail__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3105:2: rule__PathTail__Group__0__Impl rule__PathTail__Group__1
            {
            pushFollow(FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__06263);
            rule__PathTail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__06266);
            rule__PathTail__Group__1();

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
    // $ANTLR end "rule__PathTail__Group__0"


    // $ANTLR start "rule__PathTail__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3112:1: rule__PathTail__Group__0__Impl : ( '.' ) ;
    public final void rule__PathTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3116:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3117:1: ( '.' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3117:1: ( '.' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3118:1: '.'
            {
             before(grammarAccess.getPathTailAccess().getFullStopKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__PathTail__Group__0__Impl6294); 
             after(grammarAccess.getPathTailAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTail__Group__0__Impl"


    // $ANTLR start "rule__PathTail__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3131:1: rule__PathTail__Group__1 : rule__PathTail__Group__1__Impl rule__PathTail__Group__2 ;
    public final void rule__PathTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3135:1: ( rule__PathTail__Group__1__Impl rule__PathTail__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3136:2: rule__PathTail__Group__1__Impl rule__PathTail__Group__2
            {
            pushFollow(FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__16325);
            rule__PathTail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__16328);
            rule__PathTail__Group__2();

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
    // $ANTLR end "rule__PathTail__Group__1"


    // $ANTLR start "rule__PathTail__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3143:1: rule__PathTail__Group__1__Impl : ( ( rule__PathTail__FeatureAssignment_1 ) ) ;
    public final void rule__PathTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3147:1: ( ( ( rule__PathTail__FeatureAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3148:1: ( ( rule__PathTail__FeatureAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3148:1: ( ( rule__PathTail__FeatureAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3149:1: ( rule__PathTail__FeatureAssignment_1 )
            {
             before(grammarAccess.getPathTailAccess().getFeatureAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3150:1: ( rule__PathTail__FeatureAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3150:2: rule__PathTail__FeatureAssignment_1
            {
            pushFollow(FOLLOW_rule__PathTail__FeatureAssignment_1_in_rule__PathTail__Group__1__Impl6355);
            rule__PathTail__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathTailAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTail__Group__1__Impl"


    // $ANTLR start "rule__PathTail__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3160:1: rule__PathTail__Group__2 : rule__PathTail__Group__2__Impl ;
    public final void rule__PathTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3164:1: ( rule__PathTail__Group__2__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3165:2: rule__PathTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__26385);
            rule__PathTail__Group__2__Impl();

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
    // $ANTLR end "rule__PathTail__Group__2"


    // $ANTLR start "rule__PathTail__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3171:1: rule__PathTail__Group__2__Impl : ( ( rule__PathTail__TailAssignment_2 )? ) ;
    public final void rule__PathTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3175:1: ( ( ( rule__PathTail__TailAssignment_2 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3176:1: ( ( rule__PathTail__TailAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3176:1: ( ( rule__PathTail__TailAssignment_2 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3177:1: ( rule__PathTail__TailAssignment_2 )?
            {
             before(grammarAccess.getPathTailAccess().getTailAssignment_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3178:1: ( rule__PathTail__TailAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3178:2: rule__PathTail__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PathTail__TailAssignment_2_in_rule__PathTail__Group__2__Impl6412);
                    rule__PathTail__TailAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathTailAccess().getTailAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTail__Group__2__Impl"


    // $ANTLR start "rule__FileSpecModel__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3194:1: rule__FileSpecModel__Group__0 : rule__FileSpecModel__Group__0__Impl rule__FileSpecModel__Group__1 ;
    public final void rule__FileSpecModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3198:1: ( rule__FileSpecModel__Group__0__Impl rule__FileSpecModel__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3199:2: rule__FileSpecModel__Group__0__Impl rule__FileSpecModel__Group__1
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group__0__Impl_in_rule__FileSpecModel__Group__06449);
            rule__FileSpecModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecModel__Group__1_in_rule__FileSpecModel__Group__06452);
            rule__FileSpecModel__Group__1();

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
    // $ANTLR end "rule__FileSpecModel__Group__0"


    // $ANTLR start "rule__FileSpecModel__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3206:1: rule__FileSpecModel__Group__0__Impl : ( ( rule__FileSpecModel__MappingAssignment_0 ) ) ;
    public final void rule__FileSpecModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3210:1: ( ( ( rule__FileSpecModel__MappingAssignment_0 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3211:1: ( ( rule__FileSpecModel__MappingAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3211:1: ( ( rule__FileSpecModel__MappingAssignment_0 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3212:1: ( rule__FileSpecModel__MappingAssignment_0 )
            {
             before(grammarAccess.getFileSpecModelAccess().getMappingAssignment_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3213:1: ( rule__FileSpecModel__MappingAssignment_0 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3213:2: rule__FileSpecModel__MappingAssignment_0
            {
            pushFollow(FOLLOW_rule__FileSpecModel__MappingAssignment_0_in_rule__FileSpecModel__Group__0__Impl6479);
            rule__FileSpecModel__MappingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecModelAccess().getMappingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group__0__Impl"


    // $ANTLR start "rule__FileSpecModel__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3223:1: rule__FileSpecModel__Group__1 : rule__FileSpecModel__Group__1__Impl rule__FileSpecModel__Group__2 ;
    public final void rule__FileSpecModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3227:1: ( rule__FileSpecModel__Group__1__Impl rule__FileSpecModel__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3228:2: rule__FileSpecModel__Group__1__Impl rule__FileSpecModel__Group__2
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group__1__Impl_in_rule__FileSpecModel__Group__16509);
            rule__FileSpecModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecModel__Group__2_in_rule__FileSpecModel__Group__16512);
            rule__FileSpecModel__Group__2();

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
    // $ANTLR end "rule__FileSpecModel__Group__1"


    // $ANTLR start "rule__FileSpecModel__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3235:1: rule__FileSpecModel__Group__1__Impl : ( ( rule__FileSpecModel__Group_1__0 )? ) ;
    public final void rule__FileSpecModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3239:1: ( ( ( rule__FileSpecModel__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3240:1: ( ( rule__FileSpecModel__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3240:1: ( ( rule__FileSpecModel__Group_1__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3241:1: ( rule__FileSpecModel__Group_1__0 )?
            {
             before(grammarAccess.getFileSpecModelAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3242:1: ( rule__FileSpecModel__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3242:2: rule__FileSpecModel__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FileSpecModel__Group_1__0_in_rule__FileSpecModel__Group__1__Impl6539);
                    rule__FileSpecModel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileSpecModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group__1__Impl"


    // $ANTLR start "rule__FileSpecModel__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3252:1: rule__FileSpecModel__Group__2 : rule__FileSpecModel__Group__2__Impl rule__FileSpecModel__Group__3 ;
    public final void rule__FileSpecModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3256:1: ( rule__FileSpecModel__Group__2__Impl rule__FileSpecModel__Group__3 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3257:2: rule__FileSpecModel__Group__2__Impl rule__FileSpecModel__Group__3
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group__2__Impl_in_rule__FileSpecModel__Group__26570);
            rule__FileSpecModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecModel__Group__3_in_rule__FileSpecModel__Group__26573);
            rule__FileSpecModel__Group__3();

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
    // $ANTLR end "rule__FileSpecModel__Group__2"


    // $ANTLR start "rule__FileSpecModel__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3264:1: rule__FileSpecModel__Group__2__Impl : ( ( rule__FileSpecModel__Group_2__0 )? ) ;
    public final void rule__FileSpecModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3268:1: ( ( ( rule__FileSpecModel__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3269:1: ( ( rule__FileSpecModel__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3269:1: ( ( rule__FileSpecModel__Group_2__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3270:1: ( rule__FileSpecModel__Group_2__0 )?
            {
             before(grammarAccess.getFileSpecModelAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3271:1: ( rule__FileSpecModel__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3271:2: rule__FileSpecModel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FileSpecModel__Group_2__0_in_rule__FileSpecModel__Group__2__Impl6600);
                    rule__FileSpecModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileSpecModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group__2__Impl"


    // $ANTLR start "rule__FileSpecModel__Group__3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3281:1: rule__FileSpecModel__Group__3 : rule__FileSpecModel__Group__3__Impl ;
    public final void rule__FileSpecModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3285:1: ( rule__FileSpecModel__Group__3__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3286:2: rule__FileSpecModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group__3__Impl_in_rule__FileSpecModel__Group__36631);
            rule__FileSpecModel__Group__3__Impl();

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
    // $ANTLR end "rule__FileSpecModel__Group__3"


    // $ANTLR start "rule__FileSpecModel__Group__3__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3292:1: rule__FileSpecModel__Group__3__Impl : ( ( rule__FileSpecModel__SpecLinesAssignment_3 )* ) ;
    public final void rule__FileSpecModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3296:1: ( ( ( rule__FileSpecModel__SpecLinesAssignment_3 )* ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3297:1: ( ( rule__FileSpecModel__SpecLinesAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3297:1: ( ( rule__FileSpecModel__SpecLinesAssignment_3 )* )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3298:1: ( rule__FileSpecModel__SpecLinesAssignment_3 )*
            {
             before(grammarAccess.getFileSpecModelAccess().getSpecLinesAssignment_3()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3299:1: ( rule__FileSpecModel__SpecLinesAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=42 && LA26_0<=43)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3299:2: rule__FileSpecModel__SpecLinesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FileSpecModel__SpecLinesAssignment_3_in_rule__FileSpecModel__Group__3__Impl6658);
            	    rule__FileSpecModel__SpecLinesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFileSpecModelAccess().getSpecLinesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group__3__Impl"


    // $ANTLR start "rule__FileSpecModel__Group_1__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3317:1: rule__FileSpecModel__Group_1__0 : rule__FileSpecModel__Group_1__0__Impl rule__FileSpecModel__Group_1__1 ;
    public final void rule__FileSpecModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3321:1: ( rule__FileSpecModel__Group_1__0__Impl rule__FileSpecModel__Group_1__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3322:2: rule__FileSpecModel__Group_1__0__Impl rule__FileSpecModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group_1__0__Impl_in_rule__FileSpecModel__Group_1__06697);
            rule__FileSpecModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecModel__Group_1__1_in_rule__FileSpecModel__Group_1__06700);
            rule__FileSpecModel__Group_1__1();

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
    // $ANTLR end "rule__FileSpecModel__Group_1__0"


    // $ANTLR start "rule__FileSpecModel__Group_1__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3329:1: rule__FileSpecModel__Group_1__0__Impl : ( 'source path' ) ;
    public final void rule__FileSpecModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3333:1: ( ( 'source path' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3334:1: ( 'source path' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3334:1: ( 'source path' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3335:1: 'source path'
            {
             before(grammarAccess.getFileSpecModelAccess().getSourcePathKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__FileSpecModel__Group_1__0__Impl6728); 
             after(grammarAccess.getFileSpecModelAccess().getSourcePathKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group_1__0__Impl"


    // $ANTLR start "rule__FileSpecModel__Group_1__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3348:1: rule__FileSpecModel__Group_1__1 : rule__FileSpecModel__Group_1__1__Impl ;
    public final void rule__FileSpecModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3352:1: ( rule__FileSpecModel__Group_1__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3353:2: rule__FileSpecModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group_1__1__Impl_in_rule__FileSpecModel__Group_1__16759);
            rule__FileSpecModel__Group_1__1__Impl();

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
    // $ANTLR end "rule__FileSpecModel__Group_1__1"


    // $ANTLR start "rule__FileSpecModel__Group_1__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3359:1: rule__FileSpecModel__Group_1__1__Impl : ( ( rule__FileSpecModel__SourcePathAssignment_1_1 ) ) ;
    public final void rule__FileSpecModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3363:1: ( ( ( rule__FileSpecModel__SourcePathAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3364:1: ( ( rule__FileSpecModel__SourcePathAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3364:1: ( ( rule__FileSpecModel__SourcePathAssignment_1_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3365:1: ( rule__FileSpecModel__SourcePathAssignment_1_1 )
            {
             before(grammarAccess.getFileSpecModelAccess().getSourcePathAssignment_1_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3366:1: ( rule__FileSpecModel__SourcePathAssignment_1_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3366:2: rule__FileSpecModel__SourcePathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FileSpecModel__SourcePathAssignment_1_1_in_rule__FileSpecModel__Group_1__1__Impl6786);
            rule__FileSpecModel__SourcePathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecModelAccess().getSourcePathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group_1__1__Impl"


    // $ANTLR start "rule__FileSpecModel__Group_2__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3380:1: rule__FileSpecModel__Group_2__0 : rule__FileSpecModel__Group_2__0__Impl rule__FileSpecModel__Group_2__1 ;
    public final void rule__FileSpecModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3384:1: ( rule__FileSpecModel__Group_2__0__Impl rule__FileSpecModel__Group_2__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3385:2: rule__FileSpecModel__Group_2__0__Impl rule__FileSpecModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group_2__0__Impl_in_rule__FileSpecModel__Group_2__06820);
            rule__FileSpecModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecModel__Group_2__1_in_rule__FileSpecModel__Group_2__06823);
            rule__FileSpecModel__Group_2__1();

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
    // $ANTLR end "rule__FileSpecModel__Group_2__0"


    // $ANTLR start "rule__FileSpecModel__Group_2__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3392:1: rule__FileSpecModel__Group_2__0__Impl : ( 'target path' ) ;
    public final void rule__FileSpecModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3396:1: ( ( 'target path' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3397:1: ( 'target path' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3397:1: ( 'target path' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3398:1: 'target path'
            {
             before(grammarAccess.getFileSpecModelAccess().getTargetPathKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__FileSpecModel__Group_2__0__Impl6851); 
             after(grammarAccess.getFileSpecModelAccess().getTargetPathKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group_2__0__Impl"


    // $ANTLR start "rule__FileSpecModel__Group_2__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3411:1: rule__FileSpecModel__Group_2__1 : rule__FileSpecModel__Group_2__1__Impl ;
    public final void rule__FileSpecModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3415:1: ( rule__FileSpecModel__Group_2__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3416:2: rule__FileSpecModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FileSpecModel__Group_2__1__Impl_in_rule__FileSpecModel__Group_2__16882);
            rule__FileSpecModel__Group_2__1__Impl();

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
    // $ANTLR end "rule__FileSpecModel__Group_2__1"


    // $ANTLR start "rule__FileSpecModel__Group_2__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3422:1: rule__FileSpecModel__Group_2__1__Impl : ( ( rule__FileSpecModel__TargetPathAssignment_2_1 ) ) ;
    public final void rule__FileSpecModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3426:1: ( ( ( rule__FileSpecModel__TargetPathAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3427:1: ( ( rule__FileSpecModel__TargetPathAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3427:1: ( ( rule__FileSpecModel__TargetPathAssignment_2_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3428:1: ( rule__FileSpecModel__TargetPathAssignment_2_1 )
            {
             before(grammarAccess.getFileSpecModelAccess().getTargetPathAssignment_2_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3429:1: ( rule__FileSpecModel__TargetPathAssignment_2_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3429:2: rule__FileSpecModel__TargetPathAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FileSpecModel__TargetPathAssignment_2_1_in_rule__FileSpecModel__Group_2__1__Impl6909);
            rule__FileSpecModel__TargetPathAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecModelAccess().getTargetPathAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__Group_2__1__Impl"


    // $ANTLR start "rule__SpecInfo__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3443:1: rule__SpecInfo__Group__0 : rule__SpecInfo__Group__0__Impl rule__SpecInfo__Group__1 ;
    public final void rule__SpecInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3447:1: ( rule__SpecInfo__Group__0__Impl rule__SpecInfo__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3448:2: rule__SpecInfo__Group__0__Impl rule__SpecInfo__Group__1
            {
            pushFollow(FOLLOW_rule__SpecInfo__Group__0__Impl_in_rule__SpecInfo__Group__06943);
            rule__SpecInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecInfo__Group__1_in_rule__SpecInfo__Group__06946);
            rule__SpecInfo__Group__1();

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
    // $ANTLR end "rule__SpecInfo__Group__0"


    // $ANTLR start "rule__SpecInfo__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3455:1: rule__SpecInfo__Group__0__Impl : ( 'info' ) ;
    public final void rule__SpecInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3459:1: ( ( 'info' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3460:1: ( 'info' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3460:1: ( 'info' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3461:1: 'info'
            {
             before(grammarAccess.getSpecInfoAccess().getInfoKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__SpecInfo__Group__0__Impl6974); 
             after(grammarAccess.getSpecInfoAccess().getInfoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecInfo__Group__0__Impl"


    // $ANTLR start "rule__SpecInfo__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3474:1: rule__SpecInfo__Group__1 : rule__SpecInfo__Group__1__Impl rule__SpecInfo__Group__2 ;
    public final void rule__SpecInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3478:1: ( rule__SpecInfo__Group__1__Impl rule__SpecInfo__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3479:2: rule__SpecInfo__Group__1__Impl rule__SpecInfo__Group__2
            {
            pushFollow(FOLLOW_rule__SpecInfo__Group__1__Impl_in_rule__SpecInfo__Group__17005);
            rule__SpecInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecInfo__Group__2_in_rule__SpecInfo__Group__17008);
            rule__SpecInfo__Group__2();

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
    // $ANTLR end "rule__SpecInfo__Group__1"


    // $ANTLR start "rule__SpecInfo__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3486:1: rule__SpecInfo__Group__1__Impl : ( ( rule__SpecInfo__TitleAssignment_1 ) ) ;
    public final void rule__SpecInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3490:1: ( ( ( rule__SpecInfo__TitleAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3491:1: ( ( rule__SpecInfo__TitleAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3491:1: ( ( rule__SpecInfo__TitleAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3492:1: ( rule__SpecInfo__TitleAssignment_1 )
            {
             before(grammarAccess.getSpecInfoAccess().getTitleAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3493:1: ( rule__SpecInfo__TitleAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3493:2: rule__SpecInfo__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__SpecInfo__TitleAssignment_1_in_rule__SpecInfo__Group__1__Impl7035);
            rule__SpecInfo__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecInfoAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecInfo__Group__1__Impl"


    // $ANTLR start "rule__SpecInfo__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3503:1: rule__SpecInfo__Group__2 : rule__SpecInfo__Group__2__Impl ;
    public final void rule__SpecInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3507:1: ( rule__SpecInfo__Group__2__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3508:2: rule__SpecInfo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecInfo__Group__2__Impl_in_rule__SpecInfo__Group__27065);
            rule__SpecInfo__Group__2__Impl();

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
    // $ANTLR end "rule__SpecInfo__Group__2"


    // $ANTLR start "rule__SpecInfo__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3514:1: rule__SpecInfo__Group__2__Impl : ( ( rule__SpecInfo__LabelAssignment_2 ) ) ;
    public final void rule__SpecInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3518:1: ( ( ( rule__SpecInfo__LabelAssignment_2 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3519:1: ( ( rule__SpecInfo__LabelAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3519:1: ( ( rule__SpecInfo__LabelAssignment_2 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3520:1: ( rule__SpecInfo__LabelAssignment_2 )
            {
             before(grammarAccess.getSpecInfoAccess().getLabelAssignment_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3521:1: ( rule__SpecInfo__LabelAssignment_2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3521:2: rule__SpecInfo__LabelAssignment_2
            {
            pushFollow(FOLLOW_rule__SpecInfo__LabelAssignment_2_in_rule__SpecInfo__Group__2__Impl7092);
            rule__SpecInfo__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecInfoAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecInfo__Group__2__Impl"


    // $ANTLR start "rule__SpecVersion__Group__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3537:1: rule__SpecVersion__Group__0 : rule__SpecVersion__Group__0__Impl rule__SpecVersion__Group__1 ;
    public final void rule__SpecVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3541:1: ( rule__SpecVersion__Group__0__Impl rule__SpecVersion__Group__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3542:2: rule__SpecVersion__Group__0__Impl rule__SpecVersion__Group__1
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group__0__Impl_in_rule__SpecVersion__Group__07128);
            rule__SpecVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecVersion__Group__1_in_rule__SpecVersion__Group__07131);
            rule__SpecVersion__Group__1();

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
    // $ANTLR end "rule__SpecVersion__Group__0"


    // $ANTLR start "rule__SpecVersion__Group__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3549:1: rule__SpecVersion__Group__0__Impl : ( 'version' ) ;
    public final void rule__SpecVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3553:1: ( ( 'version' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3554:1: ( 'version' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3554:1: ( 'version' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3555:1: 'version'
            {
             before(grammarAccess.getSpecVersionAccess().getVersionKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__SpecVersion__Group__0__Impl7159); 
             after(grammarAccess.getSpecVersionAccess().getVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__Group__0__Impl"


    // $ANTLR start "rule__SpecVersion__Group__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3568:1: rule__SpecVersion__Group__1 : rule__SpecVersion__Group__1__Impl rule__SpecVersion__Group__2 ;
    public final void rule__SpecVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3572:1: ( rule__SpecVersion__Group__1__Impl rule__SpecVersion__Group__2 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3573:2: rule__SpecVersion__Group__1__Impl rule__SpecVersion__Group__2
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group__1__Impl_in_rule__SpecVersion__Group__17190);
            rule__SpecVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecVersion__Group__2_in_rule__SpecVersion__Group__17193);
            rule__SpecVersion__Group__2();

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
    // $ANTLR end "rule__SpecVersion__Group__1"


    // $ANTLR start "rule__SpecVersion__Group__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3580:1: rule__SpecVersion__Group__1__Impl : ( ( rule__SpecVersion__VersionAssignment_1 ) ) ;
    public final void rule__SpecVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3584:1: ( ( ( rule__SpecVersion__VersionAssignment_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3585:1: ( ( rule__SpecVersion__VersionAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3585:1: ( ( rule__SpecVersion__VersionAssignment_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3586:1: ( rule__SpecVersion__VersionAssignment_1 )
            {
             before(grammarAccess.getSpecVersionAccess().getVersionAssignment_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3587:1: ( rule__SpecVersion__VersionAssignment_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3587:2: rule__SpecVersion__VersionAssignment_1
            {
            pushFollow(FOLLOW_rule__SpecVersion__VersionAssignment_1_in_rule__SpecVersion__Group__1__Impl7220);
            rule__SpecVersion__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecVersionAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__Group__1__Impl"


    // $ANTLR start "rule__SpecVersion__Group__2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3597:1: rule__SpecVersion__Group__2 : rule__SpecVersion__Group__2__Impl ;
    public final void rule__SpecVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3601:1: ( rule__SpecVersion__Group__2__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3602:2: rule__SpecVersion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group__2__Impl_in_rule__SpecVersion__Group__27250);
            rule__SpecVersion__Group__2__Impl();

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
    // $ANTLR end "rule__SpecVersion__Group__2"


    // $ANTLR start "rule__SpecVersion__Group__2__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3608:1: rule__SpecVersion__Group__2__Impl : ( ( rule__SpecVersion__Group_2__0 )? ) ;
    public final void rule__SpecVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3612:1: ( ( ( rule__SpecVersion__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3613:1: ( ( rule__SpecVersion__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3613:1: ( ( rule__SpecVersion__Group_2__0 )? )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3614:1: ( rule__SpecVersion__Group_2__0 )?
            {
             before(grammarAccess.getSpecVersionAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3615:1: ( rule__SpecVersion__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3615:2: rule__SpecVersion__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SpecVersion__Group_2__0_in_rule__SpecVersion__Group__2__Impl7277);
                    rule__SpecVersion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecVersionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__Group__2__Impl"


    // $ANTLR start "rule__SpecVersion__Group_2__0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3631:1: rule__SpecVersion__Group_2__0 : rule__SpecVersion__Group_2__0__Impl rule__SpecVersion__Group_2__1 ;
    public final void rule__SpecVersion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3635:1: ( rule__SpecVersion__Group_2__0__Impl rule__SpecVersion__Group_2__1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3636:2: rule__SpecVersion__Group_2__0__Impl rule__SpecVersion__Group_2__1
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group_2__0__Impl_in_rule__SpecVersion__Group_2__07314);
            rule__SpecVersion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpecVersion__Group_2__1_in_rule__SpecVersion__Group_2__07317);
            rule__SpecVersion__Group_2__1();

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
    // $ANTLR end "rule__SpecVersion__Group_2__0"


    // $ANTLR start "rule__SpecVersion__Group_2__0__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3643:1: rule__SpecVersion__Group_2__0__Impl : ( 'comment' ) ;
    public final void rule__SpecVersion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3647:1: ( ( 'comment' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3648:1: ( 'comment' )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3648:1: ( 'comment' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3649:1: 'comment'
            {
             before(grammarAccess.getSpecVersionAccess().getCommentKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__SpecVersion__Group_2__0__Impl7345); 
             after(grammarAccess.getSpecVersionAccess().getCommentKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__Group_2__0__Impl"


    // $ANTLR start "rule__SpecVersion__Group_2__1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3662:1: rule__SpecVersion__Group_2__1 : rule__SpecVersion__Group_2__1__Impl ;
    public final void rule__SpecVersion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3666:1: ( rule__SpecVersion__Group_2__1__Impl )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3667:2: rule__SpecVersion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SpecVersion__Group_2__1__Impl_in_rule__SpecVersion__Group_2__17376);
            rule__SpecVersion__Group_2__1__Impl();

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
    // $ANTLR end "rule__SpecVersion__Group_2__1"


    // $ANTLR start "rule__SpecVersion__Group_2__1__Impl"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3673:1: rule__SpecVersion__Group_2__1__Impl : ( ( rule__SpecVersion__CommentAssignment_2_1 ) ) ;
    public final void rule__SpecVersion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3677:1: ( ( ( rule__SpecVersion__CommentAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3678:1: ( ( rule__SpecVersion__CommentAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3678:1: ( ( rule__SpecVersion__CommentAssignment_2_1 ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3679:1: ( rule__SpecVersion__CommentAssignment_2_1 )
            {
             before(grammarAccess.getSpecVersionAccess().getCommentAssignment_2_1()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3680:1: ( rule__SpecVersion__CommentAssignment_2_1 )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3680:2: rule__SpecVersion__CommentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SpecVersion__CommentAssignment_2_1_in_rule__SpecVersion__Group_2__1__Impl7403);
            rule__SpecVersion__CommentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecVersionAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__Group_2__1__Impl"


    // $ANTLR start "rule__ModelMap__SpecAssignment_0_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3695:1: rule__ModelMap__SpecAssignment_0_1 : ( ruleFileSpecModel ) ;
    public final void rule__ModelMap__SpecAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3699:1: ( ( ruleFileSpecModel ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3700:1: ( ruleFileSpecModel )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3700:1: ( ruleFileSpecModel )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3701:1: ruleFileSpecModel
            {
             before(grammarAccess.getModelMapAccess().getSpecFileSpecModelParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleFileSpecModel_in_rule__ModelMap__SpecAssignment_0_17442);
            ruleFileSpecModel();

            state._fsp--;

             after(grammarAccess.getModelMapAccess().getSpecFileSpecModelParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__SpecAssignment_0_1"


    // $ANTLR start "rule__ModelMap__ImportsAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3710:1: rule__ModelMap__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ModelMap__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3714:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3715:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3715:1: ( ruleImport )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3716:1: ruleImport
            {
             before(grammarAccess.getModelMapAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ModelMap__ImportsAssignment_17473);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelMapAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__ImportsAssignment_1"


    // $ANTLR start "rule__ModelMap__RulesAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3725:1: rule__ModelMap__RulesAssignment_2 : ( ruleRuleDef ) ;
    public final void rule__ModelMap__RulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3729:1: ( ( ruleRuleDef ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3730:1: ( ruleRuleDef )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3730:1: ( ruleRuleDef )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3731:1: ruleRuleDef
            {
             before(grammarAccess.getModelMapAccess().getRulesRuleDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRuleDef_in_rule__ModelMap__RulesAssignment_27504);
            ruleRuleDef();

            state._fsp--;

             after(grammarAccess.getModelMapAccess().getRulesRuleDefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__RulesAssignment_2"


    // $ANTLR start "rule__ModelMap__MappingAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3740:1: rule__ModelMap__MappingAssignment_3 : ( ruleMapEntity ) ;
    public final void rule__ModelMap__MappingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3744:1: ( ( ruleMapEntity ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3745:1: ( ruleMapEntity )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3745:1: ( ruleMapEntity )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3746:1: ruleMapEntity
            {
             before(grammarAccess.getModelMapAccess().getMappingMapEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMapEntity_in_rule__ModelMap__MappingAssignment_37535);
            ruleMapEntity();

            state._fsp--;

             after(grammarAccess.getModelMapAccess().getMappingMapEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMap__MappingAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3755:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3759:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3760:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3760:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3761:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17566);
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


    // $ANTLR start "rule__MapEntity__NameAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3770:1: rule__MapEntity__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__MapEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3774:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3775:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3775:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3776:1: ruleQualifiedName
            {
             before(grammarAccess.getMapEntityAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MapEntity__NameAssignment_17597);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMapEntityAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__NameAssignment_1"


    // $ANTLR start "rule__MapEntity__EntityFromAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3785:1: rule__MapEntity__EntityFromAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MapEntity__EntityFromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3789:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3790:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3790:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3791:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMapEntityAccess().getEntityFromEntityCrossReference_3_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3792:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3793:1: ruleQualifiedName
            {
             before(grammarAccess.getMapEntityAccess().getEntityFromEntityQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MapEntity__EntityFromAssignment_37632);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMapEntityAccess().getEntityFromEntityQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMapEntityAccess().getEntityFromEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__EntityFromAssignment_3"


    // $ANTLR start "rule__MapEntity__EntityToAssignment_5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3804:1: rule__MapEntity__EntityToAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MapEntity__EntityToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3808:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3809:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3809:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3810:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMapEntityAccess().getEntityToEntityCrossReference_5_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3811:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3812:1: ruleQualifiedName
            {
             before(grammarAccess.getMapEntityAccess().getEntityToEntityQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MapEntity__EntityToAssignment_57671);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMapEntityAccess().getEntityToEntityQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMapEntityAccess().getEntityToEntityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__EntityToAssignment_5"


    // $ANTLR start "rule__MapEntity__ActionsAssignment_7"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3823:1: rule__MapEntity__ActionsAssignment_7 : ( ruleAction ) ;
    public final void rule__MapEntity__ActionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3827:1: ( ( ruleAction ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3828:1: ( ruleAction )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3828:1: ( ruleAction )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3829:1: ruleAction
            {
             before(grammarAccess.getMapEntityAccess().getActionsActionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__MapEntity__ActionsAssignment_77706);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMapEntityAccess().getActionsActionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapEntity__ActionsAssignment_7"


    // $ANTLR start "rule__CallMapEntity__MappingAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3838:1: rule__CallMapEntity__MappingAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CallMapEntity__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3842:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3843:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3843:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3844:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getCallMapEntityAccess().getMappingMapEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3845:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3846:1: ruleQualifiedName
            {
             before(grammarAccess.getCallMapEntityAccess().getMappingMapEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__CallMapEntity__MappingAssignment_17741);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCallMapEntityAccess().getMappingMapEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCallMapEntityAccess().getMappingMapEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__MappingAssignment_1"


    // $ANTLR start "rule__CallMapEntity__FeaturePathAssignment_2_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3857:1: rule__CallMapEntity__FeaturePathAssignment_2_1 : ( ruleFeaturePath ) ;
    public final void rule__CallMapEntity__FeaturePathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3861:1: ( ( ruleFeaturePath ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3862:1: ( ruleFeaturePath )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3862:1: ( ruleFeaturePath )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3863:1: ruleFeaturePath
            {
             before(grammarAccess.getCallMapEntityAccess().getFeaturePathFeaturePathParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFeaturePath_in_rule__CallMapEntity__FeaturePathAssignment_2_17776);
            ruleFeaturePath();

            state._fsp--;

             after(grammarAccess.getCallMapEntityAccess().getFeaturePathFeaturePathParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallMapEntity__FeaturePathAssignment_2_1"


    // $ANTLR start "rule__Document__DocumentAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3872:1: rule__Document__DocumentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Document__DocumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3876:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3877:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3877:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3878:1: RULE_STRING
            {
             before(grammarAccess.getDocumentAccess().getDocumentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Document__DocumentAssignment_17807); 
             after(grammarAccess.getDocumentAccess().getDocumentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__DocumentAssignment_1"


    // $ANTLR start "rule__RuleDef__NameAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3887:1: rule__RuleDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3891:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3892:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3892:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3893:1: RULE_ID
            {
             before(grammarAccess.getRuleDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuleDef__NameAssignment_17838); 
             after(grammarAccess.getRuleDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__NameAssignment_1"


    // $ANTLR start "rule__RuleDef__OperationAssignment_2_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3902:1: rule__RuleDef__OperationAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__RuleDef__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3906:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3907:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3907:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3908:1: RULE_STRING
            {
             before(grammarAccess.getRuleDefAccess().getOperationSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RuleDef__OperationAssignment_2_17869); 
             after(grammarAccess.getRuleDefAccess().getOperationSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__OperationAssignment_2_1"


    // $ANTLR start "rule__RuleDef__DescriptionAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3917:1: rule__RuleDef__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RuleDef__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3921:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3922:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3922:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3923:1: RULE_STRING
            {
             before(grammarAccess.getRuleDefAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RuleDef__DescriptionAssignment_37900); 
             after(grammarAccess.getRuleDefAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDef__DescriptionAssignment_3"


    // $ANTLR start "rule__FunctionDef__NameAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3932:1: rule__FunctionDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3936:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3937:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3937:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3938:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDef__NameAssignment_17931); 
             after(grammarAccess.getFunctionDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__NameAssignment_1"


    // $ANTLR start "rule__FunctionDef__RuleAssignment_2_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3947:1: rule__FunctionDef__RuleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionDef__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3951:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3952:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3952:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3953:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionDefAccess().getRuleRuleDefCrossReference_2_1_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3954:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3955:1: RULE_ID
            {
             before(grammarAccess.getFunctionDefAccess().getRuleRuleDefIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDef__RuleAssignment_2_17966); 
             after(grammarAccess.getFunctionDefAccess().getRuleRuleDefIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFunctionDefAccess().getRuleRuleDefCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__RuleAssignment_2_1"


    // $ANTLR start "rule__FunctionDef__DescriptionAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3966:1: rule__FunctionDef__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FunctionDef__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3970:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3971:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3971:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3972:1: RULE_STRING
            {
             before(grammarAccess.getFunctionDefAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionDef__DescriptionAssignment_38001); 
             after(grammarAccess.getFunctionDefAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__DescriptionAssignment_3"


    // $ANTLR start "rule__FunctionDef__ParamsAssignment_5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3981:1: rule__FunctionDef__ParamsAssignment_5 : ( ruleFunctionParam ) ;
    public final void rule__FunctionDef__ParamsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3985:1: ( ( ruleFunctionParam ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3986:1: ( ruleFunctionParam )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3986:1: ( ruleFunctionParam )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3987:1: ruleFunctionParam
            {
             before(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFunctionParam_in_rule__FunctionDef__ParamsAssignment_58032);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionDefAccess().getParamsFunctionParamParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDef__ParamsAssignment_5"


    // $ANTLR start "rule__FunctionParam__InAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:3996:1: rule__FunctionParam__InAssignment_0 : ( ruleInOut ) ;
    public final void rule__FunctionParam__InAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4000:1: ( ( ruleInOut ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4001:1: ( ruleInOut )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4001:1: ( ruleInOut )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4002:1: ruleInOut
            {
             before(grammarAccess.getFunctionParamAccess().getInInOutEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInOut_in_rule__FunctionParam__InAssignment_08063);
            ruleInOut();

            state._fsp--;

             after(grammarAccess.getFunctionParamAccess().getInInOutEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParam__InAssignment_0"


    // $ANTLR start "rule__FunctionParam__PathAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4011:1: rule__FunctionParam__PathAssignment_1 : ( rulePathTail ) ;
    public final void rule__FunctionParam__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4015:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4016:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4016:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4017:1: rulePathTail
            {
             before(grammarAccess.getFunctionParamAccess().getPathPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FunctionParam__PathAssignment_18094);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getFunctionParamAccess().getPathPathTailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParam__PathAssignment_1"


    // $ANTLR start "rule__FeaturePath__FromAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4026:1: rule__FeaturePath__FromAssignment_0 : ( ruleFeaturePathFrom ) ;
    public final void rule__FeaturePath__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4030:1: ( ( ruleFeaturePathFrom ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4031:1: ( ruleFeaturePathFrom )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4031:1: ( ruleFeaturePathFrom )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4032:1: ruleFeaturePathFrom
            {
             before(grammarAccess.getFeaturePathAccess().getFromFeaturePathFromParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFeaturePathFrom_in_rule__FeaturePath__FromAssignment_08125);
            ruleFeaturePathFrom();

            state._fsp--;

             after(grammarAccess.getFeaturePathAccess().getFromFeaturePathFromParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__FromAssignment_0"


    // $ANTLR start "rule__FeaturePath__ToAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4041:1: rule__FeaturePath__ToAssignment_1 : ( ruleFeaturePathTo ) ;
    public final void rule__FeaturePath__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4045:1: ( ( ruleFeaturePathTo ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4046:1: ( ruleFeaturePathTo )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4046:1: ( ruleFeaturePathTo )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4047:1: ruleFeaturePathTo
            {
             before(grammarAccess.getFeaturePathAccess().getToFeaturePathToParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFeaturePathTo_in_rule__FeaturePath__ToAssignment_18156);
            ruleFeaturePathTo();

            state._fsp--;

             after(grammarAccess.getFeaturePathAccess().getToFeaturePathToParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__ToAssignment_1"


    // $ANTLR start "rule__FeaturePath__ForEachAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4056:1: rule__FeaturePath__ForEachAssignment_2 : ( ( 'for each' ) ) ;
    public final void rule__FeaturePath__ForEachAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4060:1: ( ( ( 'for each' ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4061:1: ( ( 'for each' ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4061:1: ( ( 'for each' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4062:1: ( 'for each' )
            {
             before(grammarAccess.getFeaturePathAccess().getForEachForEachKeyword_2_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4063:1: ( 'for each' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4064:1: 'for each'
            {
             before(grammarAccess.getFeaturePathAccess().getForEachForEachKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__FeaturePath__ForEachAssignment_28192); 
             after(grammarAccess.getFeaturePathAccess().getForEachForEachKeyword_2_0()); 

            }

             after(grammarAccess.getFeaturePathAccess().getForEachForEachKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__ForEachAssignment_2"


    // $ANTLR start "rule__FeaturePath__RuleAssignment_3_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4079:1: rule__FeaturePath__RuleAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeaturePath__RuleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4083:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4084:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4084:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4085:1: ( RULE_ID )
            {
             before(grammarAccess.getFeaturePathAccess().getRuleRuleDefCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4086:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4087:1: RULE_ID
            {
             before(grammarAccess.getFeaturePathAccess().getRuleRuleDefIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FeaturePath__RuleAssignment_3_18235); 
             after(grammarAccess.getFeaturePathAccess().getRuleRuleDefIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFeaturePathAccess().getRuleRuleDefCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__RuleAssignment_3_1"


    // $ANTLR start "rule__FeaturePath__DescriptionAssignment_4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4098:1: rule__FeaturePath__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FeaturePath__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4102:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4103:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4103:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4104:1: RULE_STRING
            {
             before(grammarAccess.getFeaturePathAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeaturePath__DescriptionAssignment_48270); 
             after(grammarAccess.getFeaturePathAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePath__DescriptionAssignment_4"


    // $ANTLR start "rule__FeatureSet__InAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4113:1: rule__FeatureSet__InAssignment_1 : ( ruleInOut ) ;
    public final void rule__FeatureSet__InAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4117:1: ( ( ruleInOut ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4118:1: ( ruleInOut )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4118:1: ( ruleInOut )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4119:1: ruleInOut
            {
             before(grammarAccess.getFeatureSetAccess().getInInOutEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInOut_in_rule__FeatureSet__InAssignment_18301);
            ruleInOut();

            state._fsp--;

             after(grammarAccess.getFeatureSetAccess().getInInOutEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__InAssignment_1"


    // $ANTLR start "rule__FeatureSet__PathAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4128:1: rule__FeatureSet__PathAssignment_2 : ( rulePathTail ) ;
    public final void rule__FeatureSet__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4132:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4133:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4133:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4134:1: rulePathTail
            {
             before(grammarAccess.getFeatureSetAccess().getPathPathTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FeatureSet__PathAssignment_28332);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getFeatureSetAccess().getPathPathTailParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__PathAssignment_2"


    // $ANTLR start "rule__FeatureSet__ValueAssignment_4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4143:1: rule__FeatureSet__ValueAssignment_4 : ( ruleTerminalExpression ) ;
    public final void rule__FeatureSet__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4147:1: ( ( ruleTerminalExpression ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4148:1: ( ruleTerminalExpression )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4148:1: ( ruleTerminalExpression )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4149:1: ruleTerminalExpression
            {
             before(grammarAccess.getFeatureSetAccess().getValueTerminalExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_rule__FeatureSet__ValueAssignment_48363);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getFeatureSetAccess().getValueTerminalExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__ValueAssignment_4"


    // $ANTLR start "rule__FeatureSet__DescriptionAssignment_5"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4158:1: rule__FeatureSet__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__FeatureSet__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4162:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4163:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4163:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4164:1: RULE_STRING
            {
             before(grammarAccess.getFeatureSetAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureSet__DescriptionAssignment_58394); 
             after(grammarAccess.getFeatureSetAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureSet__DescriptionAssignment_5"


    // $ANTLR start "rule__FeaturePathFrom__PathAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4173:1: rule__FeaturePathFrom__PathAssignment_1 : ( rulePathTail ) ;
    public final void rule__FeaturePathFrom__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4177:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4178:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4178:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4179:1: rulePathTail
            {
             before(grammarAccess.getFeaturePathFromAccess().getPathPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FeaturePathFrom__PathAssignment_18425);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getFeaturePathFromAccess().getPathPathTailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathFrom__PathAssignment_1"


    // $ANTLR start "rule__FeaturePathTo__PathAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4188:1: rule__FeaturePathTo__PathAssignment_1 : ( rulePathTail ) ;
    public final void rule__FeaturePathTo__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4192:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4193:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4193:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4194:1: rulePathTail
            {
             before(grammarAccess.getFeaturePathToAccess().getPathPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__FeaturePathTo__PathAssignment_18456);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getFeaturePathToAccess().getPathPathTailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeaturePathTo__PathAssignment_1"


    // $ANTLR start "rule__PathHead__EntityAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4203:1: rule__PathHead__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PathHead__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4207:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4208:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4208:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4209:1: ( RULE_ID )
            {
             before(grammarAccess.getPathHeadAccess().getEntityEntityCrossReference_0_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4210:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4211:1: RULE_ID
            {
             before(grammarAccess.getPathHeadAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathHead__EntityAssignment_08491); 
             after(grammarAccess.getPathHeadAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPathHeadAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathHead__EntityAssignment_0"


    // $ANTLR start "rule__PathHead__TailAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4222:1: rule__PathHead__TailAssignment_1 : ( rulePathTail ) ;
    public final void rule__PathHead__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4226:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4227:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4227:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4228:1: rulePathTail
            {
             before(grammarAccess.getPathHeadAccess().getTailPathTailParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__PathHead__TailAssignment_18526);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getPathHeadAccess().getTailPathTailParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathHead__TailAssignment_1"


    // $ANTLR start "rule__PathTail__FeatureAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4237:1: rule__PathTail__FeatureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PathTail__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4241:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4242:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4242:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4243:1: ( RULE_ID )
            {
             before(grammarAccess.getPathTailAccess().getFeatureStructuralFeatureCrossReference_1_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4244:1: ( RULE_ID )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4245:1: RULE_ID
            {
             before(grammarAccess.getPathTailAccess().getFeatureStructuralFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathTail__FeatureAssignment_18561); 
             after(grammarAccess.getPathTailAccess().getFeatureStructuralFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPathTailAccess().getFeatureStructuralFeatureCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTail__FeatureAssignment_1"


    // $ANTLR start "rule__PathTail__TailAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4256:1: rule__PathTail__TailAssignment_2 : ( rulePathTail ) ;
    public final void rule__PathTail__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4260:1: ( ( rulePathTail ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4261:1: ( rulePathTail )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4261:1: ( rulePathTail )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4262:1: rulePathTail
            {
             before(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_28596);
            rulePathTail();

            state._fsp--;

             after(grammarAccess.getPathTailAccess().getTailPathTailParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathTail__TailAssignment_2"


    // $ANTLR start "rule__FileSpecModel__MappingAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4271:1: rule__FileSpecModel__MappingAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FileSpecModel__MappingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4275:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4276:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4276:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4277:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFileSpecModelAccess().getMappingMapEntityCrossReference_0_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4278:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4279:1: ruleQualifiedName
            {
             before(grammarAccess.getFileSpecModelAccess().getMappingMapEntityQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FileSpecModel__MappingAssignment_08631);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFileSpecModelAccess().getMappingMapEntityQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFileSpecModelAccess().getMappingMapEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__MappingAssignment_0"


    // $ANTLR start "rule__FileSpecModel__SourcePathAssignment_1_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4290:1: rule__FileSpecModel__SourcePathAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__FileSpecModel__SourcePathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4294:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4295:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4295:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4296:1: RULE_STRING
            {
             before(grammarAccess.getFileSpecModelAccess().getSourcePathSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileSpecModel__SourcePathAssignment_1_18666); 
             after(grammarAccess.getFileSpecModelAccess().getSourcePathSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__SourcePathAssignment_1_1"


    // $ANTLR start "rule__FileSpecModel__TargetPathAssignment_2_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4305:1: rule__FileSpecModel__TargetPathAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FileSpecModel__TargetPathAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4309:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4310:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4310:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4311:1: RULE_STRING
            {
             before(grammarAccess.getFileSpecModelAccess().getTargetPathSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileSpecModel__TargetPathAssignment_2_18697); 
             after(grammarAccess.getFileSpecModelAccess().getTargetPathSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__TargetPathAssignment_2_1"


    // $ANTLR start "rule__FileSpecModel__SpecLinesAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4320:1: rule__FileSpecModel__SpecLinesAssignment_3 : ( ruleSpecLine ) ;
    public final void rule__FileSpecModel__SpecLinesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4324:1: ( ( ruleSpecLine ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4325:1: ( ruleSpecLine )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4325:1: ( ruleSpecLine )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4326:1: ruleSpecLine
            {
             before(grammarAccess.getFileSpecModelAccess().getSpecLinesSpecLineParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSpecLine_in_rule__FileSpecModel__SpecLinesAssignment_38728);
            ruleSpecLine();

            state._fsp--;

             after(grammarAccess.getFileSpecModelAccess().getSpecLinesSpecLineParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecModel__SpecLinesAssignment_3"


    // $ANTLR start "rule__SpecInfo__TitleAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4335:1: rule__SpecInfo__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SpecInfo__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4339:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4340:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4340:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4341:1: RULE_STRING
            {
             before(grammarAccess.getSpecInfoAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecInfo__TitleAssignment_18759); 
             after(grammarAccess.getSpecInfoAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecInfo__TitleAssignment_1"


    // $ANTLR start "rule__SpecInfo__LabelAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4350:1: rule__SpecInfo__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SpecInfo__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4354:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4355:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4355:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4356:1: RULE_STRING
            {
             before(grammarAccess.getSpecInfoAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecInfo__LabelAssignment_28790); 
             after(grammarAccess.getSpecInfoAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecInfo__LabelAssignment_2"


    // $ANTLR start "rule__SpecVersion__VersionAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4365:1: rule__SpecVersion__VersionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SpecVersion__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4369:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4370:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4370:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4371:1: RULE_STRING
            {
             before(grammarAccess.getSpecVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecVersion__VersionAssignment_18821); 
             after(grammarAccess.getSpecVersionAccess().getVersionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__VersionAssignment_1"


    // $ANTLR start "rule__SpecVersion__CommentAssignment_2_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4380:1: rule__SpecVersion__CommentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SpecVersion__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4384:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4385:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4385:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4386:1: RULE_STRING
            {
             before(grammarAccess.getSpecVersionAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecVersion__CommentAssignment_2_18852); 
             after(grammarAccess.getSpecVersionAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecVersion__CommentAssignment_2_1"


    // $ANTLR start "rule__TerminalExpression__IntAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4395:1: rule__TerminalExpression__IntAssignment_0 : ( ruleIntVar ) ;
    public final void rule__TerminalExpression__IntAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4399:1: ( ( ruleIntVar ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4400:1: ( ruleIntVar )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4400:1: ( ruleIntVar )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4401:1: ruleIntVar
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntIntVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntVar_in_rule__TerminalExpression__IntAssignment_08883);
            ruleIntVar();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getIntIntVarParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__IntAssignment_0"


    // $ANTLR start "rule__TerminalExpression__NumberAssignment_1"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4410:1: rule__TerminalExpression__NumberAssignment_1 : ( ruleNumberVar ) ;
    public final void rule__TerminalExpression__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4414:1: ( ( ruleNumberVar ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4415:1: ( ruleNumberVar )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4415:1: ( ruleNumberVar )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4416:1: ruleNumberVar
            {
             before(grammarAccess.getTerminalExpressionAccess().getNumberNumberVarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumberVar_in_rule__TerminalExpression__NumberAssignment_18914);
            ruleNumberVar();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getNumberNumberVarParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__NumberAssignment_1"


    // $ANTLR start "rule__TerminalExpression__NullAssignment_2"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4425:1: rule__TerminalExpression__NullAssignment_2 : ( ruleNullVar ) ;
    public final void rule__TerminalExpression__NullAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4429:1: ( ( ruleNullVar ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4430:1: ( ruleNullVar )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4430:1: ( ruleNullVar )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4431:1: ruleNullVar
            {
             before(grammarAccess.getTerminalExpressionAccess().getNullNullVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNullVar_in_rule__TerminalExpression__NullAssignment_28945);
            ruleNullVar();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getNullNullVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__NullAssignment_2"


    // $ANTLR start "rule__TerminalExpression__BoolAssignment_3"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4440:1: rule__TerminalExpression__BoolAssignment_3 : ( ruleBoolVar ) ;
    public final void rule__TerminalExpression__BoolAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4444:1: ( ( ruleBoolVar ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4445:1: ( ruleBoolVar )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4445:1: ( ruleBoolVar )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4446:1: ruleBoolVar
            {
             before(grammarAccess.getTerminalExpressionAccess().getBoolBoolVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBoolVar_in_rule__TerminalExpression__BoolAssignment_38976);
            ruleBoolVar();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getBoolBoolVarParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__BoolAssignment_3"


    // $ANTLR start "rule__TerminalExpression__StringAssignment_4"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4455:1: rule__TerminalExpression__StringAssignment_4 : ( ruleStringVar ) ;
    public final void rule__TerminalExpression__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4459:1: ( ( ruleStringVar ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4460:1: ( ruleStringVar )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4460:1: ( ruleStringVar )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4461:1: ruleStringVar
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringStringVarParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStringVar_in_rule__TerminalExpression__StringAssignment_49007);
            ruleStringVar();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getStringStringVarParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__StringAssignment_4"


    // $ANTLR start "rule__IntVar__ValueAssignment"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4470:1: rule__IntVar__ValueAssignment : ( RULE_BIGINT ) ;
    public final void rule__IntVar__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4474:1: ( ( RULE_BIGINT ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4475:1: ( RULE_BIGINT )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4475:1: ( RULE_BIGINT )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4476:1: RULE_BIGINT
            {
             before(grammarAccess.getIntVarAccess().getValueBIGINTTerminalRuleCall_0()); 
            match(input,RULE_BIGINT,FOLLOW_RULE_BIGINT_in_rule__IntVar__ValueAssignment9038); 
             after(grammarAccess.getIntVarAccess().getValueBIGINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVar__ValueAssignment"


    // $ANTLR start "rule__NumberVar__ValueAssignment"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4485:1: rule__NumberVar__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__NumberVar__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4489:1: ( ( RULE_NUMBER ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4490:1: ( RULE_NUMBER )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4490:1: ( RULE_NUMBER )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4491:1: RULE_NUMBER
            {
             before(grammarAccess.getNumberVarAccess().getValueNUMBERTerminalRuleCall_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__NumberVar__ValueAssignment9069); 
             after(grammarAccess.getNumberVarAccess().getValueNUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberVar__ValueAssignment"


    // $ANTLR start "rule__StringVar__ValueAssignment"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4500:1: rule__StringVar__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringVar__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4504:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4505:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4505:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4506:1: RULE_STRING
            {
             before(grammarAccess.getStringVarAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringVar__ValueAssignment9100); 
             after(grammarAccess.getStringVarAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringVar__ValueAssignment"


    // $ANTLR start "rule__NullVar__ValueAssignment"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4515:1: rule__NullVar__ValueAssignment : ( ( 'null' ) ) ;
    public final void rule__NullVar__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4519:1: ( ( ( 'null' ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4520:1: ( ( 'null' ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4520:1: ( ( 'null' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4521:1: ( 'null' )
            {
             before(grammarAccess.getNullVarAccess().getValueNullKeyword_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4522:1: ( 'null' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4523:1: 'null'
            {
             before(grammarAccess.getNullVarAccess().getValueNullKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__NullVar__ValueAssignment9136); 
             after(grammarAccess.getNullVarAccess().getValueNullKeyword_0()); 

            }

             after(grammarAccess.getNullVarAccess().getValueNullKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullVar__ValueAssignment"


    // $ANTLR start "rule__BoolVar__ValueAssignment_0"
    // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4538:1: rule__BoolVar__ValueAssignment_0 : ( ( 'true' ) ) ;
    public final void rule__BoolVar__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4542:1: ( ( ( 'true' ) ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4543:1: ( ( 'true' ) )
            {
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4543:1: ( ( 'true' ) )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4544:1: ( 'true' )
            {
             before(grammarAccess.getBoolVarAccess().getValueTrueKeyword_0_0()); 
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4545:1: ( 'true' )
            // ../fr.chaunier.xtext.path.map.ui/src-gen/fr/chaunier/xtext/path/map/ui/contentassist/antlr/internal/InternalPathDsl.g:4546:1: 'true'
            {
             before(grammarAccess.getBoolVarAccess().getValueTrueKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__BoolVar__ValueAssignment_09180); 
             after(grammarAccess.getBoolVarAccess().getValueTrueKeyword_0_0()); 

            }

             after(grammarAccess.getBoolVarAccess().getValueTrueKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolVar__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModelMap_in_entryRuleModelMap61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMap68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__0_in_ruleModelMap94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapEntity_in_entryRuleMapEntity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapEntity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__0_in_ruleMapEntity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMapEntity_in_entryRuleCallMapEntity361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMapEntity368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__0_in_ruleCallMapEntity394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDef_in_entryRuleRuleDef541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleDef548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__0_in_ruleRuleDef574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_entryRuleFunctionDef601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDef608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__0_in_ruleFunctionDef634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParam_in_entryRuleFunctionParam661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParam668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParam__Group__0_in_ruleFunctionParam694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePath728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__0_in_ruleFeaturePath754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureSet_in_entryRuleFeatureSet781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureSet788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__0_in_ruleFeatureSet814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePathFrom_in_entryRuleFeaturePathFrom841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePathFrom848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathFrom__Group__0_in_ruleFeaturePathFrom874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePathTo_in_entryRuleFeaturePathTo901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePathTo908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathTo__Group__0_in_ruleFeaturePathTo934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathHead_in_entryRulePathHead961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathHead968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathHead__Group__0_in_rulePathHead994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_entryRulePathTail1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathTail1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0_in_rulePathTail1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileSpecModel_in_entryRuleFileSpecModel1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileSpecModel1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__0_in_ruleFileSpecModel1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecLine_in_entryRuleSpecLine1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecLine1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecLine__Alternatives_in_ruleSpecLine1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecInfo_in_entryRuleSpecInfo1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecInfo1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__0_in_ruleSpecInfo1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecVersion_in_entryRuleSpecVersion1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecVersion1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__0_in_ruleSpecVersion1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVar_in_entryRuleIntVar1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVar1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntVar__ValueAssignment_in_ruleIntVar1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVar_in_entryRuleNumberVar1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberVar1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberVar__ValueAssignment_in_ruleNumberVar1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVar_in_entryRuleStringVar1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVar1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringVar__ValueAssignment_in_ruleStringVar1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullVar_in_entryRuleNullVar1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullVar1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullVar__ValueAssignment_in_ruleNullVar1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVar_in_entryRuleBoolVar1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolVar1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVar__Alternatives_in_ruleBoolVar1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InOut__Alternatives_in_ruleInOut1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDef_in_rule__Action__Alternatives1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDef_in_rule__Action__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureSet_in_rule__Action__Alternatives1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePath_in_rule__Action__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMapEntity_in_rule__Action__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocument_in_rule__Action__Alternatives1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecInfo_in_rule__SpecLine__Alternatives1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecVersion_in_rule__SpecLine__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__IntAssignment_0_in_rule__TerminalExpression__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__NumberAssignment_1_in_rule__TerminalExpression__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__NullAssignment_2_in_rule__TerminalExpression__Alternatives1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__BoolAssignment_3_in_rule__TerminalExpression__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__StringAssignment_4_in_rule__TerminalExpression__Alternatives1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolVar__ValueAssignment_0_in_rule__BoolVar__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BoolVar__Alternatives2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__InOut__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InOut__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__0__Impl_in_rule__ModelMap__Group__02108 = new BitSet(new long[]{0x0000000040480000L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__1_in_rule__ModelMap__Group__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__0_in_rule__ModelMap__Group__0__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__1__Impl_in_rule__ModelMap__Group__12169 = new BitSet(new long[]{0x0000000040480000L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__2_in_rule__ModelMap__Group__12172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__ImportsAssignment_1_in_rule__ModelMap__Group__1__Impl2199 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__2__Impl_in_rule__ModelMap__Group__22230 = new BitSet(new long[]{0x0000000040480000L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__3_in_rule__ModelMap__Group__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__RulesAssignment_2_in_rule__ModelMap__Group__2__Impl2260 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group__3__Impl_in_rule__ModelMap__Group__32291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__MappingAssignment_3_in_rule__ModelMap__Group__3__Impl2318 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__0__Impl_in_rule__ModelMap__Group_0__02357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__1_in_rule__ModelMap__Group_0__02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModelMap__Group_0__0__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__1__Impl_in_rule__ModelMap__Group_0__12419 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__2_in_rule__ModelMap__Group_0__12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__SpecAssignment_0_1_in_rule__ModelMap__Group_0__1__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMap__Group_0__2__Impl_in_rule__ModelMap__Group_0__22479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ModelMap__Group_0__2__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group__1__Impl2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02792 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2878 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__0__Impl_in_rule__MapEntity__Group__03035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__1_in_rule__MapEntity__Group__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MapEntity__Group__0__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__1__Impl_in_rule__MapEntity__Group__13097 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__2_in_rule__MapEntity__Group__13100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__NameAssignment_1_in_rule__MapEntity__Group__1__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__2__Impl_in_rule__MapEntity__Group__23157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__3_in_rule__MapEntity__Group__23160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MapEntity__Group__2__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__3__Impl_in_rule__MapEntity__Group__33219 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__4_in_rule__MapEntity__Group__33222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__EntityFromAssignment_3_in_rule__MapEntity__Group__3__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__4__Impl_in_rule__MapEntity__Group__43279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__5_in_rule__MapEntity__Group__43282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MapEntity__Group__4__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__5__Impl_in_rule__MapEntity__Group__53341 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__6_in_rule__MapEntity__Group__53344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__EntityToAssignment_5_in_rule__MapEntity__Group__5__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__6__Impl_in_rule__MapEntity__Group__63401 = new BitSet(new long[]{0x000000516C000000L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__7_in_rule__MapEntity__Group__63404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MapEntity__Group__6__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__7__Impl_in_rule__MapEntity__Group__73463 = new BitSet(new long[]{0x000000516C000000L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__8_in_rule__MapEntity__Group__73466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapEntity__ActionsAssignment_7_in_rule__MapEntity__Group__7__Impl3493 = new BitSet(new long[]{0x0000005168000002L});
    public static final BitSet FOLLOW_rule__MapEntity__Group__8__Impl_in_rule__MapEntity__Group__83524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MapEntity__Group__8__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__0__Impl_in_rule__CallMapEntity__Group__03601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__1_in_rule__CallMapEntity__Group__03604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CallMapEntity__Group__0__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__1__Impl_in_rule__CallMapEntity__Group__13663 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__2_in_rule__CallMapEntity__Group__13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__MappingAssignment_1_in_rule__CallMapEntity__Group__1__Impl3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group__2__Impl_in_rule__CallMapEntity__Group__23723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group_2__0_in_rule__CallMapEntity__Group__2__Impl3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group_2__0__Impl_in_rule__CallMapEntity__Group_2__03787 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group_2__1_in_rule__CallMapEntity__Group_2__03790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CallMapEntity__Group_2__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__Group_2__1__Impl_in_rule__CallMapEntity__Group_2__13849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMapEntity__FeaturePathAssignment_2_1_in_rule__CallMapEntity__Group_2__1__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__03910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__03913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Document__Group__0__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__13972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__DocumentAssignment_1_in_rule__Document__Group__1__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__0__Impl_in_rule__RuleDef__Group__04033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__1_in_rule__RuleDef__Group__04036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RuleDef__Group__0__Impl4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__1__Impl_in_rule__RuleDef__Group__14095 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__2_in_rule__RuleDef__Group__14098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__NameAssignment_1_in_rule__RuleDef__Group__1__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__2__Impl_in_rule__RuleDef__Group__24155 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__3_in_rule__RuleDef__Group__24158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group_2__0_in_rule__RuleDef__Group__2__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group__3__Impl_in_rule__RuleDef__Group__34216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__DescriptionAssignment_3_in_rule__RuleDef__Group__3__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group_2__0__Impl_in_rule__RuleDef__Group_2__04282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RuleDef__Group_2__1_in_rule__RuleDef__Group_2__04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RuleDef__Group_2__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__Group_2__1__Impl_in_rule__RuleDef__Group_2__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuleDef__OperationAssignment_2_1_in_rule__RuleDef__Group_2__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__0__Impl_in_rule__FunctionDef__Group__04405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__1_in_rule__FunctionDef__Group__04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionDef__Group__0__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__1__Impl_in_rule__FunctionDef__Group__14467 = new BitSet(new long[]{0x0000000A00000020L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__2_in_rule__FunctionDef__Group__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__NameAssignment_1_in_rule__FunctionDef__Group__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__2__Impl_in_rule__FunctionDef__Group__24527 = new BitSet(new long[]{0x0000000A00000020L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__3_in_rule__FunctionDef__Group__24530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group_2__0_in_rule__FunctionDef__Group__2__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__3__Impl_in_rule__FunctionDef__Group__34588 = new BitSet(new long[]{0x0000000A00000020L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__4_in_rule__FunctionDef__Group__34591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__DescriptionAssignment_3_in_rule__FunctionDef__Group__3__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__4__Impl_in_rule__FunctionDef__Group__44649 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__5_in_rule__FunctionDef__Group__44652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionDef__Group__4__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__5__Impl_in_rule__FunctionDef__Group__54711 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__6_in_rule__FunctionDef__Group__54714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__ParamsAssignment_5_in_rule__FunctionDef__Group__5__Impl4741 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group__6__Impl_in_rule__FunctionDef__Group__64772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionDef__Group__6__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group_2__0__Impl_in_rule__FunctionDef__Group_2__04845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group_2__1_in_rule__FunctionDef__Group_2__04848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FunctionDef__Group_2__0__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__Group_2__1__Impl_in_rule__FunctionDef__Group_2__14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDef__RuleAssignment_2_1_in_rule__FunctionDef__Group_2__1__Impl4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParam__Group__0__Impl_in_rule__FunctionParam__Group__04968 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FunctionParam__Group__1_in_rule__FunctionParam__Group__04971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParam__InAssignment_0_in_rule__FunctionParam__Group__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParam__Group__1__Impl_in_rule__FunctionParam__Group__15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParam__PathAssignment_1_in_rule__FunctionParam__Group__1__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__05089 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__05092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__FromAssignment_0_in_rule__FeaturePath__Group__0__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__15149 = new BitSet(new long[]{0x0000200800000020L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__2_in_rule__FeaturePath__Group__15152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__ToAssignment_1_in_rule__FeaturePath__Group__1__Impl5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__2__Impl_in_rule__FeaturePath__Group__25209 = new BitSet(new long[]{0x0000200800000020L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__3_in_rule__FeaturePath__Group__25212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__ForEachAssignment_2_in_rule__FeaturePath__Group__2__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__3__Impl_in_rule__FeaturePath__Group__35270 = new BitSet(new long[]{0x0000200800000020L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__4_in_rule__FeaturePath__Group__35273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group_3__0_in_rule__FeaturePath__Group__3__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group__4__Impl_in_rule__FeaturePath__Group__45331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__DescriptionAssignment_4_in_rule__FeaturePath__Group__4__Impl5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group_3__0__Impl_in_rule__FeaturePath__Group_3__05399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group_3__1_in_rule__FeaturePath__Group_3__05402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FeaturePath__Group_3__0__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__Group_3__1__Impl_in_rule__FeaturePath__Group_3__15461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePath__RuleAssignment_3_1_in_rule__FeaturePath__Group_3__1__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__0__Impl_in_rule__FeatureSet__Group__05522 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__1_in_rule__FeatureSet__Group__05525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FeatureSet__Group__0__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__1__Impl_in_rule__FeatureSet__Group__15584 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__2_in_rule__FeatureSet__Group__15587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__InAssignment_1_in_rule__FeatureSet__Group__1__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__2__Impl_in_rule__FeatureSet__Group__25644 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__3_in_rule__FeatureSet__Group__25647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__PathAssignment_2_in_rule__FeatureSet__Group__2__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__3__Impl_in_rule__FeatureSet__Group__35704 = new BitSet(new long[]{0x0000C000000040E0L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__4_in_rule__FeatureSet__Group__35707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FeatureSet__Group__3__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__4__Impl_in_rule__FeatureSet__Group__45766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__5_in_rule__FeatureSet__Group__45769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__ValueAssignment_4_in_rule__FeatureSet__Group__4__Impl5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__Group__5__Impl_in_rule__FeatureSet__Group__55826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureSet__DescriptionAssignment_5_in_rule__FeatureSet__Group__5__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathFrom__Group__0__Impl_in_rule__FeaturePathFrom__Group__05896 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FeaturePathFrom__Group__1_in_rule__FeaturePathFrom__Group__05899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FeaturePathFrom__Group__0__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathFrom__Group__1__Impl_in_rule__FeaturePathFrom__Group__15958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathFrom__PathAssignment_1_in_rule__FeaturePathFrom__Group__1__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathTo__Group__0__Impl_in_rule__FeaturePathTo__Group__06019 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__FeaturePathTo__Group__1_in_rule__FeaturePathTo__Group__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FeaturePathTo__Group__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathTo__Group__1__Impl_in_rule__FeaturePathTo__Group__16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeaturePathTo__PathAssignment_1_in_rule__FeaturePathTo__Group__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathHead__Group__0__Impl_in_rule__PathHead__Group__06142 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PathHead__Group__1_in_rule__PathHead__Group__06145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathHead__EntityAssignment_0_in_rule__PathHead__Group__0__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathHead__Group__1__Impl_in_rule__PathHead__Group__16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathHead__TailAssignment_1_in_rule__PathHead__Group__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__0__Impl_in_rule__PathTail__Group__06263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1_in_rule__PathTail__Group__06266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PathTail__Group__0__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__1__Impl_in_rule__PathTail__Group__16325 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2_in_rule__PathTail__Group__16328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__FeatureAssignment_1_in_rule__PathTail__Group__1__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__Group__2__Impl_in_rule__PathTail__Group__26385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathTail__TailAssignment_2_in_rule__PathTail__Group__2__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__0__Impl_in_rule__FileSpecModel__Group__06449 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__1_in_rule__FileSpecModel__Group__06452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__MappingAssignment_0_in_rule__FileSpecModel__Group__0__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__1__Impl_in_rule__FileSpecModel__Group__16509 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__2_in_rule__FileSpecModel__Group__16512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_1__0_in_rule__FileSpecModel__Group__1__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__2__Impl_in_rule__FileSpecModel__Group__26570 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__3_in_rule__FileSpecModel__Group__26573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_2__0_in_rule__FileSpecModel__Group__2__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group__3__Impl_in_rule__FileSpecModel__Group__36631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__SpecLinesAssignment_3_in_rule__FileSpecModel__Group__3__Impl6658 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_1__0__Impl_in_rule__FileSpecModel__Group_1__06697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_1__1_in_rule__FileSpecModel__Group_1__06700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FileSpecModel__Group_1__0__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_1__1__Impl_in_rule__FileSpecModel__Group_1__16759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__SourcePathAssignment_1_1_in_rule__FileSpecModel__Group_1__1__Impl6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_2__0__Impl_in_rule__FileSpecModel__Group_2__06820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_2__1_in_rule__FileSpecModel__Group_2__06823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FileSpecModel__Group_2__0__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__Group_2__1__Impl_in_rule__FileSpecModel__Group_2__16882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecModel__TargetPathAssignment_2_1_in_rule__FileSpecModel__Group_2__1__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__0__Impl_in_rule__SpecInfo__Group__06943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__1_in_rule__SpecInfo__Group__06946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SpecInfo__Group__0__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__1__Impl_in_rule__SpecInfo__Group__17005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__2_in_rule__SpecInfo__Group__17008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__TitleAssignment_1_in_rule__SpecInfo__Group__1__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__Group__2__Impl_in_rule__SpecInfo__Group__27065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecInfo__LabelAssignment_2_in_rule__SpecInfo__Group__2__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__0__Impl_in_rule__SpecVersion__Group__07128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__1_in_rule__SpecVersion__Group__07131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SpecVersion__Group__0__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__1__Impl_in_rule__SpecVersion__Group__17190 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__2_in_rule__SpecVersion__Group__17193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__VersionAssignment_1_in_rule__SpecVersion__Group__1__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group__2__Impl_in_rule__SpecVersion__Group__27250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group_2__0_in_rule__SpecVersion__Group__2__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group_2__0__Impl_in_rule__SpecVersion__Group_2__07314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group_2__1_in_rule__SpecVersion__Group_2__07317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SpecVersion__Group_2__0__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__Group_2__1__Impl_in_rule__SpecVersion__Group_2__17376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecVersion__CommentAssignment_2_1_in_rule__SpecVersion__Group_2__1__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileSpecModel_in_rule__ModelMap__SpecAssignment_0_17442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ModelMap__ImportsAssignment_17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleDef_in_rule__ModelMap__RulesAssignment_27504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapEntity_in_rule__ModelMap__MappingAssignment_37535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MapEntity__NameAssignment_17597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MapEntity__EntityFromAssignment_37632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MapEntity__EntityToAssignment_57671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__MapEntity__ActionsAssignment_77706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__CallMapEntity__MappingAssignment_17741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePath_in_rule__CallMapEntity__FeaturePathAssignment_2_17776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Document__DocumentAssignment_17807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuleDef__NameAssignment_17838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RuleDef__OperationAssignment_2_17869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RuleDef__DescriptionAssignment_37900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDef__NameAssignment_17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDef__RuleAssignment_2_17966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionDef__DescriptionAssignment_38001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParam_in_rule__FunctionDef__ParamsAssignment_58032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOut_in_rule__FunctionParam__InAssignment_08063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FunctionParam__PathAssignment_18094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePathFrom_in_rule__FeaturePath__FromAssignment_08125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeaturePathTo_in_rule__FeaturePath__ToAssignment_18156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FeaturePath__ForEachAssignment_28192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FeaturePath__RuleAssignment_3_18235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeaturePath__DescriptionAssignment_48270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOut_in_rule__FeatureSet__InAssignment_18301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FeatureSet__PathAssignment_28332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__FeatureSet__ValueAssignment_48363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureSet__DescriptionAssignment_58394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FeaturePathFrom__PathAssignment_18425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__FeaturePathTo__PathAssignment_18456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathHead__EntityAssignment_08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__PathHead__TailAssignment_18526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathTail__FeatureAssignment_18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathTail_in_rule__PathTail__TailAssignment_28596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FileSpecModel__MappingAssignment_08631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileSpecModel__SourcePathAssignment_1_18666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileSpecModel__TargetPathAssignment_2_18697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecLine_in_rule__FileSpecModel__SpecLinesAssignment_38728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecInfo__TitleAssignment_18759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecInfo__LabelAssignment_28790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecVersion__VersionAssignment_18821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecVersion__CommentAssignment_2_18852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVar_in_rule__TerminalExpression__IntAssignment_08883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberVar_in_rule__TerminalExpression__NumberAssignment_18914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullVar_in_rule__TerminalExpression__NullAssignment_28945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolVar_in_rule__TerminalExpression__BoolAssignment_38976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVar_in_rule__TerminalExpression__StringAssignment_49007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIGINT_in_rule__IntVar__ValueAssignment9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__NumberVar__ValueAssignment9069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringVar__ValueAssignment9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NullVar__ValueAssignment9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__BoolVar__ValueAssignment_09180 = new BitSet(new long[]{0x0000000000000002L});

}