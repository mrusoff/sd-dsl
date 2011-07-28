package fr.chaunier.xtext.constraint.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.constraint.services.CstDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCstDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DTD'", "'FLAT'", "'DB'", "'as String'", "'as Value'", "'CSV'", "'delimiter'", "'line'", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'prefix'", "'namespace'", "'datatype'", "'entity'", "'regexp'", "'enum'", "'fixeLen'", "'minVal'", "'maxVal'", "'minLen'", "'maxLen'", "'paddle'", "'XSD'", "'boolean'", "'string'", "'datetime'", "'default'", "'decimal'", "'fixed'", "'id'", "'nullable'", "'derived'", "'writable'", "'xsdA.'"
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
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
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
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalCstDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCstDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCstDslParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g"; }


     
     	private CstDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CstDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainModelConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:61:1: entryRuleDomainModelConstraint : ruleDomainModelConstraint EOF ;
    public final void entryRuleDomainModelConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:62:1: ( ruleDomainModelConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:63:1: ruleDomainModelConstraint EOF
            {
             before(grammarAccess.getDomainModelConstraintRule()); 
            pushFollow(FOLLOW_ruleDomainModelConstraint_in_entryRuleDomainModelConstraint61);
            ruleDomainModelConstraint();

            state._fsp--;

             after(grammarAccess.getDomainModelConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModelConstraint68); 

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
    // $ANTLR end "entryRuleDomainModelConstraint"


    // $ANTLR start "ruleDomainModelConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:70:1: ruleDomainModelConstraint : ( ( rule__DomainModelConstraint__Group__0 ) ) ;
    public final void ruleDomainModelConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:74:2: ( ( ( rule__DomainModelConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:75:1: ( ( rule__DomainModelConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:75:1: ( ( rule__DomainModelConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:76:1: ( rule__DomainModelConstraint__Group__0 )
            {
             before(grammarAccess.getDomainModelConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:77:1: ( rule__DomainModelConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:77:2: rule__DomainModelConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DomainModelConstraint__Group__0_in_ruleDomainModelConstraint94);
            rule__DomainModelConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModelConstraint"


    // $ANTLR start "entryRuleFileSpecification"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:91:1: entryRuleFileSpecification : ruleFileSpecification EOF ;
    public final void entryRuleFileSpecification() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:92:1: ( ruleFileSpecification EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:93:1: ruleFileSpecification EOF
            {
             before(grammarAccess.getFileSpecificationRule()); 
            pushFollow(FOLLOW_ruleFileSpecification_in_entryRuleFileSpecification123);
            ruleFileSpecification();

            state._fsp--;

             after(grammarAccess.getFileSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileSpecification130); 

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
    // $ANTLR end "entryRuleFileSpecification"


    // $ANTLR start "ruleFileSpecification"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:100:1: ruleFileSpecification : ( ( rule__FileSpecification__Alternatives ) ) ;
    public final void ruleFileSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:104:2: ( ( ( rule__FileSpecification__Alternatives ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:105:1: ( ( rule__FileSpecification__Alternatives ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:105:1: ( ( rule__FileSpecification__Alternatives ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:106:1: ( rule__FileSpecification__Alternatives )
            {
             before(grammarAccess.getFileSpecificationAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:107:1: ( rule__FileSpecification__Alternatives )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:107:2: rule__FileSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__FileSpecification__Alternatives_in_ruleFileSpecification156);
            rule__FileSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileSpecification"


    // $ANTLR start "entryRuleFreeSpecification"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:119:1: entryRuleFreeSpecification : ruleFreeSpecification EOF ;
    public final void entryRuleFreeSpecification() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:120:1: ( ruleFreeSpecification EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:121:1: ruleFreeSpecification EOF
            {
             before(grammarAccess.getFreeSpecificationRule()); 
            pushFollow(FOLLOW_ruleFreeSpecification_in_entryRuleFreeSpecification183);
            ruleFreeSpecification();

            state._fsp--;

             after(grammarAccess.getFreeSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeSpecification190); 

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
    // $ANTLR end "entryRuleFreeSpecification"


    // $ANTLR start "ruleFreeSpecification"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:128:1: ruleFreeSpecification : ( ( rule__FreeSpecification__Group__0 ) ) ;
    public final void ruleFreeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:132:2: ( ( ( rule__FreeSpecification__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:133:1: ( ( rule__FreeSpecification__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:133:1: ( ( rule__FreeSpecification__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:134:1: ( rule__FreeSpecification__Group__0 )
            {
             before(grammarAccess.getFreeSpecificationAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:135:1: ( rule__FreeSpecification__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:135:2: rule__FreeSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__FreeSpecification__Group__0_in_ruleFreeSpecification216);
            rule__FreeSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreeSpecification"


    // $ANTLR start "entryRuleAbstractElementConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:147:1: entryRuleAbstractElementConstraint : ruleAbstractElementConstraint EOF ;
    public final void entryRuleAbstractElementConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:148:1: ( ruleAbstractElementConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:149:1: ruleAbstractElementConstraint EOF
            {
             before(grammarAccess.getAbstractElementConstraintRule()); 
            pushFollow(FOLLOW_ruleAbstractElementConstraint_in_entryRuleAbstractElementConstraint243);
            ruleAbstractElementConstraint();

            state._fsp--;

             after(grammarAccess.getAbstractElementConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElementConstraint250); 

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
    // $ANTLR end "entryRuleAbstractElementConstraint"


    // $ANTLR start "ruleAbstractElementConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:156:1: ruleAbstractElementConstraint : ( ( rule__AbstractElementConstraint__Alternatives ) ) ;
    public final void ruleAbstractElementConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:160:2: ( ( ( rule__AbstractElementConstraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:161:1: ( ( rule__AbstractElementConstraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:161:1: ( ( rule__AbstractElementConstraint__Alternatives ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:162:1: ( rule__AbstractElementConstraint__Alternatives )
            {
             before(grammarAccess.getAbstractElementConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:163:1: ( rule__AbstractElementConstraint__Alternatives )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:163:2: rule__AbstractElementConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElementConstraint__Alternatives_in_ruleAbstractElementConstraint276);
            rule__AbstractElementConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElementConstraint"


    // $ANTLR start "entryRuleImport"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:175:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:176:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:177:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport303);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport310); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:184:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:188:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:189:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:189:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:190:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:191:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:191:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport336);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:203:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:204:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:205:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard363);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard370); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:212:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:216:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:217:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:217:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:218:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:219:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:219:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard396);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:231:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:232:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:233:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName423);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName430); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:240:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:244:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:245:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:245:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:246:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:247:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:247:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName456);
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


    // $ANTLR start "entryRulePackageConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:259:1: entryRulePackageConstraint : rulePackageConstraint EOF ;
    public final void entryRulePackageConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:260:1: ( rulePackageConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:261:1: rulePackageConstraint EOF
            {
             before(grammarAccess.getPackageConstraintRule()); 
            pushFollow(FOLLOW_rulePackageConstraint_in_entryRulePackageConstraint483);
            rulePackageConstraint();

            state._fsp--;

             after(grammarAccess.getPackageConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageConstraint490); 

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
    // $ANTLR end "entryRulePackageConstraint"


    // $ANTLR start "rulePackageConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:268:1: rulePackageConstraint : ( ( rule__PackageConstraint__Group__0 ) ) ;
    public final void rulePackageConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:272:2: ( ( ( rule__PackageConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:273:1: ( ( rule__PackageConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:273:1: ( ( rule__PackageConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:274:1: ( rule__PackageConstraint__Group__0 )
            {
             before(grammarAccess.getPackageConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:275:1: ( rule__PackageConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:275:2: rule__PackageConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__0_in_rulePackageConstraint516);
            rule__PackageConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageConstraint"


    // $ANTLR start "entryRuleTypeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:287:1: entryRuleTypeConstraint : ruleTypeConstraint EOF ;
    public final void entryRuleTypeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:288:1: ( ruleTypeConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:289:1: ruleTypeConstraint EOF
            {
             before(grammarAccess.getTypeConstraintRule()); 
            pushFollow(FOLLOW_ruleTypeConstraint_in_entryRuleTypeConstraint543);
            ruleTypeConstraint();

            state._fsp--;

             after(grammarAccess.getTypeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeConstraint550); 

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
    // $ANTLR end "entryRuleTypeConstraint"


    // $ANTLR start "ruleTypeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:296:1: ruleTypeConstraint : ( ( rule__TypeConstraint__Alternatives ) ) ;
    public final void ruleTypeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:300:2: ( ( ( rule__TypeConstraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:301:1: ( ( rule__TypeConstraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:301:1: ( ( rule__TypeConstraint__Alternatives ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:302:1: ( rule__TypeConstraint__Alternatives )
            {
             before(grammarAccess.getTypeConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:303:1: ( rule__TypeConstraint__Alternatives )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:303:2: rule__TypeConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeConstraint__Alternatives_in_ruleTypeConstraint576);
            rule__TypeConstraint__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeConstraintAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeConstraint"


    // $ANTLR start "entryRuleDataTypeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:315:1: entryRuleDataTypeConstraint : ruleDataTypeConstraint EOF ;
    public final void entryRuleDataTypeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:316:1: ( ruleDataTypeConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:317:1: ruleDataTypeConstraint EOF
            {
             before(grammarAccess.getDataTypeConstraintRule()); 
            pushFollow(FOLLOW_ruleDataTypeConstraint_in_entryRuleDataTypeConstraint603);
            ruleDataTypeConstraint();

            state._fsp--;

             after(grammarAccess.getDataTypeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeConstraint610); 

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
    // $ANTLR end "entryRuleDataTypeConstraint"


    // $ANTLR start "ruleDataTypeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:324:1: ruleDataTypeConstraint : ( ( rule__DataTypeConstraint__Group__0 ) ) ;
    public final void ruleDataTypeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:328:2: ( ( ( rule__DataTypeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:329:1: ( ( rule__DataTypeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:329:1: ( ( rule__DataTypeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:330:1: ( rule__DataTypeConstraint__Group__0 )
            {
             before(grammarAccess.getDataTypeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:331:1: ( rule__DataTypeConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:331:2: rule__DataTypeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__0_in_ruleDataTypeConstraint636);
            rule__DataTypeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeConstraint"


    // $ANTLR start "entryRuleEntityConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:343:1: entryRuleEntityConstraint : ruleEntityConstraint EOF ;
    public final void entryRuleEntityConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:344:1: ( ruleEntityConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:345:1: ruleEntityConstraint EOF
            {
             before(grammarAccess.getEntityConstraintRule()); 
            pushFollow(FOLLOW_ruleEntityConstraint_in_entryRuleEntityConstraint663);
            ruleEntityConstraint();

            state._fsp--;

             after(grammarAccess.getEntityConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConstraint670); 

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
    // $ANTLR end "entryRuleEntityConstraint"


    // $ANTLR start "ruleEntityConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:352:1: ruleEntityConstraint : ( ( rule__EntityConstraint__Group__0 ) ) ;
    public final void ruleEntityConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:356:2: ( ( ( rule__EntityConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:357:1: ( ( rule__EntityConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:357:1: ( ( rule__EntityConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:358:1: ( rule__EntityConstraint__Group__0 )
            {
             before(grammarAccess.getEntityConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:359:1: ( rule__EntityConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:359:2: rule__EntityConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__0_in_ruleEntityConstraint696);
            rule__EntityConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityConstraint"


    // $ANTLR start "entryRuleFeatureConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:371:1: entryRuleFeatureConstraint : ruleFeatureConstraint EOF ;
    public final void entryRuleFeatureConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:372:1: ( ruleFeatureConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:373:1: ruleFeatureConstraint EOF
            {
             before(grammarAccess.getFeatureConstraintRule()); 
            pushFollow(FOLLOW_ruleFeatureConstraint_in_entryRuleFeatureConstraint723);
            ruleFeatureConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureConstraint730); 

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
    // $ANTLR end "entryRuleFeatureConstraint"


    // $ANTLR start "ruleFeatureConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:380:1: ruleFeatureConstraint : ( ( rule__FeatureConstraint__Group__0 ) ) ;
    public final void ruleFeatureConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:384:2: ( ( ( rule__FeatureConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:385:1: ( ( rule__FeatureConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:385:1: ( ( rule__FeatureConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:386:1: ( rule__FeatureConstraint__Group__0 )
            {
             before(grammarAccess.getFeatureConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:387:1: ( rule__FeatureConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:387:2: rule__FeatureConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureConstraint__Group__0_in_ruleFeatureConstraint756);
            rule__FeatureConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureConstraint"


    // $ANTLR start "entryRuleAttributeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:399:1: entryRuleAttributeConstraint : ruleAttributeConstraint EOF ;
    public final void entryRuleAttributeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:400:1: ( ruleAttributeConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:401:1: ruleAttributeConstraint EOF
            {
             before(grammarAccess.getAttributeConstraintRule()); 
            pushFollow(FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint783);
            ruleAttributeConstraint();

            state._fsp--;

             after(grammarAccess.getAttributeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeConstraint790); 

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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:408:1: ruleAttributeConstraint : ( ( rule__AttributeConstraint__AttributeAssignment ) ) ;
    public final void ruleAttributeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:412:2: ( ( ( rule__AttributeConstraint__AttributeAssignment ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:413:1: ( ( rule__AttributeConstraint__AttributeAssignment ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:413:1: ( ( rule__AttributeConstraint__AttributeAssignment ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:414:1: ( rule__AttributeConstraint__AttributeAssignment )
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:415:1: ( rule__AttributeConstraint__AttributeAssignment )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:415:2: rule__AttributeConstraint__AttributeAssignment
            {
            pushFollow(FOLLOW_rule__AttributeConstraint__AttributeAssignment_in_ruleAttributeConstraint816);
            rule__AttributeConstraint__AttributeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleConstraint"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:427:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:428:1: ( ruleConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:429:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint843);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint850); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:436:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:440:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:441:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:441:1: ( ( rule__Constraint__Alternatives ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:442:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:443:1: ( rule__Constraint__Alternatives )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:443:2: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint876);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:455:1: entryRuleBoolConstraint : ruleBoolConstraint EOF ;
    public final void entryRuleBoolConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:456:1: ( ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:457:1: ruleBoolConstraint EOF
            {
             before(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint903);
            ruleBoolConstraint();

            state._fsp--;

             after(grammarAccess.getBoolConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint910); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:464:1: ruleBoolConstraint : ( ( rule__BoolConstraint__ConstraintAssignment ) ) ;
    public final void ruleBoolConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:468:2: ( ( ( rule__BoolConstraint__ConstraintAssignment ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:469:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:469:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:470:1: ( rule__BoolConstraint__ConstraintAssignment )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintAssignment()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:471:1: ( rule__BoolConstraint__ConstraintAssignment )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:471:2: rule__BoolConstraint__ConstraintAssignment
            {
            pushFollow(FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint936);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:483:1: entryRuleStringConstraint : ruleStringConstraint EOF ;
    public final void entryRuleStringConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:484:1: ( ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:485:1: ruleStringConstraint EOF
            {
             before(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint963);
            ruleStringConstraint();

            state._fsp--;

             after(grammarAccess.getStringConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint970); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:492:1: ruleStringConstraint : ( ( rule__StringConstraint__Group__0 ) ) ;
    public final void ruleStringConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:496:2: ( ( ( rule__StringConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:497:1: ( ( rule__StringConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:497:1: ( ( rule__StringConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:498:1: ( rule__StringConstraint__Group__0 )
            {
             before(grammarAccess.getStringConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:499:1: ( rule__StringConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:499:2: rule__StringConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint996);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:511:1: entryRuleDateTimeConstraint : ruleDateTimeConstraint EOF ;
    public final void entryRuleDateTimeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:512:1: ( ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:513:1: ruleDateTimeConstraint EOF
            {
             before(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1023);
            ruleDateTimeConstraint();

            state._fsp--;

             after(grammarAccess.getDateTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint1030); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:520:1: ruleDateTimeConstraint : ( ( rule__DateTimeConstraint__Group__0 ) ) ;
    public final void ruleDateTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:524:2: ( ( ( rule__DateTimeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:525:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:525:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:526:1: ( rule__DateTimeConstraint__Group__0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:527:1: ( rule__DateTimeConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:527:2: rule__DateTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1056);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:539:1: entryRuleDecimalConstraint : ruleDecimalConstraint EOF ;
    public final void entryRuleDecimalConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:540:1: ( ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:541:1: ruleDecimalConstraint EOF
            {
             before(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1083);
            ruleDecimalConstraint();

            state._fsp--;

             after(grammarAccess.getDecimalConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint1090); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:548:1: ruleDecimalConstraint : ( ( rule__DecimalConstraint__Group__0 ) ) ;
    public final void ruleDecimalConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:552:2: ( ( ( rule__DecimalConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:553:1: ( ( rule__DecimalConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:553:1: ( ( rule__DecimalConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:554:1: ( rule__DecimalConstraint__Group__0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:555:1: ( rule__DecimalConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:555:2: rule__DecimalConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1116);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:567:1: entryRuleEnumerationConstraint : ruleEnumerationConstraint EOF ;
    public final void entryRuleEnumerationConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:568:1: ( ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:569:1: ruleEnumerationConstraint EOF
            {
             before(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1143);
            ruleEnumerationConstraint();

            state._fsp--;

             after(grammarAccess.getEnumerationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint1150); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:576:1: ruleEnumerationConstraint : ( ( rule__EnumerationConstraint__Group__0 ) ) ;
    public final void ruleEnumerationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:580:2: ( ( ( rule__EnumerationConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:581:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:581:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:582:1: ( rule__EnumerationConstraint__Group__0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:583:1: ( rule__EnumerationConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:583:2: rule__EnumerationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1176);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:595:1: entryRuleNumberConstraint : ruleNumberConstraint EOF ;
    public final void entryRuleNumberConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:596:1: ( ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:597:1: ruleNumberConstraint EOF
            {
             before(grammarAccess.getNumberConstraintRule()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1203);
            ruleNumberConstraint();

            state._fsp--;

             after(grammarAccess.getNumberConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint1210); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:604:1: ruleNumberConstraint : ( ( rule__NumberConstraint__Group__0 ) ) ;
    public final void ruleNumberConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:608:2: ( ( ( rule__NumberConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:609:1: ( ( rule__NumberConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:609:1: ( ( rule__NumberConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:610:1: ( rule__NumberConstraint__Group__0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:611:1: ( rule__NumberConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:611:2: rule__NumberConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1236);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:623:1: entryRuleAllConstraint : ruleAllConstraint EOF ;
    public final void entryRuleAllConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:624:1: ( ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:625:1: ruleAllConstraint EOF
            {
             before(grammarAccess.getAllConstraintRule()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1263);
            ruleAllConstraint();

            state._fsp--;

             after(grammarAccess.getAllConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint1270); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:632:1: ruleAllConstraint : ( ( rule__AllConstraint__Group__0 ) ) ;
    public final void ruleAllConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:636:2: ( ( ( rule__AllConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:637:1: ( ( rule__AllConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:637:1: ( ( rule__AllConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:638:1: ( rule__AllConstraint__Group__0 )
            {
             before(grammarAccess.getAllConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:639:1: ( rule__AllConstraint__Group__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:639:2: rule__AllConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1296);
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


    // $ANTLR start "ruleEnumUsage"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:652:1: ruleEnumUsage : ( ( rule__EnumUsage__Alternatives ) ) ;
    public final void ruleEnumUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:656:1: ( ( ( rule__EnumUsage__Alternatives ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:657:1: ( ( rule__EnumUsage__Alternatives ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:657:1: ( ( rule__EnumUsage__Alternatives ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:658:1: ( rule__EnumUsage__Alternatives )
            {
             before(grammarAccess.getEnumUsageAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:659:1: ( rule__EnumUsage__Alternatives )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:659:2: rule__EnumUsage__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1333);
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


    // $ANTLR start "rule__FileSpecification__Alternatives"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:671:1: rule__FileSpecification__Alternatives : ( ( ( rule__FileSpecification__FormatAssignment_0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( ( rule__FileSpecification__Group_3__0 ) ) | ( 'DB' ) );
    public final void rule__FileSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:675:1: ( ( ( rule__FileSpecification__FormatAssignment_0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( ( rule__FileSpecification__Group_3__0 ) ) | ( 'DB' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            case 13:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:676:1: ( ( rule__FileSpecification__FormatAssignment_0 ) )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:676:1: ( ( rule__FileSpecification__FormatAssignment_0 ) )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:677:1: ( rule__FileSpecification__FormatAssignment_0 )
                    {
                     before(grammarAccess.getFileSpecificationAccess().getFormatAssignment_0()); 
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:678:1: ( rule__FileSpecification__FormatAssignment_0 )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:678:2: rule__FileSpecification__FormatAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FileSpecification__FormatAssignment_0_in_rule__FileSpecification__Alternatives1369);
                    rule__FileSpecification__FormatAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFileSpecificationAccess().getFormatAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:682:6: ( 'DTD' )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:682:6: ( 'DTD' )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:683:1: 'DTD'
                    {
                     before(grammarAccess.getFileSpecificationAccess().getDTDKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__FileSpecification__Alternatives1388); 
                     after(grammarAccess.getFileSpecificationAccess().getDTDKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:690:6: ( 'FLAT' )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:690:6: ( 'FLAT' )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:691:1: 'FLAT'
                    {
                     before(grammarAccess.getFileSpecificationAccess().getFLATKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__FileSpecification__Alternatives1408); 
                     after(grammarAccess.getFileSpecificationAccess().getFLATKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:698:6: ( ( rule__FileSpecification__Group_3__0 ) )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:698:6: ( ( rule__FileSpecification__Group_3__0 ) )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:699:1: ( rule__FileSpecification__Group_3__0 )
                    {
                     before(grammarAccess.getFileSpecificationAccess().getGroup_3()); 
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:700:1: ( rule__FileSpecification__Group_3__0 )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:700:2: rule__FileSpecification__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FileSpecification__Group_3__0_in_rule__FileSpecification__Alternatives1427);
                    rule__FileSpecification__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFileSpecificationAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:704:6: ( 'DB' )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:704:6: ( 'DB' )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:705:1: 'DB'
                    {
                     before(grammarAccess.getFileSpecificationAccess().getDBKeyword_4()); 
                    match(input,13,FOLLOW_13_in_rule__FileSpecification__Alternatives1446); 
                     after(grammarAccess.getFileSpecificationAccess().getDBKeyword_4()); 

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
    // $ANTLR end "rule__FileSpecification__Alternatives"


    // $ANTLR start "rule__AbstractElementConstraint__Alternatives"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:717:1: rule__AbstractElementConstraint__Alternatives : ( ( rulePackageConstraint ) | ( ruleDataTypeConstraint ) | ( ruleEntityConstraint ) );
    public final void rule__AbstractElementConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:721:1: ( ( rulePackageConstraint ) | ( ruleDataTypeConstraint ) | ( ruleEntityConstraint ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
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
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:722:1: ( rulePackageConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:722:1: ( rulePackageConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:723:1: rulePackageConstraint
                    {
                     before(grammarAccess.getAbstractElementConstraintAccess().getPackageConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageConstraint_in_rule__AbstractElementConstraint__Alternatives1480);
                    rulePackageConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementConstraintAccess().getPackageConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:728:6: ( ruleDataTypeConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:728:6: ( ruleDataTypeConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:729:1: ruleDataTypeConstraint
                    {
                     before(grammarAccess.getAbstractElementConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataTypeConstraint_in_rule__AbstractElementConstraint__Alternatives1497);
                    ruleDataTypeConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:734:6: ( ruleEntityConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:734:6: ( ruleEntityConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:735:1: ruleEntityConstraint
                    {
                     before(grammarAccess.getAbstractElementConstraintAccess().getEntityConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEntityConstraint_in_rule__AbstractElementConstraint__Alternatives1514);
                    ruleEntityConstraint();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementConstraintAccess().getEntityConstraintParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElementConstraint__Alternatives"


    // $ANTLR start "rule__TypeConstraint__Alternatives"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:745:1: rule__TypeConstraint__Alternatives : ( ( ruleEntityConstraint ) | ( ruleDataTypeConstraint ) );
    public final void rule__TypeConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:749:1: ( ( ruleEntityConstraint ) | ( ruleDataTypeConstraint ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:750:1: ( ruleEntityConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:750:1: ( ruleEntityConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:751:1: ruleEntityConstraint
                    {
                     before(grammarAccess.getTypeConstraintAccess().getEntityConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntityConstraint_in_rule__TypeConstraint__Alternatives1546);
                    ruleEntityConstraint();

                    state._fsp--;

                     after(grammarAccess.getTypeConstraintAccess().getEntityConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:756:6: ( ruleDataTypeConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:756:6: ( ruleDataTypeConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:757:1: ruleDataTypeConstraint
                    {
                     before(grammarAccess.getTypeConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataTypeConstraint_in_rule__TypeConstraint__Alternatives1563);
                    ruleDataTypeConstraint();

                    state._fsp--;

                     after(grammarAccess.getTypeConstraintAccess().getDataTypeConstraintParserRuleCall_1()); 

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
    // $ANTLR end "rule__TypeConstraint__Alternatives"


    // $ANTLR start "rule__Constraint__Alternatives"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:767:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:771:1: ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 42:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:772:1: ( ruleBoolConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:772:1: ( ruleBoolConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:773:1: ruleBoolConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1595);
                    ruleBoolConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:778:6: ( ruleStringConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:778:6: ( ruleStringConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:779:1: ruleStringConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1612);
                    ruleStringConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:784:6: ( ruleDateTimeConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:784:6: ( ruleDateTimeConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:785:1: ruleDateTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1629);
                    ruleDateTimeConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:790:6: ( ruleDecimalConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:790:6: ( ruleDecimalConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:791:1: ruleDecimalConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1646);
                    ruleDecimalConstraint();

                    state._fsp--;

                     after(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:796:6: ( ruleEnumerationConstraint )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:796:6: ( ruleEnumerationConstraint )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:797:1: ruleEnumerationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1663);
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


    // $ANTLR start "rule__EnumUsage__Alternatives"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:807:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) );
    public final void rule__EnumUsage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:811:1: ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:812:1: ( ( 'as String' ) )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:812:1: ( ( 'as String' ) )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:813:1: ( 'as String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:814:1: ( 'as String' )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:814:3: 'as String'
                    {
                    match(input,14,FOLLOW_14_in_rule__EnumUsage__Alternatives1696); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:819:6: ( ( 'as Value' ) )
                    {
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:819:6: ( ( 'as Value' ) )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:820:1: ( 'as Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:821:1: ( 'as Value' )
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:821:3: 'as Value'
                    {
                    match(input,15,FOLLOW_15_in_rule__EnumUsage__Alternatives1717); 

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


    // $ANTLR start "rule__DomainModelConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:833:1: rule__DomainModelConstraint__Group__0 : rule__DomainModelConstraint__Group__0__Impl rule__DomainModelConstraint__Group__1 ;
    public final void rule__DomainModelConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:837:1: ( rule__DomainModelConstraint__Group__0__Impl rule__DomainModelConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:838:2: rule__DomainModelConstraint__Group__0__Impl rule__DomainModelConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModelConstraint__Group__0__Impl_in_rule__DomainModelConstraint__Group__01750);
            rule__DomainModelConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModelConstraint__Group__1_in_rule__DomainModelConstraint__Group__01753);
            rule__DomainModelConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__Group__0"


    // $ANTLR start "rule__DomainModelConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:845:1: rule__DomainModelConstraint__Group__0__Impl : ( ( rule__DomainModelConstraint__ImportsAssignment_0 )* ) ;
    public final void rule__DomainModelConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:849:1: ( ( ( rule__DomainModelConstraint__ImportsAssignment_0 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:850:1: ( ( rule__DomainModelConstraint__ImportsAssignment_0 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:850:1: ( ( rule__DomainModelConstraint__ImportsAssignment_0 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:851:1: ( rule__DomainModelConstraint__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainModelConstraintAccess().getImportsAssignment_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:852:1: ( rule__DomainModelConstraint__ImportsAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:852:2: rule__DomainModelConstraint__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DomainModelConstraint__ImportsAssignment_0_in_rule__DomainModelConstraint__Group__0__Impl1780);
            	    rule__DomainModelConstraint__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDomainModelConstraintAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__Group__0__Impl"


    // $ANTLR start "rule__DomainModelConstraint__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:862:1: rule__DomainModelConstraint__Group__1 : rule__DomainModelConstraint__Group__1__Impl ;
    public final void rule__DomainModelConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:866:1: ( rule__DomainModelConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:867:2: rule__DomainModelConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainModelConstraint__Group__1__Impl_in_rule__DomainModelConstraint__Group__11811);
            rule__DomainModelConstraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__Group__1"


    // $ANTLR start "rule__DomainModelConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:873:1: rule__DomainModelConstraint__Group__1__Impl : ( ( rule__DomainModelConstraint__ElementsAssignment_1 )* ) ;
    public final void rule__DomainModelConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:877:1: ( ( ( rule__DomainModelConstraint__ElementsAssignment_1 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:878:1: ( ( rule__DomainModelConstraint__ElementsAssignment_1 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:878:1: ( ( rule__DomainModelConstraint__ElementsAssignment_1 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:879:1: ( rule__DomainModelConstraint__ElementsAssignment_1 )*
            {
             before(grammarAccess.getDomainModelConstraintAccess().getElementsAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:880:1: ( rule__DomainModelConstraint__ElementsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:880:2: rule__DomainModelConstraint__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DomainModelConstraint__ElementsAssignment_1_in_rule__DomainModelConstraint__Group__1__Impl1838);
            	    rule__DomainModelConstraint__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDomainModelConstraintAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__Group__1__Impl"


    // $ANTLR start "rule__FileSpecification__Group_3__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:894:1: rule__FileSpecification__Group_3__0 : rule__FileSpecification__Group_3__0__Impl rule__FileSpecification__Group_3__1 ;
    public final void rule__FileSpecification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:898:1: ( rule__FileSpecification__Group_3__0__Impl rule__FileSpecification__Group_3__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:899:2: rule__FileSpecification__Group_3__0__Impl rule__FileSpecification__Group_3__1
            {
            pushFollow(FOLLOW_rule__FileSpecification__Group_3__0__Impl_in_rule__FileSpecification__Group_3__01873);
            rule__FileSpecification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecification__Group_3__1_in_rule__FileSpecification__Group_3__01876);
            rule__FileSpecification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__0"


    // $ANTLR start "rule__FileSpecification__Group_3__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:906:1: rule__FileSpecification__Group_3__0__Impl : ( 'CSV' ) ;
    public final void rule__FileSpecification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:910:1: ( ( 'CSV' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:911:1: ( 'CSV' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:911:1: ( 'CSV' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:912:1: 'CSV'
            {
             before(grammarAccess.getFileSpecificationAccess().getCSVKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__FileSpecification__Group_3__0__Impl1904); 
             after(grammarAccess.getFileSpecificationAccess().getCSVKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__0__Impl"


    // $ANTLR start "rule__FileSpecification__Group_3__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:925:1: rule__FileSpecification__Group_3__1 : rule__FileSpecification__Group_3__1__Impl rule__FileSpecification__Group_3__2 ;
    public final void rule__FileSpecification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:929:1: ( rule__FileSpecification__Group_3__1__Impl rule__FileSpecification__Group_3__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:930:2: rule__FileSpecification__Group_3__1__Impl rule__FileSpecification__Group_3__2
            {
            pushFollow(FOLLOW_rule__FileSpecification__Group_3__1__Impl_in_rule__FileSpecification__Group_3__11935);
            rule__FileSpecification__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FileSpecification__Group_3__2_in_rule__FileSpecification__Group_3__11938);
            rule__FileSpecification__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__1"


    // $ANTLR start "rule__FileSpecification__Group_3__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:937:1: rule__FileSpecification__Group_3__1__Impl : ( 'delimiter' ) ;
    public final void rule__FileSpecification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:941:1: ( ( 'delimiter' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:942:1: ( 'delimiter' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:942:1: ( 'delimiter' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:943:1: 'delimiter'
            {
             before(grammarAccess.getFileSpecificationAccess().getDelimiterKeyword_3_1()); 
            match(input,17,FOLLOW_17_in_rule__FileSpecification__Group_3__1__Impl1966); 
             after(grammarAccess.getFileSpecificationAccess().getDelimiterKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__1__Impl"


    // $ANTLR start "rule__FileSpecification__Group_3__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:956:1: rule__FileSpecification__Group_3__2 : rule__FileSpecification__Group_3__2__Impl ;
    public final void rule__FileSpecification__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:960:1: ( rule__FileSpecification__Group_3__2__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:961:2: rule__FileSpecification__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FileSpecification__Group_3__2__Impl_in_rule__FileSpecification__Group_3__21997);
            rule__FileSpecification__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__2"


    // $ANTLR start "rule__FileSpecification__Group_3__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:967:1: rule__FileSpecification__Group_3__2__Impl : ( ( rule__FileSpecification__DelimiterAssignment_3_2 ) ) ;
    public final void rule__FileSpecification__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:971:1: ( ( ( rule__FileSpecification__DelimiterAssignment_3_2 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:972:1: ( ( rule__FileSpecification__DelimiterAssignment_3_2 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:972:1: ( ( rule__FileSpecification__DelimiterAssignment_3_2 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:973:1: ( rule__FileSpecification__DelimiterAssignment_3_2 )
            {
             before(grammarAccess.getFileSpecificationAccess().getDelimiterAssignment_3_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:974:1: ( rule__FileSpecification__DelimiterAssignment_3_2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:974:2: rule__FileSpecification__DelimiterAssignment_3_2
            {
            pushFollow(FOLLOW_rule__FileSpecification__DelimiterAssignment_3_2_in_rule__FileSpecification__Group_3__2__Impl2024);
            rule__FileSpecification__DelimiterAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFileSpecificationAccess().getDelimiterAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__Group_3__2__Impl"


    // $ANTLR start "rule__FreeSpecification__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:990:1: rule__FreeSpecification__Group__0 : rule__FreeSpecification__Group__0__Impl rule__FreeSpecification__Group__1 ;
    public final void rule__FreeSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:994:1: ( rule__FreeSpecification__Group__0__Impl rule__FreeSpecification__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:995:2: rule__FreeSpecification__Group__0__Impl rule__FreeSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FreeSpecification__Group__0__Impl_in_rule__FreeSpecification__Group__02060);
            rule__FreeSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeSpecification__Group__1_in_rule__FreeSpecification__Group__02063);
            rule__FreeSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeSpecification__Group__0"


    // $ANTLR start "rule__FreeSpecification__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1002:1: rule__FreeSpecification__Group__0__Impl : ( 'line' ) ;
    public final void rule__FreeSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1006:1: ( ( 'line' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1007:1: ( 'line' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1007:1: ( 'line' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1008:1: 'line'
            {
             before(grammarAccess.getFreeSpecificationAccess().getLineKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FreeSpecification__Group__0__Impl2091); 
             after(grammarAccess.getFreeSpecificationAccess().getLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeSpecification__Group__0__Impl"


    // $ANTLR start "rule__FreeSpecification__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1021:1: rule__FreeSpecification__Group__1 : rule__FreeSpecification__Group__1__Impl ;
    public final void rule__FreeSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1025:1: ( rule__FreeSpecification__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1026:2: rule__FreeSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FreeSpecification__Group__1__Impl_in_rule__FreeSpecification__Group__12122);
            rule__FreeSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeSpecification__Group__1"


    // $ANTLR start "rule__FreeSpecification__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1032:1: rule__FreeSpecification__Group__1__Impl : ( ( rule__FreeSpecification__LinesAssignment_1 )* ) ;
    public final void rule__FreeSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1036:1: ( ( ( rule__FreeSpecification__LinesAssignment_1 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1037:1: ( ( rule__FreeSpecification__LinesAssignment_1 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1037:1: ( ( rule__FreeSpecification__LinesAssignment_1 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1038:1: ( rule__FreeSpecification__LinesAssignment_1 )*
            {
             before(grammarAccess.getFreeSpecificationAccess().getLinesAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1039:1: ( rule__FreeSpecification__LinesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1039:2: rule__FreeSpecification__LinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FreeSpecification__LinesAssignment_1_in_rule__FreeSpecification__Group__1__Impl2149);
            	    rule__FreeSpecification__LinesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFreeSpecificationAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeSpecification__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1053:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1057:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1058:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02184);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02187);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1065:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1069:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1070:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1070:1: ( 'import' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1071:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl2215); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1084:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1088:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1089:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12246);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1095:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1099:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1100:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1100:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1101:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1102:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1102:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2273);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1116:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1120:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1121:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02307);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02310);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1128:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1132:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1133:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1133:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1134:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2337);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1145:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1149:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1150:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12366);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1156:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1160:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1161:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1161:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1162:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1163:1: ( '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1164:2: '.*'
                    {
                    match(input,20,FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group__1__Impl2395); 

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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1179:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1183:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1184:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02432);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02435);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1191:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1195:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1196:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1196:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1197:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2462); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1208:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1212:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1213:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12491);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1219:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1223:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1224:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1224:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1225:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1226:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1226:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2518);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1240:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1244:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1245:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02553);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02556);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1252:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1256:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1257:1: ( '.' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1257:1: ( '.' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1258:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2584); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1271:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1275:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1276:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12615);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1282:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1286:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1287:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1287:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1288:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2642); 
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


    // $ANTLR start "rule__PackageConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1303:1: rule__PackageConstraint__Group__0 : rule__PackageConstraint__Group__0__Impl rule__PackageConstraint__Group__1 ;
    public final void rule__PackageConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1307:1: ( rule__PackageConstraint__Group__0__Impl rule__PackageConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1308:2: rule__PackageConstraint__Group__0__Impl rule__PackageConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__0__Impl_in_rule__PackageConstraint__Group__02675);
            rule__PackageConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__1_in_rule__PackageConstraint__Group__02678);
            rule__PackageConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__0"


    // $ANTLR start "rule__PackageConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1315:1: rule__PackageConstraint__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1319:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1320:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1320:1: ( 'package' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1321:1: 'package'
            {
             before(grammarAccess.getPackageConstraintAccess().getPackageKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__PackageConstraint__Group__0__Impl2706); 
             after(grammarAccess.getPackageConstraintAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__0__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1334:1: rule__PackageConstraint__Group__1 : rule__PackageConstraint__Group__1__Impl rule__PackageConstraint__Group__2 ;
    public final void rule__PackageConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1338:1: ( rule__PackageConstraint__Group__1__Impl rule__PackageConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1339:2: rule__PackageConstraint__Group__1__Impl rule__PackageConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__1__Impl_in_rule__PackageConstraint__Group__12737);
            rule__PackageConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__2_in_rule__PackageConstraint__Group__12740);
            rule__PackageConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__1"


    // $ANTLR start "rule__PackageConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1346:1: rule__PackageConstraint__Group__1__Impl : ( ( rule__PackageConstraint__PackageDeclarationAssignment_1 ) ) ;
    public final void rule__PackageConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1350:1: ( ( ( rule__PackageConstraint__PackageDeclarationAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1351:1: ( ( rule__PackageConstraint__PackageDeclarationAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1351:1: ( ( rule__PackageConstraint__PackageDeclarationAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1352:1: ( rule__PackageConstraint__PackageDeclarationAssignment_1 )
            {
             before(grammarAccess.getPackageConstraintAccess().getPackageDeclarationAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1353:1: ( rule__PackageConstraint__PackageDeclarationAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1353:2: rule__PackageConstraint__PackageDeclarationAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__PackageDeclarationAssignment_1_in_rule__PackageConstraint__Group__1__Impl2767);
            rule__PackageConstraint__PackageDeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getPackageDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__1__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1363:1: rule__PackageConstraint__Group__2 : rule__PackageConstraint__Group__2__Impl rule__PackageConstraint__Group__3 ;
    public final void rule__PackageConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1367:1: ( rule__PackageConstraint__Group__2__Impl rule__PackageConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1368:2: rule__PackageConstraint__Group__2__Impl rule__PackageConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__2__Impl_in_rule__PackageConstraint__Group__22797);
            rule__PackageConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__3_in_rule__PackageConstraint__Group__22800);
            rule__PackageConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__2"


    // $ANTLR start "rule__PackageConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1375:1: rule__PackageConstraint__Group__2__Impl : ( ( rule__PackageConstraint__Group_2__0 ) ) ;
    public final void rule__PackageConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1379:1: ( ( ( rule__PackageConstraint__Group_2__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1380:1: ( ( rule__PackageConstraint__Group_2__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1380:1: ( ( rule__PackageConstraint__Group_2__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1381:1: ( rule__PackageConstraint__Group_2__0 )
            {
             before(grammarAccess.getPackageConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1382:1: ( rule__PackageConstraint__Group_2__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1382:2: rule__PackageConstraint__Group_2__0
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_2__0_in_rule__PackageConstraint__Group__2__Impl2827);
            rule__PackageConstraint__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__2__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__3"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1392:1: rule__PackageConstraint__Group__3 : rule__PackageConstraint__Group__3__Impl rule__PackageConstraint__Group__4 ;
    public final void rule__PackageConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1396:1: ( rule__PackageConstraint__Group__3__Impl rule__PackageConstraint__Group__4 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1397:2: rule__PackageConstraint__Group__3__Impl rule__PackageConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__3__Impl_in_rule__PackageConstraint__Group__32857);
            rule__PackageConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__4_in_rule__PackageConstraint__Group__32860);
            rule__PackageConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__3"


    // $ANTLR start "rule__PackageConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1404:1: rule__PackageConstraint__Group__3__Impl : ( ( rule__PackageConstraint__Group_3__0 ) ) ;
    public final void rule__PackageConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1408:1: ( ( ( rule__PackageConstraint__Group_3__0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1409:1: ( ( rule__PackageConstraint__Group_3__0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1409:1: ( ( rule__PackageConstraint__Group_3__0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1410:1: ( rule__PackageConstraint__Group_3__0 )
            {
             before(grammarAccess.getPackageConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1411:1: ( rule__PackageConstraint__Group_3__0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1411:2: rule__PackageConstraint__Group_3__0
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_3__0_in_rule__PackageConstraint__Group__3__Impl2887);
            rule__PackageConstraint__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__3__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__4"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1421:1: rule__PackageConstraint__Group__4 : rule__PackageConstraint__Group__4__Impl rule__PackageConstraint__Group__5 ;
    public final void rule__PackageConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1425:1: ( rule__PackageConstraint__Group__4__Impl rule__PackageConstraint__Group__5 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1426:2: rule__PackageConstraint__Group__4__Impl rule__PackageConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__4__Impl_in_rule__PackageConstraint__Group__42917);
            rule__PackageConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__5_in_rule__PackageConstraint__Group__42920);
            rule__PackageConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__4"


    // $ANTLR start "rule__PackageConstraint__Group__4__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1433:1: rule__PackageConstraint__Group__4__Impl : ( '{' ) ;
    public final void rule__PackageConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1437:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1438:1: ( '{' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1438:1: ( '{' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1439:1: '{'
            {
             before(grammarAccess.getPackageConstraintAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__PackageConstraint__Group__4__Impl2948); 
             after(grammarAccess.getPackageConstraintAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__4__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__5"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1452:1: rule__PackageConstraint__Group__5 : rule__PackageConstraint__Group__5__Impl rule__PackageConstraint__Group__6 ;
    public final void rule__PackageConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1456:1: ( rule__PackageConstraint__Group__5__Impl rule__PackageConstraint__Group__6 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1457:2: rule__PackageConstraint__Group__5__Impl rule__PackageConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__5__Impl_in_rule__PackageConstraint__Group__52979);
            rule__PackageConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group__6_in_rule__PackageConstraint__Group__52982);
            rule__PackageConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__5"


    // $ANTLR start "rule__PackageConstraint__Group__5__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1464:1: rule__PackageConstraint__Group__5__Impl : ( ( rule__PackageConstraint__TypesAssignment_5 )* ) ;
    public final void rule__PackageConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1468:1: ( ( ( rule__PackageConstraint__TypesAssignment_5 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1469:1: ( ( rule__PackageConstraint__TypesAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1469:1: ( ( rule__PackageConstraint__TypesAssignment_5 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1470:1: ( rule__PackageConstraint__TypesAssignment_5 )*
            {
             before(grammarAccess.getPackageConstraintAccess().getTypesAssignment_5()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1471:1: ( rule__PackageConstraint__TypesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1471:2: rule__PackageConstraint__TypesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__PackageConstraint__TypesAssignment_5_in_rule__PackageConstraint__Group__5__Impl3009);
            	    rule__PackageConstraint__TypesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackageConstraintAccess().getTypesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__5__Impl"


    // $ANTLR start "rule__PackageConstraint__Group__6"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1481:1: rule__PackageConstraint__Group__6 : rule__PackageConstraint__Group__6__Impl ;
    public final void rule__PackageConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1485:1: ( rule__PackageConstraint__Group__6__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1486:2: rule__PackageConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group__6__Impl_in_rule__PackageConstraint__Group__63040);
            rule__PackageConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__6"


    // $ANTLR start "rule__PackageConstraint__Group__6__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1492:1: rule__PackageConstraint__Group__6__Impl : ( '}' ) ;
    public final void rule__PackageConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1496:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1497:1: ( '}' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1497:1: ( '}' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1498:1: '}'
            {
             before(grammarAccess.getPackageConstraintAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_24_in_rule__PackageConstraint__Group__6__Impl3068); 
             after(grammarAccess.getPackageConstraintAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group__6__Impl"


    // $ANTLR start "rule__PackageConstraint__Group_2__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1525:1: rule__PackageConstraint__Group_2__0 : rule__PackageConstraint__Group_2__0__Impl rule__PackageConstraint__Group_2__1 ;
    public final void rule__PackageConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1529:1: ( rule__PackageConstraint__Group_2__0__Impl rule__PackageConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1530:2: rule__PackageConstraint__Group_2__0__Impl rule__PackageConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_2__0__Impl_in_rule__PackageConstraint__Group_2__03113);
            rule__PackageConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group_2__1_in_rule__PackageConstraint__Group_2__03116);
            rule__PackageConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_2__0"


    // $ANTLR start "rule__PackageConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1537:1: rule__PackageConstraint__Group_2__0__Impl : ( 'prefix' ) ;
    public final void rule__PackageConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1541:1: ( ( 'prefix' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1542:1: ( 'prefix' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1542:1: ( 'prefix' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1543:1: 'prefix'
            {
             before(grammarAccess.getPackageConstraintAccess().getPrefixKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__PackageConstraint__Group_2__0__Impl3144); 
             after(grammarAccess.getPackageConstraintAccess().getPrefixKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__PackageConstraint__Group_2__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1556:1: rule__PackageConstraint__Group_2__1 : rule__PackageConstraint__Group_2__1__Impl ;
    public final void rule__PackageConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1560:1: ( rule__PackageConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1561:2: rule__PackageConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_2__1__Impl_in_rule__PackageConstraint__Group_2__13175);
            rule__PackageConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_2__1"


    // $ANTLR start "rule__PackageConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1567:1: rule__PackageConstraint__Group_2__1__Impl : ( ( rule__PackageConstraint__PrefixAssignment_2_1 ) ) ;
    public final void rule__PackageConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1571:1: ( ( ( rule__PackageConstraint__PrefixAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1572:1: ( ( rule__PackageConstraint__PrefixAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1572:1: ( ( rule__PackageConstraint__PrefixAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1573:1: ( rule__PackageConstraint__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getPackageConstraintAccess().getPrefixAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1574:1: ( rule__PackageConstraint__PrefixAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1574:2: rule__PackageConstraint__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__PrefixAssignment_2_1_in_rule__PackageConstraint__Group_2__1__Impl3202);
            rule__PackageConstraint__PrefixAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getPrefixAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__PackageConstraint__Group_3__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1588:1: rule__PackageConstraint__Group_3__0 : rule__PackageConstraint__Group_3__0__Impl rule__PackageConstraint__Group_3__1 ;
    public final void rule__PackageConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1592:1: ( rule__PackageConstraint__Group_3__0__Impl rule__PackageConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1593:2: rule__PackageConstraint__Group_3__0__Impl rule__PackageConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_3__0__Impl_in_rule__PackageConstraint__Group_3__03236);
            rule__PackageConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageConstraint__Group_3__1_in_rule__PackageConstraint__Group_3__03239);
            rule__PackageConstraint__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_3__0"


    // $ANTLR start "rule__PackageConstraint__Group_3__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1600:1: rule__PackageConstraint__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__PackageConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1604:1: ( ( 'namespace' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1605:1: ( 'namespace' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1605:1: ( 'namespace' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1606:1: 'namespace'
            {
             before(grammarAccess.getPackageConstraintAccess().getNamespaceKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__PackageConstraint__Group_3__0__Impl3267); 
             after(grammarAccess.getPackageConstraintAccess().getNamespaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_3__0__Impl"


    // $ANTLR start "rule__PackageConstraint__Group_3__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1619:1: rule__PackageConstraint__Group_3__1 : rule__PackageConstraint__Group_3__1__Impl ;
    public final void rule__PackageConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1623:1: ( rule__PackageConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1624:2: rule__PackageConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageConstraint__Group_3__1__Impl_in_rule__PackageConstraint__Group_3__13298);
            rule__PackageConstraint__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_3__1"


    // $ANTLR start "rule__PackageConstraint__Group_3__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1630:1: rule__PackageConstraint__Group_3__1__Impl : ( ( rule__PackageConstraint__NamespaceAssignment_3_1 ) ) ;
    public final void rule__PackageConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1634:1: ( ( ( rule__PackageConstraint__NamespaceAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1635:1: ( ( rule__PackageConstraint__NamespaceAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1635:1: ( ( rule__PackageConstraint__NamespaceAssignment_3_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1636:1: ( rule__PackageConstraint__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getPackageConstraintAccess().getNamespaceAssignment_3_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1637:1: ( rule__PackageConstraint__NamespaceAssignment_3_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1637:2: rule__PackageConstraint__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageConstraint__NamespaceAssignment_3_1_in_rule__PackageConstraint__Group_3__1__Impl3325);
            rule__PackageConstraint__NamespaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageConstraintAccess().getNamespaceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__Group_3__1__Impl"


    // $ANTLR start "rule__DataTypeConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1651:1: rule__DataTypeConstraint__Group__0 : rule__DataTypeConstraint__Group__0__Impl rule__DataTypeConstraint__Group__1 ;
    public final void rule__DataTypeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1655:1: ( rule__DataTypeConstraint__Group__0__Impl rule__DataTypeConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1656:2: rule__DataTypeConstraint__Group__0__Impl rule__DataTypeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__0__Impl_in_rule__DataTypeConstraint__Group__03359);
            rule__DataTypeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__1_in_rule__DataTypeConstraint__Group__03362);
            rule__DataTypeConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__0"


    // $ANTLR start "rule__DataTypeConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1663:1: rule__DataTypeConstraint__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataTypeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1667:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1668:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1668:1: ( 'datatype' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1669:1: 'datatype'
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDatatypeKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DataTypeConstraint__Group__0__Impl3390); 
             after(grammarAccess.getDataTypeConstraintAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__0__Impl"


    // $ANTLR start "rule__DataTypeConstraint__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1682:1: rule__DataTypeConstraint__Group__1 : rule__DataTypeConstraint__Group__1__Impl rule__DataTypeConstraint__Group__2 ;
    public final void rule__DataTypeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1686:1: ( rule__DataTypeConstraint__Group__1__Impl rule__DataTypeConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1687:2: rule__DataTypeConstraint__Group__1__Impl rule__DataTypeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__1__Impl_in_rule__DataTypeConstraint__Group__13421);
            rule__DataTypeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__2_in_rule__DataTypeConstraint__Group__13424);
            rule__DataTypeConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__1"


    // $ANTLR start "rule__DataTypeConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1694:1: rule__DataTypeConstraint__Group__1__Impl : ( ( rule__DataTypeConstraint__DataTypeAssignment_1 ) ) ;
    public final void rule__DataTypeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1698:1: ( ( ( rule__DataTypeConstraint__DataTypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1699:1: ( ( rule__DataTypeConstraint__DataTypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1699:1: ( ( rule__DataTypeConstraint__DataTypeAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1700:1: ( rule__DataTypeConstraint__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDataTypeAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1701:1: ( rule__DataTypeConstraint__DataTypeAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1701:2: rule__DataTypeConstraint__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__DataTypeAssignment_1_in_rule__DataTypeConstraint__Group__1__Impl3451);
            rule__DataTypeConstraint__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeConstraintAccess().getDataTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__1__Impl"


    // $ANTLR start "rule__DataTypeConstraint__Group__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1711:1: rule__DataTypeConstraint__Group__2 : rule__DataTypeConstraint__Group__2__Impl rule__DataTypeConstraint__Group__3 ;
    public final void rule__DataTypeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1715:1: ( rule__DataTypeConstraint__Group__2__Impl rule__DataTypeConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1716:2: rule__DataTypeConstraint__Group__2__Impl rule__DataTypeConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__2__Impl_in_rule__DataTypeConstraint__Group__23481);
            rule__DataTypeConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__3_in_rule__DataTypeConstraint__Group__23484);
            rule__DataTypeConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__2"


    // $ANTLR start "rule__DataTypeConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1723:1: rule__DataTypeConstraint__Group__2__Impl : ( ( rule__DataTypeConstraint__ConstraintAssignment_2 )? ) ;
    public final void rule__DataTypeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1727:1: ( ( ( rule__DataTypeConstraint__ConstraintAssignment_2 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1728:1: ( ( rule__DataTypeConstraint__ConstraintAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1728:1: ( ( rule__DataTypeConstraint__ConstraintAssignment_2 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1729:1: ( rule__DataTypeConstraint__ConstraintAssignment_2 )?
            {
             before(grammarAccess.getDataTypeConstraintAccess().getConstraintAssignment_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1730:1: ( rule__DataTypeConstraint__ConstraintAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30||(LA12_0>=38 && LA12_0<=40)||LA12_0==42) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1730:2: rule__DataTypeConstraint__ConstraintAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DataTypeConstraint__ConstraintAssignment_2_in_rule__DataTypeConstraint__Group__2__Impl3511);
                    rule__DataTypeConstraint__ConstraintAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeConstraintAccess().getConstraintAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__2__Impl"


    // $ANTLR start "rule__DataTypeConstraint__Group__3"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1740:1: rule__DataTypeConstraint__Group__3 : rule__DataTypeConstraint__Group__3__Impl ;
    public final void rule__DataTypeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1744:1: ( rule__DataTypeConstraint__Group__3__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1745:2: rule__DataTypeConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataTypeConstraint__Group__3__Impl_in_rule__DataTypeConstraint__Group__33542);
            rule__DataTypeConstraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__3"


    // $ANTLR start "rule__DataTypeConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1751:1: rule__DataTypeConstraint__Group__3__Impl : ( ( rule__DataTypeConstraint__DescriptionAssignment_3 )? ) ;
    public final void rule__DataTypeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1755:1: ( ( ( rule__DataTypeConstraint__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1756:1: ( ( rule__DataTypeConstraint__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1756:1: ( ( rule__DataTypeConstraint__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1757:1: ( rule__DataTypeConstraint__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1758:1: ( rule__DataTypeConstraint__DescriptionAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1758:2: rule__DataTypeConstraint__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__DataTypeConstraint__DescriptionAssignment_3_in_rule__DataTypeConstraint__Group__3__Impl3569);
                    rule__DataTypeConstraint__DescriptionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeConstraintAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__Group__3__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1776:1: rule__EntityConstraint__Group__0 : rule__EntityConstraint__Group__0__Impl rule__EntityConstraint__Group__1 ;
    public final void rule__EntityConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1780:1: ( rule__EntityConstraint__Group__0__Impl rule__EntityConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1781:2: rule__EntityConstraint__Group__0__Impl rule__EntityConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__0__Impl_in_rule__EntityConstraint__Group__03608);
            rule__EntityConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConstraint__Group__1_in_rule__EntityConstraint__Group__03611);
            rule__EntityConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__0"


    // $ANTLR start "rule__EntityConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1788:1: rule__EntityConstraint__Group__0__Impl : ( 'entity' ) ;
    public final void rule__EntityConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1792:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1793:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1793:1: ( 'entity' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1794:1: 'entity'
            {
             before(grammarAccess.getEntityConstraintAccess().getEntityKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__EntityConstraint__Group__0__Impl3639); 
             after(grammarAccess.getEntityConstraintAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__0__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1807:1: rule__EntityConstraint__Group__1 : rule__EntityConstraint__Group__1__Impl rule__EntityConstraint__Group__2 ;
    public final void rule__EntityConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1811:1: ( rule__EntityConstraint__Group__1__Impl rule__EntityConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1812:2: rule__EntityConstraint__Group__1__Impl rule__EntityConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__1__Impl_in_rule__EntityConstraint__Group__13670);
            rule__EntityConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConstraint__Group__2_in_rule__EntityConstraint__Group__13673);
            rule__EntityConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__1"


    // $ANTLR start "rule__EntityConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1819:1: rule__EntityConstraint__Group__1__Impl : ( ( rule__EntityConstraint__EntityAssignment_1 ) ) ;
    public final void rule__EntityConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1823:1: ( ( ( rule__EntityConstraint__EntityAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1824:1: ( ( rule__EntityConstraint__EntityAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1824:1: ( ( rule__EntityConstraint__EntityAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1825:1: ( rule__EntityConstraint__EntityAssignment_1 )
            {
             before(grammarAccess.getEntityConstraintAccess().getEntityAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1826:1: ( rule__EntityConstraint__EntityAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1826:2: rule__EntityConstraint__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityConstraint__EntityAssignment_1_in_rule__EntityConstraint__Group__1__Impl3700);
            rule__EntityConstraint__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityConstraintAccess().getEntityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__1__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1836:1: rule__EntityConstraint__Group__2 : rule__EntityConstraint__Group__2__Impl rule__EntityConstraint__Group__3 ;
    public final void rule__EntityConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1840:1: ( rule__EntityConstraint__Group__2__Impl rule__EntityConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1841:2: rule__EntityConstraint__Group__2__Impl rule__EntityConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__2__Impl_in_rule__EntityConstraint__Group__23730);
            rule__EntityConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConstraint__Group__3_in_rule__EntityConstraint__Group__23733);
            rule__EntityConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__2"


    // $ANTLR start "rule__EntityConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1848:1: rule__EntityConstraint__Group__2__Impl : ( ( rule__EntityConstraint__DescriptionAssignment_2 )? ) ;
    public final void rule__EntityConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1852:1: ( ( ( rule__EntityConstraint__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1853:1: ( ( rule__EntityConstraint__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1853:1: ( ( rule__EntityConstraint__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1854:1: ( rule__EntityConstraint__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getEntityConstraintAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1855:1: ( rule__EntityConstraint__DescriptionAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1855:2: rule__EntityConstraint__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__EntityConstraint__DescriptionAssignment_2_in_rule__EntityConstraint__Group__2__Impl3760);
                    rule__EntityConstraint__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityConstraintAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__2__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__3"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1865:1: rule__EntityConstraint__Group__3 : rule__EntityConstraint__Group__3__Impl rule__EntityConstraint__Group__4 ;
    public final void rule__EntityConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1869:1: ( rule__EntityConstraint__Group__3__Impl rule__EntityConstraint__Group__4 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1870:2: rule__EntityConstraint__Group__3__Impl rule__EntityConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__3__Impl_in_rule__EntityConstraint__Group__33791);
            rule__EntityConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConstraint__Group__4_in_rule__EntityConstraint__Group__33794);
            rule__EntityConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__3"


    // $ANTLR start "rule__EntityConstraint__Group__3__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1877:1: rule__EntityConstraint__Group__3__Impl : ( '{' ) ;
    public final void rule__EntityConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1881:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1882:1: ( '{' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1882:1: ( '{' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1883:1: '{'
            {
             before(grammarAccess.getEntityConstraintAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__EntityConstraint__Group__3__Impl3822); 
             after(grammarAccess.getEntityConstraintAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__3__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__4"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1896:1: rule__EntityConstraint__Group__4 : rule__EntityConstraint__Group__4__Impl rule__EntityConstraint__Group__5 ;
    public final void rule__EntityConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1900:1: ( rule__EntityConstraint__Group__4__Impl rule__EntityConstraint__Group__5 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1901:2: rule__EntityConstraint__Group__4__Impl rule__EntityConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__4__Impl_in_rule__EntityConstraint__Group__43853);
            rule__EntityConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConstraint__Group__5_in_rule__EntityConstraint__Group__43856);
            rule__EntityConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__4"


    // $ANTLR start "rule__EntityConstraint__Group__4__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1908:1: rule__EntityConstraint__Group__4__Impl : ( ( rule__EntityConstraint__FeaturesAssignment_4 )* ) ;
    public final void rule__EntityConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1912:1: ( ( ( rule__EntityConstraint__FeaturesAssignment_4 )* ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1913:1: ( ( rule__EntityConstraint__FeaturesAssignment_4 )* )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1913:1: ( ( rule__EntityConstraint__FeaturesAssignment_4 )* )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1914:1: ( rule__EntityConstraint__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityConstraintAccess().getFeaturesAssignment_4()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1915:1: ( rule__EntityConstraint__FeaturesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1915:2: rule__EntityConstraint__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__EntityConstraint__FeaturesAssignment_4_in_rule__EntityConstraint__Group__4__Impl3883);
            	    rule__EntityConstraint__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntityConstraintAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__4__Impl"


    // $ANTLR start "rule__EntityConstraint__Group__5"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1925:1: rule__EntityConstraint__Group__5 : rule__EntityConstraint__Group__5__Impl ;
    public final void rule__EntityConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1929:1: ( rule__EntityConstraint__Group__5__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1930:2: rule__EntityConstraint__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EntityConstraint__Group__5__Impl_in_rule__EntityConstraint__Group__53914);
            rule__EntityConstraint__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__5"


    // $ANTLR start "rule__EntityConstraint__Group__5__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1936:1: rule__EntityConstraint__Group__5__Impl : ( '}' ) ;
    public final void rule__EntityConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1940:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1941:1: ( '}' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1941:1: ( '}' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1942:1: '}'
            {
             before(grammarAccess.getEntityConstraintAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__EntityConstraint__Group__5__Impl3942); 
             after(grammarAccess.getEntityConstraintAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__Group__5__Impl"


    // $ANTLR start "rule__FeatureConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1967:1: rule__FeatureConstraint__Group__0 : rule__FeatureConstraint__Group__0__Impl rule__FeatureConstraint__Group__1 ;
    public final void rule__FeatureConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1971:1: ( rule__FeatureConstraint__Group__0__Impl rule__FeatureConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1972:2: rule__FeatureConstraint__Group__0__Impl rule__FeatureConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureConstraint__Group__0__Impl_in_rule__FeatureConstraint__Group__03985);
            rule__FeatureConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureConstraint__Group__1_in_rule__FeatureConstraint__Group__03988);
            rule__FeatureConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__0"


    // $ANTLR start "rule__FeatureConstraint__Group__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1979:1: rule__FeatureConstraint__Group__0__Impl : ( ruleAttributeConstraint ) ;
    public final void rule__FeatureConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1983:1: ( ( ruleAttributeConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1984:1: ( ruleAttributeConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1984:1: ( ruleAttributeConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1985:1: ruleAttributeConstraint
            {
             before(grammarAccess.getFeatureConstraintAccess().getAttributeConstraintParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttributeConstraint_in_rule__FeatureConstraint__Group__0__Impl4015);
            ruleAttributeConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureConstraintAccess().getAttributeConstraintParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__0__Impl"


    // $ANTLR start "rule__FeatureConstraint__Group__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:1996:1: rule__FeatureConstraint__Group__1 : rule__FeatureConstraint__Group__1__Impl rule__FeatureConstraint__Group__2 ;
    public final void rule__FeatureConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2000:1: ( rule__FeatureConstraint__Group__1__Impl rule__FeatureConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2001:2: rule__FeatureConstraint__Group__1__Impl rule__FeatureConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureConstraint__Group__1__Impl_in_rule__FeatureConstraint__Group__14044);
            rule__FeatureConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureConstraint__Group__2_in_rule__FeatureConstraint__Group__14047);
            rule__FeatureConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__1"


    // $ANTLR start "rule__FeatureConstraint__Group__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2008:1: rule__FeatureConstraint__Group__1__Impl : ( ( rule__FeatureConstraint__ConstraintAssignment_1 )? ) ;
    public final void rule__FeatureConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2012:1: ( ( ( rule__FeatureConstraint__ConstraintAssignment_1 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2013:1: ( ( rule__FeatureConstraint__ConstraintAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2013:1: ( ( rule__FeatureConstraint__ConstraintAssignment_1 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2014:1: ( rule__FeatureConstraint__ConstraintAssignment_1 )?
            {
             before(grammarAccess.getFeatureConstraintAccess().getConstraintAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2015:1: ( rule__FeatureConstraint__ConstraintAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30||(LA16_0>=38 && LA16_0<=40)||LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2015:2: rule__FeatureConstraint__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FeatureConstraint__ConstraintAssignment_1_in_rule__FeatureConstraint__Group__1__Impl4074);
                    rule__FeatureConstraint__ConstraintAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureConstraintAccess().getConstraintAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__1__Impl"


    // $ANTLR start "rule__FeatureConstraint__Group__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2025:1: rule__FeatureConstraint__Group__2 : rule__FeatureConstraint__Group__2__Impl ;
    public final void rule__FeatureConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2029:1: ( rule__FeatureConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2030:2: rule__FeatureConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureConstraint__Group__2__Impl_in_rule__FeatureConstraint__Group__24105);
            rule__FeatureConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__2"


    // $ANTLR start "rule__FeatureConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2036:1: rule__FeatureConstraint__Group__2__Impl : ( ( rule__FeatureConstraint__DescriptionAssignment_2 )? ) ;
    public final void rule__FeatureConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2040:1: ( ( ( rule__FeatureConstraint__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2041:1: ( ( rule__FeatureConstraint__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2041:1: ( ( rule__FeatureConstraint__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2042:1: ( rule__FeatureConstraint__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getFeatureConstraintAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2043:1: ( rule__FeatureConstraint__DescriptionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2043:2: rule__FeatureConstraint__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FeatureConstraint__DescriptionAssignment_2_in_rule__FeatureConstraint__Group__2__Impl4132);
                    rule__FeatureConstraint__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureConstraintAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__Group__2__Impl"


    // $ANTLR start "rule__StringConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2059:1: rule__StringConstraint__Group__0 : rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 ;
    public final void rule__StringConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2063:1: ( rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2064:2: rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__04169);
            rule__StringConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__04172);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2071:1: rule__StringConstraint__Group__0__Impl : ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__StringConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2075:1: ( ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2076:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2076:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2077:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2078:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2078:2: rule__StringConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl4199);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2088:1: rule__StringConstraint__Group__1 : rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 ;
    public final void rule__StringConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2092:1: ( rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2093:2: rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__14229);
            rule__StringConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__14232);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2100:1: rule__StringConstraint__Group__1__Impl : ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__StringConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2104:1: ( ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2105:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2105:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2106:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2107:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2107:2: rule__StringConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl4259);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2117:1: rule__StringConstraint__Group__2 : rule__StringConstraint__Group__2__Impl ;
    public final void rule__StringConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2121:1: ( rule__StringConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2122:2: rule__StringConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__24289);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2128:1: rule__StringConstraint__Group__2__Impl : ( ( rule__StringConstraint__Group_2__0 )? ) ;
    public final void rule__StringConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2132:1: ( ( ( rule__StringConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2133:1: ( ( rule__StringConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2133:1: ( ( rule__StringConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2134:1: ( rule__StringConstraint__Group_2__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2135:1: ( rule__StringConstraint__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2135:2: rule__StringConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl4316);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2151:1: rule__StringConstraint__Group_2__0 : rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 ;
    public final void rule__StringConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2155:1: ( rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2156:2: rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__04353);
            rule__StringConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__04356);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2163:1: rule__StringConstraint__Group_2__0__Impl : ( 'regexp' ) ;
    public final void rule__StringConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2167:1: ( ( 'regexp' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2168:1: ( 'regexp' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2168:1: ( 'regexp' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2169:1: 'regexp'
            {
             before(grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__StringConstraint__Group_2__0__Impl4384); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2182:1: rule__StringConstraint__Group_2__1 : rule__StringConstraint__Group_2__1__Impl ;
    public final void rule__StringConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2186:1: ( rule__StringConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2187:2: rule__StringConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__14415);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2193:1: rule__StringConstraint__Group_2__1__Impl : ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) ;
    public final void rule__StringConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2197:1: ( ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2198:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2198:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2199:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2200:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2200:2: rule__StringConstraint__RegularExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl4442);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2214:1: rule__DateTimeConstraint__Group__0 : rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 ;
    public final void rule__DateTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2218:1: ( rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2219:2: rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__04476);
            rule__DateTimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__04479);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2226:1: rule__DateTimeConstraint__Group__0__Impl : ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DateTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2230:1: ( ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2231:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2231:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2232:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2233:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2233:2: rule__DateTimeConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl4506);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2243:1: rule__DateTimeConstraint__Group__1 : rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 ;
    public final void rule__DateTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2247:1: ( rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2248:2: rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__14536);
            rule__DateTimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__14539);
            rule__DateTimeConstraint__Group__2();

            state._fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2255:1: rule__DateTimeConstraint__Group__1__Impl : ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) ;
    public final void rule__DateTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2259:1: ( ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2260:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2260:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2261:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2262:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2262:2: rule__DateTimeConstraint__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl4566);
            rule__DateTimeConstraint__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getDataTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DateTimeConstraint__Group__2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2272:1: rule__DateTimeConstraint__Group__2 : rule__DateTimeConstraint__Group__2__Impl ;
    public final void rule__DateTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2276:1: ( rule__DateTimeConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2277:2: rule__DateTimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__24596);
            rule__DateTimeConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__2"


    // $ANTLR start "rule__DateTimeConstraint__Group__2__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2283:1: rule__DateTimeConstraint__Group__2__Impl : ( ( rule__DateTimeConstraint__Group_2__0 )? ) ;
    public final void rule__DateTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2287:1: ( ( ( rule__DateTimeConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2288:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2288:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2289:1: ( rule__DateTimeConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2290:1: ( rule__DateTimeConstraint__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2290:2: rule__DateTimeConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl4623);
                    rule__DateTimeConstraint__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateTimeConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group__2__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group_2__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2306:1: rule__DateTimeConstraint__Group_2__0 : rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 ;
    public final void rule__DateTimeConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2310:1: ( rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2311:2: rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__04660);
            rule__DateTimeConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__04663);
            rule__DateTimeConstraint__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_2__0"


    // $ANTLR start "rule__DateTimeConstraint__Group_2__0__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2318:1: rule__DateTimeConstraint__Group_2__0__Impl : ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2322:1: ( ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2323:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2323:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2324:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2325:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2325:2: rule__DateTimeConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl4690);
            rule__DateTimeConstraint__HasDefaultAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_2__0__Impl"


    // $ANTLR start "rule__DateTimeConstraint__Group_2__1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2335:1: rule__DateTimeConstraint__Group_2__1 : rule__DateTimeConstraint__Group_2__1__Impl ;
    public final void rule__DateTimeConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2339:1: ( rule__DateTimeConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2340:2: rule__DateTimeConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__14720);
            rule__DateTimeConstraint__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_2__1"


    // $ANTLR start "rule__DateTimeConstraint__Group_2__1__Impl"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2346:1: rule__DateTimeConstraint__Group_2__1__Impl : ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2350:1: ( ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2351:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2351:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2352:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2353:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2353:2: rule__DateTimeConstraint__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl4747);
            rule__DateTimeConstraint__DefaultValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__Group_2__1__Impl"


    // $ANTLR start "rule__DecimalConstraint__Group__0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2367:1: rule__DecimalConstraint__Group__0 : rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 ;
    public final void rule__DecimalConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2371:1: ( rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2372:2: rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__04781);
            rule__DecimalConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__04784);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2379:1: rule__DecimalConstraint__Group__0__Impl : ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DecimalConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2383:1: ( ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2384:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2384:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2385:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2386:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2386:2: rule__DecimalConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl4811);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2396:1: rule__DecimalConstraint__Group__1 : rule__DecimalConstraint__Group__1__Impl ;
    public final void rule__DecimalConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2400:1: ( rule__DecimalConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2401:2: rule__DecimalConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__14841);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2407:1: rule__DecimalConstraint__Group__1__Impl : ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__DecimalConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2411:1: ( ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2412:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2412:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2413:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2414:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2414:2: rule__DecimalConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl4868);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2428:1: rule__EnumerationConstraint__Group__0 : rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 ;
    public final void rule__EnumerationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2432:1: ( rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2433:2: rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__04902);
            rule__EnumerationConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__04905);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2440:1: rule__EnumerationConstraint__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2444:1: ( ( 'enum' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2445:1: ( 'enum' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2445:1: ( 'enum' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2446:1: 'enum'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__EnumerationConstraint__Group__0__Impl4933); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2459:1: rule__EnumerationConstraint__Group__1 : rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 ;
    public final void rule__EnumerationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2463:1: ( rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2464:2: rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__14964);
            rule__EnumerationConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__14967);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2471:1: rule__EnumerationConstraint__Group__1__Impl : ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) ;
    public final void rule__EnumerationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2475:1: ( ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2476:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2476:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2477:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2478:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2478:2: rule__EnumerationConstraint__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl4994);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2488:1: rule__EnumerationConstraint__Group__2 : rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 ;
    public final void rule__EnumerationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2492:1: ( rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2493:2: rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__25024);
            rule__EnumerationConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__25027);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2500:1: rule__EnumerationConstraint__Group__2__Impl : ( ( rule__EnumerationConstraint__Group_2__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2504:1: ( ( ( rule__EnumerationConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2505:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2505:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2506:1: ( rule__EnumerationConstraint__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2507:1: ( rule__EnumerationConstraint__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2507:2: rule__EnumerationConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl5054);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2517:1: rule__EnumerationConstraint__Group__3 : rule__EnumerationConstraint__Group__3__Impl ;
    public final void rule__EnumerationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2521:1: ( rule__EnumerationConstraint__Group__3__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2522:2: rule__EnumerationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__35085);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2528:1: rule__EnumerationConstraint__Group__3__Impl : ( ( rule__EnumerationConstraint__Group_3__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2532:1: ( ( ( rule__EnumerationConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2533:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2533:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2534:1: ( rule__EnumerationConstraint__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2535:1: ( rule__EnumerationConstraint__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2535:2: rule__EnumerationConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl5112);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2553:1: rule__EnumerationConstraint__Group_2__0 : rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 ;
    public final void rule__EnumerationConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2557:1: ( rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2558:2: rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__05151);
            rule__EnumerationConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__05154);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2565:1: rule__EnumerationConstraint__Group_2__0__Impl : ( 'fixeLen' ) ;
    public final void rule__EnumerationConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2569:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2570:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2570:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2571:1: 'fixeLen'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__EnumerationConstraint__Group_2__0__Impl5182); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2584:1: rule__EnumerationConstraint__Group_2__1 : rule__EnumerationConstraint__Group_2__1__Impl ;
    public final void rule__EnumerationConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2588:1: ( rule__EnumerationConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2589:2: rule__EnumerationConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__15213);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2595:1: rule__EnumerationConstraint__Group_2__1__Impl : ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2599:1: ( ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2600:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2600:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2601:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2602:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2602:2: rule__EnumerationConstraint__FixeLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl5240);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2616:1: rule__EnumerationConstraint__Group_3__0 : rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 ;
    public final void rule__EnumerationConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2620:1: ( rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2621:2: rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__05274);
            rule__EnumerationConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__05277);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2628:1: rule__EnumerationConstraint__Group_3__0__Impl : ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2632:1: ( ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2633:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2633:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2634:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_3_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2635:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2635:2: rule__EnumerationConstraint__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl5304);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2645:1: rule__EnumerationConstraint__Group_3__1 : rule__EnumerationConstraint__Group_3__1__Impl ;
    public final void rule__EnumerationConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2649:1: ( rule__EnumerationConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2650:2: rule__EnumerationConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__15334);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2656:1: rule__EnumerationConstraint__Group_3__1__Impl : ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2660:1: ( ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2661:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2661:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2662:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2663:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2663:2: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl5361);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2677:1: rule__NumberConstraint__Group__0 : rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 ;
    public final void rule__NumberConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2681:1: ( rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2682:2: rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__05395);
            rule__NumberConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__05398);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2689:1: rule__NumberConstraint__Group__0__Impl : ( ( rule__NumberConstraint__Group_0__0 )? ) ;
    public final void rule__NumberConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2693:1: ( ( ( rule__NumberConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2694:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2694:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2695:1: ( rule__NumberConstraint__Group_0__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2696:1: ( rule__NumberConstraint__Group_0__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2696:2: rule__NumberConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl5425);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2706:1: rule__NumberConstraint__Group__1 : rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 ;
    public final void rule__NumberConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2710:1: ( rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2711:2: rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__15456);
            rule__NumberConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__15459);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2718:1: rule__NumberConstraint__Group__1__Impl : ( ( rule__NumberConstraint__Group_1__0 )? ) ;
    public final void rule__NumberConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2722:1: ( ( ( rule__NumberConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2723:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2723:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2724:1: ( rule__NumberConstraint__Group_1__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2725:1: ( rule__NumberConstraint__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2725:2: rule__NumberConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl5486);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2735:1: rule__NumberConstraint__Group__2 : rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 ;
    public final void rule__NumberConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2739:1: ( rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2740:2: rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__25517);
            rule__NumberConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__25520);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2747:1: rule__NumberConstraint__Group__2__Impl : ( ( rule__NumberConstraint__Group_2__0 )? ) ;
    public final void rule__NumberConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2751:1: ( ( ( rule__NumberConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2752:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2752:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2753:1: ( rule__NumberConstraint__Group_2__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2754:1: ( rule__NumberConstraint__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2754:2: rule__NumberConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl5547);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2764:1: rule__NumberConstraint__Group__3 : rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 ;
    public final void rule__NumberConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2768:1: ( rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2769:2: rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__35578);
            rule__NumberConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__35581);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2776:1: rule__NumberConstraint__Group__3__Impl : ( ( rule__NumberConstraint__Group_3__0 )? ) ;
    public final void rule__NumberConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2780:1: ( ( ( rule__NumberConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2781:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2781:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2782:1: ( rule__NumberConstraint__Group_3__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2783:1: ( rule__NumberConstraint__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2783:2: rule__NumberConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl5608);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2793:1: rule__NumberConstraint__Group__4 : rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 ;
    public final void rule__NumberConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2797:1: ( rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2798:2: rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__45639);
            rule__NumberConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__45642);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2805:1: rule__NumberConstraint__Group__4__Impl : ( ( rule__NumberConstraint__Group_4__0 )? ) ;
    public final void rule__NumberConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2809:1: ( ( ( rule__NumberConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2810:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2810:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2811:1: ( rule__NumberConstraint__Group_4__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2812:1: ( rule__NumberConstraint__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2812:2: rule__NumberConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl5669);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2822:1: rule__NumberConstraint__Group__5 : rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 ;
    public final void rule__NumberConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2826:1: ( rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2827:2: rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__55700);
            rule__NumberConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__55703);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2834:1: rule__NumberConstraint__Group__5__Impl : ( ( rule__NumberConstraint__Group_5__0 )? ) ;
    public final void rule__NumberConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2838:1: ( ( ( rule__NumberConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2839:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2839:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2840:1: ( rule__NumberConstraint__Group_5__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2841:1: ( rule__NumberConstraint__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2841:2: rule__NumberConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl5730);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2851:1: rule__NumberConstraint__Group__6 : rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 ;
    public final void rule__NumberConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2855:1: ( rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2856:2: rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__65761);
            rule__NumberConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__65764);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2863:1: rule__NumberConstraint__Group__6__Impl : ( ( rule__NumberConstraint__Group_6__0 )? ) ;
    public final void rule__NumberConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2867:1: ( ( ( rule__NumberConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2868:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2868:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2869:1: ( rule__NumberConstraint__Group_6__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2870:1: ( rule__NumberConstraint__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2870:2: rule__NumberConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl5791);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2880:1: rule__NumberConstraint__Group__7 : rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 ;
    public final void rule__NumberConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2884:1: ( rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2885:2: rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__75822);
            rule__NumberConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__75825);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2892:1: rule__NumberConstraint__Group__7__Impl : ( ( rule__NumberConstraint__Group_7__0 )? ) ;
    public final void rule__NumberConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2896:1: ( ( ( rule__NumberConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2897:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2897:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2898:1: ( rule__NumberConstraint__Group_7__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2899:1: ( rule__NumberConstraint__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2899:2: rule__NumberConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl5852);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2909:1: rule__NumberConstraint__Group__8 : rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 ;
    public final void rule__NumberConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2913:1: ( rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2914:2: rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__85883);
            rule__NumberConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__85886);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2921:1: rule__NumberConstraint__Group__8__Impl : ( ( rule__NumberConstraint__IsIdAssignment_8 )? ) ;
    public final void rule__NumberConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2925:1: ( ( ( rule__NumberConstraint__IsIdAssignment_8 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2926:1: ( ( rule__NumberConstraint__IsIdAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2926:1: ( ( rule__NumberConstraint__IsIdAssignment_8 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2927:1: ( rule__NumberConstraint__IsIdAssignment_8 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdAssignment_8()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2928:1: ( rule__NumberConstraint__IsIdAssignment_8 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2928:2: rule__NumberConstraint__IsIdAssignment_8
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__IsIdAssignment_8_in_rule__NumberConstraint__Group__8__Impl5913);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2938:1: rule__NumberConstraint__Group__9 : rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 ;
    public final void rule__NumberConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2942:1: ( rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2943:2: rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__95944);
            rule__NumberConstraint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__95947);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2950:1: rule__NumberConstraint__Group__9__Impl : ( ( rule__NumberConstraint__NullableAssignment_9 )? ) ;
    public final void rule__NumberConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2954:1: ( ( ( rule__NumberConstraint__NullableAssignment_9 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2955:1: ( ( rule__NumberConstraint__NullableAssignment_9 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2955:1: ( ( rule__NumberConstraint__NullableAssignment_9 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2956:1: ( rule__NumberConstraint__NullableAssignment_9 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableAssignment_9()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2957:1: ( rule__NumberConstraint__NullableAssignment_9 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2957:2: rule__NumberConstraint__NullableAssignment_9
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__NullableAssignment_9_in_rule__NumberConstraint__Group__9__Impl5974);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2967:1: rule__NumberConstraint__Group__10 : rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11 ;
    public final void rule__NumberConstraint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2971:1: ( rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2972:2: rule__NumberConstraint__Group__10__Impl rule__NumberConstraint__Group__11
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__106005);
            rule__NumberConstraint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__11_in_rule__NumberConstraint__Group__106008);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2979:1: rule__NumberConstraint__Group__10__Impl : ( ( rule__NumberConstraint__Group_10__0 )? ) ;
    public final void rule__NumberConstraint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2983:1: ( ( ( rule__NumberConstraint__Group_10__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2984:1: ( ( rule__NumberConstraint__Group_10__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2984:1: ( ( rule__NumberConstraint__Group_10__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2985:1: ( rule__NumberConstraint__Group_10__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_10()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2986:1: ( rule__NumberConstraint__Group_10__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2986:2: rule__NumberConstraint__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_10__0_in_rule__NumberConstraint__Group__10__Impl6035);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:2996:1: rule__NumberConstraint__Group__11 : rule__NumberConstraint__Group__11__Impl ;
    public final void rule__NumberConstraint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3000:1: ( rule__NumberConstraint__Group__11__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3001:2: rule__NumberConstraint__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__11__Impl_in_rule__NumberConstraint__Group__116066);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3007:1: rule__NumberConstraint__Group__11__Impl : ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? ) ;
    public final void rule__NumberConstraint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3011:1: ( ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3012:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3012:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_11 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3013:1: ( rule__NumberConstraint__IsXSDAttAssignment_11 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttAssignment_11()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3014:1: ( rule__NumberConstraint__IsXSDAttAssignment_11 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3014:2: rule__NumberConstraint__IsXSDAttAssignment_11
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_11_in_rule__NumberConstraint__Group__11__Impl6093);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3048:1: rule__NumberConstraint__Group_0__0 : rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 ;
    public final void rule__NumberConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3052:1: ( rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3053:2: rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__06148);
            rule__NumberConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__06151);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3060:1: rule__NumberConstraint__Group_0__0__Impl : ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) ) ;
    public final void rule__NumberConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3064:1: ( ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3065:1: ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3065:1: ( ( rule__NumberConstraint__HasDefaultAssignment_0_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3066:1: ( rule__NumberConstraint__HasDefaultAssignment_0_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultAssignment_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3067:1: ( rule__NumberConstraint__HasDefaultAssignment_0_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3067:2: rule__NumberConstraint__HasDefaultAssignment_0_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__HasDefaultAssignment_0_0_in_rule__NumberConstraint__Group_0__0__Impl6178);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3077:1: rule__NumberConstraint__Group_0__1 : rule__NumberConstraint__Group_0__1__Impl ;
    public final void rule__NumberConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3081:1: ( rule__NumberConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3082:2: rule__NumberConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__16208);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3088:1: rule__NumberConstraint__Group_0__1__Impl : ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) ) ;
    public final void rule__NumberConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3092:1: ( ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3093:1: ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3093:1: ( ( rule__NumberConstraint__DefaultValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3094:1: ( rule__NumberConstraint__DefaultValueAssignment_0_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3095:1: ( rule__NumberConstraint__DefaultValueAssignment_0_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3095:2: rule__NumberConstraint__DefaultValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DefaultValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl6235);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3109:1: rule__NumberConstraint__Group_1__0 : rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 ;
    public final void rule__NumberConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3113:1: ( rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3114:2: rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__06269);
            rule__NumberConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__06272);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3121:1: rule__NumberConstraint__Group_1__0__Impl : ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) ) ;
    public final void rule__NumberConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3125:1: ( ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3126:1: ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3126:1: ( ( rule__NumberConstraint__IsFixedAssignment_1_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3127:1: ( rule__NumberConstraint__IsFixedAssignment_1_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedAssignment_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3128:1: ( rule__NumberConstraint__IsFixedAssignment_1_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3128:2: rule__NumberConstraint__IsFixedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__IsFixedAssignment_1_0_in_rule__NumberConstraint__Group_1__0__Impl6299);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3138:1: rule__NumberConstraint__Group_1__1 : rule__NumberConstraint__Group_1__1__Impl ;
    public final void rule__NumberConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3142:1: ( rule__NumberConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3143:2: rule__NumberConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__16329);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3149:1: rule__NumberConstraint__Group_1__1__Impl : ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) ) ;
    public final void rule__NumberConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3153:1: ( ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3154:1: ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3154:1: ( ( rule__NumberConstraint__FixedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3155:1: ( rule__NumberConstraint__FixedValueAssignment_1_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3156:1: ( rule__NumberConstraint__FixedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3156:2: rule__NumberConstraint__FixedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixedValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl6356);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3170:1: rule__NumberConstraint__Group_2__0 : rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 ;
    public final void rule__NumberConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3174:1: ( rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3175:2: rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__06390);
            rule__NumberConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__06393);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3182:1: rule__NumberConstraint__Group_2__0__Impl : ( 'minVal' ) ;
    public final void rule__NumberConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3186:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3187:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3187:1: ( 'minVal' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3188:1: 'minVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__NumberConstraint__Group_2__0__Impl6421); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3201:1: rule__NumberConstraint__Group_2__1 : rule__NumberConstraint__Group_2__1__Impl ;
    public final void rule__NumberConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3205:1: ( rule__NumberConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3206:2: rule__NumberConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__16452);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3212:1: rule__NumberConstraint__Group_2__1__Impl : ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) ) ;
    public final void rule__NumberConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3216:1: ( ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3217:1: ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3217:1: ( ( rule__NumberConstraint__MinValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3218:1: ( rule__NumberConstraint__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3219:1: ( rule__NumberConstraint__MinValueAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3219:2: rule__NumberConstraint__MinValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl6479);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3233:1: rule__NumberConstraint__Group_3__0 : rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 ;
    public final void rule__NumberConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3237:1: ( rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3238:2: rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__06513);
            rule__NumberConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__06516);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3245:1: rule__NumberConstraint__Group_3__0__Impl : ( 'maxVal' ) ;
    public final void rule__NumberConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3249:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3250:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3250:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3251:1: 'maxVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_3_0()); 
            match(input,33,FOLLOW_33_in_rule__NumberConstraint__Group_3__0__Impl6544); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3264:1: rule__NumberConstraint__Group_3__1 : rule__NumberConstraint__Group_3__1__Impl ;
    public final void rule__NumberConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3268:1: ( rule__NumberConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3269:2: rule__NumberConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__16575);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3275:1: rule__NumberConstraint__Group_3__1__Impl : ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) ) ;
    public final void rule__NumberConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3279:1: ( ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3280:1: ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3280:1: ( ( rule__NumberConstraint__MaxValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3281:1: ( rule__NumberConstraint__MaxValueAssignment_3_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3282:1: ( rule__NumberConstraint__MaxValueAssignment_3_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3282:2: rule__NumberConstraint__MaxValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl6602);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3296:1: rule__NumberConstraint__Group_4__0 : rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 ;
    public final void rule__NumberConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3300:1: ( rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3301:2: rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__06636);
            rule__NumberConstraint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__06639);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3308:1: rule__NumberConstraint__Group_4__0__Impl : ( 'minLen' ) ;
    public final void rule__NumberConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3312:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3313:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3313:1: ( 'minLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3314:1: 'minLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__NumberConstraint__Group_4__0__Impl6667); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3327:1: rule__NumberConstraint__Group_4__1 : rule__NumberConstraint__Group_4__1__Impl ;
    public final void rule__NumberConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3331:1: ( rule__NumberConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3332:2: rule__NumberConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__16698);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3338:1: rule__NumberConstraint__Group_4__1__Impl : ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) ;
    public final void rule__NumberConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3342:1: ( ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3343:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3343:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3344:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3345:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3345:2: rule__NumberConstraint__MinLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl6725);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3359:1: rule__NumberConstraint__Group_5__0 : rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 ;
    public final void rule__NumberConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3363:1: ( rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3364:2: rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__06759);
            rule__NumberConstraint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__06762);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3371:1: rule__NumberConstraint__Group_5__0__Impl : ( 'maxLen' ) ;
    public final void rule__NumberConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3375:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3376:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3376:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3377:1: 'maxLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__NumberConstraint__Group_5__0__Impl6790); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3390:1: rule__NumberConstraint__Group_5__1 : rule__NumberConstraint__Group_5__1__Impl ;
    public final void rule__NumberConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3394:1: ( rule__NumberConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3395:2: rule__NumberConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__16821);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3401:1: rule__NumberConstraint__Group_5__1__Impl : ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) ;
    public final void rule__NumberConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3405:1: ( ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3406:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3406:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3407:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3408:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3408:2: rule__NumberConstraint__MaxLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl6848);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3422:1: rule__NumberConstraint__Group_6__0 : rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 ;
    public final void rule__NumberConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3426:1: ( rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3427:2: rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__06882);
            rule__NumberConstraint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__06885);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3434:1: rule__NumberConstraint__Group_6__0__Impl : ( 'fixeLen' ) ;
    public final void rule__NumberConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3438:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3439:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3439:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3440:1: 'fixeLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__NumberConstraint__Group_6__0__Impl6913); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3453:1: rule__NumberConstraint__Group_6__1 : rule__NumberConstraint__Group_6__1__Impl ;
    public final void rule__NumberConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3457:1: ( rule__NumberConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3458:2: rule__NumberConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__16944);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3464:1: rule__NumberConstraint__Group_6__1__Impl : ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) ;
    public final void rule__NumberConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3468:1: ( ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3469:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3469:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3470:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenAssignment_6_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3471:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3471:2: rule__NumberConstraint__FixeLenAssignment_6_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl6971);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3485:1: rule__NumberConstraint__Group_7__0 : rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 ;
    public final void rule__NumberConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3489:1: ( rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3490:2: rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__07005);
            rule__NumberConstraint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__07008);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3497:1: rule__NumberConstraint__Group_7__0__Impl : ( 'paddle' ) ;
    public final void rule__NumberConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3501:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3502:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3502:1: ( 'paddle' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3503:1: 'paddle'
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__NumberConstraint__Group_7__0__Impl7036); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3516:1: rule__NumberConstraint__Group_7__1 : rule__NumberConstraint__Group_7__1__Impl ;
    public final void rule__NumberConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3520:1: ( rule__NumberConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3521:2: rule__NumberConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__17067);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3527:1: rule__NumberConstraint__Group_7__1__Impl : ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) ;
    public final void rule__NumberConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3531:1: ( ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3532:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3532:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3533:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleAssignment_7_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3534:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3534:2: rule__NumberConstraint__PaddleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl7094);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3548:1: rule__NumberConstraint__Group_10__0 : rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1 ;
    public final void rule__NumberConstraint__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3552:1: ( rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3553:2: rule__NumberConstraint__Group_10__0__Impl rule__NumberConstraint__Group_10__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__0__Impl_in_rule__NumberConstraint__Group_10__07128);
            rule__NumberConstraint__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__1_in_rule__NumberConstraint__Group_10__07131);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3560:1: rule__NumberConstraint__Group_10__0__Impl : ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) ) ;
    public final void rule__NumberConstraint__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3564:1: ( ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3565:1: ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3565:1: ( ( rule__NumberConstraint__DerivedAssignment_10_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3566:1: ( rule__NumberConstraint__DerivedAssignment_10_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedAssignment_10_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3567:1: ( rule__NumberConstraint__DerivedAssignment_10_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3567:2: rule__NumberConstraint__DerivedAssignment_10_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DerivedAssignment_10_0_in_rule__NumberConstraint__Group_10__0__Impl7158);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3577:1: rule__NumberConstraint__Group_10__1 : rule__NumberConstraint__Group_10__1__Impl ;
    public final void rule__NumberConstraint__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3581:1: ( rule__NumberConstraint__Group_10__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3582:2: rule__NumberConstraint__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_10__1__Impl_in_rule__NumberConstraint__Group_10__17188);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3588:1: rule__NumberConstraint__Group_10__1__Impl : ( ( rule__NumberConstraint__WritableAssignment_10_1 )? ) ;
    public final void rule__NumberConstraint__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3592:1: ( ( ( rule__NumberConstraint__WritableAssignment_10_1 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3593:1: ( ( rule__NumberConstraint__WritableAssignment_10_1 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3593:1: ( ( rule__NumberConstraint__WritableAssignment_10_1 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3594:1: ( rule__NumberConstraint__WritableAssignment_10_1 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableAssignment_10_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3595:1: ( rule__NumberConstraint__WritableAssignment_10_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3595:2: rule__NumberConstraint__WritableAssignment_10_1
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__WritableAssignment_10_1_in_rule__NumberConstraint__Group_10__1__Impl7215);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3609:1: rule__AllConstraint__Group__0 : rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 ;
    public final void rule__AllConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3613:1: ( rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3614:2: rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__07250);
            rule__AllConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__07253);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3621:1: rule__AllConstraint__Group__0__Impl : ( ( rule__AllConstraint__Group_0__0 )? ) ;
    public final void rule__AllConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3625:1: ( ( ( rule__AllConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3626:1: ( ( rule__AllConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3626:1: ( ( rule__AllConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3627:1: ( rule__AllConstraint__Group_0__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3628:1: ( rule__AllConstraint__Group_0__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3628:2: rule__AllConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl7280);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3638:1: rule__AllConstraint__Group__1 : rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 ;
    public final void rule__AllConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3642:1: ( rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3643:2: rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__17311);
            rule__AllConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__17314);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3650:1: rule__AllConstraint__Group__1__Impl : ( ( rule__AllConstraint__Group_1__0 )? ) ;
    public final void rule__AllConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3654:1: ( ( ( rule__AllConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3655:1: ( ( rule__AllConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3655:1: ( ( rule__AllConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3656:1: ( rule__AllConstraint__Group_1__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3657:1: ( rule__AllConstraint__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3657:2: rule__AllConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl7341);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3667:1: rule__AllConstraint__Group__2 : rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 ;
    public final void rule__AllConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3671:1: ( rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3672:2: rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__27372);
            rule__AllConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__27375);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3679:1: rule__AllConstraint__Group__2__Impl : ( ( rule__AllConstraint__Group_2__0 )? ) ;
    public final void rule__AllConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3683:1: ( ( ( rule__AllConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3684:1: ( ( rule__AllConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3684:1: ( ( rule__AllConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3685:1: ( rule__AllConstraint__Group_2__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3686:1: ( rule__AllConstraint__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3686:2: rule__AllConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl7402);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3696:1: rule__AllConstraint__Group__3 : rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 ;
    public final void rule__AllConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3700:1: ( rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3701:2: rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__37433);
            rule__AllConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__37436);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3708:1: rule__AllConstraint__Group__3__Impl : ( ( rule__AllConstraint__Group_3__0 )? ) ;
    public final void rule__AllConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3712:1: ( ( ( rule__AllConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3713:1: ( ( rule__AllConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3713:1: ( ( rule__AllConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3714:1: ( rule__AllConstraint__Group_3__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3715:1: ( rule__AllConstraint__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3715:2: rule__AllConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl7463);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3725:1: rule__AllConstraint__Group__4 : rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 ;
    public final void rule__AllConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3729:1: ( rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3730:2: rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__47494);
            rule__AllConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__47497);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3737:1: rule__AllConstraint__Group__4__Impl : ( ( rule__AllConstraint__Group_4__0 )? ) ;
    public final void rule__AllConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3741:1: ( ( ( rule__AllConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3742:1: ( ( rule__AllConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3742:1: ( ( rule__AllConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3743:1: ( rule__AllConstraint__Group_4__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3744:1: ( rule__AllConstraint__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3744:2: rule__AllConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl7524);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3754:1: rule__AllConstraint__Group__5 : rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 ;
    public final void rule__AllConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3758:1: ( rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3759:2: rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__57555);
            rule__AllConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__57558);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3766:1: rule__AllConstraint__Group__5__Impl : ( ( rule__AllConstraint__Group_5__0 )? ) ;
    public final void rule__AllConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3770:1: ( ( ( rule__AllConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3771:1: ( ( rule__AllConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3771:1: ( ( rule__AllConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3772:1: ( rule__AllConstraint__Group_5__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3773:1: ( rule__AllConstraint__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3773:2: rule__AllConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl7585);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3783:1: rule__AllConstraint__Group__6 : rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 ;
    public final void rule__AllConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3787:1: ( rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3788:2: rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__67616);
            rule__AllConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__67619);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3795:1: rule__AllConstraint__Group__6__Impl : ( ( rule__AllConstraint__IsIdAssignment_6 )? ) ;
    public final void rule__AllConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3799:1: ( ( ( rule__AllConstraint__IsIdAssignment_6 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3800:1: ( ( rule__AllConstraint__IsIdAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3800:1: ( ( rule__AllConstraint__IsIdAssignment_6 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3801:1: ( rule__AllConstraint__IsIdAssignment_6 )?
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdAssignment_6()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3802:1: ( rule__AllConstraint__IsIdAssignment_6 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3802:2: rule__AllConstraint__IsIdAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__IsIdAssignment_6_in_rule__AllConstraint__Group__6__Impl7646);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3812:1: rule__AllConstraint__Group__7 : rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 ;
    public final void rule__AllConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3816:1: ( rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3817:2: rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__77677);
            rule__AllConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__77680);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3824:1: rule__AllConstraint__Group__7__Impl : ( ( rule__AllConstraint__NullableAssignment_7 )? ) ;
    public final void rule__AllConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3828:1: ( ( ( rule__AllConstraint__NullableAssignment_7 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3829:1: ( ( rule__AllConstraint__NullableAssignment_7 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3829:1: ( ( rule__AllConstraint__NullableAssignment_7 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3830:1: ( rule__AllConstraint__NullableAssignment_7 )?
            {
             before(grammarAccess.getAllConstraintAccess().getNullableAssignment_7()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3831:1: ( rule__AllConstraint__NullableAssignment_7 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3831:2: rule__AllConstraint__NullableAssignment_7
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__NullableAssignment_7_in_rule__AllConstraint__Group__7__Impl7707);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3841:1: rule__AllConstraint__Group__8 : rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9 ;
    public final void rule__AllConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3845:1: ( rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3846:2: rule__AllConstraint__Group__8__Impl rule__AllConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__87738);
            rule__AllConstraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__9_in_rule__AllConstraint__Group__87741);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3853:1: rule__AllConstraint__Group__8__Impl : ( ( rule__AllConstraint__Group_8__0 )? ) ;
    public final void rule__AllConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3857:1: ( ( ( rule__AllConstraint__Group_8__0 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3858:1: ( ( rule__AllConstraint__Group_8__0 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3858:1: ( ( rule__AllConstraint__Group_8__0 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3859:1: ( rule__AllConstraint__Group_8__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_8()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3860:1: ( rule__AllConstraint__Group_8__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3860:2: rule__AllConstraint__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_8__0_in_rule__AllConstraint__Group__8__Impl7768);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3870:1: rule__AllConstraint__Group__9 : rule__AllConstraint__Group__9__Impl ;
    public final void rule__AllConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3874:1: ( rule__AllConstraint__Group__9__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3875:2: rule__AllConstraint__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__9__Impl_in_rule__AllConstraint__Group__97799);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3881:1: rule__AllConstraint__Group__9__Impl : ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? ) ;
    public final void rule__AllConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3885:1: ( ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3886:1: ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3886:1: ( ( rule__AllConstraint__IsXSDAttAssignment_9 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3887:1: ( rule__AllConstraint__IsXSDAttAssignment_9 )?
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttAssignment_9()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3888:1: ( rule__AllConstraint__IsXSDAttAssignment_9 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3888:2: rule__AllConstraint__IsXSDAttAssignment_9
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__IsXSDAttAssignment_9_in_rule__AllConstraint__Group__9__Impl7826);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3918:1: rule__AllConstraint__Group_0__0 : rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 ;
    public final void rule__AllConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3922:1: ( rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3923:2: rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__07877);
            rule__AllConstraint__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__07880);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3930:1: rule__AllConstraint__Group_0__0__Impl : ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) ;
    public final void rule__AllConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3934:1: ( ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3935:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3935:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3936:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultAssignment_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3937:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3937:2: rule__AllConstraint__HasDefaultAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl7907);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3947:1: rule__AllConstraint__Group_0__1 : rule__AllConstraint__Group_0__1__Impl ;
    public final void rule__AllConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3951:1: ( rule__AllConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3952:2: rule__AllConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__17937);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3958:1: rule__AllConstraint__Group_0__1__Impl : ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) ;
    public final void rule__AllConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3962:1: ( ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3963:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3963:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3964:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3965:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3965:2: rule__AllConstraint__DefaultValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl7964);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3979:1: rule__AllConstraint__Group_1__0 : rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 ;
    public final void rule__AllConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3983:1: ( rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3984:2: rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__07998);
            rule__AllConstraint__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__08001);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3991:1: rule__AllConstraint__Group_1__0__Impl : ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) ;
    public final void rule__AllConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3995:1: ( ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3996:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3996:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3997:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedAssignment_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3998:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:3998:2: rule__AllConstraint__IsFixedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl8028);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4008:1: rule__AllConstraint__Group_1__1 : rule__AllConstraint__Group_1__1__Impl ;
    public final void rule__AllConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4012:1: ( rule__AllConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4013:2: rule__AllConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__18058);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4019:1: rule__AllConstraint__Group_1__1__Impl : ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) ;
    public final void rule__AllConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4023:1: ( ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4024:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4024:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4025:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4026:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4026:2: rule__AllConstraint__FixedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl8085);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4040:1: rule__AllConstraint__Group_2__0 : rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 ;
    public final void rule__AllConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4044:1: ( rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4045:2: rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__08119);
            rule__AllConstraint__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__08122);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4052:1: rule__AllConstraint__Group_2__0__Impl : ( 'minLen' ) ;
    public final void rule__AllConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4056:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4057:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4057:1: ( 'minLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4058:1: 'minLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__AllConstraint__Group_2__0__Impl8150); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4071:1: rule__AllConstraint__Group_2__1 : rule__AllConstraint__Group_2__1__Impl ;
    public final void rule__AllConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4075:1: ( rule__AllConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4076:2: rule__AllConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__18181);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4082:1: rule__AllConstraint__Group_2__1__Impl : ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) ;
    public final void rule__AllConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4086:1: ( ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4087:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4087:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4088:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4089:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4089:2: rule__AllConstraint__MinLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl8208);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4103:1: rule__AllConstraint__Group_3__0 : rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 ;
    public final void rule__AllConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4107:1: ( rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4108:2: rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__08242);
            rule__AllConstraint__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__08245);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4115:1: rule__AllConstraint__Group_3__0__Impl : ( 'maxLen' ) ;
    public final void rule__AllConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4119:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4120:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4120:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4121:1: 'maxLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__AllConstraint__Group_3__0__Impl8273); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4134:1: rule__AllConstraint__Group_3__1 : rule__AllConstraint__Group_3__1__Impl ;
    public final void rule__AllConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4138:1: ( rule__AllConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4139:2: rule__AllConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__18304);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4145:1: rule__AllConstraint__Group_3__1__Impl : ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) ;
    public final void rule__AllConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4149:1: ( ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4150:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4150:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4151:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenAssignment_3_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4152:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4152:2: rule__AllConstraint__MaxLenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl8331);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4166:1: rule__AllConstraint__Group_4__0 : rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 ;
    public final void rule__AllConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4170:1: ( rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4171:2: rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__08365);
            rule__AllConstraint__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__08368);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4178:1: rule__AllConstraint__Group_4__0__Impl : ( 'fixeLen' ) ;
    public final void rule__AllConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4182:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4183:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4183:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4184:1: 'fixeLen'
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__AllConstraint__Group_4__0__Impl8396); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4197:1: rule__AllConstraint__Group_4__1 : rule__AllConstraint__Group_4__1__Impl ;
    public final void rule__AllConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4201:1: ( rule__AllConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4202:2: rule__AllConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__18427);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4208:1: rule__AllConstraint__Group_4__1__Impl : ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) ;
    public final void rule__AllConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4212:1: ( ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4213:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4213:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4214:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4215:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4215:2: rule__AllConstraint__FixeLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl8454);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4229:1: rule__AllConstraint__Group_5__0 : rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 ;
    public final void rule__AllConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4233:1: ( rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4234:2: rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__08488);
            rule__AllConstraint__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__08491);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4241:1: rule__AllConstraint__Group_5__0__Impl : ( 'paddle' ) ;
    public final void rule__AllConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4245:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4246:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4246:1: ( 'paddle' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4247:1: 'paddle'
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__AllConstraint__Group_5__0__Impl8519); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4260:1: rule__AllConstraint__Group_5__1 : rule__AllConstraint__Group_5__1__Impl ;
    public final void rule__AllConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4264:1: ( rule__AllConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4265:2: rule__AllConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__18550);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4271:1: rule__AllConstraint__Group_5__1__Impl : ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) ;
    public final void rule__AllConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4275:1: ( ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4276:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4276:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4277:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleAssignment_5_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4278:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4278:2: rule__AllConstraint__PaddleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl8577);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4292:1: rule__AllConstraint__Group_8__0 : rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1 ;
    public final void rule__AllConstraint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4296:1: ( rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4297:2: rule__AllConstraint__Group_8__0__Impl rule__AllConstraint__Group_8__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_8__0__Impl_in_rule__AllConstraint__Group_8__08611);
            rule__AllConstraint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_8__1_in_rule__AllConstraint__Group_8__08614);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4304:1: rule__AllConstraint__Group_8__0__Impl : ( ( rule__AllConstraint__DerivedAssignment_8_0 ) ) ;
    public final void rule__AllConstraint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4308:1: ( ( ( rule__AllConstraint__DerivedAssignment_8_0 ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4309:1: ( ( rule__AllConstraint__DerivedAssignment_8_0 ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4309:1: ( ( rule__AllConstraint__DerivedAssignment_8_0 ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4310:1: ( rule__AllConstraint__DerivedAssignment_8_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedAssignment_8_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4311:1: ( rule__AllConstraint__DerivedAssignment_8_0 )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4311:2: rule__AllConstraint__DerivedAssignment_8_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__DerivedAssignment_8_0_in_rule__AllConstraint__Group_8__0__Impl8641);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4321:1: rule__AllConstraint__Group_8__1 : rule__AllConstraint__Group_8__1__Impl ;
    public final void rule__AllConstraint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4325:1: ( rule__AllConstraint__Group_8__1__Impl )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4326:2: rule__AllConstraint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_8__1__Impl_in_rule__AllConstraint__Group_8__18671);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4332:1: rule__AllConstraint__Group_8__1__Impl : ( ( rule__AllConstraint__WritableAssignment_8_1 )? ) ;
    public final void rule__AllConstraint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4336:1: ( ( ( rule__AllConstraint__WritableAssignment_8_1 )? ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4337:1: ( ( rule__AllConstraint__WritableAssignment_8_1 )? )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4337:1: ( ( rule__AllConstraint__WritableAssignment_8_1 )? )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4338:1: ( rule__AllConstraint__WritableAssignment_8_1 )?
            {
             before(grammarAccess.getAllConstraintAccess().getWritableAssignment_8_1()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4339:1: ( rule__AllConstraint__WritableAssignment_8_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4339:2: rule__AllConstraint__WritableAssignment_8_1
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__WritableAssignment_8_1_in_rule__AllConstraint__Group_8__1__Impl8698);
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


    // $ANTLR start "rule__DomainModelConstraint__ImportsAssignment_0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4354:1: rule__DomainModelConstraint__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__DomainModelConstraint__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4358:1: ( ( ruleImport ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4359:1: ( ruleImport )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4359:1: ( ruleImport )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4360:1: ruleImport
            {
             before(grammarAccess.getDomainModelConstraintAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__DomainModelConstraint__ImportsAssignment_08738);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainModelConstraintAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__ImportsAssignment_0"


    // $ANTLR start "rule__DomainModelConstraint__ElementsAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4369:1: rule__DomainModelConstraint__ElementsAssignment_1 : ( ruleAbstractElementConstraint ) ;
    public final void rule__DomainModelConstraint__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4373:1: ( ( ruleAbstractElementConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4374:1: ( ruleAbstractElementConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4374:1: ( ruleAbstractElementConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4375:1: ruleAbstractElementConstraint
            {
             before(grammarAccess.getDomainModelConstraintAccess().getElementsAbstractElementConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractElementConstraint_in_rule__DomainModelConstraint__ElementsAssignment_18769);
            ruleAbstractElementConstraint();

            state._fsp--;

             after(grammarAccess.getDomainModelConstraintAccess().getElementsAbstractElementConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModelConstraint__ElementsAssignment_1"


    // $ANTLR start "rule__FileSpecification__FormatAssignment_0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4384:1: rule__FileSpecification__FormatAssignment_0 : ( ( 'XSD' ) ) ;
    public final void rule__FileSpecification__FormatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4388:1: ( ( ( 'XSD' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4389:1: ( ( 'XSD' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4389:1: ( ( 'XSD' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4390:1: ( 'XSD' )
            {
             before(grammarAccess.getFileSpecificationAccess().getFormatXSDKeyword_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4391:1: ( 'XSD' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4392:1: 'XSD'
            {
             before(grammarAccess.getFileSpecificationAccess().getFormatXSDKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__FileSpecification__FormatAssignment_08805); 
             after(grammarAccess.getFileSpecificationAccess().getFormatXSDKeyword_0_0()); 

            }

             after(grammarAccess.getFileSpecificationAccess().getFormatXSDKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__FormatAssignment_0"


    // $ANTLR start "rule__FileSpecification__DelimiterAssignment_3_2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4407:1: rule__FileSpecification__DelimiterAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__FileSpecification__DelimiterAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4411:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4412:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4412:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4413:1: RULE_STRING
            {
             before(grammarAccess.getFileSpecificationAccess().getDelimiterSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FileSpecification__DelimiterAssignment_3_28844); 
             after(grammarAccess.getFileSpecificationAccess().getDelimiterSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileSpecification__DelimiterAssignment_3_2"


    // $ANTLR start "rule__FreeSpecification__LinesAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4422:1: rule__FreeSpecification__LinesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FreeSpecification__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4426:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4427:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4427:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4428:1: RULE_STRING
            {
             before(grammarAccess.getFreeSpecificationAccess().getLinesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FreeSpecification__LinesAssignment_18875); 
             after(grammarAccess.getFreeSpecificationAccess().getLinesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeSpecification__LinesAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4437:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4441:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4442:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4442:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4443:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_18906);
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


    // $ANTLR start "rule__PackageConstraint__PackageDeclarationAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4452:1: rule__PackageConstraint__PackageDeclarationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PackageConstraint__PackageDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4456:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4457:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4457:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4458:1: ( RULE_ID )
            {
             before(grammarAccess.getPackageConstraintAccess().getPackageDeclarationPackageDeclarationCrossReference_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4459:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4460:1: RULE_ID
            {
             before(grammarAccess.getPackageConstraintAccess().getPackageDeclarationPackageDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PackageConstraint__PackageDeclarationAssignment_18941); 
             after(grammarAccess.getPackageConstraintAccess().getPackageDeclarationPackageDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPackageConstraintAccess().getPackageDeclarationPackageDeclarationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__PackageDeclarationAssignment_1"


    // $ANTLR start "rule__PackageConstraint__PrefixAssignment_2_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4471:1: rule__PackageConstraint__PrefixAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageConstraint__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4475:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4476:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4476:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4477:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageConstraintAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageConstraint__PrefixAssignment_2_18976);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageConstraintAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__PrefixAssignment_2_1"


    // $ANTLR start "rule__PackageConstraint__NamespaceAssignment_3_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4486:1: rule__PackageConstraint__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PackageConstraint__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4490:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4491:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4491:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4492:1: RULE_STRING
            {
             before(grammarAccess.getPackageConstraintAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageConstraint__NamespaceAssignment_3_19007); 
             after(grammarAccess.getPackageConstraintAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__NamespaceAssignment_3_1"


    // $ANTLR start "rule__PackageConstraint__TypesAssignment_5"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4501:1: rule__PackageConstraint__TypesAssignment_5 : ( ruleTypeConstraint ) ;
    public final void rule__PackageConstraint__TypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4505:1: ( ( ruleTypeConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4506:1: ( ruleTypeConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4506:1: ( ruleTypeConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4507:1: ruleTypeConstraint
            {
             before(grammarAccess.getPackageConstraintAccess().getTypesTypeConstraintParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTypeConstraint_in_rule__PackageConstraint__TypesAssignment_59038);
            ruleTypeConstraint();

            state._fsp--;

             after(grammarAccess.getPackageConstraintAccess().getTypesTypeConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageConstraint__TypesAssignment_5"


    // $ANTLR start "rule__DataTypeConstraint__DataTypeAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4516:1: rule__DataTypeConstraint__DataTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataTypeConstraint__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4520:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4521:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4521:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4522:1: ( RULE_ID )
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4523:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4524:1: RULE_ID
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataTypeConstraint__DataTypeAssignment_19073); 
             after(grammarAccess.getDataTypeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDataTypeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__DataTypeAssignment_1"


    // $ANTLR start "rule__DataTypeConstraint__ConstraintAssignment_2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4535:1: rule__DataTypeConstraint__ConstraintAssignment_2 : ( ruleConstraint ) ;
    public final void rule__DataTypeConstraint__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4539:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4540:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4540:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4541:1: ruleConstraint
            {
             before(grammarAccess.getDataTypeConstraintAccess().getConstraintConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__DataTypeConstraint__ConstraintAssignment_29108);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getDataTypeConstraintAccess().getConstraintConstraintParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__ConstraintAssignment_2"


    // $ANTLR start "rule__DataTypeConstraint__DescriptionAssignment_3"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4550:1: rule__DataTypeConstraint__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DataTypeConstraint__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4554:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4555:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4555:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4556:1: RULE_STRING
            {
             before(grammarAccess.getDataTypeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataTypeConstraint__DescriptionAssignment_39139); 
             after(grammarAccess.getDataTypeConstraintAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeConstraint__DescriptionAssignment_3"


    // $ANTLR start "rule__EntityConstraint__EntityAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4565:1: rule__EntityConstraint__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityConstraint__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4569:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4570:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4570:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4571:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityConstraintAccess().getEntityEntityCrossReference_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4572:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4573:1: RULE_ID
            {
             before(grammarAccess.getEntityConstraintAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityConstraint__EntityAssignment_19174); 
             after(grammarAccess.getEntityConstraintAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityConstraintAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__EntityAssignment_1"


    // $ANTLR start "rule__EntityConstraint__DescriptionAssignment_2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4584:1: rule__EntityConstraint__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EntityConstraint__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4588:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4589:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4589:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4590:1: RULE_STRING
            {
             before(grammarAccess.getEntityConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EntityConstraint__DescriptionAssignment_29209); 
             after(grammarAccess.getEntityConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__DescriptionAssignment_2"


    // $ANTLR start "rule__EntityConstraint__FeaturesAssignment_4"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4599:1: rule__EntityConstraint__FeaturesAssignment_4 : ( ruleFeatureConstraint ) ;
    public final void rule__EntityConstraint__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4603:1: ( ( ruleFeatureConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4604:1: ( ruleFeatureConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4604:1: ( ruleFeatureConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4605:1: ruleFeatureConstraint
            {
             before(grammarAccess.getEntityConstraintAccess().getFeaturesFeatureConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeatureConstraint_in_rule__EntityConstraint__FeaturesAssignment_49240);
            ruleFeatureConstraint();

            state._fsp--;

             after(grammarAccess.getEntityConstraintAccess().getFeaturesFeatureConstraintParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConstraint__FeaturesAssignment_4"


    // $ANTLR start "rule__FeatureConstraint__ConstraintAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4614:1: rule__FeatureConstraint__ConstraintAssignment_1 : ( ruleConstraint ) ;
    public final void rule__FeatureConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4618:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4619:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4619:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4620:1: ruleConstraint
            {
             before(grammarAccess.getFeatureConstraintAccess().getConstraintConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__FeatureConstraint__ConstraintAssignment_19271);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureConstraintAccess().getConstraintConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__FeatureConstraint__DescriptionAssignment_2"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4629:1: rule__FeatureConstraint__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FeatureConstraint__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4633:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4634:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4634:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4635:1: RULE_STRING
            {
             before(grammarAccess.getFeatureConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureConstraint__DescriptionAssignment_29302); 
             after(grammarAccess.getFeatureConstraintAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureConstraint__DescriptionAssignment_2"


    // $ANTLR start "rule__AttributeConstraint__AttributeAssignment"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4644:1: rule__AttributeConstraint__AttributeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__AttributeConstraint__AttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4648:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4649:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4649:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4650:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeAttributeCrossReference_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4651:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4652:1: RULE_ID
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeConstraint__AttributeAssignment9337); 
             after(grammarAccess.getAttributeConstraintAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getAttributeConstraintAccess().getAttributeAttributeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__AttributeAssignment"


    // $ANTLR start "rule__BoolConstraint__ConstraintAssignment"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4663:1: rule__BoolConstraint__ConstraintAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BoolConstraint__ConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4667:1: ( ( ( 'boolean' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4668:1: ( ( 'boolean' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4668:1: ( ( 'boolean' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4669:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4670:1: ( 'boolean' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4671:1: 'boolean'
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__BoolConstraint__ConstraintAssignment9377); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4686:1: rule__StringConstraint__ConstraintAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__StringConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4690:1: ( ( ( 'string' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4691:1: ( ( 'string' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4691:1: ( ( 'string' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4692:1: ( 'string' )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4693:1: ( 'string' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4694:1: 'string'
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__StringConstraint__ConstraintAssignment_09421); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4709:1: rule__StringConstraint__ConstraintRefAssignment_1 : ( ruleAllConstraint ) ;
    public final void rule__StringConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4713:1: ( ( ruleAllConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4714:1: ( ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4714:1: ( ruleAllConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4715:1: ruleAllConstraint
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_19460);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4724:1: rule__StringConstraint__RegularExpressionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__RegularExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4728:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4729:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4729:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4730:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_19491); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4739:1: rule__DateTimeConstraint__ConstraintAssignment_0 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4743:1: ( ( ( 'datetime' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4744:1: ( ( 'datetime' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4744:1: ( ( 'datetime' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4745:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4746:1: ( 'datetime' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4747:1: 'datetime'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__DateTimeConstraint__ConstraintAssignment_09527); 
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


    // $ANTLR start "rule__DateTimeConstraint__DataTypeAssignment_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4762:1: rule__DateTimeConstraint__DataTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DateTimeConstraint__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4766:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4767:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4767:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4768:1: ( RULE_ID )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4769:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4770:1: RULE_ID
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_19570); 
             after(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__DataTypeAssignment_1"


    // $ANTLR start "rule__DateTimeConstraint__HasDefaultAssignment_2_0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4781:1: rule__DateTimeConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4785:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4786:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4786:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4787:1: ( 'default' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4788:1: ( 'default' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4789:1: 'default'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,41,FOLLOW_41_in_rule__DateTimeConstraint__HasDefaultAssignment_2_09610); 
             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }

             after(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__HasDefaultAssignment_2_0"


    // $ANTLR start "rule__DateTimeConstraint__DefaultValueAssignment_2_1"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4804:1: rule__DateTimeConstraint__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeConstraint__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4808:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4809:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4809:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4810:1: RULE_STRING
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_19649); 
             after(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateTimeConstraint__DefaultValueAssignment_2_1"


    // $ANTLR start "rule__DecimalConstraint__ConstraintAssignment_0"
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4819:1: rule__DecimalConstraint__ConstraintAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4823:1: ( ( ( 'decimal' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4824:1: ( ( 'decimal' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4824:1: ( ( 'decimal' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4825:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4826:1: ( 'decimal' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4827:1: 'decimal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__DecimalConstraint__ConstraintAssignment_09685); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4842:1: rule__DecimalConstraint__ConstraintRefAssignment_1 : ( ruleNumberConstraint ) ;
    public final void rule__DecimalConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4846:1: ( ( ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4847:1: ( ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4847:1: ( ruleNumberConstraint )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4848:1: ruleNumberConstraint
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_19724);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4857:1: rule__EnumerationConstraint__UsageAssignment_1 : ( ruleEnumUsage ) ;
    public final void rule__EnumerationConstraint__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4861:1: ( ( ruleEnumUsage ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4862:1: ( ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4862:1: ( ruleEnumUsage )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4863:1: ruleEnumUsage
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_19755);
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4872:1: rule__EnumerationConstraint__FixeLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EnumerationConstraint__FixeLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4876:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4877:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4877:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4878:1: RULE_INT
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_19786); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4887:1: rule__EnumerationConstraint__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationConstraint__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4891:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4892:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4892:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4893:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4894:1: ( 'default' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4895:1: 'default'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumerationConstraint__HasDefaultAssignment_3_09822); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4910:1: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4914:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4915:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4915:1: ( RULE_ID )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4916:1: RULE_ID
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_19861); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4925:1: rule__NumberConstraint__HasDefaultAssignment_0_0 : ( ( 'default' ) ) ;
    public final void rule__NumberConstraint__HasDefaultAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4929:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4930:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4930:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4931:1: ( 'default' )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4932:1: ( 'default' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4933:1: 'default'
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__NumberConstraint__HasDefaultAssignment_0_09897); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4948:1: rule__NumberConstraint__DefaultValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__DefaultValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4952:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4953:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4953:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4954:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_0_19936); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4963:1: rule__NumberConstraint__IsFixedAssignment_1_0 : ( ( 'fixed' ) ) ;
    public final void rule__NumberConstraint__IsFixedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4967:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4968:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4968:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4969:1: ( 'fixed' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4970:1: ( 'fixed' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4971:1: 'fixed'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            match(input,43,FOLLOW_43_in_rule__NumberConstraint__IsFixedAssignment_1_09972); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4986:1: rule__NumberConstraint__FixedValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__FixedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4990:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4991:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4991:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:4992:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_1_110011); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5001:1: rule__NumberConstraint__MinValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5005:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5006:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5006:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5007:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_2_110042); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5016:1: rule__NumberConstraint__MaxValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5020:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5021:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5021:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5022:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_3_110073); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5031:1: rule__NumberConstraint__MinLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5035:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5036:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5036:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5037:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_110104); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5046:1: rule__NumberConstraint__MaxLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5050:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5051:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5051:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5052:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_110135); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5061:1: rule__NumberConstraint__FixeLenAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__FixeLenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5065:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5066:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5066:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5067:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_110166); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5076:1: rule__NumberConstraint__PaddleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__PaddleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5080:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5081:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5081:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5082:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_110197); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5091:1: rule__NumberConstraint__IsIdAssignment_8 : ( ( 'id' ) ) ;
    public final void rule__NumberConstraint__IsIdAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5095:1: ( ( ( 'id' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5096:1: ( ( 'id' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5096:1: ( ( 'id' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5097:1: ( 'id' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5098:1: ( 'id' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5099:1: 'id'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsIdIdKeyword_8_0()); 
            match(input,44,FOLLOW_44_in_rule__NumberConstraint__IsIdAssignment_810233); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5114:1: rule__NumberConstraint__NullableAssignment_9 : ( ( 'nullable' ) ) ;
    public final void rule__NumberConstraint__NullableAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5118:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5119:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5119:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5120:1: ( 'nullable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5121:1: ( 'nullable' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5122:1: 'nullable'
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_9_0()); 
            match(input,45,FOLLOW_45_in_rule__NumberConstraint__NullableAssignment_910277); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5137:1: rule__NumberConstraint__DerivedAssignment_10_0 : ( ( 'derived' ) ) ;
    public final void rule__NumberConstraint__DerivedAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5141:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5142:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5142:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5143:1: ( 'derived' )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5144:1: ( 'derived' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5145:1: 'derived'
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_10_0_0()); 
            match(input,46,FOLLOW_46_in_rule__NumberConstraint__DerivedAssignment_10_010321); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5160:1: rule__NumberConstraint__WritableAssignment_10_1 : ( ( 'writable' ) ) ;
    public final void rule__NumberConstraint__WritableAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5164:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5165:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5165:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5166:1: ( 'writable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5167:1: ( 'writable' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5168:1: 'writable'
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_10_1_0()); 
            match(input,47,FOLLOW_47_in_rule__NumberConstraint__WritableAssignment_10_110365); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5183:1: rule__NumberConstraint__IsXSDAttAssignment_11 : ( ( 'xsdA.' ) ) ;
    public final void rule__NumberConstraint__IsXSDAttAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5187:1: ( ( ( 'xsdA.' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5188:1: ( ( 'xsdA.' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5188:1: ( ( 'xsdA.' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5189:1: ( 'xsdA.' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5190:1: ( 'xsdA.' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5191:1: 'xsdA.'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAKeyword_11_0()); 
            match(input,48,FOLLOW_48_in_rule__NumberConstraint__IsXSDAttAssignment_1110409); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5206:1: rule__AllConstraint__HasDefaultAssignment_0_0 : ( ( 'default' ) ) ;
    public final void rule__AllConstraint__HasDefaultAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5210:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5211:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5211:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5212:1: ( 'default' )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5213:1: ( 'default' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5214:1: 'default'
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            match(input,41,FOLLOW_41_in_rule__AllConstraint__HasDefaultAssignment_0_010453); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5229:1: rule__AllConstraint__DefaultValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__DefaultValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5233:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5234:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5234:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5235:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_110492); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5244:1: rule__AllConstraint__IsFixedAssignment_1_0 : ( ( 'fixed' ) ) ;
    public final void rule__AllConstraint__IsFixedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5248:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5249:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5249:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5250:1: ( 'fixed' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5251:1: ( 'fixed' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5252:1: 'fixed'
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            match(input,43,FOLLOW_43_in_rule__AllConstraint__IsFixedAssignment_1_010528); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5267:1: rule__AllConstraint__FixedValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__FixedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5271:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5272:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5272:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5273:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_110567); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5282:1: rule__AllConstraint__MinLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MinLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5286:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5287:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5287:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5288:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_110598); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5297:1: rule__AllConstraint__MaxLenAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MaxLenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5301:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5302:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5302:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5303:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_110629); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5312:1: rule__AllConstraint__FixeLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__FixeLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5316:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5317:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5317:1: ( RULE_INT )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5318:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_110660); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5327:1: rule__AllConstraint__PaddleAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__PaddleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5331:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5332:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5332:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5333:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_110691); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5342:1: rule__AllConstraint__IsIdAssignment_6 : ( ( 'id' ) ) ;
    public final void rule__AllConstraint__IsIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5346:1: ( ( ( 'id' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5347:1: ( ( 'id' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5347:1: ( ( 'id' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5348:1: ( 'id' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5349:1: ( 'id' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5350:1: 'id'
            {
             before(grammarAccess.getAllConstraintAccess().getIsIdIdKeyword_6_0()); 
            match(input,44,FOLLOW_44_in_rule__AllConstraint__IsIdAssignment_610727); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5365:1: rule__AllConstraint__NullableAssignment_7 : ( ( 'nullable' ) ) ;
    public final void rule__AllConstraint__NullableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5369:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5370:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5370:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5371:1: ( 'nullable' )
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5372:1: ( 'nullable' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5373:1: 'nullable'
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_7_0()); 
            match(input,45,FOLLOW_45_in_rule__AllConstraint__NullableAssignment_710771); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5388:1: rule__AllConstraint__DerivedAssignment_8_0 : ( ( 'derived' ) ) ;
    public final void rule__AllConstraint__DerivedAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5392:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5393:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5393:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5394:1: ( 'derived' )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5395:1: ( 'derived' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5396:1: 'derived'
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_8_0_0()); 
            match(input,46,FOLLOW_46_in_rule__AllConstraint__DerivedAssignment_8_010815); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5411:1: rule__AllConstraint__WritableAssignment_8_1 : ( ( 'writable' ) ) ;
    public final void rule__AllConstraint__WritableAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5415:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5416:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5416:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5417:1: ( 'writable' )
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5418:1: ( 'writable' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5419:1: 'writable'
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_8_1_0()); 
            match(input,47,FOLLOW_47_in_rule__AllConstraint__WritableAssignment_8_110859); 
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
    // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5434:1: rule__AllConstraint__IsXSDAttAssignment_9 : ( ( 'xsdA.' ) ) ;
    public final void rule__AllConstraint__IsXSDAttAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5438:1: ( ( ( 'xsdA.' ) ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5439:1: ( ( 'xsdA.' ) )
            {
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5439:1: ( ( 'xsdA.' ) )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5440:1: ( 'xsdA.' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5441:1: ( 'xsdA.' )
            // ../fr.chaunier.xtext.constraint.ui/src-gen/fr/chaunier/xtext/constraint/ui/contentassist/antlr/internal/InternalCstDsl.g:5442:1: 'xsdA.'
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAKeyword_9_0()); 
            match(input,48,FOLLOW_48_in_rule__AllConstraint__IsXSDAttAssignment_910903); 
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


 

    public static final BitSet FOLLOW_ruleDomainModelConstraint_in_entryRuleDomainModelConstraint61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModelConstraint68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__Group__0_in_ruleDomainModelConstraint94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileSpecification_in_entryRuleFileSpecification123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileSpecification130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__Alternatives_in_ruleFileSpecification156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeSpecification_in_entryRuleFreeSpecification183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeSpecification190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeSpecification__Group__0_in_ruleFreeSpecification216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElementConstraint_in_entryRuleAbstractElementConstraint243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElementConstraint250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElementConstraint__Alternatives_in_ruleAbstractElementConstraint276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageConstraint_in_entryRulePackageConstraint483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageConstraint490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__0_in_rulePackageConstraint516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeConstraint_in_entryRuleTypeConstraint543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeConstraint550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeConstraint__Alternatives_in_ruleTypeConstraint576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_entryRuleDataTypeConstraint603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeConstraint610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__0_in_ruleDataTypeConstraint636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_entryRuleEntityConstraint663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConstraint670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__0_in_ruleEntityConstraint696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureConstraint_in_entryRuleFeatureConstraint723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureConstraint730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__0_in_ruleFeatureConstraint756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_entryRuleAttributeConstraint783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeConstraint790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeConstraint__AttributeAssignment_in_ruleAttributeConstraint816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__FormatAssignment_0_in_rule__FileSpecification__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__FileSpecification__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FileSpecification__Alternatives1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__0_in_rule__FileSpecification__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FileSpecification__Alternatives1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageConstraint_in_rule__AbstractElementConstraint__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_rule__AbstractElementConstraint__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_rule__AbstractElementConstraint__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConstraint_in_rule__TypeConstraint__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeConstraint_in_rule__TypeConstraint__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumUsage__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumUsage__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__Group__0__Impl_in_rule__DomainModelConstraint__Group__01750 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__Group__1_in_rule__DomainModelConstraint__Group__01753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__ImportsAssignment_0_in_rule__DomainModelConstraint__Group__0__Impl1780 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__Group__1__Impl_in_rule__DomainModelConstraint__Group__11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModelConstraint__ElementsAssignment_1_in_rule__DomainModelConstraint__Group__1__Impl1838 = new BitSet(new long[]{0x0000000018400002L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__0__Impl_in_rule__FileSpecification__Group_3__01873 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__1_in_rule__FileSpecification__Group_3__01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FileSpecification__Group_3__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__1__Impl_in_rule__FileSpecification__Group_3__11935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__2_in_rule__FileSpecification__Group_3__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FileSpecification__Group_3__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__Group_3__2__Impl_in_rule__FileSpecification__Group_3__21997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileSpecification__DelimiterAssignment_3_2_in_rule__FileSpecification__Group_3__2__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeSpecification__Group__0__Impl_in_rule__FreeSpecification__Group__02060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FreeSpecification__Group__1_in_rule__FreeSpecification__Group__02063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FreeSpecification__Group__0__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeSpecification__Group__1__Impl_in_rule__FreeSpecification__Group__12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeSpecification__LinesAssignment_1_in_rule__FreeSpecification__Group__1__Impl2149 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__02307 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__02310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedNameWithWildCard__Group__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02432 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2518 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__0__Impl_in_rule__PackageConstraint__Group__02675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__1_in_rule__PackageConstraint__Group__02678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageConstraint__Group__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__1__Impl_in_rule__PackageConstraint__Group__12737 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__2_in_rule__PackageConstraint__Group__12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__PackageDeclarationAssignment_1_in_rule__PackageConstraint__Group__1__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__2__Impl_in_rule__PackageConstraint__Group__22797 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__3_in_rule__PackageConstraint__Group__22800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_2__0_in_rule__PackageConstraint__Group__2__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__3__Impl_in_rule__PackageConstraint__Group__32857 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__4_in_rule__PackageConstraint__Group__32860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_3__0_in_rule__PackageConstraint__Group__3__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__4__Impl_in_rule__PackageConstraint__Group__42917 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__5_in_rule__PackageConstraint__Group__42920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageConstraint__Group__4__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__5__Impl_in_rule__PackageConstraint__Group__52979 = new BitSet(new long[]{0x0000000019400000L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__6_in_rule__PackageConstraint__Group__52982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__TypesAssignment_5_in_rule__PackageConstraint__Group__5__Impl3009 = new BitSet(new long[]{0x0000000018400002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group__6__Impl_in_rule__PackageConstraint__Group__63040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PackageConstraint__Group__6__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_2__0__Impl_in_rule__PackageConstraint__Group_2__03113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_2__1_in_rule__PackageConstraint__Group_2__03116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PackageConstraint__Group_2__0__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_2__1__Impl_in_rule__PackageConstraint__Group_2__13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__PrefixAssignment_2_1_in_rule__PackageConstraint__Group_2__1__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_3__0__Impl_in_rule__PackageConstraint__Group_3__03236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_3__1_in_rule__PackageConstraint__Group_3__03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PackageConstraint__Group_3__0__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__Group_3__1__Impl_in_rule__PackageConstraint__Group_3__13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageConstraint__NamespaceAssignment_3_1_in_rule__PackageConstraint__Group_3__1__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__0__Impl_in_rule__DataTypeConstraint__Group__03359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__1_in_rule__DataTypeConstraint__Group__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataTypeConstraint__Group__0__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__1__Impl_in_rule__DataTypeConstraint__Group__13421 = new BitSet(new long[]{0x000005C040000020L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__2_in_rule__DataTypeConstraint__Group__13424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__DataTypeAssignment_1_in_rule__DataTypeConstraint__Group__1__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__2__Impl_in_rule__DataTypeConstraint__Group__23481 = new BitSet(new long[]{0x000005C040000020L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__3_in_rule__DataTypeConstraint__Group__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__ConstraintAssignment_2_in_rule__DataTypeConstraint__Group__2__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__Group__3__Impl_in_rule__DataTypeConstraint__Group__33542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeConstraint__DescriptionAssignment_3_in_rule__DataTypeConstraint__Group__3__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__0__Impl_in_rule__EntityConstraint__Group__03608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__1_in_rule__EntityConstraint__Group__03611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EntityConstraint__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__1__Impl_in_rule__EntityConstraint__Group__13670 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__2_in_rule__EntityConstraint__Group__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__EntityAssignment_1_in_rule__EntityConstraint__Group__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__2__Impl_in_rule__EntityConstraint__Group__23730 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__3_in_rule__EntityConstraint__Group__23733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__DescriptionAssignment_2_in_rule__EntityConstraint__Group__2__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__3__Impl_in_rule__EntityConstraint__Group__33791 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__4_in_rule__EntityConstraint__Group__33794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityConstraint__Group__3__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__4__Impl_in_rule__EntityConstraint__Group__43853 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__5_in_rule__EntityConstraint__Group__43856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConstraint__FeaturesAssignment_4_in_rule__EntityConstraint__Group__4__Impl3883 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EntityConstraint__Group__5__Impl_in_rule__EntityConstraint__Group__53914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EntityConstraint__Group__5__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__0__Impl_in_rule__FeatureConstraint__Group__03985 = new BitSet(new long[]{0x000005C040000020L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__1_in_rule__FeatureConstraint__Group__03988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeConstraint_in_rule__FeatureConstraint__Group__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__1__Impl_in_rule__FeatureConstraint__Group__14044 = new BitSet(new long[]{0x000005C040000020L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__2_in_rule__FeatureConstraint__Group__14047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__ConstraintAssignment_1_in_rule__FeatureConstraint__Group__1__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__Group__2__Impl_in_rule__FeatureConstraint__Group__24105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureConstraint__DescriptionAssignment_2_in_rule__FeatureConstraint__Group__2__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__04169 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__04172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__14229 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__14232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__24289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__04353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StringConstraint__Group_2__0__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__14415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__04476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__04479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__14536 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__14539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__24596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__04660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__04663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__14720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__04781 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__04784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__04902 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumerationConstraint__Group__0__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__14964 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__25024 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__25027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__35085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__05151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumerationConstraint__Group_2__0__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__15213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__05274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__05277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__15334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__05395 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__05398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__15456 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__25517 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__25520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__35578 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__35581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__45639 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__45642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__55700 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__55703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__65761 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__65764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__75822 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__75825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__85883 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__85886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsIdAssignment_8_in_rule__NumberConstraint__Group__8__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__95944 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__95947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__NullableAssignment_9_in_rule__NumberConstraint__Group__9__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__106005 = new BitSet(new long[]{0x00017A1F80000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__11_in_rule__NumberConstraint__Group__106008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__0_in_rule__NumberConstraint__Group__10__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__11__Impl_in_rule__NumberConstraint__Group__116066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_11_in_rule__NumberConstraint__Group__11__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__06148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__06151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__HasDefaultAssignment_0_0_in_rule__NumberConstraint__Group_0__0__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__16208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DefaultValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__06269 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__06272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsFixedAssignment_1_0_in_rule__NumberConstraint__Group_1__0__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__16329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixedValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__06390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__06393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NumberConstraint__Group_2__0__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__16452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__06513 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__06516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NumberConstraint__Group_3__0__Impl6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__16575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__06636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__06639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NumberConstraint__Group_4__0__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__16698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__06759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__06762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NumberConstraint__Group_5__0__Impl6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__16821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__06882 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__06885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NumberConstraint__Group_6__0__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__16944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__07005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__07008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NumberConstraint__Group_7__0__Impl7036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__17067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__0__Impl_in_rule__NumberConstraint__Group_10__07128 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__1_in_rule__NumberConstraint__Group_10__07131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DerivedAssignment_10_0_in_rule__NumberConstraint__Group_10__0__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_10__1__Impl_in_rule__NumberConstraint__Group_10__17188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__WritableAssignment_10_1_in_rule__NumberConstraint__Group_10__1__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__07250 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__07253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__17311 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__17314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__27372 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__27375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl7402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__37433 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__37436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__47494 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__47497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__57555 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__57558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__67616 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__67619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsIdAssignment_6_in_rule__AllConstraint__Group__6__Impl7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__77677 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__77680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__NullableAssignment_7_in_rule__AllConstraint__Group__7__Impl7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__87738 = new BitSet(new long[]{0x00017A1C80000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__9_in_rule__AllConstraint__Group__87741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__0_in_rule__AllConstraint__Group__8__Impl7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__9__Impl_in_rule__AllConstraint__Group__97799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsXSDAttAssignment_9_in_rule__AllConstraint__Group__9__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__07877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__07880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl7907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__17937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__07998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__08001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__18058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__08119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__08122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AllConstraint__Group_2__0__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__18181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__08242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__08245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AllConstraint__Group_3__0__Impl8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__18304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__08365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__08368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AllConstraint__Group_4__0__Impl8396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__18427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__08488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AllConstraint__Group_5__0__Impl8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__18550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl8577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__0__Impl_in_rule__AllConstraint__Group_8__08611 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__1_in_rule__AllConstraint__Group_8__08614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DerivedAssignment_8_0_in_rule__AllConstraint__Group_8__0__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_8__1__Impl_in_rule__AllConstraint__Group_8__18671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__WritableAssignment_8_1_in_rule__AllConstraint__Group_8__1__Impl8698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__DomainModelConstraint__ImportsAssignment_08738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElementConstraint_in_rule__DomainModelConstraint__ElementsAssignment_18769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FileSpecification__FormatAssignment_08805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FileSpecification__DelimiterAssignment_3_28844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeSpecification__LinesAssignment_18875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_18906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PackageConstraint__PackageDeclarationAssignment_18941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageConstraint__PrefixAssignment_2_18976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageConstraint__NamespaceAssignment_3_19007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeConstraint_in_rule__PackageConstraint__TypesAssignment_59038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataTypeConstraint__DataTypeAssignment_19073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__DataTypeConstraint__ConstraintAssignment_29108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataTypeConstraint__DescriptionAssignment_39139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityConstraint__EntityAssignment_19174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EntityConstraint__DescriptionAssignment_29209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureConstraint_in_rule__EntityConstraint__FeaturesAssignment_49240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__FeatureConstraint__ConstraintAssignment_19271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureConstraint__DescriptionAssignment_29302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeConstraint__AttributeAssignment9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__BoolConstraint__ConstraintAssignment9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__StringConstraint__ConstraintAssignment_09421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_19460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_19491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DateTimeConstraint__ConstraintAssignment_09527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_19570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DateTimeConstraint__HasDefaultAssignment_2_09610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_19649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__DecimalConstraint__ConstraintAssignment_09685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_19724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_19755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumerationConstraint__HasDefaultAssignment_3_09822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_19861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NumberConstraint__HasDefaultAssignment_0_09897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_0_19936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NumberConstraint__IsFixedAssignment_1_09972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_1_110011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_2_110042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_3_110073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_110104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_110135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_110197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NumberConstraint__IsIdAssignment_810233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NumberConstraint__NullableAssignment_910277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NumberConstraint__DerivedAssignment_10_010321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NumberConstraint__WritableAssignment_10_110365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__NumberConstraint__IsXSDAttAssignment_1110409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__AllConstraint__HasDefaultAssignment_0_010453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_110492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AllConstraint__IsFixedAssignment_1_010528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_110598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_110691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__AllConstraint__IsIdAssignment_610727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AllConstraint__NullableAssignment_710771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AllConstraint__DerivedAssignment_8_010815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AllConstraint__WritableAssignment_8_110859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AllConstraint__IsXSDAttAssignment_910903 = new BitSet(new long[]{0x0000000000000002L});

}