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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'module'", "'{'", "'}'", "';'", "'map'", "'=>'", "'set left'", "'='", "'set right'", "'ignore left'"
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:70:1: ruleModel : ( ( rule__Model__MappingModulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:74:2: ( ( ( rule__Model__MappingModulesAssignment )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:75:1: ( ( rule__Model__MappingModulesAssignment )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:75:1: ( ( rule__Model__MappingModulesAssignment )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:76:1: ( rule__Model__MappingModulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getMappingModulesAssignment()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:77:1: ( rule__Model__MappingModulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:77:2: rule__Model__MappingModulesAssignment
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


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:91:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:92:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:93:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName124);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName131); 

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
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName157);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:119:1: entryRuleMappingModule : ruleMappingModule EOF ;
    public final void entryRuleMappingModule() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:120:1: ( ruleMappingModule EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:121:1: ruleMappingModule EOF
            {
             before(grammarAccess.getMappingModuleRule()); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule184);
            ruleMappingModule();
            _fsp--;

             after(grammarAccess.getMappingModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule191); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:128:1: ruleMappingModule : ( ( rule__MappingModule__Group__0 ) ) ;
    public final void ruleMappingModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:132:2: ( ( ( rule__MappingModule__Group__0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:133:1: ( ( rule__MappingModule__Group__0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:133:1: ( ( rule__MappingModule__Group__0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:134:1: ( rule__MappingModule__Group__0 )
            {
             before(grammarAccess.getMappingModuleAccess().getGroup()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:135:1: ( rule__MappingModule__Group__0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:135:2: rule__MappingModule__Group__0
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule217);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:147:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:148:1: ( ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:149:1: ruleFeatureMap EOF
            {
             before(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap244);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getFeatureMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap251); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:156:1: ruleFeatureMap : ( ( rule__FeatureMap__Alternatives ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:160:2: ( ( ( rule__FeatureMap__Alternatives ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:161:1: ( ( rule__FeatureMap__Alternatives ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:161:1: ( ( rule__FeatureMap__Alternatives ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:162:1: ( rule__FeatureMap__Alternatives )
            {
             before(grammarAccess.getFeatureMapAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:163:1: ( rule__FeatureMap__Alternatives )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:163:2: rule__FeatureMap__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureMap__Alternatives_in_ruleFeatureMap277);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:175:1: rule__FeatureMap__Alternatives : ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) );
    public final void rule__FeatureMap__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:179:1: ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("175:1: rule__FeatureMap__Alternatives : ( ( ( rule__FeatureMap__Group_0__0 ) ) | ( ( rule__FeatureMap__Group_1__0 ) ) | ( ( rule__FeatureMap__Group_2__0 ) ) | ( ( rule__FeatureMap__Group_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:180:1: ( ( rule__FeatureMap__Group_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:180:1: ( ( rule__FeatureMap__Group_0__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:181:1: ( rule__FeatureMap__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_0()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:182:1: ( rule__FeatureMap__Group_0__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:182:2: rule__FeatureMap__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_0__0_in_rule__FeatureMap__Alternatives313);
                    rule__FeatureMap__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:186:6: ( ( rule__FeatureMap__Group_1__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:186:6: ( ( rule__FeatureMap__Group_1__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:187:1: ( rule__FeatureMap__Group_1__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_1()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:188:1: ( rule__FeatureMap__Group_1__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:188:2: rule__FeatureMap__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Alternatives331);
                    rule__FeatureMap__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:192:6: ( ( rule__FeatureMap__Group_2__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:192:6: ( ( rule__FeatureMap__Group_2__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:193:1: ( rule__FeatureMap__Group_2__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_2()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:194:1: ( rule__FeatureMap__Group_2__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:194:2: rule__FeatureMap__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_2__0_in_rule__FeatureMap__Alternatives349);
                    rule__FeatureMap__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFeatureMapAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:198:6: ( ( rule__FeatureMap__Group_3__0 ) )
                    {
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:198:6: ( ( rule__FeatureMap__Group_3__0 ) )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:199:1: ( rule__FeatureMap__Group_3__0 )
                    {
                     before(grammarAccess.getFeatureMapAccess().getGroup_3()); 
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:200:1: ( rule__FeatureMap__Group_3__0 )
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:200:2: rule__FeatureMap__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__Group_3__0_in_rule__FeatureMap__Alternatives367);
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


    // $ANTLR start rule__QualifiedName__Group__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:212:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:216:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:217:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0399);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0402);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:224:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:228:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:229:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:229:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:230:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl429); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:241:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:245:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:246:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1458);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:252:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:256:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:257:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:258:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:259:1: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:259:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl485);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:273:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:277:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:278:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0520);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0523);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:285:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:289:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:290:1: ( '.' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:290:1: ( '.' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:291:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl551); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:304:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:308:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:309:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1582);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:315:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:319:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:320:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:320:1: ( RULE_ID )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:321:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl609); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:336:1: rule__MappingModule__Group__0 : rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 ;
    public final void rule__MappingModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:340:1: ( rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:341:2: rule__MappingModule__Group__0__Impl rule__MappingModule__Group__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__0642);
            rule__MappingModule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__0645);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:348:1: rule__MappingModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__MappingModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:352:1: ( ( 'module' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:353:1: ( 'module' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:353:1: ( 'module' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:354:1: 'module'
            {
             before(grammarAccess.getMappingModuleAccess().getModuleKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__MappingModule__Group__0__Impl673); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:367:1: rule__MappingModule__Group__1 : rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 ;
    public final void rule__MappingModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:371:1: ( rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:372:2: rule__MappingModule__Group__1__Impl rule__MappingModule__Group__2
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__1704);
            rule__MappingModule__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__1707);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:379:1: rule__MappingModule__Group__1__Impl : ( ( rule__MappingModule__NameAssignment_1 ) ) ;
    public final void rule__MappingModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:383:1: ( ( ( rule__MappingModule__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:384:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:384:1: ( ( rule__MappingModule__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:385:1: ( rule__MappingModule__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModuleAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:386:1: ( rule__MappingModule__NameAssignment_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:386:2: rule__MappingModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl734);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:396:1: rule__MappingModule__Group__2 : rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 ;
    public final void rule__MappingModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:400:1: ( rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:401:2: rule__MappingModule__Group__2__Impl rule__MappingModule__Group__3
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__2764);
            rule__MappingModule__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__2767);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:408:1: rule__MappingModule__Group__2__Impl : ( '{' ) ;
    public final void rule__MappingModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:412:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:413:1: ( '{' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:413:1: ( '{' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:414:1: '{'
            {
             before(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__MappingModule__Group__2__Impl795); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:427:1: rule__MappingModule__Group__3 : rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 ;
    public final void rule__MappingModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:431:1: ( rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:432:2: rule__MappingModule__Group__3__Impl rule__MappingModule__Group__4
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__3826);
            rule__MappingModule__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__3829);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:439:1: rule__MappingModule__Group__3__Impl : ( ( rule__MappingModule__Group_3__0 )* ) ;
    public final void rule__MappingModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:443:1: ( ( ( rule__MappingModule__Group_3__0 )* ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:444:1: ( ( rule__MappingModule__Group_3__0 )* )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:444:1: ( ( rule__MappingModule__Group_3__0 )* )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:445:1: ( rule__MappingModule__Group_3__0 )*
            {
             before(grammarAccess.getMappingModuleAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:446:1: ( rule__MappingModule__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:446:2: rule__MappingModule__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__MappingModule__Group_3__0_in_rule__MappingModule__Group__3__Impl856);
            	    rule__MappingModule__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMappingModuleAccess().getGroup_3()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:456:1: rule__MappingModule__Group__4 : rule__MappingModule__Group__4__Impl ;
    public final void rule__MappingModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:460:1: ( rule__MappingModule__Group__4__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:461:2: rule__MappingModule__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__4887);
            rule__MappingModule__Group__4__Impl();
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:467:1: rule__MappingModule__Group__4__Impl : ( '}' ) ;
    public final void rule__MappingModule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:471:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:472:1: ( '}' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:472:1: ( '}' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:473:1: '}'
            {
             before(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__MappingModule__Group__4__Impl915); 
             after(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start rule__MappingModule__Group_3__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:496:1: rule__MappingModule__Group_3__0 : rule__MappingModule__Group_3__0__Impl rule__MappingModule__Group_3__1 ;
    public final void rule__MappingModule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:500:1: ( rule__MappingModule__Group_3__0__Impl rule__MappingModule__Group_3__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:501:2: rule__MappingModule__Group_3__0__Impl rule__MappingModule__Group_3__1
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_3__0__Impl_in_rule__MappingModule__Group_3__0956);
            rule__MappingModule__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__MappingModule__Group_3__1_in_rule__MappingModule__Group_3__0959);
            rule__MappingModule__Group_3__1();
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
    // $ANTLR end rule__MappingModule__Group_3__0


    // $ANTLR start rule__MappingModule__Group_3__0__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:508:1: rule__MappingModule__Group_3__0__Impl : ( ( rule__MappingModule__MappedFeaturesAssignment_3_0 ) ) ;
    public final void rule__MappingModule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:512:1: ( ( ( rule__MappingModule__MappedFeaturesAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:513:1: ( ( rule__MappingModule__MappedFeaturesAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:513:1: ( ( rule__MappingModule__MappedFeaturesAssignment_3_0 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:514:1: ( rule__MappingModule__MappedFeaturesAssignment_3_0 )
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_3_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:515:1: ( rule__MappingModule__MappedFeaturesAssignment_3_0 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:515:2: rule__MappingModule__MappedFeaturesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__MappingModule__MappedFeaturesAssignment_3_0_in_rule__MappingModule__Group_3__0__Impl986);
            rule__MappingModule__MappedFeaturesAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_3__0__Impl


    // $ANTLR start rule__MappingModule__Group_3__1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:525:1: rule__MappingModule__Group_3__1 : rule__MappingModule__Group_3__1__Impl ;
    public final void rule__MappingModule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:529:1: ( rule__MappingModule__Group_3__1__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:530:2: rule__MappingModule__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MappingModule__Group_3__1__Impl_in_rule__MappingModule__Group_3__11016);
            rule__MappingModule__Group_3__1__Impl();
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
    // $ANTLR end rule__MappingModule__Group_3__1


    // $ANTLR start rule__MappingModule__Group_3__1__Impl
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:536:1: rule__MappingModule__Group_3__1__Impl : ( ( ';' )? ) ;
    public final void rule__MappingModule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:540:1: ( ( ( ';' )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:541:1: ( ( ';' )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:541:1: ( ( ';' )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:542:1: ( ';' )?
            {
             before(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_3_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:543:1: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:544:2: ';'
                    {
                    match(input,15,FOLLOW_15_in_rule__MappingModule__Group_3__1__Impl1045); 

                    }
                    break;

            }

             after(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__Group_3__1__Impl


    // $ANTLR start rule__FeatureMap__Group_0__0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:559:1: rule__FeatureMap__Group_0__0 : rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1 ;
    public final void rule__FeatureMap__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:563:1: ( rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:564:2: rule__FeatureMap__Group_0__0__Impl rule__FeatureMap__Group_0__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__0__Impl_in_rule__FeatureMap__Group_0__01082);
            rule__FeatureMap__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__1_in_rule__FeatureMap__Group_0__01085);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:571:1: rule__FeatureMap__Group_0__0__Impl : ( 'map' ) ;
    public final void rule__FeatureMap__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:575:1: ( ( 'map' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:576:1: ( 'map' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:576:1: ( 'map' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:577:1: 'map'
            {
             before(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__FeatureMap__Group_0__0__Impl1113); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:590:1: rule__FeatureMap__Group_0__1 : rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2 ;
    public final void rule__FeatureMap__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:594:1: ( rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:595:2: rule__FeatureMap__Group_0__1__Impl rule__FeatureMap__Group_0__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__1__Impl_in_rule__FeatureMap__Group_0__11144);
            rule__FeatureMap__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__2_in_rule__FeatureMap__Group_0__11147);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:602:1: rule__FeatureMap__Group_0__1__Impl : ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) ) ;
    public final void rule__FeatureMap__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:606:1: ( ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:607:1: ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:607:1: ( ( rule__FeatureMap__LeftFieldAssignment_0_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:608:1: ( rule__FeatureMap__LeftFieldAssignment_0_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAssignment_0_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:609:1: ( rule__FeatureMap__LeftFieldAssignment_0_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:609:2: rule__FeatureMap__LeftFieldAssignment_0_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__LeftFieldAssignment_0_1_in_rule__FeatureMap__Group_0__1__Impl1174);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:619:1: rule__FeatureMap__Group_0__2 : rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3 ;
    public final void rule__FeatureMap__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:623:1: ( rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:624:2: rule__FeatureMap__Group_0__2__Impl rule__FeatureMap__Group_0__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__2__Impl_in_rule__FeatureMap__Group_0__21204);
            rule__FeatureMap__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__3_in_rule__FeatureMap__Group_0__21207);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:631:1: rule__FeatureMap__Group_0__2__Impl : ( '=>' ) ;
    public final void rule__FeatureMap__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:635:1: ( ( '=>' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:636:1: ( '=>' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:636:1: ( '=>' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:637:1: '=>'
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_2()); 
            match(input,17,FOLLOW_17_in_rule__FeatureMap__Group_0__2__Impl1235); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:650:1: rule__FeatureMap__Group_0__3 : rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4 ;
    public final void rule__FeatureMap__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:654:1: ( rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:655:2: rule__FeatureMap__Group_0__3__Impl rule__FeatureMap__Group_0__4
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__3__Impl_in_rule__FeatureMap__Group_0__31266);
            rule__FeatureMap__Group_0__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_0__4_in_rule__FeatureMap__Group_0__31269);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:662:1: rule__FeatureMap__Group_0__3__Impl : ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) ) ;
    public final void rule__FeatureMap__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:666:1: ( ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:667:1: ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:667:1: ( ( rule__FeatureMap__RightFieldAssignment_0_3 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:668:1: ( rule__FeatureMap__RightFieldAssignment_0_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAssignment_0_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:669:1: ( rule__FeatureMap__RightFieldAssignment_0_3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:669:2: rule__FeatureMap__RightFieldAssignment_0_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__RightFieldAssignment_0_3_in_rule__FeatureMap__Group_0__3__Impl1296);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:679:1: rule__FeatureMap__Group_0__4 : rule__FeatureMap__Group_0__4__Impl ;
    public final void rule__FeatureMap__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:683:1: ( rule__FeatureMap__Group_0__4__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:684:2: rule__FeatureMap__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_0__4__Impl_in_rule__FeatureMap__Group_0__41326);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:690:1: rule__FeatureMap__Group_0__4__Impl : ( ( rule__FeatureMap__RuleAssignment_0_4 )? ) ;
    public final void rule__FeatureMap__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:694:1: ( ( ( rule__FeatureMap__RuleAssignment_0_4 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:695:1: ( ( rule__FeatureMap__RuleAssignment_0_4 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:695:1: ( ( rule__FeatureMap__RuleAssignment_0_4 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:696:1: ( rule__FeatureMap__RuleAssignment_0_4 )?
            {
             before(grammarAccess.getFeatureMapAccess().getRuleAssignment_0_4()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:697:1: ( rule__FeatureMap__RuleAssignment_0_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:697:2: rule__FeatureMap__RuleAssignment_0_4
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__RuleAssignment_0_4_in_rule__FeatureMap__Group_0__4__Impl1353);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:717:1: rule__FeatureMap__Group_1__0 : rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 ;
    public final void rule__FeatureMap__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:721:1: ( rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:722:2: rule__FeatureMap__Group_1__0__Impl rule__FeatureMap__Group_1__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__01394);
            rule__FeatureMap__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__01397);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:729:1: rule__FeatureMap__Group_1__0__Impl : ( 'set left' ) ;
    public final void rule__FeatureMap__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:733:1: ( ( 'set left' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:734:1: ( 'set left' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:734:1: ( 'set left' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:735:1: 'set left'
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__FeatureMap__Group_1__0__Impl1425); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:748:1: rule__FeatureMap__Group_1__1 : rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 ;
    public final void rule__FeatureMap__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:752:1: ( rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:753:2: rule__FeatureMap__Group_1__1__Impl rule__FeatureMap__Group_1__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__11456);
            rule__FeatureMap__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__11459);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:760:1: rule__FeatureMap__Group_1__1__Impl : ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) ) ;
    public final void rule__FeatureMap__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:764:1: ( ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:765:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:765:1: ( ( rule__FeatureMap__SetLeftFieldAssignment_1_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:766:1: ( rule__FeatureMap__SetLeftFieldAssignment_1_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAssignment_1_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:767:1: ( rule__FeatureMap__SetLeftFieldAssignment_1_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:767:2: rule__FeatureMap__SetLeftFieldAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl1486);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:777:1: rule__FeatureMap__Group_1__2 : rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3 ;
    public final void rule__FeatureMap__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:781:1: ( rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:782:2: rule__FeatureMap__Group_1__2__Impl rule__FeatureMap__Group_1__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__21516);
            rule__FeatureMap__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_1__3_in_rule__FeatureMap__Group_1__21519);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:789:1: rule__FeatureMap__Group_1__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:793:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:794:1: ( '=' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:794:1: ( '=' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:795:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_1_2()); 
            match(input,19,FOLLOW_19_in_rule__FeatureMap__Group_1__2__Impl1547); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:808:1: rule__FeatureMap__Group_1__3 : rule__FeatureMap__Group_1__3__Impl ;
    public final void rule__FeatureMap__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:812:1: ( rule__FeatureMap__Group_1__3__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:813:2: rule__FeatureMap__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_1__3__Impl_in_rule__FeatureMap__Group_1__31578);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:819:1: rule__FeatureMap__Group_1__3__Impl : ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) ) ;
    public final void rule__FeatureMap__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:823:1: ( ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:824:1: ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:824:1: ( ( rule__FeatureMap__ValLeftAssignment_1_3 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:825:1: ( rule__FeatureMap__ValLeftAssignment_1_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getValLeftAssignment_1_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:826:1: ( rule__FeatureMap__ValLeftAssignment_1_3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:826:2: rule__FeatureMap__ValLeftAssignment_1_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ValLeftAssignment_1_3_in_rule__FeatureMap__Group_1__3__Impl1605);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:844:1: rule__FeatureMap__Group_2__0 : rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1 ;
    public final void rule__FeatureMap__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:848:1: ( rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:849:2: rule__FeatureMap__Group_2__0__Impl rule__FeatureMap__Group_2__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__0__Impl_in_rule__FeatureMap__Group_2__01643);
            rule__FeatureMap__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__1_in_rule__FeatureMap__Group_2__01646);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:856:1: rule__FeatureMap__Group_2__0__Impl : ( 'set right' ) ;
    public final void rule__FeatureMap__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:860:1: ( ( 'set right' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:861:1: ( 'set right' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:861:1: ( 'set right' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:862:1: 'set right'
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__FeatureMap__Group_2__0__Impl1674); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:875:1: rule__FeatureMap__Group_2__1 : rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2 ;
    public final void rule__FeatureMap__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:879:1: ( rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:880:2: rule__FeatureMap__Group_2__1__Impl rule__FeatureMap__Group_2__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__1__Impl_in_rule__FeatureMap__Group_2__11705);
            rule__FeatureMap__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__2_in_rule__FeatureMap__Group_2__11708);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:887:1: rule__FeatureMap__Group_2__1__Impl : ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) ) ;
    public final void rule__FeatureMap__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:891:1: ( ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:892:1: ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:892:1: ( ( rule__FeatureMap__SetRightFieldAssignment_2_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:893:1: ( rule__FeatureMap__SetRightFieldAssignment_2_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAssignment_2_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:894:1: ( rule__FeatureMap__SetRightFieldAssignment_2_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:894:2: rule__FeatureMap__SetRightFieldAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__SetRightFieldAssignment_2_1_in_rule__FeatureMap__Group_2__1__Impl1735);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:904:1: rule__FeatureMap__Group_2__2 : rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3 ;
    public final void rule__FeatureMap__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:908:1: ( rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:909:2: rule__FeatureMap__Group_2__2__Impl rule__FeatureMap__Group_2__3
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__2__Impl_in_rule__FeatureMap__Group_2__21765);
            rule__FeatureMap__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_2__3_in_rule__FeatureMap__Group_2__21768);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:916:1: rule__FeatureMap__Group_2__2__Impl : ( '=' ) ;
    public final void rule__FeatureMap__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:920:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:921:1: ( '=' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:921:1: ( '=' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:922:1: '='
            {
             before(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_2_2()); 
            match(input,19,FOLLOW_19_in_rule__FeatureMap__Group_2__2__Impl1796); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:935:1: rule__FeatureMap__Group_2__3 : rule__FeatureMap__Group_2__3__Impl ;
    public final void rule__FeatureMap__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:939:1: ( rule__FeatureMap__Group_2__3__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:940:2: rule__FeatureMap__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_2__3__Impl_in_rule__FeatureMap__Group_2__31827);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:946:1: rule__FeatureMap__Group_2__3__Impl : ( ( rule__FeatureMap__ValRightAssignment_2_3 ) ) ;
    public final void rule__FeatureMap__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:950:1: ( ( ( rule__FeatureMap__ValRightAssignment_2_3 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:951:1: ( ( rule__FeatureMap__ValRightAssignment_2_3 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:951:1: ( ( rule__FeatureMap__ValRightAssignment_2_3 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:952:1: ( rule__FeatureMap__ValRightAssignment_2_3 )
            {
             before(grammarAccess.getFeatureMapAccess().getValRightAssignment_2_3()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:953:1: ( rule__FeatureMap__ValRightAssignment_2_3 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:953:2: rule__FeatureMap__ValRightAssignment_2_3
            {
            pushFollow(FOLLOW_rule__FeatureMap__ValRightAssignment_2_3_in_rule__FeatureMap__Group_2__3__Impl1854);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:971:1: rule__FeatureMap__Group_3__0 : rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1 ;
    public final void rule__FeatureMap__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:975:1: ( rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:976:2: rule__FeatureMap__Group_3__0__Impl rule__FeatureMap__Group_3__1
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__0__Impl_in_rule__FeatureMap__Group_3__01892);
            rule__FeatureMap__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_3__1_in_rule__FeatureMap__Group_3__01895);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:983:1: rule__FeatureMap__Group_3__0__Impl : ( 'ignore left' ) ;
    public final void rule__FeatureMap__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:987:1: ( ( 'ignore left' ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:988:1: ( 'ignore left' )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:988:1: ( 'ignore left' )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:989:1: 'ignore left'
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__FeatureMap__Group_3__0__Impl1923); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1002:1: rule__FeatureMap__Group_3__1 : rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2 ;
    public final void rule__FeatureMap__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1006:1: ( rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1007:2: rule__FeatureMap__Group_3__1__Impl rule__FeatureMap__Group_3__2
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__1__Impl_in_rule__FeatureMap__Group_3__11954);
            rule__FeatureMap__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FeatureMap__Group_3__2_in_rule__FeatureMap__Group_3__11957);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1014:1: rule__FeatureMap__Group_3__1__Impl : ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) ) ;
    public final void rule__FeatureMap__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1018:1: ( ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1019:1: ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1019:1: ( ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1020:1: ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAssignment_3_1()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1021:1: ( rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1021:2: rule__FeatureMap__IgnoreLeftFieldAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FeatureMap__IgnoreLeftFieldAssignment_3_1_in_rule__FeatureMap__Group_3__1__Impl1984);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1031:1: rule__FeatureMap__Group_3__2 : rule__FeatureMap__Group_3__2__Impl ;
    public final void rule__FeatureMap__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1035:1: ( rule__FeatureMap__Group_3__2__Impl )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1036:2: rule__FeatureMap__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__FeatureMap__Group_3__2__Impl_in_rule__FeatureMap__Group_3__22014);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1042:1: rule__FeatureMap__Group_3__2__Impl : ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? ) ;
    public final void rule__FeatureMap__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1046:1: ( ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1047:1: ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1047:1: ( ( rule__FeatureMap__DocumentationAssignment_3_2 )? )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1048:1: ( rule__FeatureMap__DocumentationAssignment_3_2 )?
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationAssignment_3_2()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1049:1: ( rule__FeatureMap__DocumentationAssignment_3_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1049:2: rule__FeatureMap__DocumentationAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__FeatureMap__DocumentationAssignment_3_2_in_rule__FeatureMap__Group_3__2__Impl2041);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1066:1: rule__Model__MappingModulesAssignment : ( ruleMappingModule ) ;
    public final void rule__Model__MappingModulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1070:1: ( ( ruleMappingModule ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1071:1: ( ruleMappingModule )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1071:1: ( ruleMappingModule )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1072:1: ruleMappingModule
            {
             before(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment2083);
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


    // $ANTLR start rule__MappingModule__NameAssignment_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1081:1: rule__MappingModule__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__MappingModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1085:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1086:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1086:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1087:1: ruleQualifiedName
            {
             before(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_12114);
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


    // $ANTLR start rule__MappingModule__MappedFeaturesAssignment_3_0
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1096:1: rule__MappingModule__MappedFeaturesAssignment_3_0 : ( ruleFeatureMap ) ;
    public final void rule__MappingModule__MappedFeaturesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1100:1: ( ( ruleFeatureMap ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1101:1: ( ruleFeatureMap )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1101:1: ( ruleFeatureMap )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1102:1: ruleFeatureMap
            {
             before(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_3_02145);
            ruleFeatureMap();
            _fsp--;

             after(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MappingModule__MappedFeaturesAssignment_3_0


    // $ANTLR start rule__FeatureMap__LeftFieldAssignment_0_1
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1111:1: rule__FeatureMap__LeftFieldAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__LeftFieldAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1115:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1116:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1116:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1117:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeCrossReference_0_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1118:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1119:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeQualifiedNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldAssignment_0_12180);
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1130:1: rule__FeatureMap__RightFieldAssignment_0_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__RightFieldAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1134:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1135:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1135:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1136:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAttributeCrossReference_0_3_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1137:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1138:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getRightFieldAttributeQualifiedNameParserRuleCall_0_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldAssignment_0_32219);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getRightFieldAttributeQualifiedNameParserRuleCall_0_3_0_1()); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1149:1: rule__FeatureMap__RuleAssignment_0_4 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__RuleAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1153:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1154:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1154:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1155:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getRuleSTRINGTerminalRuleCall_0_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__RuleAssignment_0_42254); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1164:1: rule__FeatureMap__SetLeftFieldAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__SetLeftFieldAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1168:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1169:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1169:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1170:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_1_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1171:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1172:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetLeftFieldAssignment_1_12289);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeQualifiedNameParserRuleCall_1_1_0_1()); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1183:1: rule__FeatureMap__ValLeftAssignment_1_3 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__ValLeftAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1187:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1188:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1188:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1189:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getValLeftSTRINGTerminalRuleCall_1_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__ValLeftAssignment_1_32324); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1198:1: rule__FeatureMap__SetRightFieldAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__SetRightFieldAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1202:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1203:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1203:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1204:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_2_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1205:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1206:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetRightFieldAssignment_2_12359);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeQualifiedNameParserRuleCall_2_1_0_1()); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1217:1: rule__FeatureMap__ValRightAssignment_2_3 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__ValRightAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1221:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1222:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1222:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1223:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getValRightSTRINGTerminalRuleCall_2_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__ValRightAssignment_2_32394); 
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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1232:1: rule__FeatureMap__IgnoreLeftFieldAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FeatureMap__IgnoreLeftFieldAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1236:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1237:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1237:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1238:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1239:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1240:1: ruleQualifiedName
            {
             before(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__FeatureMap__IgnoreLeftFieldAssignment_3_12429);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeQualifiedNameParserRuleCall_3_1_0_1()); 

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
    // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1251:1: rule__FeatureMap__DocumentationAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__FeatureMap__DocumentationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1255:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1256:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1256:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.simplemap.ui/src-gen/fr/chaunier/xtext/simplemap/ui/contentassist/antlr/internal/InternalSMapDsl.g:1257:1: RULE_STRING
            {
             before(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_3_22464); 
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
    public static final BitSet FOLLOW_rule__Model__MappingModulesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0_in_ruleMappingModule217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Alternatives_in_ruleFeatureMap277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__0_in_rule__FeatureMap__Alternatives313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0_in_rule__FeatureMap__Alternatives331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__0_in_rule__FeatureMap__Alternatives349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__0_in_rule__FeatureMap__Alternatives367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0399 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl485 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__0523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__0__Impl_in_rule__MappingModule__Group__0642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1_in_rule__MappingModule__Group__0645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MappingModule__Group__0__Impl673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__1__Impl_in_rule__MappingModule__Group__1704 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2_in_rule__MappingModule__Group__1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__NameAssignment_1_in_rule__MappingModule__Group__1__Impl734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__2__Impl_in_rule__MappingModule__Group__2764 = new BitSet(new long[]{0x0000000000354000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3_in_rule__MappingModule__Group__2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MappingModule__Group__2__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__3__Impl_in_rule__MappingModule__Group__3826 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4_in_rule__MappingModule__Group__3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_3__0_in_rule__MappingModule__Group__3__Impl856 = new BitSet(new long[]{0x0000000000350002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group__4__Impl_in_rule__MappingModule__Group__4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MappingModule__Group__4__Impl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_3__0__Impl_in_rule__MappingModule__Group_3__0956 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_3__1_in_rule__MappingModule__Group_3__0959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__MappedFeaturesAssignment_3_0_in_rule__MappingModule__Group_3__0__Impl986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModule__Group_3__1__Impl_in_rule__MappingModule__Group_3__11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MappingModule__Group_3__1__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__0__Impl_in_rule__FeatureMap__Group_0__01082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__1_in_rule__FeatureMap__Group_0__01085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FeatureMap__Group_0__0__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__1__Impl_in_rule__FeatureMap__Group_0__11144 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__2_in_rule__FeatureMap__Group_0__11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__LeftFieldAssignment_0_1_in_rule__FeatureMap__Group_0__1__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__2__Impl_in_rule__FeatureMap__Group_0__21204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__3_in_rule__FeatureMap__Group_0__21207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FeatureMap__Group_0__2__Impl1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__3__Impl_in_rule__FeatureMap__Group_0__31266 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__4_in_rule__FeatureMap__Group_0__31269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RightFieldAssignment_0_3_in_rule__FeatureMap__Group_0__3__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_0__4__Impl_in_rule__FeatureMap__Group_0__41326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__RuleAssignment_0_4_in_rule__FeatureMap__Group_0__4__Impl1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__0__Impl_in_rule__FeatureMap__Group_1__01394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1_in_rule__FeatureMap__Group_1__01397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FeatureMap__Group_1__0__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__1__Impl_in_rule__FeatureMap__Group_1__11456 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2_in_rule__FeatureMap__Group_1__11459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetLeftFieldAssignment_1_1_in_rule__FeatureMap__Group_1__1__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__2__Impl_in_rule__FeatureMap__Group_1__21516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__3_in_rule__FeatureMap__Group_1__21519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeatureMap__Group_1__2__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_1__3__Impl_in_rule__FeatureMap__Group_1__31578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ValLeftAssignment_1_3_in_rule__FeatureMap__Group_1__3__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__0__Impl_in_rule__FeatureMap__Group_2__01643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__1_in_rule__FeatureMap__Group_2__01646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureMap__Group_2__0__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__1__Impl_in_rule__FeatureMap__Group_2__11705 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__2_in_rule__FeatureMap__Group_2__11708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__SetRightFieldAssignment_2_1_in_rule__FeatureMap__Group_2__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__2__Impl_in_rule__FeatureMap__Group_2__21765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__3_in_rule__FeatureMap__Group_2__21768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeatureMap__Group_2__2__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_2__3__Impl_in_rule__FeatureMap__Group_2__31827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__ValRightAssignment_2_3_in_rule__FeatureMap__Group_2__3__Impl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__0__Impl_in_rule__FeatureMap__Group_3__01892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__1_in_rule__FeatureMap__Group_3__01895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FeatureMap__Group_3__0__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__1__Impl_in_rule__FeatureMap__Group_3__11954 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__2_in_rule__FeatureMap__Group_3__11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__IgnoreLeftFieldAssignment_3_1_in_rule__FeatureMap__Group_3__1__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__Group_3__2__Impl_in_rule__FeatureMap__Group_3__22014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureMap__DocumentationAssignment_3_2_in_rule__FeatureMap__Group_3__2__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_rule__Model__MappingModulesAssignment2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MappingModule__NameAssignment_12114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_rule__MappingModule__MappedFeaturesAssignment_3_02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__LeftFieldAssignment_0_12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__RightFieldAssignment_0_32219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__RuleAssignment_0_42254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetLeftFieldAssignment_1_12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__ValLeftAssignment_1_32324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__SetRightFieldAssignment_2_12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__ValRightAssignment_2_32394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__FeatureMap__IgnoreLeftFieldAssignment_3_12429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureMap__DocumentationAssignment_3_22464 = new BitSet(new long[]{0x0000000000000002L});

}