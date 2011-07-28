package fr.chaunier.xtext.om.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.om.services.OmDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'public'", "'private'", "'protected'", "'import'", "'package'", "'{'", "'}'", "'annotations'", "'['", "']'", "','", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "';'", "'='", "'.*'", "'.'", "'*'", "'?'"
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
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalOmDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOmDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOmDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g"; }


     
     	private OmDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OmDslGrammarAccess grammarAccess) {
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:61:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:62:1: ( ruleDomainModel EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:63:1: ruleDomainModel EOF
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:70:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:74:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:76:1: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:77:1: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)||(LA1_0>=23 && LA1_0<=24)||LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:77:2: rule__DomainModel__ElementsAssignment
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:90:1: ( ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:91:1: ruleAbstractElement EOF
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:98:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:102:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:104:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:105:1: ( rule__AbstractElement__Alternatives )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:105:2: rule__AbstractElement__Alternatives
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:117:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:118:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:119:1: ruleImport EOF
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:126:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:130:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:132:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:133:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:133:2: rule__Import__Group__0
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:145:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:146:1: ( rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:147:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration249); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:154:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:158:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:159:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:159:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:160:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:161:1: ( rule__PackageDeclaration__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:161:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:173:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:174:1: ( ruleType EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:175:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType309); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:182:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:186:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:187:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:187:1: ( ( rule__Type__Alternatives ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:188:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:189:1: ( rule__Type__Alternatives )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:189:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:201:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:202:1: ( ruleDataType EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:203:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType362);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType369); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:210:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:214:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:216:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:217:1: ( rule__DataType__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:217:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType395);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:229:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:230:1: ( ruleEntity EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:231:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity422);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity429); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:238:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:242:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:243:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:243:1: ( ( rule__Entity__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:244:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:245:1: ( rule__Entity__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:245:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity455);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:257:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:258:1: ( ruleFeature EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:259:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature482);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature489); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:266:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:270:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:271:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:271:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:272:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:273:1: ( rule__Feature__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:273:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature515);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:285:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:286:1: ( ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:287:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature542);
            ruleStructuralFeature();

            state._fsp--;

             after(grammarAccess.getStructuralFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature549); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:294:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:298:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:299:1: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:299:1: ( ( rule__StructuralFeature__Alternatives ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:300:1: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:301:1: ( rule__StructuralFeature__Alternatives )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:301:2: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature575);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:313:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:314:1: ( ruleAttribute EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:315:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute602);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute609); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:322:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:326:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:327:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:327:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:328:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:329:1: ( rule__Attribute__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:329:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:341:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:342:1: ( ruleReference EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:343:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference662);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference669); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:350:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:354:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:355:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:355:1: ( ( rule__Reference__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:356:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:357:1: ( rule__Reference__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:357:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference695);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:369:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:370:1: ( ruleEnumeration EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:371:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration722);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration729); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:378:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:382:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:383:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:383:1: ( ( rule__Enumeration__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:384:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:385:1: ( rule__Enumeration__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:385:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration755);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:397:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:398:1: ( ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:399:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral782);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral789); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:406:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:410:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:411:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:411:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:412:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:413:1: ( rule__EnumerationLiteral__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:413:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral815);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:427:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:428:1: ( ruleParameter EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:429:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter844);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter851); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:436:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:440:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:441:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:441:1: ( ( rule__Parameter__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:442:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:443:1: ( rule__Parameter__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:443:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter877);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:457:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:458:1: ( ruleTypeRef EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:459:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef906);
            ruleTypeRef();

            state._fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef913); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:466:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:470:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:471:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:471:1: ( ( rule__TypeRef__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:472:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:473:1: ( rule__TypeRef__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:473:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef939);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:485:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:486:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:487:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard966);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard973); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:494:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:498:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:499:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:499:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:500:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:501:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:501:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard999);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:513:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:514:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:515:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1026);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1033); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:522:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:526:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:527:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:527:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:528:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:529:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:529:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1059);
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


    // $ANTLR start "entryRuleAnnotation"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:543:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:544:1: ( ruleAnnotation EOF )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:545:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1088);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1095); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:552:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:556:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:557:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:557:1: ( ( rule__Annotation__Group__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:558:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:559:1: ( rule__Annotation__Group__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:559:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1121);
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


    // $ANTLR start "ruleVisibility"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:572:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:576:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:577:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:577:1: ( ( rule__Visibility__Alternatives ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:578:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:579:1: ( rule__Visibility__Alternatives )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:579:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1158);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:591:1: ruleEntityType : ( ( 'abstract' ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:595:1: ( ( ( 'abstract' ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:596:1: ( ( 'abstract' ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:596:1: ( ( 'abstract' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:597:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityTypeAccess().getAbstractEnumLiteralDeclaration()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:598:1: ( 'abstract' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:598:3: 'abstract'
            {
            match(input,11,FOLLOW_11_in_ruleEntityType1195); 

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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:612:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:616:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 11:
            case 23:
            case 24:
            case 29:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:617:1: ( rulePackageDeclaration )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:617:1: ( rulePackageDeclaration )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:618:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1234);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:623:6: ( ruleType )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:623:6: ( ruleType )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:624:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1251);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:629:6: ( ruleImport )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:629:6: ( ruleImport )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:630:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1268);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:640:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:644:1: ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
            case 24:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:645:1: ( ruleEntity )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:645:1: ( ruleEntity )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:646:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1300);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:651:6: ( ruleDataType )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:651:6: ( ruleDataType )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:652:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1317);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:657:6: ( ruleEnumeration )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:657:6: ( ruleEnumeration )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:658:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1334);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:668:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:672:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:673:1: ( ruleAttribute )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:673:1: ( ruleAttribute )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:674:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1366);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:679:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:679:6: ( ruleReference )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:680:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1383);
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


    // $ANTLR start "rule__Visibility__Alternatives"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:691:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:695:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:696:1: ( ( 'public' ) )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:696:1: ( ( 'public' ) )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:697:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:698:1: ( 'public' )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:698:3: 'public'
                    {
                    match(input,12,FOLLOW_12_in_rule__Visibility__Alternatives1417); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:703:6: ( ( 'private' ) )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:703:6: ( ( 'private' ) )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:704:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:705:1: ( 'private' )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:705:3: 'private'
                    {
                    match(input,13,FOLLOW_13_in_rule__Visibility__Alternatives1438); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:710:6: ( ( 'protected' ) )
                    {
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:710:6: ( ( 'protected' ) )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:711:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:712:1: ( 'protected' )
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:712:3: 'protected'
                    {
                    match(input,14,FOLLOW_14_in_rule__Visibility__Alternatives1459); 

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


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:724:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:728:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:729:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01492);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01495);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:736:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:740:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:741:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:741:1: ( 'import' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:742:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1523); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:755:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:759:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:760:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11554);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:766:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:770:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:771:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:771:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:772:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:773:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:773:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1581);
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:787:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:791:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:792:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01615);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01618);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:799:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:803:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:804:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:804:1: ( 'package' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:805:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl1646); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:818:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:822:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:823:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11677);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11680);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:830:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:834:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:835:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:835:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:836:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:837:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:837:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1707);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:847:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:851:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:852:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21737);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21740);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:859:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__Group_2__0 )? ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:863:1: ( ( ( rule__PackageDeclaration__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:864:1: ( ( rule__PackageDeclaration__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:864:1: ( ( rule__PackageDeclaration__Group_2__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:865:1: ( rule__PackageDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:866:1: ( rule__PackageDeclaration__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:866:2: rule__PackageDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl1767);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:876:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:880:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:881:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31798);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31801);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:888:1: rule__PackageDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:892:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:893:1: ( '{' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:893:1: ( '{' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:894:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__3__Impl1829); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:907:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:911:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:912:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41860);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41863);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:919:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:923:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:924:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:924:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:925:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:926:1: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||(LA7_0>=15 && LA7_0<=16)||(LA7_0>=23 && LA7_0<=24)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:926:2: rule__PackageDeclaration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl1890);
            	    rule__PackageDeclaration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:936:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:940:1: ( rule__PackageDeclaration__Group__5__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:941:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__51921);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:947:1: rule__PackageDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:951:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:952:1: ( '}' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:952:1: ( '}' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:953:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__PackageDeclaration__Group__5__Impl1949); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageDeclaration__Group_2__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:978:1: rule__PackageDeclaration__Group_2__0 : rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 ;
    public final void rule__PackageDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:982:1: ( rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:983:2: rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__01992);
            rule__PackageDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__01995);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:990:1: rule__PackageDeclaration__Group_2__0__Impl : ( 'annotations' ) ;
    public final void rule__PackageDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:994:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:995:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:995:1: ( 'annotations' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:996:1: 'annotations'
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__PackageDeclaration__Group_2__0__Impl2023); 
             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsKeyword_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1009:1: rule__PackageDeclaration__Group_2__1 : rule__PackageDeclaration__Group_2__1__Impl rule__PackageDeclaration__Group_2__2 ;
    public final void rule__PackageDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1013:1: ( rule__PackageDeclaration__Group_2__1__Impl rule__PackageDeclaration__Group_2__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1014:2: rule__PackageDeclaration__Group_2__1__Impl rule__PackageDeclaration__Group_2__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12054);
            rule__PackageDeclaration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__2_in_rule__PackageDeclaration__Group_2__12057);
            rule__PackageDeclaration__Group_2__2();

            state._fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1021:1: rule__PackageDeclaration__Group_2__1__Impl : ( '[' ) ;
    public final void rule__PackageDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1025:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1026:1: ( '[' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1026:1: ( '[' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1027:1: '['
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,20,FOLLOW_20_in_rule__PackageDeclaration__Group_2__1__Impl2085); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackageDeclaration__Group_2__2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1040:1: rule__PackageDeclaration__Group_2__2 : rule__PackageDeclaration__Group_2__2__Impl rule__PackageDeclaration__Group_2__3 ;
    public final void rule__PackageDeclaration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1044:1: ( rule__PackageDeclaration__Group_2__2__Impl rule__PackageDeclaration__Group_2__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1045:2: rule__PackageDeclaration__Group_2__2__Impl rule__PackageDeclaration__Group_2__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__2__Impl_in_rule__PackageDeclaration__Group_2__22116);
            rule__PackageDeclaration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__3_in_rule__PackageDeclaration__Group_2__22119);
            rule__PackageDeclaration__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__2"


    // $ANTLR start "rule__PackageDeclaration__Group_2__2__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1052:1: rule__PackageDeclaration__Group_2__2__Impl : ( ( rule__PackageDeclaration__AnnotationsAssignment_2_2 ) ) ;
    public final void rule__PackageDeclaration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1056:1: ( ( ( rule__PackageDeclaration__AnnotationsAssignment_2_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1057:1: ( ( rule__PackageDeclaration__AnnotationsAssignment_2_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1057:1: ( ( rule__PackageDeclaration__AnnotationsAssignment_2_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1058:1: ( rule__PackageDeclaration__AnnotationsAssignment_2_2 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_2_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1059:1: ( rule__PackageDeclaration__AnnotationsAssignment_2_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1059:2: rule__PackageDeclaration__AnnotationsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__AnnotationsAssignment_2_2_in_rule__PackageDeclaration__Group_2__2__Impl2146);
            rule__PackageDeclaration__AnnotationsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2__3"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1069:1: rule__PackageDeclaration__Group_2__3 : rule__PackageDeclaration__Group_2__3__Impl rule__PackageDeclaration__Group_2__4 ;
    public final void rule__PackageDeclaration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1073:1: ( rule__PackageDeclaration__Group_2__3__Impl rule__PackageDeclaration__Group_2__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1074:2: rule__PackageDeclaration__Group_2__3__Impl rule__PackageDeclaration__Group_2__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__3__Impl_in_rule__PackageDeclaration__Group_2__32176);
            rule__PackageDeclaration__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__4_in_rule__PackageDeclaration__Group_2__32179);
            rule__PackageDeclaration__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__3"


    // $ANTLR start "rule__PackageDeclaration__Group_2__3__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1081:1: rule__PackageDeclaration__Group_2__3__Impl : ( ( rule__PackageDeclaration__Group_2_3__0 )* ) ;
    public final void rule__PackageDeclaration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1085:1: ( ( ( rule__PackageDeclaration__Group_2_3__0 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1086:1: ( ( rule__PackageDeclaration__Group_2_3__0 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1086:1: ( ( rule__PackageDeclaration__Group_2_3__0 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1087:1: ( rule__PackageDeclaration__Group_2_3__0 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1088:1: ( rule__PackageDeclaration__Group_2_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1088:2: rule__PackageDeclaration__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__Group_2_3__0_in_rule__PackageDeclaration__Group_2__3__Impl2206);
            	    rule__PackageDeclaration__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2__4"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1098:1: rule__PackageDeclaration__Group_2__4 : rule__PackageDeclaration__Group_2__4__Impl ;
    public final void rule__PackageDeclaration__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1102:1: ( rule__PackageDeclaration__Group_2__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1103:2: rule__PackageDeclaration__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__4__Impl_in_rule__PackageDeclaration__Group_2__42237);
            rule__PackageDeclaration__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__4"


    // $ANTLR start "rule__PackageDeclaration__Group_2__4__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1109:1: rule__PackageDeclaration__Group_2__4__Impl : ( ']' ) ;
    public final void rule__PackageDeclaration__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1113:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1114:1: ( ']' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1114:1: ( ']' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1115:1: ']'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group_2__4__Impl2265); 
             after(grammarAccess.getPackageDeclarationAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2_3__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1138:1: rule__PackageDeclaration__Group_2_3__0 : rule__PackageDeclaration__Group_2_3__0__Impl rule__PackageDeclaration__Group_2_3__1 ;
    public final void rule__PackageDeclaration__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1142:1: ( rule__PackageDeclaration__Group_2_3__0__Impl rule__PackageDeclaration__Group_2_3__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1143:2: rule__PackageDeclaration__Group_2_3__0__Impl rule__PackageDeclaration__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2_3__0__Impl_in_rule__PackageDeclaration__Group_2_3__02306);
            rule__PackageDeclaration__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2_3__1_in_rule__PackageDeclaration__Group_2_3__02309);
            rule__PackageDeclaration__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2_3__0"


    // $ANTLR start "rule__PackageDeclaration__Group_2_3__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1150:1: rule__PackageDeclaration__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__PackageDeclaration__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1154:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1155:1: ( ',' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1155:1: ( ',' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1156:1: ','
            {
             before(grammarAccess.getPackageDeclarationAccess().getCommaKeyword_2_3_0()); 
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group_2_3__0__Impl2337); 
             after(grammarAccess.getPackageDeclarationAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2_3__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group_2_3__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1169:1: rule__PackageDeclaration__Group_2_3__1 : rule__PackageDeclaration__Group_2_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1173:1: ( rule__PackageDeclaration__Group_2_3__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1174:2: rule__PackageDeclaration__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2_3__1__Impl_in_rule__PackageDeclaration__Group_2_3__12368);
            rule__PackageDeclaration__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2_3__1"


    // $ANTLR start "rule__PackageDeclaration__Group_2_3__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1180:1: rule__PackageDeclaration__Group_2_3__1__Impl : ( ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 ) ) ;
    public final void rule__PackageDeclaration__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1184:1: ( ( ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1185:1: ( ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1185:1: ( ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1186:1: ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_2_3_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1187:1: ( rule__PackageDeclaration__AnnotationsAssignment_2_3_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1187:2: rule__PackageDeclaration__AnnotationsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__AnnotationsAssignment_2_3_1_in_rule__PackageDeclaration__Group_2_3__1__Impl2395);
            rule__PackageDeclaration__AnnotationsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group_2_3__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1201:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1205:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1206:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02429);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02432);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1213:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1217:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1218:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1218:1: ( 'datatype' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1219:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DataType__Group__0__Impl2460); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1232:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1236:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1237:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12491);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12494);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1244:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1248:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1249:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1249:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1250:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1251:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1251:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2521);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1261:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1265:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1266:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22551);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22554);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1273:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__Group_2__0 )? ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1277:1: ( ( ( rule__DataType__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1278:1: ( ( rule__DataType__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1278:1: ( ( rule__DataType__Group_2__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1279:1: ( rule__DataType__Group_2__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1280:1: ( rule__DataType__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1280:2: rule__DataType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataType__Group_2__0_in_rule__DataType__Group__2__Impl2581);
                    rule__DataType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_2()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1290:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1294:1: ( rule__DataType__Group__3__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1295:2: rule__DataType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__32612);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1301:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__DescriptionAssignment_3 )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1305:1: ( ( ( rule__DataType__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1306:1: ( ( rule__DataType__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1306:1: ( ( rule__DataType__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1307:1: ( rule__DataType__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1308:1: ( rule__DataType__DescriptionAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1308:2: rule__DataType__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__DataType__DescriptionAssignment_3_in_rule__DataType__Group__3__Impl2639);
                    rule__DataType__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataType__Group_2__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1326:1: rule__DataType__Group_2__0 : rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 ;
    public final void rule__DataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1330:1: ( rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1331:2: rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_2__0__Impl_in_rule__DataType__Group_2__02678);
            rule__DataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_2__1_in_rule__DataType__Group_2__02681);
            rule__DataType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0"


    // $ANTLR start "rule__DataType__Group_2__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1338:1: rule__DataType__Group_2__0__Impl : ( 'annotations' ) ;
    public final void rule__DataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1342:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1343:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1343:1: ( 'annotations' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1344:1: 'annotations'
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__DataType__Group_2__0__Impl2709); 
             after(grammarAccess.getDataTypeAccess().getAnnotationsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_2__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1357:1: rule__DataType__Group_2__1 : rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 ;
    public final void rule__DataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1361:1: ( rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1362:2: rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2
            {
            pushFollow(FOLLOW_rule__DataType__Group_2__1__Impl_in_rule__DataType__Group_2__12740);
            rule__DataType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_2__2_in_rule__DataType__Group_2__12743);
            rule__DataType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1"


    // $ANTLR start "rule__DataType__Group_2__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1369:1: rule__DataType__Group_2__1__Impl : ( '[' ) ;
    public final void rule__DataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1373:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1374:1: ( '[' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1374:1: ( '[' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1375:1: '['
            {
             before(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,20,FOLLOW_20_in_rule__DataType__Group_2__1__Impl2771); 
             after(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_2__2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1388:1: rule__DataType__Group_2__2 : rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3 ;
    public final void rule__DataType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1392:1: ( rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1393:2: rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3
            {
            pushFollow(FOLLOW_rule__DataType__Group_2__2__Impl_in_rule__DataType__Group_2__22802);
            rule__DataType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_2__3_in_rule__DataType__Group_2__22805);
            rule__DataType__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2"


    // $ANTLR start "rule__DataType__Group_2__2__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1400:1: rule__DataType__Group_2__2__Impl : ( ( rule__DataType__AnnotationsAssignment_2_2 ) ) ;
    public final void rule__DataType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1404:1: ( ( ( rule__DataType__AnnotationsAssignment_2_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1405:1: ( ( rule__DataType__AnnotationsAssignment_2_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1405:1: ( ( rule__DataType__AnnotationsAssignment_2_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1406:1: ( rule__DataType__AnnotationsAssignment_2_2 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_2_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1407:1: ( rule__DataType__AnnotationsAssignment_2_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1407:2: rule__DataType__AnnotationsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DataType__AnnotationsAssignment_2_2_in_rule__DataType__Group_2__2__Impl2832);
            rule__DataType__AnnotationsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2__Impl"


    // $ANTLR start "rule__DataType__Group_2__3"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1417:1: rule__DataType__Group_2__3 : rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4 ;
    public final void rule__DataType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1421:1: ( rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1422:2: rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4
            {
            pushFollow(FOLLOW_rule__DataType__Group_2__3__Impl_in_rule__DataType__Group_2__32862);
            rule__DataType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_2__4_in_rule__DataType__Group_2__32865);
            rule__DataType__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__3"


    // $ANTLR start "rule__DataType__Group_2__3__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1429:1: rule__DataType__Group_2__3__Impl : ( ( rule__DataType__Group_2_3__0 )* ) ;
    public final void rule__DataType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1433:1: ( ( ( rule__DataType__Group_2_3__0 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1434:1: ( ( rule__DataType__Group_2_3__0 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1434:1: ( ( rule__DataType__Group_2_3__0 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1435:1: ( rule__DataType__Group_2_3__0 )*
            {
             before(grammarAccess.getDataTypeAccess().getGroup_2_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1436:1: ( rule__DataType__Group_2_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1436:2: rule__DataType__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__DataType__Group_2_3__0_in_rule__DataType__Group_2__3__Impl2892);
            	    rule__DataType__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__3__Impl"


    // $ANTLR start "rule__DataType__Group_2__4"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1446:1: rule__DataType__Group_2__4 : rule__DataType__Group_2__4__Impl ;
    public final void rule__DataType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1450:1: ( rule__DataType__Group_2__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1451:2: rule__DataType__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_2__4__Impl_in_rule__DataType__Group_2__42923);
            rule__DataType__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__4"


    // $ANTLR start "rule__DataType__Group_2__4__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1457:1: rule__DataType__Group_2__4__Impl : ( ']' ) ;
    public final void rule__DataType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1461:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1462:1: ( ']' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1462:1: ( ']' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1463:1: ']'
            {
             before(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,21,FOLLOW_21_in_rule__DataType__Group_2__4__Impl2951); 
             after(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__4__Impl"


    // $ANTLR start "rule__DataType__Group_2_3__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1486:1: rule__DataType__Group_2_3__0 : rule__DataType__Group_2_3__0__Impl rule__DataType__Group_2_3__1 ;
    public final void rule__DataType__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1490:1: ( rule__DataType__Group_2_3__0__Impl rule__DataType__Group_2_3__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1491:2: rule__DataType__Group_2_3__0__Impl rule__DataType__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__DataType__Group_2_3__0__Impl_in_rule__DataType__Group_2_3__02992);
            rule__DataType__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataType__Group_2_3__1_in_rule__DataType__Group_2_3__02995);
            rule__DataType__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2_3__0"


    // $ANTLR start "rule__DataType__Group_2_3__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1498:1: rule__DataType__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__DataType__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1502:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1503:1: ( ',' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1503:1: ( ',' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1504:1: ','
            {
             before(grammarAccess.getDataTypeAccess().getCommaKeyword_2_3_0()); 
            match(input,22,FOLLOW_22_in_rule__DataType__Group_2_3__0__Impl3023); 
             after(grammarAccess.getDataTypeAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2_3__0__Impl"


    // $ANTLR start "rule__DataType__Group_2_3__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1517:1: rule__DataType__Group_2_3__1 : rule__DataType__Group_2_3__1__Impl ;
    public final void rule__DataType__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1521:1: ( rule__DataType__Group_2_3__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1522:2: rule__DataType__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group_2_3__1__Impl_in_rule__DataType__Group_2_3__13054);
            rule__DataType__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2_3__1"


    // $ANTLR start "rule__DataType__Group_2_3__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1528:1: rule__DataType__Group_2_3__1__Impl : ( ( rule__DataType__AnnotationsAssignment_2_3_1 ) ) ;
    public final void rule__DataType__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1532:1: ( ( ( rule__DataType__AnnotationsAssignment_2_3_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1533:1: ( ( rule__DataType__AnnotationsAssignment_2_3_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1533:1: ( ( rule__DataType__AnnotationsAssignment_2_3_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1534:1: ( rule__DataType__AnnotationsAssignment_2_3_1 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_2_3_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1535:1: ( rule__DataType__AnnotationsAssignment_2_3_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1535:2: rule__DataType__AnnotationsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__DataType__AnnotationsAssignment_2_3_1_in_rule__DataType__Group_2_3__1__Impl3081);
            rule__DataType__AnnotationsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1549:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1553:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1554:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03115);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03118);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1561:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__EntityTypeAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1565:1: ( ( ( rule__Entity__EntityTypeAssignment_0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1566:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1566:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1567:1: ( rule__Entity__EntityTypeAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getEntityTypeAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1568:1: ( rule__Entity__EntityTypeAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1568:2: rule__Entity__EntityTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3145);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1578:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1582:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1583:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13176);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13179);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1590:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1594:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1595:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1595:1: ( 'entity' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1596:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__1__Impl3207); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1609:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1613:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1614:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23238);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23241);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1621:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1625:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1626:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1626:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1627:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1628:1: ( rule__Entity__NameAssignment_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1628:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3268);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1638:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1642:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1643:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33298);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33301);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1650:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1654:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1655:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1655:1: ( ( rule__Entity__Group_3__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1656:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1657:1: ( rule__Entity__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1657:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3328);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1667:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1671:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1672:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43359);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43362);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1679:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1683:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1684:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1684:1: ( ( rule__Entity__Group_4__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1685:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1686:1: ( rule__Entity__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1686:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl3389);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1696:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1700:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1701:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53420);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53423);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1708:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__DescriptionAssignment_5 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1712:1: ( ( ( rule__Entity__DescriptionAssignment_5 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1713:1: ( ( rule__Entity__DescriptionAssignment_5 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1713:1: ( ( rule__Entity__DescriptionAssignment_5 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1714:1: ( rule__Entity__DescriptionAssignment_5 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_5()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1715:1: ( rule__Entity__DescriptionAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1715:2: rule__Entity__DescriptionAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_5_in_rule__Entity__Group__5__Impl3450);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1725:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1729:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1730:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63481);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__63484);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1737:1: rule__Entity__Group__6__Impl : ( '{' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1741:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1742:1: ( '{' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1742:1: ( '{' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1743:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__6__Impl3512); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1756:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1760:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1761:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__73543);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__73546);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1768:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1772:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1773:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1773:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1774:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1775:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1775:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl3573);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1785:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1789:1: ( rule__Entity__Group__8__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1790:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__83604);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1796:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1800:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1801:1: ( '}' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1801:1: ( '}' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1802:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl3632); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1833:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1837:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1838:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03681);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03684);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1845:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1849:1: ( ( 'extends' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1850:1: ( 'extends' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1850:1: ( 'extends' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1851:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Entity__Group_3__0__Impl3712); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1864:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1868:1: ( rule__Entity__Group_3__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1869:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13743);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1875:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1879:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1880:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1880:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1881:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1882:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1882:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3770);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1896:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1900:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1901:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__03804);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__03807);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1908:1: rule__Entity__Group_4__0__Impl : ( 'annotations' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1912:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1913:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1913:1: ( 'annotations' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1914:1: 'annotations'
            {
             before(grammarAccess.getEntityAccess().getAnnotationsKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_4__0__Impl3835); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1927:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1931:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1932:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__13866);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__13869);
            rule__Entity__Group_4__2();

            state._fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1939:1: rule__Entity__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1943:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1944:1: ( '[' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1944:1: ( '[' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1945:1: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group_4__1__Impl3897); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group_4__2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1958:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1962:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1963:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__23928);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__3_in_rule__Entity__Group_4__23931);
            rule__Entity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1970:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__AnnotationsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1974:1: ( ( ( rule__Entity__AnnotationsAssignment_4_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1975:1: ( ( rule__Entity__AnnotationsAssignment_4_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1975:1: ( ( rule__Entity__AnnotationsAssignment_4_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1976:1: ( rule__Entity__AnnotationsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_4_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1977:1: ( rule__Entity__AnnotationsAssignment_4_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1977:2: rule__Entity__AnnotationsAssignment_4_2
            {
            pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_4_2_in_rule__Entity__Group_4__2__Impl3958);
            rule__Entity__AnnotationsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1987:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1991:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1992:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__3__Impl_in_rule__Entity__Group_4__33988);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4__4_in_rule__Entity__Group_4__33991);
            rule__Entity__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:1999:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2003:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2004:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2004:1: ( ( rule__Entity__Group_4_3__0 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2005:1: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2006:1: ( rule__Entity__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2006:2: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Entity__Group_4_3__0_in_rule__Entity__Group_4__3__Impl4018);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2016:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2020:1: ( rule__Entity__Group_4__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2021:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_4__4__Impl_in_rule__Entity__Group_4__44049);
            rule__Entity__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2027:1: rule__Entity__Group_4__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2031:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2032:1: ( ']' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2032:1: ( ']' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2033:1: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_4__4__Impl4077); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2056:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2060:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2061:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_4_3__0__Impl_in_rule__Entity__Group_4_3__04118);
            rule__Entity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_4_3__1_in_rule__Entity__Group_4_3__04121);
            rule__Entity__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__0"


    // $ANTLR start "rule__Entity__Group_4_3__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2068:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2072:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2073:1: ( ',' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2073:1: ( ',' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2074:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_4_3__0__Impl4149); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2087:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2091:1: ( rule__Entity__Group_4_3__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2092:2: rule__Entity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_4_3__1__Impl_in_rule__Entity__Group_4_3__14180);
            rule__Entity__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__1"


    // $ANTLR start "rule__Entity__Group_4_3__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2098:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__AnnotationsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2102:1: ( ( ( rule__Entity__AnnotationsAssignment_4_3_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2103:1: ( ( rule__Entity__AnnotationsAssignment_4_3_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2103:1: ( ( rule__Entity__AnnotationsAssignment_4_3_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2104:1: ( rule__Entity__AnnotationsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_4_3_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2105:1: ( rule__Entity__AnnotationsAssignment_4_3_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2105:2: rule__Entity__AnnotationsAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Entity__AnnotationsAssignment_4_3_1_in_rule__Entity__Group_4_3__1__Impl4207);
            rule__Entity__AnnotationsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2119:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2123:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2124:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04241);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04244);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2131:1: rule__Feature__Group__0__Impl : ( ruleStructuralFeature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2135:1: ( ( ruleStructuralFeature ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2136:1: ( ruleStructuralFeature )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2136:1: ( ruleStructuralFeature )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2137:1: ruleStructuralFeature
            {
             before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4271);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2148:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2152:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2153:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14300);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14303);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2160:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__Group_1__0 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2164:1: ( ( ( rule__Feature__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2165:1: ( ( rule__Feature__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2165:1: ( ( rule__Feature__Group_1__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2166:1: ( rule__Feature__Group_1__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2167:1: ( rule__Feature__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2167:2: rule__Feature__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Group__1__Impl4330);
                    rule__Feature__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2177:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2181:1: ( rule__Feature__Group__2__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2182:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24361);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2188:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__DescriptionAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2192:1: ( ( ( rule__Feature__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2193:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2193:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2194:1: ( rule__Feature__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2195:1: ( rule__Feature__DescriptionAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2195:2: rule__Feature__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4388);
                    rule__Feature__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getDescriptionAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature__Group_1__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2211:1: rule__Feature__Group_1__0 : rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 ;
    public final void rule__Feature__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2215:1: ( rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2216:2: rule__Feature__Group_1__0__Impl rule__Feature__Group_1__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__04425);
            rule__Feature__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__04428);
            rule__Feature__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__0"


    // $ANTLR start "rule__Feature__Group_1__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2223:1: rule__Feature__Group_1__0__Impl : ( 'annotations' ) ;
    public final void rule__Feature__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2227:1: ( ( 'annotations' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2228:1: ( 'annotations' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2228:1: ( 'annotations' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2229:1: 'annotations'
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Feature__Group_1__0__Impl4456); 
             after(grammarAccess.getFeatureAccess().getAnnotationsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__0__Impl"


    // $ANTLR start "rule__Feature__Group_1__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2242:1: rule__Feature__Group_1__1 : rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2 ;
    public final void rule__Feature__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2246:1: ( rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2247:2: rule__Feature__Group_1__1__Impl rule__Feature__Group_1__2
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__14487);
            rule__Feature__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__2_in_rule__Feature__Group_1__14490);
            rule__Feature__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__1"


    // $ANTLR start "rule__Feature__Group_1__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2254:1: rule__Feature__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Feature__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2258:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2259:1: ( '[' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2259:1: ( '[' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2260:1: '['
            {
             before(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__Feature__Group_1__1__Impl4518); 
             after(grammarAccess.getFeatureAccess().getLeftSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group_1__2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2273:1: rule__Feature__Group_1__2 : rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3 ;
    public final void rule__Feature__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2277:1: ( rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2278:2: rule__Feature__Group_1__2__Impl rule__Feature__Group_1__3
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__2__Impl_in_rule__Feature__Group_1__24549);
            rule__Feature__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__3_in_rule__Feature__Group_1__24552);
            rule__Feature__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__2"


    // $ANTLR start "rule__Feature__Group_1__2__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2285:1: rule__Feature__Group_1__2__Impl : ( ( rule__Feature__AnnotationsAssignment_1_2 ) ) ;
    public final void rule__Feature__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2289:1: ( ( ( rule__Feature__AnnotationsAssignment_1_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2290:1: ( ( rule__Feature__AnnotationsAssignment_1_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2290:1: ( ( rule__Feature__AnnotationsAssignment_1_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2291:1: ( rule__Feature__AnnotationsAssignment_1_2 )
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsAssignment_1_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2292:1: ( rule__Feature__AnnotationsAssignment_1_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2292:2: rule__Feature__AnnotationsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Feature__AnnotationsAssignment_1_2_in_rule__Feature__Group_1__2__Impl4579);
            rule__Feature__AnnotationsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAnnotationsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__2__Impl"


    // $ANTLR start "rule__Feature__Group_1__3"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2302:1: rule__Feature__Group_1__3 : rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4 ;
    public final void rule__Feature__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2306:1: ( rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2307:2: rule__Feature__Group_1__3__Impl rule__Feature__Group_1__4
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__3__Impl_in_rule__Feature__Group_1__34609);
            rule__Feature__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1__4_in_rule__Feature__Group_1__34612);
            rule__Feature__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__3"


    // $ANTLR start "rule__Feature__Group_1__3__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2314:1: rule__Feature__Group_1__3__Impl : ( ( rule__Feature__Group_1_3__0 )* ) ;
    public final void rule__Feature__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2318:1: ( ( ( rule__Feature__Group_1_3__0 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2319:1: ( ( rule__Feature__Group_1_3__0 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2319:1: ( ( rule__Feature__Group_1_3__0 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2320:1: ( rule__Feature__Group_1_3__0 )*
            {
             before(grammarAccess.getFeatureAccess().getGroup_1_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2321:1: ( rule__Feature__Group_1_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2321:2: rule__Feature__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Feature__Group_1_3__0_in_rule__Feature__Group_1__3__Impl4639);
            	    rule__Feature__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__3__Impl"


    // $ANTLR start "rule__Feature__Group_1__4"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2331:1: rule__Feature__Group_1__4 : rule__Feature__Group_1__4__Impl ;
    public final void rule__Feature__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2335:1: ( rule__Feature__Group_1__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2336:2: rule__Feature__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_1__4__Impl_in_rule__Feature__Group_1__44670);
            rule__Feature__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__4"


    // $ANTLR start "rule__Feature__Group_1__4__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2342:1: rule__Feature__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Feature__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2346:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2347:1: ( ']' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2347:1: ( ']' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2348:1: ']'
            {
             before(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group_1__4__Impl4698); 
             after(grammarAccess.getFeatureAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1__4__Impl"


    // $ANTLR start "rule__Feature__Group_1_3__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2371:1: rule__Feature__Group_1_3__0 : rule__Feature__Group_1_3__0__Impl rule__Feature__Group_1_3__1 ;
    public final void rule__Feature__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2375:1: ( rule__Feature__Group_1_3__0__Impl rule__Feature__Group_1_3__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2376:2: rule__Feature__Group_1_3__0__Impl rule__Feature__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_1_3__0__Impl_in_rule__Feature__Group_1_3__04739);
            rule__Feature__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_1_3__1_in_rule__Feature__Group_1_3__04742);
            rule__Feature__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1_3__0"


    // $ANTLR start "rule__Feature__Group_1_3__0__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2383:1: rule__Feature__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Feature__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2387:1: ( ( ',' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2388:1: ( ',' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2388:1: ( ',' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2389:1: ','
            {
             before(grammarAccess.getFeatureAccess().getCommaKeyword_1_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Feature__Group_1_3__0__Impl4770); 
             after(grammarAccess.getFeatureAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_1_3__1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2402:1: rule__Feature__Group_1_3__1 : rule__Feature__Group_1_3__1__Impl ;
    public final void rule__Feature__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2406:1: ( rule__Feature__Group_1_3__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2407:2: rule__Feature__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_1_3__1__Impl_in_rule__Feature__Group_1_3__14801);
            rule__Feature__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1_3__1"


    // $ANTLR start "rule__Feature__Group_1_3__1__Impl"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2413:1: rule__Feature__Group_1_3__1__Impl : ( ( rule__Feature__AnnotationsAssignment_1_3_1 ) ) ;
    public final void rule__Feature__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2417:1: ( ( ( rule__Feature__AnnotationsAssignment_1_3_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2418:1: ( ( rule__Feature__AnnotationsAssignment_1_3_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2418:1: ( ( rule__Feature__AnnotationsAssignment_1_3_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2419:1: ( rule__Feature__AnnotationsAssignment_1_3_1 )
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsAssignment_1_3_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2420:1: ( rule__Feature__AnnotationsAssignment_1_3_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2420:2: rule__Feature__AnnotationsAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Feature__AnnotationsAssignment_1_3_1_in_rule__Feature__Group_1_3__1__Impl4828);
            rule__Feature__AnnotationsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAnnotationsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_1_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2434:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2438:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2439:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04862);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04865);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2446:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2450:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2451:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2451:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2452:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2453:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2453:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4892);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2463:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2467:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2468:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14922);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14925);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2475:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2479:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2480:1: ( ':' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2480:1: ( ':' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2481:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Attribute__Group__1__Impl4953); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2494:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2498:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2499:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24984);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2505:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2509:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2510:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2510:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2511:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2512:1: ( rule__Attribute__TypeAssignment_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2512:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl5011);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2528:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2532:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2533:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05047);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05050);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2540:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2544:1: ( ( 'ref' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2545:1: ( 'ref' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2545:1: ( 'ref' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2546:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Reference__Group__0__Impl5078); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2559:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2563:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2564:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15109);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__15112);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2571:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2575:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2576:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2576:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2577:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2578:1: ( rule__Reference__NameAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2578:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl5139);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2588:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2592:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2593:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__25169);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__25172);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2600:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2604:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2605:1: ( ':' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2605:1: ( ':' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2606:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Reference__Group__2__Impl5200); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2619:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2623:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2624:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__35231);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__35234);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2631:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2635:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2636:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2636:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2637:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2638:1: ( rule__Reference__TypeAssignment_3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2638:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl5261);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2648:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2652:1: ( rule__Reference__Group__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2653:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45291);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2659:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2663:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2664:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2664:1: ( ( rule__Reference__Group_4__0 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2665:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2666:1: ( rule__Reference__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2666:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5318);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2686:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2690:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2691:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05359);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05362);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2698:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2702:1: ( ( 'opposite' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2703:1: ( 'opposite' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2703:1: ( 'opposite' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2704:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__Reference__Group_4__0__Impl5390); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2717:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2721:1: ( rule__Reference__Group_4__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2722:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15421);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2728:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2732:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2733:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2733:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2734:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2735:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2735:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5448);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2749:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2753:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2754:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05482);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05485);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2761:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2765:1: ( ( 'enumeration' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2766:1: ( 'enumeration' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2766:1: ( 'enumeration' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2767:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Enumeration__Group__0__Impl5513); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2780:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2784:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2785:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15544);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15547);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2792:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2796:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2797:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2797:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2798:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2799:1: ( rule__Enumeration__NameAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2799:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5574);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2809:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2813:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2814:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25604);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25607);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2821:1: rule__Enumeration__Group__2__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2825:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2826:1: ( '[' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2826:1: ( '[' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2827:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Enumeration__Group__2__Impl5635); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2840:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2844:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2845:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35666);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35669);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2852:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2856:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2857:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2857:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2858:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2858:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2859:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2860:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2860:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5698);
            rule__Enumeration__EnumerationLiteralsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }

            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2863:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2864:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2865:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2865:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5710);
            	    rule__Enumeration__EnumerationLiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2876:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2880:1: ( rule__Enumeration__Group__4__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2881:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45743);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2887:1: rule__Enumeration__Group__4__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2891:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2892:1: ( ']' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2892:1: ( ']' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2893:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Enumeration__Group__4__Impl5771); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2916:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2920:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2921:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05812);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05815);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2928:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2932:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2933:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2933:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2934:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2935:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2935:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5842);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2945:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2949:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2950:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15872);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15875);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2957:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2961:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2962:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2962:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2963:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2964:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2964:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5902);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2974:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2978:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2979:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25932);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2985:1: rule__EnumerationLiteral__Group__2__Impl : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2989:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2990:1: ( ';' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2990:1: ( ';' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:2991:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__EnumerationLiteral__Group__2__Impl5960); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3010:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3014:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3015:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05997);
            rule__EnumerationLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__06000);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3022:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3026:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3027:1: ( '=' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3027:1: ( '=' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3028:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumerationLiteral__Group_1__0__Impl6028); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3041:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3045:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3046:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__16059);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3052:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3056:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3057:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3057:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3058:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3059:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3059:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl6086);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3076:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3080:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3081:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06123);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06126);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3088:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3092:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3093:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3093:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3094:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3095:1: ( rule__Parameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3095:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6153);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3105:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3109:1: ( rule__Parameter__Group__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3110:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16183);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3116:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3120:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3121:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3121:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3122:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3123:1: ( rule__Parameter__TypeAssignment_1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3123:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl6210);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3137:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3141:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3142:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__06244);
            rule__TypeRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__06247);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3149:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3153:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3154:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3154:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3155:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3156:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3156:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6274);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3166:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3170:1: ( rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3171:2: rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16304);
            rule__TypeRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16307);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3178:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3182:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3183:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3183:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3184:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3185:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3185:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6334);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3195:1: rule__TypeRef__Group__2 : rule__TypeRef__Group__2__Impl ;
    public final void rule__TypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3199:1: ( rule__TypeRef__Group__2__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3200:2: rule__TypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26365);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3206:1: rule__TypeRef__Group__2__Impl : ( ( rule__TypeRef__OptionAssignment_2 )? ) ;
    public final void rule__TypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3210:1: ( ( ( rule__TypeRef__OptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3211:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3211:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3212:1: ( rule__TypeRef__OptionAssignment_2 )?
            {
             before(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3213:1: ( rule__TypeRef__OptionAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3213:2: rule__TypeRef__OptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6392);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3229:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3233:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3234:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06429);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06432);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3241:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3245:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3246:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3246:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3247:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6459);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3258:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3262:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3263:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16488);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3269:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3273:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3274:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3274:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3275:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3276:1: ( '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3277:2: '.*'
                    {
                    match(input,32,FOLLOW_32_in_rule__QualifiedNameWithWildCard__Group__1__Impl6517); 

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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3292:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3296:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3297:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06554);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06557);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3304:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3308:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3309:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3309:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3310:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6584); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3321:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3325:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3326:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16613);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3332:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3336:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3337:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3337:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3338:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3339:1: ( rule__QualifiedName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3339:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6640);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3353:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3357:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3358:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06675);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06678);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3365:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3369:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3370:1: ( '.' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3370:1: ( '.' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3371:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl6706); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3384:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3388:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3389:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16737);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3395:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3399:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3400:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3400:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3401:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6764); 
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


    // $ANTLR start "rule__Annotation__Group__0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3418:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3422:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3423:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__06799);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__06802);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3430:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3434:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3435:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3435:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3436:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3437:1: ( rule__Annotation__KeyAssignment_0 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3437:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl6829);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3447:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3451:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3452:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__16859);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__16862);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3459:1: rule__Annotation__Group__1__Impl : ( ':' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3463:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3464:1: ( ':' )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3464:1: ( ':' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3465:1: ':'
            {
             before(grammarAccess.getAnnotationAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Annotation__Group__1__Impl6890); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3478:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3482:1: ( rule__Annotation__Group__2__Impl )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3483:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__26921);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3489:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3493:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3494:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3494:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3495:1: ( rule__Annotation__ValueAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3496:1: ( rule__Annotation__ValueAssignment_2 )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3496:2: rule__Annotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl6948);
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


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3513:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3517:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3518:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3518:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3519:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment6989);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3528:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3532:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3533:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3533:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3534:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17020);
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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3543:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3547:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3548:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3548:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3549:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_17051);
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


    // $ANTLR start "rule__PackageDeclaration__AnnotationsAssignment_2_2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3558:1: rule__PackageDeclaration__AnnotationsAssignment_2_2 : ( ruleAnnotation ) ;
    public final void rule__PackageDeclaration__AnnotationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3562:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3563:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3563:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3564:1: ruleAnnotation
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__PackageDeclaration__AnnotationsAssignment_2_27082);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__AnnotationsAssignment_2_2"


    // $ANTLR start "rule__PackageDeclaration__AnnotationsAssignment_2_3_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3573:1: rule__PackageDeclaration__AnnotationsAssignment_2_3_1 : ( ruleAnnotation ) ;
    public final void rule__PackageDeclaration__AnnotationsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3577:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3578:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3578:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3579:1: ruleAnnotation
            {
             before(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__PackageDeclaration__AnnotationsAssignment_2_3_17113);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__AnnotationsAssignment_2_3_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_4"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3588:1: rule__PackageDeclaration__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3592:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3593:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3593:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3594:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_47144);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_4"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3603:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3607:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3608:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3608:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3609:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_17175); 
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


    // $ANTLR start "rule__DataType__AnnotationsAssignment_2_2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3618:1: rule__DataType__AnnotationsAssignment_2_2 : ( ruleAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3622:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3623:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3623:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3624:1: ruleAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DataType__AnnotationsAssignment_2_27206);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__AnnotationsAssignment_2_2"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_2_3_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3633:1: rule__DataType__AnnotationsAssignment_2_3_1 : ( ruleAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3637:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3638:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3638:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3639:1: ruleAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DataType__AnnotationsAssignment_2_3_17237);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsAnnotationParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__AnnotationsAssignment_2_3_1"


    // $ANTLR start "rule__DataType__DescriptionAssignment_3"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3648:1: rule__DataType__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DataType__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3652:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3653:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3653:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3654:1: RULE_STRING
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_37268); 
             after(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__DescriptionAssignment_3"


    // $ANTLR start "rule__Entity__EntityTypeAssignment_0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3663:1: rule__Entity__EntityTypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__Entity__EntityTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3667:1: ( ( ruleEntityType ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3668:1: ( ruleEntityType )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3668:1: ( ruleEntityType )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3669:1: ruleEntityType
            {
             before(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_07299);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3678:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3682:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3683:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3683:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3684:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_27330); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3693:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3697:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3698:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3698:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3699:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3700:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3701:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_17365);
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


    // $ANTLR start "rule__Entity__AnnotationsAssignment_4_2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3712:1: rule__Entity__AnnotationsAssignment_4_2 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3716:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3717:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3717:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3718:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_4_27400);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_4_2"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_4_3_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3727:1: rule__Entity__AnnotationsAssignment_4_3_1 : ( ruleAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3731:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3732:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3732:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3733:1: ruleAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_4_3_17431);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsAnnotationParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_4_3_1"


    // $ANTLR start "rule__Entity__DescriptionAssignment_5"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3742:1: rule__Entity__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3746:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3747:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3747:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3748:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_57462); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3757:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3761:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3762:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3762:1: ( ruleFeature )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3763:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_77493);
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


    // $ANTLR start "rule__Feature__AnnotationsAssignment_1_2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3772:1: rule__Feature__AnnotationsAssignment_1_2 : ( ruleAnnotation ) ;
    public final void rule__Feature__AnnotationsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3776:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3777:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3777:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3778:1: ruleAnnotation
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Feature__AnnotationsAssignment_1_27524);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AnnotationsAssignment_1_2"


    // $ANTLR start "rule__Feature__AnnotationsAssignment_1_3_1"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3787:1: rule__Feature__AnnotationsAssignment_1_3_1 : ( ruleAnnotation ) ;
    public final void rule__Feature__AnnotationsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3791:1: ( ( ruleAnnotation ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3792:1: ( ruleAnnotation )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3792:1: ( ruleAnnotation )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3793:1: ruleAnnotation
            {
             before(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Feature__AnnotationsAssignment_1_3_17555);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAnnotationsAnnotationParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AnnotationsAssignment_1_3_1"


    // $ANTLR start "rule__Feature__DescriptionAssignment_2"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3802:1: rule__Feature__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3806:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3807:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3807:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3808:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_27586); 
             after(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__DescriptionAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3817:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3821:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3822:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3822:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3823:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_07617); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3832:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3836:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3837:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3837:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3838:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_27648);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3847:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3851:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3852:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3852:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3853:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_17679); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3862:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3866:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3867:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3867:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3868:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_37710);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3877:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3881:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3882:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3882:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3883:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3884:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3885:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_17745); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3896:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3900:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3901:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3901:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3902:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_17780); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3911:1: rule__Enumeration__EnumerationLiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3915:1: ( ( ruleEnumerationLiteral ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3916:1: ( ruleEnumerationLiteral )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3916:1: ( ruleEnumerationLiteral )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3917:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_37811);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3926:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3930:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3931:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3931:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3932:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_07842); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3941:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3945:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3946:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3946:1: ( RULE_INT )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3947:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_17873); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3961:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3965:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3966:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3966:1: ( RULE_ID )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3967:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_07909); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3976:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3980:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3981:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3981:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3982:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_17940);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3991:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3995:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3996:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3996:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3997:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3998:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:3999:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_07975);
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4010:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4014:1: ( ( ( '*' ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4015:1: ( ( '*' ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4015:1: ( ( '*' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4016:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4017:1: ( '*' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4018:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TypeRef__MultiAssignment_18015); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4033:1: rule__TypeRef__OptionAssignment_2 : ( ( '?' ) ) ;
    public final void rule__TypeRef__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4037:1: ( ( ( '?' ) ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4038:1: ( ( '?' ) )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4038:1: ( ( '?' ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4039:1: ( '?' )
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4040:1: ( '?' )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4041:1: '?'
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__TypeRef__OptionAssignment_28059); 
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


    // $ANTLR start "rule__Annotation__KeyAssignment_0"
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4058:1: rule__Annotation__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4062:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4063:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4063:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4064:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__KeyAssignment_08100); 
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
    // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4073:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4077:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4078:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4078:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.om.ui/src-gen/fr/chaunier/xtext/om/ui/contentassist/antlr/internal/InternalOmDsl.g:4079:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_28131); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000021818802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntityType1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Visibility__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Visibility__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Visibility__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PackageDeclaration__Group__0__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11677 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__21737 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__21740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__31798 = new BitSet(new long[]{0x0000000021858800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__31801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__3__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__41860 = new BitSet(new long[]{0x0000000021858800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__41863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_4_in_rule__PackageDeclaration__Group__4__Impl1890 = new BitSet(new long[]{0x0000000021818802L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__51921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageDeclaration__Group__5__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__01992 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__01995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclaration__Group_2__0__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12054 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__2_in_rule__PackageDeclaration__Group_2__12057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDeclaration__Group_2__1__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__2__Impl_in_rule__PackageDeclaration__Group_2__22116 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__3_in_rule__PackageDeclaration__Group_2__22119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__AnnotationsAssignment_2_2_in_rule__PackageDeclaration__Group_2__2__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__3__Impl_in_rule__PackageDeclaration__Group_2__32176 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__4_in_rule__PackageDeclaration__Group_2__32179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2_3__0_in_rule__PackageDeclaration__Group_2__3__Impl2206 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__4__Impl_in_rule__PackageDeclaration__Group_2__42237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group_2__4__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2_3__0__Impl_in_rule__PackageDeclaration__Group_2_3__02306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2_3__1_in_rule__PackageDeclaration__Group_2_3__02309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group_2_3__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2_3__1__Impl_in_rule__PackageDeclaration__Group_2_3__12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__AnnotationsAssignment_2_3_1_in_rule__PackageDeclaration__Group_2_3__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Group__0__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12491 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__22551 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__22554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__0_in_rule__DataType__Group__2__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__32612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__DescriptionAssignment_3_in_rule__DataType__Group__3__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__0__Impl_in_rule__DataType__Group_2__02678 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__1_in_rule__DataType__Group_2__02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Group_2__0__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__1__Impl_in_rule__DataType__Group_2__12740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__2_in_rule__DataType__Group_2__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Group_2__1__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__2__Impl_in_rule__DataType__Group_2__22802 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__3_in_rule__DataType__Group_2__22805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_2_2_in_rule__DataType__Group_2__2__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__3__Impl_in_rule__DataType__Group_2__32862 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__4_in_rule__DataType__Group_2__32865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2_3__0_in_rule__DataType__Group_2__3__Impl2892 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2__4__Impl_in_rule__DataType__Group_2__42923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Group_2__4__Impl2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2_3__0__Impl_in_rule__DataType__Group_2_3__02992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataType__Group_2_3__1_in_rule__DataType__Group_2_3__02995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Group_2_3__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group_2_3__1__Impl_in_rule__DataType__Group_2_3__13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_2_3_1_in_rule__DataType__Group_2_3__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03115 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23238 = new BitSet(new long[]{0x00000000020A0020L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33298 = new BitSet(new long[]{0x00000000020A0020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43359 = new BitSet(new long[]{0x00000000020A0020L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53420 = new BitSet(new long[]{0x00000000020A0020L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_5_in_rule__Entity__Group__5__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63481 = new BitSet(new long[]{0x0000000008040010L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__63484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__6__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__73543 = new BitSet(new long[]{0x0000000008040010L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__73546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl3573 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__83604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__03681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Entity__Group_3__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__03804 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_4__0__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__13866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__13869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group_4__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__23928 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__3_in_rule__Entity__Group_4__23931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_4_2_in_rule__Entity__Group_4__2__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__3__Impl_in_rule__Entity__Group_4__33988 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__4_in_rule__Entity__Group_4__33991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4_3__0_in_rule__Entity__Group_4__3__Impl4018 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4__4__Impl_in_rule__Entity__Group_4__44049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_4__4__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4_3__0__Impl_in_rule__Entity__Group_4_3__04118 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_4_3__1_in_rule__Entity__Group_4_3__04121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_4_3__0__Impl4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_4_3__1__Impl_in_rule__Entity__Group_4_3__14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_4_3_1_in_rule__Entity__Group_4_3__1__Impl4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04241 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14300 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0_in_rule__Feature__Group__1__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__0__Impl_in_rule__Feature__Group_1__04425 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1_in_rule__Feature__Group_1__04428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Feature__Group_1__0__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__1__Impl_in_rule__Feature__Group_1__14487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__2_in_rule__Feature__Group_1__14490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Feature__Group_1__1__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__2__Impl_in_rule__Feature__Group_1__24549 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__3_in_rule__Feature__Group_1__24552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__AnnotationsAssignment_1_2_in_rule__Feature__Group_1__2__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__3__Impl_in_rule__Feature__Group_1__34609 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__4_in_rule__Feature__Group_1__34612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1_3__0_in_rule__Feature__Group_1__3__Impl4639 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1__4__Impl_in_rule__Feature__Group_1__44670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group_1__4__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1_3__0__Impl_in_rule__Feature__Group_1_3__04739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Feature__Group_1_3__1_in_rule__Feature__Group_1_3__04742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Feature__Group_1_3__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_1_3__1__Impl_in_rule__Feature__Group_1_3__14801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__AnnotationsAssignment_1_3_1_in_rule__Feature__Group_1_3__1__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04862 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Attribute__Group__1__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl5011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__05047 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__05050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Reference__Group__0__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__15109 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__25169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__25172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Reference__Group__2__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__35231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__35234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Reference__Group_4__0__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Enumeration__Group__0__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Enumeration__Group__2__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5698 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5710 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__4__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05812 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15872 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumerationLiteral__Group__2__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__06000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumerationLiteral__Group_1__0__Impl6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__16059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__06123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__06126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__16183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__06244 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__06247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16304 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06429 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedNameWithWildCard__Group__1__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06554 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6640 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__06799 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__06802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__16859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__16862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Annotation__Group__1__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__26921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_17020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_17051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__PackageDeclaration__AnnotationsAssignment_2_27082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__PackageDeclaration__AnnotationsAssignment_2_3_17113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_47144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DataType__AnnotationsAssignment_2_27206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DataType__AnnotationsAssignment_2_3_17237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_37268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_07299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_27330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_17365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_4_27400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Entity__AnnotationsAssignment_4_3_17431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_57462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_77493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Feature__AnnotationsAssignment_1_27524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Feature__AnnotationsAssignment_1_3_17555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_27586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_07617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_27648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_17679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_37710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_17745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_17780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_37811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_07842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_17873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_07909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_17940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_07975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeRef__MultiAssignment_18015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TypeRef__OptionAssignment_28059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__KeyAssignment_08100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_28131 = new BitSet(new long[]{0x0000000000000002L});

}