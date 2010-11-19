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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'as String'", "'as bool String'", "'as Value'", "'as bool Value'", "'import'", "'package'", "'{'", "'}'", "'prefix'", "'namespace'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'.*'", "'.'", "'minLen'", "'maxLen'", "'fixeLen'", "'regexp'", "'minVal'", "'maxVal'", "'paddle'", "'enumeration'", "'['", "']'", "';'", "'='", "'enum'", "'*'", "'?'", "'boolean'", "'default'", "'true'", "'string'", "'datetime'", "'integer'", "'decimal'"
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

                if ( ((LA1_0>=16 && LA1_0<=17)||(LA1_0>=22 && LA1_0<=23)||LA1_0==37) ) {
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


    // $ANTLR start entryRuleParameter
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:369:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:370:1: ( ruleParameter EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:371:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter722);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter729); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:378:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:382:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:383:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:383:1: ( ( rule__Parameter__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:384:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:385:1: ( rule__Parameter__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:385:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter755);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:399:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:400:1: ( ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:401:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef784);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef791); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:408:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:412:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:413:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:413:1: ( ( rule__TypeRef__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:414:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:415:1: ( rule__TypeRef__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:415:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef817);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:427:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:428:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:429:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard844);
            ruleQualifiedNameWithWildCard();
            _fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard851); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:436:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:440:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:442:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:443:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:443:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard877);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:455:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:456:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:457:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName904);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName911); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:464:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:468:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:469:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:469:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:470:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName937);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:483:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:484:1: ( ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:485:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint964);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint971); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:492:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:496:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:497:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:497:1: ( ( rule__Constraint__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:498:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:1: ( rule__Constraint__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:2: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint997);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:511:1: entryRuleBoolConstraint : ruleBoolConstraint EOF ;
    public final void entryRuleBoolConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:512:1: ( ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:513:1: ruleBoolConstraint EOF
            {
             before(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1024);
            ruleBoolConstraint();
            _fsp--;

             after(grammarAccess.getBoolConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint1031); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:520:1: ruleBoolConstraint : ( ( rule__BoolConstraint__Group__0 ) ) ;
    public final void ruleBoolConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:524:2: ( ( ( rule__BoolConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:525:1: ( ( rule__BoolConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:525:1: ( ( rule__BoolConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:526:1: ( rule__BoolConstraint__Group__0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:1: ( rule__BoolConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:2: rule__BoolConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__0_in_ruleBoolConstraint1057);
            rule__BoolConstraint__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBoolConstraintAccess().getGroup()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:539:1: entryRuleStringConstraint : ruleStringConstraint EOF ;
    public final void entryRuleStringConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:540:1: ( ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:541:1: ruleStringConstraint EOF
            {
             before(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1084);
            ruleStringConstraint();
            _fsp--;

             after(grammarAccess.getStringConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint1091); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:548:1: ruleStringConstraint : ( ( rule__StringConstraint__Group__0 ) ) ;
    public final void ruleStringConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:552:2: ( ( ( rule__StringConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:553:1: ( ( rule__StringConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:553:1: ( ( rule__StringConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:554:1: ( rule__StringConstraint__Group__0 )
            {
             before(grammarAccess.getStringConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:1: ( rule__StringConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:2: rule__StringConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1117);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:567:1: entryRuleDateTimeConstraint : ruleDateTimeConstraint EOF ;
    public final void entryRuleDateTimeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:568:1: ( ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:569:1: ruleDateTimeConstraint EOF
            {
             before(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1144);
            ruleDateTimeConstraint();
            _fsp--;

             after(grammarAccess.getDateTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint1151); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:576:1: ruleDateTimeConstraint : ( ( rule__DateTimeConstraint__Group__0 ) ) ;
    public final void ruleDateTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:580:2: ( ( ( rule__DateTimeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:581:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:581:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:582:1: ( rule__DateTimeConstraint__Group__0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:1: ( rule__DateTimeConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:2: rule__DateTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1177);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:595:1: entryRuleIntegerConstraint : ruleIntegerConstraint EOF ;
    public final void entryRuleIntegerConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:596:1: ( ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:597:1: ruleIntegerConstraint EOF
            {
             before(grammarAccess.getIntegerConstraintRule()); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1204);
            ruleIntegerConstraint();
            _fsp--;

             after(grammarAccess.getIntegerConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint1211); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:604:1: ruleIntegerConstraint : ( ( rule__IntegerConstraint__Group__0 ) ) ;
    public final void ruleIntegerConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:608:2: ( ( ( rule__IntegerConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:609:1: ( ( rule__IntegerConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:609:1: ( ( rule__IntegerConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:610:1: ( rule__IntegerConstraint__Group__0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:1: ( rule__IntegerConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:2: rule__IntegerConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1237);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:623:1: entryRuleDecimalConstraint : ruleDecimalConstraint EOF ;
    public final void entryRuleDecimalConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:624:1: ( ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:625:1: ruleDecimalConstraint EOF
            {
             before(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1264);
            ruleDecimalConstraint();
            _fsp--;

             after(grammarAccess.getDecimalConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint1271); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:632:1: ruleDecimalConstraint : ( ( rule__DecimalConstraint__Group__0 ) ) ;
    public final void ruleDecimalConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:636:2: ( ( ( rule__DecimalConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:637:1: ( ( rule__DecimalConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:637:1: ( ( rule__DecimalConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:638:1: ( rule__DecimalConstraint__Group__0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:1: ( rule__DecimalConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:2: rule__DecimalConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1297);
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


    // $ANTLR start entryRuleEnumeration
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:651:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:652:1: ( ruleEnumeration EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:653:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1324);
            ruleEnumeration();
            _fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1331); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:660:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:664:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:665:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:665:1: ( ( rule__Enumeration__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:666:1: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:1: ( rule__Enumeration__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration1357);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:679:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:680:1: ( ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:681:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1384);
            ruleEnumerationLiteral();
            _fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1391); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:688:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:692:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:693:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:693:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:694:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:1: ( rule__EnumerationLiteral__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral1417);
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


    // $ANTLR start entryRuleEnumerationConstraint
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:707:1: entryRuleEnumerationConstraint : ruleEnumerationConstraint EOF ;
    public final void entryRuleEnumerationConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:708:1: ( ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:709:1: ruleEnumerationConstraint EOF
            {
             before(grammarAccess.getEnumerationConstraintRule()); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1444);
            ruleEnumerationConstraint();
            _fsp--;

             after(grammarAccess.getEnumerationConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint1451); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:716:1: ruleEnumerationConstraint : ( ( rule__EnumerationConstraint__Group__0 ) ) ;
    public final void ruleEnumerationConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:720:2: ( ( ( rule__EnumerationConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:721:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:721:1: ( ( rule__EnumerationConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:722:1: ( rule__EnumerationConstraint__Group__0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:723:1: ( rule__EnumerationConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:723:2: rule__EnumerationConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1477);
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


    // $ANTLR start ruleEnumUsage
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:740:1: ruleEnumUsage : ( ( rule__EnumUsage__Alternatives ) ) ;
    public final void ruleEnumUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:744:1: ( ( ( rule__EnumUsage__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:745:1: ( ( rule__EnumUsage__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:745:1: ( ( rule__EnumUsage__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:746:1: ( rule__EnumUsage__Alternatives )
            {
             before(grammarAccess.getEnumUsageAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:747:1: ( rule__EnumUsage__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:747:2: rule__EnumUsage__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1518);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:758:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:762:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 22:
            case 23:
            case 37:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("758:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:763:1: ( rulePackageDeclaration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:763:1: ( rulePackageDeclaration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:764:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1553);
                    rulePackageDeclaration();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:769:6: ( ruleType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:769:6: ( ruleType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:770:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1570);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:775:6: ( ruleImport )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:775:6: ( ruleImport )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:776:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1587);
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


    // $ANTLR start rule__Type__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:786:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:790:1: ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("786:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:791:1: ( ruleEntity )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:791:1: ( ruleEntity )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:792:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1619);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:797:6: ( ruleDataType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:797:6: ( ruleDataType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:798:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1636);
                    ruleDataType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:803:6: ( ruleEnumeration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:803:6: ( ruleEnumeration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:804:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1653);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:814:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:818:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("814:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:819:1: ( ruleAttribute )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:819:1: ( ruleAttribute )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:820:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1685);
                    ruleAttribute();
                    _fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:825:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:825:6: ( ruleReference )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:826:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1702);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:837:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:841:1: ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            case 49:
                {
                alt5=3;
                }
                break;
            case 50:
                {
                alt5=4;
                }
                break;
            case 51:
                {
                alt5=5;
                }
                break;
            case 42:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("837:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:842:1: ( ruleBoolConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:842:1: ( ruleBoolConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:843:1: ruleBoolConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1735);
                    ruleBoolConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:848:6: ( ruleStringConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:848:6: ( ruleStringConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:849:1: ruleStringConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1752);
                    ruleStringConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:854:6: ( ruleDateTimeConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:854:6: ( ruleDateTimeConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:855:1: ruleDateTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1769);
                    ruleDateTimeConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:860:6: ( ruleIntegerConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:860:6: ( ruleIntegerConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:861:1: ruleIntegerConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives1786);
                    ruleIntegerConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:866:6: ( ruleDecimalConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:866:6: ( ruleDecimalConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:867:1: ruleDecimalConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1803);
                    ruleDecimalConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:872:6: ( ruleEnumerationConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:872:6: ( ruleEnumerationConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:873:1: ruleEnumerationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1820);
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


    // $ANTLR start rule__BoolConstraint__Alternatives_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:883:1: rule__BoolConstraint__Alternatives_1_1 : ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolConstraint__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:887:1: ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("883:1: rule__BoolConstraint__Alternatives_1_1 : ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:888:1: ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:888:1: ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:889:1: ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getBoolConstraintAccess().getDefaultValueAssignment_1_1_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:890:1: ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:890:2: rule__BoolConstraint__DefaultValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__BoolConstraint__DefaultValueAssignment_1_1_0_in_rule__BoolConstraint__Alternatives_1_11852);
                    rule__BoolConstraint__DefaultValueAssignment_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBoolConstraintAccess().getDefaultValueAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:894:6: ( 'false' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:894:6: ( 'false' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:895:1: 'false'
                    {
                     before(grammarAccess.getBoolConstraintAccess().getFalseKeyword_1_1_1()); 
                    match(input,11,FOLLOW_11_in_rule__BoolConstraint__Alternatives_1_11871); 
                     after(grammarAccess.getBoolConstraintAccess().getFalseKeyword_1_1_1()); 

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
    // $ANTLR end rule__BoolConstraint__Alternatives_1_1


    // $ANTLR start rule__EnumUsage__Alternatives
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:909:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) );
    public final void rule__EnumUsage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:913:1: ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) )
            int alt7=4;
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
            case 15:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("909:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:914:1: ( ( 'as String' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:914:1: ( ( 'as String' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:915:1: ( 'as String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:916:1: ( 'as String' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:916:3: 'as String'
                    {
                    match(input,12,FOLLOW_12_in_rule__EnumUsage__Alternatives1908); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:921:6: ( ( 'as bool String' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:921:6: ( ( 'as bool String' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:922:1: ( 'as bool String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:923:1: ( 'as bool String' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:923:3: 'as bool String'
                    {
                    match(input,13,FOLLOW_13_in_rule__EnumUsage__Alternatives1929); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:928:6: ( ( 'as Value' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:928:6: ( ( 'as Value' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:929:1: ( 'as Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:930:1: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:930:3: 'as Value'
                    {
                    match(input,14,FOLLOW_14_in_rule__EnumUsage__Alternatives1950); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:935:6: ( ( 'as bool Value' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:935:6: ( ( 'as bool Value' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:936:1: ( 'as bool Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsBoolValueEnumLiteralDeclaration_3()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:937:1: ( 'as bool Value' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:937:3: 'as bool Value'
                    {
                    match(input,15,FOLLOW_15_in_rule__EnumUsage__Alternatives1971); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsBoolValueEnumLiteralDeclaration_3()); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:949:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:953:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:954:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02004);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02007);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:961:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:965:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:966:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:966:1: ( 'import' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:967:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Import__Group__0__Impl2035); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:980:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:984:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:985:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12066);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:991:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:995:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:996:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:996:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:997:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:998:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:998:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2093);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1012:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1016:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1017:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02127);
            rule__PackageDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02130);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1024:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1028:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1029:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1029:1: ( 'package' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1030:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PackageDeclaration__Group__0__Impl2158); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1043:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1047:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1048:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12189);
            rule__PackageDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12192);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1055:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1059:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1060:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1060:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1061:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1062:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1062:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2219);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1072:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1076:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1077:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22249);
            rule__PackageDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22252);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1084:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__Group_2__0 ) ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1088:1: ( ( ( rule__PackageDeclaration__Group_2__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1089:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1089:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1090:1: ( rule__PackageDeclaration__Group_2__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1091:1: ( rule__PackageDeclaration__Group_2__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1091:2: rule__PackageDeclaration__Group_2__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2279);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1101:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1105:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1106:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32309);
            rule__PackageDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32312);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1113:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 ) ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1117:1: ( ( ( rule__PackageDeclaration__Group_3__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1118:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1118:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1119:1: ( rule__PackageDeclaration__Group_3__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1120:1: ( rule__PackageDeclaration__Group_3__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1120:2: rule__PackageDeclaration__Group_3__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2339);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1130:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1134:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1135:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42369);
            rule__PackageDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42372);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1142:1: rule__PackageDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1146:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1147:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1147:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1148:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2400); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1161:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1165:1: ( rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1166:2: rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52431);
            rule__PackageDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52434);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1173:1: rule__PackageDeclaration__Group__5__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_5 )* ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1177:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_5 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1178:1: ( ( rule__PackageDeclaration__ElementsAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1178:1: ( ( rule__PackageDeclaration__ElementsAssignment_5 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1179:1: ( rule__PackageDeclaration__ElementsAssignment_5 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1180:1: ( rule__PackageDeclaration__ElementsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)||(LA8_0>=22 && LA8_0<=23)||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1180:2: rule__PackageDeclaration__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_5_in_rule__PackageDeclaration__Group__5__Impl2461);
            	    rule__PackageDeclaration__ElementsAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_5()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1190:1: rule__PackageDeclaration__Group__6 : rule__PackageDeclaration__Group__6__Impl ;
    public final void rule__PackageDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1194:1: ( rule__PackageDeclaration__Group__6__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1195:2: rule__PackageDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62492);
            rule__PackageDeclaration__Group__6__Impl();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1201:1: rule__PackageDeclaration__Group__6__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1205:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1206:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1206:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1207:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__PackageDeclaration__Group__6__Impl2520); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start rule__PackageDeclaration__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1234:1: rule__PackageDeclaration__Group_2__0 : rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 ;
    public final void rule__PackageDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1238:1: ( rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1239:2: rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__02565);
            rule__PackageDeclaration__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__02568);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1246:1: rule__PackageDeclaration__Group_2__0__Impl : ( 'prefix' ) ;
    public final void rule__PackageDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1250:1: ( ( 'prefix' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1251:1: ( 'prefix' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1251:1: ( 'prefix' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1252:1: 'prefix'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__PackageDeclaration__Group_2__0__Impl2596); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1265:1: rule__PackageDeclaration__Group_2__1 : rule__PackageDeclaration__Group_2__1__Impl ;
    public final void rule__PackageDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1269:1: ( rule__PackageDeclaration__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1270:2: rule__PackageDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12627);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1276:1: rule__PackageDeclaration__Group_2__1__Impl : ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) ;
    public final void rule__PackageDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1280:1: ( ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1281:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1281:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1282:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1283:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1283:2: rule__PackageDeclaration__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl2654);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1297:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
    public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1301:1: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1302:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02688);
            rule__PackageDeclaration__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02691);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1309:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1313:1: ( ( 'namespace' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1314:1: ( 'namespace' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1314:1: ( 'namespace' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1315:1: 'namespace'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group_3__0__Impl2719); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1328:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1332:1: ( rule__PackageDeclaration__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1333:2: rule__PackageDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12750);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1339:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) ;
    public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1343:1: ( ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1344:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1344:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1345:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1346:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1346:2: rule__PackageDeclaration__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2777);
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


    // $ANTLR start rule__DataType__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1360:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1364:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1365:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02811);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02814);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1372:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1376:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1377:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1377:1: ( 'datatype' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1378:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DataType__Group__0__Impl2842); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1391:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1395:1: ( rule__DataType__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1396:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12873);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1402:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1406:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1407:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1407:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1408:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1409:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1409:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2900);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1423:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1427:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1428:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02934);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02937);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1435:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1439:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1440:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1440:1: ( 'entity' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1441:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__0__Impl2965); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1454:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1458:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1459:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12996);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12999);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1466:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1470:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1471:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1471:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1472:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1473:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1473:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3026);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1483:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1487:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1488:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23056);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23059);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1495:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1499:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1500:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1500:1: ( ( rule__Entity__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1501:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1502:1: ( rule__Entity__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1502:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3086);
                    rule__Entity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1512:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1516:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1517:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33117);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33120);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1524:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__DescriptionAssignment_3 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1528:1: ( ( ( rule__Entity__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1529:1: ( ( rule__Entity__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1529:1: ( ( rule__Entity__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1530:1: ( rule__Entity__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1531:1: ( rule__Entity__DescriptionAssignment_3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1531:2: rule__Entity__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_3_in_rule__Entity__Group__3__Impl3147);
                    rule__Entity__DescriptionAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_3()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1541:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1545:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1546:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43178);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43181);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1553:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1557:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1558:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1558:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1559:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__4__Impl3209); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1572:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1576:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1577:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53240);
            rule__Entity__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53243);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1584:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__FeaturesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1588:1: ( ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1589:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1589:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1590:1: ( rule__Entity__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1591:1: ( rule__Entity__FeaturesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1591:2: rule__Entity__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_in_rule__Entity__Group__5__Impl3270);
            	    rule__Entity__FeaturesAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1601:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1605:1: ( rule__Entity__Group__6__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1606:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63301);
            rule__Entity__Group__6__Impl();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1612:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1616:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1617:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1617:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1618:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__6__Impl3329); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start rule__Entity__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1645:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1649:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1650:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__03374);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__03377);
            rule__Entity__Group_2__1();
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
    // $ANTLR end rule__Entity__Group_2__0


    // $ANTLR start rule__Entity__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1657:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1661:1: ( ( 'extends' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1662:1: ( 'extends' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1662:1: ( 'extends' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1663:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Entity__Group_2__0__Impl3405); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__0__Impl


    // $ANTLR start rule__Entity__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1676:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1680:1: ( rule__Entity__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1681:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__13436);
            rule__Entity__Group_2__1__Impl();
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
    // $ANTLR end rule__Entity__Group_2__1


    // $ANTLR start rule__Entity__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1687:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1691:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1692:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1692:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1693:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1694:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1694:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl3463);
            rule__Entity__SuperTypeAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group_2__1__Impl


    // $ANTLR start rule__Feature__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1708:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1712:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1713:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03497);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03500);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1720:1: rule__Feature__Group__0__Impl : ( ruleStructuralFeature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1724:1: ( ( ruleStructuralFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1725:1: ( ruleStructuralFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1725:1: ( ruleStructuralFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1726:1: ruleStructuralFeature
            {
             before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl3527);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1737:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1741:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1742:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13556);
            rule__Feature__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13559);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1749:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1753:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1754:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1754:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1755:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1756:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42||LA12_0==45||(LA12_0>=48 && LA12_0<=51)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1756:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl3586);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1766:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1770:1: ( rule__Feature__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1771:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23617);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1777:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__DescriptionAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1781:1: ( ( ( rule__Feature__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1782:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1782:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1783:1: ( rule__Feature__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1784:1: ( rule__Feature__DescriptionAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1784:2: rule__Feature__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl3644);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1800:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1804:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1805:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03681);
            rule__Attribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03684);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1812:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1816:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1817:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1817:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1818:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1819:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1819:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl3711);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1829:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1833:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1834:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13741);
            rule__Attribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13744);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1841:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1845:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1846:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1846:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1847:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Attribute__Group__1__Impl3772); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1860:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1864:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1865:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23803);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1871:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1875:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1876:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1876:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1877:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1878:1: ( rule__Attribute__TypeAssignment_2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1878:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl3830);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1894:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1898:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1899:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03866);
            rule__Reference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03869);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1906:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1910:1: ( ( 'ref' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1911:1: ( 'ref' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1911:1: ( 'ref' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1912:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Reference__Group__0__Impl3897); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1925:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1929:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1930:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13928);
            rule__Reference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13931);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1937:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1941:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1942:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1942:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1943:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1944:1: ( rule__Reference__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1944:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl3958);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1954:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1958:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1959:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23988);
            rule__Reference__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23991);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1966:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1970:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1971:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1971:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1972:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Reference__Group__2__Impl4019); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1985:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1989:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1990:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34050);
            rule__Reference__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34053);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1997:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2001:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2002:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2002:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2003:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2004:1: ( rule__Reference__TypeAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2004:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4080);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2014:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2018:1: ( rule__Reference__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2019:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44110);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2025:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2029:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2030:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2030:1: ( ( rule__Reference__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2031:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2032:1: ( rule__Reference__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2032:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl4137);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2052:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2056:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2057:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__04178);
            rule__Reference__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__04181);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2064:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2068:1: ( ( 'opposite' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2069:1: ( 'opposite' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2069:1: ( 'opposite' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2070:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Reference__Group_4__0__Impl4209); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2083:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2087:1: ( rule__Reference__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2088:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__14240);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2094:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2098:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2099:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2099:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2100:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2101:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2101:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl4267);
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


    // $ANTLR start rule__Parameter__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2115:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2119:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2120:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04301);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04304);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2127:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2131:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2132:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2132:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2133:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2134:1: ( rule__Parameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2134:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4331);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2144:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2148:1: ( rule__Parameter__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2149:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14361);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2155:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2159:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2160:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2160:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2161:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2162:1: ( rule__Parameter__TypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2162:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl4388);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2176:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2180:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2181:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04422);
            rule__TypeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04425);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2188:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2192:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2193:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2193:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2194:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2195:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2195:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4452);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2205:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2209:1: ( rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2210:2: rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14482);
            rule__TypeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__14485);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2217:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2221:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2222:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2222:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2223:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2224:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2224:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4512);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2234:1: rule__TypeRef__Group__2 : rule__TypeRef__Group__2__Impl ;
    public final void rule__TypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2238:1: ( rule__TypeRef__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2239:2: rule__TypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__24543);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2245:1: rule__TypeRef__Group__2__Impl : ( ( rule__TypeRef__OptionAssignment_2 )? ) ;
    public final void rule__TypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2249:1: ( ( ( rule__TypeRef__OptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2250:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2250:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2251:1: ( rule__TypeRef__OptionAssignment_2 )?
            {
             before(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2252:1: ( rule__TypeRef__OptionAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2252:2: rule__TypeRef__OptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl4570);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2268:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2272:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2273:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04607);
            rule__QualifiedNameWithWildCard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04610);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2280:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2284:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2285:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2285:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2286:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4637);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2297:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2301:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2302:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14666);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2308:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2312:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2313:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2313:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2314:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2315:1: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2316:2: '.*'
                    {
                    match(input,28,FOLLOW_28_in_rule__QualifiedNameWithWildCard__Group__1__Impl4695); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2331:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2335:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2336:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04732);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04735);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2343:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2347:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2348:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2348:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2349:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4762); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2360:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2364:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2365:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14791);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2371:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2375:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2376:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2376:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2377:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2378:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2378:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4818);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2392:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2396:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2397:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04853);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04856);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2404:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2408:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2409:1: ( '.' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2409:1: ( '.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2410:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4884); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2423:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2427:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2428:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14915);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2434:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2438:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2439:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2439:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2440:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4942); 
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


    // $ANTLR start rule__BoolConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2455:1: rule__BoolConstraint__Group__0 : rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1 ;
    public final void rule__BoolConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2459:1: ( rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2460:2: rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__0__Impl_in_rule__BoolConstraint__Group__04975);
            rule__BoolConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolConstraint__Group__1_in_rule__BoolConstraint__Group__04978);
            rule__BoolConstraint__Group__1();
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
    // $ANTLR end rule__BoolConstraint__Group__0


    // $ANTLR start rule__BoolConstraint__Group__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2467:1: rule__BoolConstraint__Group__0__Impl : ( ( rule__BoolConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__BoolConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2471:1: ( ( ( rule__BoolConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2472:1: ( ( rule__BoolConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2472:1: ( ( rule__BoolConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2473:1: ( rule__BoolConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2474:1: ( rule__BoolConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2474:2: rule__BoolConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__ConstraintAssignment_0_in_rule__BoolConstraint__Group__0__Impl5005);
            rule__BoolConstraint__ConstraintAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBoolConstraintAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__Group__0__Impl


    // $ANTLR start rule__BoolConstraint__Group__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2484:1: rule__BoolConstraint__Group__1 : rule__BoolConstraint__Group__1__Impl ;
    public final void rule__BoolConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2488:1: ( rule__BoolConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2489:2: rule__BoolConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__1__Impl_in_rule__BoolConstraint__Group__15035);
            rule__BoolConstraint__Group__1__Impl();
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
    // $ANTLR end rule__BoolConstraint__Group__1


    // $ANTLR start rule__BoolConstraint__Group__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2495:1: rule__BoolConstraint__Group__1__Impl : ( ( rule__BoolConstraint__Group_1__0 )? ) ;
    public final void rule__BoolConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2499:1: ( ( ( rule__BoolConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2500:1: ( ( rule__BoolConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2500:1: ( ( rule__BoolConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2501:1: ( rule__BoolConstraint__Group_1__0 )?
            {
             before(grammarAccess.getBoolConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2502:1: ( rule__BoolConstraint__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2502:2: rule__BoolConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolConstraint__Group_1__0_in_rule__BoolConstraint__Group__1__Impl5062);
                    rule__BoolConstraint__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolConstraintAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__Group__1__Impl


    // $ANTLR start rule__BoolConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2516:1: rule__BoolConstraint__Group_1__0 : rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1 ;
    public final void rule__BoolConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2520:1: ( rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2521:2: rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__0__Impl_in_rule__BoolConstraint__Group_1__05097);
            rule__BoolConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__1_in_rule__BoolConstraint__Group_1__05100);
            rule__BoolConstraint__Group_1__1();
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
    // $ANTLR end rule__BoolConstraint__Group_1__0


    // $ANTLR start rule__BoolConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2528:1: rule__BoolConstraint__Group_1__0__Impl : ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__BoolConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2532:1: ( ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2533:1: ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2533:1: ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2534:1: ( rule__BoolConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2535:1: ( rule__BoolConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2535:2: rule__BoolConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__HasDefaultAssignment_1_0_in_rule__BoolConstraint__Group_1__0__Impl5127);
            rule__BoolConstraint__HasDefaultAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getBoolConstraintAccess().getHasDefaultAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__Group_1__0__Impl


    // $ANTLR start rule__BoolConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2545:1: rule__BoolConstraint__Group_1__1 : rule__BoolConstraint__Group_1__1__Impl ;
    public final void rule__BoolConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2549:1: ( rule__BoolConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2550:2: rule__BoolConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__1__Impl_in_rule__BoolConstraint__Group_1__15157);
            rule__BoolConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__BoolConstraint__Group_1__1


    // $ANTLR start rule__BoolConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2556:1: rule__BoolConstraint__Group_1__1__Impl : ( ( rule__BoolConstraint__Alternatives_1_1 ) ) ;
    public final void rule__BoolConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2560:1: ( ( ( rule__BoolConstraint__Alternatives_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2561:1: ( ( rule__BoolConstraint__Alternatives_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2561:1: ( ( rule__BoolConstraint__Alternatives_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2562:1: ( rule__BoolConstraint__Alternatives_1_1 )
            {
             before(grammarAccess.getBoolConstraintAccess().getAlternatives_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2563:1: ( rule__BoolConstraint__Alternatives_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2563:2: rule__BoolConstraint__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Alternatives_1_1_in_rule__BoolConstraint__Group_1__1__Impl5184);
            rule__BoolConstraint__Alternatives_1_1();
            _fsp--;


            }

             after(grammarAccess.getBoolConstraintAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__Group_1__1__Impl


    // $ANTLR start rule__StringConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2577:1: rule__StringConstraint__Group__0 : rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 ;
    public final void rule__StringConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2581:1: ( rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2582:2: rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__05218);
            rule__StringConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__05221);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2589:1: rule__StringConstraint__Group__0__Impl : ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__StringConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2593:1: ( ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2594:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2594:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2595:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2596:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2596:2: rule__StringConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl5248);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2606:1: rule__StringConstraint__Group__1 : rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 ;
    public final void rule__StringConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2610:1: ( rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2611:2: rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__15278);
            rule__StringConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__15281);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2618:1: rule__StringConstraint__Group__1__Impl : ( ( rule__StringConstraint__Group_1__0 )? ) ;
    public final void rule__StringConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2622:1: ( ( ( rule__StringConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2623:1: ( ( rule__StringConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2623:1: ( ( rule__StringConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2624:1: ( rule__StringConstraint__Group_1__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2625:1: ( rule__StringConstraint__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2625:2: rule__StringConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_1__0_in_rule__StringConstraint__Group__1__Impl5308);
                    rule__StringConstraint__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2635:1: rule__StringConstraint__Group__2 : rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3 ;
    public final void rule__StringConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2639:1: ( rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2640:2: rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__25339);
            rule__StringConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__3_in_rule__StringConstraint__Group__25342);
            rule__StringConstraint__Group__3();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2647:1: rule__StringConstraint__Group__2__Impl : ( ( rule__StringConstraint__Group_2__0 )? ) ;
    public final void rule__StringConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2651:1: ( ( ( rule__StringConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2652:1: ( ( rule__StringConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2652:1: ( ( rule__StringConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2653:1: ( rule__StringConstraint__Group_2__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2654:1: ( rule__StringConstraint__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2654:2: rule__StringConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl5369);
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


    // $ANTLR start rule__StringConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2664:1: rule__StringConstraint__Group__3 : rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4 ;
    public final void rule__StringConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2668:1: ( rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2669:2: rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__3__Impl_in_rule__StringConstraint__Group__35400);
            rule__StringConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__4_in_rule__StringConstraint__Group__35403);
            rule__StringConstraint__Group__4();
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
    // $ANTLR end rule__StringConstraint__Group__3


    // $ANTLR start rule__StringConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2676:1: rule__StringConstraint__Group__3__Impl : ( ( rule__StringConstraint__Group_3__0 )? ) ;
    public final void rule__StringConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2680:1: ( ( ( rule__StringConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2681:1: ( ( rule__StringConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2681:1: ( ( rule__StringConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2682:1: ( rule__StringConstraint__Group_3__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2683:1: ( rule__StringConstraint__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2683:2: rule__StringConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_3__0_in_rule__StringConstraint__Group__3__Impl5430);
                    rule__StringConstraint__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__3__Impl


    // $ANTLR start rule__StringConstraint__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2693:1: rule__StringConstraint__Group__4 : rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5 ;
    public final void rule__StringConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2697:1: ( rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2698:2: rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__4__Impl_in_rule__StringConstraint__Group__45461);
            rule__StringConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__5_in_rule__StringConstraint__Group__45464);
            rule__StringConstraint__Group__5();
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
    // $ANTLR end rule__StringConstraint__Group__4


    // $ANTLR start rule__StringConstraint__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2705:1: rule__StringConstraint__Group__4__Impl : ( ( rule__StringConstraint__Group_4__0 )? ) ;
    public final void rule__StringConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2709:1: ( ( ( rule__StringConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2710:1: ( ( rule__StringConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2710:1: ( ( rule__StringConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2711:1: ( rule__StringConstraint__Group_4__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2712:1: ( rule__StringConstraint__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2712:2: rule__StringConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_4__0_in_rule__StringConstraint__Group__4__Impl5491);
                    rule__StringConstraint__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__4__Impl


    // $ANTLR start rule__StringConstraint__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2722:1: rule__StringConstraint__Group__5 : rule__StringConstraint__Group__5__Impl ;
    public final void rule__StringConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2726:1: ( rule__StringConstraint__Group__5__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2727:2: rule__StringConstraint__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__5__Impl_in_rule__StringConstraint__Group__55522);
            rule__StringConstraint__Group__5__Impl();
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
    // $ANTLR end rule__StringConstraint__Group__5


    // $ANTLR start rule__StringConstraint__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2733:1: rule__StringConstraint__Group__5__Impl : ( ( rule__StringConstraint__Group_5__0 )? ) ;
    public final void rule__StringConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2737:1: ( ( ( rule__StringConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2738:1: ( ( rule__StringConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2738:1: ( ( rule__StringConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2739:1: ( rule__StringConstraint__Group_5__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2740:1: ( rule__StringConstraint__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2740:2: rule__StringConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_5__0_in_rule__StringConstraint__Group__5__Impl5549);
                    rule__StringConstraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__5__Impl


    // $ANTLR start rule__StringConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2762:1: rule__StringConstraint__Group_1__0 : rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1 ;
    public final void rule__StringConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2766:1: ( rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2767:2: rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_1__0__Impl_in_rule__StringConstraint__Group_1__05592);
            rule__StringConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_1__1_in_rule__StringConstraint__Group_1__05595);
            rule__StringConstraint__Group_1__1();
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
    // $ANTLR end rule__StringConstraint__Group_1__0


    // $ANTLR start rule__StringConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2774:1: rule__StringConstraint__Group_1__0__Impl : ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__StringConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2778:1: ( ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2779:1: ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2779:1: ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2780:1: ( rule__StringConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2781:1: ( rule__StringConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2781:2: rule__StringConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__HasDefaultAssignment_1_0_in_rule__StringConstraint__Group_1__0__Impl5622);
            rule__StringConstraint__HasDefaultAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getHasDefaultAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_1__0__Impl


    // $ANTLR start rule__StringConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2791:1: rule__StringConstraint__Group_1__1 : rule__StringConstraint__Group_1__1__Impl ;
    public final void rule__StringConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2795:1: ( rule__StringConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2796:2: rule__StringConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_1__1__Impl_in_rule__StringConstraint__Group_1__15652);
            rule__StringConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__StringConstraint__Group_1__1


    // $ANTLR start rule__StringConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2802:1: rule__StringConstraint__Group_1__1__Impl : ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__StringConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2806:1: ( ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2807:1: ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2807:1: ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2808:1: ( rule__StringConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2809:1: ( rule__StringConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2809:2: rule__StringConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__DefaultValueAssignment_1_1_in_rule__StringConstraint__Group_1__1__Impl5679);
            rule__StringConstraint__DefaultValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getDefaultValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_1__1__Impl


    // $ANTLR start rule__StringConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2823:1: rule__StringConstraint__Group_2__0 : rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 ;
    public final void rule__StringConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2827:1: ( rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2828:2: rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__05713);
            rule__StringConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__05716);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2835:1: rule__StringConstraint__Group_2__0__Impl : ( 'minLen' ) ;
    public final void rule__StringConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2839:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2840:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2840:1: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2841:1: 'minLen'
            {
             before(grammarAccess.getStringConstraintAccess().getMinLenKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__StringConstraint__Group_2__0__Impl5744); 
             after(grammarAccess.getStringConstraintAccess().getMinLenKeyword_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2854:1: rule__StringConstraint__Group_2__1 : rule__StringConstraint__Group_2__1__Impl ;
    public final void rule__StringConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2858:1: ( rule__StringConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2859:2: rule__StringConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__15775);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2865:1: rule__StringConstraint__Group_2__1__Impl : ( ( rule__StringConstraint__MinLengthAssignment_2_1 ) ) ;
    public final void rule__StringConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2869:1: ( ( ( rule__StringConstraint__MinLengthAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:1: ( ( rule__StringConstraint__MinLengthAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:1: ( ( rule__StringConstraint__MinLengthAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2871:1: ( rule__StringConstraint__MinLengthAssignment_2_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getMinLengthAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2872:1: ( rule__StringConstraint__MinLengthAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2872:2: rule__StringConstraint__MinLengthAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__MinLengthAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl5802);
            rule__StringConstraint__MinLengthAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getMinLengthAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__StringConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2886:1: rule__StringConstraint__Group_3__0 : rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1 ;
    public final void rule__StringConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2890:1: ( rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2891:2: rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_3__0__Impl_in_rule__StringConstraint__Group_3__05836);
            rule__StringConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_3__1_in_rule__StringConstraint__Group_3__05839);
            rule__StringConstraint__Group_3__1();
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
    // $ANTLR end rule__StringConstraint__Group_3__0


    // $ANTLR start rule__StringConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2898:1: rule__StringConstraint__Group_3__0__Impl : ( 'maxLen' ) ;
    public final void rule__StringConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2902:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2903:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2903:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2904:1: 'maxLen'
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__StringConstraint__Group_3__0__Impl5867); 
             after(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_3__0__Impl


    // $ANTLR start rule__StringConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2917:1: rule__StringConstraint__Group_3__1 : rule__StringConstraint__Group_3__1__Impl ;
    public final void rule__StringConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2921:1: ( rule__StringConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2922:2: rule__StringConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_3__1__Impl_in_rule__StringConstraint__Group_3__15898);
            rule__StringConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__StringConstraint__Group_3__1


    // $ANTLR start rule__StringConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2928:1: rule__StringConstraint__Group_3__1__Impl : ( ( rule__StringConstraint__MaxLengthAssignment_3_1 ) ) ;
    public final void rule__StringConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2932:1: ( ( ( rule__StringConstraint__MaxLengthAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2933:1: ( ( rule__StringConstraint__MaxLengthAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2933:1: ( ( rule__StringConstraint__MaxLengthAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2934:1: ( rule__StringConstraint__MaxLengthAssignment_3_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLengthAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2935:1: ( rule__StringConstraint__MaxLengthAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2935:2: rule__StringConstraint__MaxLengthAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__MaxLengthAssignment_3_1_in_rule__StringConstraint__Group_3__1__Impl5925);
            rule__StringConstraint__MaxLengthAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getMaxLengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_3__1__Impl


    // $ANTLR start rule__StringConstraint__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2949:1: rule__StringConstraint__Group_4__0 : rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1 ;
    public final void rule__StringConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2953:1: ( rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2954:2: rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_4__0__Impl_in_rule__StringConstraint__Group_4__05959);
            rule__StringConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_4__1_in_rule__StringConstraint__Group_4__05962);
            rule__StringConstraint__Group_4__1();
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
    // $ANTLR end rule__StringConstraint__Group_4__0


    // $ANTLR start rule__StringConstraint__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2961:1: rule__StringConstraint__Group_4__0__Impl : ( 'fixeLen' ) ;
    public final void rule__StringConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2965:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2966:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2966:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2967:1: 'fixeLen'
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__StringConstraint__Group_4__0__Impl5990); 
             after(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_4__0__Impl


    // $ANTLR start rule__StringConstraint__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2980:1: rule__StringConstraint__Group_4__1 : rule__StringConstraint__Group_4__1__Impl ;
    public final void rule__StringConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2984:1: ( rule__StringConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2985:2: rule__StringConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_4__1__Impl_in_rule__StringConstraint__Group_4__16021);
            rule__StringConstraint__Group_4__1__Impl();
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
    // $ANTLR end rule__StringConstraint__Group_4__1


    // $ANTLR start rule__StringConstraint__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2991:1: rule__StringConstraint__Group_4__1__Impl : ( ( rule__StringConstraint__FixeLengthAssignment_4_1 ) ) ;
    public final void rule__StringConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2995:1: ( ( ( rule__StringConstraint__FixeLengthAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:1: ( ( rule__StringConstraint__FixeLengthAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:1: ( ( rule__StringConstraint__FixeLengthAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2997:1: ( rule__StringConstraint__FixeLengthAssignment_4_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLengthAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2998:1: ( rule__StringConstraint__FixeLengthAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2998:2: rule__StringConstraint__FixeLengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__FixeLengthAssignment_4_1_in_rule__StringConstraint__Group_4__1__Impl6048);
            rule__StringConstraint__FixeLengthAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getFixeLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_4__1__Impl


    // $ANTLR start rule__StringConstraint__Group_5__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3012:1: rule__StringConstraint__Group_5__0 : rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1 ;
    public final void rule__StringConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3016:1: ( rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3017:2: rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_5__0__Impl_in_rule__StringConstraint__Group_5__06082);
            rule__StringConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_5__1_in_rule__StringConstraint__Group_5__06085);
            rule__StringConstraint__Group_5__1();
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
    // $ANTLR end rule__StringConstraint__Group_5__0


    // $ANTLR start rule__StringConstraint__Group_5__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3024:1: rule__StringConstraint__Group_5__0__Impl : ( 'regexp' ) ;
    public final void rule__StringConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3028:1: ( ( 'regexp' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3029:1: ( 'regexp' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3029:1: ( 'regexp' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3030:1: 'regexp'
            {
             before(grammarAccess.getStringConstraintAccess().getRegexpKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__StringConstraint__Group_5__0__Impl6113); 
             after(grammarAccess.getStringConstraintAccess().getRegexpKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_5__0__Impl


    // $ANTLR start rule__StringConstraint__Group_5__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3043:1: rule__StringConstraint__Group_5__1 : rule__StringConstraint__Group_5__1__Impl ;
    public final void rule__StringConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3047:1: ( rule__StringConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3048:2: rule__StringConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_5__1__Impl_in_rule__StringConstraint__Group_5__16144);
            rule__StringConstraint__Group_5__1__Impl();
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
    // $ANTLR end rule__StringConstraint__Group_5__1


    // $ANTLR start rule__StringConstraint__Group_5__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3054:1: rule__StringConstraint__Group_5__1__Impl : ( ( rule__StringConstraint__RegularExpressionAssignment_5_1 ) ) ;
    public final void rule__StringConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3058:1: ( ( ( rule__StringConstraint__RegularExpressionAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3059:1: ( ( rule__StringConstraint__RegularExpressionAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3059:1: ( ( rule__StringConstraint__RegularExpressionAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3060:1: ( rule__StringConstraint__RegularExpressionAssignment_5_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3061:1: ( rule__StringConstraint__RegularExpressionAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3061:2: rule__StringConstraint__RegularExpressionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__RegularExpressionAssignment_5_1_in_rule__StringConstraint__Group_5__1__Impl6171);
            rule__StringConstraint__RegularExpressionAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_5__1__Impl


    // $ANTLR start rule__DateTimeConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3075:1: rule__DateTimeConstraint__Group__0 : rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 ;
    public final void rule__DateTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3079:1: ( rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3080:2: rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__06205);
            rule__DateTimeConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__06208);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3087:1: rule__DateTimeConstraint__Group__0__Impl : ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DateTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3091:1: ( ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3092:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3092:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3093:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3094:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3094:2: rule__DateTimeConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl6235);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3104:1: rule__DateTimeConstraint__Group__1 : rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 ;
    public final void rule__DateTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3108:1: ( rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3109:2: rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__16265);
            rule__DateTimeConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__16268);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3116:1: rule__DateTimeConstraint__Group__1__Impl : ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) ;
    public final void rule__DateTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3120:1: ( ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3121:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3121:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3122:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3123:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3123:2: rule__DateTimeConstraint__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl6295);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3133:1: rule__DateTimeConstraint__Group__2 : rule__DateTimeConstraint__Group__2__Impl ;
    public final void rule__DateTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3137:1: ( rule__DateTimeConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3138:2: rule__DateTimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__26325);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3144:1: rule__DateTimeConstraint__Group__2__Impl : ( ( rule__DateTimeConstraint__Group_2__0 )? ) ;
    public final void rule__DateTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3148:1: ( ( ( rule__DateTimeConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3149:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3149:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3150:1: ( rule__DateTimeConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3151:1: ( rule__DateTimeConstraint__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3151:2: rule__DateTimeConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl6352);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3167:1: rule__DateTimeConstraint__Group_2__0 : rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 ;
    public final void rule__DateTimeConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3171:1: ( rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3172:2: rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__06389);
            rule__DateTimeConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__06392);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3179:1: rule__DateTimeConstraint__Group_2__0__Impl : ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3183:1: ( ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3184:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3184:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3185:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3186:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3186:2: rule__DateTimeConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl6419);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3196:1: rule__DateTimeConstraint__Group_2__1 : rule__DateTimeConstraint__Group_2__1__Impl ;
    public final void rule__DateTimeConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3200:1: ( rule__DateTimeConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3201:2: rule__DateTimeConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__16449);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3207:1: rule__DateTimeConstraint__Group_2__1__Impl : ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3211:1: ( ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3212:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3212:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3213:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3214:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3214:2: rule__DateTimeConstraint__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl6476);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3228:1: rule__IntegerConstraint__Group__0 : rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 ;
    public final void rule__IntegerConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3232:1: ( rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3233:2: rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__06510);
            rule__IntegerConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__06513);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3240:1: rule__IntegerConstraint__Group__0__Impl : ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__IntegerConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3244:1: ( ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3245:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3245:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3246:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3247:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3247:2: rule__IntegerConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl6540);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3257:1: rule__IntegerConstraint__Group__1 : rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2 ;
    public final void rule__IntegerConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3261:1: ( rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3262:2: rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__16570);
            rule__IntegerConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__2_in_rule__IntegerConstraint__Group__16573);
            rule__IntegerConstraint__Group__2();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3269:1: rule__IntegerConstraint__Group__1__Impl : ( ( rule__IntegerConstraint__Group_1__0 )? ) ;
    public final void rule__IntegerConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3273:1: ( ( ( rule__IntegerConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3274:1: ( ( rule__IntegerConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3274:1: ( ( rule__IntegerConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3275:1: ( rule__IntegerConstraint__Group_1__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3276:1: ( rule__IntegerConstraint__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3276:2: rule__IntegerConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__0_in_rule__IntegerConstraint__Group__1__Impl6600);
                    rule__IntegerConstraint__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start rule__IntegerConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3286:1: rule__IntegerConstraint__Group__2 : rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3 ;
    public final void rule__IntegerConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3290:1: ( rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3291:2: rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__2__Impl_in_rule__IntegerConstraint__Group__26631);
            rule__IntegerConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__3_in_rule__IntegerConstraint__Group__26634);
            rule__IntegerConstraint__Group__3();
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
    // $ANTLR end rule__IntegerConstraint__Group__2


    // $ANTLR start rule__IntegerConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3298:1: rule__IntegerConstraint__Group__2__Impl : ( ( rule__IntegerConstraint__Group_2__0 )? ) ;
    public final void rule__IntegerConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3302:1: ( ( ( rule__IntegerConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3303:1: ( ( rule__IntegerConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3303:1: ( ( rule__IntegerConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3304:1: ( rule__IntegerConstraint__Group_2__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3305:1: ( rule__IntegerConstraint__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3305:2: rule__IntegerConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__0_in_rule__IntegerConstraint__Group__2__Impl6661);
                    rule__IntegerConstraint__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__2__Impl


    // $ANTLR start rule__IntegerConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3315:1: rule__IntegerConstraint__Group__3 : rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4 ;
    public final void rule__IntegerConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3319:1: ( rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3320:2: rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__3__Impl_in_rule__IntegerConstraint__Group__36692);
            rule__IntegerConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__4_in_rule__IntegerConstraint__Group__36695);
            rule__IntegerConstraint__Group__4();
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
    // $ANTLR end rule__IntegerConstraint__Group__3


    // $ANTLR start rule__IntegerConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3327:1: rule__IntegerConstraint__Group__3__Impl : ( ( rule__IntegerConstraint__Group_3__0 )? ) ;
    public final void rule__IntegerConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3331:1: ( ( ( rule__IntegerConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3332:1: ( ( rule__IntegerConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3332:1: ( ( rule__IntegerConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3333:1: ( rule__IntegerConstraint__Group_3__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3334:1: ( rule__IntegerConstraint__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3334:2: rule__IntegerConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__0_in_rule__IntegerConstraint__Group__3__Impl6722);
                    rule__IntegerConstraint__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__3__Impl


    // $ANTLR start rule__IntegerConstraint__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3344:1: rule__IntegerConstraint__Group__4 : rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5 ;
    public final void rule__IntegerConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3348:1: ( rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3349:2: rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__4__Impl_in_rule__IntegerConstraint__Group__46753);
            rule__IntegerConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__5_in_rule__IntegerConstraint__Group__46756);
            rule__IntegerConstraint__Group__5();
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
    // $ANTLR end rule__IntegerConstraint__Group__4


    // $ANTLR start rule__IntegerConstraint__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3356:1: rule__IntegerConstraint__Group__4__Impl : ( ( rule__IntegerConstraint__Group_4__0 )? ) ;
    public final void rule__IntegerConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3360:1: ( ( ( rule__IntegerConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3361:1: ( ( rule__IntegerConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3361:1: ( ( rule__IntegerConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3362:1: ( rule__IntegerConstraint__Group_4__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3363:1: ( rule__IntegerConstraint__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3363:2: rule__IntegerConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__0_in_rule__IntegerConstraint__Group__4__Impl6783);
                    rule__IntegerConstraint__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__4__Impl


    // $ANTLR start rule__IntegerConstraint__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3373:1: rule__IntegerConstraint__Group__5 : rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6 ;
    public final void rule__IntegerConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3377:1: ( rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3378:2: rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__5__Impl_in_rule__IntegerConstraint__Group__56814);
            rule__IntegerConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__6_in_rule__IntegerConstraint__Group__56817);
            rule__IntegerConstraint__Group__6();
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
    // $ANTLR end rule__IntegerConstraint__Group__5


    // $ANTLR start rule__IntegerConstraint__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3385:1: rule__IntegerConstraint__Group__5__Impl : ( ( rule__IntegerConstraint__Group_5__0 )? ) ;
    public final void rule__IntegerConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3389:1: ( ( ( rule__IntegerConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3390:1: ( ( rule__IntegerConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3390:1: ( ( rule__IntegerConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3391:1: ( rule__IntegerConstraint__Group_5__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3392:1: ( rule__IntegerConstraint__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3392:2: rule__IntegerConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__0_in_rule__IntegerConstraint__Group__5__Impl6844);
                    rule__IntegerConstraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__5__Impl


    // $ANTLR start rule__IntegerConstraint__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3402:1: rule__IntegerConstraint__Group__6 : rule__IntegerConstraint__Group__6__Impl ;
    public final void rule__IntegerConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3406:1: ( rule__IntegerConstraint__Group__6__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3407:2: rule__IntegerConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__6__Impl_in_rule__IntegerConstraint__Group__66875);
            rule__IntegerConstraint__Group__6__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group__6


    // $ANTLR start rule__IntegerConstraint__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3413:1: rule__IntegerConstraint__Group__6__Impl : ( ( rule__IntegerConstraint__Group_6__0 )? ) ;
    public final void rule__IntegerConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3417:1: ( ( ( rule__IntegerConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3418:1: ( ( rule__IntegerConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3418:1: ( ( rule__IntegerConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3419:1: ( rule__IntegerConstraint__Group_6__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3420:1: ( rule__IntegerConstraint__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3420:2: rule__IntegerConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__0_in_rule__IntegerConstraint__Group__6__Impl6902);
                    rule__IntegerConstraint__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__6__Impl


    // $ANTLR start rule__IntegerConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3444:1: rule__IntegerConstraint__Group_1__0 : rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1 ;
    public final void rule__IntegerConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3448:1: ( rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3449:2: rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__0__Impl_in_rule__IntegerConstraint__Group_1__06947);
            rule__IntegerConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__1_in_rule__IntegerConstraint__Group_1__06950);
            rule__IntegerConstraint__Group_1__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_1__0


    // $ANTLR start rule__IntegerConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3456:1: rule__IntegerConstraint__Group_1__0__Impl : ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__IntegerConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3460:1: ( ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3461:1: ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3461:1: ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3462:1: ( rule__IntegerConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3463:1: ( rule__IntegerConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3463:2: rule__IntegerConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__HasDefaultAssignment_1_0_in_rule__IntegerConstraint__Group_1__0__Impl6977);
            rule__IntegerConstraint__HasDefaultAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getHasDefaultAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_1__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3473:1: rule__IntegerConstraint__Group_1__1 : rule__IntegerConstraint__Group_1__1__Impl ;
    public final void rule__IntegerConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3477:1: ( rule__IntegerConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3478:2: rule__IntegerConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__1__Impl_in_rule__IntegerConstraint__Group_1__17007);
            rule__IntegerConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_1__1


    // $ANTLR start rule__IntegerConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3484:1: rule__IntegerConstraint__Group_1__1__Impl : ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__IntegerConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3488:1: ( ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3489:1: ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3489:1: ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3490:1: ( rule__IntegerConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:1: ( rule__IntegerConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:2: rule__IntegerConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__DefaultValueAssignment_1_1_in_rule__IntegerConstraint__Group_1__1__Impl7034);
            rule__IntegerConstraint__DefaultValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getDefaultValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_1__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3505:1: rule__IntegerConstraint__Group_2__0 : rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1 ;
    public final void rule__IntegerConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3509:1: ( rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3510:2: rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__0__Impl_in_rule__IntegerConstraint__Group_2__07068);
            rule__IntegerConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__1_in_rule__IntegerConstraint__Group_2__07071);
            rule__IntegerConstraint__Group_2__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_2__0


    // $ANTLR start rule__IntegerConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3517:1: rule__IntegerConstraint__Group_2__0__Impl : ( 'minVal' ) ;
    public final void rule__IntegerConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3521:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3522:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3522:1: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3523:1: 'minVal'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__IntegerConstraint__Group_2__0__Impl7099); 
             after(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_2__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3536:1: rule__IntegerConstraint__Group_2__1 : rule__IntegerConstraint__Group_2__1__Impl ;
    public final void rule__IntegerConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3540:1: ( rule__IntegerConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3541:2: rule__IntegerConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__1__Impl_in_rule__IntegerConstraint__Group_2__17130);
            rule__IntegerConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_2__1


    // $ANTLR start rule__IntegerConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3547:1: rule__IntegerConstraint__Group_2__1__Impl : ( ( rule__IntegerConstraint__MinValueAssignment_2_1 ) ) ;
    public final void rule__IntegerConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3551:1: ( ( ( rule__IntegerConstraint__MinValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:1: ( ( rule__IntegerConstraint__MinValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:1: ( ( rule__IntegerConstraint__MinValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3553:1: ( rule__IntegerConstraint__MinValueAssignment_2_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3554:1: ( rule__IntegerConstraint__MinValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3554:2: rule__IntegerConstraint__MinValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MinValueAssignment_2_1_in_rule__IntegerConstraint__Group_2__1__Impl7157);
            rule__IntegerConstraint__MinValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMinValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_2__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3568:1: rule__IntegerConstraint__Group_3__0 : rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1 ;
    public final void rule__IntegerConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3572:1: ( rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3573:2: rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__0__Impl_in_rule__IntegerConstraint__Group_3__07191);
            rule__IntegerConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__1_in_rule__IntegerConstraint__Group_3__07194);
            rule__IntegerConstraint__Group_3__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_3__0


    // $ANTLR start rule__IntegerConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3580:1: rule__IntegerConstraint__Group_3__0__Impl : ( 'maxVal' ) ;
    public final void rule__IntegerConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3584:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3585:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3585:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3586:1: 'maxVal'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__IntegerConstraint__Group_3__0__Impl7222); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_3__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3599:1: rule__IntegerConstraint__Group_3__1 : rule__IntegerConstraint__Group_3__1__Impl ;
    public final void rule__IntegerConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3603:1: ( rule__IntegerConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3604:2: rule__IntegerConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__1__Impl_in_rule__IntegerConstraint__Group_3__17253);
            rule__IntegerConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_3__1


    // $ANTLR start rule__IntegerConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3610:1: rule__IntegerConstraint__Group_3__1__Impl : ( ( rule__IntegerConstraint__MaxValueAssignment_3_1 ) ) ;
    public final void rule__IntegerConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3614:1: ( ( ( rule__IntegerConstraint__MaxValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3615:1: ( ( rule__IntegerConstraint__MaxValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3615:1: ( ( rule__IntegerConstraint__MaxValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3616:1: ( rule__IntegerConstraint__MaxValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3617:1: ( rule__IntegerConstraint__MaxValueAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3617:2: rule__IntegerConstraint__MaxValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MaxValueAssignment_3_1_in_rule__IntegerConstraint__Group_3__1__Impl7280);
            rule__IntegerConstraint__MaxValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMaxValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_3__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3631:1: rule__IntegerConstraint__Group_4__0 : rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1 ;
    public final void rule__IntegerConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3635:1: ( rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3636:2: rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__0__Impl_in_rule__IntegerConstraint__Group_4__07314);
            rule__IntegerConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__1_in_rule__IntegerConstraint__Group_4__07317);
            rule__IntegerConstraint__Group_4__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_4__0


    // $ANTLR start rule__IntegerConstraint__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3643:1: rule__IntegerConstraint__Group_4__0__Impl : ( 'maxLen' ) ;
    public final void rule__IntegerConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3647:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3648:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3648:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3649:1: 'maxLen'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__IntegerConstraint__Group_4__0__Impl7345); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_4__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3662:1: rule__IntegerConstraint__Group_4__1 : rule__IntegerConstraint__Group_4__1__Impl ;
    public final void rule__IntegerConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3666:1: ( rule__IntegerConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3667:2: rule__IntegerConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__1__Impl_in_rule__IntegerConstraint__Group_4__17376);
            rule__IntegerConstraint__Group_4__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_4__1


    // $ANTLR start rule__IntegerConstraint__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3673:1: rule__IntegerConstraint__Group_4__1__Impl : ( ( rule__IntegerConstraint__MaxLenAssignment_4_1 ) ) ;
    public final void rule__IntegerConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3677:1: ( ( ( rule__IntegerConstraint__MaxLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3678:1: ( ( rule__IntegerConstraint__MaxLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3678:1: ( ( rule__IntegerConstraint__MaxLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3679:1: ( rule__IntegerConstraint__MaxLenAssignment_4_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3680:1: ( rule__IntegerConstraint__MaxLenAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3680:2: rule__IntegerConstraint__MaxLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MaxLenAssignment_4_1_in_rule__IntegerConstraint__Group_4__1__Impl7403);
            rule__IntegerConstraint__MaxLenAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMaxLenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_4__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group_5__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3694:1: rule__IntegerConstraint__Group_5__0 : rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1 ;
    public final void rule__IntegerConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3698:1: ( rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3699:2: rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__0__Impl_in_rule__IntegerConstraint__Group_5__07437);
            rule__IntegerConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__1_in_rule__IntegerConstraint__Group_5__07440);
            rule__IntegerConstraint__Group_5__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_5__0


    // $ANTLR start rule__IntegerConstraint__Group_5__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3706:1: rule__IntegerConstraint__Group_5__0__Impl : ( 'fixeLen' ) ;
    public final void rule__IntegerConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3710:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3711:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3711:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3712:1: 'fixeLen'
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_5_0()); 
            match(input,32,FOLLOW_32_in_rule__IntegerConstraint__Group_5__0__Impl7468); 
             after(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_5__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_5__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3725:1: rule__IntegerConstraint__Group_5__1 : rule__IntegerConstraint__Group_5__1__Impl ;
    public final void rule__IntegerConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3729:1: ( rule__IntegerConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3730:2: rule__IntegerConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__1__Impl_in_rule__IntegerConstraint__Group_5__17499);
            rule__IntegerConstraint__Group_5__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_5__1


    // $ANTLR start rule__IntegerConstraint__Group_5__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3736:1: rule__IntegerConstraint__Group_5__1__Impl : ( ( rule__IntegerConstraint__FixeLenAssignment_5_1 ) ) ;
    public final void rule__IntegerConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3740:1: ( ( ( rule__IntegerConstraint__FixeLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3741:1: ( ( rule__IntegerConstraint__FixeLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3741:1: ( ( rule__IntegerConstraint__FixeLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3742:1: ( rule__IntegerConstraint__FixeLenAssignment_5_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3743:1: ( rule__IntegerConstraint__FixeLenAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3743:2: rule__IntegerConstraint__FixeLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__FixeLenAssignment_5_1_in_rule__IntegerConstraint__Group_5__1__Impl7526);
            rule__IntegerConstraint__FixeLenAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getFixeLenAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_5__1__Impl


    // $ANTLR start rule__IntegerConstraint__Group_6__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3757:1: rule__IntegerConstraint__Group_6__0 : rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1 ;
    public final void rule__IntegerConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3761:1: ( rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3762:2: rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__0__Impl_in_rule__IntegerConstraint__Group_6__07560);
            rule__IntegerConstraint__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__1_in_rule__IntegerConstraint__Group_6__07563);
            rule__IntegerConstraint__Group_6__1();
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
    // $ANTLR end rule__IntegerConstraint__Group_6__0


    // $ANTLR start rule__IntegerConstraint__Group_6__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3769:1: rule__IntegerConstraint__Group_6__0__Impl : ( 'paddle' ) ;
    public final void rule__IntegerConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3773:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3774:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3774:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3775:1: 'paddle'
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_6_0()); 
            match(input,36,FOLLOW_36_in_rule__IntegerConstraint__Group_6__0__Impl7591); 
             after(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_6__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_6__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3788:1: rule__IntegerConstraint__Group_6__1 : rule__IntegerConstraint__Group_6__1__Impl ;
    public final void rule__IntegerConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3792:1: ( rule__IntegerConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3793:2: rule__IntegerConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__1__Impl_in_rule__IntegerConstraint__Group_6__17622);
            rule__IntegerConstraint__Group_6__1__Impl();
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
    // $ANTLR end rule__IntegerConstraint__Group_6__1


    // $ANTLR start rule__IntegerConstraint__Group_6__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3799:1: rule__IntegerConstraint__Group_6__1__Impl : ( ( rule__IntegerConstraint__PaddleAssignment_6_1 ) ) ;
    public final void rule__IntegerConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3803:1: ( ( ( rule__IntegerConstraint__PaddleAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3804:1: ( ( rule__IntegerConstraint__PaddleAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3804:1: ( ( rule__IntegerConstraint__PaddleAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3805:1: ( rule__IntegerConstraint__PaddleAssignment_6_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3806:1: ( rule__IntegerConstraint__PaddleAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3806:2: rule__IntegerConstraint__PaddleAssignment_6_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__PaddleAssignment_6_1_in_rule__IntegerConstraint__Group_6__1__Impl7649);
            rule__IntegerConstraint__PaddleAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getPaddleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_6__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3820:1: rule__DecimalConstraint__Group__0 : rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 ;
    public final void rule__DecimalConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3824:1: ( rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3825:2: rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__07683);
            rule__DecimalConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__07686);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3832:1: rule__DecimalConstraint__Group__0__Impl : ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DecimalConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3836:1: ( ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3837:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3837:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3838:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3839:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3839:2: rule__DecimalConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl7713);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3849:1: rule__DecimalConstraint__Group__1 : rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2 ;
    public final void rule__DecimalConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3853:1: ( rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3854:2: rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__17743);
            rule__DecimalConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__2_in_rule__DecimalConstraint__Group__17746);
            rule__DecimalConstraint__Group__2();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3861:1: rule__DecimalConstraint__Group__1__Impl : ( ( rule__DecimalConstraint__Group_1__0 )? ) ;
    public final void rule__DecimalConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3865:1: ( ( ( rule__DecimalConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3866:1: ( ( rule__DecimalConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3866:1: ( ( rule__DecimalConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3867:1: ( rule__DecimalConstraint__Group_1__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3868:1: ( rule__DecimalConstraint__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3868:2: rule__DecimalConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__0_in_rule__DecimalConstraint__Group__1__Impl7773);
                    rule__DecimalConstraint__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DecimalConstraint__Group__2
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3878:1: rule__DecimalConstraint__Group__2 : rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3 ;
    public final void rule__DecimalConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3882:1: ( rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3883:2: rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__2__Impl_in_rule__DecimalConstraint__Group__27804);
            rule__DecimalConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__3_in_rule__DecimalConstraint__Group__27807);
            rule__DecimalConstraint__Group__3();
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
    // $ANTLR end rule__DecimalConstraint__Group__2


    // $ANTLR start rule__DecimalConstraint__Group__2__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3890:1: rule__DecimalConstraint__Group__2__Impl : ( ( rule__DecimalConstraint__Group_2__0 )? ) ;
    public final void rule__DecimalConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3894:1: ( ( ( rule__DecimalConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3895:1: ( ( rule__DecimalConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3895:1: ( ( rule__DecimalConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3896:1: ( rule__DecimalConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3897:1: ( rule__DecimalConstraint__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3897:2: rule__DecimalConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__0_in_rule__DecimalConstraint__Group__2__Impl7834);
                    rule__DecimalConstraint__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__2__Impl


    // $ANTLR start rule__DecimalConstraint__Group__3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3907:1: rule__DecimalConstraint__Group__3 : rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4 ;
    public final void rule__DecimalConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3911:1: ( rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3912:2: rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__3__Impl_in_rule__DecimalConstraint__Group__37865);
            rule__DecimalConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__4_in_rule__DecimalConstraint__Group__37868);
            rule__DecimalConstraint__Group__4();
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
    // $ANTLR end rule__DecimalConstraint__Group__3


    // $ANTLR start rule__DecimalConstraint__Group__3__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3919:1: rule__DecimalConstraint__Group__3__Impl : ( ( rule__DecimalConstraint__Group_3__0 )? ) ;
    public final void rule__DecimalConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3923:1: ( ( ( rule__DecimalConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3924:1: ( ( rule__DecimalConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3924:1: ( ( rule__DecimalConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3925:1: ( rule__DecimalConstraint__Group_3__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3926:1: ( rule__DecimalConstraint__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3926:2: rule__DecimalConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__0_in_rule__DecimalConstraint__Group__3__Impl7895);
                    rule__DecimalConstraint__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__3__Impl


    // $ANTLR start rule__DecimalConstraint__Group__4
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3936:1: rule__DecimalConstraint__Group__4 : rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5 ;
    public final void rule__DecimalConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3940:1: ( rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3941:2: rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__4__Impl_in_rule__DecimalConstraint__Group__47926);
            rule__DecimalConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__5_in_rule__DecimalConstraint__Group__47929);
            rule__DecimalConstraint__Group__5();
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
    // $ANTLR end rule__DecimalConstraint__Group__4


    // $ANTLR start rule__DecimalConstraint__Group__4__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3948:1: rule__DecimalConstraint__Group__4__Impl : ( ( rule__DecimalConstraint__Group_4__0 )? ) ;
    public final void rule__DecimalConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3952:1: ( ( ( rule__DecimalConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3953:1: ( ( rule__DecimalConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3953:1: ( ( rule__DecimalConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3954:1: ( rule__DecimalConstraint__Group_4__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3955:1: ( rule__DecimalConstraint__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3955:2: rule__DecimalConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__0_in_rule__DecimalConstraint__Group__4__Impl7956);
                    rule__DecimalConstraint__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__4__Impl


    // $ANTLR start rule__DecimalConstraint__Group__5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3965:1: rule__DecimalConstraint__Group__5 : rule__DecimalConstraint__Group__5__Impl ;
    public final void rule__DecimalConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3969:1: ( rule__DecimalConstraint__Group__5__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3970:2: rule__DecimalConstraint__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__5__Impl_in_rule__DecimalConstraint__Group__57987);
            rule__DecimalConstraint__Group__5__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group__5


    // $ANTLR start rule__DecimalConstraint__Group__5__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3976:1: rule__DecimalConstraint__Group__5__Impl : ( ( rule__DecimalConstraint__Group_5__0 )? ) ;
    public final void rule__DecimalConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3980:1: ( ( ( rule__DecimalConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3981:1: ( ( rule__DecimalConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3981:1: ( ( rule__DecimalConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3982:1: ( rule__DecimalConstraint__Group_5__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:1: ( rule__DecimalConstraint__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:2: rule__DecimalConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__0_in_rule__DecimalConstraint__Group__5__Impl8014);
                    rule__DecimalConstraint__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__5__Impl


    // $ANTLR start rule__DecimalConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4005:1: rule__DecimalConstraint__Group_1__0 : rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1 ;
    public final void rule__DecimalConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4009:1: ( rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4010:2: rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__0__Impl_in_rule__DecimalConstraint__Group_1__08057);
            rule__DecimalConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__1_in_rule__DecimalConstraint__Group_1__08060);
            rule__DecimalConstraint__Group_1__1();
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
    // $ANTLR end rule__DecimalConstraint__Group_1__0


    // $ANTLR start rule__DecimalConstraint__Group_1__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4017:1: rule__DecimalConstraint__Group_1__0__Impl : ( 'minVal' ) ;
    public final void rule__DecimalConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4021:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4022:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4022:1: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4023:1: 'minVal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__DecimalConstraint__Group_1__0__Impl8088); 
             after(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_1__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_1__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4036:1: rule__DecimalConstraint__Group_1__1 : rule__DecimalConstraint__Group_1__1__Impl ;
    public final void rule__DecimalConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4040:1: ( rule__DecimalConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4041:2: rule__DecimalConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__1__Impl_in_rule__DecimalConstraint__Group_1__18119);
            rule__DecimalConstraint__Group_1__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group_1__1


    // $ANTLR start rule__DecimalConstraint__Group_1__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4047:1: rule__DecimalConstraint__Group_1__1__Impl : ( ( rule__DecimalConstraint__MinValueAssignment_1_1 ) ) ;
    public final void rule__DecimalConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4051:1: ( ( ( rule__DecimalConstraint__MinValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4052:1: ( ( rule__DecimalConstraint__MinValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4052:1: ( ( rule__DecimalConstraint__MinValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4053:1: ( rule__DecimalConstraint__MinValueAssignment_1_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4054:1: ( rule__DecimalConstraint__MinValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4054:2: rule__DecimalConstraint__MinValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MinValueAssignment_1_1_in_rule__DecimalConstraint__Group_1__1__Impl8146);
            rule__DecimalConstraint__MinValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMinValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_1__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4068:1: rule__DecimalConstraint__Group_2__0 : rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1 ;
    public final void rule__DecimalConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4072:1: ( rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4073:2: rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__0__Impl_in_rule__DecimalConstraint__Group_2__08180);
            rule__DecimalConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__1_in_rule__DecimalConstraint__Group_2__08183);
            rule__DecimalConstraint__Group_2__1();
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
    // $ANTLR end rule__DecimalConstraint__Group_2__0


    // $ANTLR start rule__DecimalConstraint__Group_2__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4080:1: rule__DecimalConstraint__Group_2__0__Impl : ( 'maxVal' ) ;
    public final void rule__DecimalConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4084:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4085:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4085:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4086:1: 'maxVal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__DecimalConstraint__Group_2__0__Impl8211); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_2__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_2__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4099:1: rule__DecimalConstraint__Group_2__1 : rule__DecimalConstraint__Group_2__1__Impl ;
    public final void rule__DecimalConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4103:1: ( rule__DecimalConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4104:2: rule__DecimalConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__1__Impl_in_rule__DecimalConstraint__Group_2__18242);
            rule__DecimalConstraint__Group_2__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group_2__1


    // $ANTLR start rule__DecimalConstraint__Group_2__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4110:1: rule__DecimalConstraint__Group_2__1__Impl : ( ( rule__DecimalConstraint__MaxValueAssignment_2_1 ) ) ;
    public final void rule__DecimalConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4114:1: ( ( ( rule__DecimalConstraint__MaxValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4115:1: ( ( rule__DecimalConstraint__MaxValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4115:1: ( ( rule__DecimalConstraint__MaxValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4116:1: ( rule__DecimalConstraint__MaxValueAssignment_2_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4117:1: ( rule__DecimalConstraint__MaxValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4117:2: rule__DecimalConstraint__MaxValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MaxValueAssignment_2_1_in_rule__DecimalConstraint__Group_2__1__Impl8269);
            rule__DecimalConstraint__MaxValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMaxValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_2__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group_3__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4131:1: rule__DecimalConstraint__Group_3__0 : rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1 ;
    public final void rule__DecimalConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4135:1: ( rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4136:2: rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__0__Impl_in_rule__DecimalConstraint__Group_3__08303);
            rule__DecimalConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__1_in_rule__DecimalConstraint__Group_3__08306);
            rule__DecimalConstraint__Group_3__1();
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
    // $ANTLR end rule__DecimalConstraint__Group_3__0


    // $ANTLR start rule__DecimalConstraint__Group_3__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4143:1: rule__DecimalConstraint__Group_3__0__Impl : ( 'maxLen' ) ;
    public final void rule__DecimalConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4147:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4148:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4148:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4149:1: 'maxLen'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_3_0()); 
            match(input,31,FOLLOW_31_in_rule__DecimalConstraint__Group_3__0__Impl8334); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_3__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_3__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4162:1: rule__DecimalConstraint__Group_3__1 : rule__DecimalConstraint__Group_3__1__Impl ;
    public final void rule__DecimalConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4166:1: ( rule__DecimalConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4167:2: rule__DecimalConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__1__Impl_in_rule__DecimalConstraint__Group_3__18365);
            rule__DecimalConstraint__Group_3__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group_3__1


    // $ANTLR start rule__DecimalConstraint__Group_3__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4173:1: rule__DecimalConstraint__Group_3__1__Impl : ( ( rule__DecimalConstraint__MaxLenAssignment_3_1 ) ) ;
    public final void rule__DecimalConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4177:1: ( ( ( rule__DecimalConstraint__MaxLenAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4178:1: ( ( rule__DecimalConstraint__MaxLenAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4178:1: ( ( rule__DecimalConstraint__MaxLenAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4179:1: ( rule__DecimalConstraint__MaxLenAssignment_3_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4180:1: ( rule__DecimalConstraint__MaxLenAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4180:2: rule__DecimalConstraint__MaxLenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MaxLenAssignment_3_1_in_rule__DecimalConstraint__Group_3__1__Impl8392);
            rule__DecimalConstraint__MaxLenAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMaxLenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_3__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group_4__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4194:1: rule__DecimalConstraint__Group_4__0 : rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1 ;
    public final void rule__DecimalConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4198:1: ( rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4199:2: rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__0__Impl_in_rule__DecimalConstraint__Group_4__08426);
            rule__DecimalConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__1_in_rule__DecimalConstraint__Group_4__08429);
            rule__DecimalConstraint__Group_4__1();
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
    // $ANTLR end rule__DecimalConstraint__Group_4__0


    // $ANTLR start rule__DecimalConstraint__Group_4__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4206:1: rule__DecimalConstraint__Group_4__0__Impl : ( 'fixeLen' ) ;
    public final void rule__DecimalConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4210:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4211:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4211:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4212:1: 'fixeLen'
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_4_0()); 
            match(input,32,FOLLOW_32_in_rule__DecimalConstraint__Group_4__0__Impl8457); 
             after(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_4__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_4__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4225:1: rule__DecimalConstraint__Group_4__1 : rule__DecimalConstraint__Group_4__1__Impl ;
    public final void rule__DecimalConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4229:1: ( rule__DecimalConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4230:2: rule__DecimalConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__1__Impl_in_rule__DecimalConstraint__Group_4__18488);
            rule__DecimalConstraint__Group_4__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group_4__1


    // $ANTLR start rule__DecimalConstraint__Group_4__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4236:1: rule__DecimalConstraint__Group_4__1__Impl : ( ( rule__DecimalConstraint__FixeLenAssignment_4_1 ) ) ;
    public final void rule__DecimalConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4240:1: ( ( ( rule__DecimalConstraint__FixeLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4241:1: ( ( rule__DecimalConstraint__FixeLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4241:1: ( ( rule__DecimalConstraint__FixeLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4242:1: ( rule__DecimalConstraint__FixeLenAssignment_4_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4243:1: ( rule__DecimalConstraint__FixeLenAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4243:2: rule__DecimalConstraint__FixeLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__FixeLenAssignment_4_1_in_rule__DecimalConstraint__Group_4__1__Impl8515);
            rule__DecimalConstraint__FixeLenAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getFixeLenAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_4__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group_5__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4257:1: rule__DecimalConstraint__Group_5__0 : rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1 ;
    public final void rule__DecimalConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4261:1: ( rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4262:2: rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__0__Impl_in_rule__DecimalConstraint__Group_5__08549);
            rule__DecimalConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__1_in_rule__DecimalConstraint__Group_5__08552);
            rule__DecimalConstraint__Group_5__1();
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
    // $ANTLR end rule__DecimalConstraint__Group_5__0


    // $ANTLR start rule__DecimalConstraint__Group_5__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4269:1: rule__DecimalConstraint__Group_5__0__Impl : ( 'paddle' ) ;
    public final void rule__DecimalConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4273:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4274:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4274:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4275:1: 'paddle'
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__DecimalConstraint__Group_5__0__Impl8580); 
             after(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_5__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_5__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4288:1: rule__DecimalConstraint__Group_5__1 : rule__DecimalConstraint__Group_5__1__Impl ;
    public final void rule__DecimalConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4292:1: ( rule__DecimalConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4293:2: rule__DecimalConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__1__Impl_in_rule__DecimalConstraint__Group_5__18611);
            rule__DecimalConstraint__Group_5__1__Impl();
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
    // $ANTLR end rule__DecimalConstraint__Group_5__1


    // $ANTLR start rule__DecimalConstraint__Group_5__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4299:1: rule__DecimalConstraint__Group_5__1__Impl : ( ( rule__DecimalConstraint__PaddleAssignment_5_1 ) ) ;
    public final void rule__DecimalConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4303:1: ( ( ( rule__DecimalConstraint__PaddleAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4304:1: ( ( rule__DecimalConstraint__PaddleAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4304:1: ( ( rule__DecimalConstraint__PaddleAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4305:1: ( rule__DecimalConstraint__PaddleAssignment_5_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4306:1: ( rule__DecimalConstraint__PaddleAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4306:2: rule__DecimalConstraint__PaddleAssignment_5_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__PaddleAssignment_5_1_in_rule__DecimalConstraint__Group_5__1__Impl8638);
            rule__DecimalConstraint__PaddleAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getPaddleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_5__1__Impl


    // $ANTLR start rule__Enumeration__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4320:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4324:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4325:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__08672);
            rule__Enumeration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__08675);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4332:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4336:1: ( ( 'enumeration' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4337:1: ( 'enumeration' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4337:1: ( 'enumeration' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4338:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Enumeration__Group__0__Impl8703); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4351:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4355:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4356:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__18734);
            rule__Enumeration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__18737);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4363:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4367:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4368:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4368:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4369:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4370:1: ( rule__Enumeration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4370:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl8764);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4380:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4384:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4385:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__28794);
            rule__Enumeration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__28797);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4392:1: rule__Enumeration__Group__2__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4396:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4397:1: ( '[' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4397:1: ( '[' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4398:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Enumeration__Group__2__Impl8825); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4411:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4415:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4416:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__38856);
            rule__Enumeration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__38859);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4423:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4427:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4428:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4428:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4429:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4429:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4430:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4431:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4431:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl8888);
            rule__Enumeration__EnumerationLiteralsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4434:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4435:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4436:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4436:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl8900);
            	    rule__Enumeration__EnumerationLiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4447:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4451:1: ( rule__Enumeration__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4452:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__48933);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4458:1: rule__Enumeration__Group__4__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4462:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4463:1: ( ']' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4463:1: ( ']' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4464:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 
            match(input,39,FOLLOW_39_in_rule__Enumeration__Group__4__Impl8961); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4487:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4491:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4492:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__09002);
            rule__EnumerationLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__09005);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4499:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4503:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4504:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4504:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4505:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4506:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4506:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl9032);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4516:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4520:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4521:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__19062);
            rule__EnumerationLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__19065);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4528:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4532:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4533:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4533:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4534:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4535:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4535:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl9092);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4545:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4549:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4550:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__29122);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4556:1: rule__EnumerationLiteral__Group__2__Impl : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4560:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4561:1: ( ';' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4561:1: ( ';' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4562:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__EnumerationLiteral__Group__2__Impl9150); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4581:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4585:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4586:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__09187);
            rule__EnumerationLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__09190);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4593:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4597:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4598:1: ( '=' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4598:1: ( '=' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4599:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumerationLiteral__Group_1__0__Impl9218); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4612:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4616:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4617:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__19249);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4623:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4627:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4628:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4628:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4629:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4630:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4630:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl9276);
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


    // $ANTLR start rule__EnumerationConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4644:1: rule__EnumerationConstraint__Group__0 : rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 ;
    public final void rule__EnumerationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4648:1: ( rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4649:2: rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__09310);
            rule__EnumerationConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__09313);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4656:1: rule__EnumerationConstraint__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4660:1: ( ( 'enum' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4661:1: ( 'enum' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4661:1: ( 'enum' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4662:1: 'enum'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__EnumerationConstraint__Group__0__Impl9341); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4675:1: rule__EnumerationConstraint__Group__1 : rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 ;
    public final void rule__EnumerationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4679:1: ( rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4680:2: rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__19372);
            rule__EnumerationConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__19375);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4687:1: rule__EnumerationConstraint__Group__1__Impl : ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) ;
    public final void rule__EnumerationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4691:1: ( ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4692:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4692:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4693:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4694:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4694:2: rule__EnumerationConstraint__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl9402);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4704:1: rule__EnumerationConstraint__Group__2 : rule__EnumerationConstraint__Group__2__Impl ;
    public final void rule__EnumerationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4708:1: ( rule__EnumerationConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4709:2: rule__EnumerationConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__29432);
            rule__EnumerationConstraint__Group__2__Impl();
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4715:1: rule__EnumerationConstraint__Group__2__Impl : ( ( rule__EnumerationConstraint__Group_2__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4719:1: ( ( ( rule__EnumerationConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4720:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4720:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4721:1: ( rule__EnumerationConstraint__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4722:1: ( rule__EnumerationConstraint__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4722:2: rule__EnumerationConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl9459);
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


    // $ANTLR start rule__EnumerationConstraint__Group_2__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4738:1: rule__EnumerationConstraint__Group_2__0 : rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 ;
    public final void rule__EnumerationConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4742:1: ( rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4743:2: rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__09496);
            rule__EnumerationConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__09499);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4750:1: rule__EnumerationConstraint__Group_2__0__Impl : ( ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4754:1: ( ( ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4755:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4755:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4756:1: ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4757:1: ( rule__EnumerationConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4757:2: rule__EnumerationConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_2_0_in_rule__EnumerationConstraint__Group_2__0__Impl9526);
            rule__EnumerationConstraint__HasDefaultAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4767:1: rule__EnumerationConstraint__Group_2__1 : rule__EnumerationConstraint__Group_2__1__Impl ;
    public final void rule__EnumerationConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4771:1: ( rule__EnumerationConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4772:2: rule__EnumerationConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__19556);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4778:1: rule__EnumerationConstraint__Group_2__1__Impl : ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4782:1: ( ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4783:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4783:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4784:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4785:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4785:2: rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl9583);
            rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DomainModel__ElementsAssignment
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4800:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4804:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4805:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4805:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4806:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment9622);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4815:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4819:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4820:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4820:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4821:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19653);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4830:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4834:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4835:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4835:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4836:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19684);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4845:1: rule__PackageDeclaration__PrefixAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4849:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4850:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4850:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4851:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_19715);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4860:1: rule__PackageDeclaration__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4864:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4865:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4865:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4866:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_19746); 
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


    // $ANTLR start rule__PackageDeclaration__ElementsAssignment_5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4875:1: rule__PackageDeclaration__ElementsAssignment_5 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4879:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4880:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4880:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4881:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_59777);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PackageDeclaration__ElementsAssignment_5


    // $ANTLR start rule__DataType__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4890:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4894:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4895:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4895:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4896:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_19808); 
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


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4905:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4909:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4910:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4910:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4911:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_19839); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__SuperTypeAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4920:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4924:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4925:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4925:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4926:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4927:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4928:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_19874);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__SuperTypeAssignment_2_1


    // $ANTLR start rule__Entity__DescriptionAssignment_3
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4939:1: rule__Entity__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4943:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4944:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4944:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4945:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_39909); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__DescriptionAssignment_3


    // $ANTLR start rule__Entity__FeaturesAssignment_5
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4954:1: rule__Entity__FeaturesAssignment_5 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4958:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4959:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4959:1: ( ruleFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4960:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_59940);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_5


    // $ANTLR start rule__Feature__ConstraintAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4969:1: rule__Feature__ConstraintAssignment_1 : ( ruleConstraint ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4973:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4974:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4974:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4975:1: ruleConstraint
            {
             before(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_19971);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4984:1: rule__Feature__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4988:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4989:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4989:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4990:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_210002); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4999:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5003:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5004:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5004:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5005:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_010033); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5014:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5018:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5019:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5019:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5020:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_210064);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5029:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5033:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5034:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5034:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5035:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_110095); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5044:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5048:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5049:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5049:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5050:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_310126);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5059:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5063:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5064:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5064:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5065:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5066:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5067:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_110161); 
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


    // $ANTLR start rule__Parameter__NameAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5078:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5082:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5083:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5083:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5084:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_010196); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5093:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5097:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5098:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5098:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5099:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_110227);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5108:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5112:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5113:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5113:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5114:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5115:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5116:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_010262);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5127:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5131:1: ( ( ( '*' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5132:1: ( ( '*' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5132:1: ( ( '*' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5133:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5134:1: ( '*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5135:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__TypeRef__MultiAssignment_110302); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5150:1: rule__TypeRef__OptionAssignment_2 : ( ( '?' ) ) ;
    public final void rule__TypeRef__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5154:1: ( ( ( '?' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5155:1: ( ( '?' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5155:1: ( ( '?' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5156:1: ( '?' )
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5157:1: ( '?' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5158:1: '?'
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__TypeRef__OptionAssignment_210346); 
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


    // $ANTLR start rule__BoolConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5173:1: rule__BoolConstraint__ConstraintAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__BoolConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5177:1: ( ( ( 'boolean' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5178:1: ( ( 'boolean' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5178:1: ( ( 'boolean' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5179:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5180:1: ( 'boolean' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5181:1: 'boolean'
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__BoolConstraint__ConstraintAssignment_010390); 
             after(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 

            }

             after(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__ConstraintAssignment_0


    // $ANTLR start rule__BoolConstraint__HasDefaultAssignment_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5196:1: rule__BoolConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__BoolConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5200:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5201:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5201:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5202:1: ( 'default' )
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5203:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5204:1: 'default'
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,46,FOLLOW_46_in_rule__BoolConstraint__HasDefaultAssignment_1_010434); 
             after(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }

             after(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__HasDefaultAssignment_1_0


    // $ANTLR start rule__BoolConstraint__DefaultValueAssignment_1_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5219:1: rule__BoolConstraint__DefaultValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolConstraint__DefaultValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5223:1: ( ( ( 'true' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( ( 'true' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( ( 'true' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5225:1: ( 'true' )
            {
             before(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5226:1: ( 'true' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5227:1: 'true'
            {
             before(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 
            match(input,47,FOLLOW_47_in_rule__BoolConstraint__DefaultValueAssignment_1_1_010478); 
             after(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 

            }

             after(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BoolConstraint__DefaultValueAssignment_1_1_0


    // $ANTLR start rule__StringConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5242:1: rule__StringConstraint__ConstraintAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__StringConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5246:1: ( ( ( 'string' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5247:1: ( ( 'string' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5247:1: ( ( 'string' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5248:1: ( 'string' )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5249:1: ( 'string' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5250:1: 'string'
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__StringConstraint__ConstraintAssignment_010522); 
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


    // $ANTLR start rule__StringConstraint__HasDefaultAssignment_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5265:1: rule__StringConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__StringConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5269:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5270:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5270:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5271:1: ( 'default' )
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5272:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5273:1: 'default'
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,46,FOLLOW_46_in_rule__StringConstraint__HasDefaultAssignment_1_010566); 
             after(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }

             after(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__HasDefaultAssignment_1_0


    // $ANTLR start rule__StringConstraint__DefaultValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5288:1: rule__StringConstraint__DefaultValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5292:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5293:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5293:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5294:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__DefaultValueAssignment_1_110605); 
             after(grammarAccess.getStringConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__DefaultValueAssignment_1_1


    // $ANTLR start rule__StringConstraint__MinLengthAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5303:1: rule__StringConstraint__MinLengthAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__MinLengthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5307:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5308:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5308:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5309:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getMinLengthINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__MinLengthAssignment_2_110636); 
             after(grammarAccess.getStringConstraintAccess().getMinLengthINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__MinLengthAssignment_2_1


    // $ANTLR start rule__StringConstraint__MaxLengthAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5318:1: rule__StringConstraint__MaxLengthAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__MaxLengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5322:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5323:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5323:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5324:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLengthINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__MaxLengthAssignment_3_110667); 
             after(grammarAccess.getStringConstraintAccess().getMaxLengthINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__MaxLengthAssignment_3_1


    // $ANTLR start rule__StringConstraint__FixeLengthAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5333:1: rule__StringConstraint__FixeLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__FixeLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5337:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5338:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5338:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5339:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__FixeLengthAssignment_4_110698); 
             after(grammarAccess.getStringConstraintAccess().getFixeLengthINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__FixeLengthAssignment_4_1


    // $ANTLR start rule__StringConstraint__RegularExpressionAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5348:1: rule__StringConstraint__RegularExpressionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__RegularExpressionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5352:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5353:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5353:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5354:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_5_110729); 
             after(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__RegularExpressionAssignment_5_1


    // $ANTLR start rule__DateTimeConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5363:1: rule__DateTimeConstraint__ConstraintAssignment_0 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5367:1: ( ( ( 'datetime' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5368:1: ( ( 'datetime' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5368:1: ( ( 'datetime' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5369:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5370:1: ( 'datetime' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5371:1: 'datetime'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__DateTimeConstraint__ConstraintAssignment_010765); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5386:1: rule__DateTimeConstraint__DataTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DateTimeConstraint__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5390:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5391:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5391:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5392:1: ( RULE_ID )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5393:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5394:1: RULE_ID
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_110808); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5405:1: rule__DateTimeConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5409:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5410:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5410:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5411:1: ( 'default' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5412:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5413:1: 'default'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,46,FOLLOW_46_in_rule__DateTimeConstraint__HasDefaultAssignment_2_010848); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5428:1: rule__DateTimeConstraint__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeConstraint__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5432:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5433:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5433:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5434:1: RULE_STRING
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_110887); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5443:1: rule__IntegerConstraint__ConstraintAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__IntegerConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5447:1: ( ( ( 'integer' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5448:1: ( ( 'integer' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5448:1: ( ( 'integer' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5449:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5450:1: ( 'integer' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5451:1: 'integer'
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__IntegerConstraint__ConstraintAssignment_010923); 
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


    // $ANTLR start rule__IntegerConstraint__HasDefaultAssignment_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5466:1: rule__IntegerConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5470:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5471:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5471:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5472:1: ( 'default' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5473:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5474:1: 'default'
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,46,FOLLOW_46_in_rule__IntegerConstraint__HasDefaultAssignment_1_010967); 
             after(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }

             after(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__HasDefaultAssignment_1_0


    // $ANTLR start rule__IntegerConstraint__DefaultValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5489:1: rule__IntegerConstraint__DefaultValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5493:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5494:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5494:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5495:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getDefaultValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__DefaultValueAssignment_1_111006); 
             after(grammarAccess.getIntegerConstraintAccess().getDefaultValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__DefaultValueAssignment_1_1


    // $ANTLR start rule__IntegerConstraint__MinValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5504:1: rule__IntegerConstraint__MinValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MinValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5508:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5509:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5509:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5510:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MinValueAssignment_2_111037); 
             after(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MinValueAssignment_2_1


    // $ANTLR start rule__IntegerConstraint__MaxValueAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5519:1: rule__IntegerConstraint__MaxValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MaxValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5523:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5524:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5524:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5525:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxValueAssignment_3_111068); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MaxValueAssignment_3_1


    // $ANTLR start rule__IntegerConstraint__MaxLenAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5534:1: rule__IntegerConstraint__MaxLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MaxLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5538:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5539:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5539:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5540:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxLenAssignment_4_111099); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MaxLenAssignment_4_1


    // $ANTLR start rule__IntegerConstraint__FixeLenAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5549:1: rule__IntegerConstraint__FixeLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__FixeLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5553:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5554:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5554:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5555:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixeLenAssignment_5_111130); 
             after(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__FixeLenAssignment_5_1


    // $ANTLR start rule__IntegerConstraint__PaddleAssignment_6_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5564:1: rule__IntegerConstraint__PaddleAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__IntegerConstraint__PaddleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5568:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5569:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5569:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5570:1: RULE_STRING
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerConstraint__PaddleAssignment_6_111161); 
             after(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__PaddleAssignment_6_1


    // $ANTLR start rule__DecimalConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5579:1: rule__DecimalConstraint__ConstraintAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5583:1: ( ( ( 'decimal' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5584:1: ( ( 'decimal' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5584:1: ( ( 'decimal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5585:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5586:1: ( 'decimal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5587:1: 'decimal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__DecimalConstraint__ConstraintAssignment_011197); 
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


    // $ANTLR start rule__DecimalConstraint__MinValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5602:1: rule__DecimalConstraint__MinValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MinValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5606:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5607:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5607:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5608:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MinValueAssignment_1_111236); 
             after(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MinValueAssignment_1_1


    // $ANTLR start rule__DecimalConstraint__MaxValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5617:1: rule__DecimalConstraint__MaxValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MaxValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5621:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5622:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5622:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5623:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxValueAssignment_2_111267); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MaxValueAssignment_2_1


    // $ANTLR start rule__DecimalConstraint__MaxLenAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5632:1: rule__DecimalConstraint__MaxLenAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MaxLenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5636:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5637:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5637:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5638:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxLenAssignment_3_111298); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MaxLenAssignment_3_1


    // $ANTLR start rule__DecimalConstraint__FixeLenAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5647:1: rule__DecimalConstraint__FixeLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__FixeLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5651:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5652:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5652:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5653:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__FixeLenAssignment_4_111329); 
             after(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__FixeLenAssignment_4_1


    // $ANTLR start rule__DecimalConstraint__PaddleAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5662:1: rule__DecimalConstraint__PaddleAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__DecimalConstraint__PaddleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5666:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5667:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5667:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5668:1: RULE_STRING
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalConstraint__PaddleAssignment_5_111360); 
             after(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__PaddleAssignment_5_1


    // $ANTLR start rule__Enumeration__NameAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5677:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5681:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5682:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5682:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5683:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_111391); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5692:1: rule__Enumeration__EnumerationLiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5696:1: ( ( ruleEnumerationLiteral ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5697:1: ( ruleEnumerationLiteral )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5697:1: ( ruleEnumerationLiteral )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5698:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_311422);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5707:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5711:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5712:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5712:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5713:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_011453); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5722:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5726:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5727:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5727:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5728:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_111484); 
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


    // $ANTLR start rule__EnumerationConstraint__UsageAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5737:1: rule__EnumerationConstraint__UsageAssignment_1 : ( ruleEnumUsage ) ;
    public final void rule__EnumerationConstraint__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5741:1: ( ( ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5742:1: ( ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5742:1: ( ruleEnumUsage )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5743:1: ruleEnumUsage
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_111515);
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


    // $ANTLR start rule__EnumerationConstraint__HasDefaultAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5752:1: rule__EnumerationConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5756:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5757:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5757:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5758:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5759:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5760:1: 'default'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,46,FOLLOW_46_in_rule__EnumerationConstraint__HasDefaultAssignment_2_011551); 
             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }

             after(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationConstraint__HasDefaultAssignment_2_0


    // $ANTLR start rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5775:1: rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5779:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5780:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5780:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5781:1: RULE_ID
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_111590); 
             after(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000002000C30002L});
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
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__0_in_ruleBoolConstraint1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__DefaultValueAssignment_1_1_0_in_rule__BoolConstraint__Alternatives_1_11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BoolConstraint__Alternatives_1_11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EnumUsage__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EnumUsage__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EnumUsage__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EnumUsage__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__0__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PackageDeclaration__Group__0__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12189 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22249 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32309 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42369 = new BitSet(new long[]{0x0000002000CB0000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PackageDeclaration__Group__4__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_5_in_rule__PackageDeclaration__Group__5__Impl2461 = new BitSet(new long[]{0x0000002000C30002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclaration__Group__6__Impl2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__02565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__02568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PackageDeclaration__Group_2__0__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group_3__0__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__12750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Group__0__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__0__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12996 = new BitSet(new long[]{0x0000000001040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23056 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33117 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_3_in_rule__Entity__Group__3__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43178 = new BitSet(new long[]{0x0000000004080010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__4__Impl3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53240 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_in_rule__Entity__Group__5__Impl3270 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__6__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__03374 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__03377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Entity__Group_2__0__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03497 = new BitSet(new long[]{0x000F240000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13556 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Attribute__Group__1__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Reference__Group__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13928 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Reference__Group__2__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34050 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__04178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__04181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Reference__Group_4__0__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__14240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__04422 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__04425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__14482 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__24543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__04607 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QualifiedNameWithWildCard__Group__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04732 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4818 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__0__Impl_in_rule__BoolConstraint__Group__04975 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__1_in_rule__BoolConstraint__Group__04978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__ConstraintAssignment_0_in_rule__BoolConstraint__Group__0__Impl5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__1__Impl_in_rule__BoolConstraint__Group__15035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__0_in_rule__BoolConstraint__Group__1__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__0__Impl_in_rule__BoolConstraint__Group_1__05097 = new BitSet(new long[]{0x0000800000000800L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__1_in_rule__BoolConstraint__Group_1__05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__HasDefaultAssignment_1_0_in_rule__BoolConstraint__Group_1__0__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__1__Impl_in_rule__BoolConstraint__Group_1__15157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Alternatives_1_1_in_rule__BoolConstraint__Group_1__1__Impl5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__05218 = new BitSet(new long[]{0x00004003C0000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__05221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__15278 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__0_in_rule__StringConstraint__Group__1__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__25339 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__3_in_rule__StringConstraint__Group__25342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__3__Impl_in_rule__StringConstraint__Group__35400 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__4_in_rule__StringConstraint__Group__35403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__0_in_rule__StringConstraint__Group__3__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__4__Impl_in_rule__StringConstraint__Group__45461 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__5_in_rule__StringConstraint__Group__45464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__0_in_rule__StringConstraint__Group__4__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__5__Impl_in_rule__StringConstraint__Group__55522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__0_in_rule__StringConstraint__Group__5__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__0__Impl_in_rule__StringConstraint__Group_1__05592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__1_in_rule__StringConstraint__Group_1__05595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__HasDefaultAssignment_1_0_in_rule__StringConstraint__Group_1__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__1__Impl_in_rule__StringConstraint__Group_1__15652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__DefaultValueAssignment_1_1_in_rule__StringConstraint__Group_1__1__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__05713 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StringConstraint__Group_2__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__15775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__MinLengthAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__0__Impl_in_rule__StringConstraint__Group_3__05836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__1_in_rule__StringConstraint__Group_3__05839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StringConstraint__Group_3__0__Impl5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__1__Impl_in_rule__StringConstraint__Group_3__15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__MaxLengthAssignment_3_1_in_rule__StringConstraint__Group_3__1__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__0__Impl_in_rule__StringConstraint__Group_4__05959 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__1_in_rule__StringConstraint__Group_4__05962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StringConstraint__Group_4__0__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__1__Impl_in_rule__StringConstraint__Group_4__16021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__FixeLengthAssignment_4_1_in_rule__StringConstraint__Group_4__1__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__0__Impl_in_rule__StringConstraint__Group_5__06082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__1_in_rule__StringConstraint__Group_5__06085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StringConstraint__Group_5__0__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__1__Impl_in_rule__StringConstraint__Group_5__16144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__RegularExpressionAssignment_5_1_in_rule__StringConstraint__Group_5__1__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__06205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__06208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__16265 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__16268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__26325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__06389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__16449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__06510 = new BitSet(new long[]{0x0000401D80000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__06513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__16570 = new BitSet(new long[]{0x0000001D80000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__2_in_rule__IntegerConstraint__Group__16573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__0_in_rule__IntegerConstraint__Group__1__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__2__Impl_in_rule__IntegerConstraint__Group__26631 = new BitSet(new long[]{0x0000001980000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__3_in_rule__IntegerConstraint__Group__26634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__0_in_rule__IntegerConstraint__Group__2__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__3__Impl_in_rule__IntegerConstraint__Group__36692 = new BitSet(new long[]{0x0000001180000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__4_in_rule__IntegerConstraint__Group__36695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__0_in_rule__IntegerConstraint__Group__3__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__4__Impl_in_rule__IntegerConstraint__Group__46753 = new BitSet(new long[]{0x0000001100000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__5_in_rule__IntegerConstraint__Group__46756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__0_in_rule__IntegerConstraint__Group__4__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__5__Impl_in_rule__IntegerConstraint__Group__56814 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__6_in_rule__IntegerConstraint__Group__56817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__0_in_rule__IntegerConstraint__Group__5__Impl6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__6__Impl_in_rule__IntegerConstraint__Group__66875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__0_in_rule__IntegerConstraint__Group__6__Impl6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__0__Impl_in_rule__IntegerConstraint__Group_1__06947 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__1_in_rule__IntegerConstraint__Group_1__06950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__HasDefaultAssignment_1_0_in_rule__IntegerConstraint__Group_1__0__Impl6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__1__Impl_in_rule__IntegerConstraint__Group_1__17007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__DefaultValueAssignment_1_1_in_rule__IntegerConstraint__Group_1__1__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__0__Impl_in_rule__IntegerConstraint__Group_2__07068 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__1_in_rule__IntegerConstraint__Group_2__07071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IntegerConstraint__Group_2__0__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__1__Impl_in_rule__IntegerConstraint__Group_2__17130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MinValueAssignment_2_1_in_rule__IntegerConstraint__Group_2__1__Impl7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__0__Impl_in_rule__IntegerConstraint__Group_3__07191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__1_in_rule__IntegerConstraint__Group_3__07194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__IntegerConstraint__Group_3__0__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__1__Impl_in_rule__IntegerConstraint__Group_3__17253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MaxValueAssignment_3_1_in_rule__IntegerConstraint__Group_3__1__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__0__Impl_in_rule__IntegerConstraint__Group_4__07314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__1_in_rule__IntegerConstraint__Group_4__07317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__IntegerConstraint__Group_4__0__Impl7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__1__Impl_in_rule__IntegerConstraint__Group_4__17376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MaxLenAssignment_4_1_in_rule__IntegerConstraint__Group_4__1__Impl7403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__0__Impl_in_rule__IntegerConstraint__Group_5__07437 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__1_in_rule__IntegerConstraint__Group_5__07440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__IntegerConstraint__Group_5__0__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__1__Impl_in_rule__IntegerConstraint__Group_5__17499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__FixeLenAssignment_5_1_in_rule__IntegerConstraint__Group_5__1__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__0__Impl_in_rule__IntegerConstraint__Group_6__07560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__1_in_rule__IntegerConstraint__Group_6__07563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__IntegerConstraint__Group_6__0__Impl7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__1__Impl_in_rule__IntegerConstraint__Group_6__17622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__PaddleAssignment_6_1_in_rule__IntegerConstraint__Group_6__1__Impl7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__07683 = new BitSet(new long[]{0x0000001D80000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__07686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__17743 = new BitSet(new long[]{0x0000001980000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__2_in_rule__DecimalConstraint__Group__17746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__0_in_rule__DecimalConstraint__Group__1__Impl7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__2__Impl_in_rule__DecimalConstraint__Group__27804 = new BitSet(new long[]{0x0000001180000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__3_in_rule__DecimalConstraint__Group__27807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__0_in_rule__DecimalConstraint__Group__2__Impl7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__3__Impl_in_rule__DecimalConstraint__Group__37865 = new BitSet(new long[]{0x0000001100000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__4_in_rule__DecimalConstraint__Group__37868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__0_in_rule__DecimalConstraint__Group__3__Impl7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__4__Impl_in_rule__DecimalConstraint__Group__47926 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__5_in_rule__DecimalConstraint__Group__47929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__0_in_rule__DecimalConstraint__Group__4__Impl7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__5__Impl_in_rule__DecimalConstraint__Group__57987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__0_in_rule__DecimalConstraint__Group__5__Impl8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__0__Impl_in_rule__DecimalConstraint__Group_1__08057 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__1_in_rule__DecimalConstraint__Group_1__08060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DecimalConstraint__Group_1__0__Impl8088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__1__Impl_in_rule__DecimalConstraint__Group_1__18119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MinValueAssignment_1_1_in_rule__DecimalConstraint__Group_1__1__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__0__Impl_in_rule__DecimalConstraint__Group_2__08180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__1_in_rule__DecimalConstraint__Group_2__08183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DecimalConstraint__Group_2__0__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__1__Impl_in_rule__DecimalConstraint__Group_2__18242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MaxValueAssignment_2_1_in_rule__DecimalConstraint__Group_2__1__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__0__Impl_in_rule__DecimalConstraint__Group_3__08303 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__1_in_rule__DecimalConstraint__Group_3__08306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DecimalConstraint__Group_3__0__Impl8334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__1__Impl_in_rule__DecimalConstraint__Group_3__18365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MaxLenAssignment_3_1_in_rule__DecimalConstraint__Group_3__1__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__0__Impl_in_rule__DecimalConstraint__Group_4__08426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__1_in_rule__DecimalConstraint__Group_4__08429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DecimalConstraint__Group_4__0__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__1__Impl_in_rule__DecimalConstraint__Group_4__18488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__FixeLenAssignment_4_1_in_rule__DecimalConstraint__Group_4__1__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__0__Impl_in_rule__DecimalConstraint__Group_5__08549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__1_in_rule__DecimalConstraint__Group_5__08552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DecimalConstraint__Group_5__0__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__1__Impl_in_rule__DecimalConstraint__Group_5__18611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__PaddleAssignment_5_1_in_rule__DecimalConstraint__Group_5__1__Impl8638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__08672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Enumeration__Group__0__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__18734 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__18737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__28794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__28797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Enumeration__Group__2__Impl8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__38856 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__38859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl8888 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl8900 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__48933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Enumeration__Group__4__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__09002 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__09005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__19062 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__19065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl9092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__29122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EnumerationLiteral__Group__2__Impl9150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__09187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__09190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumerationLiteral__Group_1__0__Impl9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__19249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__09310 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__09313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__EnumerationConstraint__Group__0__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__19372 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__19375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__29432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__09496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__09499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_2_0_in_rule__EnumerationConstraint__Group_2__0__Impl9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__19556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl9583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_19653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_19684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_19715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_19746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_59777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_19808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_19839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_19874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_39909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_59940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_19971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_210002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_010033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_210064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_110095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_310126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_110161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_010196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_110227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_010262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypeRef__MultiAssignment_110302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TypeRef__OptionAssignment_210346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__BoolConstraint__ConstraintAssignment_010390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__BoolConstraint__HasDefaultAssignment_1_010434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__BoolConstraint__DefaultValueAssignment_1_1_010478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__StringConstraint__ConstraintAssignment_010522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__StringConstraint__HasDefaultAssignment_1_010566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__DefaultValueAssignment_1_110605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__MinLengthAssignment_2_110636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__MaxLengthAssignment_3_110667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__FixeLengthAssignment_4_110698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_5_110729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__DateTimeConstraint__ConstraintAssignment_010765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_110808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DateTimeConstraint__HasDefaultAssignment_2_010848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_110887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__IntegerConstraint__ConstraintAssignment_010923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__IntegerConstraint__HasDefaultAssignment_1_010967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__DefaultValueAssignment_1_111006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MinValueAssignment_2_111037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxValueAssignment_3_111068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxLenAssignment_4_111099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixeLenAssignment_5_111130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerConstraint__PaddleAssignment_6_111161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__DecimalConstraint__ConstraintAssignment_011197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MinValueAssignment_1_111236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxValueAssignment_2_111267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxLenAssignment_3_111298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__FixeLenAssignment_4_111329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalConstraint__PaddleAssignment_5_111360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_111391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_311422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_011453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_111484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_111515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__EnumerationConstraint__HasDefaultAssignment_2_011551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_2_111590 = new BitSet(new long[]{0x0000000000000002L});

}