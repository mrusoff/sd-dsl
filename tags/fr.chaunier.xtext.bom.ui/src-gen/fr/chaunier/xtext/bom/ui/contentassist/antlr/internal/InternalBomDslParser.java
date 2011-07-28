package fr.chaunier.xtext.bom.ui.contentassist.antlr.internal; 

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
import fr.chaunier.xtext.bom.services.BomDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBomDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'DTD'", "'FLAT'", "'CSV'", "'DB'", "'public'", "'private'", "'protected'", "'as String'", "'as Value'", "'import'", "'package'", "'{'", "'}'", "'prefix'", "'namespace'", "'format'", "'delimiter'", "'lineSpec'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "';'", "'='", "'.*'", "'.'", "'regexp'", "'enum'", "'fixeLen'", "'minVal'", "'maxVal'", "'minLen'", "'maxLen'", "'paddle'", "'XSD'", "'*'", "'?'", "'boolean'", "'string'", "'datetime'", "'default'", "'integer'", "'decimal'", "'fixed'", "'nullable'", "'derived'", "'writable'", "'xsd Att.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalBomDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g"; }


     
     	private BomDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BomDslGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleDomainModel
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:61:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:62:1: ( ruleDomainModel EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:63:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();
            _fsp--;

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
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:70:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:74:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:75:1: ( ( rule__DomainModel__ElementsAssignment )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:76:1: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:77:1: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=21 && LA1_0<=22)||(LA1_0>=30 && LA1_0<=31)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:77:2: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94);
            	    rule__DomainModel__ElementsAssignment();
            	    _fsp--;


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
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRuleAbstractElement
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:89:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:90:1: ( ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:91:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();
            _fsp--;

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
    // $ANTLR end entryRuleAbstractElement


    // $ANTLR start ruleAbstractElement
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:98:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:102:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:103:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:104:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:105:1: ( rule__AbstractElement__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:105:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleAbstractElement


    // $ANTLR start entryRuleImport
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:117:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:118:1: ( ruleImport EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:119:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport182);
            ruleImport();
            _fsp--;

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:126:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:130:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:131:1: ( ( rule__Import__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:132:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:133:1: ( rule__Import__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:133:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport215);
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


    // $ANTLR start entryRulePackageDeclaration
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:145:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:146:1: ( rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:147:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration242);
            rulePackageDeclaration();
            _fsp--;

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
    // $ANTLR end entryRulePackageDeclaration


    // $ANTLR start rulePackageDeclaration
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:154:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:158:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:159:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:159:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:160:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:161:1: ( rule__PackageDeclaration__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:161:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration275);
            rule__PackageDeclaration__Group__0();
            _fsp--;


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
    // $ANTLR end rulePackageDeclaration


    // $ANTLR start entryRuleType
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:173:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:174:1: ( ruleType EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:175:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();
            _fsp--;

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:182:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:186:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:187:1: ( ( rule__Type__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:187:1: ( ( rule__Type__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:188:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:189:1: ( rule__Type__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:189:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
            rule__Type__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDataType
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:201:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:202:1: ( ruleDataType EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:203:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType362);
            ruleDataType();
            _fsp--;

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
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:210:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:214:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:215:1: ( ( rule__DataType__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:216:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:217:1: ( rule__DataType__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:217:2: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_rule__DataType__Group__0_in_ruleDataType395);
            rule__DataType__Group__0();
            _fsp--;


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
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleEntity
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:229:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:230:1: ( ruleEntity EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:231:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity422);
            ruleEntity();
            _fsp--;

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:238:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:242:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:243:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:243:1: ( ( rule__Entity__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:244:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:245:1: ( rule__Entity__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:245:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity455);
            rule__Entity__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:257:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:258:1: ( ruleFeature EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:259:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature482);
            ruleFeature();
            _fsp--;

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
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:266:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:270:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:271:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:271:1: ( ( rule__Feature__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:272:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:273:1: ( rule__Feature__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:273:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature515);
            rule__Feature__Group__0();
            _fsp--;


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
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleStructuralFeature
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:285:1: entryRuleStructuralFeature : ruleStructuralFeature EOF ;
    public final void entryRuleStructuralFeature() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:286:1: ( ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:287:1: ruleStructuralFeature EOF
            {
             before(grammarAccess.getStructuralFeatureRule()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature542);
            ruleStructuralFeature();
            _fsp--;

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
    // $ANTLR end entryRuleStructuralFeature


    // $ANTLR start ruleStructuralFeature
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:294:1: ruleStructuralFeature : ( ( rule__StructuralFeature__Alternatives ) ) ;
    public final void ruleStructuralFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:298:2: ( ( ( rule__StructuralFeature__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:299:1: ( ( rule__StructuralFeature__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:299:1: ( ( rule__StructuralFeature__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:300:1: ( rule__StructuralFeature__Alternatives )
            {
             before(grammarAccess.getStructuralFeatureAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:301:1: ( rule__StructuralFeature__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:301:2: rule__StructuralFeature__Alternatives
            {
            pushFollow(FOLLOW_rule__StructuralFeature__Alternatives_in_ruleStructuralFeature575);
            rule__StructuralFeature__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleStructuralFeature


    // $ANTLR start entryRuleAttribute
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:313:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:314:1: ( ruleAttribute EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:315:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute602);
            ruleAttribute();
            _fsp--;

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:322:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:326:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:327:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:327:1: ( ( rule__Attribute__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:328:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:329:1: ( rule__Attribute__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:329:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute635);
            rule__Attribute__Group__0();
            _fsp--;


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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleReference
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:341:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:342:1: ( ruleReference EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:343:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference662);
            ruleReference();
            _fsp--;

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
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:350:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:354:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:355:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:355:1: ( ( rule__Reference__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:356:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:357:1: ( rule__Reference__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:357:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference695);
            rule__Reference__Group__0();
            _fsp--;


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
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleEnumeration
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:369:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:370:1: ( ruleEnumeration EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:371:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration722);
            ruleEnumeration();
            _fsp--;

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
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:378:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:382:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:383:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:383:1: ( ( rule__Enumeration__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:384:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:385:1: ( rule__Enumeration__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:385:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration755);
            rule__Enumeration__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:397:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:398:1: ( ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:399:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral782);
            ruleEnumerationLiteral();
            _fsp--;

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
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:406:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:410:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:411:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:411:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:412:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:413:1: ( rule__EnumerationLiteral__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:413:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral815);
            rule__EnumerationLiteral__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleParameter
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:427:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:428:1: ( ruleParameter EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:429:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter844);
            ruleParameter();
            _fsp--;

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:436:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:440:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:1: ( ( rule__Parameter__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:442:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:443:1: ( rule__Parameter__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:443:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter877);
            rule__Parameter__Group__0();
            _fsp--;


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
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleTypeRef
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:457:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:458:1: ( ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:459:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef906);
            ruleTypeRef();
            _fsp--;

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
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:466:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:470:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:1: ( ( rule__TypeRef__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:472:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:473:1: ( rule__TypeRef__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:473:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef939);
            rule__TypeRef__Group__0();
            _fsp--;


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
    // $ANTLR end ruleTypeRef


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:485:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:486:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:487:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard966);
            ruleQualifiedNameWithWildCard();
            _fsp--;

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
    // $ANTLR end entryRuleQualifiedNameWithWildCard


    // $ANTLR start ruleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:494:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:498:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:500:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:501:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:501:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard999);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:513:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:514:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:515:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1026);
            ruleQualifiedName();
            _fsp--;

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
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:522:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:526:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:528:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:529:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:529:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1059);
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


    // $ANTLR start entryRuleConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:541:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:542:1: ( ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:543:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1086);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1093); 

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
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:550:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:554:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:1: ( ( rule__Constraint__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:556:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:557:1: ( rule__Constraint__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:557:2: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1119);
            rule__Constraint__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleBoolConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:569:1: entryRuleBoolConstraint : ruleBoolConstraint EOF ;
    public final void entryRuleBoolConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:570:1: ( ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:571:1: ruleBoolConstraint EOF
            {
             before(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1146);
            ruleBoolConstraint();
            _fsp--;

             after(grammarAccess.getBoolConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint1153); 

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
    // $ANTLR end entryRuleBoolConstraint


    // $ANTLR start ruleBoolConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:578:1: ruleBoolConstraint : ( ( rule__BoolConstraint__ConstraintAssignment ) ) ;
    public final void ruleBoolConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:582:2: ( ( ( rule__BoolConstraint__ConstraintAssignment ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:1: ( ( rule__BoolConstraint__ConstraintAssignment ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:584:1: ( rule__BoolConstraint__ConstraintAssignment )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintAssignment()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:585:1: ( rule__BoolConstraint__ConstraintAssignment )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:585:2: rule__BoolConstraint__ConstraintAssignment
            {
            pushFollow(FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint1179);
            rule__BoolConstraint__ConstraintAssignment();
            _fsp--;


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
    // $ANTLR end ruleBoolConstraint


    // $ANTLR start entryRuleStringConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:597:1: entryRuleStringConstraint : ruleStringConstraint EOF ;
    public final void entryRuleStringConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:598:1: ( ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:599:1: ruleStringConstraint EOF
            {
             before(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1206);
            ruleStringConstraint();
            _fsp--;

             after(grammarAccess.getStringConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint1213); 

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
    // $ANTLR end entryRuleStringConstraint


    // $ANTLR start ruleStringConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:606:1: ruleStringConstraint : ( ( rule__StringConstraint__Group__0 ) ) ;
    public final void ruleStringConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:610:2: ( ( ( rule__StringConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:1: ( ( rule__StringConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:1: ( ( rule__StringConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:612:1: ( rule__StringConstraint__Group__0 )
            {
             before(grammarAccess.getStringConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:613:1: ( rule__StringConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:613:2: rule__StringConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1239);
            rule__StringConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleStringConstraint


    // $ANTLR start entryRuleDateTimeConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:625:1: entryRuleDateTimeConstraint : ruleDateTimeConstraint EOF ;
    public final void entryRuleDateTimeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:626:1: ( ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:627:1: ruleDateTimeConstraint EOF
            {
             before(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1266);
            ruleDateTimeConstraint();
            _fsp--;

             after(grammarAccess.getDateTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint1273); 

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
    // $ANTLR end entryRuleDateTimeConstraint


    // $ANTLR start ruleDateTimeConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:634:1: ruleDateTimeConstraint : ( ( rule__DateTimeConstraint__Group__0 ) ) ;
    public final void ruleDateTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:638:2: ( ( ( rule__DateTimeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:640:1: ( rule__DateTimeConstraint__Group__0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:641:1: ( rule__DateTimeConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:641:2: rule__DateTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1299);
            rule__DateTimeConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleDateTimeConstraint


    // $ANTLR start entryRuleIntegerConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:653:1: entryRuleIntegerConstraint : ruleIntegerConstraint EOF ;
    public final void entryRuleIntegerConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:654:1: ( ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:655:1: ruleIntegerConstraint EOF
            {
             before(grammarAccess.getIntegerConstraintRule()); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1326);
            ruleIntegerConstraint();
            _fsp--;

             after(grammarAccess.getIntegerConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint1333); 

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
    // $ANTLR end entryRuleIntegerConstraint


    // $ANTLR start ruleIntegerConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:662:1: ruleIntegerConstraint : ( ( rule__IntegerConstraint__Group__0 ) ) ;
    public final void ruleIntegerConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:666:2: ( ( ( rule__IntegerConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:1: ( ( rule__IntegerConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:1: ( ( rule__IntegerConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:668:1: ( rule__IntegerConstraint__Group__0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:669:1: ( rule__IntegerConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:669:2: rule__IntegerConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1359);
            rule__IntegerConstraint__Group__0();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntegerConstraint


    // $ANTLR start entryRuleDecimalConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:681:1: entryRuleDecimalConstraint : ruleDecimalConstraint EOF ;
    public final void entryRuleDecimalConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:682:1: ( ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:683:1: ruleDecimalConstraint EOF
            {
             before(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1386);
            ruleDecimalConstraint();
            _fsp--;

             after(grammarAccess.getDecimalConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint1393); 

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
    // $ANTLR end entryRuleDecimalConstraint


    // $ANTLR start ruleDecimalConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:690:1: ruleDecimalConstraint : ( ( rule__DecimalConstraint__Group__0 ) ) ;
    public final void ruleDecimalConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:694:2: ( ( ( rule__DecimalConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:1: ( ( rule__DecimalConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:1: ( ( rule__DecimalConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:696:1: ( rule__DecimalConstraint__Group__0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:697:1: ( rule__DecimalConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:697:2: rule__DecimalConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1419);
            rule__DecimalConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleDecimalConstraint


    // $ANTLR start entryRuleEnumerationConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:709:1: entryRuleEnumerationConstraint : ruleEnumerationConstraint EOF ;
    public final void entryRuleEnumerationConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:710:1: ( ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:711:1: ruleEnumerationConstraint EOF
            {
             before(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1446);
            ruleEnumerationConstraint();
            _fsp--;

             after(grammarAccess.getEnumerationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint1453); 

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
    // $ANTLR end entryRuleEnumerationConstraint


    // $ANTLR start ruleEnumerationConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:718:1: ruleEnumerationConstraint : ( ( rule__EnumerationConstraint__Group__0 ) ) ;
    public final void ruleEnumerationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:722:2: ( ( ( rule__EnumerationConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:723:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:723:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:724:1: ( rule__EnumerationConstraint__Group__0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:725:1: ( rule__EnumerationConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:725:2: rule__EnumerationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1479);
            rule__EnumerationConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleEnumerationConstraint


    // $ANTLR start entryRuleNumberConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:737:1: entryRuleNumberConstraint : ruleNumberConstraint EOF ;
    public final void entryRuleNumberConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:738:1: ( ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:739:1: ruleNumberConstraint EOF
            {
             before(grammarAccess.getNumberConstraintRule()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1506);
            ruleNumberConstraint();
            _fsp--;

             after(grammarAccess.getNumberConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint1513); 

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
    // $ANTLR end entryRuleNumberConstraint


    // $ANTLR start ruleNumberConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:746:1: ruleNumberConstraint : ( ( rule__NumberConstraint__Group__0 ) ) ;
    public final void ruleNumberConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:750:2: ( ( ( rule__NumberConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:751:1: ( ( rule__NumberConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:751:1: ( ( rule__NumberConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:752:1: ( rule__NumberConstraint__Group__0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:753:1: ( rule__NumberConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:753:2: rule__NumberConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1539);
            rule__NumberConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleNumberConstraint


    // $ANTLR start entryRuleAllConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:765:1: entryRuleAllConstraint : ruleAllConstraint EOF ;
    public final void entryRuleAllConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:766:1: ( ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:767:1: ruleAllConstraint EOF
            {
             before(grammarAccess.getAllConstraintRule()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1566);
            ruleAllConstraint();
            _fsp--;

             after(grammarAccess.getAllConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint1573); 

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
    // $ANTLR end entryRuleAllConstraint


    // $ANTLR start ruleAllConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:774:1: ruleAllConstraint : ( ( rule__AllConstraint__Group__0 ) ) ;
    public final void ruleAllConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:778:2: ( ( ( rule__AllConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:779:1: ( ( rule__AllConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:779:1: ( ( rule__AllConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:780:1: ( rule__AllConstraint__Group__0 )
            {
             before(grammarAccess.getAllConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:781:1: ( rule__AllConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:781:2: rule__AllConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1599);
            rule__AllConstraint__Group__0();
            _fsp--;


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
    // $ANTLR end ruleAllConstraint


    // $ANTLR start ruleVisibility
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:794:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:798:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:799:1: ( ( rule__Visibility__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:799:1: ( ( rule__Visibility__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:800:1: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:801:1: ( rule__Visibility__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:801:2: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1636);
            rule__Visibility__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleVisibility


    // $ANTLR start ruleEntityType
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:813:1: ruleEntityType : ( ( 'abstract' ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:817:1: ( ( ( 'abstract' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:818:1: ( ( 'abstract' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:818:1: ( ( 'abstract' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:819:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:820:1: ( 'abstract' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:820:3: 'abstract'
            {
            match(input,11,FOLLOW_11_in_ruleEntityType1673); 

            }

             after(grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntityType


    // $ANTLR start ruleEnumUsage
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:833:1: ruleEnumUsage : ( ( rule__EnumUsage__Alternatives ) ) ;
    public final void ruleEnumUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:837:1: ( ( ( rule__EnumUsage__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:838:1: ( ( rule__EnumUsage__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:838:1: ( ( rule__EnumUsage__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:839:1: ( rule__EnumUsage__Alternatives )
            {
             before(grammarAccess.getEnumUsageAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:840:1: ( rule__EnumUsage__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:840:2: rule__EnumUsage__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1711);
            rule__EnumUsage__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleEnumUsage


    // $ANTLR start rule__AbstractElement__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:851:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:855:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 11:
            case 30:
            case 31:
            case 36:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("851:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:856:1: ( rulePackageDeclaration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:856:1: ( rulePackageDeclaration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:857:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1746);
                    rulePackageDeclaration();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:862:6: ( ruleType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:862:6: ( ruleType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:863:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1763);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:868:6: ( ruleImport )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:868:6: ( ruleImport )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:869:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1780);
                    ruleImport();
                    _fsp--;

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
    // $ANTLR end rule__AbstractElement__Alternatives


    // $ANTLR start rule__PackageDeclaration__Alternatives_5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:879:1: rule__PackageDeclaration__Alternatives_5 : ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) );
    public final void rule__PackageDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:883:1: ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("879:1: rule__PackageDeclaration__Alternatives_5 : ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:884:1: ( ( rule__PackageDeclaration__Group_5_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:884:1: ( ( rule__PackageDeclaration__Group_5_0__0 ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:885:1: ( rule__PackageDeclaration__Group_5_0__0 )
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getGroup_5_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:886:1: ( rule__PackageDeclaration__Group_5_0__0 )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:886:2: rule__PackageDeclaration__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__0_in_rule__PackageDeclaration__Alternatives_51812);
                    rule__PackageDeclaration__Group_5_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPackageDeclarationAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:890:6: ( 'DTD' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:890:6: ( 'DTD' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:891:1: 'DTD'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getDTDKeyword_5_1()); 
                    match(input,12,FOLLOW_12_in_rule__PackageDeclaration__Alternatives_51831); 
                     after(grammarAccess.getPackageDeclarationAccess().getDTDKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:898:6: ( 'FLAT' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:898:6: ( 'FLAT' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:899:1: 'FLAT'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getFLATKeyword_5_2()); 
                    match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Alternatives_51851); 
                     after(grammarAccess.getPackageDeclarationAccess().getFLATKeyword_5_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:906:6: ( 'CSV' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:906:6: ( 'CSV' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:907:1: 'CSV'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getCSVKeyword_5_3()); 
                    match(input,14,FOLLOW_14_in_rule__PackageDeclaration__Alternatives_51871); 
                     after(grammarAccess.getPackageDeclarationAccess().getCSVKeyword_5_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:914:6: ( 'DB' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:914:6: ( 'DB' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:915:1: 'DB'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getDBKeyword_5_4()); 
                    match(input,15,FOLLOW_15_in_rule__PackageDeclaration__Alternatives_51891); 
                     after(grammarAccess.getPackageDeclarationAccess().getDBKeyword_5_4()); 

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
    // $ANTLR end rule__PackageDeclaration__Alternatives_5


    // $ANTLR start rule__Type__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:927:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:931:1: ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
            case 31:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("927:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:932:1: ( ruleEntity )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:932:1: ( ruleEntity )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:933:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1925);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:938:6: ( ruleDataType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:938:6: ( ruleDataType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:939:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1942);
                    ruleDataType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:944:6: ( ruleEnumeration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:944:6: ( ruleEnumeration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:945:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1959);
                    ruleEnumeration();
                    _fsp--;

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
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__StructuralFeature__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:955:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:959:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("955:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:960:1: ( ruleAttribute )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:960:1: ( ruleAttribute )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:961:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1991);
                    ruleAttribute();
                    _fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:966:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:966:6: ( ruleReference )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:967:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2008);
                    ruleReference();
                    _fsp--;

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
    // $ANTLR end rule__StructuralFeature__Alternatives


    // $ANTLR start rule__Constraint__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:978:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:982:1: ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt6=1;
                }
                break;
            case 55:
                {
                alt6=2;
                }
                break;
            case 56:
                {
                alt6=3;
                }
                break;
            case 58:
                {
                alt6=4;
                }
                break;
            case 59:
                {
                alt6=5;
                }
                break;
            case 44:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("978:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:983:1: ( ruleBoolConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:983:1: ( ruleBoolConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:984:1: ruleBoolConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives2041);
                    ruleBoolConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:989:6: ( ruleStringConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:989:6: ( ruleStringConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:990:1: ruleStringConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives2058);
                    ruleStringConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:995:6: ( ruleDateTimeConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:995:6: ( ruleDateTimeConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:996:1: ruleDateTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives2075);
                    ruleDateTimeConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1001:6: ( ruleIntegerConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1001:6: ( ruleIntegerConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1002:1: ruleIntegerConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives2092);
                    ruleIntegerConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1007:6: ( ruleDecimalConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1007:6: ( ruleDecimalConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1008:1: ruleDecimalConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives2109);
                    ruleDecimalConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1013:6: ( ruleEnumerationConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1013:6: ( ruleEnumerationConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1014:1: ruleEnumerationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives2126);
                    ruleEnumerationConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5()); 

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
    // $ANTLR end rule__Constraint__Alternatives


    // $ANTLR start rule__Visibility__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1024:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1028:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1029:1: ( ( 'public' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1029:1: ( ( 'public' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1030:1: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1031:1: ( 'public' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1031:3: 'public'
                    {
                    match(input,16,FOLLOW_16_in_rule__Visibility__Alternatives2159); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1036:6: ( ( 'private' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1036:6: ( ( 'private' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1037:1: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1038:1: ( 'private' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1038:3: 'private'
                    {
                    match(input,17,FOLLOW_17_in_rule__Visibility__Alternatives2180); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1043:6: ( ( 'protected' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1043:6: ( ( 'protected' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1044:1: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1045:1: ( 'protected' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1045:3: 'protected'
                    {
                    match(input,18,FOLLOW_18_in_rule__Visibility__Alternatives2201); 

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
    // $ANTLR end rule__Visibility__Alternatives


    // $ANTLR start rule__EnumUsage__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1055:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) );
    public final void rule__EnumUsage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1059:1: ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1055:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as Value' ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1060:1: ( ( 'as String' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1060:1: ( ( 'as String' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1061:1: ( 'as String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1062:1: ( 'as String' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1062:3: 'as String'
                    {
                    match(input,19,FOLLOW_19_in_rule__EnumUsage__Alternatives2237); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1067:6: ( ( 'as Value' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1067:6: ( ( 'as Value' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1068:1: ( 'as Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1069:1: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1069:3: 'as Value'
                    {
                    match(input,20,FOLLOW_20_in_rule__EnumUsage__Alternatives2258); 

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
    // $ANTLR end rule__EnumUsage__Alternatives


    // $ANTLR start rule__Import__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1081:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1085:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1086:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02291);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02294);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1093:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1097:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1098:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1098:1: ( 'import' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1099:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Import__Group__0__Impl2322); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1112:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1116:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1117:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12353);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1123:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1127:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1128:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1128:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1129:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1130:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1130:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2380);
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


    // $ANTLR start rule__PackageDeclaration__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1144:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1148:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1149:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02414);
            rule__PackageDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02417);
            rule__PackageDeclaration__Group__1();
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
    // $ANTLR end rule__PackageDeclaration__Group__0


    // $ANTLR start rule__PackageDeclaration__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1156:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1160:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1161:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1161:1: ( 'package' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1162:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl2445); 
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
    // $ANTLR end rule__PackageDeclaration__Group__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1175:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1179:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1180:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12476);
            rule__PackageDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12479);
            rule__PackageDeclaration__Group__2();
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
    // $ANTLR end rule__PackageDeclaration__Group__1


    // $ANTLR start rule__PackageDeclaration__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1187:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1191:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1192:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1192:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1193:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1194:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1194:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2506);
            rule__PackageDeclaration__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__PackageDeclaration__Group__1__Impl


    // $ANTLR start rule__PackageDeclaration__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1204:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1208:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1209:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22536);
            rule__PackageDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22539);
            rule__PackageDeclaration__Group__3();
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
    // $ANTLR end rule__PackageDeclaration__Group__2


    // $ANTLR start rule__PackageDeclaration__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1216:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__Group_2__0 ) ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1220:1: ( ( ( rule__PackageDeclaration__Group_2__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1221:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1221:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1222:1: ( rule__PackageDeclaration__Group_2__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1223:1: ( rule__PackageDeclaration__Group_2__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1223:2: rule__PackageDeclaration__Group_2__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2566);
            rule__PackageDeclaration__Group_2__0();
            _fsp--;


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
    // $ANTLR end rule__PackageDeclaration__Group__2__Impl


    // $ANTLR start rule__PackageDeclaration__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1233:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1237:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1238:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32596);
            rule__PackageDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32599);
            rule__PackageDeclaration__Group__4();
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
    // $ANTLR end rule__PackageDeclaration__Group__3


    // $ANTLR start rule__PackageDeclaration__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1245:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 ) ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1249:1: ( ( ( rule__PackageDeclaration__Group_3__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1250:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1250:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1251:1: ( rule__PackageDeclaration__Group_3__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1252:1: ( rule__PackageDeclaration__Group_3__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1252:2: rule__PackageDeclaration__Group_3__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2626);
            rule__PackageDeclaration__Group_3__0();
            _fsp--;


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
    // $ANTLR end rule__PackageDeclaration__Group__3__Impl


    // $ANTLR start rule__PackageDeclaration__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1262:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1266:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1267:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42656);
            rule__PackageDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42659);
            rule__PackageDeclaration__Group__5();
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
    // $ANTLR end rule__PackageDeclaration__Group__4


    // $ANTLR start rule__PackageDeclaration__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1274:1: rule__PackageDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1278:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1279:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1279:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1280:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__PackageDeclaration__Group__4__Impl2687); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__4__Impl


    // $ANTLR start rule__PackageDeclaration__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1293:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1297:1: ( rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1298:2: rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52718);
            rule__PackageDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52721);
            rule__PackageDeclaration__Group__6();
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
    // $ANTLR end rule__PackageDeclaration__Group__5


    // $ANTLR start rule__PackageDeclaration__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1305:1: rule__PackageDeclaration__Group__5__Impl : ( ( rule__PackageDeclaration__Alternatives_5 )? ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1309:1: ( ( ( rule__PackageDeclaration__Alternatives_5 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1310:1: ( ( rule__PackageDeclaration__Alternatives_5 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1310:1: ( ( rule__PackageDeclaration__Alternatives_5 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1311:1: ( rule__PackageDeclaration__Alternatives_5 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getAlternatives_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1312:1: ( rule__PackageDeclaration__Alternatives_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=15)||LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1312:2: rule__PackageDeclaration__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Alternatives_5_in_rule__PackageDeclaration__Group__5__Impl2748);
                    rule__PackageDeclaration__Alternatives_5();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__5__Impl


    // $ANTLR start rule__PackageDeclaration__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1322:1: rule__PackageDeclaration__Group__6 : rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 ;
    public final void rule__PackageDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1326:1: ( rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1327:2: rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62779);
            rule__PackageDeclaration__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62782);
            rule__PackageDeclaration__Group__7();
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
    // $ANTLR end rule__PackageDeclaration__Group__6


    // $ANTLR start rule__PackageDeclaration__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1334:1: rule__PackageDeclaration__Group__6__Impl : ( ( rule__PackageDeclaration__Group_6__0 )? ) ;
    public final void rule__PackageDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1338:1: ( ( ( rule__PackageDeclaration__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1339:1: ( ( rule__PackageDeclaration__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1339:1: ( ( rule__PackageDeclaration__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1340:1: ( rule__PackageDeclaration__Group_6__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1341:1: ( rule__PackageDeclaration__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1341:2: rule__PackageDeclaration__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__0_in_rule__PackageDeclaration__Group__6__Impl2809);
                    rule__PackageDeclaration__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__6__Impl


    // $ANTLR start rule__PackageDeclaration__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1351:1: rule__PackageDeclaration__Group__7 : rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8 ;
    public final void rule__PackageDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1355:1: ( rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1356:2: rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72840);
            rule__PackageDeclaration__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__8_in_rule__PackageDeclaration__Group__72843);
            rule__PackageDeclaration__Group__8();
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
    // $ANTLR end rule__PackageDeclaration__Group__7


    // $ANTLR start rule__PackageDeclaration__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1363:1: rule__PackageDeclaration__Group__7__Impl : ( ( rule__PackageDeclaration__Group_7__0 )* ) ;
    public final void rule__PackageDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1367:1: ( ( ( rule__PackageDeclaration__Group_7__0 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1368:1: ( ( rule__PackageDeclaration__Group_7__0 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1368:1: ( ( rule__PackageDeclaration__Group_7__0 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1369:1: ( rule__PackageDeclaration__Group_7__0 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1370:1: ( rule__PackageDeclaration__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1370:2: rule__PackageDeclaration__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__0_in_rule__PackageDeclaration__Group__7__Impl2870);
            	    rule__PackageDeclaration__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__7__Impl


    // $ANTLR start rule__PackageDeclaration__Group__8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1380:1: rule__PackageDeclaration__Group__8 : rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9 ;
    public final void rule__PackageDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1384:1: ( rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1385:2: rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__8__Impl_in_rule__PackageDeclaration__Group__82901);
            rule__PackageDeclaration__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__9_in_rule__PackageDeclaration__Group__82904);
            rule__PackageDeclaration__Group__9();
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
    // $ANTLR end rule__PackageDeclaration__Group__8


    // $ANTLR start rule__PackageDeclaration__Group__8__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1392:1: rule__PackageDeclaration__Group__8__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_8 )* ) ;
    public final void rule__PackageDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1396:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_8 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1397:1: ( ( rule__PackageDeclaration__ElementsAssignment_8 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1397:1: ( ( rule__PackageDeclaration__ElementsAssignment_8 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1398:1: ( rule__PackageDeclaration__ElementsAssignment_8 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1399:1: ( rule__PackageDeclaration__ElementsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11||(LA12_0>=21 && LA12_0<=22)||(LA12_0>=30 && LA12_0<=31)||LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1399:2: rule__PackageDeclaration__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_8_in_rule__PackageDeclaration__Group__8__Impl2931);
            	    rule__PackageDeclaration__ElementsAssignment_8();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__8__Impl


    // $ANTLR start rule__PackageDeclaration__Group__9
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1409:1: rule__PackageDeclaration__Group__9 : rule__PackageDeclaration__Group__9__Impl ;
    public final void rule__PackageDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1413:1: ( rule__PackageDeclaration__Group__9__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1414:2: rule__PackageDeclaration__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__9__Impl_in_rule__PackageDeclaration__Group__92962);
            rule__PackageDeclaration__Group__9__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group__9


    // $ANTLR start rule__PackageDeclaration__Group__9__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1420:1: rule__PackageDeclaration__Group__9__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1424:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1425:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1425:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1426:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FOLLOW_24_in_rule__PackageDeclaration__Group__9__Impl2990); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group__9__Impl


    // $ANTLR start rule__PackageDeclaration__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1459:1: rule__PackageDeclaration__Group_2__0 : rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 ;
    public final void rule__PackageDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1463:1: ( rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1464:2: rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__03041);
            rule__PackageDeclaration__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__03044);
            rule__PackageDeclaration__Group_2__1();
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
    // $ANTLR end rule__PackageDeclaration__Group_2__0


    // $ANTLR start rule__PackageDeclaration__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1471:1: rule__PackageDeclaration__Group_2__0__Impl : ( 'prefix' ) ;
    public final void rule__PackageDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1475:1: ( ( 'prefix' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1476:1: ( 'prefix' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1476:1: ( 'prefix' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1477:1: 'prefix'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__PackageDeclaration__Group_2__0__Impl3072); 
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
    // $ANTLR end rule__PackageDeclaration__Group_2__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1490:1: rule__PackageDeclaration__Group_2__1 : rule__PackageDeclaration__Group_2__1__Impl ;
    public final void rule__PackageDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1494:1: ( rule__PackageDeclaration__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1495:2: rule__PackageDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__13103);
            rule__PackageDeclaration__Group_2__1__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group_2__1


    // $ANTLR start rule__PackageDeclaration__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1501:1: rule__PackageDeclaration__Group_2__1__Impl : ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) ;
    public final void rule__PackageDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1505:1: ( ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1506:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1506:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1507:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1508:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1508:2: rule__PackageDeclaration__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl3130);
            rule__PackageDeclaration__PrefixAssignment_2_1();
            _fsp--;


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
    // $ANTLR end rule__PackageDeclaration__Group_2__1__Impl


    // $ANTLR start rule__PackageDeclaration__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1522:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
    public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1526:1: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1527:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__03164);
            rule__PackageDeclaration__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__03167);
            rule__PackageDeclaration__Group_3__1();
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
    // $ANTLR end rule__PackageDeclaration__Group_3__0


    // $ANTLR start rule__PackageDeclaration__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1534:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1538:1: ( ( 'namespace' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1539:1: ( 'namespace' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1539:1: ( 'namespace' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1540:1: 'namespace'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__PackageDeclaration__Group_3__0__Impl3195); 
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
    // $ANTLR end rule__PackageDeclaration__Group_3__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1553:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1557:1: ( rule__PackageDeclaration__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1558:2: rule__PackageDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13226);
            rule__PackageDeclaration__Group_3__1__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group_3__1


    // $ANTLR start rule__PackageDeclaration__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1564:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) ;
    public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1568:1: ( ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1569:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1569:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1570:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1571:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1571:2: rule__PackageDeclaration__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3253);
            rule__PackageDeclaration__NamespaceAssignment_3_1();
            _fsp--;


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
    // $ANTLR end rule__PackageDeclaration__Group_3__1__Impl


    // $ANTLR start rule__PackageDeclaration__Group_5_0__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1585:1: rule__PackageDeclaration__Group_5_0__0 : rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1 ;
    public final void rule__PackageDeclaration__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1589:1: ( rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1590:2: rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__0__Impl_in_rule__PackageDeclaration__Group_5_0__03287);
            rule__PackageDeclaration__Group_5_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__1_in_rule__PackageDeclaration__Group_5_0__03290);
            rule__PackageDeclaration__Group_5_0__1();
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
    // $ANTLR end rule__PackageDeclaration__Group_5_0__0


    // $ANTLR start rule__PackageDeclaration__Group_5_0__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1597:1: rule__PackageDeclaration__Group_5_0__0__Impl : ( 'format' ) ;
    public final void rule__PackageDeclaration__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1601:1: ( ( 'format' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1602:1: ( 'format' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1602:1: ( 'format' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1603:1: 'format'
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatKeyword_5_0_0()); 
            match(input,27,FOLLOW_27_in_rule__PackageDeclaration__Group_5_0__0__Impl3318); 
             after(grammarAccess.getPackageDeclarationAccess().getFormatKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_5_0__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group_5_0__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1616:1: rule__PackageDeclaration__Group_5_0__1 : rule__PackageDeclaration__Group_5_0__1__Impl ;
    public final void rule__PackageDeclaration__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1620:1: ( rule__PackageDeclaration__Group_5_0__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1621:2: rule__PackageDeclaration__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__1__Impl_in_rule__PackageDeclaration__Group_5_0__13349);
            rule__PackageDeclaration__Group_5_0__1__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group_5_0__1


    // $ANTLR start rule__PackageDeclaration__Group_5_0__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1627:1: rule__PackageDeclaration__Group_5_0__1__Impl : ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) ) ;
    public final void rule__PackageDeclaration__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1631:1: ( ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1632:1: ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1632:1: ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1633:1: ( rule__PackageDeclaration__FormatAssignment_5_0_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatAssignment_5_0_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1634:1: ( rule__PackageDeclaration__FormatAssignment_5_0_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1634:2: rule__PackageDeclaration__FormatAssignment_5_0_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__FormatAssignment_5_0_1_in_rule__PackageDeclaration__Group_5_0__1__Impl3376);
            rule__PackageDeclaration__FormatAssignment_5_0_1();
            _fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getFormatAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_5_0__1__Impl


    // $ANTLR start rule__PackageDeclaration__Group_6__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1648:1: rule__PackageDeclaration__Group_6__0 : rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1 ;
    public final void rule__PackageDeclaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1652:1: ( rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1653:2: rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__0__Impl_in_rule__PackageDeclaration__Group_6__03410);
            rule__PackageDeclaration__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__1_in_rule__PackageDeclaration__Group_6__03413);
            rule__PackageDeclaration__Group_6__1();
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
    // $ANTLR end rule__PackageDeclaration__Group_6__0


    // $ANTLR start rule__PackageDeclaration__Group_6__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1660:1: rule__PackageDeclaration__Group_6__0__Impl : ( 'delimiter' ) ;
    public final void rule__PackageDeclaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1664:1: ( ( 'delimiter' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1665:1: ( 'delimiter' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1665:1: ( 'delimiter' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1666:1: 'delimiter'
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__PackageDeclaration__Group_6__0__Impl3441); 
             after(grammarAccess.getPackageDeclarationAccess().getDelimiterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_6__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group_6__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1679:1: rule__PackageDeclaration__Group_6__1 : rule__PackageDeclaration__Group_6__1__Impl ;
    public final void rule__PackageDeclaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1683:1: ( rule__PackageDeclaration__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1684:2: rule__PackageDeclaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__1__Impl_in_rule__PackageDeclaration__Group_6__13472);
            rule__PackageDeclaration__Group_6__1__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group_6__1


    // $ANTLR start rule__PackageDeclaration__Group_6__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1690:1: rule__PackageDeclaration__Group_6__1__Impl : ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) ) ;
    public final void rule__PackageDeclaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1694:1: ( ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1695:1: ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1695:1: ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1696:1: ( rule__PackageDeclaration__DelimiterAssignment_6_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1697:1: ( rule__PackageDeclaration__DelimiterAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1697:2: rule__PackageDeclaration__DelimiterAssignment_6_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__DelimiterAssignment_6_1_in_rule__PackageDeclaration__Group_6__1__Impl3499);
            rule__PackageDeclaration__DelimiterAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getDelimiterAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_6__1__Impl


    // $ANTLR start rule__PackageDeclaration__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1711:1: rule__PackageDeclaration__Group_7__0 : rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1 ;
    public final void rule__PackageDeclaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1715:1: ( rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1716:2: rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__0__Impl_in_rule__PackageDeclaration__Group_7__03533);
            rule__PackageDeclaration__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__1_in_rule__PackageDeclaration__Group_7__03536);
            rule__PackageDeclaration__Group_7__1();
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
    // $ANTLR end rule__PackageDeclaration__Group_7__0


    // $ANTLR start rule__PackageDeclaration__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1723:1: rule__PackageDeclaration__Group_7__0__Impl : ( 'lineSpec' ) ;
    public final void rule__PackageDeclaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1727:1: ( ( 'lineSpec' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1728:1: ( 'lineSpec' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1728:1: ( 'lineSpec' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1729:1: 'lineSpec'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLineSpecKeyword_7_0()); 
            match(input,29,FOLLOW_29_in_rule__PackageDeclaration__Group_7__0__Impl3564); 
             after(grammarAccess.getPackageDeclarationAccess().getLineSpecKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_7__0__Impl


    // $ANTLR start rule__PackageDeclaration__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1742:1: rule__PackageDeclaration__Group_7__1 : rule__PackageDeclaration__Group_7__1__Impl ;
    public final void rule__PackageDeclaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1746:1: ( rule__PackageDeclaration__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1747:2: rule__PackageDeclaration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__1__Impl_in_rule__PackageDeclaration__Group_7__13595);
            rule__PackageDeclaration__Group_7__1__Impl();
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
    // $ANTLR end rule__PackageDeclaration__Group_7__1


    // $ANTLR start rule__PackageDeclaration__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1753:1: rule__PackageDeclaration__Group_7__1__Impl : ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) ) ;
    public final void rule__PackageDeclaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1757:1: ( ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1758:1: ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1758:1: ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1759:1: ( rule__PackageDeclaration__LinesAssignment_7_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getLinesAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1760:1: ( rule__PackageDeclaration__LinesAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1760:2: rule__PackageDeclaration__LinesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__LinesAssignment_7_1_in_rule__PackageDeclaration__Group_7__1__Impl3622);
            rule__PackageDeclaration__LinesAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getLinesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__Group_7__1__Impl


    // $ANTLR start rule__DataType__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1774:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1778:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1779:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03656);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03659);
            rule__DataType__Group__1();
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
    // $ANTLR end rule__DataType__Group__0


    // $ANTLR start rule__DataType__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1786:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1790:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1791:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1791:1: ( 'datatype' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1792:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__DataType__Group__0__Impl3687); 
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
    // $ANTLR end rule__DataType__Group__0__Impl


    // $ANTLR start rule__DataType__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1805:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1809:1: ( rule__DataType__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1810:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13718);
            rule__DataType__Group__1__Impl();
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
    // $ANTLR end rule__DataType__Group__1


    // $ANTLR start rule__DataType__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1816:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1820:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1821:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1821:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1822:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1823:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1823:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3745);
            rule__DataType__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__DataType__Group__1__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1837:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1841:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1842:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03779);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03782);
            rule__Entity__Group__1();
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
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1849:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__EntityTypeAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1853:1: ( ( ( rule__Entity__EntityTypeAssignment_0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1854:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1854:1: ( ( rule__Entity__EntityTypeAssignment_0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1855:1: ( rule__Entity__EntityTypeAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getEntityTypeAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1856:1: ( rule__Entity__EntityTypeAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1856:2: rule__Entity__EntityTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3809);
                    rule__Entity__EntityTypeAssignment_0();
                    _fsp--;


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
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1866:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1870:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1871:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13840);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13843);
            rule__Entity__Group__2();
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
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1878:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1882:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1883:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1883:1: ( 'entity' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1884:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Entity__Group__1__Impl3871); 
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
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1897:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1901:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1902:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23902);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23905);
            rule__Entity__Group__3();
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
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1909:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1913:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1914:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1914:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1915:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1916:1: ( rule__Entity__NameAssignment_2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1916:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3932);
            rule__Entity__NameAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1926:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1930:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1931:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33962);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33965);
            rule__Entity__Group__4();
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
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1938:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1942:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1943:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1943:1: ( ( rule__Entity__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1944:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1945:1: ( rule__Entity__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1945:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3992);
                    rule__Entity__Group_3__0();
                    _fsp--;


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
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1955:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1959:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1960:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44023);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44026);
            rule__Entity__Group__5();
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
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1967:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__DescriptionAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1971:1: ( ( ( rule__Entity__DescriptionAssignment_4 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1972:1: ( ( rule__Entity__DescriptionAssignment_4 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1972:1: ( ( rule__Entity__DescriptionAssignment_4 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1973:1: ( rule__Entity__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1974:1: ( rule__Entity__DescriptionAssignment_4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1974:2: rule__Entity__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_4_in_rule__Entity__Group__4__Impl4053);
                    rule__Entity__DescriptionAssignment_4();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Entity__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1984:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1988:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1989:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54084);
            rule__Entity__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54087);
            rule__Entity__Group__6();
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
    // $ANTLR end rule__Entity__Group__5


    // $ANTLR start rule__Entity__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1996:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2000:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2001:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2001:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2002:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__5__Impl4115); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__5__Impl


    // $ANTLR start rule__Entity__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2015:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2019:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2020:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64146);
            rule__Entity__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64149);
            rule__Entity__Group__7();
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
    // $ANTLR end rule__Entity__Group__6


    // $ANTLR start rule__Entity__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2027:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__FeaturesAssignment_6 )* ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2031:1: ( ( ( rule__Entity__FeaturesAssignment_6 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2032:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2032:1: ( ( rule__Entity__FeaturesAssignment_6 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2033:1: ( rule__Entity__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2034:1: ( rule__Entity__FeaturesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2034:2: rule__Entity__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_6_in_rule__Entity__Group__6__Impl4176);
            	    rule__Entity__FeaturesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__6__Impl


    // $ANTLR start rule__Entity__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2044:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2048:1: ( rule__Entity__Group__7__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2049:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74207);
            rule__Entity__Group__7__Impl();
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
    // $ANTLR end rule__Entity__Group__7


    // $ANTLR start rule__Entity__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2055:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2059:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2060:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2060:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2061:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group__7__Impl4235); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__7__Impl


    // $ANTLR start rule__Entity__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2090:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2094:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2095:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04282);
            rule__Entity__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04285);
            rule__Entity__Group_3__1();
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
    // $ANTLR end rule__Entity__Group_3__0


    // $ANTLR start rule__Entity__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2102:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2106:1: ( ( 'extends' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2107:1: ( 'extends' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2107:1: ( 'extends' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2108:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Entity__Group_3__0__Impl4313); 
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
    // $ANTLR end rule__Entity__Group_3__0__Impl


    // $ANTLR start rule__Entity__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2121:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2125:1: ( rule__Entity__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2126:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14344);
            rule__Entity__Group_3__1__Impl();
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
    // $ANTLR end rule__Entity__Group_3__1


    // $ANTLR start rule__Entity__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2132:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2136:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2137:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2137:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2138:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2139:1: ( rule__Entity__SuperTypeAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2139:2: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4371);
            rule__Entity__SuperTypeAssignment_3_1();
            _fsp--;


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
    // $ANTLR end rule__Entity__Group_3__1__Impl


    // $ANTLR start rule__Feature__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2153:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2157:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2158:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04405);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04408);
            rule__Feature__Group__1();
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
    // $ANTLR end rule__Feature__Group__0


    // $ANTLR start rule__Feature__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2165:1: rule__Feature__Group__0__Impl : ( ruleStructuralFeature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2169:1: ( ( ruleStructuralFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2170:1: ( ruleStructuralFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2170:1: ( ruleStructuralFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2171:1: ruleStructuralFeature
            {
             before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4435);
            ruleStructuralFeature();
            _fsp--;

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
    // $ANTLR end rule__Feature__Group__0__Impl


    // $ANTLR start rule__Feature__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2182:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2186:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2187:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14464);
            rule__Feature__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14467);
            rule__Feature__Group__2();
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
    // $ANTLR end rule__Feature__Group__1


    // $ANTLR start rule__Feature__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2194:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2198:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2199:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2199:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2200:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2201:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44||(LA17_0>=54 && LA17_0<=56)||(LA17_0>=58 && LA17_0<=59)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2201:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4494);
                    rule__Feature__ConstraintAssignment_1();
                    _fsp--;


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
    // $ANTLR end rule__Feature__Group__1__Impl


    // $ANTLR start rule__Feature__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2211:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2215:1: ( rule__Feature__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2216:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24525);
            rule__Feature__Group__2__Impl();
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
    // $ANTLR end rule__Feature__Group__2


    // $ANTLR start rule__Feature__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2222:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__DescriptionAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2226:1: ( ( ( rule__Feature__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2227:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2227:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2228:1: ( rule__Feature__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2229:1: ( rule__Feature__DescriptionAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2229:2: rule__Feature__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4552);
                    rule__Feature__DescriptionAssignment_2();
                    _fsp--;


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
    // $ANTLR end rule__Feature__Group__2__Impl


    // $ANTLR start rule__Attribute__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2245:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2249:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2250:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04589);
            rule__Attribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04592);
            rule__Attribute__Group__1();
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
    // $ANTLR end rule__Attribute__Group__0


    // $ANTLR start rule__Attribute__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2257:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2261:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2262:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2262:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2263:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2264:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2264:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4619);
            rule__Attribute__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__0__Impl


    // $ANTLR start rule__Attribute__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2274:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2278:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2279:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14649);
            rule__Attribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14652);
            rule__Attribute__Group__2();
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
    // $ANTLR end rule__Attribute__Group__1


    // $ANTLR start rule__Attribute__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2286:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2290:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2291:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2291:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2292:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Attribute__Group__1__Impl4680); 
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
    // $ANTLR end rule__Attribute__Group__1__Impl


    // $ANTLR start rule__Attribute__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2305:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2309:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2310:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24711);
            rule__Attribute__Group__2__Impl();
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
    // $ANTLR end rule__Attribute__Group__2


    // $ANTLR start rule__Attribute__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2316:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2320:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2321:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2321:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2322:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2323:1: ( rule__Attribute__TypeAssignment_2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2323:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl4738);
            rule__Attribute__TypeAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__Attribute__Group__2__Impl


    // $ANTLR start rule__Reference__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2339:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2343:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2344:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04774);
            rule__Reference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04777);
            rule__Reference__Group__1();
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
    // $ANTLR end rule__Reference__Group__0


    // $ANTLR start rule__Reference__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2351:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2355:1: ( ( 'ref' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2356:1: ( 'ref' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2356:1: ( 'ref' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2357:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Reference__Group__0__Impl4805); 
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
    // $ANTLR end rule__Reference__Group__0__Impl


    // $ANTLR start rule__Reference__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2370:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2374:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2375:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14836);
            rule__Reference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14839);
            rule__Reference__Group__2();
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
    // $ANTLR end rule__Reference__Group__1


    // $ANTLR start rule__Reference__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2382:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2386:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2387:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2387:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2388:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2389:1: ( rule__Reference__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2389:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl4866);
            rule__Reference__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Reference__Group__1__Impl


    // $ANTLR start rule__Reference__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2399:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2403:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2404:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24896);
            rule__Reference__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24899);
            rule__Reference__Group__3();
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
    // $ANTLR end rule__Reference__Group__2


    // $ANTLR start rule__Reference__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2411:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2415:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2416:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2416:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2417:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Reference__Group__2__Impl4927); 
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
    // $ANTLR end rule__Reference__Group__2__Impl


    // $ANTLR start rule__Reference__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2430:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2434:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2435:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34958);
            rule__Reference__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34961);
            rule__Reference__Group__4();
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
    // $ANTLR end rule__Reference__Group__3


    // $ANTLR start rule__Reference__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2442:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2446:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2447:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2447:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2448:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2449:1: ( rule__Reference__TypeAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2449:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4988);
            rule__Reference__TypeAssignment_3();
            _fsp--;


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
    // $ANTLR end rule__Reference__Group__3__Impl


    // $ANTLR start rule__Reference__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2459:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2463:1: ( rule__Reference__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2464:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45018);
            rule__Reference__Group__4__Impl();
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
    // $ANTLR end rule__Reference__Group__4


    // $ANTLR start rule__Reference__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2470:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2474:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2475:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2475:1: ( ( rule__Reference__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2476:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2477:1: ( rule__Reference__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2477:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5045);
                    rule__Reference__Group_4__0();
                    _fsp--;


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
    // $ANTLR end rule__Reference__Group__4__Impl


    // $ANTLR start rule__Reference__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2497:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2501:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2502:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05086);
            rule__Reference__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05089);
            rule__Reference__Group_4__1();
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
    // $ANTLR end rule__Reference__Group_4__0


    // $ANTLR start rule__Reference__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2509:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2513:1: ( ( 'opposite' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2514:1: ( 'opposite' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2514:1: ( 'opposite' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2515:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__Reference__Group_4__0__Impl5117); 
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
    // $ANTLR end rule__Reference__Group_4__0__Impl


    // $ANTLR start rule__Reference__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2528:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2532:1: ( rule__Reference__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2533:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15148);
            rule__Reference__Group_4__1__Impl();
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
    // $ANTLR end rule__Reference__Group_4__1


    // $ANTLR start rule__Reference__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2539:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2543:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2544:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2544:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2545:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2546:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2546:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5175);
            rule__Reference__OppositeAssignment_4_1();
            _fsp--;


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
    // $ANTLR end rule__Reference__Group_4__1__Impl


    // $ANTLR start rule__Enumeration__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2560:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2564:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2565:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05209);
            rule__Enumeration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05212);
            rule__Enumeration__Group__1();
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
    // $ANTLR end rule__Enumeration__Group__0


    // $ANTLR start rule__Enumeration__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2572:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2576:1: ( ( 'enumeration' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2577:1: ( 'enumeration' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2577:1: ( 'enumeration' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2578:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Enumeration__Group__0__Impl5240); 
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
    // $ANTLR end rule__Enumeration__Group__0__Impl


    // $ANTLR start rule__Enumeration__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2591:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2595:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2596:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15271);
            rule__Enumeration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15274);
            rule__Enumeration__Group__2();
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
    // $ANTLR end rule__Enumeration__Group__1


    // $ANTLR start rule__Enumeration__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2603:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2607:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2608:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2608:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2609:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2610:1: ( rule__Enumeration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2610:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5301);
            rule__Enumeration__NameAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Enumeration__Group__1__Impl


    // $ANTLR start rule__Enumeration__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2620:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2624:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2625:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25331);
            rule__Enumeration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25334);
            rule__Enumeration__Group__3();
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
    // $ANTLR end rule__Enumeration__Group__2


    // $ANTLR start rule__Enumeration__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2632:1: rule__Enumeration__Group__2__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2636:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2637:1: ( '[' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2637:1: ( '[' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2638:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Enumeration__Group__2__Impl5362); 
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
    // $ANTLR end rule__Enumeration__Group__2__Impl


    // $ANTLR start rule__Enumeration__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2651:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2655:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2656:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35393);
            rule__Enumeration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35396);
            rule__Enumeration__Group__4();
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
    // $ANTLR end rule__Enumeration__Group__3


    // $ANTLR start rule__Enumeration__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2663:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2667:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2668:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2668:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2669:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2669:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2670:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2671:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2671:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5425);
            rule__Enumeration__EnumerationLiteralsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2674:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2675:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2676:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2676:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5437);
            	    rule__Enumeration__EnumerationLiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end rule__Enumeration__Group__3__Impl


    // $ANTLR start rule__Enumeration__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2687:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2691:1: ( rule__Enumeration__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2692:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45470);
            rule__Enumeration__Group__4__Impl();
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
    // $ANTLR end rule__Enumeration__Group__4


    // $ANTLR start rule__Enumeration__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2698:1: rule__Enumeration__Group__4__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2702:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2703:1: ( ']' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2703:1: ( ']' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2704:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Enumeration__Group__4__Impl5498); 
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
    // $ANTLR end rule__Enumeration__Group__4__Impl


    // $ANTLR start rule__EnumerationLiteral__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2727:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2731:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2732:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05539);
            rule__EnumerationLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05542);
            rule__EnumerationLiteral__Group__1();
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
    // $ANTLR end rule__EnumerationLiteral__Group__0


    // $ANTLR start rule__EnumerationLiteral__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2739:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2743:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2744:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2744:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2745:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2746:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2746:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5569);
            rule__EnumerationLiteral__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__EnumerationLiteral__Group__0__Impl


    // $ANTLR start rule__EnumerationLiteral__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2756:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2760:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2761:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15599);
            rule__EnumerationLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15602);
            rule__EnumerationLiteral__Group__2();
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
    // $ANTLR end rule__EnumerationLiteral__Group__1


    // $ANTLR start rule__EnumerationLiteral__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2768:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2772:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2773:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2773:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2774:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2775:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2775:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5629);
            rule__EnumerationLiteral__Group_1__0();
            _fsp--;


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
    // $ANTLR end rule__EnumerationLiteral__Group__1__Impl


    // $ANTLR start rule__EnumerationLiteral__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2785:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2789:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2790:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25659);
            rule__EnumerationLiteral__Group__2__Impl();
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
    // $ANTLR end rule__EnumerationLiteral__Group__2


    // $ANTLR start rule__EnumerationLiteral__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2796:1: rule__EnumerationLiteral__Group__2__Impl : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2800:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2801:1: ( ';' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2801:1: ( ';' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2802:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__EnumerationLiteral__Group__2__Impl5687); 
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
    // $ANTLR end rule__EnumerationLiteral__Group__2__Impl


    // $ANTLR start rule__EnumerationLiteral__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2821:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2825:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2826:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05724);
            rule__EnumerationLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05727);
            rule__EnumerationLiteral__Group_1__1();
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
    // $ANTLR end rule__EnumerationLiteral__Group_1__0


    // $ANTLR start rule__EnumerationLiteral__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2833:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2837:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2838:1: ( '=' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2838:1: ( '=' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2839:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__EnumerationLiteral__Group_1__0__Impl5755); 
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
    // $ANTLR end rule__EnumerationLiteral__Group_1__0__Impl


    // $ANTLR start rule__EnumerationLiteral__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2852:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2856:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2857:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15786);
            rule__EnumerationLiteral__Group_1__1__Impl();
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
    // $ANTLR end rule__EnumerationLiteral__Group_1__1


    // $ANTLR start rule__EnumerationLiteral__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2863:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2867:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2868:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2868:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2869:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5813);
            rule__EnumerationLiteral__PersistedValueAssignment_1_1();
            _fsp--;


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
    // $ANTLR end rule__EnumerationLiteral__Group_1__1__Impl


    // $ANTLR start rule__Parameter__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2887:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2891:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2892:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05850);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05853);
            rule__Parameter__Group__1();
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
    // $ANTLR end rule__Parameter__Group__0


    // $ANTLR start rule__Parameter__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2899:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2903:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2904:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2904:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2905:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2906:1: ( rule__Parameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2906:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl5880);
            rule__Parameter__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__Parameter__Group__0__Impl


    // $ANTLR start rule__Parameter__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2916:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2920:1: ( rule__Parameter__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2921:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15910);
            rule__Parameter__Group__1__Impl();
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
    // $ANTLR end rule__Parameter__Group__1


    // $ANTLR start rule__Parameter__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2927:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2931:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2932:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2932:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2933:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2934:1: ( rule__Parameter__TypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2934:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl5937);
            rule__Parameter__TypeAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__Parameter__Group__1__Impl


    // $ANTLR start rule__TypeRef__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2948:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2952:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2953:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05971);
            rule__TypeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05974);
            rule__TypeRef__Group__1();
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
    // $ANTLR end rule__TypeRef__Group__0


    // $ANTLR start rule__TypeRef__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2960:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2964:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2965:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2965:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2966:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2967:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2967:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6001);
            rule__TypeRef__ReferencedAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__TypeRef__Group__0__Impl


    // $ANTLR start rule__TypeRef__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2977:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2981:1: ( rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2982:2: rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16031);
            rule__TypeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16034);
            rule__TypeRef__Group__2();
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
    // $ANTLR end rule__TypeRef__Group__1


    // $ANTLR start rule__TypeRef__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2989:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2993:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2994:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2994:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2995:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6061);
                    rule__TypeRef__MultiAssignment_1();
                    _fsp--;


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
    // $ANTLR end rule__TypeRef__Group__1__Impl


    // $ANTLR start rule__TypeRef__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3006:1: rule__TypeRef__Group__2 : rule__TypeRef__Group__2__Impl ;
    public final void rule__TypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3010:1: ( rule__TypeRef__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3011:2: rule__TypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26092);
            rule__TypeRef__Group__2__Impl();
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
    // $ANTLR end rule__TypeRef__Group__2


    // $ANTLR start rule__TypeRef__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3017:1: rule__TypeRef__Group__2__Impl : ( ( rule__TypeRef__OptionAssignment_2 )? ) ;
    public final void rule__TypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3021:1: ( ( ( rule__TypeRef__OptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3022:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3022:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3023:1: ( rule__TypeRef__OptionAssignment_2 )?
            {
             before(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3024:1: ( rule__TypeRef__OptionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3024:2: rule__TypeRef__OptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6119);
                    rule__TypeRef__OptionAssignment_2();
                    _fsp--;


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
    // $ANTLR end rule__TypeRef__Group__2__Impl


    // $ANTLR start rule__QualifiedNameWithWildCard__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3040:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3044:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3045:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06156);
            rule__QualifiedNameWithWildCard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06159);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3052:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3056:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3057:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3057:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3058:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6186);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3069:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3073:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3074:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16215);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3080:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3084:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3085:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3085:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3086:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3087:1: ( '.*' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3088:2: '.*'
                    {
                    match(input,41,FOLLOW_41_in_rule__QualifiedNameWithWildCard__Group__1__Impl6244); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3103:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3107:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3108:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06281);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06284);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3115:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3119:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3120:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3120:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3121:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6311); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3132:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3136:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3137:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16340);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3143:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3147:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3148:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3148:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3149:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3150:1: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3150:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6367);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3164:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3168:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3169:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06402);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06405);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3176:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3180:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3181:1: ( '.' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3181:1: ( '.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3182:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl6433); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3195:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3199:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3200:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16464);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3206:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3210:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3211:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3211:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3212:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6491); 
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


    // $ANTLR start rule__StringConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3227:1: rule__StringConstraint__Group__0 : rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 ;
    public final void rule__StringConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3231:1: ( rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3232:2: rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__06524);
            rule__StringConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__06527);
            rule__StringConstraint__Group__1();
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
    // $ANTLR end rule__StringConstraint__Group__0


    // $ANTLR start rule__StringConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3239:1: rule__StringConstraint__Group__0__Impl : ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__StringConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3243:1: ( ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3244:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3244:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3245:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3246:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3246:2: rule__StringConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl6554);
            rule__StringConstraint__ConstraintAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__StringConstraint__Group__0__Impl


    // $ANTLR start rule__StringConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3256:1: rule__StringConstraint__Group__1 : rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 ;
    public final void rule__StringConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3260:1: ( rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3261:2: rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__16584);
            rule__StringConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__16587);
            rule__StringConstraint__Group__2();
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
    // $ANTLR end rule__StringConstraint__Group__1


    // $ANTLR start rule__StringConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3268:1: rule__StringConstraint__Group__1__Impl : ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__StringConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3272:1: ( ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3273:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3273:1: ( ( rule__StringConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3274:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3275:1: ( rule__StringConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3275:2: rule__StringConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl6614);
            rule__StringConstraint__ConstraintRefAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__StringConstraint__Group__1__Impl


    // $ANTLR start rule__StringConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3285:1: rule__StringConstraint__Group__2 : rule__StringConstraint__Group__2__Impl ;
    public final void rule__StringConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3289:1: ( rule__StringConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3290:2: rule__StringConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__26644);
            rule__StringConstraint__Group__2__Impl();
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
    // $ANTLR end rule__StringConstraint__Group__2


    // $ANTLR start rule__StringConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3296:1: rule__StringConstraint__Group__2__Impl : ( ( rule__StringConstraint__Group_2__0 )? ) ;
    public final void rule__StringConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3300:1: ( ( ( rule__StringConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3301:1: ( ( rule__StringConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3301:1: ( ( rule__StringConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3302:1: ( rule__StringConstraint__Group_2__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3303:1: ( rule__StringConstraint__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3303:2: rule__StringConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl6671);
                    rule__StringConstraint__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__StringConstraint__Group__2__Impl


    // $ANTLR start rule__StringConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3319:1: rule__StringConstraint__Group_2__0 : rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 ;
    public final void rule__StringConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3323:1: ( rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3324:2: rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__06708);
            rule__StringConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__06711);
            rule__StringConstraint__Group_2__1();
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
    // $ANTLR end rule__StringConstraint__Group_2__0


    // $ANTLR start rule__StringConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3331:1: rule__StringConstraint__Group_2__0__Impl : ( 'regexp' ) ;
    public final void rule__StringConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3335:1: ( ( 'regexp' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3336:1: ( 'regexp' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3336:1: ( 'regexp' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3337:1: 'regexp'
            {
             before(grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__StringConstraint__Group_2__0__Impl6739); 
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
    // $ANTLR end rule__StringConstraint__Group_2__0__Impl


    // $ANTLR start rule__StringConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3350:1: rule__StringConstraint__Group_2__1 : rule__StringConstraint__Group_2__1__Impl ;
    public final void rule__StringConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3354:1: ( rule__StringConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3355:2: rule__StringConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__16770);
            rule__StringConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__StringConstraint__Group_2__1


    // $ANTLR start rule__StringConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3361:1: rule__StringConstraint__Group_2__1__Impl : ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) ;
    public final void rule__StringConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3365:1: ( ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3366:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3366:1: ( ( rule__StringConstraint__RegularExpressionAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3367:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3368:1: ( rule__StringConstraint__RegularExpressionAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3368:2: rule__StringConstraint__RegularExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl6797);
            rule__StringConstraint__RegularExpressionAssignment_2_1();
            _fsp--;


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
    // $ANTLR end rule__StringConstraint__Group_2__1__Impl


    // $ANTLR start rule__DateTimeConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3382:1: rule__DateTimeConstraint__Group__0 : rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 ;
    public final void rule__DateTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3386:1: ( rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3387:2: rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__06831);
            rule__DateTimeConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__06834);
            rule__DateTimeConstraint__Group__1();
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
    // $ANTLR end rule__DateTimeConstraint__Group__0


    // $ANTLR start rule__DateTimeConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3394:1: rule__DateTimeConstraint__Group__0__Impl : ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DateTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3398:1: ( ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3399:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3399:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3400:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3401:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3401:2: rule__DateTimeConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl6861);
            rule__DateTimeConstraint__ConstraintAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__DateTimeConstraint__Group__0__Impl


    // $ANTLR start rule__DateTimeConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3411:1: rule__DateTimeConstraint__Group__1 : rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 ;
    public final void rule__DateTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3415:1: ( rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3416:2: rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__16891);
            rule__DateTimeConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__16894);
            rule__DateTimeConstraint__Group__2();
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
    // $ANTLR end rule__DateTimeConstraint__Group__1


    // $ANTLR start rule__DateTimeConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3423:1: rule__DateTimeConstraint__Group__1__Impl : ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) ;
    public final void rule__DateTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3427:1: ( ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3428:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3428:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3429:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3430:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3430:2: rule__DateTimeConstraint__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl6921);
            rule__DateTimeConstraint__DataTypeAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__DateTimeConstraint__Group__1__Impl


    // $ANTLR start rule__DateTimeConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3440:1: rule__DateTimeConstraint__Group__2 : rule__DateTimeConstraint__Group__2__Impl ;
    public final void rule__DateTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3444:1: ( rule__DateTimeConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3445:2: rule__DateTimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__26951);
            rule__DateTimeConstraint__Group__2__Impl();
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
    // $ANTLR end rule__DateTimeConstraint__Group__2


    // $ANTLR start rule__DateTimeConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3451:1: rule__DateTimeConstraint__Group__2__Impl : ( ( rule__DateTimeConstraint__Group_2__0 )? ) ;
    public final void rule__DateTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3455:1: ( ( ( rule__DateTimeConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3456:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3456:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3457:1: ( rule__DateTimeConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3458:1: ( rule__DateTimeConstraint__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3458:2: rule__DateTimeConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl6978);
                    rule__DateTimeConstraint__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__DateTimeConstraint__Group__2__Impl


    // $ANTLR start rule__DateTimeConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3474:1: rule__DateTimeConstraint__Group_2__0 : rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 ;
    public final void rule__DateTimeConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3478:1: ( rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3479:2: rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__07015);
            rule__DateTimeConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__07018);
            rule__DateTimeConstraint__Group_2__1();
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
    // $ANTLR end rule__DateTimeConstraint__Group_2__0


    // $ANTLR start rule__DateTimeConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3486:1: rule__DateTimeConstraint__Group_2__0__Impl : ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3490:1: ( ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3492:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3493:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3493:2: rule__DateTimeConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl7045);
            rule__DateTimeConstraint__HasDefaultAssignment_2_0();
            _fsp--;


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
    // $ANTLR end rule__DateTimeConstraint__Group_2__0__Impl


    // $ANTLR start rule__DateTimeConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3503:1: rule__DateTimeConstraint__Group_2__1 : rule__DateTimeConstraint__Group_2__1__Impl ;
    public final void rule__DateTimeConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3507:1: ( rule__DateTimeConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3508:2: rule__DateTimeConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__17075);
            rule__DateTimeConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__DateTimeConstraint__Group_2__1


    // $ANTLR start rule__DateTimeConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3514:1: rule__DateTimeConstraint__Group_2__1__Impl : ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3518:1: ( ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3519:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3519:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3520:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3521:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3521:2: rule__DateTimeConstraint__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl7102);
            rule__DateTimeConstraint__DefaultValueAssignment_2_1();
            _fsp--;


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
    // $ANTLR end rule__DateTimeConstraint__Group_2__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3535:1: rule__IntegerConstraint__Group__0 : rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 ;
    public final void rule__IntegerConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3539:1: ( rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3540:2: rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__07136);
            rule__IntegerConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__07139);
            rule__IntegerConstraint__Group__1();
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
    // $ANTLR end rule__IntegerConstraint__Group__0


    // $ANTLR start rule__IntegerConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3547:1: rule__IntegerConstraint__Group__0__Impl : ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__IntegerConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3551:1: ( ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3553:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3554:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3554:2: rule__IntegerConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl7166);
            rule__IntegerConstraint__ConstraintAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3564:1: rule__IntegerConstraint__Group__1 : rule__IntegerConstraint__Group__1__Impl ;
    public final void rule__IntegerConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3568:1: ( rule__IntegerConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3569:2: rule__IntegerConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__17196);
            rule__IntegerConstraint__Group__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group__1


    // $ANTLR start rule__IntegerConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3575:1: rule__IntegerConstraint__Group__1__Impl : ( ( rule__IntegerConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__IntegerConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3579:1: ( ( ( rule__IntegerConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3580:1: ( ( rule__IntegerConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3580:1: ( ( rule__IntegerConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3581:1: ( rule__IntegerConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3582:1: ( rule__IntegerConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3582:2: rule__IntegerConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__ConstraintRefAssignment_1_in_rule__IntegerConstraint__Group__1__Impl7223);
            rule__IntegerConstraint__ConstraintRefAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getConstraintRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3596:1: rule__DecimalConstraint__Group__0 : rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 ;
    public final void rule__DecimalConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3600:1: ( rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3601:2: rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__07257);
            rule__DecimalConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__07260);
            rule__DecimalConstraint__Group__1();
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
    // $ANTLR end rule__DecimalConstraint__Group__0


    // $ANTLR start rule__DecimalConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3608:1: rule__DecimalConstraint__Group__0__Impl : ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DecimalConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3612:1: ( ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3613:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3613:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3614:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3615:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3615:2: rule__DecimalConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl7287);
            rule__DecimalConstraint__ConstraintAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__DecimalConstraint__Group__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3625:1: rule__DecimalConstraint__Group__1 : rule__DecimalConstraint__Group__1__Impl ;
    public final void rule__DecimalConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3629:1: ( rule__DecimalConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3630:2: rule__DecimalConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__17317);
            rule__DecimalConstraint__Group__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group__1


    // $ANTLR start rule__DecimalConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3636:1: rule__DecimalConstraint__Group__1__Impl : ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) ;
    public final void rule__DecimalConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3640:1: ( ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3641:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3641:1: ( ( rule__DecimalConstraint__ConstraintRefAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3642:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3643:1: ( rule__DecimalConstraint__ConstraintRefAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3643:2: rule__DecimalConstraint__ConstraintRefAssignment_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl7344);
            rule__DecimalConstraint__ConstraintRefAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__DecimalConstraint__Group__1__Impl


    // $ANTLR start rule__EnumerationConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3657:1: rule__EnumerationConstraint__Group__0 : rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 ;
    public final void rule__EnumerationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3661:1: ( rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3662:2: rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__07378);
            rule__EnumerationConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__07381);
            rule__EnumerationConstraint__Group__1();
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
    // $ANTLR end rule__EnumerationConstraint__Group__0


    // $ANTLR start rule__EnumerationConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3669:1: rule__EnumerationConstraint__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3673:1: ( ( 'enum' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3674:1: ( 'enum' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3674:1: ( 'enum' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3675:1: 'enum'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumerationConstraint__Group__0__Impl7409); 
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
    // $ANTLR end rule__EnumerationConstraint__Group__0__Impl


    // $ANTLR start rule__EnumerationConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3688:1: rule__EnumerationConstraint__Group__1 : rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 ;
    public final void rule__EnumerationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3692:1: ( rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3693:2: rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__17440);
            rule__EnumerationConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__17443);
            rule__EnumerationConstraint__Group__2();
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
    // $ANTLR end rule__EnumerationConstraint__Group__1


    // $ANTLR start rule__EnumerationConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3700:1: rule__EnumerationConstraint__Group__1__Impl : ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) ;
    public final void rule__EnumerationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3704:1: ( ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3705:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3705:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3706:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3707:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3707:2: rule__EnumerationConstraint__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl7470);
            rule__EnumerationConstraint__UsageAssignment_1();
            _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group__1__Impl


    // $ANTLR start rule__EnumerationConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3717:1: rule__EnumerationConstraint__Group__2 : rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 ;
    public final void rule__EnumerationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3721:1: ( rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3722:2: rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__27500);
            rule__EnumerationConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__27503);
            rule__EnumerationConstraint__Group__3();
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
    // $ANTLR end rule__EnumerationConstraint__Group__2


    // $ANTLR start rule__EnumerationConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3729:1: rule__EnumerationConstraint__Group__2__Impl : ( ( rule__EnumerationConstraint__Group_2__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3733:1: ( ( ( rule__EnumerationConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3734:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3734:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3735:1: ( rule__EnumerationConstraint__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3736:1: ( rule__EnumerationConstraint__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3736:2: rule__EnumerationConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl7530);
                    rule__EnumerationConstraint__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group__2__Impl


    // $ANTLR start rule__EnumerationConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3746:1: rule__EnumerationConstraint__Group__3 : rule__EnumerationConstraint__Group__3__Impl ;
    public final void rule__EnumerationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3750:1: ( rule__EnumerationConstraint__Group__3__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3751:2: rule__EnumerationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__37561);
            rule__EnumerationConstraint__Group__3__Impl();
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
    // $ANTLR end rule__EnumerationConstraint__Group__3


    // $ANTLR start rule__EnumerationConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3757:1: rule__EnumerationConstraint__Group__3__Impl : ( ( rule__EnumerationConstraint__Group_3__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3761:1: ( ( ( rule__EnumerationConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3762:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3762:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3763:1: ( rule__EnumerationConstraint__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3764:1: ( rule__EnumerationConstraint__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==57) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3764:2: rule__EnumerationConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl7588);
                    rule__EnumerationConstraint__Group_3__0();
                    _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group__3__Impl


    // $ANTLR start rule__EnumerationConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3782:1: rule__EnumerationConstraint__Group_2__0 : rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 ;
    public final void rule__EnumerationConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3786:1: ( rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3787:2: rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__07627);
            rule__EnumerationConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__07630);
            rule__EnumerationConstraint__Group_2__1();
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
    // $ANTLR end rule__EnumerationConstraint__Group_2__0


    // $ANTLR start rule__EnumerationConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3794:1: rule__EnumerationConstraint__Group_2__0__Impl : ( 'fixeLen' ) ;
    public final void rule__EnumerationConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3798:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3799:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3799:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3800:1: 'fixeLen'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumerationConstraint__Group_2__0__Impl7658); 
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
    // $ANTLR end rule__EnumerationConstraint__Group_2__0__Impl


    // $ANTLR start rule__EnumerationConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3813:1: rule__EnumerationConstraint__Group_2__1 : rule__EnumerationConstraint__Group_2__1__Impl ;
    public final void rule__EnumerationConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3817:1: ( rule__EnumerationConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3818:2: rule__EnumerationConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__17689);
            rule__EnumerationConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__EnumerationConstraint__Group_2__1


    // $ANTLR start rule__EnumerationConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3824:1: rule__EnumerationConstraint__Group_2__1__Impl : ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3828:1: ( ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3829:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3829:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3830:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3831:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3831:2: rule__EnumerationConstraint__FixeLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl7716);
            rule__EnumerationConstraint__FixeLenAssignment_2_1();
            _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group_2__1__Impl


    // $ANTLR start rule__EnumerationConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3845:1: rule__EnumerationConstraint__Group_3__0 : rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 ;
    public final void rule__EnumerationConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3849:1: ( rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3850:2: rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__07750);
            rule__EnumerationConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__07753);
            rule__EnumerationConstraint__Group_3__1();
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
    // $ANTLR end rule__EnumerationConstraint__Group_3__0


    // $ANTLR start rule__EnumerationConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3857:1: rule__EnumerationConstraint__Group_3__0__Impl : ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3861:1: ( ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3862:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3862:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3863:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_3_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3864:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3864:2: rule__EnumerationConstraint__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl7780);
            rule__EnumerationConstraint__HasDefaultAssignment_3_0();
            _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group_3__0__Impl


    // $ANTLR start rule__EnumerationConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3874:1: rule__EnumerationConstraint__Group_3__1 : rule__EnumerationConstraint__Group_3__1__Impl ;
    public final void rule__EnumerationConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3878:1: ( rule__EnumerationConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3879:2: rule__EnumerationConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__17810);
            rule__EnumerationConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__EnumerationConstraint__Group_3__1


    // $ANTLR start rule__EnumerationConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3885:1: rule__EnumerationConstraint__Group_3__1__Impl : ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3889:1: ( ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3890:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3890:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3891:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3892:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3892:2: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl7837);
            rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1();
            _fsp--;


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
    // $ANTLR end rule__EnumerationConstraint__Group_3__1__Impl


    // $ANTLR start rule__NumberConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3906:1: rule__NumberConstraint__Group__0 : rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 ;
    public final void rule__NumberConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3910:1: ( rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3911:2: rule__NumberConstraint__Group__0__Impl rule__NumberConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__07871);
            rule__NumberConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__07874);
            rule__NumberConstraint__Group__1();
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
    // $ANTLR end rule__NumberConstraint__Group__0


    // $ANTLR start rule__NumberConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3918:1: rule__NumberConstraint__Group__0__Impl : ( ( rule__NumberConstraint__Group_0__0 )? ) ;
    public final void rule__NumberConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3922:1: ( ( ( rule__NumberConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3923:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3923:1: ( ( rule__NumberConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3924:1: ( rule__NumberConstraint__Group_0__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3925:1: ( rule__NumberConstraint__Group_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3925:2: rule__NumberConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl7901);
                    rule__NumberConstraint__Group_0__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__0__Impl


    // $ANTLR start rule__NumberConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3935:1: rule__NumberConstraint__Group__1 : rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 ;
    public final void rule__NumberConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3939:1: ( rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3940:2: rule__NumberConstraint__Group__1__Impl rule__NumberConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__17932);
            rule__NumberConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__17935);
            rule__NumberConstraint__Group__2();
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
    // $ANTLR end rule__NumberConstraint__Group__1


    // $ANTLR start rule__NumberConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3947:1: rule__NumberConstraint__Group__1__Impl : ( ( rule__NumberConstraint__Group_1__0 )? ) ;
    public final void rule__NumberConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3951:1: ( ( ( rule__NumberConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3952:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3952:1: ( ( rule__NumberConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3953:1: ( rule__NumberConstraint__Group_1__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3954:1: ( rule__NumberConstraint__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3954:2: rule__NumberConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl7962);
                    rule__NumberConstraint__Group_1__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__1__Impl


    // $ANTLR start rule__NumberConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3964:1: rule__NumberConstraint__Group__2 : rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 ;
    public final void rule__NumberConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3968:1: ( rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3969:2: rule__NumberConstraint__Group__2__Impl rule__NumberConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__27993);
            rule__NumberConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__27996);
            rule__NumberConstraint__Group__3();
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
    // $ANTLR end rule__NumberConstraint__Group__2


    // $ANTLR start rule__NumberConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3976:1: rule__NumberConstraint__Group__2__Impl : ( ( rule__NumberConstraint__Group_2__0 )? ) ;
    public final void rule__NumberConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3980:1: ( ( ( rule__NumberConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3981:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3981:1: ( ( rule__NumberConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3982:1: ( rule__NumberConstraint__Group_2__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:1: ( rule__NumberConstraint__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:2: rule__NumberConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl8023);
                    rule__NumberConstraint__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__2__Impl


    // $ANTLR start rule__NumberConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3993:1: rule__NumberConstraint__Group__3 : rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 ;
    public final void rule__NumberConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3997:1: ( rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3998:2: rule__NumberConstraint__Group__3__Impl rule__NumberConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__38054);
            rule__NumberConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__38057);
            rule__NumberConstraint__Group__4();
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
    // $ANTLR end rule__NumberConstraint__Group__3


    // $ANTLR start rule__NumberConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4005:1: rule__NumberConstraint__Group__3__Impl : ( ( rule__NumberConstraint__Group_3__0 )? ) ;
    public final void rule__NumberConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4009:1: ( ( ( rule__NumberConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4010:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4010:1: ( ( rule__NumberConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4011:1: ( rule__NumberConstraint__Group_3__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4012:1: ( rule__NumberConstraint__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4012:2: rule__NumberConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl8084);
                    rule__NumberConstraint__Group_3__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__3__Impl


    // $ANTLR start rule__NumberConstraint__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4022:1: rule__NumberConstraint__Group__4 : rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 ;
    public final void rule__NumberConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4026:1: ( rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4027:2: rule__NumberConstraint__Group__4__Impl rule__NumberConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__48115);
            rule__NumberConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__48118);
            rule__NumberConstraint__Group__5();
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
    // $ANTLR end rule__NumberConstraint__Group__4


    // $ANTLR start rule__NumberConstraint__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4034:1: rule__NumberConstraint__Group__4__Impl : ( ( rule__NumberConstraint__Group_4__0 )? ) ;
    public final void rule__NumberConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4038:1: ( ( ( rule__NumberConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4039:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4039:1: ( ( rule__NumberConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4040:1: ( rule__NumberConstraint__Group_4__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4041:1: ( rule__NumberConstraint__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4041:2: rule__NumberConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl8145);
                    rule__NumberConstraint__Group_4__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__4__Impl


    // $ANTLR start rule__NumberConstraint__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4051:1: rule__NumberConstraint__Group__5 : rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 ;
    public final void rule__NumberConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4055:1: ( rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4056:2: rule__NumberConstraint__Group__5__Impl rule__NumberConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__58176);
            rule__NumberConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__58179);
            rule__NumberConstraint__Group__6();
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
    // $ANTLR end rule__NumberConstraint__Group__5


    // $ANTLR start rule__NumberConstraint__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4063:1: rule__NumberConstraint__Group__5__Impl : ( ( rule__NumberConstraint__Group_5__0 )? ) ;
    public final void rule__NumberConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4067:1: ( ( ( rule__NumberConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4068:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4068:1: ( ( rule__NumberConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4069:1: ( rule__NumberConstraint__Group_5__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4070:1: ( rule__NumberConstraint__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4070:2: rule__NumberConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl8206);
                    rule__NumberConstraint__Group_5__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__5__Impl


    // $ANTLR start rule__NumberConstraint__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4080:1: rule__NumberConstraint__Group__6 : rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 ;
    public final void rule__NumberConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4084:1: ( rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4085:2: rule__NumberConstraint__Group__6__Impl rule__NumberConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__68237);
            rule__NumberConstraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__68240);
            rule__NumberConstraint__Group__7();
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
    // $ANTLR end rule__NumberConstraint__Group__6


    // $ANTLR start rule__NumberConstraint__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4092:1: rule__NumberConstraint__Group__6__Impl : ( ( rule__NumberConstraint__Group_6__0 )? ) ;
    public final void rule__NumberConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4096:1: ( ( ( rule__NumberConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4097:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4097:1: ( ( rule__NumberConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4098:1: ( rule__NumberConstraint__Group_6__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4099:1: ( rule__NumberConstraint__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4099:2: rule__NumberConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl8267);
                    rule__NumberConstraint__Group_6__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__6__Impl


    // $ANTLR start rule__NumberConstraint__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4109:1: rule__NumberConstraint__Group__7 : rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 ;
    public final void rule__NumberConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4113:1: ( rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4114:2: rule__NumberConstraint__Group__7__Impl rule__NumberConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__78298);
            rule__NumberConstraint__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__78301);
            rule__NumberConstraint__Group__8();
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
    // $ANTLR end rule__NumberConstraint__Group__7


    // $ANTLR start rule__NumberConstraint__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4121:1: rule__NumberConstraint__Group__7__Impl : ( ( rule__NumberConstraint__Group_7__0 )? ) ;
    public final void rule__NumberConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4125:1: ( ( ( rule__NumberConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4126:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4126:1: ( ( rule__NumberConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4127:1: ( rule__NumberConstraint__Group_7__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4128:1: ( rule__NumberConstraint__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4128:2: rule__NumberConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl8328);
                    rule__NumberConstraint__Group_7__0();
                    _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group__7__Impl


    // $ANTLR start rule__NumberConstraint__Group__8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4138:1: rule__NumberConstraint__Group__8 : rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 ;
    public final void rule__NumberConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4142:1: ( rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4143:2: rule__NumberConstraint__Group__8__Impl rule__NumberConstraint__Group__9
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__88359);
            rule__NumberConstraint__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__88362);
            rule__NumberConstraint__Group__9();
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
    // $ANTLR end rule__NumberConstraint__Group__8


    // $ANTLR start rule__NumberConstraint__Group__8__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4150:1: rule__NumberConstraint__Group__8__Impl : ( ( rule__NumberConstraint__NullableAssignment_8 )? ) ;
    public final void rule__NumberConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4154:1: ( ( ( rule__NumberConstraint__NullableAssignment_8 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4155:1: ( ( rule__NumberConstraint__NullableAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4155:1: ( ( rule__NumberConstraint__NullableAssignment_8 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4156:1: ( rule__NumberConstraint__NullableAssignment_8 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4157:1: ( rule__NumberConstraint__NullableAssignment_8 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4157:2: rule__NumberConstraint__NullableAssignment_8
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__NullableAssignment_8_in_rule__NumberConstraint__Group__8__Impl8389);
                    rule__NumberConstraint__NullableAssignment_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getNullableAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group__8__Impl


    // $ANTLR start rule__NumberConstraint__Group__9
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4167:1: rule__NumberConstraint__Group__9 : rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 ;
    public final void rule__NumberConstraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4171:1: ( rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4172:2: rule__NumberConstraint__Group__9__Impl rule__NumberConstraint__Group__10
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__98420);
            rule__NumberConstraint__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__98423);
            rule__NumberConstraint__Group__10();
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
    // $ANTLR end rule__NumberConstraint__Group__9


    // $ANTLR start rule__NumberConstraint__Group__9__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4179:1: rule__NumberConstraint__Group__9__Impl : ( ( rule__NumberConstraint__Group_9__0 )? ) ;
    public final void rule__NumberConstraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4183:1: ( ( ( rule__NumberConstraint__Group_9__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4184:1: ( ( rule__NumberConstraint__Group_9__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4184:1: ( ( rule__NumberConstraint__Group_9__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4185:1: ( rule__NumberConstraint__Group_9__0 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getGroup_9()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4186:1: ( rule__NumberConstraint__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4186:2: rule__NumberConstraint__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__Group_9__0_in_rule__NumberConstraint__Group__9__Impl8450);
                    rule__NumberConstraint__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group__9__Impl


    // $ANTLR start rule__NumberConstraint__Group__10
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4196:1: rule__NumberConstraint__Group__10 : rule__NumberConstraint__Group__10__Impl ;
    public final void rule__NumberConstraint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4200:1: ( rule__NumberConstraint__Group__10__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4201:2: rule__NumberConstraint__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__108481);
            rule__NumberConstraint__Group__10__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group__10


    // $ANTLR start rule__NumberConstraint__Group__10__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4207:1: rule__NumberConstraint__Group__10__Impl : ( ( rule__NumberConstraint__IsXSDAttAssignment_10 )? ) ;
    public final void rule__NumberConstraint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4211:1: ( ( ( rule__NumberConstraint__IsXSDAttAssignment_10 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4212:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_10 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4212:1: ( ( rule__NumberConstraint__IsXSDAttAssignment_10 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4213:1: ( rule__NumberConstraint__IsXSDAttAssignment_10 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttAssignment_10()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4214:1: ( rule__NumberConstraint__IsXSDAttAssignment_10 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4214:2: rule__NumberConstraint__IsXSDAttAssignment_10
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_10_in_rule__NumberConstraint__Group__10__Impl8508);
                    rule__NumberConstraint__IsXSDAttAssignment_10();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group__10__Impl


    // $ANTLR start rule__NumberConstraint__Group_0__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4246:1: rule__NumberConstraint__Group_0__0 : rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 ;
    public final void rule__NumberConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4250:1: ( rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4251:2: rule__NumberConstraint__Group_0__0__Impl rule__NumberConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__08561);
            rule__NumberConstraint__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__08564);
            rule__NumberConstraint__Group_0__1();
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
    // $ANTLR end rule__NumberConstraint__Group_0__0


    // $ANTLR start rule__NumberConstraint__Group_0__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4258:1: rule__NumberConstraint__Group_0__0__Impl : ( 'minVal' ) ;
    public final void rule__NumberConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4262:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4263:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4263:1: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4264:1: 'minVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__NumberConstraint__Group_0__0__Impl8592); 
             after(grammarAccess.getNumberConstraintAccess().getMinValKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_0__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_0__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4277:1: rule__NumberConstraint__Group_0__1 : rule__NumberConstraint__Group_0__1__Impl ;
    public final void rule__NumberConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4281:1: ( rule__NumberConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4282:2: rule__NumberConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__18623);
            rule__NumberConstraint__Group_0__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_0__1


    // $ANTLR start rule__NumberConstraint__Group_0__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4288:1: rule__NumberConstraint__Group_0__1__Impl : ( ( rule__NumberConstraint__MinValueAssignment_0_1 ) ) ;
    public final void rule__NumberConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4292:1: ( ( ( rule__NumberConstraint__MinValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4293:1: ( ( rule__NumberConstraint__MinValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4293:1: ( ( rule__NumberConstraint__MinValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4294:1: ( rule__NumberConstraint__MinValueAssignment_0_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4295:1: ( rule__NumberConstraint__MinValueAssignment_0_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4295:2: rule__NumberConstraint__MinValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl8650);
            rule__NumberConstraint__MinValueAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMinValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_0__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4309:1: rule__NumberConstraint__Group_1__0 : rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 ;
    public final void rule__NumberConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4313:1: ( rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4314:2: rule__NumberConstraint__Group_1__0__Impl rule__NumberConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__08684);
            rule__NumberConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__08687);
            rule__NumberConstraint__Group_1__1();
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
    // $ANTLR end rule__NumberConstraint__Group_1__0


    // $ANTLR start rule__NumberConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4321:1: rule__NumberConstraint__Group_1__0__Impl : ( 'maxVal' ) ;
    public final void rule__NumberConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4325:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4326:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4326:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4327:1: 'maxVal'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__NumberConstraint__Group_1__0__Impl8715); 
             after(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_1__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4340:1: rule__NumberConstraint__Group_1__1 : rule__NumberConstraint__Group_1__1__Impl ;
    public final void rule__NumberConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4344:1: ( rule__NumberConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4345:2: rule__NumberConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__18746);
            rule__NumberConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_1__1


    // $ANTLR start rule__NumberConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4351:1: rule__NumberConstraint__Group_1__1__Impl : ( ( rule__NumberConstraint__MaxValueAssignment_1_1 ) ) ;
    public final void rule__NumberConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4355:1: ( ( ( rule__NumberConstraint__MaxValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4356:1: ( ( rule__NumberConstraint__MaxValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4356:1: ( ( rule__NumberConstraint__MaxValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4357:1: ( rule__NumberConstraint__MaxValueAssignment_1_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4358:1: ( rule__NumberConstraint__MaxValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4358:2: rule__NumberConstraint__MaxValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl8773);
            rule__NumberConstraint__MaxValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getMaxValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_1__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4372:1: rule__NumberConstraint__Group_2__0 : rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 ;
    public final void rule__NumberConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4376:1: ( rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4377:2: rule__NumberConstraint__Group_2__0__Impl rule__NumberConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__08807);
            rule__NumberConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__08810);
            rule__NumberConstraint__Group_2__1();
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
    // $ANTLR end rule__NumberConstraint__Group_2__0


    // $ANTLR start rule__NumberConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4384:1: rule__NumberConstraint__Group_2__0__Impl : ( ( rule__NumberConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__NumberConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4388:1: ( ( ( rule__NumberConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4389:1: ( ( rule__NumberConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4389:1: ( ( rule__NumberConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4390:1: ( rule__NumberConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4391:1: ( rule__NumberConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4391:2: rule__NumberConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__HasDefaultAssignment_2_0_in_rule__NumberConstraint__Group_2__0__Impl8837);
            rule__NumberConstraint__HasDefaultAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getHasDefaultAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_2__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4401:1: rule__NumberConstraint__Group_2__1 : rule__NumberConstraint__Group_2__1__Impl ;
    public final void rule__NumberConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4405:1: ( rule__NumberConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4406:2: rule__NumberConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__18867);
            rule__NumberConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_2__1


    // $ANTLR start rule__NumberConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4412:1: rule__NumberConstraint__Group_2__1__Impl : ( ( rule__NumberConstraint__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__NumberConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4416:1: ( ( ( rule__NumberConstraint__DefaultValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4417:1: ( ( rule__NumberConstraint__DefaultValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4417:1: ( ( rule__NumberConstraint__DefaultValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4418:1: ( rule__NumberConstraint__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4419:1: ( rule__NumberConstraint__DefaultValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4419:2: rule__NumberConstraint__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DefaultValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl8894);
            rule__NumberConstraint__DefaultValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getDefaultValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_2__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4433:1: rule__NumberConstraint__Group_3__0 : rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 ;
    public final void rule__NumberConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4437:1: ( rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4438:2: rule__NumberConstraint__Group_3__0__Impl rule__NumberConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__08928);
            rule__NumberConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__08931);
            rule__NumberConstraint__Group_3__1();
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
    // $ANTLR end rule__NumberConstraint__Group_3__0


    // $ANTLR start rule__NumberConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4445:1: rule__NumberConstraint__Group_3__0__Impl : ( ( rule__NumberConstraint__IsFixedAssignment_3_0 ) ) ;
    public final void rule__NumberConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4449:1: ( ( ( rule__NumberConstraint__IsFixedAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4450:1: ( ( rule__NumberConstraint__IsFixedAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4450:1: ( ( rule__NumberConstraint__IsFixedAssignment_3_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4451:1: ( rule__NumberConstraint__IsFixedAssignment_3_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedAssignment_3_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4452:1: ( rule__NumberConstraint__IsFixedAssignment_3_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4452:2: rule__NumberConstraint__IsFixedAssignment_3_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__IsFixedAssignment_3_0_in_rule__NumberConstraint__Group_3__0__Impl8958);
            rule__NumberConstraint__IsFixedAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getIsFixedAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_3__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4462:1: rule__NumberConstraint__Group_3__1 : rule__NumberConstraint__Group_3__1__Impl ;
    public final void rule__NumberConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4466:1: ( rule__NumberConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4467:2: rule__NumberConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__18988);
            rule__NumberConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_3__1


    // $ANTLR start rule__NumberConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4473:1: rule__NumberConstraint__Group_3__1__Impl : ( ( rule__NumberConstraint__FixedValueAssignment_3_1 ) ) ;
    public final void rule__NumberConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4477:1: ( ( ( rule__NumberConstraint__FixedValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4478:1: ( ( rule__NumberConstraint__FixedValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4478:1: ( ( rule__NumberConstraint__FixedValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4479:1: ( rule__NumberConstraint__FixedValueAssignment_3_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4480:1: ( rule__NumberConstraint__FixedValueAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4480:2: rule__NumberConstraint__FixedValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixedValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl9015);
            rule__NumberConstraint__FixedValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getFixedValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_3__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4494:1: rule__NumberConstraint__Group_4__0 : rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 ;
    public final void rule__NumberConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4498:1: ( rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4499:2: rule__NumberConstraint__Group_4__0__Impl rule__NumberConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__09049);
            rule__NumberConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__09052);
            rule__NumberConstraint__Group_4__1();
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
    // $ANTLR end rule__NumberConstraint__Group_4__0


    // $ANTLR start rule__NumberConstraint__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4506:1: rule__NumberConstraint__Group_4__0__Impl : ( 'minLen' ) ;
    public final void rule__NumberConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4510:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4511:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4511:1: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4512:1: 'minLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0()); 
            match(input,48,FOLLOW_48_in_rule__NumberConstraint__Group_4__0__Impl9080); 
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
    // $ANTLR end rule__NumberConstraint__Group_4__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4525:1: rule__NumberConstraint__Group_4__1 : rule__NumberConstraint__Group_4__1__Impl ;
    public final void rule__NumberConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4529:1: ( rule__NumberConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4530:2: rule__NumberConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__19111);
            rule__NumberConstraint__Group_4__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_4__1


    // $ANTLR start rule__NumberConstraint__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4536:1: rule__NumberConstraint__Group_4__1__Impl : ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) ;
    public final void rule__NumberConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4540:1: ( ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4541:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4541:1: ( ( rule__NumberConstraint__MinLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4542:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4543:1: ( rule__NumberConstraint__MinLenAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4543:2: rule__NumberConstraint__MinLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl9138);
            rule__NumberConstraint__MinLenAssignment_4_1();
            _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group_4__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_5__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4557:1: rule__NumberConstraint__Group_5__0 : rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 ;
    public final void rule__NumberConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4561:1: ( rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4562:2: rule__NumberConstraint__Group_5__0__Impl rule__NumberConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__09172);
            rule__NumberConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__09175);
            rule__NumberConstraint__Group_5__1();
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
    // $ANTLR end rule__NumberConstraint__Group_5__0


    // $ANTLR start rule__NumberConstraint__Group_5__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4569:1: rule__NumberConstraint__Group_5__0__Impl : ( 'maxLen' ) ;
    public final void rule__NumberConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4573:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4574:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4574:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4575:1: 'maxLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0()); 
            match(input,49,FOLLOW_49_in_rule__NumberConstraint__Group_5__0__Impl9203); 
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
    // $ANTLR end rule__NumberConstraint__Group_5__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_5__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4588:1: rule__NumberConstraint__Group_5__1 : rule__NumberConstraint__Group_5__1__Impl ;
    public final void rule__NumberConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4592:1: ( rule__NumberConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4593:2: rule__NumberConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__19234);
            rule__NumberConstraint__Group_5__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_5__1


    // $ANTLR start rule__NumberConstraint__Group_5__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4599:1: rule__NumberConstraint__Group_5__1__Impl : ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) ;
    public final void rule__NumberConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4603:1: ( ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4604:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4604:1: ( ( rule__NumberConstraint__MaxLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4605:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4606:1: ( rule__NumberConstraint__MaxLenAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4606:2: rule__NumberConstraint__MaxLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl9261);
            rule__NumberConstraint__MaxLenAssignment_5_1();
            _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group_5__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_6__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4620:1: rule__NumberConstraint__Group_6__0 : rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 ;
    public final void rule__NumberConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4624:1: ( rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4625:2: rule__NumberConstraint__Group_6__0__Impl rule__NumberConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__09295);
            rule__NumberConstraint__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__09298);
            rule__NumberConstraint__Group_6__1();
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
    // $ANTLR end rule__NumberConstraint__Group_6__0


    // $ANTLR start rule__NumberConstraint__Group_6__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4632:1: rule__NumberConstraint__Group_6__0__Impl : ( 'fixeLen' ) ;
    public final void rule__NumberConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4636:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4637:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4637:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4638:1: 'fixeLen'
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0()); 
            match(input,45,FOLLOW_45_in_rule__NumberConstraint__Group_6__0__Impl9326); 
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
    // $ANTLR end rule__NumberConstraint__Group_6__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_6__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4651:1: rule__NumberConstraint__Group_6__1 : rule__NumberConstraint__Group_6__1__Impl ;
    public final void rule__NumberConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4655:1: ( rule__NumberConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4656:2: rule__NumberConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__19357);
            rule__NumberConstraint__Group_6__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_6__1


    // $ANTLR start rule__NumberConstraint__Group_6__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4662:1: rule__NumberConstraint__Group_6__1__Impl : ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) ;
    public final void rule__NumberConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4666:1: ( ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4667:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4667:1: ( ( rule__NumberConstraint__FixeLenAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4668:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4669:1: ( rule__NumberConstraint__FixeLenAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4669:2: rule__NumberConstraint__FixeLenAssignment_6_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl9384);
            rule__NumberConstraint__FixeLenAssignment_6_1();
            _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group_6__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4683:1: rule__NumberConstraint__Group_7__0 : rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 ;
    public final void rule__NumberConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4687:1: ( rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4688:2: rule__NumberConstraint__Group_7__0__Impl rule__NumberConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__09418);
            rule__NumberConstraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__09421);
            rule__NumberConstraint__Group_7__1();
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
    // $ANTLR end rule__NumberConstraint__Group_7__0


    // $ANTLR start rule__NumberConstraint__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4695:1: rule__NumberConstraint__Group_7__0__Impl : ( 'paddle' ) ;
    public final void rule__NumberConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4699:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4700:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4700:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4701:1: 'paddle'
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0()); 
            match(input,50,FOLLOW_50_in_rule__NumberConstraint__Group_7__0__Impl9449); 
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
    // $ANTLR end rule__NumberConstraint__Group_7__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4714:1: rule__NumberConstraint__Group_7__1 : rule__NumberConstraint__Group_7__1__Impl ;
    public final void rule__NumberConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4718:1: ( rule__NumberConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4719:2: rule__NumberConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__19480);
            rule__NumberConstraint__Group_7__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_7__1


    // $ANTLR start rule__NumberConstraint__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4725:1: rule__NumberConstraint__Group_7__1__Impl : ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) ;
    public final void rule__NumberConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4729:1: ( ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4730:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4730:1: ( ( rule__NumberConstraint__PaddleAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4731:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4732:1: ( rule__NumberConstraint__PaddleAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4732:2: rule__NumberConstraint__PaddleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl9507);
            rule__NumberConstraint__PaddleAssignment_7_1();
            _fsp--;


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
    // $ANTLR end rule__NumberConstraint__Group_7__1__Impl


    // $ANTLR start rule__NumberConstraint__Group_9__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4746:1: rule__NumberConstraint__Group_9__0 : rule__NumberConstraint__Group_9__0__Impl rule__NumberConstraint__Group_9__1 ;
    public final void rule__NumberConstraint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4750:1: ( rule__NumberConstraint__Group_9__0__Impl rule__NumberConstraint__Group_9__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4751:2: rule__NumberConstraint__Group_9__0__Impl rule__NumberConstraint__Group_9__1
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_9__0__Impl_in_rule__NumberConstraint__Group_9__09541);
            rule__NumberConstraint__Group_9__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NumberConstraint__Group_9__1_in_rule__NumberConstraint__Group_9__09544);
            rule__NumberConstraint__Group_9__1();
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
    // $ANTLR end rule__NumberConstraint__Group_9__0


    // $ANTLR start rule__NumberConstraint__Group_9__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4758:1: rule__NumberConstraint__Group_9__0__Impl : ( ( rule__NumberConstraint__DerivedAssignment_9_0 ) ) ;
    public final void rule__NumberConstraint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4762:1: ( ( ( rule__NumberConstraint__DerivedAssignment_9_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4763:1: ( ( rule__NumberConstraint__DerivedAssignment_9_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4763:1: ( ( rule__NumberConstraint__DerivedAssignment_9_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4764:1: ( rule__NumberConstraint__DerivedAssignment_9_0 )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedAssignment_9_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4765:1: ( rule__NumberConstraint__DerivedAssignment_9_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4765:2: rule__NumberConstraint__DerivedAssignment_9_0
            {
            pushFollow(FOLLOW_rule__NumberConstraint__DerivedAssignment_9_0_in_rule__NumberConstraint__Group_9__0__Impl9571);
            rule__NumberConstraint__DerivedAssignment_9_0();
            _fsp--;


            }

             after(grammarAccess.getNumberConstraintAccess().getDerivedAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_9__0__Impl


    // $ANTLR start rule__NumberConstraint__Group_9__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4775:1: rule__NumberConstraint__Group_9__1 : rule__NumberConstraint__Group_9__1__Impl ;
    public final void rule__NumberConstraint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4779:1: ( rule__NumberConstraint__Group_9__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4780:2: rule__NumberConstraint__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberConstraint__Group_9__1__Impl_in_rule__NumberConstraint__Group_9__19601);
            rule__NumberConstraint__Group_9__1__Impl();
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
    // $ANTLR end rule__NumberConstraint__Group_9__1


    // $ANTLR start rule__NumberConstraint__Group_9__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4786:1: rule__NumberConstraint__Group_9__1__Impl : ( ( rule__NumberConstraint__WritableAssignment_9_1 )? ) ;
    public final void rule__NumberConstraint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4790:1: ( ( ( rule__NumberConstraint__WritableAssignment_9_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4791:1: ( ( rule__NumberConstraint__WritableAssignment_9_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4791:1: ( ( rule__NumberConstraint__WritableAssignment_9_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4792:1: ( rule__NumberConstraint__WritableAssignment_9_1 )?
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableAssignment_9_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4793:1: ( rule__NumberConstraint__WritableAssignment_9_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==63) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4793:2: rule__NumberConstraint__WritableAssignment_9_1
                    {
                    pushFollow(FOLLOW_rule__NumberConstraint__WritableAssignment_9_1_in_rule__NumberConstraint__Group_9__1__Impl9628);
                    rule__NumberConstraint__WritableAssignment_9_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberConstraintAccess().getWritableAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__Group_9__1__Impl


    // $ANTLR start rule__AllConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4807:1: rule__AllConstraint__Group__0 : rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 ;
    public final void rule__AllConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4811:1: ( rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4812:2: rule__AllConstraint__Group__0__Impl rule__AllConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__09663);
            rule__AllConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__09666);
            rule__AllConstraint__Group__1();
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
    // $ANTLR end rule__AllConstraint__Group__0


    // $ANTLR start rule__AllConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4819:1: rule__AllConstraint__Group__0__Impl : ( ( rule__AllConstraint__Group_0__0 )? ) ;
    public final void rule__AllConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4823:1: ( ( ( rule__AllConstraint__Group_0__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4824:1: ( ( rule__AllConstraint__Group_0__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4824:1: ( ( rule__AllConstraint__Group_0__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4825:1: ( rule__AllConstraint__Group_0__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4826:1: ( rule__AllConstraint__Group_0__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4826:2: rule__AllConstraint__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl9693);
                    rule__AllConstraint__Group_0__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__0__Impl


    // $ANTLR start rule__AllConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4836:1: rule__AllConstraint__Group__1 : rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 ;
    public final void rule__AllConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4840:1: ( rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4841:2: rule__AllConstraint__Group__1__Impl rule__AllConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__19724);
            rule__AllConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__19727);
            rule__AllConstraint__Group__2();
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
    // $ANTLR end rule__AllConstraint__Group__1


    // $ANTLR start rule__AllConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4848:1: rule__AllConstraint__Group__1__Impl : ( ( rule__AllConstraint__Group_1__0 )? ) ;
    public final void rule__AllConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4852:1: ( ( ( rule__AllConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4853:1: ( ( rule__AllConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4853:1: ( ( rule__AllConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4854:1: ( rule__AllConstraint__Group_1__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4855:1: ( rule__AllConstraint__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4855:2: rule__AllConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl9754);
                    rule__AllConstraint__Group_1__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__1__Impl


    // $ANTLR start rule__AllConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4865:1: rule__AllConstraint__Group__2 : rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 ;
    public final void rule__AllConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4869:1: ( rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4870:2: rule__AllConstraint__Group__2__Impl rule__AllConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__29785);
            rule__AllConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__29788);
            rule__AllConstraint__Group__3();
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
    // $ANTLR end rule__AllConstraint__Group__2


    // $ANTLR start rule__AllConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4877:1: rule__AllConstraint__Group__2__Impl : ( ( rule__AllConstraint__Group_2__0 )? ) ;
    public final void rule__AllConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4881:1: ( ( ( rule__AllConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4882:1: ( ( rule__AllConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4882:1: ( ( rule__AllConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4883:1: ( rule__AllConstraint__Group_2__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4884:1: ( rule__AllConstraint__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4884:2: rule__AllConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl9815);
                    rule__AllConstraint__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__2__Impl


    // $ANTLR start rule__AllConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4894:1: rule__AllConstraint__Group__3 : rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 ;
    public final void rule__AllConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4898:1: ( rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4899:2: rule__AllConstraint__Group__3__Impl rule__AllConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__39846);
            rule__AllConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__39849);
            rule__AllConstraint__Group__4();
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
    // $ANTLR end rule__AllConstraint__Group__3


    // $ANTLR start rule__AllConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4906:1: rule__AllConstraint__Group__3__Impl : ( ( rule__AllConstraint__Group_3__0 )? ) ;
    public final void rule__AllConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4910:1: ( ( ( rule__AllConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4911:1: ( ( rule__AllConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4911:1: ( ( rule__AllConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4912:1: ( rule__AllConstraint__Group_3__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4913:1: ( rule__AllConstraint__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4913:2: rule__AllConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl9876);
                    rule__AllConstraint__Group_3__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__3__Impl


    // $ANTLR start rule__AllConstraint__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4923:1: rule__AllConstraint__Group__4 : rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 ;
    public final void rule__AllConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4927:1: ( rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4928:2: rule__AllConstraint__Group__4__Impl rule__AllConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__49907);
            rule__AllConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__49910);
            rule__AllConstraint__Group__5();
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
    // $ANTLR end rule__AllConstraint__Group__4


    // $ANTLR start rule__AllConstraint__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4935:1: rule__AllConstraint__Group__4__Impl : ( ( rule__AllConstraint__Group_4__0 )? ) ;
    public final void rule__AllConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4939:1: ( ( ( rule__AllConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4940:1: ( ( rule__AllConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4940:1: ( ( rule__AllConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4941:1: ( rule__AllConstraint__Group_4__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4942:1: ( rule__AllConstraint__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4942:2: rule__AllConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl9937);
                    rule__AllConstraint__Group_4__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__4__Impl


    // $ANTLR start rule__AllConstraint__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4952:1: rule__AllConstraint__Group__5 : rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 ;
    public final void rule__AllConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4956:1: ( rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4957:2: rule__AllConstraint__Group__5__Impl rule__AllConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__59968);
            rule__AllConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__59971);
            rule__AllConstraint__Group__6();
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
    // $ANTLR end rule__AllConstraint__Group__5


    // $ANTLR start rule__AllConstraint__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4964:1: rule__AllConstraint__Group__5__Impl : ( ( rule__AllConstraint__Group_5__0 )? ) ;
    public final void rule__AllConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4968:1: ( ( ( rule__AllConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4969:1: ( ( rule__AllConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4969:1: ( ( rule__AllConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4970:1: ( rule__AllConstraint__Group_5__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4971:1: ( rule__AllConstraint__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4971:2: rule__AllConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl9998);
                    rule__AllConstraint__Group_5__0();
                    _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group__5__Impl


    // $ANTLR start rule__AllConstraint__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4981:1: rule__AllConstraint__Group__6 : rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 ;
    public final void rule__AllConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4985:1: ( rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4986:2: rule__AllConstraint__Group__6__Impl rule__AllConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__610029);
            rule__AllConstraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__610032);
            rule__AllConstraint__Group__7();
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
    // $ANTLR end rule__AllConstraint__Group__6


    // $ANTLR start rule__AllConstraint__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4993:1: rule__AllConstraint__Group__6__Impl : ( ( rule__AllConstraint__NullableAssignment_6 )? ) ;
    public final void rule__AllConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4997:1: ( ( ( rule__AllConstraint__NullableAssignment_6 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4998:1: ( ( rule__AllConstraint__NullableAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4998:1: ( ( rule__AllConstraint__NullableAssignment_6 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4999:1: ( rule__AllConstraint__NullableAssignment_6 )?
            {
             before(grammarAccess.getAllConstraintAccess().getNullableAssignment_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5000:1: ( rule__AllConstraint__NullableAssignment_6 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5000:2: rule__AllConstraint__NullableAssignment_6
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__NullableAssignment_6_in_rule__AllConstraint__Group__6__Impl10059);
                    rule__AllConstraint__NullableAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getNullableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__Group__6__Impl


    // $ANTLR start rule__AllConstraint__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5010:1: rule__AllConstraint__Group__7 : rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 ;
    public final void rule__AllConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5014:1: ( rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5015:2: rule__AllConstraint__Group__7__Impl rule__AllConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__710090);
            rule__AllConstraint__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__710093);
            rule__AllConstraint__Group__8();
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
    // $ANTLR end rule__AllConstraint__Group__7


    // $ANTLR start rule__AllConstraint__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5022:1: rule__AllConstraint__Group__7__Impl : ( ( rule__AllConstraint__Group_7__0 )? ) ;
    public final void rule__AllConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5026:1: ( ( ( rule__AllConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5027:1: ( ( rule__AllConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5027:1: ( ( rule__AllConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5028:1: ( rule__AllConstraint__Group_7__0 )?
            {
             before(grammarAccess.getAllConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5029:1: ( rule__AllConstraint__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5029:2: rule__AllConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__Group_7__0_in_rule__AllConstraint__Group__7__Impl10120);
                    rule__AllConstraint__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__Group__7__Impl


    // $ANTLR start rule__AllConstraint__Group__8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5039:1: rule__AllConstraint__Group__8 : rule__AllConstraint__Group__8__Impl ;
    public final void rule__AllConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5043:1: ( rule__AllConstraint__Group__8__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5044:2: rule__AllConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__810151);
            rule__AllConstraint__Group__8__Impl();
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
    // $ANTLR end rule__AllConstraint__Group__8


    // $ANTLR start rule__AllConstraint__Group__8__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5050:1: rule__AllConstraint__Group__8__Impl : ( ( rule__AllConstraint__IsXSDAttAssignment_8 )? ) ;
    public final void rule__AllConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5054:1: ( ( ( rule__AllConstraint__IsXSDAttAssignment_8 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5055:1: ( ( rule__AllConstraint__IsXSDAttAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5055:1: ( ( rule__AllConstraint__IsXSDAttAssignment_8 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5056:1: ( rule__AllConstraint__IsXSDAttAssignment_8 )?
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5057:1: ( rule__AllConstraint__IsXSDAttAssignment_8 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5057:2: rule__AllConstraint__IsXSDAttAssignment_8
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__IsXSDAttAssignment_8_in_rule__AllConstraint__Group__8__Impl10178);
                    rule__AllConstraint__IsXSDAttAssignment_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getIsXSDAttAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__Group__8__Impl


    // $ANTLR start rule__AllConstraint__Group_0__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5085:1: rule__AllConstraint__Group_0__0 : rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 ;
    public final void rule__AllConstraint__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5089:1: ( rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5090:2: rule__AllConstraint__Group_0__0__Impl rule__AllConstraint__Group_0__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__010227);
            rule__AllConstraint__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__010230);
            rule__AllConstraint__Group_0__1();
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
    // $ANTLR end rule__AllConstraint__Group_0__0


    // $ANTLR start rule__AllConstraint__Group_0__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5097:1: rule__AllConstraint__Group_0__0__Impl : ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) ;
    public final void rule__AllConstraint__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5101:1: ( ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5102:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5102:1: ( ( rule__AllConstraint__HasDefaultAssignment_0_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5103:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultAssignment_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5104:1: ( rule__AllConstraint__HasDefaultAssignment_0_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5104:2: rule__AllConstraint__HasDefaultAssignment_0_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl10257);
            rule__AllConstraint__HasDefaultAssignment_0_0();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_0__0__Impl


    // $ANTLR start rule__AllConstraint__Group_0__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5114:1: rule__AllConstraint__Group_0__1 : rule__AllConstraint__Group_0__1__Impl ;
    public final void rule__AllConstraint__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5118:1: ( rule__AllConstraint__Group_0__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5119:2: rule__AllConstraint__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__110287);
            rule__AllConstraint__Group_0__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_0__1


    // $ANTLR start rule__AllConstraint__Group_0__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5125:1: rule__AllConstraint__Group_0__1__Impl : ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) ;
    public final void rule__AllConstraint__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5129:1: ( ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5130:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5130:1: ( ( rule__AllConstraint__DefaultValueAssignment_0_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5131:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueAssignment_0_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5132:1: ( rule__AllConstraint__DefaultValueAssignment_0_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5132:2: rule__AllConstraint__DefaultValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl10314);
            rule__AllConstraint__DefaultValueAssignment_0_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_0__1__Impl


    // $ANTLR start rule__AllConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5146:1: rule__AllConstraint__Group_1__0 : rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 ;
    public final void rule__AllConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5150:1: ( rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5151:2: rule__AllConstraint__Group_1__0__Impl rule__AllConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__010348);
            rule__AllConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__010351);
            rule__AllConstraint__Group_1__1();
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
    // $ANTLR end rule__AllConstraint__Group_1__0


    // $ANTLR start rule__AllConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5158:1: rule__AllConstraint__Group_1__0__Impl : ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) ;
    public final void rule__AllConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5162:1: ( ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5163:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5163:1: ( ( rule__AllConstraint__IsFixedAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5164:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5165:1: ( rule__AllConstraint__IsFixedAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5165:2: rule__AllConstraint__IsFixedAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl10378);
            rule__AllConstraint__IsFixedAssignment_1_0();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_1__0__Impl


    // $ANTLR start rule__AllConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5175:1: rule__AllConstraint__Group_1__1 : rule__AllConstraint__Group_1__1__Impl ;
    public final void rule__AllConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5179:1: ( rule__AllConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5180:2: rule__AllConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__110408);
            rule__AllConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_1__1


    // $ANTLR start rule__AllConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5186:1: rule__AllConstraint__Group_1__1__Impl : ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) ;
    public final void rule__AllConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5190:1: ( ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5191:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5191:1: ( ( rule__AllConstraint__FixedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5192:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5193:1: ( rule__AllConstraint__FixedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5193:2: rule__AllConstraint__FixedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl10435);
            rule__AllConstraint__FixedValueAssignment_1_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_1__1__Impl


    // $ANTLR start rule__AllConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5207:1: rule__AllConstraint__Group_2__0 : rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 ;
    public final void rule__AllConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5211:1: ( rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5212:2: rule__AllConstraint__Group_2__0__Impl rule__AllConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__010469);
            rule__AllConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__010472);
            rule__AllConstraint__Group_2__1();
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
    // $ANTLR end rule__AllConstraint__Group_2__0


    // $ANTLR start rule__AllConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5219:1: rule__AllConstraint__Group_2__0__Impl : ( 'minLen' ) ;
    public final void rule__AllConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5223:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5225:1: 'minLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0()); 
            match(input,48,FOLLOW_48_in_rule__AllConstraint__Group_2__0__Impl10500); 
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
    // $ANTLR end rule__AllConstraint__Group_2__0__Impl


    // $ANTLR start rule__AllConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5238:1: rule__AllConstraint__Group_2__1 : rule__AllConstraint__Group_2__1__Impl ;
    public final void rule__AllConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5242:1: ( rule__AllConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5243:2: rule__AllConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__110531);
            rule__AllConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_2__1


    // $ANTLR start rule__AllConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5249:1: rule__AllConstraint__Group_2__1__Impl : ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) ;
    public final void rule__AllConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5253:1: ( ( ( rule__AllConstraint__MinLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5254:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5254:1: ( ( rule__AllConstraint__MinLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5255:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5256:1: ( rule__AllConstraint__MinLenAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5256:2: rule__AllConstraint__MinLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl10558);
            rule__AllConstraint__MinLenAssignment_2_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_2__1__Impl


    // $ANTLR start rule__AllConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5270:1: rule__AllConstraint__Group_3__0 : rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 ;
    public final void rule__AllConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5274:1: ( rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5275:2: rule__AllConstraint__Group_3__0__Impl rule__AllConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__010592);
            rule__AllConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__010595);
            rule__AllConstraint__Group_3__1();
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
    // $ANTLR end rule__AllConstraint__Group_3__0


    // $ANTLR start rule__AllConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5282:1: rule__AllConstraint__Group_3__0__Impl : ( 'maxLen' ) ;
    public final void rule__AllConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5286:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5287:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5287:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5288:1: 'maxLen'
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0()); 
            match(input,49,FOLLOW_49_in_rule__AllConstraint__Group_3__0__Impl10623); 
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
    // $ANTLR end rule__AllConstraint__Group_3__0__Impl


    // $ANTLR start rule__AllConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5301:1: rule__AllConstraint__Group_3__1 : rule__AllConstraint__Group_3__1__Impl ;
    public final void rule__AllConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5305:1: ( rule__AllConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5306:2: rule__AllConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__110654);
            rule__AllConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_3__1


    // $ANTLR start rule__AllConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5312:1: rule__AllConstraint__Group_3__1__Impl : ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) ;
    public final void rule__AllConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5316:1: ( ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5317:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5317:1: ( ( rule__AllConstraint__MaxLenAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5318:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5319:1: ( rule__AllConstraint__MaxLenAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5319:2: rule__AllConstraint__MaxLenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl10681);
            rule__AllConstraint__MaxLenAssignment_3_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_3__1__Impl


    // $ANTLR start rule__AllConstraint__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5333:1: rule__AllConstraint__Group_4__0 : rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 ;
    public final void rule__AllConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5337:1: ( rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5338:2: rule__AllConstraint__Group_4__0__Impl rule__AllConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__010715);
            rule__AllConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__010718);
            rule__AllConstraint__Group_4__1();
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
    // $ANTLR end rule__AllConstraint__Group_4__0


    // $ANTLR start rule__AllConstraint__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5345:1: rule__AllConstraint__Group_4__0__Impl : ( 'fixeLen' ) ;
    public final void rule__AllConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5349:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5350:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5350:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5351:1: 'fixeLen'
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__AllConstraint__Group_4__0__Impl10746); 
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
    // $ANTLR end rule__AllConstraint__Group_4__0__Impl


    // $ANTLR start rule__AllConstraint__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5364:1: rule__AllConstraint__Group_4__1 : rule__AllConstraint__Group_4__1__Impl ;
    public final void rule__AllConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5368:1: ( rule__AllConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5369:2: rule__AllConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__110777);
            rule__AllConstraint__Group_4__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_4__1


    // $ANTLR start rule__AllConstraint__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5375:1: rule__AllConstraint__Group_4__1__Impl : ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) ;
    public final void rule__AllConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5379:1: ( ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5380:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5380:1: ( ( rule__AllConstraint__FixeLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5381:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5382:1: ( rule__AllConstraint__FixeLenAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5382:2: rule__AllConstraint__FixeLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl10804);
            rule__AllConstraint__FixeLenAssignment_4_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_4__1__Impl


    // $ANTLR start rule__AllConstraint__Group_5__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5396:1: rule__AllConstraint__Group_5__0 : rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 ;
    public final void rule__AllConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5400:1: ( rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5401:2: rule__AllConstraint__Group_5__0__Impl rule__AllConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__010838);
            rule__AllConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__010841);
            rule__AllConstraint__Group_5__1();
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
    // $ANTLR end rule__AllConstraint__Group_5__0


    // $ANTLR start rule__AllConstraint__Group_5__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5408:1: rule__AllConstraint__Group_5__0__Impl : ( 'paddle' ) ;
    public final void rule__AllConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5412:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5413:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5413:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5414:1: 'paddle'
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0()); 
            match(input,50,FOLLOW_50_in_rule__AllConstraint__Group_5__0__Impl10869); 
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
    // $ANTLR end rule__AllConstraint__Group_5__0__Impl


    // $ANTLR start rule__AllConstraint__Group_5__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5427:1: rule__AllConstraint__Group_5__1 : rule__AllConstraint__Group_5__1__Impl ;
    public final void rule__AllConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5431:1: ( rule__AllConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5432:2: rule__AllConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__110900);
            rule__AllConstraint__Group_5__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_5__1


    // $ANTLR start rule__AllConstraint__Group_5__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5438:1: rule__AllConstraint__Group_5__1__Impl : ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) ;
    public final void rule__AllConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5442:1: ( ( ( rule__AllConstraint__PaddleAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5443:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5443:1: ( ( rule__AllConstraint__PaddleAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5444:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5445:1: ( rule__AllConstraint__PaddleAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5445:2: rule__AllConstraint__PaddleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl10927);
            rule__AllConstraint__PaddleAssignment_5_1();
            _fsp--;


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
    // $ANTLR end rule__AllConstraint__Group_5__1__Impl


    // $ANTLR start rule__AllConstraint__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5459:1: rule__AllConstraint__Group_7__0 : rule__AllConstraint__Group_7__0__Impl rule__AllConstraint__Group_7__1 ;
    public final void rule__AllConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5463:1: ( rule__AllConstraint__Group_7__0__Impl rule__AllConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5464:2: rule__AllConstraint__Group_7__0__Impl rule__AllConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_7__0__Impl_in_rule__AllConstraint__Group_7__010961);
            rule__AllConstraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AllConstraint__Group_7__1_in_rule__AllConstraint__Group_7__010964);
            rule__AllConstraint__Group_7__1();
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
    // $ANTLR end rule__AllConstraint__Group_7__0


    // $ANTLR start rule__AllConstraint__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5471:1: rule__AllConstraint__Group_7__0__Impl : ( ( rule__AllConstraint__DerivedAssignment_7_0 ) ) ;
    public final void rule__AllConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5475:1: ( ( ( rule__AllConstraint__DerivedAssignment_7_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5476:1: ( ( rule__AllConstraint__DerivedAssignment_7_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5476:1: ( ( rule__AllConstraint__DerivedAssignment_7_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5477:1: ( rule__AllConstraint__DerivedAssignment_7_0 )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedAssignment_7_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5478:1: ( rule__AllConstraint__DerivedAssignment_7_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5478:2: rule__AllConstraint__DerivedAssignment_7_0
            {
            pushFollow(FOLLOW_rule__AllConstraint__DerivedAssignment_7_0_in_rule__AllConstraint__Group_7__0__Impl10991);
            rule__AllConstraint__DerivedAssignment_7_0();
            _fsp--;


            }

             after(grammarAccess.getAllConstraintAccess().getDerivedAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__Group_7__0__Impl


    // $ANTLR start rule__AllConstraint__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5488:1: rule__AllConstraint__Group_7__1 : rule__AllConstraint__Group_7__1__Impl ;
    public final void rule__AllConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5492:1: ( rule__AllConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5493:2: rule__AllConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__AllConstraint__Group_7__1__Impl_in_rule__AllConstraint__Group_7__111021);
            rule__AllConstraint__Group_7__1__Impl();
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
    // $ANTLR end rule__AllConstraint__Group_7__1


    // $ANTLR start rule__AllConstraint__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5499:1: rule__AllConstraint__Group_7__1__Impl : ( ( rule__AllConstraint__WritableAssignment_7_1 )? ) ;
    public final void rule__AllConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5503:1: ( ( ( rule__AllConstraint__WritableAssignment_7_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5504:1: ( ( rule__AllConstraint__WritableAssignment_7_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5504:1: ( ( rule__AllConstraint__WritableAssignment_7_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5505:1: ( rule__AllConstraint__WritableAssignment_7_1 )?
            {
             before(grammarAccess.getAllConstraintAccess().getWritableAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5506:1: ( rule__AllConstraint__WritableAssignment_7_1 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==63) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5506:2: rule__AllConstraint__WritableAssignment_7_1
                    {
                    pushFollow(FOLLOW_rule__AllConstraint__WritableAssignment_7_1_in_rule__AllConstraint__Group_7__1__Impl11048);
                    rule__AllConstraint__WritableAssignment_7_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllConstraintAccess().getWritableAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__Group_7__1__Impl


    // $ANTLR start rule__DomainModel__ElementsAssignment
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5521:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5525:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5526:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5526:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5527:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11088);
            ruleAbstractElement();
            _fsp--;

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
    // $ANTLR end rule__DomainModel__ElementsAssignment


    // $ANTLR start rule__Import__ImportedNamespaceAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5536:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5540:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5541:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5541:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5542:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111119);
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


    // $ANTLR start rule__PackageDeclaration__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5551:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5555:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5556:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5556:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5557:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111150);
            ruleQualifiedName();
            _fsp--;

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
    // $ANTLR end rule__PackageDeclaration__NameAssignment_1


    // $ANTLR start rule__PackageDeclaration__PrefixAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5566:1: rule__PackageDeclaration__PrefixAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5570:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5571:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5571:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5572:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_111181);
            ruleQualifiedName();
            _fsp--;

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
    // $ANTLR end rule__PackageDeclaration__PrefixAssignment_2_1


    // $ANTLR start rule__PackageDeclaration__NamespaceAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5581:1: rule__PackageDeclaration__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5585:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5586:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5586:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5587:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_111212); 
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
    // $ANTLR end rule__PackageDeclaration__NamespaceAssignment_3_1


    // $ANTLR start rule__PackageDeclaration__FormatAssignment_5_0_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5596:1: rule__PackageDeclaration__FormatAssignment_5_0_1 : ( ( 'XSD' ) ) ;
    public final void rule__PackageDeclaration__FormatAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5600:1: ( ( ( 'XSD' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5601:1: ( ( 'XSD' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5601:1: ( ( 'XSD' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5602:1: ( 'XSD' )
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5603:1: ( 'XSD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5604:1: 'XSD'
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 
            match(input,51,FOLLOW_51_in_rule__PackageDeclaration__FormatAssignment_5_0_111248); 
             after(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 

            }

             after(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__FormatAssignment_5_0_1


    // $ANTLR start rule__PackageDeclaration__DelimiterAssignment_6_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5619:1: rule__PackageDeclaration__DelimiterAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__DelimiterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5623:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5624:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5624:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5625:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DelimiterAssignment_6_111287); 
             after(grammarAccess.getPackageDeclarationAccess().getDelimiterSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__DelimiterAssignment_6_1


    // $ANTLR start rule__PackageDeclaration__LinesAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5634:1: rule__PackageDeclaration__LinesAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__LinesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5638:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5639:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5639:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5640:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getLinesSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__LinesAssignment_7_111318); 
             after(grammarAccess.getPackageDeclarationAccess().getLinesSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__LinesAssignment_7_1


    // $ANTLR start rule__PackageDeclaration__ElementsAssignment_8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5649:1: rule__PackageDeclaration__ElementsAssignment_8 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5653:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5654:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5654:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5655:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_811349);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__ElementsAssignment_8


    // $ANTLR start rule__DataType__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5664:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5668:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5669:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5669:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5670:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111380); 
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
    // $ANTLR end rule__DataType__NameAssignment_1


    // $ANTLR start rule__Entity__EntityTypeAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5679:1: rule__Entity__EntityTypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__Entity__EntityTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5683:1: ( ( ruleEntityType ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5684:1: ( ruleEntityType )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5684:1: ( ruleEntityType )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5685:1: ruleEntityType
            {
             before(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_011411);
            ruleEntityType();
            _fsp--;

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
    // $ANTLR end rule__Entity__EntityTypeAssignment_0


    // $ANTLR start rule__Entity__NameAssignment_2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5694:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5698:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5699:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5699:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5700:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_211442); 
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
    // $ANTLR end rule__Entity__NameAssignment_2


    // $ANTLR start rule__Entity__SuperTypeAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5709:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5713:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5714:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5714:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5715:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5716:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5717:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_111477);
            ruleQualifiedName();
            _fsp--;

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
    // $ANTLR end rule__Entity__SuperTypeAssignment_3_1


    // $ANTLR start rule__Entity__DescriptionAssignment_4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5728:1: rule__Entity__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5732:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5733:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5733:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5734:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_411512); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__DescriptionAssignment_4


    // $ANTLR start rule__Entity__FeaturesAssignment_6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5743:1: rule__Entity__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5747:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5748:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5748:1: ( ruleFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5749:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_611543);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_6


    // $ANTLR start rule__Feature__ConstraintAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5758:1: rule__Feature__ConstraintAssignment_1 : ( ruleConstraint ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5762:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5763:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5763:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5764:1: ruleConstraint
            {
             before(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_111574);
            ruleConstraint();
            _fsp--;

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
    // $ANTLR end rule__Feature__ConstraintAssignment_1


    // $ANTLR start rule__Feature__DescriptionAssignment_2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5773:1: rule__Feature__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5777:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5778:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5778:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5779:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_211605); 
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
    // $ANTLR end rule__Feature__DescriptionAssignment_2


    // $ANTLR start rule__Attribute__NameAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5788:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5792:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5793:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5793:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5794:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_011636); 
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
    // $ANTLR end rule__Attribute__NameAssignment_0


    // $ANTLR start rule__Attribute__TypeAssignment_2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5803:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5807:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5808:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5808:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5809:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_211667);
            ruleTypeRef();
            _fsp--;

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
    // $ANTLR end rule__Attribute__TypeAssignment_2


    // $ANTLR start rule__Reference__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5818:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5822:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5823:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5823:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5824:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_111698); 
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
    // $ANTLR end rule__Reference__NameAssignment_1


    // $ANTLR start rule__Reference__TypeAssignment_3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5833:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5837:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5838:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5838:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5839:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_311729);
            ruleTypeRef();
            _fsp--;

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
    // $ANTLR end rule__Reference__TypeAssignment_3


    // $ANTLR start rule__Reference__OppositeAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5848:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5852:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5853:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5853:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5854:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5855:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5856:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_111764); 
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
    // $ANTLR end rule__Reference__OppositeAssignment_4_1


    // $ANTLR start rule__Enumeration__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5867:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5871:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5872:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5872:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5873:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_111799); 
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
    // $ANTLR end rule__Enumeration__NameAssignment_1


    // $ANTLR start rule__Enumeration__EnumerationLiteralsAssignment_3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5882:1: rule__Enumeration__EnumerationLiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5886:1: ( ( ruleEnumerationLiteral ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5887:1: ( ruleEnumerationLiteral )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5887:1: ( ruleEnumerationLiteral )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5888:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_311830);
            ruleEnumerationLiteral();
            _fsp--;

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
    // $ANTLR end rule__Enumeration__EnumerationLiteralsAssignment_3


    // $ANTLR start rule__EnumerationLiteral__NameAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5897:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5901:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5902:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5902:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5903:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_011861); 
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
    // $ANTLR end rule__EnumerationLiteral__NameAssignment_0


    // $ANTLR start rule__EnumerationLiteral__PersistedValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5912:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5916:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5917:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5917:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5918:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_111892); 
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
    // $ANTLR end rule__EnumerationLiteral__PersistedValueAssignment_1_1


    // $ANTLR start rule__Parameter__NameAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5932:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5936:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5937:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5937:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5938:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_011928); 
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
    // $ANTLR end rule__Parameter__NameAssignment_0


    // $ANTLR start rule__Parameter__TypeAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5947:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5951:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5952:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5952:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5953:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_111959);
            ruleTypeRef();
            _fsp--;

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
    // $ANTLR end rule__Parameter__TypeAssignment_1


    // $ANTLR start rule__TypeRef__ReferencedAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5962:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5966:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5967:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5967:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5968:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5969:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5970:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_011994);
            ruleQualifiedName();
            _fsp--;

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
    // $ANTLR end rule__TypeRef__ReferencedAssignment_0


    // $ANTLR start rule__TypeRef__MultiAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5981:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5985:1: ( ( ( '*' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5986:1: ( ( '*' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5986:1: ( ( '*' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5987:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5988:1: ( '*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5989:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeRef__MultiAssignment_112034); 
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
    // $ANTLR end rule__TypeRef__MultiAssignment_1


    // $ANTLR start rule__TypeRef__OptionAssignment_2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6004:1: rule__TypeRef__OptionAssignment_2 : ( ( '?' ) ) ;
    public final void rule__TypeRef__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6008:1: ( ( ( '?' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6009:1: ( ( '?' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6009:1: ( ( '?' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6010:1: ( '?' )
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6011:1: ( '?' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6012:1: '?'
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__TypeRef__OptionAssignment_212078); 
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
    // $ANTLR end rule__TypeRef__OptionAssignment_2


    // $ANTLR start rule__BoolConstraint__ConstraintAssignment
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6027:1: rule__BoolConstraint__ConstraintAssignment : ( ( 'boolean' ) ) ;
    public final void rule__BoolConstraint__ConstraintAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6031:1: ( ( ( 'boolean' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6032:1: ( ( 'boolean' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6032:1: ( ( 'boolean' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6033:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6034:1: ( 'boolean' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6035:1: 'boolean'
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__BoolConstraint__ConstraintAssignment12122); 
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
    // $ANTLR end rule__BoolConstraint__ConstraintAssignment


    // $ANTLR start rule__StringConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6050:1: rule__StringConstraint__ConstraintAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__StringConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6054:1: ( ( ( 'string' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6055:1: ( ( 'string' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6055:1: ( ( 'string' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6056:1: ( 'string' )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6057:1: ( 'string' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6058:1: 'string'
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__StringConstraint__ConstraintAssignment_012166); 
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
    // $ANTLR end rule__StringConstraint__ConstraintAssignment_0


    // $ANTLR start rule__StringConstraint__ConstraintRefAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6073:1: rule__StringConstraint__ConstraintRefAssignment_1 : ( ruleAllConstraint ) ;
    public final void rule__StringConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6077:1: ( ( ruleAllConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6078:1: ( ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6078:1: ( ruleAllConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6079:1: ruleAllConstraint
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_112205);
            ruleAllConstraint();
            _fsp--;

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
    // $ANTLR end rule__StringConstraint__ConstraintRefAssignment_1


    // $ANTLR start rule__StringConstraint__RegularExpressionAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6088:1: rule__StringConstraint__RegularExpressionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__RegularExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6092:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6093:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6093:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6094:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_112236); 
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
    // $ANTLR end rule__StringConstraint__RegularExpressionAssignment_2_1


    // $ANTLR start rule__DateTimeConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6103:1: rule__DateTimeConstraint__ConstraintAssignment_0 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6107:1: ( ( ( 'datetime' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6108:1: ( ( 'datetime' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6108:1: ( ( 'datetime' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6109:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6110:1: ( 'datetime' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6111:1: 'datetime'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            match(input,56,FOLLOW_56_in_rule__DateTimeConstraint__ConstraintAssignment_012272); 
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
    // $ANTLR end rule__DateTimeConstraint__ConstraintAssignment_0


    // $ANTLR start rule__DateTimeConstraint__DataTypeAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6126:1: rule__DateTimeConstraint__DataTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DateTimeConstraint__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6130:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6131:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6131:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6132:1: ( RULE_ID )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6133:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6134:1: RULE_ID
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_112315); 
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
    // $ANTLR end rule__DateTimeConstraint__DataTypeAssignment_1


    // $ANTLR start rule__DateTimeConstraint__HasDefaultAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6145:1: rule__DateTimeConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6149:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6150:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6150:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6151:1: ( 'default' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6152:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6153:1: 'default'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,57,FOLLOW_57_in_rule__DateTimeConstraint__HasDefaultAssignment_2_012355); 
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
    // $ANTLR end rule__DateTimeConstraint__HasDefaultAssignment_2_0


    // $ANTLR start rule__DateTimeConstraint__DefaultValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6168:1: rule__DateTimeConstraint__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeConstraint__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6172:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6173:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6173:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6174:1: RULE_STRING
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_112394); 
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
    // $ANTLR end rule__DateTimeConstraint__DefaultValueAssignment_2_1


    // $ANTLR start rule__IntegerConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6183:1: rule__IntegerConstraint__ConstraintAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__IntegerConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6187:1: ( ( ( 'integer' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6188:1: ( ( 'integer' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6188:1: ( ( 'integer' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6189:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6190:1: ( 'integer' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6191:1: 'integer'
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            match(input,58,FOLLOW_58_in_rule__IntegerConstraint__ConstraintAssignment_012430); 
             after(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 

            }

             after(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__ConstraintAssignment_0


    // $ANTLR start rule__IntegerConstraint__ConstraintRefAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6206:1: rule__IntegerConstraint__ConstraintRefAssignment_1 : ( ruleNumberConstraint ) ;
    public final void rule__IntegerConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6210:1: ( ( ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6211:1: ( ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6211:1: ( ruleNumberConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6212:1: ruleNumberConstraint
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_rule__IntegerConstraint__ConstraintRefAssignment_112469);
            ruleNumberConstraint();
            _fsp--;

             after(grammarAccess.getIntegerConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__ConstraintRefAssignment_1


    // $ANTLR start rule__DecimalConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6221:1: rule__DecimalConstraint__ConstraintAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6225:1: ( ( ( 'decimal' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6226:1: ( ( 'decimal' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6226:1: ( ( 'decimal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6227:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6228:1: ( 'decimal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6229:1: 'decimal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            match(input,59,FOLLOW_59_in_rule__DecimalConstraint__ConstraintAssignment_012505); 
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
    // $ANTLR end rule__DecimalConstraint__ConstraintAssignment_0


    // $ANTLR start rule__DecimalConstraint__ConstraintRefAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6244:1: rule__DecimalConstraint__ConstraintRefAssignment_1 : ( ruleNumberConstraint ) ;
    public final void rule__DecimalConstraint__ConstraintRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6248:1: ( ( ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6249:1: ( ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6249:1: ( ruleNumberConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6250:1: ruleNumberConstraint
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_112544);
            ruleNumberConstraint();
            _fsp--;

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
    // $ANTLR end rule__DecimalConstraint__ConstraintRefAssignment_1


    // $ANTLR start rule__EnumerationConstraint__UsageAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6259:1: rule__EnumerationConstraint__UsageAssignment_1 : ( ruleEnumUsage ) ;
    public final void rule__EnumerationConstraint__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6263:1: ( ( ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6264:1: ( ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6264:1: ( ruleEnumUsage )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6265:1: ruleEnumUsage
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_112575);
            ruleEnumUsage();
            _fsp--;

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
    // $ANTLR end rule__EnumerationConstraint__UsageAssignment_1


    // $ANTLR start rule__EnumerationConstraint__FixeLenAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6274:1: rule__EnumerationConstraint__FixeLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EnumerationConstraint__FixeLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6278:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6279:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6279:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6280:1: RULE_INT
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_112606); 
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
    // $ANTLR end rule__EnumerationConstraint__FixeLenAssignment_2_1


    // $ANTLR start rule__EnumerationConstraint__HasDefaultAssignment_3_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6289:1: rule__EnumerationConstraint__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationConstraint__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6293:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6294:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6294:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6295:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6296:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6297:1: 'default'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,57,FOLLOW_57_in_rule__EnumerationConstraint__HasDefaultAssignment_3_012642); 
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
    // $ANTLR end rule__EnumerationConstraint__HasDefaultAssignment_3_0


    // $ANTLR start rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6312:1: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6316:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6317:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6317:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6318:1: RULE_ID
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_112681); 
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
    // $ANTLR end rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1


    // $ANTLR start rule__NumberConstraint__MinValueAssignment_0_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6327:1: rule__NumberConstraint__MinValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6331:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6332:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6332:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6333:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_0_112712); 
             after(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__MinValueAssignment_0_1


    // $ANTLR start rule__NumberConstraint__MaxValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6342:1: rule__NumberConstraint__MaxValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6346:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6347:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6347:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6348:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_1_112743); 
             after(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__MaxValueAssignment_1_1


    // $ANTLR start rule__NumberConstraint__HasDefaultAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6357:1: rule__NumberConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__NumberConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6361:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6362:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6362:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6363:1: ( 'default' )
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6364:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6365:1: 'default'
            {
             before(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,57,FOLLOW_57_in_rule__NumberConstraint__HasDefaultAssignment_2_012779); 
             after(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__HasDefaultAssignment_2_0


    // $ANTLR start rule__NumberConstraint__DefaultValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6380:1: rule__NumberConstraint__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6384:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6385:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6385:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6386:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_2_112818); 
             after(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__DefaultValueAssignment_2_1


    // $ANTLR start rule__NumberConstraint__IsFixedAssignment_3_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6395:1: rule__NumberConstraint__IsFixedAssignment_3_0 : ( ( 'fixed' ) ) ;
    public final void rule__NumberConstraint__IsFixedAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6399:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6400:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6400:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6401:1: ( 'fixed' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_3_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6402:1: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6403:1: 'fixed'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_3_0_0()); 
            match(input,60,FOLLOW_60_in_rule__NumberConstraint__IsFixedAssignment_3_012854); 
             after(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_3_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__IsFixedAssignment_3_0


    // $ANTLR start rule__NumberConstraint__FixedValueAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6418:1: rule__NumberConstraint__FixedValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__FixedValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6422:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6423:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6423:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6424:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_3_112893); 
             after(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__FixedValueAssignment_3_1


    // $ANTLR start rule__NumberConstraint__MinLenAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6433:1: rule__NumberConstraint__MinLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MinLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6437:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6438:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6438:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6439:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_112924); 
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
    // $ANTLR end rule__NumberConstraint__MinLenAssignment_4_1


    // $ANTLR start rule__NumberConstraint__MaxLenAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6448:1: rule__NumberConstraint__MaxLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__MaxLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6452:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6453:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6453:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6454:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_112955); 
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
    // $ANTLR end rule__NumberConstraint__MaxLenAssignment_5_1


    // $ANTLR start rule__NumberConstraint__FixeLenAssignment_6_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6463:1: rule__NumberConstraint__FixeLenAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__NumberConstraint__FixeLenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6467:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6468:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6468:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6469:1: RULE_INT
            {
             before(grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_112986); 
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
    // $ANTLR end rule__NumberConstraint__FixeLenAssignment_6_1


    // $ANTLR start rule__NumberConstraint__PaddleAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6478:1: rule__NumberConstraint__PaddleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__NumberConstraint__PaddleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6482:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6483:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6483:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6484:1: RULE_STRING
            {
             before(grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_113017); 
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
    // $ANTLR end rule__NumberConstraint__PaddleAssignment_7_1


    // $ANTLR start rule__NumberConstraint__NullableAssignment_8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6493:1: rule__NumberConstraint__NullableAssignment_8 : ( ( 'nullable' ) ) ;
    public final void rule__NumberConstraint__NullableAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6497:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6498:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6498:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6499:1: ( 'nullable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_8_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6500:1: ( 'nullable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6501:1: 'nullable'
            {
             before(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_8_0()); 
            match(input,61,FOLLOW_61_in_rule__NumberConstraint__NullableAssignment_813053); 
             after(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_8_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__NullableAssignment_8


    // $ANTLR start rule__NumberConstraint__DerivedAssignment_9_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6516:1: rule__NumberConstraint__DerivedAssignment_9_0 : ( ( 'derived' ) ) ;
    public final void rule__NumberConstraint__DerivedAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6520:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6521:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6521:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6522:1: ( 'derived' )
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_9_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6523:1: ( 'derived' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6524:1: 'derived'
            {
             before(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_9_0_0()); 
            match(input,62,FOLLOW_62_in_rule__NumberConstraint__DerivedAssignment_9_013097); 
             after(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_9_0_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__DerivedAssignment_9_0


    // $ANTLR start rule__NumberConstraint__WritableAssignment_9_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6539:1: rule__NumberConstraint__WritableAssignment_9_1 : ( ( 'writable' ) ) ;
    public final void rule__NumberConstraint__WritableAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6543:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6544:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6544:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6545:1: ( 'writable' )
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_9_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6546:1: ( 'writable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6547:1: 'writable'
            {
             before(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_9_1_0()); 
            match(input,63,FOLLOW_63_in_rule__NumberConstraint__WritableAssignment_9_113141); 
             after(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_9_1_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__WritableAssignment_9_1


    // $ANTLR start rule__NumberConstraint__IsXSDAttAssignment_10
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6562:1: rule__NumberConstraint__IsXSDAttAssignment_10 : ( ( 'xsd Att.' ) ) ;
    public final void rule__NumberConstraint__IsXSDAttAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6566:1: ( ( ( 'xsd Att.' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6567:1: ( ( 'xsd Att.' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6567:1: ( ( 'xsd Att.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6568:1: ( 'xsd Att.' )
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAttKeyword_10_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6569:1: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6570:1: 'xsd Att.'
            {
             before(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAttKeyword_10_0()); 
            match(input,64,FOLLOW_64_in_rule__NumberConstraint__IsXSDAttAssignment_1013185); 
             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAttKeyword_10_0()); 

            }

             after(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAttKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NumberConstraint__IsXSDAttAssignment_10


    // $ANTLR start rule__AllConstraint__HasDefaultAssignment_0_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6585:1: rule__AllConstraint__HasDefaultAssignment_0_0 : ( ( 'default' ) ) ;
    public final void rule__AllConstraint__HasDefaultAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6589:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6590:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6590:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6591:1: ( 'default' )
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6592:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6593:1: 'default'
            {
             before(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0()); 
            match(input,57,FOLLOW_57_in_rule__AllConstraint__HasDefaultAssignment_0_013229); 
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
    // $ANTLR end rule__AllConstraint__HasDefaultAssignment_0_0


    // $ANTLR start rule__AllConstraint__DefaultValueAssignment_0_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6608:1: rule__AllConstraint__DefaultValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__DefaultValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6612:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6613:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6613:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6614:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_113268); 
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
    // $ANTLR end rule__AllConstraint__DefaultValueAssignment_0_1


    // $ANTLR start rule__AllConstraint__IsFixedAssignment_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6623:1: rule__AllConstraint__IsFixedAssignment_1_0 : ( ( 'fixed' ) ) ;
    public final void rule__AllConstraint__IsFixedAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6627:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6628:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6628:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6629:1: ( 'fixed' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6630:1: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6631:1: 'fixed'
            {
             before(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0()); 
            match(input,60,FOLLOW_60_in_rule__AllConstraint__IsFixedAssignment_1_013304); 
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
    // $ANTLR end rule__AllConstraint__IsFixedAssignment_1_0


    // $ANTLR start rule__AllConstraint__FixedValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6646:1: rule__AllConstraint__FixedValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__FixedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6650:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6651:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6651:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6652:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_113343); 
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
    // $ANTLR end rule__AllConstraint__FixedValueAssignment_1_1


    // $ANTLR start rule__AllConstraint__MinLenAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6661:1: rule__AllConstraint__MinLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MinLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6665:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6666:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6666:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6667:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_113374); 
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
    // $ANTLR end rule__AllConstraint__MinLenAssignment_2_1


    // $ANTLR start rule__AllConstraint__MaxLenAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6676:1: rule__AllConstraint__MaxLenAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__MaxLenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6680:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6681:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6681:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6682:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_113405); 
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
    // $ANTLR end rule__AllConstraint__MaxLenAssignment_3_1


    // $ANTLR start rule__AllConstraint__FixeLenAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6691:1: rule__AllConstraint__FixeLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__AllConstraint__FixeLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6695:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6696:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6696:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6697:1: RULE_INT
            {
             before(grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_113436); 
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
    // $ANTLR end rule__AllConstraint__FixeLenAssignment_4_1


    // $ANTLR start rule__AllConstraint__PaddleAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6706:1: rule__AllConstraint__PaddleAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__AllConstraint__PaddleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6710:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6711:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6711:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6712:1: RULE_STRING
            {
             before(grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_113467); 
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
    // $ANTLR end rule__AllConstraint__PaddleAssignment_5_1


    // $ANTLR start rule__AllConstraint__NullableAssignment_6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6721:1: rule__AllConstraint__NullableAssignment_6 : ( ( 'nullable' ) ) ;
    public final void rule__AllConstraint__NullableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6725:1: ( ( ( 'nullable' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6726:1: ( ( 'nullable' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6726:1: ( ( 'nullable' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6727:1: ( 'nullable' )
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_6_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6728:1: ( 'nullable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6729:1: 'nullable'
            {
             before(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_6_0()); 
            match(input,61,FOLLOW_61_in_rule__AllConstraint__NullableAssignment_613503); 
             after(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_6_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__NullableAssignment_6


    // $ANTLR start rule__AllConstraint__DerivedAssignment_7_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6744:1: rule__AllConstraint__DerivedAssignment_7_0 : ( ( 'derived' ) ) ;
    public final void rule__AllConstraint__DerivedAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6748:1: ( ( ( 'derived' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6749:1: ( ( 'derived' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6749:1: ( ( 'derived' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6750:1: ( 'derived' )
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_7_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6751:1: ( 'derived' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6752:1: 'derived'
            {
             before(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_7_0_0()); 
            match(input,62,FOLLOW_62_in_rule__AllConstraint__DerivedAssignment_7_013547); 
             after(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_7_0_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__DerivedAssignment_7_0


    // $ANTLR start rule__AllConstraint__WritableAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6767:1: rule__AllConstraint__WritableAssignment_7_1 : ( ( 'writable' ) ) ;
    public final void rule__AllConstraint__WritableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6771:1: ( ( ( 'writable' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6772:1: ( ( 'writable' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6772:1: ( ( 'writable' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6773:1: ( 'writable' )
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_7_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6774:1: ( 'writable' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6775:1: 'writable'
            {
             before(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_7_1_0()); 
            match(input,63,FOLLOW_63_in_rule__AllConstraint__WritableAssignment_7_113591); 
             after(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_7_1_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__WritableAssignment_7_1


    // $ANTLR start rule__AllConstraint__IsXSDAttAssignment_8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6790:1: rule__AllConstraint__IsXSDAttAssignment_8 : ( ( 'xsd Att.' ) ) ;
    public final void rule__AllConstraint__IsXSDAttAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6794:1: ( ( ( 'xsd Att.' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6795:1: ( ( 'xsd Att.' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6795:1: ( ( 'xsd Att.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6796:1: ( 'xsd Att.' )
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6797:1: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6798:1: 'xsd Att.'
            {
             before(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            match(input,64,FOLLOW_64_in_rule__AllConstraint__IsXSDAttAssignment_813635); 
             after(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }

             after(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AllConstraint__IsXSDAttAssignment_8


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x00000010C0600802L});
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
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__ConstraintAssignment_in_ruleBoolConstraint1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0_in_ruleNumberConstraint1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0_in_ruleAllConstraint1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Visibility__Alternatives_in_ruleVisibility1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntityType1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__0_in_rule__PackageDeclaration__Alternatives_51812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PackageDeclaration__Alternatives_51831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Alternatives_51851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PackageDeclaration__Alternatives_51871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PackageDeclaration__Alternatives_51891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Visibility__Alternatives2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Visibility__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Visibility__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumUsage__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EnumUsage__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Import__Group__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__0__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12476 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22536 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32596 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42656 = new BitSet(new long[]{0x00000010F960F800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDeclaration__Group__4__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52718 = new BitSet(new long[]{0x00000010F1600800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Alternatives_5_in_rule__PackageDeclaration__Group__5__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62779 = new BitSet(new long[]{0x00000010E1600800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__0_in_rule__PackageDeclaration__Group__6__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72840 = new BitSet(new long[]{0x00000010C1600800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__8_in_rule__PackageDeclaration__Group__72843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__0_in_rule__PackageDeclaration__Group__7__Impl2870 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__8__Impl_in_rule__PackageDeclaration__Group__82901 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__9_in_rule__PackageDeclaration__Group__82904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_8_in_rule__PackageDeclaration__Group__8__Impl2931 = new BitSet(new long[]{0x00000010C0600802L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__9__Impl_in_rule__PackageDeclaration__Group__92962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PackageDeclaration__Group__9__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__03041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__03044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PackageDeclaration__Group_2__0__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__03164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PackageDeclaration__Group_3__0__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__0__Impl_in_rule__PackageDeclaration__Group_5_0__03287 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__1_in_rule__PackageDeclaration__Group_5_0__03290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PackageDeclaration__Group_5_0__0__Impl3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__1__Impl_in_rule__PackageDeclaration__Group_5_0__13349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__FormatAssignment_5_0_1_in_rule__PackageDeclaration__Group_5_0__1__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__0__Impl_in_rule__PackageDeclaration__Group_6__03410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__1_in_rule__PackageDeclaration__Group_6__03413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PackageDeclaration__Group_6__0__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__1__Impl_in_rule__PackageDeclaration__Group_6__13472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__DelimiterAssignment_6_1_in_rule__PackageDeclaration__Group_6__1__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__0__Impl_in_rule__PackageDeclaration__Group_7__03533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__1_in_rule__PackageDeclaration__Group_7__03536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PackageDeclaration__Group_7__0__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__1__Impl_in_rule__PackageDeclaration__Group_7__13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__LinesAssignment_7_1_in_rule__PackageDeclaration__Group_7__1__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataType__Group__0__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03779 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__EntityTypeAssignment_0_in_rule__Entity__Group__0__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__Group__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23902 = new BitSet(new long[]{0x0000000100800020L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33962 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__44023 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__44026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_4_in_rule__Entity__Group__4__Impl4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__54084 = new BitSet(new long[]{0x0000000401000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__54087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__5__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__64146 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__64149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_6_in_rule__Entity__Group__6__Impl4176 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__74207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group__7__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__04282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Entity__Group_3__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_3_1_in_rule__Entity__Group_3__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04405 = new BitSet(new long[]{0x0DC0100000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14464 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04589 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__Group__1__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Reference__Group__0__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14836 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Reference__Group__2__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34958 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__45018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__05086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__05089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Reference__Group_4__0__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__15148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__05209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__05212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Enumeration__Group__0__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15271 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Enumeration__Group__2__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35393 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5425 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5437 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Enumeration__Group__4__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05539 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15599 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumerationLiteral__Group__2__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumerationLiteral__Group_1__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05971 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__16031 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__16034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__26092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__06156 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__06159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__16215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__QualifiedNameWithWildCard__Group__1__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06281 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6367 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__06524 = new BitSet(new long[]{0x7207280000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__06527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__16584 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__16587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintRefAssignment_1_in_rule__StringConstraint__Group__1__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__26644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__06708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__06711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StringConstraint__Group_2__0__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__16770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__RegularExpressionAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl6797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__06831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__06834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__16891 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__16894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__26951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__07015 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__07018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__17075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__07136 = new BitSet(new long[]{0x7207E00000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__07139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__ConstraintRefAssignment_1_in_rule__IntegerConstraint__Group__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__07257 = new BitSet(new long[]{0x7207E00000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__07260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintRefAssignment_1_in_rule__DecimalConstraint__Group__1__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__07378 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumerationConstraint__Group__0__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__17440 = new BitSet(new long[]{0x0200200000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__27500 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__27503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__37561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__07627 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__07630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumerationConstraint__Group_2__0__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__07750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__07753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__17810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__0__Impl_in_rule__NumberConstraint__Group__07871 = new BitSet(new long[]{0x7207A00000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1_in_rule__NumberConstraint__Group__07874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0_in_rule__NumberConstraint__Group__0__Impl7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__1__Impl_in_rule__NumberConstraint__Group__17932 = new BitSet(new long[]{0x7207200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2_in_rule__NumberConstraint__Group__17935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0_in_rule__NumberConstraint__Group__1__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__2__Impl_in_rule__NumberConstraint__Group__27993 = new BitSet(new long[]{0x7007200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3_in_rule__NumberConstraint__Group__27996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0_in_rule__NumberConstraint__Group__2__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__3__Impl_in_rule__NumberConstraint__Group__38054 = new BitSet(new long[]{0x6007200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4_in_rule__NumberConstraint__Group__38057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0_in_rule__NumberConstraint__Group__3__Impl8084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__4__Impl_in_rule__NumberConstraint__Group__48115 = new BitSet(new long[]{0x6006200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5_in_rule__NumberConstraint__Group__48118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0_in_rule__NumberConstraint__Group__4__Impl8145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__5__Impl_in_rule__NumberConstraint__Group__58176 = new BitSet(new long[]{0x6004200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6_in_rule__NumberConstraint__Group__58179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0_in_rule__NumberConstraint__Group__5__Impl8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__6__Impl_in_rule__NumberConstraint__Group__68237 = new BitSet(new long[]{0x6004000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7_in_rule__NumberConstraint__Group__68240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0_in_rule__NumberConstraint__Group__6__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__7__Impl_in_rule__NumberConstraint__Group__78298 = new BitSet(new long[]{0x6000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8_in_rule__NumberConstraint__Group__78301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0_in_rule__NumberConstraint__Group__7__Impl8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__8__Impl_in_rule__NumberConstraint__Group__88359 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9_in_rule__NumberConstraint__Group__88362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__NullableAssignment_8_in_rule__NumberConstraint__Group__8__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__9__Impl_in_rule__NumberConstraint__Group__98420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10_in_rule__NumberConstraint__Group__98423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_9__0_in_rule__NumberConstraint__Group__9__Impl8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group__10__Impl_in_rule__NumberConstraint__Group__108481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsXSDAttAssignment_10_in_rule__NumberConstraint__Group__10__Impl8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__0__Impl_in_rule__NumberConstraint__Group_0__08561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1_in_rule__NumberConstraint__Group_0__08564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NumberConstraint__Group_0__0__Impl8592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_0__1__Impl_in_rule__NumberConstraint__Group_0__18623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinValueAssignment_0_1_in_rule__NumberConstraint__Group_0__1__Impl8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__0__Impl_in_rule__NumberConstraint__Group_1__08684 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1_in_rule__NumberConstraint__Group_1__08687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NumberConstraint__Group_1__0__Impl8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_1__1__Impl_in_rule__NumberConstraint__Group_1__18746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxValueAssignment_1_1_in_rule__NumberConstraint__Group_1__1__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__0__Impl_in_rule__NumberConstraint__Group_2__08807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1_in_rule__NumberConstraint__Group_2__08810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__HasDefaultAssignment_2_0_in_rule__NumberConstraint__Group_2__0__Impl8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_2__1__Impl_in_rule__NumberConstraint__Group_2__18867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DefaultValueAssignment_2_1_in_rule__NumberConstraint__Group_2__1__Impl8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__0__Impl_in_rule__NumberConstraint__Group_3__08928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1_in_rule__NumberConstraint__Group_3__08931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__IsFixedAssignment_3_0_in_rule__NumberConstraint__Group_3__0__Impl8958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_3__1__Impl_in_rule__NumberConstraint__Group_3__18988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixedValueAssignment_3_1_in_rule__NumberConstraint__Group_3__1__Impl9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__0__Impl_in_rule__NumberConstraint__Group_4__09049 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1_in_rule__NumberConstraint__Group_4__09052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__NumberConstraint__Group_4__0__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_4__1__Impl_in_rule__NumberConstraint__Group_4__19111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MinLenAssignment_4_1_in_rule__NumberConstraint__Group_4__1__Impl9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__0__Impl_in_rule__NumberConstraint__Group_5__09172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1_in_rule__NumberConstraint__Group_5__09175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NumberConstraint__Group_5__0__Impl9203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_5__1__Impl_in_rule__NumberConstraint__Group_5__19234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__MaxLenAssignment_5_1_in_rule__NumberConstraint__Group_5__1__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__0__Impl_in_rule__NumberConstraint__Group_6__09295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1_in_rule__NumberConstraint__Group_6__09298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NumberConstraint__Group_6__0__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_6__1__Impl_in_rule__NumberConstraint__Group_6__19357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__FixeLenAssignment_6_1_in_rule__NumberConstraint__Group_6__1__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__0__Impl_in_rule__NumberConstraint__Group_7__09418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1_in_rule__NumberConstraint__Group_7__09421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__NumberConstraint__Group_7__0__Impl9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_7__1__Impl_in_rule__NumberConstraint__Group_7__19480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__PaddleAssignment_7_1_in_rule__NumberConstraint__Group_7__1__Impl9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_9__0__Impl_in_rule__NumberConstraint__Group_9__09541 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_9__1_in_rule__NumberConstraint__Group_9__09544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__DerivedAssignment_9_0_in_rule__NumberConstraint__Group_9__0__Impl9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__Group_9__1__Impl_in_rule__NumberConstraint__Group_9__19601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberConstraint__WritableAssignment_9_1_in_rule__NumberConstraint__Group_9__1__Impl9628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__0__Impl_in_rule__AllConstraint__Group__09663 = new BitSet(new long[]{0x7007200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1_in_rule__AllConstraint__Group__09666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0_in_rule__AllConstraint__Group__0__Impl9693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__1__Impl_in_rule__AllConstraint__Group__19724 = new BitSet(new long[]{0x6007200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2_in_rule__AllConstraint__Group__19727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0_in_rule__AllConstraint__Group__1__Impl9754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__2__Impl_in_rule__AllConstraint__Group__29785 = new BitSet(new long[]{0x6006200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3_in_rule__AllConstraint__Group__29788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0_in_rule__AllConstraint__Group__2__Impl9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__3__Impl_in_rule__AllConstraint__Group__39846 = new BitSet(new long[]{0x6004200000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4_in_rule__AllConstraint__Group__39849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0_in_rule__AllConstraint__Group__3__Impl9876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__4__Impl_in_rule__AllConstraint__Group__49907 = new BitSet(new long[]{0x6004000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5_in_rule__AllConstraint__Group__49910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0_in_rule__AllConstraint__Group__4__Impl9937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__5__Impl_in_rule__AllConstraint__Group__59968 = new BitSet(new long[]{0x6000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6_in_rule__AllConstraint__Group__59971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0_in_rule__AllConstraint__Group__5__Impl9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__6__Impl_in_rule__AllConstraint__Group__610029 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7_in_rule__AllConstraint__Group__610032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__NullableAssignment_6_in_rule__AllConstraint__Group__6__Impl10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__7__Impl_in_rule__AllConstraint__Group__710090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8_in_rule__AllConstraint__Group__710093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_7__0_in_rule__AllConstraint__Group__7__Impl10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group__8__Impl_in_rule__AllConstraint__Group__810151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsXSDAttAssignment_8_in_rule__AllConstraint__Group__8__Impl10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__0__Impl_in_rule__AllConstraint__Group_0__010227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1_in_rule__AllConstraint__Group_0__010230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__HasDefaultAssignment_0_0_in_rule__AllConstraint__Group_0__0__Impl10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_0__1__Impl_in_rule__AllConstraint__Group_0__110287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DefaultValueAssignment_0_1_in_rule__AllConstraint__Group_0__1__Impl10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__0__Impl_in_rule__AllConstraint__Group_1__010348 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1_in_rule__AllConstraint__Group_1__010351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__IsFixedAssignment_1_0_in_rule__AllConstraint__Group_1__0__Impl10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_1__1__Impl_in_rule__AllConstraint__Group_1__110408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixedValueAssignment_1_1_in_rule__AllConstraint__Group_1__1__Impl10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__0__Impl_in_rule__AllConstraint__Group_2__010469 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1_in_rule__AllConstraint__Group_2__010472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__AllConstraint__Group_2__0__Impl10500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_2__1__Impl_in_rule__AllConstraint__Group_2__110531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MinLenAssignment_2_1_in_rule__AllConstraint__Group_2__1__Impl10558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__0__Impl_in_rule__AllConstraint__Group_3__010592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1_in_rule__AllConstraint__Group_3__010595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AllConstraint__Group_3__0__Impl10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_3__1__Impl_in_rule__AllConstraint__Group_3__110654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__MaxLenAssignment_3_1_in_rule__AllConstraint__Group_3__1__Impl10681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__0__Impl_in_rule__AllConstraint__Group_4__010715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1_in_rule__AllConstraint__Group_4__010718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__AllConstraint__Group_4__0__Impl10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_4__1__Impl_in_rule__AllConstraint__Group_4__110777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__FixeLenAssignment_4_1_in_rule__AllConstraint__Group_4__1__Impl10804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__0__Impl_in_rule__AllConstraint__Group_5__010838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1_in_rule__AllConstraint__Group_5__010841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__AllConstraint__Group_5__0__Impl10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_5__1__Impl_in_rule__AllConstraint__Group_5__110900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__PaddleAssignment_5_1_in_rule__AllConstraint__Group_5__1__Impl10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_7__0__Impl_in_rule__AllConstraint__Group_7__010961 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_7__1_in_rule__AllConstraint__Group_7__010964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__DerivedAssignment_7_0_in_rule__AllConstraint__Group_7__0__Impl10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__Group_7__1__Impl_in_rule__AllConstraint__Group_7__111021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AllConstraint__WritableAssignment_7_1_in_rule__AllConstraint__Group_7__1__Impl11048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_111181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_111212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PackageDeclaration__FormatAssignment_5_0_111248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DelimiterAssignment_6_111287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__LinesAssignment_7_111318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_811349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Entity__EntityTypeAssignment_011411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_211442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_3_111477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_411512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_611543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_111574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_211605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_011636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_211667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_111698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_311729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_111764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_111799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_311830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_011861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_111892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_011928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_111959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_011994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeRef__MultiAssignment_112034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__TypeRef__OptionAssignment_212078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__BoolConstraint__ConstraintAssignment12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__StringConstraint__ConstraintAssignment_012166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_rule__StringConstraint__ConstraintRefAssignment_112205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_2_112236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__DateTimeConstraint__ConstraintAssignment_012272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_112315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DateTimeConstraint__HasDefaultAssignment_2_012355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_112394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__IntegerConstraint__ConstraintAssignment_012430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_rule__IntegerConstraint__ConstraintRefAssignment_112469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DecimalConstraint__ConstraintAssignment_012505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_rule__DecimalConstraint__ConstraintRefAssignment_112544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_112575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_112606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__EnumerationConstraint__HasDefaultAssignment_3_012642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_112681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinValueAssignment_0_112712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxValueAssignment_1_112743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__NumberConstraint__HasDefaultAssignment_2_012779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__DefaultValueAssignment_2_112818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__NumberConstraint__IsFixedAssignment_3_012854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__FixedValueAssignment_3_112893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MinLenAssignment_4_112924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__MaxLenAssignment_5_112955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NumberConstraint__FixeLenAssignment_6_112986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberConstraint__PaddleAssignment_7_113017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__NumberConstraint__NullableAssignment_813053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__NumberConstraint__DerivedAssignment_9_013097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__NumberConstraint__WritableAssignment_9_113141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__NumberConstraint__IsXSDAttAssignment_1013185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__AllConstraint__HasDefaultAssignment_0_013229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__DefaultValueAssignment_0_113268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__AllConstraint__IsFixedAssignment_1_013304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__FixedValueAssignment_1_113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MinLenAssignment_2_113374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__MaxLenAssignment_3_113405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AllConstraint__FixeLenAssignment_4_113436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AllConstraint__PaddleAssignment_5_113467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__AllConstraint__NullableAssignment_613503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__AllConstraint__DerivedAssignment_7_013547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__AllConstraint__WritableAssignment_7_113591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__AllConstraint__IsXSDAttAssignment_813635 = new BitSet(new long[]{0x0000000000000002L});

}