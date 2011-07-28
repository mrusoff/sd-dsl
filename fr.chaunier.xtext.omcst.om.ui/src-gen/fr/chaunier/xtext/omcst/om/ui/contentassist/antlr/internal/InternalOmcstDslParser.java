package fr.chaunier.xtext.omcst.om.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.omcst.om.services.OmcstDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmcstDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'public'", "'private'", "'protected'", "'as String'", "'as Value'", "'import'", "'element'", "'package'", "'{'", "'}'", "'prefix'", "'namespace'", "'annotations'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "';'", "'='", "'.*'", "'.'", "','", "'regexp'", "'enum'", "'fixeLen'", "'minVal'", "'maxVal'", "'minLen'", "'maxLen'", "'paddle'", "'*'", "'?'", "'boolean'", "'string'", "'datetime'", "'default'", "'decimal'", "'fixed'", "'id'", "'nullable'", "'derived'", "'writable'", "'xsdA.'"
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
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOmcstDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOmcstDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOmcstDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g"; }


     
     	private OmcstDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OmcstDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainModel"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:61:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:62:1: ( ruleDomainModel EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:63:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:70:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:74:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:76:1: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:77:1: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=17 && LA1_0<=19)||(LA1_0>=25 && LA1_0<=26)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:77:2: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94);
            	    rule__DomainModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:90:1: ( ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:91:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:98:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:102:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:104:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:105:1: ( rule__AbstractElement__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:105:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:117:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:118:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:119:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport182);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport189); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:126:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:130:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:132:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:133:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:133:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport215);
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


    // $ANTLR start "entryRuleXsdElement"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:145:1: entryRuleXsdElement : ruleXsdElement EOF ;
    public final void entryRuleXsdElement() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:146:1: ( ruleXsdElement EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:147:1: ruleXsdElement EOF
            {
             before(grammarAccess.getXsdElementRule()); 
            pushFollow(FOLLOW_ruleXsdElement_in_entryRuleXsdElement242);
            ruleXsdElement();

            state._fsp--;

             after(grammarAccess.getXsdElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXsdElement249); 

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
    // $ANTLR end "entryRuleXsdElement"


    // $ANTLR start "ruleXsdElement"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:154:1: ruleXsdElement : ( ( rule__XsdElement__Group__0 ) ) ;
    public final void ruleXsdElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:158:2: ( ( ( rule__XsdElement__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:159:1: ( ( rule__XsdElement__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:159:1: ( ( rule__XsdElement__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:160:1: ( rule__XsdElement__Group__0 )
            {
             before(grammarAccess.getXsdElementAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:161:1: ( rule__XsdElement__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:161:2: rule__XsdElement__Group__0
            {
            pushFollow(FOLLOW_rule__XsdElement__Group__0_in_ruleXsdElement275);
            rule__XsdElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXsdElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXsdElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:173:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:174:1: ( rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:175:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration302);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration309); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:182:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:186:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:187:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:187:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:188:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:189:1: ( rule__PackageDeclaration__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:189:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration335);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleType"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:201:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:202:1: ( ruleType EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:203:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType362);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType369); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:210:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:214:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:215:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:215:1: ( ( rule__Type__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:216:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:217:1: ( rule__Type__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:217:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType395);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:229:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:230:1: ( ruleDataType EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:231:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType422);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType429); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:238:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:242:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:243:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:243:1: ( ( rule__DataType__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:244:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:245:1: ( rule__DataType__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:245:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType455);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:257:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:258:1: ( ruleEntity EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:259:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity482);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity489); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:266:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:270:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:271:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:271:1: ( ( rule__Entity__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:272:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:273:1: ( rule__Entity__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:273:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity515);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:285:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:286:1: ( ruleFeature EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:287:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature542);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature549); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:294:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:298:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:299:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:299:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:300:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:301:1: ( rule__Feature__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:301:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature575);
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


    // $ANTLR start "entryRuleStructuralFeature"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:313:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:314:1: ( ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:315:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature602);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getStructuralFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature609); 

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
    // $ANTLR end "entryRuleStructuralFeature"


    // $ANTLR start "ruleStructuralFeature"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:322:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:326:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:327:1: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:327:1: ( ( rule__StructuralFeature__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:328:1: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:329:1: ( rule__StructuralFeature__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:329:2: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature635);
            rule__StructuralFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralFeature"


    // $ANTLR start "entryRuleAttribute"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:342:1: ( ruleAttribute EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:343:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute662);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute669); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:350:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:354:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:355:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:355:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:356:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:357:1: ( rule__Attribute__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:357:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute695);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:369:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:370:1: ( ruleReference EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:371:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference722);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference729); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:378:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:382:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:383:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:383:1: ( ( rule__Reference__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:384:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:385:1: ( rule__Reference__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:385:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference755);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumeration"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:397:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:398:1: ( ruleEnumeration EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:399:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration782);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration789); 

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:406:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:410:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:411:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:411:1: ( ( rule__Enumeration__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:412:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:413:1: ( rule__Enumeration__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:413:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration815);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:425:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:426:1: ( ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:427:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral842);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral849); 

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:434:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:438:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:439:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:439:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:440:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:441:1: ( rule__EnumerationLiteral__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:441:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral875);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleParameter"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:455:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:456:1: ( ruleParameter EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:457:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter904);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter911); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:464:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:468:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:469:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:469:1: ( ( rule__Parameter__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:470:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:471:1: ( rule__Parameter__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:471:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter937);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeRef"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:485:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:486:1: ( ruleTypeRef EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:487:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef966);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef973); 

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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:494:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:498:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:499:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:499:1: ( ( rule__TypeRef__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:500:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:501:1: ( rule__TypeRef__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:501:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef999);
            rule__TypeRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:513:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:514:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:515:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1026);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1033); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:522:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:526:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:527:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:527:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:528:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:529:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:529:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard1059);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:541:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:542:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:543:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1086);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1093); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:550:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:554:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:555:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:555:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:556:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:557:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:557:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1119);
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


    // $ANTLR start "entryRuleAnnotations"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:569:1: entryRuleAnnotations : ruleAnnotations EOF ;
    public final void entryRuleAnnotations() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:570:1: ( ruleAnnotations EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:571:1: ruleAnnotations EOF
            {
             before(grammarAccess.getAnnotationsRule()); 
            pushFollow(FOLLOW_ruleAnnotations_in_entryRuleAnnotations1146);
            ruleAnnotations();

            state._fsp--;

             after(grammarAccess.getAnnotationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotations1153); 

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
    // $ANTLR end "entryRuleAnnotations"


    // $ANTLR start "ruleAnnotations"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:578:1: ruleAnnotations : ( ( rule__Annotations__Group__0 )? ) ;
    public final void ruleAnnotations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:582:2: ( ( ( rule__Annotations__Group__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:583:1: ( ( rule__Annotations__Group__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:583:1: ( ( rule__Annotations__Group__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:584:1: ( rule__Annotations__Group__0 )?
            {
             before(grammarAccess.getAnnotationsAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:585:1: ( rule__Annotations__Group__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:585:2: rule__Annotations__Group__0
                    {
                    pushFollow(FOLLOW_rule__Annotations__Group__0_in_ruleAnnotations1179);
                    rule__Annotations__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotations"


    // $ANTLR start "entryRuleAnnotation"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:597:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:598:1: ( ruleAnnotation EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:599:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1207);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1214); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:606:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:610:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:611:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:611:1: ( ( rule__Annotation__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:612:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:613:1: ( rule__Annotation__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:613:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1240);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:625:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:626:1: ( ruleConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:627:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1267);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1274); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:634:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:638:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:639:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:639:1: ( ( rule__Constraint__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:640:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:641:1: ( rule__Constraint__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:641:2: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1300);
            rule__Constraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleBoolConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:653:1: entryRuleBoolConstraint : ruleBoolConstraint EOF ;
    public final void entryRuleBoolConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:654:1: ( ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:655:1: ruleBoolConstraint EOF
            {
             before(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1327);
            ruleBoolConstraint();

            state._fsp--;

             after(grammarAccess.getBoolConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint1334); 

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
    // $ANTLR end "entryRuleBoolConstraint"


    // $ANTLR start "ruleBoolConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:662:1: ruleBoolConstraint : ( ( rule__BoolConstraint__ConstraintAssignment ) ) ;
    public final void ruleBoolConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:666:2: ( ( ( rule__BoolConstraint__ConstraintAssignment ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:667:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:667:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:668:1: ( rule__BoolConstraint__ConstraintAssignment )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintAssignment()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:669:1: ( rule__BoolConstraint__ConstraintAssignment )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:669:2: rule__BoolConstraint__ConstraintAssignment
            {
            pushFollow(FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint1360);
            rule__BoolConstraint__ConstraintAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolConstraintAccess().getConstraintAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolConstraint"


    // $ANTLR start "entryRuleStringConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:681:1: entryRuleStringConstraint : ruleStringConstraint EOF ;
    public final void entryRuleStringConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:682:1: ( ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:683:1: ruleStringConstraint EOF
            {
             before(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1387);
            ruleStringConstraint();

            state._fsp--;

             after(grammarAccess.getStringConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint1394); 

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
    // $ANTLR end "entryRuleStringConstraint"


    // $ANTLR start "ruleStringConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:690:1: ruleStringConstraint : ( ( rule__StringConstraint__Group__0 ) ) ;
    public final void ruleStringConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:694:2: ( ( ( rule__StringConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:695:1: ( ( rule__StringConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:695:1: ( ( rule__StringConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:696:1: ( rule__StringConstraint__Group__0 )
            {
             before(grammarAccess.getStringConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:697:1: ( rule__StringConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:697:2: rule__StringConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1420);
            rule__StringConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringConstraint"


    // $ANTLR start "entryRuleDateTimeConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:709:1: entryRuleDateTimeConstraint : ruleDateTimeConstraint EOF ;
    public final void entryRuleDateTimeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:710:1: ( ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:711:1: ruleDateTimeConstraint EOF
            {
             before(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1447);
            ruleDateTimeConstraint();

            state._fsp--;

             after(grammarAccess.getDateTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint1454); 

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
    // $ANTLR end "entryRuleDateTimeConstraint"


    // $ANTLR start "ruleDateTimeConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:718:1: ruleDateTimeConstraint : ( ( rule__DateTimeConstraint__Group__0 ) ) ;
    public final void ruleDateTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:722:2: ( ( ( rule__DateTimeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:723:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:723:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:724:1: ( rule__DateTimeConstraint__Group__0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:725:1: ( rule__DateTimeConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:725:2: rule__DateTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1480);
            rule__DateTimeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTimeConstraint"


    // $ANTLR start "entryRuleDecimalConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:737:1: entryRuleDecimalConstraint : ruleDecimalConstraint EOF ;
    public final void entryRuleDecimalConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:738:1: ( ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:739:1: ruleDecimalConstraint EOF
            {
             before(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1507);
            ruleDecimalConstraint();

            state._fsp--;

             after(grammarAccess.getDecimalConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint1514); 

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
    // $ANTLR end "entryRuleDecimalConstraint"


    // $ANTLR start "ruleDecimalConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:746:1: ruleDecimalConstraint : ( ( rule__DecimalConstraint__Group__0 ) ) ;
    public final void ruleDecimalConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:750:2: ( ( ( rule__DecimalConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:751:1: ( ( rule__DecimalConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:751:1: ( ( rule__DecimalConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:752:1: ( rule__DecimalConstraint__Group__0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:753:1: ( rule__DecimalConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:753:2: rule__DecimalConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1540);
            rule__DecimalConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalConstraint"


    // $ANTLR start "entryRuleEnumerationConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:765:1: entryRuleEnumerationConstraint : ruleEnumerationConstraint EOF ;
    public final void entryRuleEnumerationConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:766:1: ( ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:767:1: ruleEnumerationConstraint EOF
            {
             before(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1567);
            ruleEnumerationConstraint();

            state._fsp--;

             after(grammarAccess.getEnumerationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint1574); 

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
    // $ANTLR end "entryRuleEnumerationConstraint"


    // $ANTLR start "ruleEnumerationConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:774:1: ruleEnumerationConstraint : ( ( rule__EnumerationConstraint__Group__0 ) ) ;
    public final void ruleEnumerationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:778:2: ( ( ( rule__EnumerationConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:779:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:779:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:780:1: ( rule__EnumerationConstraint__Group__0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:781:1: ( rule__EnumerationConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:781:2: rule__EnumerationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1600);
            rule__EnumerationConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationConstraint"


    // $ANTLR start "entryRuleNumberConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:793:1: entryRuleNumberConstraint : ruleNumberConstraint EOF ;
    public final void entryRuleNumberConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:794:1: ( ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:795:1: ruleNumberConstraint EOF
            {
             before(grammarAccess.getNumberConstraintRule()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1627);
            ruleNumberConstraint();

            state._fsp--;

             after(grammarAccess.getNumberConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint1634); 

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
    // $ANTLR end "entryRuleNumberConstraint"


    // $ANTLR start "ruleNumberConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:802:1: ruleNumberConstraint : ( ( rule__NumberConstraint__Group__0 ) ) ;
    public final void ruleNumberConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:806:2: ( ( ( rule__NumberConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:807:1: ( ( rule__NumberConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:807:1: ( ( rule__NumberConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:808:1: ( rule__NumberConstraint__Group__0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:809:1: ( rule__NumberConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:809:2: rule__NumberConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1660);
            rule__NumberConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberConstraint"


    // $ANTLR start "entryRuleAllConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:821:1: entryRuleAllConstraint : ruleAllConstraint EOF ;
    public final void entryRuleAllConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:822:1: ( ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:823:1: ruleAllConstraint EOF
            {
             before(grammarAccess.getAllConstraintRule()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1687);
            ruleAllConstraint();

            state._fsp--;

             after(grammarAccess.getAllConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint1694); 

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
    // $ANTLR end "entryRuleAllConstraint"


    // $ANTLR start "ruleAllConstraint"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:830:1: ruleAllConstraint : ( ( rule__AllConstraint__Group__0 ) ) ;
    public final void ruleAllConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:834:2: ( ( ( rule__AllConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:835:1: ( ( rule__AllConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:835:1: ( ( rule__AllConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:836:1: ( rule__AllConstraint__Group__0 )
            {
             before(grammarAccess.getAllConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:837:1: ( rule__AllConstraint__Group__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:837:2: rule__AllConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1720);
            rule__AllConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllConstraint"


    // $ANTLR start "ruleVisibility"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:850:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:854:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:855:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:855:1: ( ( rule__Visibility__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:856:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:857:1: ( rule__Visibility__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:857:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1757);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleEntityType"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:869:1: ruleEntityType : ( ( 'abstract' ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:873:1: ( ( ( 'abstract' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:874:1: ( ( 'abstract' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:874:1: ( ( 'abstract' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:875:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityTypeAccess().getAbstractEnumLiteralDeclaration()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:876:1: ( 'abstract' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:876:3: 'abstract'
            {
            match(input,11,FOLLOW_11_in_ruleEntityType1794); 

            }

             after(grammarAccess.getEntityTypeAccess().getAbstractEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "ruleEnumUsage"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:891:1: ruleEnumUsage : ( ( rule__EnumUsage__Alternatives ) ) ;
    public final void ruleEnumUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:895:1: ( ( ( rule__EnumUsage__Alternatives ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:896:1: ( ( rule__EnumUsage__Alternatives ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:896:1: ( ( rule__EnumUsage__Alternatives ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:897:1: ( rule__EnumUsage__Alternatives )
            {
             before(grammarAccess.getEnumUsageAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:898:1: ( rule__EnumUsage__Alternatives )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:898:2: rule__EnumUsage__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1834);
            rule__EnumUsage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumUsageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumUsage"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:909:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleXsdElement ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:913:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) | ( ruleXsdElement ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 11:
            case 25:
            case 26:
            case 31:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:914:1: ( rulePackageDeclaration )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:914:1: ( rulePackageDeclaration )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:915:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1869);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:920:6: ( ruleType )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:920:6: ( ruleType )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:921:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1886);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:926:6: ( ruleImport )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:926:6: ( ruleImport )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:927:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1903);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:932:6: ( ruleXsdElement )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:932:6: ( ruleXsdElement )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:933:1: ruleXsdElement
                    {
                     before(grammarAccess.getAbstractElementAccess().getXsdElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleXsdElement_in_rule__AbstractElement__Alternatives1920);
                    ruleXsdElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getXsdElementParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:943:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:947:1: ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
            case 26:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:948:1: ( ruleEntity )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:948:1: ( ruleEntity )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:949:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1952);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:954:6: ( ruleDataType )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:954:6: ( ruleDataType )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:955:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1969);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:960:6: ( ruleEnumeration )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:960:6: ( ruleEnumeration )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:961:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1986);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__StructuralFeature__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:971:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:975:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:976:1: ( ruleAttribute )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:976:1: ( ruleAttribute )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:977:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2018);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:982:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:982:6: ( ruleReference )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:983:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2035);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__StructuralFeature__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:994:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:998:1: ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt6=1;
                }
                break;
            case 50:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            case 53:
                {
                alt6=4;
                }
                break;
            case 40:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:999:1: ( ruleBoolConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:999:1: ( ruleBoolConstraint )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1000:1: ruleBoolConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives2068);
                    ruleBoolConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1005:6: ( ruleStringConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1005:6: ( ruleStringConstraint )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1006:1: ruleStringConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives2085);
                    ruleStringConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1011:6: ( ruleDateTimeConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1011:6: ( ruleDateTimeConstraint )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1012:1: ruleDateTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives2102);
                    ruleDateTimeConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1017:6: ( ruleDecimalConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1017:6: ( ruleDecimalConstraint )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1018:1: ruleDecimalConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives2119);
                    ruleDecimalConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1023:6: ( ruleEnumerationConstraint )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1023:6: ( ruleEnumerationConstraint )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1024:1: ruleEnumerationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives2136);
                    ruleEnumerationConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_4()); 

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
    // $ANTLR end "rule__Constraint__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1034:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1038:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1039:1: ( ( 'public' ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1039:1: ( ( 'public' ) )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1040:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1041:1: ( 'public' )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1041:3: 'public'
                    {
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives2169); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1046:6: ( ( 'private' ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1046:6: ( ( 'private' ) )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1047:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1048:1: ( 'private' )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1048:3: 'private'
                    {
                    match(input,13,FOLLOW_13_in_rule__Visibility__Alternatives2190); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1053:6: ( ( 'protected' ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1053:6: ( ( 'protected' ) )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1054:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1055:1: ( 'protected' )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1055:3: 'protected'
                    {
                    match(input,14,FOLLOW_14_in_rule__Visibility__Alternatives2211); 

                    }

                     after(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__EnumUsage__Alternatives"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1065:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) );
    public final void rule__EnumUsage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1069:1: ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1070:1: ( ( 'as String' ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1070:1: ( ( 'as String' ) )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1071:1: ( 'as String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1072:1: ( 'as String' )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1072:3: 'as String'
                    {
                    match(input,15,FOLLOW_15_in_rule__EnumUsage__Alternatives2247); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1077:6: ( ( 'as Value' ) )
                    {
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1077:6: ( ( 'as Value' ) )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1078:1: ( 'as Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1079:1: ( 'as Value' )
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1079:3: 'as Value'
                    {
                    match(input,16,FOLLOW_16_in_rule__EnumUsage__Alternatives2268); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EnumUsage__Alternatives"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1091:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1095:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1096:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02301);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02304);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1103:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1107:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1108:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1108:1: ( 'import' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1109:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl2332); 
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1122:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1126:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1127:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12363);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1133:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1137:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1138:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1138:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1139:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1140:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1140:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2390);
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


    // $ANTLR start "rule__XsdElement__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1154:1: rule__XsdElement__Group__0 : rule__XsdElement__Group__0__Impl rule__XsdElement__Group__1 ;
    public final void rule__XsdElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1158:1: ( rule__XsdElement__Group__0__Impl rule__XsdElement__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1159:2: rule__XsdElement__Group__0__Impl rule__XsdElement__Group__1
            {
            pushFollow(FOLLOW_rule__XsdElement__Group__0__Impl_in_rule__XsdElement__Group__02424);
            rule__XsdElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XsdElement__Group__1_in_rule__XsdElement__Group__02427);
            rule__XsdElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XsdElement__Group__0"


    // $ANTLR start "rule__XsdElement__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1166:1: rule__XsdElement__Group__0__Impl : ( 'element' ) ;
    public final void rule__XsdElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1170:1: ( ( 'element' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1171:1: ( 'element' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1171:1: ( 'element' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1172:1: 'element'
            {
             before(grammarAccess.getXsdElementAccess().getElementKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__XsdElement__Group__0__Impl2455); 
             after(grammarAccess.getXsdElementAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XsdElement__Group__0__Impl"


    // $ANTLR start "rule__XsdElement__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1185:1: rule__XsdElement__Group__1 : rule__XsdElement__Group__1__Impl ;
    public final void rule__XsdElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1189:1: ( rule__XsdElement__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1190:2: rule__XsdElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XsdElement__Group__1__Impl_in_rule__XsdElement__Group__12486);
            rule__XsdElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XsdElement__Group__1"


    // $ANTLR start "rule__XsdElement__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1196:1: rule__XsdElement__Group__1__Impl : ( ( rule__XsdElement__XsdElementAssignment_1 ) ) ;
    public final void rule__XsdElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1200:1: ( ( ( rule__XsdElement__XsdElementAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1201:1: ( ( rule__XsdElement__XsdElementAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1201:1: ( ( rule__XsdElement__XsdElementAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1202:1: ( rule__XsdElement__XsdElementAssignment_1 )
            {
             before(grammarAccess.getXsdElementAccess().getXsdElementAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1203:1: ( rule__XsdElement__XsdElementAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1203:2: rule__XsdElement__XsdElementAssignment_1
            {
            pushFollow(FOLLOW_rule__XsdElement__XsdElementAssignment_1_in_rule__XsdElement__Group__1__Impl2513);
            rule__XsdElement__XsdElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXsdElementAccess().getXsdElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XsdElement__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1217:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1221:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1222:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02547);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02550);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1229:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1233:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1234:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1234:1: ( 'package' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1235:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__PackageDeclaration__Group__0__Impl2578); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1248:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1252:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1253:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12609);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12612);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1260:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1264:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1265:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1265:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1266:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1267:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1267:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2639);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1277:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1281:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1282:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22669);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22672);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1289:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__Group_2__0 )? ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1293:1: ( ( ( rule__PackageDeclaration__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1294:1: ( ( rule__PackageDeclaration__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1294:1: ( ( rule__PackageDeclaration__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1295:1: ( rule__PackageDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1296:1: ( rule__PackageDeclaration__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1296:2: rule__PackageDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2699);
                    rule__PackageDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1306:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1310:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1311:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32730);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32733);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1318:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 )? ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1322:1: ( ( ( rule__PackageDeclaration__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1323:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1323:1: ( ( rule__PackageDeclaration__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1324:1: ( rule__PackageDeclaration__Group_3__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1325:1: ( rule__PackageDeclaration__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1325:2: rule__PackageDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2760);
                    rule__PackageDeclaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1335:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1339:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1340:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42791);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42794);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1347:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__Group_4__0 )? ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1351:1: ( ( ( rule__PackageDeclaration__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1352:1: ( ( rule__PackageDeclaration__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1352:1: ( ( rule__PackageDeclaration__Group_4__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1353:1: ( rule__PackageDeclaration__Group_4__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1354:1: ( rule__PackageDeclaration__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1354:2: rule__PackageDeclaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_4__0_in_rule__PackageDeclaration__Group__4__Impl2821);
                    rule__PackageDeclaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1364:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1368:1: ( rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1369:2: rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52852);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52855);
            rule__PackageDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1376:1: rule__PackageDeclaration__Group__5__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1380:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1381:1: ( '{' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1381:1: ( '{' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1382:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__PackageDeclaration__Group__5__Impl2883); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1395:1: rule__PackageDeclaration__Group__6 : rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 ;
    public final void rule__PackageDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1399:1: ( rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1400:2: rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62914);
            rule__PackageDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62917);
            rule__PackageDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__6"


    // $ANTLR start "rule__PackageDeclaration__Group__6__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1407:1: rule__PackageDeclaration__Group__6__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_6 )* ) ;
    public final void rule__PackageDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1411:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_6 )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1412:1: ( ( rule__PackageDeclaration__ElementsAssignment_6 )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1412:1: ( ( rule__PackageDeclaration__ElementsAssignment_6 )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1413:1: ( rule__PackageDeclaration__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_6()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1414:1: ( rule__PackageDeclaration__ElementsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11||(LA12_0>=17 && LA12_0<=19)||(LA12_0>=25 && LA12_0<=26)||LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1414:2: rule__PackageDeclaration__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2944);
            	    rule__PackageDeclaration__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__6__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1424:1: rule__PackageDeclaration__Group__7 : rule__PackageDeclaration__Group__7__Impl ;
    public final void rule__PackageDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1428:1: ( rule__PackageDeclaration__Group__7__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1429:2: rule__PackageDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72975);
            rule__PackageDeclaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__7"


    // $ANTLR start "rule__PackageDeclaration__Group__7__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1435:1: rule__PackageDeclaration__Group__7__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1439:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1440:1: ( '}' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1440:1: ( '}' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1441:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__7__Impl3003); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__7__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1470:1: rule__PackageDeclaration__Group_2__0 : rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 ;
    public final void rule__PackageDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1474:1: ( rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1475:2: rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__03050);
            rule__PackageDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__03053);
            rule__PackageDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__0"


    // $ANTLR start "rule__PackageDeclaration__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1482:1: rule__PackageDeclaration__Group_2__0__Impl : ( 'prefix' ) ;
    public final void rule__PackageDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1486:1: ( ( 'prefix' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1487:1: ( 'prefix' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1487:1: ( 'prefix' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1488:1: 'prefix'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group_2__0__Impl3081); 
             after(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1501:1: rule__PackageDeclaration__Group_2__1 : rule__PackageDeclaration__Group_2__1__Impl ;
    public final void rule__PackageDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1505:1: ( rule__PackageDeclaration__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1506:2: rule__PackageDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__13112);
            rule__PackageDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__1"


    // $ANTLR start "rule__PackageDeclaration__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1512:1: rule__PackageDeclaration__Group_2__1__Impl : ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) ;
    public final void rule__PackageDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1516:1: ( ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1517:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1517:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1518:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1519:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1519:2: rule__PackageDeclaration__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl3139);
            rule__PackageDeclaration__PrefixAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getPrefixAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1533:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
    public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1537:1: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1538:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__03173);
            rule__PackageDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__03176);
            rule__PackageDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__0"


    // $ANTLR start "rule__PackageDeclaration__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1545:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1549:1: ( ( 'namespace' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1550:1: ( 'namespace' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1550:1: ( 'namespace' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1551:1: 'namespace'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__PackageDeclaration__Group_3__0__Impl3204); 
             after(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1564:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1568:1: ( rule__PackageDeclaration__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1569:2: rule__PackageDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13235);
            rule__PackageDeclaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__1"


    // $ANTLR start "rule__PackageDeclaration__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1575:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) ;
    public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1579:1: ( ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1580:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1580:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1581:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1582:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1582:2: rule__PackageDeclaration__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3262);
            rule__PackageDeclaration__NamespaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNamespaceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_4__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1596:1: rule__PackageDeclaration__Group_4__0 : rule__PackageDeclaration__Group_4__0__Impl rule__PackageDeclaration__Group_4__1 ;
    public final void rule__PackageDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1600:1: ( rule__PackageDeclaration__Group_4__0__Impl rule__PackageDeclaration__Group_4__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1601:2: rule__PackageDeclaration__Group_4__0__Impl rule__PackageDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_4__0__Impl_in_rule__PackageDeclaration__Group_4__03296);
            rule__PackageDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_4__1_in_rule__PackageDeclaration__Group_4__03299);
            rule__PackageDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_4__0"


    // $ANTLR start "rule__PackageDeclaration__Group_4__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1608:1: rule__PackageDeclaration__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__PackageDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1612:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1613:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1613:1: ( 'annotations' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1614:1: 'annotations'
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__PackageDeclaration__Group_4__0__Impl3327); 
             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_4__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1627:1: rule__PackageDeclaration__Group_4__1 : rule__PackageDeclaration__Group_4__1__Impl ;
    public final void rule__PackageDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1631:1: ( rule__PackageDeclaration__Group_4__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1632:2: rule__PackageDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_4__1__Impl_in_rule__PackageDeclaration__Group_4__13358);
            rule__PackageDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_4__1"


    // $ANTLR start "rule__PackageDeclaration__Group_4__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1638:1: rule__PackageDeclaration__Group_4__1__Impl : ( ( rule__PackageDeclaration__AnnoAssignment_4_1 ) ) ;
    public final void rule__PackageDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1642:1: ( ( ( rule__PackageDeclaration__AnnoAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1643:1: ( ( rule__PackageDeclaration__AnnoAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1643:1: ( ( rule__PackageDeclaration__AnnoAssignment_4_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1644:1: ( rule__PackageDeclaration__AnnoAssignment_4_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnoAssignment_4_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1645:1: ( rule__PackageDeclaration__AnnoAssignment_4_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1645:2: rule__PackageDeclaration__AnnoAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__AnnoAssignment_4_1_in_rule__PackageDeclaration__Group_4__1__Impl3385);
            rule__PackageDeclaration__AnnoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getAnnoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1659:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1663:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1664:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03419);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03422);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1671:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1675:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1676:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1676:1: ( 'datatype' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1677:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__DataType__Group__0__Impl3450); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1690:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1694:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1695:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13481);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13484);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1702:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1706:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1707:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1707:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1708:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1709:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1709:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3511);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1719:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1723:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1724:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23541);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23544);
            rule__DataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1731:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__ConstraintAssignment_2 )? ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1735:1: ( ( ( rule__DataType__ConstraintAssignment_2 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1736:1: ( ( rule__DataType__ConstraintAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1736:1: ( ( rule__DataType__ConstraintAssignment_2 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1737:1: ( rule__DataType__ConstraintAssignment_2 )?
            {
             before(grammarAccess.getDataTypeAccess().getConstraintAssignment_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1738:1: ( rule__DataType__ConstraintAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40||(LA13_0>=49 && LA13_0<=51)||LA13_0==53) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1738:2: rule__DataType__ConstraintAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DataType__ConstraintAssignment_2_in_rule__DataType__Group__2__Impl3571);
                    rule__DataType__ConstraintAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getConstraintAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1748:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1752:1: ( rule__DataType__Group__3__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1753:2: rule__DataType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33602);
            rule__DataType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1759:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__Group_3__0 )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1763:1: ( ( ( rule__DataType__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1764:1: ( ( rule__DataType__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1764:1: ( ( rule__DataType__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1765:1: ( rule__DataType__Group_3__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1766:1: ( rule__DataType__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1766:2: rule__DataType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DataType__Group_3__0_in_rule__DataType__Group__3__Impl3629);
                    rule__DataType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1784:1: rule__DataType__Group_3__0 : rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 ;
    public final void rule__DataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1788:1: ( rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1789:2: rule__DataType__Group_3__0__Impl rule__DataType__Group_3__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_3__0__Impl_in_rule__DataType__Group_3__03668);
            rule__DataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_3__1_in_rule__DataType__Group_3__03671);
            rule__DataType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__0"


    // $ANTLR start "rule__DataType__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1796:1: rule__DataType__Group_3__0__Impl : ( 'annotations' ) ;
    public final void rule__DataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1800:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1801:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1801:1: ( 'annotations' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1802:1: 'annotations'
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__DataType__Group_3__0__Impl3699); 
             after(grammarAccess.getDataTypeAccess().getAnnotationsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__0__Impl"


    // $ANTLR start "rule__DataType__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1815:1: rule__DataType__Group_3__1 : rule__DataType__Group_3__1__Impl ;
    public final void rule__DataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1819:1: ( rule__DataType__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1820:2: rule__DataType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_3__1__Impl_in_rule__DataType__Group_3__13730);
            rule__DataType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__1"


    // $ANTLR start "rule__DataType__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1826:1: rule__DataType__Group_3__1__Impl : ( ( rule__DataType__AnnoAssignment_3_1 ) ) ;
    public final void rule__DataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1830:1: ( ( ( rule__DataType__AnnoAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1831:1: ( ( rule__DataType__AnnoAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1831:1: ( ( rule__DataType__AnnoAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1832:1: ( rule__DataType__AnnoAssignment_3_1 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnoAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1833:1: ( rule__DataType__AnnoAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1833:2: rule__DataType__AnnoAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DataType__AnnoAssignment_3_1_in_rule__DataType__Group_3__1__Impl3757);
            rule__DataType__AnnoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1847:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1851:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1852:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03791);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03794);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1859:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__EntityTypeAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1863:1: ( ( ( rule__Entity__EntityTypeAssignment_0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1864:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1864:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1865:1: ( rule__Entity__EntityTypeAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getEntityTypeAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1866:1: ( rule__Entity__EntityTypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1866:2: rule__Entity__EntityTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3821);
                    rule__Entity__EntityTypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getEntityTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1876:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1880:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1881:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13852);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13855);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1888:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1892:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1893:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1893:1: ( 'entity' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1894:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Entity__Group__1__Impl3883); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1907:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1911:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1912:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23914);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23917);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1919:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1923:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1924:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1924:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1925:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1926:1: ( rule__Entity__NameAssignment_2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1926:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3944);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1936:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1940:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1941:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33974);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33977);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1948:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1952:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1953:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1953:1: ( ( rule__Entity__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1954:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1955:1: ( rule__Entity__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1955:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4004);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1965:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1969:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1970:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44035);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44038);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1977:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1981:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1982:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1982:1: ( ( rule__Entity__Group_4__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1983:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1984:1: ( rule__Entity__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1984:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl4065);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1994:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1998:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:1999:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54096);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54099);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2006:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__DescriptionAssignment_5 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2010:1: ( ( ( rule__Entity__DescriptionAssignment_5 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2011:1: ( ( rule__Entity__DescriptionAssignment_5 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2011:1: ( ( rule__Entity__DescriptionAssignment_5 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2012:1: ( rule__Entity__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_5()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2013:1: ( rule__Entity__DescriptionAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2013:2: rule__Entity__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_5_in_rule__Entity__Group__5__Impl4126);
                    rule__Entity__DescriptionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2023:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2027:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2028:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64157);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64160);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2035:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2039:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2040:1: ( '{' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2040:1: ( '{' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2041:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__6__Impl4188); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2054:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2058:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2059:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74219);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74222);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2066:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2070:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2071:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2071:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2072:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2073:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2073:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl4249);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2083:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2087:1: ( rule__Entity__Group__8__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2088:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84280);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2094:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2098:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2099:1: ( '}' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2099:1: ( '}' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2100:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__8__Impl4308); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2131:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2135:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2136:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04357);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04360);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2143:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2147:1: ( ( 'extends' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2148:1: ( 'extends' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2148:1: ( 'extends' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2149:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Entity__Group_3__0__Impl4388); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2162:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2166:1: ( rule__Entity__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2167:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14419);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2173:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2177:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2178:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2178:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2179:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2180:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2180:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4446);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2194:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2198:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2199:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__04480);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__04483);
            rule__Entity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2206:1: rule__Entity__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2210:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2211:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2211:1: ( 'annotations' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2212:1: 'annotations'
            {
             before(grammarAccess.getEntityAccess().getAnnotationsKeyword_4_0()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group_4__0__Impl4511); 
             after(grammarAccess.getEntityAccess().getAnnotationsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2225:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2229:1: ( rule__Entity__Group_4__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2230:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__14542);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2236:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__AnnoAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2240:1: ( ( ( rule__Entity__AnnoAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2241:1: ( ( rule__Entity__AnnoAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2241:1: ( ( rule__Entity__AnnoAssignment_4_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2242:1: ( rule__Entity__AnnoAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getAnnoAssignment_4_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2243:1: ( rule__Entity__AnnoAssignment_4_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2243:2: rule__Entity__AnnoAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Entity__AnnoAssignment_4_1_in_rule__Entity__Group_4__1__Impl4569);
            rule__Entity__AnnoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2257:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2261:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2262:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04603);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04606);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2269:1: rule__Feature__Group__0__Impl : ( ruleStructuralFeature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2273:1: ( ( ruleStructuralFeature ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2274:1: ( ruleStructuralFeature )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2274:1: ( ruleStructuralFeature )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2275:1: ruleStructuralFeature
            {
             before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4633);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2286:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2290:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2291:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14662);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14665);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2298:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2302:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2303:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2303:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2304:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2305:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40||(LA20_0>=49 && LA20_0<=51)||LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2305:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4692);
                    rule__Feature__ConstraintAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2315:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2319:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2320:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24723);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24726);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2327:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2331:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2332:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2332:1: ( ( rule__Feature__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2333:1: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2334:1: ( rule__Feature__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2334:2: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_2__0_in_rule__Feature__Group__2__Impl4753);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2344:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2348:1: ( rule__Feature__Group__3__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2349:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34784);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2355:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__DescriptionAssignment_3 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2359:1: ( ( ( rule__Feature__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2360:1: ( ( rule__Feature__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2360:1: ( ( rule__Feature__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2361:1: ( rule__Feature__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2362:1: ( rule__Feature__DescriptionAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2362:2: rule__Feature__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Feature__DescriptionAssignment_3_in_rule__Feature__Group__3__Impl4811);
                    rule__Feature__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2380:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2384:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2385:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_2__0__Impl_in_rule__Feature__Group_2__04850);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_2__1_in_rule__Feature__Group_2__04853);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2392:1: rule__Feature__Group_2__0__Impl : ( 'annotations' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2396:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2397:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2397:1: ( 'annotations' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2398:1: 'annotations'
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Feature__Group_2__0__Impl4881); 
             after(grammarAccess.getFeatureAccess().getAnnotationsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2411:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2415:1: ( rule__Feature__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2416:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_2__1__Impl_in_rule__Feature__Group_2__14912);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2422:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__AnnoAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2426:1: ( ( ( rule__Feature__AnnoAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2427:1: ( ( rule__Feature__AnnoAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2427:1: ( ( rule__Feature__AnnoAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2428:1: ( rule__Feature__AnnoAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getAnnoAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2429:1: ( rule__Feature__AnnoAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2429:2: rule__Feature__AnnoAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Feature__AnnoAssignment_2_1_in_rule__Feature__Group_2__1__Impl4939);
            rule__Feature__AnnoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAnnoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2443:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2447:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2448:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04973);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04976);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2455:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2459:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2460:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2460:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2461:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2462:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2462:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl5003);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2472:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2476:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2477:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15033);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15036);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2484:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2488:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2489:1: ( ':' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2489:1: ( ':' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2490:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Attribute__Group__1__Impl5064); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2503:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2507:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2508:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25095);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2514:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2518:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2519:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2519:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2520:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2521:1: ( rule__Attribute__TypeAssignment_2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2521:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl5122);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2537:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2541:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2542:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05158);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05161);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2549:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2553:1: ( ( 'ref' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2554:1: ( 'ref' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2554:1: ( 'ref' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2555:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Reference__Group__0__Impl5189); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2568:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2572:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2573:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15220);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__15223);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2580:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2584:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2585:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2585:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2586:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2587:1: ( rule__Reference__NameAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2587:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl5250);
            rule__Reference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2597:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2601:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2602:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__25280);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__25283);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2609:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2613:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2614:1: ( ':' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2614:1: ( ':' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2615:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Reference__Group__2__Impl5311); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2628:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2632:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2633:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__35342);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__35345);
            rule__Reference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2640:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2644:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2645:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2645:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2646:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2647:1: ( rule__Reference__TypeAssignment_3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2647:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl5372);
            rule__Reference__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2657:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2661:1: ( rule__Reference__Group__4__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2662:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45402);
            rule__Reference__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2668:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2672:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2673:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2673:1: ( ( rule__Reference__Group_4__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2674:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2675:1: ( rule__Reference__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2675:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5429);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2695:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2699:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2700:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05470);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05473);
            rule__Reference__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2707:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2711:1: ( ( 'opposite' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2712:1: ( 'opposite' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2712:1: ( 'opposite' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2713:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Reference__Group_4__0__Impl5501); 
             after(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2726:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2730:1: ( rule__Reference__Group_4__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2731:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15532);
            rule__Reference__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2737:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2741:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2742:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2742:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2743:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2744:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2744:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5559);
            rule__Reference__OppositeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2758:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2762:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2763:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05593);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05596);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2770:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2774:1: ( ( 'enumeration' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2775:1: ( 'enumeration' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2775:1: ( 'enumeration' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2776:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Enumeration__Group__0__Impl5624); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2789:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2793:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2794:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15655);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15658);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2801:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2805:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2806:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2806:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2807:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2808:1: ( rule__Enumeration__NameAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2808:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5685);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2818:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2822:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2823:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25715);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25718);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2830:1: rule__Enumeration__Group__2__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2834:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2835:1: ( '[' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2835:1: ( '[' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2836:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Enumeration__Group__2__Impl5746); 
             after(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2849:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2853:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2854:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35777);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35780);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2861:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2865:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2866:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2866:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2867:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2867:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2868:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2869:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2869:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5809);
            rule__Enumeration__EnumerationLiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }

            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2872:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2873:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2874:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2874:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5821);
            	    rule__Enumeration__EnumerationLiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2885:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2889:1: ( rule__Enumeration__Group__4__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2890:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45854);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2896:1: rule__Enumeration__Group__4__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2900:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2901:1: ( ']' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2901:1: ( ']' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2902:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Enumeration__Group__4__Impl5882); 
             after(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2925:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2929:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2930:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05923);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05926);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2937:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2941:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2942:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2942:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2943:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2944:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2944:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5953);
            rule__EnumerationLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2954:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2958:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2959:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15983);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15986);
            rule__EnumerationLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2966:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2970:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2971:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2971:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2972:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2973:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2973:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl6013);
            rule__EnumerationLiteral__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2983:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2987:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2988:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__26043);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2994:1: rule__EnumerationLiteral__Group__2__Impl : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2998:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2999:1: ( ';' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:2999:1: ( ';' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3000:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__EnumerationLiteral__Group__2__Impl6071); 
             after(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3019:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3023:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3024:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__06108);
            rule__EnumerationLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__06111);
            rule__EnumerationLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3031:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3035:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3036:1: ( '=' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3036:1: ( '=' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3037:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__EnumerationLiteral__Group_1__0__Impl6139); 
             after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3050:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3054:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3055:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__16170);
            rule__EnumerationLiteral__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1"


    // $ANTLR start "rule__EnumerationLiteral__Group_1__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3061:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3065:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3066:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3066:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3067:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3068:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3068:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl6197);
            rule__EnumerationLiteral__PersistedValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3085:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3089:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3090:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06234);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06237);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3097:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3101:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3102:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3102:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3103:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3104:1: ( rule__Parameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3104:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6264);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3114:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3118:1: ( rule__Parameter__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3119:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16294);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3125:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3129:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3130:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3130:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3131:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3132:1: ( rule__Parameter__TypeAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3132:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl6321);
            rule__Parameter__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3146:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3150:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3151:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__06355);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__06358);
            rule__TypeRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0"


    // $ANTLR start "rule__TypeRef__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3158:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3162:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3163:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3163:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3164:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3165:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3165:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6385);
            rule__TypeRef__ReferencedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__0__Impl"


    // $ANTLR start "rule__TypeRef__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3175:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3179:1: ( rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3180:2: rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16415);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16418);
            rule__TypeRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1"


    // $ANTLR start "rule__TypeRef__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3187:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3191:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3192:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3192:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3193:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3194:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3194:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6445);
                    rule__TypeRef__MultiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__1__Impl"


    // $ANTLR start "rule__TypeRef__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3204:1: rule__TypeRef__Group__2 : rule__TypeRef__Group__2__Impl ;
    public final void rule__TypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3208:1: ( rule__TypeRef__Group__2__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3209:2: rule__TypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26476);
            rule__TypeRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__2"


    // $ANTLR start "rule__TypeRef__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3215:1: rule__TypeRef__Group__2__Impl : ( ( rule__TypeRef__OptionAssignment_2 )? ) ;
    public final void rule__TypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3219:1: ( ( ( rule__TypeRef__OptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3220:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3220:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3221:1: ( rule__TypeRef__OptionAssignment_2 )?
            {
             before(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3222:1: ( rule__TypeRef__OptionAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3222:2: rule__TypeRef__OptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6503);
                    rule__TypeRef__OptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3238:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3242:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3243:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06540);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06543);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3250:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3254:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3255:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3255:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3256:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6570);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3267:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3271:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3272:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16599);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3278:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3282:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3283:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3283:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3284:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3285:1: ( '.*' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3286:2: '.*'
                    {
                    match(input,36,FOLLOW_36_in_rule__QualifiedNameWithWildCard__Group__1__Impl6628); 

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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3301:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3305:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3306:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06665);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06668);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3313:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3317:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3318:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3318:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3319:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6695); 
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3330:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3334:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3335:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16724);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3341:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3345:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3346:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3346:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3347:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3348:1: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3348:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6751);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3362:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3366:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3367:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06786);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06789);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3374:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3378:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3379:1: ( '.' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3379:1: ( '.' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3380:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl6817); 
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3393:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3397:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3398:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16848);
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
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3404:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3408:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3409:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3409:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3410:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6875); 
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


    // $ANTLR start "rule__Annotations__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3425:1: rule__Annotations__Group__0 : rule__Annotations__Group__0__Impl rule__Annotations__Group__1 ;
    public final void rule__Annotations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3429:1: ( rule__Annotations__Group__0__Impl rule__Annotations__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3430:2: rule__Annotations__Group__0__Impl rule__Annotations__Group__1
            {
            pushFollow(FOLLOW_rule__Annotations__Group__0__Impl_in_rule__Annotations__Group__06908);
            rule__Annotations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotations__Group__1_in_rule__Annotations__Group__06911);
            rule__Annotations__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__0"


    // $ANTLR start "rule__Annotations__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3437:1: rule__Annotations__Group__0__Impl : ( '[' ) ;
    public final void rule__Annotations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3441:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3442:1: ( '[' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3442:1: ( '[' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3443:1: '['
            {
             before(grammarAccess.getAnnotationsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Annotations__Group__0__Impl6939); 
             after(grammarAccess.getAnnotationsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__0__Impl"


    // $ANTLR start "rule__Annotations__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3456:1: rule__Annotations__Group__1 : rule__Annotations__Group__1__Impl rule__Annotations__Group__2 ;
    public final void rule__Annotations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3460:1: ( rule__Annotations__Group__1__Impl rule__Annotations__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3461:2: rule__Annotations__Group__1__Impl rule__Annotations__Group__2
            {
            pushFollow(FOLLOW_rule__Annotations__Group__1__Impl_in_rule__Annotations__Group__16970);
            rule__Annotations__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotations__Group__2_in_rule__Annotations__Group__16973);
            rule__Annotations__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__1"


    // $ANTLR start "rule__Annotations__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3468:1: rule__Annotations__Group__1__Impl : ( ( rule__Annotations__AnnotationsAssignment_1 ) ) ;
    public final void rule__Annotations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3472:1: ( ( ( rule__Annotations__AnnotationsAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3473:1: ( ( rule__Annotations__AnnotationsAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3473:1: ( ( rule__Annotations__AnnotationsAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3474:1: ( rule__Annotations__AnnotationsAssignment_1 )
            {
             before(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3475:1: ( rule__Annotations__AnnotationsAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3475:2: rule__Annotations__AnnotationsAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotations__AnnotationsAssignment_1_in_rule__Annotations__Group__1__Impl7000);
            rule__Annotations__AnnotationsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__1__Impl"


    // $ANTLR start "rule__Annotations__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3485:1: rule__Annotations__Group__2 : rule__Annotations__Group__2__Impl rule__Annotations__Group__3 ;
    public final void rule__Annotations__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3489:1: ( rule__Annotations__Group__2__Impl rule__Annotations__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3490:2: rule__Annotations__Group__2__Impl rule__Annotations__Group__3
            {
            pushFollow(FOLLOW_rule__Annotations__Group__2__Impl_in_rule__Annotations__Group__27030);
            rule__Annotations__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotations__Group__3_in_rule__Annotations__Group__27033);
            rule__Annotations__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__2"


    // $ANTLR start "rule__Annotations__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3497:1: rule__Annotations__Group__2__Impl : ( ( rule__Annotations__Group_2__0 )* ) ;
    public final void rule__Annotations__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3501:1: ( ( ( rule__Annotations__Group_2__0 )* ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3502:1: ( ( rule__Annotations__Group_2__0 )* )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3502:1: ( ( rule__Annotations__Group_2__0 )* )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3503:1: ( rule__Annotations__Group_2__0 )*
            {
             before(grammarAccess.getAnnotationsAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3504:1: ( rule__Annotations__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3504:2: rule__Annotations__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotations__Group_2__0_in_rule__Annotations__Group__2__Impl7060);
            	    rule__Annotations__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAnnotationsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__2__Impl"


    // $ANTLR start "rule__Annotations__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3514:1: rule__Annotations__Group__3 : rule__Annotations__Group__3__Impl ;
    public final void rule__Annotations__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3518:1: ( rule__Annotations__Group__3__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3519:2: rule__Annotations__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotations__Group__3__Impl_in_rule__Annotations__Group__37091);
            rule__Annotations__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__3"


    // $ANTLR start "rule__Annotations__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3525:1: rule__Annotations__Group__3__Impl : ( ']' ) ;
    public final void rule__Annotations__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3529:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3530:1: ( ']' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3530:1: ( ']' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3531:1: ']'
            {
             before(grammarAccess.getAnnotationsAccess().getRightSquareBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Annotations__Group__3__Impl7119); 
             after(grammarAccess.getAnnotationsAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group__3__Impl"


    // $ANTLR start "rule__Annotations__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3552:1: rule__Annotations__Group_2__0 : rule__Annotations__Group_2__0__Impl rule__Annotations__Group_2__1 ;
    public final void rule__Annotations__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3556:1: ( rule__Annotations__Group_2__0__Impl rule__Annotations__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3557:2: rule__Annotations__Group_2__0__Impl rule__Annotations__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotations__Group_2__0__Impl_in_rule__Annotations__Group_2__07158);
            rule__Annotations__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotations__Group_2__1_in_rule__Annotations__Group_2__07161);
            rule__Annotations__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group_2__0"


    // $ANTLR start "rule__Annotations__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3564:1: rule__Annotations__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Annotations__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3568:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3569:1: ( ',' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3569:1: ( ',' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3570:1: ','
            {
             before(grammarAccess.getAnnotationsAccess().getCommaKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Annotations__Group_2__0__Impl7189); 
             after(grammarAccess.getAnnotationsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group_2__0__Impl"


    // $ANTLR start "rule__Annotations__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3583:1: rule__Annotations__Group_2__1 : rule__Annotations__Group_2__1__Impl ;
    public final void rule__Annotations__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3587:1: ( rule__Annotations__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3588:2: rule__Annotations__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotations__Group_2__1__Impl_in_rule__Annotations__Group_2__17220);
            rule__Annotations__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group_2__1"


    // $ANTLR start "rule__Annotations__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3594:1: rule__Annotations__Group_2__1__Impl : ( ( rule__Annotations__AnnotationsAssignment_2_1 ) ) ;
    public final void rule__Annotations__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3598:1: ( ( ( rule__Annotations__AnnotationsAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3599:1: ( ( rule__Annotations__AnnotationsAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3599:1: ( ( rule__Annotations__AnnotationsAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3600:1: ( rule__Annotations__AnnotationsAssignment_2_1 )
            {
             before(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3601:1: ( rule__Annotations__AnnotationsAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3601:2: rule__Annotations__AnnotationsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotations__AnnotationsAssignment_2_1_in_rule__Annotations__Group_2__1__Impl7247);
            rule__Annotations__AnnotationsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationsAccess().getAnnotationsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__Group_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3615:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3619:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3620:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__07281);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07284);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3627:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3631:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3632:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3632:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3633:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3634:1: ( rule__Annotation__KeyAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3634:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl7311);
            rule__Annotation__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3644:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3648:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3649:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__17341);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17344);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3656:1: rule__Annotation__Group__1__Impl : ( ':' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3660:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3661:1: ( ':' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3661:1: ( ':' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3662:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Annotation__Group__1__Impl7372); 
             after(grammarAccess.getAnnotationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3675:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3679:1: ( rule__Annotation__Group__2__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3680:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__27403);
            rule__Annotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3686:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3690:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3691:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3691:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3692:1: ( rule__Annotation__ValueAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3693:1: ( rule__Annotation__ValueAssignment_2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3693:2: rule__Annotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl7430);
            rule__Annotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__StringConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3709:1: rule__StringConstraint__Group__0 : rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 ;
    public final void rule__StringConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3713:1: ( rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3714:2: rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__07466);
            rule__StringConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__07469);
            rule__StringConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__0"


    // $ANTLR start "rule__StringConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3721:1: rule__StringConstraint__Group__0__Impl : ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__StringConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3725:1: ( ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3726:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3726:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3727:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3728:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3728:2: rule__StringConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl7496);
            rule__StringConstraint__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__0__Impl"


    // $ANTLR start "rule__StringConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3738:1: rule__StringConstraint__Group__1 : rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 ;
    public final void rule__StringConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3742:1: ( rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3743:2: rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__17526);
            rule__StringConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__17529);
            rule__StringConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__1"


    // $ANTLR start "rule__StringConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3750:1: rule__StringConstraint__Group__1__Impl : ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__StringConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3754:1: ( ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3755:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3755:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3756:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3757:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3757:2: rule__StringConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl7556);
            rule__StringConstraint__ConstraintRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getConstraintRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__1__Impl"


    // $ANTLR start "rule__StringConstraint__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3767:1: rule__StringConstraint__Group__2 : rule__StringConstraint__Group__2__Impl ;
    public final void rule__StringConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3771:1: ( rule__StringConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3772:2: rule__StringConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__27586);
            rule__StringConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__2"


    // $ANTLR start "rule__StringConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3778:1: rule__StringConstraint__Group__2__Impl : ( ( rule__StringConstraint__Group_2__0 )? ) ;
    public final void rule__StringConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3782:1: ( ( ( rule__StringConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3783:1: ( ( rule__StringConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3783:1: ( ( rule__StringConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3784:1: ( rule__StringConstraint__Group_2__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3785:1: ( rule__StringConstraint__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3785:2: rule__StringConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl7613);
                    rule__StringConstraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group__2__Impl"


    // $ANTLR start "rule__StringConstraint__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3801:1: rule__StringConstraint__Group_2__0 : rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 ;
    public final void rule__StringConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3805:1: ( rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3806:2: rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__07650);
            rule__StringConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__07653);
            rule__StringConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group_2__0"


    // $ANTLR start "rule__StringConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3813:1: rule__StringConstraint__Group_2__0__Impl : ( 'regexp' ) ;
    public final void rule__StringConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3817:1: ( ( 'regexp' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3818:1: ( 'regexp' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3818:1: ( 'regexp' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3819:1: 'regexp'
            {
             before(grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__StringConstraint__Group_2__0__Impl7681); 
             after(grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__StringConstraint__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3832:1: rule__StringConstraint__Group_2__1 : rule__StringConstraint__Group_2__1__Impl ;
    public final void rule__StringConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3836:1: ( rule__StringConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3837:2: rule__StringConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__17712);
            rule__StringConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group_2__1"


    // $ANTLR start "rule__StringConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3843:1: rule__StringConstraint__Group_2__1__Impl : ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) ;
    public final void rule__StringConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3847:1: ( ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3848:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3848:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3849:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3850:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3850:2: rule__StringConstraint__RegularExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl7739);
            rule__StringConstraint__RegularExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3864:1: rule__DateTimeConstraint__Group__0 : rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 ;
    public final void rule__DateTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3868:1: ( rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3869:2: rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__07773);
            rule__DateTimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__07776);
            rule__DateTimeConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__0"


    // $ANTLR start "rule__DateTimeConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3876:1: rule__DateTimeConstraint__Group__0__Impl : ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DateTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3880:1: ( ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3881:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3881:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3882:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3883:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3883:2: rule__DateTimeConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl7803);
            rule__DateTimeConstraint__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__0__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3893:1: rule__DateTimeConstraint__Group__1 : rule__DateTimeConstraint__Group__1__Impl ;
    public final void rule__DateTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3897:1: ( rule__DateTimeConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3898:2: rule__DateTimeConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__17833);
            rule__DateTimeConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__1"


    // $ANTLR start "rule__DateTimeConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3904:1: rule__DateTimeConstraint__Group__1__Impl : ( ( rule__DateTimeConstraint__Group_1__0 )? ) ;
    public final void rule__DateTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3908:1: ( ( ( rule__DateTimeConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3909:1: ( ( rule__DateTimeConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3909:1: ( ( rule__DateTimeConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3910:1: ( rule__DateTimeConstraint__Group_1__0 )?
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3911:1: ( rule__DateTimeConstraint__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3911:2: rule__DateTimeConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeConstraint__Group_1__0_in_rule__DateTimeConstraint__Group__1__Impl7860);
                    rule__DateTimeConstraint__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimeConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__1__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group_1__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3925:1: rule__DateTimeConstraint__Group_1__0 : rule__DateTimeConstraint__Group_1__0__Impl rule__DateTimeConstraint__Group_1__1 ;
    public final void rule__DateTimeConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3929:1: ( rule__DateTimeConstraint__Group_1__0__Impl rule__DateTimeConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3930:2: rule__DateTimeConstraint__Group_1__0__Impl rule__DateTimeConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_1__0__Impl_in_rule__DateTimeConstraint__Group_1__07895);
            rule__DateTimeConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_1__1_in_rule__DateTimeConstraint__Group_1__07898);
            rule__DateTimeConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_1__0"


    // $ANTLR start "rule__DateTimeConstraint__Group_1__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3937:1: rule__DateTimeConstraint__Group_1__0__Impl : ( ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__DateTimeConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3941:1: ( ( ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3942:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3942:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3943:1: ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3944:1: ( rule__DateTimeConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3944:2: rule__DateTimeConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_1_0_in_rule__DateTimeConstraint__Group_1__0__Impl7925);
            rule__DateTimeConstraint__HasDefaultAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group_1__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3954:1: rule__DateTimeConstraint__Group_1__1 : rule__DateTimeConstraint__Group_1__1__Impl ;
    public final void rule__DateTimeConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3958:1: ( rule__DateTimeConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3959:2: rule__DateTimeConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_1__1__Impl_in_rule__DateTimeConstraint__Group_1__17955);
            rule__DateTimeConstraint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_1__1"


    // $ANTLR start "rule__DateTimeConstraint__Group_1__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3965:1: rule__DateTimeConstraint__Group_1__1__Impl : ( ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__DateTimeConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3969:1: ( ( ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3970:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3970:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3971:1: ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3972:1: ( rule__DateTimeConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3972:2: rule__DateTimeConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_1_1_in_rule__DateTimeConstraint__Group_1__1__Impl7982);
            rule__DateTimeConstraint__DefaultValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__DecimalConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3986:1: rule__DecimalConstraint__Group__0 : rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 ;
    public final void rule__DecimalConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3990:1: ( rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3991:2: rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__08016);
            rule__DecimalConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__08019);
            rule__DecimalConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__Group__0"


    // $ANTLR start "rule__DecimalConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:3998:1: rule__DecimalConstraint__Group__0__Impl : ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DecimalConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4002:1: ( ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4003:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4003:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4004:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4005:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4005:2: rule__DecimalConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl8046);
            rule__DecimalConstraint__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__Group__0__Impl"


    // $ANTLR start "rule__DecimalConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4015:1: rule__DecimalConstraint__Group__1 : rule__DecimalConstraint__Group__1__Impl ;
    public final void rule__DecimalConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4019:1: ( rule__DecimalConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4020:2: rule__DecimalConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__18076);
            rule__DecimalConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__Group__1"


    // $ANTLR start "rule__DecimalConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4026:1: rule__DecimalConstraint__Group__1__Impl : ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__DecimalConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4030:1: ( ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4031:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4031:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4032:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4033:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4033:2: rule__DecimalConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl8103);
            rule__DecimalConstraint__ConstraintRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getConstraintRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__Group__1__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4047:1: rule__EnumerationConstraint__Group__0 : rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 ;
    public final void rule__EnumerationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4051:1: ( rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4052:2: rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__08137);
            rule__EnumerationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__08140);
            rule__EnumerationConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__0"


    // $ANTLR start "rule__EnumerationConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4059:1: rule__EnumerationConstraint__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4063:1: ( ( 'enum' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4064:1: ( 'enum' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4064:1: ( 'enum' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4065:1: 'enum'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__EnumerationConstraint__Group__0__Impl8168); 
             after(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__0__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4078:1: rule__EnumerationConstraint__Group__1 : rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 ;
    public final void rule__EnumerationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4082:1: ( rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4083:2: rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__18199);
            rule__EnumerationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__18202);
            rule__EnumerationConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__1"


    // $ANTLR start "rule__EnumerationConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4090:1: rule__EnumerationConstraint__Group__1__Impl : ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) ;
    public final void rule__EnumerationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4094:1: ( ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4095:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4095:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4096:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4097:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4097:2: rule__EnumerationConstraint__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl8229);
            rule__EnumerationConstraint__UsageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__1__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4107:1: rule__EnumerationConstraint__Group__2 : rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 ;
    public final void rule__EnumerationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4111:1: ( rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4112:2: rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__28259);
            rule__EnumerationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__28262);
            rule__EnumerationConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__2"


    // $ANTLR start "rule__EnumerationConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4119:1: rule__EnumerationConstraint__Group__2__Impl : ( ( rule__EnumerationConstraint__Group_2__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4123:1: ( ( ( rule__EnumerationConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4124:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4124:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4125:1: ( rule__EnumerationConstraint__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4126:1: ( rule__EnumerationConstraint__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4126:2: rule__EnumerationConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl8289);
                    rule__EnumerationConstraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__2__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4136:1: rule__EnumerationConstraint__Group__3 : rule__EnumerationConstraint__Group__3__Impl ;
    public final void rule__EnumerationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4140:1: ( rule__EnumerationConstraint__Group__3__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4141:2: rule__EnumerationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__38320);
            rule__EnumerationConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__3"


    // $ANTLR start "rule__EnumerationConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4147:1: rule__EnumerationConstraint__Group__3__Impl : ( ( rule__EnumerationConstraint__Group_3__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4151:1: ( ( ( rule__EnumerationConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4152:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4152:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4153:1: ( rule__EnumerationConstraint__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4154:1: ( rule__EnumerationConstraint__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4154:2: rule__EnumerationConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl8347);
                    rule__EnumerationConstraint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group__3__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4172:1: rule__EnumerationConstraint__Group_2__0 : rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 ;
    public final void rule__EnumerationConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4176:1: ( rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4177:2: rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__08386);
            rule__EnumerationConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__08389);
            rule__EnumerationConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_2__0"


    // $ANTLR start "rule__EnumerationConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4184:1: rule__EnumerationConstraint__Group_2__0__Impl : ( 'fixeLen' ) ;
    public final void rule__EnumerationConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4188:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4189:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4189:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4190:1: 'fixeLen'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumerationConstraint__Group_2__0__Impl8417); 
             after(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4203:1: rule__EnumerationConstraint__Group_2__1 : rule__EnumerationConstraint__Group_2__1__Impl ;
    public final void rule__EnumerationConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4207:1: ( rule__EnumerationConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4208:2: rule__EnumerationConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__18448);
            rule__EnumerationConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_2__1"


    // $ANTLR start "rule__EnumerationConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4214:1: rule__EnumerationConstraint__Group_2__1__Impl : ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4218:1: ( ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4219:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4219:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4220:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4221:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4221:2: rule__EnumerationConstraint__FixeLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl8475);
            rule__EnumerationConstraint__FixeLenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getFixeLenAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4235:1: rule__EnumerationConstraint__Group_3__0 : rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 ;
    public final void rule__EnumerationConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4239:1: ( rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4240:2: rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__08509);
            rule__EnumerationConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__08512);
            rule__EnumerationConstraint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_3__0"


    // $ANTLR start "rule__EnumerationConstraint__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4247:1: rule__EnumerationConstraint__Group_3__0__Impl : ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4251:1: ( ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4252:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4252:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4253:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_3_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4254:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4254:2: rule__EnumerationConstraint__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl8539);
            rule__EnumerationConstraint__HasDefaultAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_3__0__Impl"


    // $ANTLR start "rule__EnumerationConstraint__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4264:1: rule__EnumerationConstraint__Group_3__1 : rule__EnumerationConstraint__Group_3__1__Impl ;
    public final void rule__EnumerationConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4268:1: ( rule__EnumerationConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4269:2: rule__EnumerationConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__18569);
            rule__EnumerationConstraint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_3__1"


    // $ANTLR start "rule__EnumerationConstraint__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4275:1: rule__EnumerationConstraint__Group_3__1__Impl : ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4279:1: ( ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4280:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4280:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4281:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4282:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4282:2: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl8596);
            rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__Group_3__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4296:1: rule__NumberConstraint__Group__0 : rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 ;
    public final void rule__NumberConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4300:1: ( rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4301:2: rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__08630);
            rule__NumberConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__08633);
            rule__NumberConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__0"


    // $ANTLR start "rule__NumberConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4308:1: rule__NumberConstraint__Group__0__Impl : ( ( rule__NumberConstraint__Group_0__0 )? ) ;
    public final void rule__NumberConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4312:1: ( ( ( rule__NumberConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4313:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4313:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4314:1: ( rule__NumberConstraint__Group_0__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4315:1: ( rule__NumberConstraint__Group_0__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4315:2: rule__NumberConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl8660);
                    rule__NumberConstraint__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4325:1: rule__NumberConstraint__Group__1 : rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 ;
    public final void rule__NumberConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4329:1: ( rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4330:2: rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__18691);
            rule__NumberConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__18694);
            rule__NumberConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__1"


    // $ANTLR start "rule__NumberConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4337:1: rule__NumberConstraint__Group__1__Impl : ( ( rule__NumberConstraint__Group_1__0 )? ) ;
    public final void rule__NumberConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4341:1: ( ( ( rule__NumberConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4342:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4342:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4343:1: ( rule__NumberConstraint__Group_1__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4344:1: ( rule__NumberConstraint__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4344:2: rule__NumberConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl8721);
                    rule__NumberConstraint__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4354:1: rule__NumberConstraint__Group__2 : rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 ;
    public final void rule__NumberConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4358:1: ( rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4359:2: rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__28752);
            rule__NumberConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__28755);
            rule__NumberConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__2"


    // $ANTLR start "rule__NumberConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4366:1: rule__NumberConstraint__Group__2__Impl : ( ( rule__NumberConstraint__Group_2__0 )? ) ;
    public final void rule__NumberConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4370:1: ( ( ( rule__NumberConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4371:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4371:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4372:1: ( rule__NumberConstraint__Group_2__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4373:1: ( rule__NumberConstraint__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4373:2: rule__NumberConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl8782);
                    rule__NumberConstraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__2__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4383:1: rule__NumberConstraint__Group__3 : rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 ;
    public final void rule__NumberConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4387:1: ( rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4388:2: rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__38813);
            rule__NumberConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__38816);
            rule__NumberConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__3"


    // $ANTLR start "rule__NumberConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4395:1: rule__NumberConstraint__Group__3__Impl : ( ( rule__NumberConstraint__Group_3__0 )? ) ;
    public final void rule__NumberConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4399:1: ( ( ( rule__NumberConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4400:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4400:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4401:1: ( rule__NumberConstraint__Group_3__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4402:1: ( rule__NumberConstraint__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4402:2: rule__NumberConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl8843);
                    rule__NumberConstraint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__3__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4412:1: rule__NumberConstraint__Group__4 : rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 ;
    public final void rule__NumberConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4416:1: ( rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4417:2: rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__48874);
            rule__NumberConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__48877);
            rule__NumberConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__4"


    // $ANTLR start "rule__NumberConstraint__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4424:1: rule__NumberConstraint__Group__4__Impl : ( ( rule__NumberConstraint__Group_4__0 )? ) ;
    public final void rule__NumberConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4428:1: ( ( ( rule__NumberConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4429:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4429:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4430:1: ( rule__NumberConstraint__Group_4__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4431:1: ( rule__NumberConstraint__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4431:2: rule__NumberConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl8904);
                    rule__NumberConstraint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__4__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__5"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4441:1: rule__NumberConstraint__Group__5 : rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 ;
    public final void rule__NumberConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4445:1: ( rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4446:2: rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__58935);
            rule__NumberConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__58938);
            rule__NumberConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__5"


    // $ANTLR start "rule__NumberConstraint__Group__5__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4453:1: rule__NumberConstraint__Group__5__Impl : ( ( rule__NumberConstraint__Group_5__0 )? ) ;
    public final void rule__NumberConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4457:1: ( ( ( rule__NumberConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4458:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4458:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4459:1: ( rule__NumberConstraint__Group_5__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4460:1: ( rule__NumberConstraint__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4460:2: rule__NumberConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl8965);
                    rule__NumberConstraint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__5__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4470:1: rule__NumberConstraint__Group__6 : rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 ;
    public final void rule__NumberConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4474:1: ( rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4475:2: rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__68996);
            rule__NumberConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__68999);
            rule__NumberConstraint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__6"


    // $ANTLR start "rule__NumberConstraint__Group__6__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4482:1: rule__NumberConstraint__Group__6__Impl : ( ( rule__NumberConstraint__Group_6__0 )? ) ;
    public final void rule__NumberConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4486:1: ( ( ( rule__NumberConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4487:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4487:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4488:1: ( rule__NumberConstraint__Group_6__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4489:1: ( rule__NumberConstraint__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4489:2: rule__NumberConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl9026);
                    rule__NumberConstraint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__6__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4499:1: rule__NumberConstraint__Group__7 : rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 ;
    public final void rule__NumberConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4503:1: ( rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4504:2: rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__79057);
            rule__NumberConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__79060);
            rule__NumberConstraint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__7"


    // $ANTLR start "rule__NumberConstraint__Group__7__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4511:1: rule__NumberConstraint__Group__7__Impl : ( ( rule__NumberConstraint__Group_7__0 )? ) ;
    public final void rule__NumberConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4515:1: ( ( ( rule__NumberConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4516:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4516:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4517:1: ( rule__NumberConstraint__Group_7__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4518:1: ( rule__NumberConstraint__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4518:2: rule__NumberConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl9087);
                    rule__NumberConstraint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__7__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__8"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4528:1: rule__NumberConstraint__Group__8 : rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 ;
    public final void rule__NumberConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4532:1: ( rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4533:2: rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__89118);
            rule__NumberConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__89121);
            rule__NumberConstraint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__8"


    // $ANTLR start "rule__NumberConstraint__Group__8__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4540:1: rule__NumberConstraint__Group__8__Impl : ( ( rule__NumberConstraint__IsIdAssignment_8 )? ) ;
    public final void rule__NumberConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4544:1: ( ( ( rule__NumberConstraint__IsIdAssignment_8 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4545:1: ( ( rule__NumberConstraint__IsIdAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4545:1: ( ( rule__NumberConstraint__IsIdAssignment_8 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4546:1: ( rule__NumberConstraint__IsIdAssignment_8 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdAssignment_8()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4547:1: ( rule__NumberConstraint__IsIdAssignment_8 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4547:2: rule__NumberConstraint__IsIdAssignment_8
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__IsIdAssignment_8_in_rule__NumberConstraint__Group__8__Impl9148);
                    rule__NumberConstraint__IsIdAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getIsIdAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__8__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__9"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4557:1: rule__NumberConstraint__Group__9 : rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 ;
    public final void rule__NumberConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4561:1: ( rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4562:2: rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__99179);
            rule__NumberConstraint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__99182);
            rule__NumberConstraint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__9"


    // $ANTLR start "rule__NumberConstraint__Group__9__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4569:1: rule__NumberConstraint__Group__9__Impl : ( ( rule__NumberConstraint__NullableAssignment_9 )? ) ;
    public final void rule__NumberConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4573:1: ( ( ( rule__NumberConstraint__NullableAssignment_9 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4574:1: ( ( rule__NumberConstraint__NullableAssignment_9 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4574:1: ( ( rule__NumberConstraint__NullableAssignment_9 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4575:1: ( rule__NumberConstraint__NullableAssignment_9 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableAssignment_9()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4576:1: ( rule__NumberConstraint__NullableAssignment_9 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4576:2: rule__NumberConstraint__NullableAssignment_9
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__NullableAssignment_9_in_rule__NumberConstraint__Group__9__Impl9209);
                    rule__NumberConstraint__NullableAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getNullableAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__9__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__10"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4586:1: rule__NumberConstraint__Group__10 : rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11 ;
    public final void rule__NumberConstraint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4590:1: ( rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4591:2: rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__109240);
            rule__NumberConstraint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__11_in_rule__NumberConstraint__Group__109243);
            rule__NumberConstraint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__10"


    // $ANTLR start "rule__NumberConstraint__Group__10__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4598:1: rule__NumberConstraint__Group__10__Impl : ( ( rule__NumberConstraint__Group_10__0 )? ) ;
    public final void rule__NumberConstraint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4602:1: ( ( ( rule__NumberConstraint__Group_10__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4603:1: ( ( rule__NumberConstraint__Group_10__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4603:1: ( ( rule__NumberConstraint__Group_10__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4604:1: ( rule__NumberConstraint__Group_10__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_10()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4605:1: ( rule__NumberConstraint__Group_10__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4605:2: rule__NumberConstraint__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_10__0_in_rule__NumberConstraint__Group__10__Impl9270);
                    rule__NumberConstraint__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__10__Impl"


    // $ANTLR start "rule__NumberConstraint__Group__11"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4615:1: rule__NumberConstraint__Group__11 : rule__NumberConstraint__Group__11__Impl ;
    public final void rule__NumberConstraint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4619:1: ( rule__NumberConstraint__Group__11__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4620:2: rule__NumberConstraint__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__11__Impl_in_rule__NumberConstraint__Group__119301);
            rule__NumberConstraint__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__11"


    // $ANTLR start "rule__NumberConstraint__Group__11__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4626:1: rule__NumberConstraint__Group__11__Impl : ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? ) ;
    public final void rule__NumberConstraint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4630:1: ( ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4631:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4631:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4632:1: ( rule__NumberConstraint__IsXSDAttAssignment_11 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttAssignment_11()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4633:1: ( rule__NumberConstraint__IsXSDAttAssignment_11 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4633:2: rule__NumberConstraint__IsXSDAttAssignment_11
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_11_in_rule__NumberConstraint__Group__11__Impl9328);
                    rule__NumberConstraint__IsXSDAttAssignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group__11__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_0__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4667:1: rule__NumberConstraint__Group_0__0 : rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 ;
    public final void rule__NumberConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4671:1: ( rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4672:2: rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__09383);
            rule__NumberConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__09386);
            rule__NumberConstraint__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_0__0"


    // $ANTLR start "rule__NumberConstraint__Group_0__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4679:1: rule__NumberConstraint__Group_0__0__Impl : ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) ) ;
    public final void rule__NumberConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4683:1: ( ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4684:1: ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4684:1: ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4685:1: ( rule__NumberConstraint__HasDefaultAssignment_0_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultAssignment_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4686:1: ( rule__NumberConstraint__HasDefaultAssignment_0_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4686:2: rule__NumberConstraint__HasDefaultAssignment_0_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__HasDefaultAssignment_0_0_in_rule__NumberConstraint__Group_0__0__Impl9413);
            rule__NumberConstraint__HasDefaultAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getHasDefaultAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_0__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_0__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4696:1: rule__NumberConstraint__Group_0__1 : rule__NumberConstraint__Group_0__1__Impl ;
    public final void rule__NumberConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4700:1: ( rule__NumberConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4701:2: rule__NumberConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__19443);
            rule__NumberConstraint__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_0__1"


    // $ANTLR start "rule__NumberConstraint__Group_0__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4707:1: rule__NumberConstraint__Group_0__1__Impl : ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) ) ;
    public final void rule__NumberConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4711:1: ( ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4712:1: ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4712:1: ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4713:1: ( rule__NumberConstraint__DefaultValueAssignment_0_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4714:1: ( rule__NumberConstraint__DefaultValueAssignment_0_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4714:2: rule__NumberConstraint__DefaultValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DefaultValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl9470);
            rule__NumberConstraint__DefaultValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getDefaultValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_0__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_1__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4728:1: rule__NumberConstraint__Group_1__0 : rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 ;
    public final void rule__NumberConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4732:1: ( rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4733:2: rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__09504);
            rule__NumberConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__09507);
            rule__NumberConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_1__0"


    // $ANTLR start "rule__NumberConstraint__Group_1__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4740:1: rule__NumberConstraint__Group_1__0__Impl : ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) ) ;
    public final void rule__NumberConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4744:1: ( ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4745:1: ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4745:1: ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4746:1: ( rule__NumberConstraint__IsFixedAssignment_1_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedAssignment_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4747:1: ( rule__NumberConstraint__IsFixedAssignment_1_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4747:2: rule__NumberConstraint__IsFixedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__IsFixedAssignment_1_0_in_rule__NumberConstraint__Group_1__0__Impl9534);
            rule__NumberConstraint__IsFixedAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getIsFixedAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_1__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4757:1: rule__NumberConstraint__Group_1__1 : rule__NumberConstraint__Group_1__1__Impl ;
    public final void rule__NumberConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4761:1: ( rule__NumberConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4762:2: rule__NumberConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__19564);
            rule__NumberConstraint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_1__1"


    // $ANTLR start "rule__NumberConstraint__Group_1__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4768:1: rule__NumberConstraint__Group_1__1__Impl : ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) ) ;
    public final void rule__NumberConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4772:1: ( ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4773:1: ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4773:1: ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4774:1: ( rule__NumberConstraint__FixedValueAssignment_1_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4775:1: ( rule__NumberConstraint__FixedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4775:2: rule__NumberConstraint__FixedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixedValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl9591);
            rule__NumberConstraint__FixedValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getFixedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4789:1: rule__NumberConstraint__Group_2__0 : rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 ;
    public final void rule__NumberConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4793:1: ( rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4794:2: rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__09625);
            rule__NumberConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__09628);
            rule__NumberConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_2__0"


    // $ANTLR start "rule__NumberConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4801:1: rule__NumberConstraint__Group_2__0__Impl : ( 'minVal' ) ;
    public final void rule__NumberConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4805:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4806:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4806:1: ( 'minVal' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4807:1: 'minVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__NumberConstraint__Group_2__0__Impl9656); 
             after(grammarAccess.getNumberConstraintAccess().getMinValKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4820:1: rule__NumberConstraint__Group_2__1 : rule__NumberConstraint__Group_2__1__Impl ;
    public final void rule__NumberConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4824:1: ( rule__NumberConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4825:2: rule__NumberConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__19687);
            rule__NumberConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_2__1"


    // $ANTLR start "rule__NumberConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4831:1: rule__NumberConstraint__Group_2__1__Impl : ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) ) ;
    public final void rule__NumberConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4835:1: ( ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4836:1: ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4836:1: ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4837:1: ( rule__NumberConstraint__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4838:1: ( rule__NumberConstraint__MinValueAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4838:2: rule__NumberConstraint__MinValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl9714);
            rule__NumberConstraint__MinValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMinValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4852:1: rule__NumberConstraint__Group_3__0 : rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 ;
    public final void rule__NumberConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4856:1: ( rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4857:2: rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__09748);
            rule__NumberConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__09751);
            rule__NumberConstraint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_3__0"


    // $ANTLR start "rule__NumberConstraint__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4864:1: rule__NumberConstraint__Group_3__0__Impl : ( 'maxVal' ) ;
    public final void rule__NumberConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4868:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4869:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4869:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4870:1: 'maxVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_3_0()); 
            match(input,43,FOLLOW_43_in_rule__NumberConstraint__Group_3__0__Impl9779); 
             after(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_3__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4883:1: rule__NumberConstraint__Group_3__1 : rule__NumberConstraint__Group_3__1__Impl ;
    public final void rule__NumberConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4887:1: ( rule__NumberConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4888:2: rule__NumberConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__19810);
            rule__NumberConstraint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_3__1"


    // $ANTLR start "rule__NumberConstraint__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4894:1: rule__NumberConstraint__Group_3__1__Impl : ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) ) ;
    public final void rule__NumberConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4898:1: ( ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4899:1: ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4899:1: ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4900:1: ( rule__NumberConstraint__MaxValueAssignment_3_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4901:1: ( rule__NumberConstraint__MaxValueAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4901:2: rule__NumberConstraint__MaxValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl9837);
            rule__NumberConstraint__MaxValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMaxValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_3__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_4__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4915:1: rule__NumberConstraint__Group_4__0 : rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 ;
    public final void rule__NumberConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4919:1: ( rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4920:2: rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__09871);
            rule__NumberConstraint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__09874);
            rule__NumberConstraint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_4__0"


    // $ANTLR start "rule__NumberConstraint__Group_4__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4927:1: rule__NumberConstraint__Group_4__0__Impl : ( 'minLen' ) ;
    public final void rule__NumberConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4931:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4932:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4932:1: ( 'minLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4933:1: 'minLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0()); 
            match(input,44,FOLLOW_44_in_rule__NumberConstraint__Group_4__0__Impl9902); 
             after(grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_4__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_4__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4946:1: rule__NumberConstraint__Group_4__1 : rule__NumberConstraint__Group_4__1__Impl ;
    public final void rule__NumberConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4950:1: ( rule__NumberConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4951:2: rule__NumberConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__19933);
            rule__NumberConstraint__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_4__1"


    // $ANTLR start "rule__NumberConstraint__Group_4__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4957:1: rule__NumberConstraint__Group_4__1__Impl : ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) ;
    public final void rule__NumberConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4961:1: ( ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4962:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4962:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4963:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4964:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4964:2: rule__NumberConstraint__MinLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl9960);
            rule__NumberConstraint__MinLenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMinLenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_4__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_5__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4978:1: rule__NumberConstraint__Group_5__0 : rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 ;
    public final void rule__NumberConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4982:1: ( rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4983:2: rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__09994);
            rule__NumberConstraint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__09997);
            rule__NumberConstraint__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_5__0"


    // $ANTLR start "rule__NumberConstraint__Group_5__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4990:1: rule__NumberConstraint__Group_5__0__Impl : ( 'maxLen' ) ;
    public final void rule__NumberConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4994:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4995:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4995:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:4996:1: 'maxLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0()); 
            match(input,45,FOLLOW_45_in_rule__NumberConstraint__Group_5__0__Impl10025); 
             after(grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_5__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_5__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5009:1: rule__NumberConstraint__Group_5__1 : rule__NumberConstraint__Group_5__1__Impl ;
    public final void rule__NumberConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5013:1: ( rule__NumberConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5014:2: rule__NumberConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__110056);
            rule__NumberConstraint__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_5__1"


    // $ANTLR start "rule__NumberConstraint__Group_5__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5020:1: rule__NumberConstraint__Group_5__1__Impl : ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) ;
    public final void rule__NumberConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5024:1: ( ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5025:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5025:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5026:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5027:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5027:2: rule__NumberConstraint__MaxLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl10083);
            rule__NumberConstraint__MaxLenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMaxLenAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_5__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_6__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5041:1: rule__NumberConstraint__Group_6__0 : rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 ;
    public final void rule__NumberConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5045:1: ( rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5046:2: rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__010117);
            rule__NumberConstraint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__010120);
            rule__NumberConstraint__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_6__0"


    // $ANTLR start "rule__NumberConstraint__Group_6__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5053:1: rule__NumberConstraint__Group_6__0__Impl : ( 'fixeLen' ) ;
    public final void rule__NumberConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5057:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5058:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5058:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5059:1: 'fixeLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0()); 
            match(input,41,FOLLOW_41_in_rule__NumberConstraint__Group_6__0__Impl10148); 
             after(grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_6__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_6__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5072:1: rule__NumberConstraint__Group_6__1 : rule__NumberConstraint__Group_6__1__Impl ;
    public final void rule__NumberConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5076:1: ( rule__NumberConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5077:2: rule__NumberConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__110179);
            rule__NumberConstraint__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_6__1"


    // $ANTLR start "rule__NumberConstraint__Group_6__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5083:1: rule__NumberConstraint__Group_6__1__Impl : ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) ;
    public final void rule__NumberConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5087:1: ( ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5088:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5088:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5089:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenAssignment_6_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5090:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5090:2: rule__NumberConstraint__FixeLenAssignment_6_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl10206);
            rule__NumberConstraint__FixeLenAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getFixeLenAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_6__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_7__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5104:1: rule__NumberConstraint__Group_7__0 : rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 ;
    public final void rule__NumberConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5108:1: ( rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5109:2: rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__010240);
            rule__NumberConstraint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__010243);
            rule__NumberConstraint__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_7__0"


    // $ANTLR start "rule__NumberConstraint__Group_7__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5116:1: rule__NumberConstraint__Group_7__0__Impl : ( 'paddle' ) ;
    public final void rule__NumberConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5120:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5121:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5121:1: ( 'paddle' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5122:1: 'paddle'
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0()); 
            match(input,46,FOLLOW_46_in_rule__NumberConstraint__Group_7__0__Impl10271); 
             after(grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_7__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_7__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5135:1: rule__NumberConstraint__Group_7__1 : rule__NumberConstraint__Group_7__1__Impl ;
    public final void rule__NumberConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5139:1: ( rule__NumberConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5140:2: rule__NumberConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__110302);
            rule__NumberConstraint__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_7__1"


    // $ANTLR start "rule__NumberConstraint__Group_7__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5146:1: rule__NumberConstraint__Group_7__1__Impl : ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) ;
    public final void rule__NumberConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5150:1: ( ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5151:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5151:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5152:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleAssignment_7_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5153:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5153:2: rule__NumberConstraint__PaddleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl10329);
            rule__NumberConstraint__PaddleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getPaddleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_7__1__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_10__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5167:1: rule__NumberConstraint__Group_10__0 : rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1 ;
    public final void rule__NumberConstraint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5171:1: ( rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5172:2: rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__0__Impl_in_rule__NumberConstraint__Group_10__010363);
            rule__NumberConstraint__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__1_in_rule__NumberConstraint__Group_10__010366);
            rule__NumberConstraint__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_10__0"


    // $ANTLR start "rule__NumberConstraint__Group_10__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5179:1: rule__NumberConstraint__Group_10__0__Impl : ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) ) ;
    public final void rule__NumberConstraint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5183:1: ( ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5184:1: ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5184:1: ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5185:1: ( rule__NumberConstraint__DerivedAssignment_10_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedAssignment_10_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5186:1: ( rule__NumberConstraint__DerivedAssignment_10_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5186:2: rule__NumberConstraint__DerivedAssignment_10_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DerivedAssignment_10_0_in_rule__NumberConstraint__Group_10__0__Impl10393);
            rule__NumberConstraint__DerivedAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getDerivedAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_10__0__Impl"


    // $ANTLR start "rule__NumberConstraint__Group_10__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5196:1: rule__NumberConstraint__Group_10__1 : rule__NumberConstraint__Group_10__1__Impl ;
    public final void rule__NumberConstraint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5200:1: ( rule__NumberConstraint__Group_10__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5201:2: rule__NumberConstraint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__1__Impl_in_rule__NumberConstraint__Group_10__110423);
            rule__NumberConstraint__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_10__1"


    // $ANTLR start "rule__NumberConstraint__Group_10__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5207:1: rule__NumberConstraint__Group_10__1__Impl : ( ( rule__NumberConstraint__WritableAssignment_10_1 )? ) ;
    public final void rule__NumberConstraint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5211:1: ( ( ( rule__NumberConstraint__WritableAssignment_10_1 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5212:1: ( ( rule__NumberConstraint__WritableAssignment_10_1 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5212:1: ( ( rule__NumberConstraint__WritableAssignment_10_1 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5213:1: ( rule__NumberConstraint__WritableAssignment_10_1 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableAssignment_10_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5214:1: ( rule__NumberConstraint__WritableAssignment_10_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5214:2: rule__NumberConstraint__WritableAssignment_10_1
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__WritableAssignment_10_1_in_rule__NumberConstraint__Group_10__1__Impl10450);
                    rule__NumberConstraint__WritableAssignment_10_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getWritableAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__Group_10__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5228:1: rule__AllConstraint__Group__0 : rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 ;
    public final void rule__AllConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5232:1: ( rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5233:2: rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__010485);
            rule__AllConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__010488);
            rule__AllConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__0"


    // $ANTLR start "rule__AllConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5240:1: rule__AllConstraint__Group__0__Impl : ( ( rule__AllConstraint__Group_0__0 )? ) ;
    public final void rule__AllConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5244:1: ( ( ( rule__AllConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5245:1: ( ( rule__AllConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5245:1: ( ( rule__AllConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5246:1: ( rule__AllConstraint__Group_0__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5247:1: ( rule__AllConstraint__Group_0__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5247:2: rule__AllConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl10515);
                    rule__AllConstraint__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5257:1: rule__AllConstraint__Group__1 : rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 ;
    public final void rule__AllConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5261:1: ( rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5262:2: rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__110546);
            rule__AllConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__110549);
            rule__AllConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__1"


    // $ANTLR start "rule__AllConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5269:1: rule__AllConstraint__Group__1__Impl : ( ( rule__AllConstraint__Group_1__0 )? ) ;
    public final void rule__AllConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5273:1: ( ( ( rule__AllConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5274:1: ( ( rule__AllConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5274:1: ( ( rule__AllConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5275:1: ( rule__AllConstraint__Group_1__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5276:1: ( rule__AllConstraint__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5276:2: rule__AllConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl10576);
                    rule__AllConstraint__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group__2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5286:1: rule__AllConstraint__Group__2 : rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 ;
    public final void rule__AllConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5290:1: ( rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5291:2: rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__210607);
            rule__AllConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__210610);
            rule__AllConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__2"


    // $ANTLR start "rule__AllConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5298:1: rule__AllConstraint__Group__2__Impl : ( ( rule__AllConstraint__Group_2__0 )? ) ;
    public final void rule__AllConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5302:1: ( ( ( rule__AllConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5303:1: ( ( rule__AllConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5303:1: ( ( rule__AllConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5304:1: ( rule__AllConstraint__Group_2__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5305:1: ( rule__AllConstraint__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5305:2: rule__AllConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl10637);
                    rule__AllConstraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__2__Impl"


    // $ANTLR start "rule__AllConstraint__Group__3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5315:1: rule__AllConstraint__Group__3 : rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 ;
    public final void rule__AllConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5319:1: ( rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5320:2: rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__310668);
            rule__AllConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__310671);
            rule__AllConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__3"


    // $ANTLR start "rule__AllConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5327:1: rule__AllConstraint__Group__3__Impl : ( ( rule__AllConstraint__Group_3__0 )? ) ;
    public final void rule__AllConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5331:1: ( ( ( rule__AllConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5332:1: ( ( rule__AllConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5332:1: ( ( rule__AllConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5333:1: ( rule__AllConstraint__Group_3__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5334:1: ( rule__AllConstraint__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==45) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5334:2: rule__AllConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl10698);
                    rule__AllConstraint__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__3__Impl"


    // $ANTLR start "rule__AllConstraint__Group__4"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5344:1: rule__AllConstraint__Group__4 : rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 ;
    public final void rule__AllConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5348:1: ( rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5349:2: rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__410729);
            rule__AllConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__410732);
            rule__AllConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__4"


    // $ANTLR start "rule__AllConstraint__Group__4__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5356:1: rule__AllConstraint__Group__4__Impl : ( ( rule__AllConstraint__Group_4__0 )? ) ;
    public final void rule__AllConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5360:1: ( ( ( rule__AllConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5361:1: ( ( rule__AllConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5361:1: ( ( rule__AllConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5362:1: ( rule__AllConstraint__Group_4__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5363:1: ( rule__AllConstraint__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==41) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5363:2: rule__AllConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl10759);
                    rule__AllConstraint__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__4__Impl"


    // $ANTLR start "rule__AllConstraint__Group__5"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5373:1: rule__AllConstraint__Group__5 : rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 ;
    public final void rule__AllConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5377:1: ( rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5378:2: rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__510790);
            rule__AllConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__510793);
            rule__AllConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__5"


    // $ANTLR start "rule__AllConstraint__Group__5__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5385:1: rule__AllConstraint__Group__5__Impl : ( ( rule__AllConstraint__Group_5__0 )? ) ;
    public final void rule__AllConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5389:1: ( ( ( rule__AllConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5390:1: ( ( rule__AllConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5390:1: ( ( rule__AllConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5391:1: ( rule__AllConstraint__Group_5__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5392:1: ( rule__AllConstraint__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5392:2: rule__AllConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl10820);
                    rule__AllConstraint__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__5__Impl"


    // $ANTLR start "rule__AllConstraint__Group__6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5402:1: rule__AllConstraint__Group__6 : rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 ;
    public final void rule__AllConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5406:1: ( rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5407:2: rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__610851);
            rule__AllConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__610854);
            rule__AllConstraint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__6"


    // $ANTLR start "rule__AllConstraint__Group__6__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5414:1: rule__AllConstraint__Group__6__Impl : ( ( rule__AllConstraint__IsIdAssignment_6 )? ) ;
    public final void rule__AllConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5418:1: ( ( ( rule__AllConstraint__IsIdAssignment_6 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5419:1: ( ( rule__AllConstraint__IsIdAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5419:1: ( ( rule__AllConstraint__IsIdAssignment_6 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5420:1: ( rule__AllConstraint__IsIdAssignment_6 )?
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdAssignment_6()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5421:1: ( rule__AllConstraint__IsIdAssignment_6 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5421:2: rule__AllConstraint__IsIdAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__IsIdAssignment_6_in_rule__AllConstraint__Group__6__Impl10881);
                    rule__AllConstraint__IsIdAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getIsIdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__6__Impl"


    // $ANTLR start "rule__AllConstraint__Group__7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5431:1: rule__AllConstraint__Group__7 : rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 ;
    public final void rule__AllConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5435:1: ( rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5436:2: rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__710912);
            rule__AllConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__710915);
            rule__AllConstraint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__7"


    // $ANTLR start "rule__AllConstraint__Group__7__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5443:1: rule__AllConstraint__Group__7__Impl : ( ( rule__AllConstraint__NullableAssignment_7 )? ) ;
    public final void rule__AllConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5447:1: ( ( ( rule__AllConstraint__NullableAssignment_7 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5448:1: ( ( rule__AllConstraint__NullableAssignment_7 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5448:1: ( ( rule__AllConstraint__NullableAssignment_7 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5449:1: ( rule__AllConstraint__NullableAssignment_7 )?
            {
             before(grammarAccess.getAllConstraintAccess().getNullableAssignment_7()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5450:1: ( rule__AllConstraint__NullableAssignment_7 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5450:2: rule__AllConstraint__NullableAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__NullableAssignment_7_in_rule__AllConstraint__Group__7__Impl10942);
                    rule__AllConstraint__NullableAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getNullableAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__7__Impl"


    // $ANTLR start "rule__AllConstraint__Group__8"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5460:1: rule__AllConstraint__Group__8 : rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9 ;
    public final void rule__AllConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5464:1: ( rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5465:2: rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__810973);
            rule__AllConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__9_in_rule__AllConstraint__Group__810976);
            rule__AllConstraint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__8"


    // $ANTLR start "rule__AllConstraint__Group__8__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5472:1: rule__AllConstraint__Group__8__Impl : ( ( rule__AllConstraint__Group_8__0 )? ) ;
    public final void rule__AllConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5476:1: ( ( ( rule__AllConstraint__Group_8__0 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5477:1: ( ( rule__AllConstraint__Group_8__0 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5477:1: ( ( rule__AllConstraint__Group_8__0 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5478:1: ( rule__AllConstraint__Group_8__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_8()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5479:1: ( rule__AllConstraint__Group_8__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5479:2: rule__AllConstraint__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_8__0_in_rule__AllConstraint__Group__8__Impl11003);
                    rule__AllConstraint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__8__Impl"


    // $ANTLR start "rule__AllConstraint__Group__9"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5489:1: rule__AllConstraint__Group__9 : rule__AllConstraint__Group__9__Impl ;
    public final void rule__AllConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5493:1: ( rule__AllConstraint__Group__9__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5494:2: rule__AllConstraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__9__Impl_in_rule__AllConstraint__Group__911034);
            rule__AllConstraint__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__9"


    // $ANTLR start "rule__AllConstraint__Group__9__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5500:1: rule__AllConstraint__Group__9__Impl : ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? ) ;
    public final void rule__AllConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5504:1: ( ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5505:1: ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5505:1: ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5506:1: ( rule__AllConstraint__IsXSDAttAssignment_9 )?
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttAssignment_9()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5507:1: ( rule__AllConstraint__IsXSDAttAssignment_9 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==59) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5507:2: rule__AllConstraint__IsXSDAttAssignment_9
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__IsXSDAttAssignment_9_in_rule__AllConstraint__Group__9__Impl11061);
                    rule__AllConstraint__IsXSDAttAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getIsXSDAttAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group__9__Impl"


    // $ANTLR start "rule__AllConstraint__Group_0__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5537:1: rule__AllConstraint__Group_0__0 : rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 ;
    public final void rule__AllConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5541:1: ( rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5542:2: rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__011112);
            rule__AllConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__011115);
            rule__AllConstraint__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_0__0"


    // $ANTLR start "rule__AllConstraint__Group_0__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5549:1: rule__AllConstraint__Group_0__0__Impl : ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) ;
    public final void rule__AllConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5553:1: ( ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5554:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5554:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5555:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultAssignment_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5556:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5556:2: rule__AllConstraint__HasDefaultAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl11142);
            rule__AllConstraint__HasDefaultAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getHasDefaultAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_0__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_0__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5566:1: rule__AllConstraint__Group_0__1 : rule__AllConstraint__Group_0__1__Impl ;
    public final void rule__AllConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5570:1: ( rule__AllConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5571:2: rule__AllConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__111172);
            rule__AllConstraint__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_0__1"


    // $ANTLR start "rule__AllConstraint__Group_0__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5577:1: rule__AllConstraint__Group_0__1__Impl : ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) ;
    public final void rule__AllConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5581:1: ( ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5582:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5582:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5583:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5584:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5584:2: rule__AllConstraint__DefaultValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl11199);
            rule__AllConstraint__DefaultValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getDefaultValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_0__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_1__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5598:1: rule__AllConstraint__Group_1__0 : rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 ;
    public final void rule__AllConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5602:1: ( rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5603:2: rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__011233);
            rule__AllConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__011236);
            rule__AllConstraint__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_1__0"


    // $ANTLR start "rule__AllConstraint__Group_1__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5610:1: rule__AllConstraint__Group_1__0__Impl : ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) ;
    public final void rule__AllConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5614:1: ( ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5615:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5615:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5616:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedAssignment_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5617:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5617:2: rule__AllConstraint__IsFixedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl11263);
            rule__AllConstraint__IsFixedAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getIsFixedAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_1__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5627:1: rule__AllConstraint__Group_1__1 : rule__AllConstraint__Group_1__1__Impl ;
    public final void rule__AllConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5631:1: ( rule__AllConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5632:2: rule__AllConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__111293);
            rule__AllConstraint__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_1__1"


    // $ANTLR start "rule__AllConstraint__Group_1__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5638:1: rule__AllConstraint__Group_1__1__Impl : ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) ;
    public final void rule__AllConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5642:1: ( ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5643:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5643:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5644:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5645:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5645:2: rule__AllConstraint__FixedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl11320);
            rule__AllConstraint__FixedValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getFixedValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_2__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5659:1: rule__AllConstraint__Group_2__0 : rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 ;
    public final void rule__AllConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5663:1: ( rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5664:2: rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__011354);
            rule__AllConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__011357);
            rule__AllConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_2__0"


    // $ANTLR start "rule__AllConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5671:1: rule__AllConstraint__Group_2__0__Impl : ( 'minLen' ) ;
    public final void rule__AllConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5675:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5676:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5676:1: ( 'minLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5677:1: 'minLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__AllConstraint__Group_2__0__Impl11385); 
             after(grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_2__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5690:1: rule__AllConstraint__Group_2__1 : rule__AllConstraint__Group_2__1__Impl ;
    public final void rule__AllConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5694:1: ( rule__AllConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5695:2: rule__AllConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__111416);
            rule__AllConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_2__1"


    // $ANTLR start "rule__AllConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5701:1: rule__AllConstraint__Group_2__1__Impl : ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) ;
    public final void rule__AllConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5705:1: ( ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5706:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5706:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5707:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5708:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5708:2: rule__AllConstraint__MinLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl11443);
            rule__AllConstraint__MinLenAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getMinLenAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_3__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5722:1: rule__AllConstraint__Group_3__0 : rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 ;
    public final void rule__AllConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5726:1: ( rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5727:2: rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__011477);
            rule__AllConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__011480);
            rule__AllConstraint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_3__0"


    // $ANTLR start "rule__AllConstraint__Group_3__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5734:1: rule__AllConstraint__Group_3__0__Impl : ( 'maxLen' ) ;
    public final void rule__AllConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5738:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5739:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5739:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5740:1: 'maxLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__AllConstraint__Group_3__0__Impl11508); 
             after(grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_3__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_3__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5753:1: rule__AllConstraint__Group_3__1 : rule__AllConstraint__Group_3__1__Impl ;
    public final void rule__AllConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5757:1: ( rule__AllConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5758:2: rule__AllConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__111539);
            rule__AllConstraint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_3__1"


    // $ANTLR start "rule__AllConstraint__Group_3__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5764:1: rule__AllConstraint__Group_3__1__Impl : ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) ;
    public final void rule__AllConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5768:1: ( ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5769:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5769:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5770:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenAssignment_3_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5771:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5771:2: rule__AllConstraint__MaxLenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl11566);
            rule__AllConstraint__MaxLenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getMaxLenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_3__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_4__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5785:1: rule__AllConstraint__Group_4__0 : rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 ;
    public final void rule__AllConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5789:1: ( rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5790:2: rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__011600);
            rule__AllConstraint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__011603);
            rule__AllConstraint__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_4__0"


    // $ANTLR start "rule__AllConstraint__Group_4__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5797:1: rule__AllConstraint__Group_4__0__Impl : ( 'fixeLen' ) ;
    public final void rule__AllConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5801:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5802:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5802:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5803:1: 'fixeLen'
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__AllConstraint__Group_4__0__Impl11631); 
             after(grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_4__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_4__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5816:1: rule__AllConstraint__Group_4__1 : rule__AllConstraint__Group_4__1__Impl ;
    public final void rule__AllConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5820:1: ( rule__AllConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5821:2: rule__AllConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__111662);
            rule__AllConstraint__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_4__1"


    // $ANTLR start "rule__AllConstraint__Group_4__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5827:1: rule__AllConstraint__Group_4__1__Impl : ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) ;
    public final void rule__AllConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5831:1: ( ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5832:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5832:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5833:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5834:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5834:2: rule__AllConstraint__FixeLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl11689);
            rule__AllConstraint__FixeLenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getFixeLenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_4__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_5__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5848:1: rule__AllConstraint__Group_5__0 : rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 ;
    public final void rule__AllConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5852:1: ( rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5853:2: rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__011723);
            rule__AllConstraint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__011726);
            rule__AllConstraint__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_5__0"


    // $ANTLR start "rule__AllConstraint__Group_5__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5860:1: rule__AllConstraint__Group_5__0__Impl : ( 'paddle' ) ;
    public final void rule__AllConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5864:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5865:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5865:1: ( 'paddle' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5866:1: 'paddle'
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0()); 
            match(input,46,FOLLOW_46_in_rule__AllConstraint__Group_5__0__Impl11754); 
             after(grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_5__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_5__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5879:1: rule__AllConstraint__Group_5__1 : rule__AllConstraint__Group_5__1__Impl ;
    public final void rule__AllConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5883:1: ( rule__AllConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5884:2: rule__AllConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__111785);
            rule__AllConstraint__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_5__1"


    // $ANTLR start "rule__AllConstraint__Group_5__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5890:1: rule__AllConstraint__Group_5__1__Impl : ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) ;
    public final void rule__AllConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5894:1: ( ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5895:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5895:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5896:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleAssignment_5_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5897:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5897:2: rule__AllConstraint__PaddleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl11812);
            rule__AllConstraint__PaddleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getPaddleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_5__1__Impl"


    // $ANTLR start "rule__AllConstraint__Group_8__0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5911:1: rule__AllConstraint__Group_8__0 : rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1 ;
    public final void rule__AllConstraint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5915:1: ( rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5916:2: rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_8__0__Impl_in_rule__AllConstraint__Group_8__011846);
            rule__AllConstraint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_8__1_in_rule__AllConstraint__Group_8__011849);
            rule__AllConstraint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_8__0"


    // $ANTLR start "rule__AllConstraint__Group_8__0__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5923:1: rule__AllConstraint__Group_8__0__Impl : ( ( rule__AllConstraint__DerivedAssignment_8_0 ) ) ;
    public final void rule__AllConstraint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5927:1: ( ( ( rule__AllConstraint__DerivedAssignment_8_0 ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5928:1: ( ( rule__AllConstraint__DerivedAssignment_8_0 ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5928:1: ( ( rule__AllConstraint__DerivedAssignment_8_0 ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5929:1: ( rule__AllConstraint__DerivedAssignment_8_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedAssignment_8_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5930:1: ( rule__AllConstraint__DerivedAssignment_8_0 )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5930:2: rule__AllConstraint__DerivedAssignment_8_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__DerivedAssignment_8_0_in_rule__AllConstraint__Group_8__0__Impl11876);
            rule__AllConstraint__DerivedAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getDerivedAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_8__0__Impl"


    // $ANTLR start "rule__AllConstraint__Group_8__1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5940:1: rule__AllConstraint__Group_8__1 : rule__AllConstraint__Group_8__1__Impl ;
    public final void rule__AllConstraint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5944:1: ( rule__AllConstraint__Group_8__1__Impl )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5945:2: rule__AllConstraint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_8__1__Impl_in_rule__AllConstraint__Group_8__111906);
            rule__AllConstraint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_8__1"


    // $ANTLR start "rule__AllConstraint__Group_8__1__Impl"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5951:1: rule__AllConstraint__Group_8__1__Impl : ( ( rule__AllConstraint__WritableAssignment_8_1 )? ) ;
    public final void rule__AllConstraint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5955:1: ( ( ( rule__AllConstraint__WritableAssignment_8_1 )? ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5956:1: ( ( rule__AllConstraint__WritableAssignment_8_1 )? )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5956:1: ( ( rule__AllConstraint__WritableAssignment_8_1 )? )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5957:1: ( rule__AllConstraint__WritableAssignment_8_1 )?
            {
             before(grammarAccess.getAllConstraintAccess().getWritableAssignment_8_1()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5958:1: ( rule__AllConstraint__WritableAssignment_8_1 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5958:2: rule__AllConstraint__WritableAssignment_8_1
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__WritableAssignment_8_1_in_rule__AllConstraint__Group_8__1__Impl11933);
                    rule__AllConstraint__WritableAssignment_8_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getWritableAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__Group_8__1__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5973:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5977:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5978:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5978:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5979:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11973);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ElementsAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5988:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5992:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5993:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5993:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:5994:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_112004);
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


    // $ANTLR start "rule__XsdElement__XsdElementAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6003:1: rule__XsdElement__XsdElementAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__XsdElement__XsdElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6007:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6008:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6008:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6009:1: ( RULE_ID )
            {
             before(grammarAccess.getXsdElementAccess().getXsdElementEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6010:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6011:1: RULE_ID
            {
             before(grammarAccess.getXsdElementAccess().getXsdElementEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__XsdElement__XsdElementAssignment_112039); 
             after(grammarAccess.getXsdElementAccess().getXsdElementEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getXsdElementAccess().getXsdElementEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XsdElement__XsdElementAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6022:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6026:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6027:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6027:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6028:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_112074);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__PrefixAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6037:1: rule__PackageDeclaration__PrefixAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6041:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6042:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6042:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6043:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_112105);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__PrefixAssignment_2_1"


    // $ANTLR start "rule__PackageDeclaration__NamespaceAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6052:1: rule__PackageDeclaration__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6056:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6057:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6057:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6058:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_112136); 
             after(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NamespaceAssignment_3_1"


    // $ANTLR start "rule__PackageDeclaration__AnnoAssignment_4_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6067:1: rule__PackageDeclaration__AnnoAssignment_4_1 : ( ruleAnnotations ) ;
    public final void rule__PackageDeclaration__AnnoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6071:1: ( ( ruleAnnotations ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6072:1: ( ruleAnnotations )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6072:1: ( ruleAnnotations )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6073:1: ruleAnnotations
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotations_in_rule__PackageDeclaration__AnnoAssignment_4_112167);
            ruleAnnotations();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__AnnoAssignment_4_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6082:1: rule__PackageDeclaration__ElementsAssignment_6 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6086:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6087:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6087:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6088:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_612198);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_6"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6097:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6101:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6102:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6102:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6103:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_112229); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DataType__ConstraintAssignment_2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6112:1: rule__DataType__ConstraintAssignment_2 : ( ruleConstraint ) ;
    public final void rule__DataType__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6116:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6117:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6117:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6118:1: ruleConstraint
            {
             before(grammarAccess.getDataTypeAccess().getConstraintConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__DataType__ConstraintAssignment_212260);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getConstraintConstraintParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__ConstraintAssignment_2"


    // $ANTLR start "rule__DataType__AnnoAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6127:1: rule__DataType__AnnoAssignment_3_1 : ( ruleAnnotations ) ;
    public final void rule__DataType__AnnoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6131:1: ( ( ruleAnnotations ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6132:1: ( ruleAnnotations )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6132:1: ( ruleAnnotations )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6133:1: ruleAnnotations
            {
             before(grammarAccess.getDataTypeAccess().getAnnoAnnotationsParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotations_in_rule__DataType__AnnoAssignment_3_112291);
            ruleAnnotations();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnoAnnotationsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__AnnoAssignment_3_1"


    // $ANTLR start "rule__Entity__EntityTypeAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6142:1: rule__Entity__EntityTypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__Entity__EntityTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6146:1: ( ( ruleEntityType ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6147:1: ( ruleEntityType )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6147:1: ( ruleEntityType )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6148:1: ruleEntityType
            {
             before(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_012322);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityTypeAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6157:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6161:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6162:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6162:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6163:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_212353); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6172:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6176:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6177:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6177:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6178:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6179:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6180:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_112388);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__AnnoAssignment_4_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6191:1: rule__Entity__AnnoAssignment_4_1 : ( ruleAnnotations ) ;
    public final void rule__Entity__AnnoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6195:1: ( ( ruleAnnotations ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6196:1: ( ruleAnnotations )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6196:1: ( ruleAnnotations )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6197:1: ruleAnnotations
            {
             before(grammarAccess.getEntityAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotations_in_rule__Entity__AnnoAssignment_4_112423);
            ruleAnnotations();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnoAnnotationsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnoAssignment_4_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_5"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6206:1: rule__Entity__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6210:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6211:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6211:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6212:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_512454); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescriptionAssignment_5"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6221:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6225:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6226:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6226:1: ( ruleFeature )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6227:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_712485);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_7"


    // $ANTLR start "rule__Feature__ConstraintAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6236:1: rule__Feature__ConstraintAssignment_1 : ( ruleConstraint ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6240:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6241:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6241:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6242:1: ruleConstraint
            {
             before(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_112516);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ConstraintAssignment_1"


    // $ANTLR start "rule__Feature__AnnoAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6251:1: rule__Feature__AnnoAssignment_2_1 : ( ruleAnnotations ) ;
    public final void rule__Feature__AnnoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6255:1: ( ( ruleAnnotations ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6256:1: ( ruleAnnotations )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6256:1: ( ruleAnnotations )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6257:1: ruleAnnotations
            {
             before(grammarAccess.getFeatureAccess().getAnnoAnnotationsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotations_in_rule__Feature__AnnoAssignment_2_112547);
            ruleAnnotations();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAnnoAnnotationsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AnnoAssignment_2_1"


    // $ANTLR start "rule__Feature__DescriptionAssignment_3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6266:1: rule__Feature__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Feature__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6270:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6271:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6271:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6272:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_312578); 
             after(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6281:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6285:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6286:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6286:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6287:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012609); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6296:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6300:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6301:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6301:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6302:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_212640);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Reference__NameAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6311:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6315:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6316:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6316:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6317:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112671); 
             after(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__NameAssignment_1"


    // $ANTLR start "rule__Reference__TypeAssignment_3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6326:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6330:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6331:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6331:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6332:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312702);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__TypeAssignment_3"


    // $ANTLR start "rule__Reference__OppositeAssignment_4_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6341:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6345:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6346:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6346:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6347:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6348:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6349:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112737); 
             after(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__OppositeAssignment_4_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6360:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6364:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6365:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6365:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6366:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_112772); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__EnumerationLiteralsAssignment_3"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6375:1: rule__Enumeration__EnumerationLiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6379:1: ( ( ruleEnumerationLiteral ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6380:1: ( ruleEnumerationLiteral )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6380:1: ( ruleEnumerationLiteral )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6381:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_312803);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumerationLiteralsAssignment_3"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6390:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6394:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6395:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6395:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6396:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_012834); 
             after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumerationLiteral__PersistedValueAssignment_1_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6405:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6409:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6410:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6410:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6411:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_112865); 
             after(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__PersistedValueAssignment_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6425:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6429:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6430:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6430:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6431:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012901); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6440:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6444:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6445:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6445:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6446:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112932);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1"


    // $ANTLR start "rule__TypeRef__ReferencedAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6455:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6459:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6460:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6460:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6461:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6462:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6463:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_012967);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__ReferencedAssignment_0"


    // $ANTLR start "rule__TypeRef__MultiAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6474:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6478:1: ( ( ( '*' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6479:1: ( ( '*' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6479:1: ( ( '*' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6480:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6481:1: ( '*' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6482:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__TypeRef__MultiAssignment_113007); 
             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__MultiAssignment_1"


    // $ANTLR start "rule__TypeRef__OptionAssignment_2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6497:1: rule__TypeRef__OptionAssignment_2 : ( ( '?' ) ) ;
    public final void rule__TypeRef__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6501:1: ( ( ( '?' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6502:1: ( ( '?' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6502:1: ( ( '?' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6503:1: ( '?' )
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6504:1: ( '?' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6505:1: '?'
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__TypeRef__OptionAssignment_213051); 
             after(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 

            }

             after(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRef__OptionAssignment_2"


    // $ANTLR start "rule__Annotations__AnnotationsAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6520:1: rule__Annotations__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__Annotations__AnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6524:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6525:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6525:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6526:1: ruleAnnotation
            {
             before(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_113090);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__AnnotationsAssignment_1"


    // $ANTLR start "rule__Annotations__AnnotationsAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6535:1: rule__Annotations__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__Annotations__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6539:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6540:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6540:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6541:1: ruleAnnotation
            {
             before(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_2_113121);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationsAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotations__AnnotationsAssignment_2_1"


    // $ANTLR start "rule__Annotation__KeyAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6550:1: rule__Annotation__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6554:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6555:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6555:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6556:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__KeyAssignment_013152); 
             after(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__KeyAssignment_0"


    // $ANTLR start "rule__Annotation__ValueAssignment_2"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6565:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6569:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6570:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6570:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6571:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_213183); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValueAssignment_2"


    // $ANTLR start "rule__BoolConstraint__ConstraintAssignment"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6580:1: rule__BoolConstraint__ConstraintAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BoolConstraint__ConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6584:1: ( ( ( 'boolean' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6585:1: ( ( 'boolean' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6585:1: ( ( 'boolean' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6586:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6587:1: ( 'boolean' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6588:1: 'boolean'
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__BoolConstraint__ConstraintAssignment13219); 
             after(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 

            }

             after(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolConstraint__ConstraintAssignment"


    // $ANTLR start "rule__StringConstraint__ConstraintAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6603:1: rule__StringConstraint__ConstraintAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__StringConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6607:1: ( ( ( 'string' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6608:1: ( ( 'string' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6608:1: ( ( 'string' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6609:1: ( 'string' )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6610:1: ( 'string' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6611:1: 'string'
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__StringConstraint__ConstraintAssignment_013263); 
             after(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 

            }

             after(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__ConstraintAssignment_0"


    // $ANTLR start "rule__StringConstraint__ConstraintRefAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6626:1: rule__StringConstraint__ConstraintRefAssignment_1 : ( ruleAllConstraint ) ;
    public final void rule__StringConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6630:1: ( ( ruleAllConstraint ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6631:1: ( ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6631:1: ( ruleAllConstraint )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6632:1: ruleAllConstraint
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_113302);
            ruleAllConstraint();

            state._fsp--;

             after(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__ConstraintRefAssignment_1"


    // $ANTLR start "rule__StringConstraint__RegularExpressionAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6641:1: rule__StringConstraint__RegularExpressionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__RegularExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6645:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6646:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6646:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6647:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_113333); 
             after(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConstraint__RegularExpressionAssignment_2_1"


    // $ANTLR start "rule__DateTimeConstraint__ConstraintAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6656:1: rule__DateTimeConstraint__ConstraintAssignment_0 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6660:1: ( ( ( 'datetime' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6661:1: ( ( 'datetime' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6661:1: ( ( 'datetime' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6662:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6663:1: ( 'datetime' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6664:1: 'datetime'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__DateTimeConstraint__ConstraintAssignment_013369); 
             after(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 

            }

             after(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__ConstraintAssignment_0"


    // $ANTLR start "rule__DateTimeConstraint__HasDefaultAssignment_1_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6679:1: rule__DateTimeConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6683:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6684:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6684:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6685:1: ( 'default' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6686:1: ( 'default' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6687:1: 'default'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,52,FOLLOW_52_in_rule__DateTimeConstraint__HasDefaultAssignment_1_013413); 
             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }

             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__HasDefaultAssignment_1_0"


    // $ANTLR start "rule__DateTimeConstraint__DefaultValueAssignment_1_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6702:1: rule__DateTimeConstraint__DefaultValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6706:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6707:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6707:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6708:1: RULE_STRING
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_1_113452); 
             after(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__DefaultValueAssignment_1_1"


    // $ANTLR start "rule__DecimalConstraint__ConstraintAssignment_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6717:1: rule__DecimalConstraint__ConstraintAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6721:1: ( ( ( 'decimal' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6722:1: ( ( 'decimal' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6722:1: ( ( 'decimal' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6723:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6724:1: ( 'decimal' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6725:1: 'decimal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__DecimalConstraint__ConstraintAssignment_013488); 
             after(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 

            }

             after(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__ConstraintAssignment_0"


    // $ANTLR start "rule__DecimalConstraint__ConstraintRefAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6740:1: rule__DecimalConstraint__ConstraintRefAssignment_1 : ( ruleNumberConstraint ) ;
    public final void rule__DecimalConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6744:1: ( ( ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6745:1: ( ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6745:1: ( ruleNumberConstraint )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6746:1: ruleNumberConstraint
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_113527);
            ruleNumberConstraint();

            state._fsp--;

             after(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalConstraint__ConstraintRefAssignment_1"


    // $ANTLR start "rule__EnumerationConstraint__UsageAssignment_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6755:1: rule__EnumerationConstraint__UsageAssignment_1 : ( ruleEnumUsage ) ;
    public final void rule__EnumerationConstraint__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6759:1: ( ( ruleEnumUsage ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6760:1: ( ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6760:1: ( ruleEnumUsage )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6761:1: ruleEnumUsage
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_113558);
            ruleEnumUsage();

            state._fsp--;

             after(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__UsageAssignment_1"


    // $ANTLR start "rule__EnumerationConstraint__FixeLenAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6770:1: rule__EnumerationConstraint__FixeLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EnumerationConstraint__FixeLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6774:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6775:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6775:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6776:1: RULE_INT
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_113589); 
             after(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__FixeLenAssignment_2_1"


    // $ANTLR start "rule__EnumerationConstraint__HasDefaultAssignment_3_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6785:1: rule__EnumerationConstraint__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationConstraint__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6789:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6790:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6790:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6791:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6792:1: ( 'default' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6793:1: 'default'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,52,FOLLOW_52_in_rule__EnumerationConstraint__HasDefaultAssignment_3_013625); 
             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }

             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__HasDefaultAssignment_3_0"


    // $ANTLR start "rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6808:1: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6812:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6813:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6813:1: ( RULE_ID )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6814:1: RULE_ID
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_113664); 
             after(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1"


    // $ANTLR start "rule__NumberConstraint__HasDefaultAssignment_0_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6823:1: rule__NumberConstraint__HasDefaultAssignment_0_0 : ( ( 'default' ) ) ;
    public final void rule__NumberConstraint__HasDefaultAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6827:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6828:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6828:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6829:1: ( 'default' )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6830:1: ( 'default' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6831:1: 'default'
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            match(input,52,FOLLOW_52_in_rule__NumberConstraint__HasDefaultAssignment_0_013700); 
             after(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__HasDefaultAssignment_0_0"


    // $ANTLR start "rule__NumberConstraint__DefaultValueAssignment_0_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6846:1: rule__NumberConstraint__DefaultValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__DefaultValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6850:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6851:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6851:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6852:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_0_113739); 
             after(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__DefaultValueAssignment_0_1"


    // $ANTLR start "rule__NumberConstraint__IsFixedAssignment_1_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6861:1: rule__NumberConstraint__IsFixedAssignment_1_0 : ( ( 'fixed' ) ) ;
    public final void rule__NumberConstraint__IsFixedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6865:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6866:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6866:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6867:1: ( 'fixed' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6868:1: ( 'fixed' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6869:1: 'fixed'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__NumberConstraint__IsFixedAssignment_1_013775); 
             after(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__IsFixedAssignment_1_0"


    // $ANTLR start "rule__NumberConstraint__FixedValueAssignment_1_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6884:1: rule__NumberConstraint__FixedValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__FixedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6888:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6889:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6889:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6890:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_1_113814); 
             after(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__FixedValueAssignment_1_1"


    // $ANTLR start "rule__NumberConstraint__MinValueAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6899:1: rule__NumberConstraint__MinValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6903:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6904:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6904:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6905:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_2_113845); 
             after(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__MinValueAssignment_2_1"


    // $ANTLR start "rule__NumberConstraint__MaxValueAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6914:1: rule__NumberConstraint__MaxValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6918:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6919:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6919:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6920:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_3_113876); 
             after(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__MaxValueAssignment_3_1"


    // $ANTLR start "rule__NumberConstraint__MinLenAssignment_4_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6929:1: rule__NumberConstraint__MinLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6933:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6934:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6934:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6935:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_113907); 
             after(grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__MinLenAssignment_4_1"


    // $ANTLR start "rule__NumberConstraint__MaxLenAssignment_5_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6944:1: rule__NumberConstraint__MaxLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6948:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6949:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6949:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6950:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_113938); 
             after(grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__MaxLenAssignment_5_1"


    // $ANTLR start "rule__NumberConstraint__FixeLenAssignment_6_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6959:1: rule__NumberConstraint__FixeLenAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__FixeLenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6963:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6964:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6964:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6965:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_113969); 
             after(grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__FixeLenAssignment_6_1"


    // $ANTLR start "rule__NumberConstraint__PaddleAssignment_7_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6974:1: rule__NumberConstraint__PaddleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__PaddleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6978:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6979:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6979:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6980:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_114000); 
             after(grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__PaddleAssignment_7_1"


    // $ANTLR start "rule__NumberConstraint__IsIdAssignment_8"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6989:1: rule__NumberConstraint__IsIdAssignment_8 : ( ( 'id' ) ) ;
    public final void rule__NumberConstraint__IsIdAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6993:1: ( ( ( 'id' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6994:1: ( ( 'id' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6994:1: ( ( 'id' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6995:1: ( 'id' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6996:1: ( 'id' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:6997:1: 'id'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 
            match(input,55,FOLLOW_55_in_rule__NumberConstraint__IsIdAssignment_814036); 
             after(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__IsIdAssignment_8"


    // $ANTLR start "rule__NumberConstraint__NullableAssignment_9"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7012:1: rule__NumberConstraint__NullableAssignment_9 : ( ( 'nullable' ) ) ;
    public final void rule__NumberConstraint__NullableAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7016:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7017:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7017:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7018:1: ( 'nullable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7019:1: ( 'nullable' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7020:1: 'nullable'
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 
            match(input,56,FOLLOW_56_in_rule__NumberConstraint__NullableAssignment_914080); 
             after(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__NullableAssignment_9"


    // $ANTLR start "rule__NumberConstraint__DerivedAssignment_10_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7035:1: rule__NumberConstraint__DerivedAssignment_10_0 : ( ( 'derived' ) ) ;
    public final void rule__NumberConstraint__DerivedAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7039:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7040:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7040:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7041:1: ( 'derived' )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7042:1: ( 'derived' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7043:1: 'derived'
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 
            match(input,57,FOLLOW_57_in_rule__NumberConstraint__DerivedAssignment_10_014124); 
             after(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__DerivedAssignment_10_0"


    // $ANTLR start "rule__NumberConstraint__WritableAssignment_10_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7058:1: rule__NumberConstraint__WritableAssignment_10_1 : ( ( 'writable' ) ) ;
    public final void rule__NumberConstraint__WritableAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7062:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7063:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7063:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7064:1: ( 'writable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7065:1: ( 'writable' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7066:1: 'writable'
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 
            match(input,58,FOLLOW_58_in_rule__NumberConstraint__WritableAssignment_10_114168); 
             after(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__WritableAssignment_10_1"


    // $ANTLR start "rule__NumberConstraint__IsXSDAttAssignment_11"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7081:1: rule__NumberConstraint__IsXSDAttAssignment_11 : ( ( 'xsdA.' ) ) ;
    public final void rule__NumberConstraint__IsXSDAttAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7085:1: ( ( ( 'xsdA.' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7086:1: ( ( 'xsdA.' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7086:1: ( ( 'xsdA.' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7087:1: ( 'xsdA.' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7088:1: ( 'xsdA.' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7089:1: 'xsdA.'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 
            match(input,59,FOLLOW_59_in_rule__NumberConstraint__IsXSDAttAssignment_1114212); 
             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberConstraint__IsXSDAttAssignment_11"


    // $ANTLR start "rule__AllConstraint__HasDefaultAssignment_0_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7104:1: rule__AllConstraint__HasDefaultAssignment_0_0 : ( ( 'default' ) ) ;
    public final void rule__AllConstraint__HasDefaultAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7108:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7109:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7109:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7110:1: ( 'default' )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7111:1: ( 'default' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7112:1: 'default'
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            match(input,52,FOLLOW_52_in_rule__AllConstraint__HasDefaultAssignment_0_014256); 
             after(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__HasDefaultAssignment_0_0"


    // $ANTLR start "rule__AllConstraint__DefaultValueAssignment_0_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7127:1: rule__AllConstraint__DefaultValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__DefaultValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7131:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7132:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7132:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7133:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_114295); 
             after(grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__DefaultValueAssignment_0_1"


    // $ANTLR start "rule__AllConstraint__IsFixedAssignment_1_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7142:1: rule__AllConstraint__IsFixedAssignment_1_0 : ( ( 'fixed' ) ) ;
    public final void rule__AllConstraint__IsFixedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7146:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7147:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7147:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7148:1: ( 'fixed' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7149:1: ( 'fixed' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7150:1: 'fixed'
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__AllConstraint__IsFixedAssignment_1_014331); 
             after(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__IsFixedAssignment_1_0"


    // $ANTLR start "rule__AllConstraint__FixedValueAssignment_1_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7165:1: rule__AllConstraint__FixedValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__FixedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7169:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7170:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7170:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7171:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_114370); 
             after(grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__FixedValueAssignment_1_1"


    // $ANTLR start "rule__AllConstraint__MinLenAssignment_2_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7180:1: rule__AllConstraint__MinLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MinLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7184:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7185:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7185:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7186:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_114401); 
             after(grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__MinLenAssignment_2_1"


    // $ANTLR start "rule__AllConstraint__MaxLenAssignment_3_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7195:1: rule__AllConstraint__MaxLenAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MaxLenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7199:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7200:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7200:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7201:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_114432); 
             after(grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__MaxLenAssignment_3_1"


    // $ANTLR start "rule__AllConstraint__FixeLenAssignment_4_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7210:1: rule__AllConstraint__FixeLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__FixeLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7214:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7215:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7215:1: ( RULE_INT )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7216:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_114463); 
             after(grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__FixeLenAssignment_4_1"


    // $ANTLR start "rule__AllConstraint__PaddleAssignment_5_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7225:1: rule__AllConstraint__PaddleAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__PaddleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7229:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7230:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7230:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7231:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_114494); 
             after(grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__PaddleAssignment_5_1"


    // $ANTLR start "rule__AllConstraint__IsIdAssignment_6"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7240:1: rule__AllConstraint__IsIdAssignment_6 : ( ( 'id' ) ) ;
    public final void rule__AllConstraint__IsIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7244:1: ( ( ( 'id' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7245:1: ( ( 'id' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7245:1: ( ( 'id' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7246:1: ( 'id' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7247:1: ( 'id' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7248:1: 'id'
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 
            match(input,55,FOLLOW_55_in_rule__AllConstraint__IsIdAssignment_614530); 
             after(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__IsIdAssignment_6"


    // $ANTLR start "rule__AllConstraint__NullableAssignment_7"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7263:1: rule__AllConstraint__NullableAssignment_7 : ( ( 'nullable' ) ) ;
    public final void rule__AllConstraint__NullableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7267:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7268:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7268:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7269:1: ( 'nullable' )
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7270:1: ( 'nullable' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7271:1: 'nullable'
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 
            match(input,56,FOLLOW_56_in_rule__AllConstraint__NullableAssignment_714574); 
             after(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__NullableAssignment_7"


    // $ANTLR start "rule__AllConstraint__DerivedAssignment_8_0"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7286:1: rule__AllConstraint__DerivedAssignment_8_0 : ( ( 'derived' ) ) ;
    public final void rule__AllConstraint__DerivedAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7290:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7291:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7291:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7292:1: ( 'derived' )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7293:1: ( 'derived' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7294:1: 'derived'
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 
            match(input,57,FOLLOW_57_in_rule__AllConstraint__DerivedAssignment_8_014618); 
             after(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__DerivedAssignment_8_0"


    // $ANTLR start "rule__AllConstraint__WritableAssignment_8_1"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7309:1: rule__AllConstraint__WritableAssignment_8_1 : ( ( 'writable' ) ) ;
    public final void rule__AllConstraint__WritableAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7313:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7314:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7314:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7315:1: ( 'writable' )
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7316:1: ( 'writable' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7317:1: 'writable'
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 
            match(input,58,FOLLOW_58_in_rule__AllConstraint__WritableAssignment_8_114662); 
             after(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__WritableAssignment_8_1"


    // $ANTLR start "rule__AllConstraint__IsXSDAttAssignment_9"
    // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7332:1: rule__AllConstraint__IsXSDAttAssignment_9 : ( ( 'xsdA.' ) ) ;
    public final void rule__AllConstraint__IsXSDAttAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7336:1: ( ( ( 'xsdA.' ) ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7337:1: ( ( 'xsdA.' ) )
            {
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7337:1: ( ( 'xsdA.' ) )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7338:1: ( 'xsdA.' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7339:1: ( 'xsdA.' )
            // ../fr.chaunier.xtext.omcst.om.ui/src-gen/fr/chaunier/xtext/omcst/om/ui/contentassist/antlr/internal/InternalOmcstDsl.g:7340:1: 'xsdA.'
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 
            match(input,59,FOLLOW_59_in_rule__AllConstraint__IsXSDAttAssignment_914706); 
             after(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllConstraint__IsXSDAttAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x00000000860E0802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdElement_in_entryRuleXsdElement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXsdElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdElement__Group__0_in_ruleXsdElement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_entryRuleAnnotations1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotations1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__0_in_ruleAnnotations1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntityType1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXsdElement_in_rule__AbstractElement__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Visibility__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Visibility__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumUsage__Alternatives2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumUsage__Alternatives2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdElement__Group__0__Impl_in_rule__XsdElement__Group__02424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__XsdElement__Group__1_in_rule__XsdElement__Group__02427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__XsdElement__Group__0__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdElement__Group__1__Impl_in_rule__XsdElement__Group__12486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XsdElement__XsdElementAssignment_1_in_rule__XsdElement__Group__1__Impl2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclaration__Group__0__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12609 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22669 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32730 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42791 = new BitSet(new long[]{0x0000000001D00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_4__0_in_rule__PackageDeclaration__Group__4__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52852 = new BitSet(new long[]{0x00000000862E0800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDeclaration__Group__5__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62914 = new BitSet(new long[]{0x00000000862E0800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_6_in_rule__PackageDeclaration__Group__6__Impl2944 = new BitSet(new long[]{0x00000000860E0802L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__7__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__03050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group_2__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__13112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__03173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDeclaration__Group_3__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_4__0__Impl_in_rule__PackageDeclaration__Group_4__03296 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_4__1_in_rule__PackageDeclaration__Group_4__03299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PackageDeclaration__Group_4__0__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_4__1__Impl_in_rule__PackageDeclaration__Group_4__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__AnnoAssignment_4_1_in_rule__PackageDeclaration__Group_4__1__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Group__0__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13481 = new BitSet(new long[]{0x002E010001000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23541 = new BitSet(new long[]{0x002E010001000000L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__ConstraintAssignment_2_in_rule__DataType__Group__2__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_3__0_in_rule__DataType__Group__3__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_3__0__Impl_in_rule__DataType__Group_3__03668 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataType__Group_3__1_in_rule__DataType__Group_3__03671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Group_3__0__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_3__1__Impl_in_rule__DataType__Group_3__13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__AnnoAssignment_3_1_in_rule__DataType__Group_3__1__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03791 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Entity__Group__1__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23914 = new BitSet(new long[]{0x0000000009100020L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33974 = new BitSet(new long[]{0x0000000009100020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44035 = new BitSet(new long[]{0x0000000009100020L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54096 = new BitSet(new long[]{0x0000000009100020L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_5_in_rule__Entity__Group__5__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64157 = new BitSet(new long[]{0x0000000020200010L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__6__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74219 = new BitSet(new long[]{0x0000000020200010L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__74222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl4249 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__84280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__8__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Entity__Group_3__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__04480 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__04483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group_4__0__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnoAssignment_4_1_in_rule__Entity__Group_4__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04603 = new BitSet(new long[]{0x002E010001000020L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14662 = new BitSet(new long[]{0x002E010001000020L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24723 = new BitSet(new long[]{0x002E010001000020L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__24726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_2__0_in_rule__Feature__Group__2__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__34784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_3_in_rule__Feature__Group__3__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_2__0__Impl_in_rule__Feature__Group_2__04850 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Feature__Group_2__1_in_rule__Feature__Group_2__04853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Feature__Group_2__0__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_2__1__Impl_in_rule__Feature__Group_2__14912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__AnnoAssignment_2_1_in_rule__Feature__Group_2__1__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04973 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Attribute__Group__1__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Reference__Group__0__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15220 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__25280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__25283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Reference__Group__2__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__35342 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__35345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Reference__Group_4__0__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Enumeration__Group__0__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15655 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enumeration__Group__2__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35777 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5809 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5821 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Enumeration__Group__4__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05923 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15983 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__26043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumerationLiteral__Group__2__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__06108 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__06111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__EnumerationLiteral__Group_1__0__Impl6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__06355 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__06358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16415 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06540 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedNameWithWildCard__Group__1__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06665 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6751 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__0__Impl_in_rule__Annotations__Group__06908 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotations__Group__1_in_rule__Annotations__Group__06911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Annotations__Group__0__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__1__Impl_in_rule__Annotations__Group__16970 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__Annotations__Group__2_in_rule__Annotations__Group__16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__AnnotationsAssignment_1_in_rule__Annotations__Group__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__2__Impl_in_rule__Annotations__Group__27030 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__Annotations__Group__3_in_rule__Annotations__Group__27033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group_2__0_in_rule__Annotations__Group__2__Impl7060 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group__3__Impl_in_rule__Annotations__Group__37091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Annotations__Group__3__Impl7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group_2__0__Impl_in_rule__Annotations__Group_2__07158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotations__Group_2__1_in_rule__Annotations__Group_2__07161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Annotations__Group_2__0__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__Group_2__1__Impl_in_rule__Annotations__Group_2__17220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotations__AnnotationsAssignment_2_1_in_rule__Annotations__Group_2__1__Impl7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__07281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__07284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__17341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Annotation__Group__1__Impl7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__27403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl7430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__07466 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__07469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__17526 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__17529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__27586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__07650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__07653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StringConstraint__Group_2__0__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__17712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__07773 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__07776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__17833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_1__0_in_rule__DateTimeConstraint__Group__1__Impl7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_1__0__Impl_in_rule__DateTimeConstraint__Group_1__07895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_1__1_in_rule__DateTimeConstraint__Group_1__07898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_1_0_in_rule__DateTimeConstraint__Group_1__0__Impl7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_1__1__Impl_in_rule__DateTimeConstraint__Group_1__17955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_1_1_in_rule__DateTimeConstraint__Group_1__1__Impl7982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__08016 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__08019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__18076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__08137 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__08140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumerationConstraint__Group__0__Impl8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__18199 = new BitSet(new long[]{0x0010020000000000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__18202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__28259 = new BitSet(new long[]{0x0010020000000000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__28262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__38320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__08386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__08389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumerationConstraint__Group_2__0__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__18448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__08509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__08512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__18569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__08630 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__08633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__18691 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__18694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__28752 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__28755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__38813 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__38816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__48874 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__48877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl8904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__58935 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__58938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__68996 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__68999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__79057 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__79060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__89118 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__89121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsIdAssignment_8_in_rule__NumberConstraint__Group__8__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__99179 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__99182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__NullableAssignment_9_in_rule__NumberConstraint__Group__9__Impl9209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__109240 = new BitSet(new long[]{0x0BD07E0000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__11_in_rule__NumberConstraint__Group__109243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__0_in_rule__NumberConstraint__Group__10__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__11__Impl_in_rule__NumberConstraint__Group__119301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_11_in_rule__NumberConstraint__Group__11__Impl9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__09383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__09386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__HasDefaultAssignment_0_0_in_rule__NumberConstraint__Group_0__0__Impl9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__19443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DefaultValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl9470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__09504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__09507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsFixedAssignment_1_0_in_rule__NumberConstraint__Group_1__0__Impl9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__19564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixedValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__09625 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__09628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NumberConstraint__Group_2__0__Impl9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__19687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__09748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__09751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NumberConstraint__Group_3__0__Impl9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__19810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__09871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__09874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NumberConstraint__Group_4__0__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__19933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__09994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__09997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NumberConstraint__Group_5__0__Impl10025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__110056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__010117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NumberConstraint__Group_6__0__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__110179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__010240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NumberConstraint__Group_7__0__Impl10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__0__Impl_in_rule__NumberConstraint__Group_10__010363 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__1_in_rule__NumberConstraint__Group_10__010366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DerivedAssignment_10_0_in_rule__NumberConstraint__Group_10__0__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__1__Impl_in_rule__NumberConstraint__Group_10__110423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__WritableAssignment_10_1_in_rule__NumberConstraint__Group_10__1__Impl10450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__010485 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__010488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__110546 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__110549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl10576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__210607 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__210610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl10637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__310668 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__310671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl10698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__410729 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__410732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__510790 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__510793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl10820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__610851 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__610854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsIdAssignment_6_in_rule__AllConstraint__Group__6__Impl10881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__710912 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__710915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__NullableAssignment_7_in_rule__AllConstraint__Group__7__Impl10942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__810973 = new BitSet(new long[]{0x0BD0720000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__9_in_rule__AllConstraint__Group__810976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__0_in_rule__AllConstraint__Group__8__Impl11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__9__Impl_in_rule__AllConstraint__Group__911034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsXSDAttAssignment_9_in_rule__AllConstraint__Group__9__Impl11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__011112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__011115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__111172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__011233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__011236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__111293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl11320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__011354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__011357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AllConstraint__Group_2__0__Impl11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__111416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__011477 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__011480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AllConstraint__Group_3__0__Impl11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__111539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__011600 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__011603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AllConstraint__Group_4__0__Impl11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__111662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__011723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__011726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AllConstraint__Group_5__0__Impl11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__111785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__0__Impl_in_rule__AllConstraint__Group_8__011846 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__1_in_rule__AllConstraint__Group_8__011849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DerivedAssignment_8_0_in_rule__AllConstraint__Group_8__0__Impl11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__1__Impl_in_rule__AllConstraint__Group_8__111906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__WritableAssignment_8_1_in_rule__AllConstraint__Group_8__1__Impl11933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_112004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__XsdElement__XsdElementAssignment_112039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_112074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_112105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_112136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__PackageDeclaration__AnnoAssignment_4_112167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_612198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_112229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__DataType__ConstraintAssignment_212260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__DataType__AnnoAssignment_3_112291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_012322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_212353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_112388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__Entity__AnnoAssignment_4_112423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_512454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_712485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_112516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotations_in_rule__Feature__AnnoAssignment_2_112547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_312578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_012609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_212640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_112671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_112772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_312803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_012834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_112865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_012967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TypeRef__MultiAssignment_113007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TypeRef__OptionAssignment_213051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_113090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Annotations__AnnotationsAssignment_2_113121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__KeyAssignment_013152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_213183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__BoolConstraint__ConstraintAssignment13219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__StringConstraint__ConstraintAssignment_013263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_113302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_113333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DateTimeConstraint__ConstraintAssignment_013369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__DateTimeConstraint__HasDefaultAssignment_1_013413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_1_113452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DecimalConstraint__ConstraintAssignment_013488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_113527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_113558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_113589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EnumerationConstraint__HasDefaultAssignment_3_013625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_113664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NumberConstraint__HasDefaultAssignment_0_013700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_0_113739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__NumberConstraint__IsFixedAssignment_1_013775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_1_113814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_2_113845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_3_113876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_113907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_113938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_113969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_114000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__NumberConstraint__IsIdAssignment_814036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__NumberConstraint__NullableAssignment_914080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__NumberConstraint__DerivedAssignment_10_014124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__NumberConstraint__WritableAssignment_10_114168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__NumberConstraint__IsXSDAttAssignment_1114212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AllConstraint__HasDefaultAssignment_0_014256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_114295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AllConstraint__IsFixedAssignment_1_014331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_114370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_114401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_114432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_114463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_114494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__AllConstraint__IsIdAssignment_614530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__AllConstraint__NullableAssignment_714574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__AllConstraint__DerivedAssignment_8_014618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__AllConstraint__WritableAssignment_8_114662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__AllConstraint__IsXSDAttAssignment_914706 = new BitSet(new long[]{0x0000000000000002L});

}