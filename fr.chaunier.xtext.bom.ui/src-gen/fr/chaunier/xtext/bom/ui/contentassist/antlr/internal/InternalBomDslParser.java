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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DTD'", "'FLAT'", "'CSV'", "'DB'", "'false'", "'as String'", "'as bool String'", "'as Value'", "'as bool Value'", "'import'", "'package'", "'{'", "'}'", "'prefix'", "'namespace'", "'format'", "'delimiter'", "'lineSpec'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "';'", "'='", "'.*'", "'.'", "'minLen'", "'maxLen'", "'fixeLen'", "'regexp'", "'minVal'", "'maxVal'", "'paddle'", "'enum'", "'XSD'", "'*'", "'?'", "'boolean'", "'default'", "'true'", "'string'", "'fixed'", "'xsd Att.'", "'datetime'", "'integer'", "'decimal'"
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

                if ( ((LA1_0>=20 && LA1_0<=21)||(LA1_0>=29 && LA1_0<=30)||LA1_0==35) ) {
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:425:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:426:1: ( ruleParameter EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:427:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter842);
            ruleParameter();
            _fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter849); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:434:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:438:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:439:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:439:1: ( ( rule__Parameter__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:440:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:1: ( rule__Parameter__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:441:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter875);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:455:1: entryRuleTypeRef : ruleTypeRef EOF ;
    public final void entryRuleTypeRef() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:456:1: ( ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:457:1: ruleTypeRef EOF
            {
             before(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef904);
            ruleTypeRef();
            _fsp--;

             after(grammarAccess.getTypeRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef911); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:464:1: ruleTypeRef : ( ( rule__TypeRef__Group__0 ) ) ;
    public final void ruleTypeRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:468:2: ( ( ( rule__TypeRef__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:469:1: ( ( rule__TypeRef__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:469:1: ( ( rule__TypeRef__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:470:1: ( rule__TypeRef__Group__0 )
            {
             before(grammarAccess.getTypeRefAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:1: ( rule__TypeRef__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:471:2: rule__TypeRef__Group__0
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef937);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:483:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:484:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:485:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard964);
            ruleQualifiedNameWithWildCard();
            _fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard971); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:492:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:496:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:497:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:497:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:498:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:499:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard997);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:511:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:512:1: ( ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:513:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1024);
            ruleQualifiedName();
            _fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1031); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:520:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:524:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:525:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:525:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:526:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:1: ( rule__QualifiedName__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:527:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1057);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:539:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:540:1: ( ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:541:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint1084);
            ruleConstraint();
            _fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint1091); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:548:1: ruleConstraint : ( ( rule__Constraint__Alternatives ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:552:2: ( ( ( rule__Constraint__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:553:1: ( ( rule__Constraint__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:553:1: ( ( rule__Constraint__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:554:1: ( rule__Constraint__Alternatives )
            {
             before(grammarAccess.getConstraintAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:1: ( rule__Constraint__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:555:2: rule__Constraint__Alternatives
            {
            pushFollow(FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1117);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:567:1: entryRuleBoolConstraint : ruleBoolConstraint EOF ;
    public final void entryRuleBoolConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:568:1: ( ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:569:1: ruleBoolConstraint EOF
            {
             before(grammarAccess.getBoolConstraintRule()); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1144);
            ruleBoolConstraint();
            _fsp--;

             after(grammarAccess.getBoolConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint1151); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:576:1: ruleBoolConstraint : ( ( rule__BoolConstraint__Group__0 ) ) ;
    public final void ruleBoolConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:580:2: ( ( ( rule__BoolConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:581:1: ( ( rule__BoolConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:581:1: ( ( rule__BoolConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:582:1: ( rule__BoolConstraint__Group__0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:1: ( rule__BoolConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:583:2: rule__BoolConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__0_in_ruleBoolConstraint1177);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:595:1: entryRuleStringConstraint : ruleStringConstraint EOF ;
    public final void entryRuleStringConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:596:1: ( ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:597:1: ruleStringConstraint EOF
            {
             before(grammarAccess.getStringConstraintRule()); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1204);
            ruleStringConstraint();
            _fsp--;

             after(grammarAccess.getStringConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint1211); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:604:1: ruleStringConstraint : ( ( rule__StringConstraint__Group__0 ) ) ;
    public final void ruleStringConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:608:2: ( ( ( rule__StringConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:609:1: ( ( rule__StringConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:609:1: ( ( rule__StringConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:610:1: ( rule__StringConstraint__Group__0 )
            {
             before(grammarAccess.getStringConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:1: ( rule__StringConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:611:2: rule__StringConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1237);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:623:1: entryRuleDateTimeConstraint : ruleDateTimeConstraint EOF ;
    public final void entryRuleDateTimeConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:624:1: ( ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:625:1: ruleDateTimeConstraint EOF
            {
             before(grammarAccess.getDateTimeConstraintRule()); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1264);
            ruleDateTimeConstraint();
            _fsp--;

             after(grammarAccess.getDateTimeConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint1271); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:632:1: ruleDateTimeConstraint : ( ( rule__DateTimeConstraint__Group__0 ) ) ;
    public final void ruleDateTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:636:2: ( ( ( rule__DateTimeConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:637:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:637:1: ( ( rule__DateTimeConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:638:1: ( rule__DateTimeConstraint__Group__0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:1: ( rule__DateTimeConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:639:2: rule__DateTimeConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1297);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:651:1: entryRuleIntegerConstraint : ruleIntegerConstraint EOF ;
    public final void entryRuleIntegerConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:652:1: ( ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:653:1: ruleIntegerConstraint EOF
            {
             before(grammarAccess.getIntegerConstraintRule()); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1324);
            ruleIntegerConstraint();
            _fsp--;

             after(grammarAccess.getIntegerConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint1331); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:660:1: ruleIntegerConstraint : ( ( rule__IntegerConstraint__Group__0 ) ) ;
    public final void ruleIntegerConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:664:2: ( ( ( rule__IntegerConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:665:1: ( ( rule__IntegerConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:665:1: ( ( rule__IntegerConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:666:1: ( rule__IntegerConstraint__Group__0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:1: ( rule__IntegerConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:667:2: rule__IntegerConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1357);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:679:1: entryRuleDecimalConstraint : ruleDecimalConstraint EOF ;
    public final void entryRuleDecimalConstraint() throws RecognitionException {
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:680:1: ( ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:681:1: ruleDecimalConstraint EOF
            {
             before(grammarAccess.getDecimalConstraintRule()); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1384);
            ruleDecimalConstraint();
            _fsp--;

             after(grammarAccess.getDecimalConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint1391); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:688:1: ruleDecimalConstraint : ( ( rule__DecimalConstraint__Group__0 ) ) ;
    public final void ruleDecimalConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:692:2: ( ( ( rule__DecimalConstraint__Group__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:693:1: ( ( rule__DecimalConstraint__Group__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:693:1: ( ( rule__DecimalConstraint__Group__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:694:1: ( rule__DecimalConstraint__Group__0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:1: ( rule__DecimalConstraint__Group__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:695:2: rule__DecimalConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1417);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:736:1: ruleEnumUsage : ( ( rule__EnumUsage__Alternatives ) ) ;
    public final void ruleEnumUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:740:1: ( ( ( rule__EnumUsage__Alternatives ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:741:1: ( ( rule__EnumUsage__Alternatives ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:741:1: ( ( rule__EnumUsage__Alternatives ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:742:1: ( rule__EnumUsage__Alternatives )
            {
             before(grammarAccess.getEnumUsageAccess().getAlternatives()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:743:1: ( rule__EnumUsage__Alternatives )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:743:2: rule__EnumUsage__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1514);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:754:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:758:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 29:
            case 30:
            case 35:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("754:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:759:1: ( rulePackageDeclaration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:759:1: ( rulePackageDeclaration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:760:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1549);
                    rulePackageDeclaration();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:765:6: ( ruleType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:765:6: ( ruleType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:766:1: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1566);
                    ruleType();
                    _fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:771:6: ( ruleImport )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:771:6: ( ruleImport )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:772:1: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1583);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:782:1: rule__PackageDeclaration__Alternatives_5 : ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) );
    public final void rule__PackageDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:786:1: ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            case 13:
                {
                alt3=4;
                }
                break;
            case 14:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("782:1: rule__PackageDeclaration__Alternatives_5 : ( ( ( rule__PackageDeclaration__Group_5_0__0 ) ) | ( 'DTD' ) | ( 'FLAT' ) | ( 'CSV' ) | ( 'DB' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:787:1: ( ( rule__PackageDeclaration__Group_5_0__0 ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:787:1: ( ( rule__PackageDeclaration__Group_5_0__0 ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:788:1: ( rule__PackageDeclaration__Group_5_0__0 )
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getGroup_5_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:789:1: ( rule__PackageDeclaration__Group_5_0__0 )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:789:2: rule__PackageDeclaration__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__0_in_rule__PackageDeclaration__Alternatives_51615);
                    rule__PackageDeclaration__Group_5_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPackageDeclarationAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:793:6: ( 'DTD' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:793:6: ( 'DTD' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:794:1: 'DTD'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getDTDKeyword_5_1()); 
                    match(input,11,FOLLOW_11_in_rule__PackageDeclaration__Alternatives_51634); 
                     after(grammarAccess.getPackageDeclarationAccess().getDTDKeyword_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:801:6: ( 'FLAT' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:801:6: ( 'FLAT' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:802:1: 'FLAT'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getFLATKeyword_5_2()); 
                    match(input,12,FOLLOW_12_in_rule__PackageDeclaration__Alternatives_51654); 
                     after(grammarAccess.getPackageDeclarationAccess().getFLATKeyword_5_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:809:6: ( 'CSV' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:809:6: ( 'CSV' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:810:1: 'CSV'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getCSVKeyword_5_3()); 
                    match(input,13,FOLLOW_13_in_rule__PackageDeclaration__Alternatives_51674); 
                     after(grammarAccess.getPackageDeclarationAccess().getCSVKeyword_5_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:817:6: ( 'DB' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:817:6: ( 'DB' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:818:1: 'DB'
                    {
                     before(grammarAccess.getPackageDeclarationAccess().getDBKeyword_5_4()); 
                    match(input,14,FOLLOW_14_in_rule__PackageDeclaration__Alternatives_51694); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:830:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:834:1: ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("830:1: rule__Type__Alternatives : ( ( ruleEntity ) | ( ruleDataType ) | ( ruleEnumeration ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:835:1: ( ruleEntity )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:835:1: ( ruleEntity )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:836:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives1728);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:841:6: ( ruleDataType )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:841:6: ( ruleDataType )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:842:1: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataType_in_rule__Type__Alternatives1745);
                    ruleDataType();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:847:6: ( ruleEnumeration )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:847:6: ( ruleEnumeration )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:848:1: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1762);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:858:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );
    public final void rule__StructuralFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:862:1: ( ( ruleAttribute ) | ( ruleReference ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("858:1: rule__StructuralFeature__Alternatives : ( ( ruleAttribute ) | ( ruleReference ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:863:1: ( ruleAttribute )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:863:1: ( ruleAttribute )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:864:1: ruleAttribute
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1794);
                    ruleAttribute();
                    _fsp--;

                     after(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:869:6: ( ruleReference )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:869:6: ( ruleReference )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:870:1: ruleReference
                    {
                     before(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1811);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:881:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );
    public final void rule__Constraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:885:1: ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt6=1;
                }
                break;
            case 56:
                {
                alt6=2;
                }
                break;
            case 59:
                {
                alt6=3;
                }
                break;
            case 60:
                {
                alt6=4;
                }
                break;
            case 61:
                {
                alt6=5;
                }
                break;
            case 49:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("881:1: rule__Constraint__Alternatives : ( ( ruleBoolConstraint ) | ( ruleStringConstraint ) | ( ruleDateTimeConstraint ) | ( ruleIntegerConstraint ) | ( ruleDecimalConstraint ) | ( ruleEnumerationConstraint ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:886:1: ( ruleBoolConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:886:1: ( ruleBoolConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:887:1: ruleBoolConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1844);
                    ruleBoolConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:892:6: ( ruleStringConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:892:6: ( ruleStringConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:893:1: ruleStringConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1861);
                    ruleStringConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:898:6: ( ruleDateTimeConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:898:6: ( ruleDateTimeConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:899:1: ruleDateTimeConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1878);
                    ruleDateTimeConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:904:6: ( ruleIntegerConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:904:6: ( ruleIntegerConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:905:1: ruleIntegerConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives1895);
                    ruleIntegerConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:910:6: ( ruleDecimalConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:910:6: ( ruleDecimalConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:911:1: ruleDecimalConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1912);
                    ruleDecimalConstraint();
                    _fsp--;

                     after(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:916:6: ( ruleEnumerationConstraint )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:916:6: ( ruleEnumerationConstraint )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:917:1: ruleEnumerationConstraint
                    {
                     before(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1929);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:927:1: rule__BoolConstraint__Alternatives_1_1 : ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__BoolConstraint__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:931:1: ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==55) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("927:1: rule__BoolConstraint__Alternatives_1_1 : ( ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) ) | ( 'false' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:932:1: ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:932:1: ( ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:933:1: ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 )
                    {
                     before(grammarAccess.getBoolConstraintAccess().getDefaultValueAssignment_1_1_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:934:1: ( rule__BoolConstraint__DefaultValueAssignment_1_1_0 )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:934:2: rule__BoolConstraint__DefaultValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__BoolConstraint__DefaultValueAssignment_1_1_0_in_rule__BoolConstraint__Alternatives_1_11961);
                    rule__BoolConstraint__DefaultValueAssignment_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBoolConstraintAccess().getDefaultValueAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:938:6: ( 'false' )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:938:6: ( 'false' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:939:1: 'false'
                    {
                     before(grammarAccess.getBoolConstraintAccess().getFalseKeyword_1_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__BoolConstraint__Alternatives_1_11980); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:951:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) );
    public final void rule__EnumUsage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:955:1: ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("951:1: rule__EnumUsage__Alternatives : ( ( ( 'as String' ) ) | ( ( 'as bool String' ) ) | ( ( 'as Value' ) ) | ( ( 'as bool Value' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:956:1: ( ( 'as String' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:956:1: ( ( 'as String' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:957:1: ( 'as String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:958:1: ( 'as String' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:958:3: 'as String'
                    {
                    match(input,16,FOLLOW_16_in_rule__EnumUsage__Alternatives2015); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:963:6: ( ( 'as bool String' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:963:6: ( ( 'as bool String' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:964:1: ( 'as bool String' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:965:1: ( 'as bool String' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:965:3: 'as bool String'
                    {
                    match(input,17,FOLLOW_17_in_rule__EnumUsage__Alternatives2036); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:970:6: ( ( 'as Value' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:970:6: ( ( 'as Value' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:971:1: ( 'as Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:972:1: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:972:3: 'as Value'
                    {
                    match(input,18,FOLLOW_18_in_rule__EnumUsage__Alternatives2057); 

                    }

                     after(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:977:6: ( ( 'as bool Value' ) )
                    {
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:977:6: ( ( 'as bool Value' ) )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:978:1: ( 'as bool Value' )
                    {
                     before(grammarAccess.getEnumUsageAccess().getAsBoolValueEnumLiteralDeclaration_3()); 
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:979:1: ( 'as bool Value' )
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:979:3: 'as bool Value'
                    {
                    match(input,19,FOLLOW_19_in_rule__EnumUsage__Alternatives2078); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:991:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:995:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:996:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02111);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02114);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1003:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1007:1: ( ( 'import' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1008:1: ( 'import' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1008:1: ( 'import' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1009:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Import__Group__0__Impl2142); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1022:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1026:1: ( rule__Import__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1027:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12173);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1033:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1037:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1038:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1038:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1039:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1040:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1040:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2200);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1054:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1058:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1059:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02234);
            rule__PackageDeclaration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02237);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1066:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1070:1: ( ( 'package' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1071:1: ( 'package' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1071:1: ( 'package' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1072:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2265); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1085:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1089:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1090:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12296);
            rule__PackageDeclaration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12299);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1097:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1101:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1102:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1102:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1103:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1104:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1104:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2326);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1114:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1118:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1119:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22356);
            rule__PackageDeclaration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22359);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1126:1: rule__PackageDeclaration__Group__2__Impl : ( ( rule__PackageDeclaration__Group_2__0 ) ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1130:1: ( ( ( rule__PackageDeclaration__Group_2__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1131:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1131:1: ( ( rule__PackageDeclaration__Group_2__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1132:1: ( rule__PackageDeclaration__Group_2__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1133:1: ( rule__PackageDeclaration__Group_2__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1133:2: rule__PackageDeclaration__Group_2__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2386);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1143:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1147:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1148:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32416);
            rule__PackageDeclaration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32419);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1155:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__Group_3__0 ) ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1159:1: ( ( ( rule__PackageDeclaration__Group_3__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1160:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1160:1: ( ( rule__PackageDeclaration__Group_3__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1161:1: ( rule__PackageDeclaration__Group_3__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1162:1: ( rule__PackageDeclaration__Group_3__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1162:2: rule__PackageDeclaration__Group_3__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2446);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1172:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1176:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1177:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42476);
            rule__PackageDeclaration__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42479);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1184:1: rule__PackageDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1188:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1189:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1189:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1190:1: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__PackageDeclaration__Group__4__Impl2507); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1203:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1207:1: ( rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1208:2: rule__PackageDeclaration__Group__5__Impl rule__PackageDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52538);
            rule__PackageDeclaration__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52541);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1215:1: rule__PackageDeclaration__Group__5__Impl : ( ( rule__PackageDeclaration__Alternatives_5 )? ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1219:1: ( ( ( rule__PackageDeclaration__Alternatives_5 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1220:1: ( ( rule__PackageDeclaration__Alternatives_5 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1220:1: ( ( rule__PackageDeclaration__Alternatives_5 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1221:1: ( rule__PackageDeclaration__Alternatives_5 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getAlternatives_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1222:1: ( rule__PackageDeclaration__Alternatives_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=14)||LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1222:2: rule__PackageDeclaration__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Alternatives_5_in_rule__PackageDeclaration__Group__5__Impl2568);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1232:1: rule__PackageDeclaration__Group__6 : rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 ;
    public final void rule__PackageDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1236:1: ( rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1237:2: rule__PackageDeclaration__Group__6__Impl rule__PackageDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62599);
            rule__PackageDeclaration__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62602);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1244:1: rule__PackageDeclaration__Group__6__Impl : ( ( rule__PackageDeclaration__Group_6__0 )? ) ;
    public final void rule__PackageDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1248:1: ( ( ( rule__PackageDeclaration__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1249:1: ( ( rule__PackageDeclaration__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1249:1: ( ( rule__PackageDeclaration__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1250:1: ( rule__PackageDeclaration__Group_6__0 )?
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1251:1: ( rule__PackageDeclaration__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1251:2: rule__PackageDeclaration__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__0_in_rule__PackageDeclaration__Group__6__Impl2629);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1261:1: rule__PackageDeclaration__Group__7 : rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8 ;
    public final void rule__PackageDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1265:1: ( rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1266:2: rule__PackageDeclaration__Group__7__Impl rule__PackageDeclaration__Group__8
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72660);
            rule__PackageDeclaration__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__8_in_rule__PackageDeclaration__Group__72663);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1273:1: rule__PackageDeclaration__Group__7__Impl : ( ( rule__PackageDeclaration__Group_7__0 )* ) ;
    public final void rule__PackageDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1277:1: ( ( ( rule__PackageDeclaration__Group_7__0 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1278:1: ( ( rule__PackageDeclaration__Group_7__0 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1278:1: ( ( rule__PackageDeclaration__Group_7__0 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1279:1: ( rule__PackageDeclaration__Group_7__0 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1280:1: ( rule__PackageDeclaration__Group_7__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1280:2: rule__PackageDeclaration__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__0_in_rule__PackageDeclaration__Group__7__Impl2690);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1290:1: rule__PackageDeclaration__Group__8 : rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9 ;
    public final void rule__PackageDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1294:1: ( rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1295:2: rule__PackageDeclaration__Group__8__Impl rule__PackageDeclaration__Group__9
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__8__Impl_in_rule__PackageDeclaration__Group__82721);
            rule__PackageDeclaration__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__9_in_rule__PackageDeclaration__Group__82724);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1302:1: rule__PackageDeclaration__Group__8__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_8 )* ) ;
    public final void rule__PackageDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1306:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_8 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1307:1: ( ( rule__PackageDeclaration__ElementsAssignment_8 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1307:1: ( ( rule__PackageDeclaration__ElementsAssignment_8 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1308:1: ( rule__PackageDeclaration__ElementsAssignment_8 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1309:1: ( rule__PackageDeclaration__ElementsAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=21)||(LA12_0>=29 && LA12_0<=30)||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1309:2: rule__PackageDeclaration__ElementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__PackageDeclaration__ElementsAssignment_8_in_rule__PackageDeclaration__Group__8__Impl2751);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1319:1: rule__PackageDeclaration__Group__9 : rule__PackageDeclaration__Group__9__Impl ;
    public final void rule__PackageDeclaration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1323:1: ( rule__PackageDeclaration__Group__9__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1324:2: rule__PackageDeclaration__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__9__Impl_in_rule__PackageDeclaration__Group__92782);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1330:1: rule__PackageDeclaration__Group__9__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1334:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1335:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1335:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1336:1: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__PackageDeclaration__Group__9__Impl2810); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1369:1: rule__PackageDeclaration__Group_2__0 : rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 ;
    public final void rule__PackageDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1373:1: ( rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1374:2: rule__PackageDeclaration__Group_2__0__Impl rule__PackageDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__02861);
            rule__PackageDeclaration__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__02864);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1381:1: rule__PackageDeclaration__Group_2__0__Impl : ( 'prefix' ) ;
    public final void rule__PackageDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1385:1: ( ( 'prefix' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1386:1: ( 'prefix' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1386:1: ( 'prefix' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1387:1: 'prefix'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__PackageDeclaration__Group_2__0__Impl2892); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1400:1: rule__PackageDeclaration__Group_2__1 : rule__PackageDeclaration__Group_2__1__Impl ;
    public final void rule__PackageDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1404:1: ( rule__PackageDeclaration__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1405:2: rule__PackageDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12923);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1411:1: rule__PackageDeclaration__Group_2__1__Impl : ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) ;
    public final void rule__PackageDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1415:1: ( ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1416:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1416:1: ( ( rule__PackageDeclaration__PrefixAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1417:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1418:1: ( rule__PackageDeclaration__PrefixAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1418:2: rule__PackageDeclaration__PrefixAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl2950);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1432:1: rule__PackageDeclaration__Group_3__0 : rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 ;
    public final void rule__PackageDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1436:1: ( rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1437:2: rule__PackageDeclaration__Group_3__0__Impl rule__PackageDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02984);
            rule__PackageDeclaration__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02987);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1444:1: rule__PackageDeclaration__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__PackageDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1448:1: ( ( 'namespace' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1449:1: ( 'namespace' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1449:1: ( 'namespace' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1450:1: 'namespace'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__PackageDeclaration__Group_3__0__Impl3015); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1463:1: rule__PackageDeclaration__Group_3__1 : rule__PackageDeclaration__Group_3__1__Impl ;
    public final void rule__PackageDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1467:1: ( rule__PackageDeclaration__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1468:2: rule__PackageDeclaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13046);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1474:1: rule__PackageDeclaration__Group_3__1__Impl : ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) ;
    public final void rule__PackageDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1478:1: ( ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1479:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1479:1: ( ( rule__PackageDeclaration__NamespaceAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1480:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1481:1: ( rule__PackageDeclaration__NamespaceAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1481:2: rule__PackageDeclaration__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3073);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1495:1: rule__PackageDeclaration__Group_5_0__0 : rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1 ;
    public final void rule__PackageDeclaration__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1499:1: ( rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1500:2: rule__PackageDeclaration__Group_5_0__0__Impl rule__PackageDeclaration__Group_5_0__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__0__Impl_in_rule__PackageDeclaration__Group_5_0__03107);
            rule__PackageDeclaration__Group_5_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__1_in_rule__PackageDeclaration__Group_5_0__03110);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1507:1: rule__PackageDeclaration__Group_5_0__0__Impl : ( 'format' ) ;
    public final void rule__PackageDeclaration__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1511:1: ( ( 'format' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1512:1: ( 'format' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1512:1: ( 'format' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1513:1: 'format'
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatKeyword_5_0_0()); 
            match(input,26,FOLLOW_26_in_rule__PackageDeclaration__Group_5_0__0__Impl3138); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1526:1: rule__PackageDeclaration__Group_5_0__1 : rule__PackageDeclaration__Group_5_0__1__Impl ;
    public final void rule__PackageDeclaration__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1530:1: ( rule__PackageDeclaration__Group_5_0__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1531:2: rule__PackageDeclaration__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_5_0__1__Impl_in_rule__PackageDeclaration__Group_5_0__13169);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1537:1: rule__PackageDeclaration__Group_5_0__1__Impl : ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) ) ;
    public final void rule__PackageDeclaration__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1541:1: ( ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1542:1: ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1542:1: ( ( rule__PackageDeclaration__FormatAssignment_5_0_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1543:1: ( rule__PackageDeclaration__FormatAssignment_5_0_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatAssignment_5_0_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1544:1: ( rule__PackageDeclaration__FormatAssignment_5_0_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1544:2: rule__PackageDeclaration__FormatAssignment_5_0_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__FormatAssignment_5_0_1_in_rule__PackageDeclaration__Group_5_0__1__Impl3196);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1558:1: rule__PackageDeclaration__Group_6__0 : rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1 ;
    public final void rule__PackageDeclaration__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1562:1: ( rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1563:2: rule__PackageDeclaration__Group_6__0__Impl rule__PackageDeclaration__Group_6__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__0__Impl_in_rule__PackageDeclaration__Group_6__03230);
            rule__PackageDeclaration__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__1_in_rule__PackageDeclaration__Group_6__03233);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1570:1: rule__PackageDeclaration__Group_6__0__Impl : ( 'delimiter' ) ;
    public final void rule__PackageDeclaration__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1574:1: ( ( 'delimiter' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1575:1: ( 'delimiter' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1575:1: ( 'delimiter' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1576:1: 'delimiter'
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterKeyword_6_0()); 
            match(input,27,FOLLOW_27_in_rule__PackageDeclaration__Group_6__0__Impl3261); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1589:1: rule__PackageDeclaration__Group_6__1 : rule__PackageDeclaration__Group_6__1__Impl ;
    public final void rule__PackageDeclaration__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1593:1: ( rule__PackageDeclaration__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1594:2: rule__PackageDeclaration__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_6__1__Impl_in_rule__PackageDeclaration__Group_6__13292);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1600:1: rule__PackageDeclaration__Group_6__1__Impl : ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) ) ;
    public final void rule__PackageDeclaration__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1604:1: ( ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1605:1: ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1605:1: ( ( rule__PackageDeclaration__DelimiterAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1606:1: ( rule__PackageDeclaration__DelimiterAssignment_6_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1607:1: ( rule__PackageDeclaration__DelimiterAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1607:2: rule__PackageDeclaration__DelimiterAssignment_6_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__DelimiterAssignment_6_1_in_rule__PackageDeclaration__Group_6__1__Impl3319);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1621:1: rule__PackageDeclaration__Group_7__0 : rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1 ;
    public final void rule__PackageDeclaration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1625:1: ( rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1626:2: rule__PackageDeclaration__Group_7__0__Impl rule__PackageDeclaration__Group_7__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__0__Impl_in_rule__PackageDeclaration__Group_7__03353);
            rule__PackageDeclaration__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__1_in_rule__PackageDeclaration__Group_7__03356);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1633:1: rule__PackageDeclaration__Group_7__0__Impl : ( 'lineSpec' ) ;
    public final void rule__PackageDeclaration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1637:1: ( ( 'lineSpec' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1638:1: ( 'lineSpec' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1638:1: ( 'lineSpec' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1639:1: 'lineSpec'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLineSpecKeyword_7_0()); 
            match(input,28,FOLLOW_28_in_rule__PackageDeclaration__Group_7__0__Impl3384); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1652:1: rule__PackageDeclaration__Group_7__1 : rule__PackageDeclaration__Group_7__1__Impl ;
    public final void rule__PackageDeclaration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1656:1: ( rule__PackageDeclaration__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1657:2: rule__PackageDeclaration__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group_7__1__Impl_in_rule__PackageDeclaration__Group_7__13415);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1663:1: rule__PackageDeclaration__Group_7__1__Impl : ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) ) ;
    public final void rule__PackageDeclaration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1667:1: ( ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1668:1: ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1668:1: ( ( rule__PackageDeclaration__LinesAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1669:1: ( rule__PackageDeclaration__LinesAssignment_7_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getLinesAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1670:1: ( rule__PackageDeclaration__LinesAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1670:2: rule__PackageDeclaration__LinesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__LinesAssignment_7_1_in_rule__PackageDeclaration__Group_7__1__Impl3442);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1684:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1688:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1689:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03476);
            rule__DataType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03479);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1696:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1700:1: ( ( 'datatype' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1701:1: ( 'datatype' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1701:1: ( 'datatype' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1702:1: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__DataType__Group__0__Impl3507); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1715:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1719:1: ( rule__DataType__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1720:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13538);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1726:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1730:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1731:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1731:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1732:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1733:1: ( rule__DataType__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1733:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3565);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1747:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1751:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1752:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03599);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03602);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1759:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1763:1: ( ( 'entity' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1764:1: ( 'entity' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1764:1: ( 'entity' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1765:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Entity__Group__0__Impl3630); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1778:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1782:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1783:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13661);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13664);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1790:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1794:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1795:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1795:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1796:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1797:1: ( rule__Entity__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1797:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3691);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1807:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1811:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1812:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23721);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23724);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1819:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1823:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1824:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1824:1: ( ( rule__Entity__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1825:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1826:1: ( rule__Entity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1826:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3751);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1836:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1840:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1841:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33782);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33785);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1848:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__DescriptionAssignment_3 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1852:1: ( ( ( rule__Entity__DescriptionAssignment_3 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1853:1: ( ( rule__Entity__DescriptionAssignment_3 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1853:1: ( ( rule__Entity__DescriptionAssignment_3 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1854:1: ( rule__Entity__DescriptionAssignment_3 )?
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1855:1: ( rule__Entity__DescriptionAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1855:2: rule__Entity__DescriptionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Entity__DescriptionAssignment_3_in_rule__Entity__Group__3__Impl3812);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1865:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1869:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1870:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43843);
            rule__Entity__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43846);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1877:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1881:1: ( ( '{' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1882:1: ( '{' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1882:1: ( '{' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1883:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group__4__Impl3874); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1896:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1900:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1901:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53905);
            rule__Entity__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53908);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1908:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__FeaturesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1912:1: ( ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1913:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1913:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1914:1: ( rule__Entity__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1915:1: ( rule__Entity__FeaturesAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1915:2: rule__Entity__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_5_in_rule__Entity__Group__5__Impl3935);
            	    rule__Entity__FeaturesAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1925:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1929:1: ( rule__Entity__Group__6__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1930:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63966);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1936:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1940:1: ( ( '}' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1941:1: ( '}' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1941:1: ( '}' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1942:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Entity__Group__6__Impl3994); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1969:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1973:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1974:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__04039);
            rule__Entity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__04042);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1981:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1985:1: ( ( 'extends' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1986:1: ( 'extends' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1986:1: ( 'extends' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:1987:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Entity__Group_2__0__Impl4070); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2000:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2004:1: ( rule__Entity__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2005:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__14101);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2011:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2015:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2016:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2016:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2017:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2018:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2018:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl4128);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2032:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2036:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2037:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04162);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04165);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2044:1: rule__Feature__Group__0__Impl : ( ruleStructuralFeature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2048:1: ( ( ruleStructuralFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2049:1: ( ruleStructuralFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2049:1: ( ruleStructuralFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2050:1: ruleStructuralFeature
            {
             before(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4192);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2061:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2065:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2066:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14221);
            rule__Feature__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14224);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2073:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ConstraintAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2077:1: ( ( ( rule__Feature__ConstraintAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2078:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2078:1: ( ( rule__Feature__ConstraintAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2079:1: ( rule__Feature__ConstraintAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getConstraintAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2080:1: ( rule__Feature__ConstraintAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49||LA16_0==53||LA16_0==56||(LA16_0>=59 && LA16_0<=61)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2080:2: rule__Feature__ConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4251);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2090:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2094:1: ( rule__Feature__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2095:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24282);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2101:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__DescriptionAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2105:1: ( ( ( rule__Feature__DescriptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2106:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2106:1: ( ( rule__Feature__DescriptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2107:1: ( rule__Feature__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getDescriptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2108:1: ( rule__Feature__DescriptionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2108:2: rule__Feature__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4309);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2124:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2128:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2129:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04346);
            rule__Attribute__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04349);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2136:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2140:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2141:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2141:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2142:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2143:1: ( rule__Attribute__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2143:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4376);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2153:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2157:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2158:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14406);
            rule__Attribute__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14409);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2165:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2169:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2170:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2170:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2171:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Attribute__Group__1__Impl4437); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2184:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2188:1: ( rule__Attribute__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2189:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24468);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2195:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2199:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2200:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2200:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2201:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2202:1: ( rule__Attribute__TypeAssignment_2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2202:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl4495);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2218:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2222:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2223:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04531);
            rule__Reference__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04534);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2230:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2234:1: ( ( 'ref' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2235:1: ( 'ref' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2235:1: ( 'ref' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2236:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Reference__Group__0__Impl4562); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2249:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2253:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2254:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14593);
            rule__Reference__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14596);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2261:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__NameAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2265:1: ( ( ( rule__Reference__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2266:1: ( ( rule__Reference__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2266:1: ( ( rule__Reference__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2267:1: ( rule__Reference__NameAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2268:1: ( rule__Reference__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2268:2: rule__Reference__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl4623);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2278:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2282:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2283:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24653);
            rule__Reference__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24656);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2290:1: rule__Reference__Group__2__Impl : ( ':' ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2294:1: ( ( ':' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2295:1: ( ':' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2295:1: ( ':' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2296:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Reference__Group__2__Impl4684); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2309:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2313:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2314:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34715);
            rule__Reference__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34718);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2321:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__TypeAssignment_3 ) ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2325:1: ( ( ( rule__Reference__TypeAssignment_3 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2326:1: ( ( rule__Reference__TypeAssignment_3 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2326:1: ( ( rule__Reference__TypeAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2327:1: ( rule__Reference__TypeAssignment_3 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2328:1: ( rule__Reference__TypeAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2328:2: rule__Reference__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4745);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2338:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2342:1: ( rule__Reference__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2343:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44775);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2349:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2353:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2354:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2354:1: ( ( rule__Reference__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2355:1: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2356:1: ( rule__Reference__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2356:2: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl4802);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2376:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2380:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2381:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__04843);
            rule__Reference__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__04846);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2388:1: rule__Reference__Group_4__0__Impl : ( 'opposite' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2392:1: ( ( 'opposite' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2393:1: ( 'opposite' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2393:1: ( 'opposite' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2394:1: 'opposite'
            {
             before(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__Reference__Group_4__0__Impl4874); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2407:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2411:1: ( rule__Reference__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2412:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__14905);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2418:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__OppositeAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2422:1: ( ( ( rule__Reference__OppositeAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2423:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2423:1: ( ( rule__Reference__OppositeAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2424:1: ( rule__Reference__OppositeAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getOppositeAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2425:1: ( rule__Reference__OppositeAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2425:2: rule__Reference__OppositeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl4932);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2439:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2443:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2444:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04966);
            rule__Enumeration__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04969);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2451:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2455:1: ( ( 'enumeration' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2456:1: ( 'enumeration' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2456:1: ( 'enumeration' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2457:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Enumeration__Group__0__Impl4997); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2470:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2474:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2475:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15028);
            rule__Enumeration__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15031);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2482:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2486:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2487:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2487:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2488:1: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2489:1: ( rule__Enumeration__NameAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2489:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5058);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2499:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2503:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2504:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25088);
            rule__Enumeration__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25091);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2511:1: rule__Enumeration__Group__2__Impl : ( '[' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2515:1: ( ( '[' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2516:1: ( '[' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2516:1: ( '[' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2517:1: '['
            {
             before(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Enumeration__Group__2__Impl5119); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2530:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2534:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2535:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35150);
            rule__Enumeration__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35153);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2542:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2546:1: ( ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2547:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2547:1: ( ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2548:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) ) ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2548:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2549:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2550:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2550:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            {
            pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5182);
            rule__Enumeration__EnumerationLiteralsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 

            }

            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2553:1: ( ( rule__Enumeration__EnumerationLiteralsAssignment_3 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2554:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsAssignment_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2555:1: ( rule__Enumeration__EnumerationLiteralsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2555:2: rule__Enumeration__EnumerationLiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5194);
            	    rule__Enumeration__EnumerationLiteralsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2566:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2570:1: ( rule__Enumeration__Group__4__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2571:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45227);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2577:1: rule__Enumeration__Group__4__Impl : ( ']' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2581:1: ( ( ']' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2582:1: ( ']' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2582:1: ( ']' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2583:1: ']'
            {
             before(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4()); 
            match(input,37,FOLLOW_37_in_rule__Enumeration__Group__4__Impl5255); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2606:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2610:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2611:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05296);
            rule__EnumerationLiteral__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05299);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2618:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2622:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2623:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2623:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2624:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2625:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2625:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5326);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2635:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2639:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2640:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15356);
            rule__EnumerationLiteral__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15359);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2647:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__Group_1__0 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2651:1: ( ( ( rule__EnumerationLiteral__Group_1__0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2652:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2652:1: ( ( rule__EnumerationLiteral__Group_1__0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2653:1: ( rule__EnumerationLiteral__Group_1__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2654:1: ( rule__EnumerationLiteral__Group_1__0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2654:2: rule__EnumerationLiteral__Group_1__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5386);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2664:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2668:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2669:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25416);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2675:1: rule__EnumerationLiteral__Group__2__Impl : ( ';' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2679:1: ( ( ';' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2680:1: ( ';' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2680:1: ( ';' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2681:1: ';'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__EnumerationLiteral__Group__2__Impl5444); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2700:1: rule__EnumerationLiteral__Group_1__0 : rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 ;
    public final void rule__EnumerationLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2704:1: ( rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2705:2: rule__EnumerationLiteral__Group_1__0__Impl rule__EnumerationLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05481);
            rule__EnumerationLiteral__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05484);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2712:1: rule__EnumerationLiteral__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2716:1: ( ( '=' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2717:1: ( '=' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2717:1: ( '=' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2718:1: '='
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__EnumerationLiteral__Group_1__0__Impl5512); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2731:1: rule__EnumerationLiteral__Group_1__1 : rule__EnumerationLiteral__Group_1__1__Impl ;
    public final void rule__EnumerationLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2735:1: ( rule__EnumerationLiteral__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2736:2: rule__EnumerationLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15543);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2742:1: rule__EnumerationLiteral__Group_1__1__Impl : ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2746:1: ( ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2747:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2747:1: ( ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2748:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2749:1: ( rule__EnumerationLiteral__PersistedValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2749:2: rule__EnumerationLiteral__PersistedValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5570);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2763:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2767:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2768:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05604);
            rule__Parameter__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05607);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2775:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2779:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2780:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2780:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2781:1: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2782:1: ( rule__Parameter__NameAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2782:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl5634);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2792:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2796:1: ( rule__Parameter__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2797:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15664);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2803:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TypeAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2807:1: ( ( ( rule__Parameter__TypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2808:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2808:1: ( ( rule__Parameter__TypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2809:1: ( rule__Parameter__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2810:1: ( rule__Parameter__TypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2810:2: rule__Parameter__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl5691);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2824:1: rule__TypeRef__Group__0 : rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 ;
    public final void rule__TypeRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2828:1: ( rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2829:2: rule__TypeRef__Group__0__Impl rule__TypeRef__Group__1
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05725);
            rule__TypeRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05728);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2836:1: rule__TypeRef__Group__0__Impl : ( ( rule__TypeRef__ReferencedAssignment_0 ) ) ;
    public final void rule__TypeRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2840:1: ( ( ( rule__TypeRef__ReferencedAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2841:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2841:1: ( ( rule__TypeRef__ReferencedAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2842:1: ( rule__TypeRef__ReferencedAssignment_0 )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2843:1: ( rule__TypeRef__ReferencedAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2843:2: rule__TypeRef__ReferencedAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl5755);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2853:1: rule__TypeRef__Group__1 : rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 ;
    public final void rule__TypeRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2857:1: ( rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2858:2: rule__TypeRef__Group__1__Impl rule__TypeRef__Group__2
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__15785);
            rule__TypeRef__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__15788);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2865:1: rule__TypeRef__Group__1__Impl : ( ( rule__TypeRef__MultiAssignment_1 )? ) ;
    public final void rule__TypeRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2869:1: ( ( ( rule__TypeRef__MultiAssignment_1 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2870:1: ( ( rule__TypeRef__MultiAssignment_1 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2871:1: ( rule__TypeRef__MultiAssignment_1 )?
            {
             before(grammarAccess.getTypeRefAccess().getMultiAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2872:1: ( rule__TypeRef__MultiAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2872:2: rule__TypeRef__MultiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl5815);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2882:1: rule__TypeRef__Group__2 : rule__TypeRef__Group__2__Impl ;
    public final void rule__TypeRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2886:1: ( rule__TypeRef__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2887:2: rule__TypeRef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__25846);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2893:1: rule__TypeRef__Group__2__Impl : ( ( rule__TypeRef__OptionAssignment_2 )? ) ;
    public final void rule__TypeRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2897:1: ( ( ( rule__TypeRef__OptionAssignment_2 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2898:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2898:1: ( ( rule__TypeRef__OptionAssignment_2 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2899:1: ( rule__TypeRef__OptionAssignment_2 )?
            {
             before(grammarAccess.getTypeRefAccess().getOptionAssignment_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2900:1: ( rule__TypeRef__OptionAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2900:2: rule__TypeRef__OptionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl5873);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2916:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2920:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2921:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__05910);
            rule__QualifiedNameWithWildCard__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__05913);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2928:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2932:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2933:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2933:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2934:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl5940);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2945:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2949:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2950:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__15969);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2956:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2960:1: ( ( ( '.*' )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2961:1: ( ( '.*' )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2961:1: ( ( '.*' )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2962:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2963:1: ( '.*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2964:2: '.*'
                    {
                    match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildCard__Group__1__Impl5998); 

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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2979:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2983:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2984:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06035);
            rule__QualifiedName__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06038);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2991:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2995:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2996:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:2997:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6065); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3008:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3012:1: ( rule__QualifiedName__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3013:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16094);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3019:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3023:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3024:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3024:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3025:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3026:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3026:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6121);
            	    rule__QualifiedName__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3040:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3044:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3045:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06156);
            rule__QualifiedName__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06159);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3052:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3056:1: ( ( '.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3057:1: ( '.' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3057:1: ( '.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3058:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__QualifiedName__Group_1__0__Impl6187); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3071:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3075:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3076:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16218);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3082:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3086:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3087:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3087:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3088:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6245); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3103:1: rule__BoolConstraint__Group__0 : rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1 ;
    public final void rule__BoolConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3107:1: ( rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3108:2: rule__BoolConstraint__Group__0__Impl rule__BoolConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__0__Impl_in_rule__BoolConstraint__Group__06278);
            rule__BoolConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolConstraint__Group__1_in_rule__BoolConstraint__Group__06281);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3115:1: rule__BoolConstraint__Group__0__Impl : ( ( rule__BoolConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__BoolConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3119:1: ( ( ( rule__BoolConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3120:1: ( ( rule__BoolConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3120:1: ( ( rule__BoolConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3121:1: ( rule__BoolConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3122:1: ( rule__BoolConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3122:2: rule__BoolConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__ConstraintAssignment_0_in_rule__BoolConstraint__Group__0__Impl6308);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3132:1: rule__BoolConstraint__Group__1 : rule__BoolConstraint__Group__1__Impl ;
    public final void rule__BoolConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3136:1: ( rule__BoolConstraint__Group__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3137:2: rule__BoolConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group__1__Impl_in_rule__BoolConstraint__Group__16338);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3143:1: rule__BoolConstraint__Group__1__Impl : ( ( rule__BoolConstraint__Group_1__0 )? ) ;
    public final void rule__BoolConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3147:1: ( ( ( rule__BoolConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3148:1: ( ( rule__BoolConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3148:1: ( ( rule__BoolConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3149:1: ( rule__BoolConstraint__Group_1__0 )?
            {
             before(grammarAccess.getBoolConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3150:1: ( rule__BoolConstraint__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3150:2: rule__BoolConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__BoolConstraint__Group_1__0_in_rule__BoolConstraint__Group__1__Impl6365);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3164:1: rule__BoolConstraint__Group_1__0 : rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1 ;
    public final void rule__BoolConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3168:1: ( rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3169:2: rule__BoolConstraint__Group_1__0__Impl rule__BoolConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__0__Impl_in_rule__BoolConstraint__Group_1__06400);
            rule__BoolConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__1_in_rule__BoolConstraint__Group_1__06403);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3176:1: rule__BoolConstraint__Group_1__0__Impl : ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__BoolConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3180:1: ( ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3181:1: ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3181:1: ( ( rule__BoolConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3182:1: ( rule__BoolConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3183:1: ( rule__BoolConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3183:2: rule__BoolConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BoolConstraint__HasDefaultAssignment_1_0_in_rule__BoolConstraint__Group_1__0__Impl6430);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3193:1: rule__BoolConstraint__Group_1__1 : rule__BoolConstraint__Group_1__1__Impl ;
    public final void rule__BoolConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3197:1: ( rule__BoolConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3198:2: rule__BoolConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Group_1__1__Impl_in_rule__BoolConstraint__Group_1__16460);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3204:1: rule__BoolConstraint__Group_1__1__Impl : ( ( rule__BoolConstraint__Alternatives_1_1 ) ) ;
    public final void rule__BoolConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3208:1: ( ( ( rule__BoolConstraint__Alternatives_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3209:1: ( ( rule__BoolConstraint__Alternatives_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3209:1: ( ( rule__BoolConstraint__Alternatives_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3210:1: ( rule__BoolConstraint__Alternatives_1_1 )
            {
             before(grammarAccess.getBoolConstraintAccess().getAlternatives_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3211:1: ( rule__BoolConstraint__Alternatives_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3211:2: rule__BoolConstraint__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__BoolConstraint__Alternatives_1_1_in_rule__BoolConstraint__Group_1__1__Impl6487);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3225:1: rule__StringConstraint__Group__0 : rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 ;
    public final void rule__StringConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3229:1: ( rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3230:2: rule__StringConstraint__Group__0__Impl rule__StringConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__06521);
            rule__StringConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__06524);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3237:1: rule__StringConstraint__Group__0__Impl : ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__StringConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3241:1: ( ( ( rule__StringConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3242:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3242:1: ( ( rule__StringConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3243:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3244:1: ( rule__StringConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3244:2: rule__StringConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl6551);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3254:1: rule__StringConstraint__Group__1 : rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 ;
    public final void rule__StringConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3258:1: ( rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3259:2: rule__StringConstraint__Group__1__Impl rule__StringConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__16581);
            rule__StringConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__16584);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3266:1: rule__StringConstraint__Group__1__Impl : ( ( rule__StringConstraint__Group_1__0 )? ) ;
    public final void rule__StringConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3270:1: ( ( ( rule__StringConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3271:1: ( ( rule__StringConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3271:1: ( ( rule__StringConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3272:1: ( rule__StringConstraint__Group_1__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3273:1: ( rule__StringConstraint__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3273:2: rule__StringConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_1__0_in_rule__StringConstraint__Group__1__Impl6611);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3283:1: rule__StringConstraint__Group__2 : rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3 ;
    public final void rule__StringConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3287:1: ( rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3288:2: rule__StringConstraint__Group__2__Impl rule__StringConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__26642);
            rule__StringConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__3_in_rule__StringConstraint__Group__26645);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3295:1: rule__StringConstraint__Group__2__Impl : ( ( rule__StringConstraint__Group_2__0 )? ) ;
    public final void rule__StringConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3299:1: ( ( ( rule__StringConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3300:1: ( ( rule__StringConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3300:1: ( ( rule__StringConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3301:1: ( rule__StringConstraint__Group_2__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3302:1: ( rule__StringConstraint__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3302:2: rule__StringConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl6672);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3312:1: rule__StringConstraint__Group__3 : rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4 ;
    public final void rule__StringConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3316:1: ( rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3317:2: rule__StringConstraint__Group__3__Impl rule__StringConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__3__Impl_in_rule__StringConstraint__Group__36703);
            rule__StringConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__4_in_rule__StringConstraint__Group__36706);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3324:1: rule__StringConstraint__Group__3__Impl : ( ( rule__StringConstraint__Group_3__0 )? ) ;
    public final void rule__StringConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3328:1: ( ( ( rule__StringConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3329:1: ( ( rule__StringConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3329:1: ( ( rule__StringConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3330:1: ( rule__StringConstraint__Group_3__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3331:1: ( rule__StringConstraint__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3331:2: rule__StringConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_3__0_in_rule__StringConstraint__Group__3__Impl6733);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3341:1: rule__StringConstraint__Group__4 : rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5 ;
    public final void rule__StringConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3345:1: ( rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3346:2: rule__StringConstraint__Group__4__Impl rule__StringConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__4__Impl_in_rule__StringConstraint__Group__46764);
            rule__StringConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__5_in_rule__StringConstraint__Group__46767);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3353:1: rule__StringConstraint__Group__4__Impl : ( ( rule__StringConstraint__Group_4__0 )? ) ;
    public final void rule__StringConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3357:1: ( ( ( rule__StringConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3358:1: ( ( rule__StringConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3358:1: ( ( rule__StringConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3359:1: ( rule__StringConstraint__Group_4__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3360:1: ( rule__StringConstraint__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3360:2: rule__StringConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_4__0_in_rule__StringConstraint__Group__4__Impl6794);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3370:1: rule__StringConstraint__Group__5 : rule__StringConstraint__Group__5__Impl rule__StringConstraint__Group__6 ;
    public final void rule__StringConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3374:1: ( rule__StringConstraint__Group__5__Impl rule__StringConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3375:2: rule__StringConstraint__Group__5__Impl rule__StringConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__5__Impl_in_rule__StringConstraint__Group__56825);
            rule__StringConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__6_in_rule__StringConstraint__Group__56828);
            rule__StringConstraint__Group__6();
            _fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3382:1: rule__StringConstraint__Group__5__Impl : ( ( rule__StringConstraint__Group_5__0 )? ) ;
    public final void rule__StringConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3386:1: ( ( ( rule__StringConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3387:1: ( ( rule__StringConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3387:1: ( ( rule__StringConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3388:1: ( rule__StringConstraint__Group_5__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3389:1: ( rule__StringConstraint__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3389:2: rule__StringConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_5__0_in_rule__StringConstraint__Group__5__Impl6855);
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


    // $ANTLR start rule__StringConstraint__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3399:1: rule__StringConstraint__Group__6 : rule__StringConstraint__Group__6__Impl rule__StringConstraint__Group__7 ;
    public final void rule__StringConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3403:1: ( rule__StringConstraint__Group__6__Impl rule__StringConstraint__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3404:2: rule__StringConstraint__Group__6__Impl rule__StringConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__6__Impl_in_rule__StringConstraint__Group__66886);
            rule__StringConstraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group__7_in_rule__StringConstraint__Group__66889);
            rule__StringConstraint__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__6


    // $ANTLR start rule__StringConstraint__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3411:1: rule__StringConstraint__Group__6__Impl : ( ( rule__StringConstraint__IsXSDAttAssignment_6 )? ) ;
    public final void rule__StringConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3415:1: ( ( ( rule__StringConstraint__IsXSDAttAssignment_6 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3416:1: ( ( rule__StringConstraint__IsXSDAttAssignment_6 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3416:1: ( ( rule__StringConstraint__IsXSDAttAssignment_6 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3417:1: ( rule__StringConstraint__IsXSDAttAssignment_6 )?
            {
             before(grammarAccess.getStringConstraintAccess().getIsXSDAttAssignment_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3418:1: ( rule__StringConstraint__IsXSDAttAssignment_6 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==58) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3418:2: rule__StringConstraint__IsXSDAttAssignment_6
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__IsXSDAttAssignment_6_in_rule__StringConstraint__Group__6__Impl6916);
                    rule__StringConstraint__IsXSDAttAssignment_6();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getIsXSDAttAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__6__Impl


    // $ANTLR start rule__StringConstraint__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3428:1: rule__StringConstraint__Group__7 : rule__StringConstraint__Group__7__Impl ;
    public final void rule__StringConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3432:1: ( rule__StringConstraint__Group__7__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3433:2: rule__StringConstraint__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group__7__Impl_in_rule__StringConstraint__Group__76947);
            rule__StringConstraint__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__7


    // $ANTLR start rule__StringConstraint__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3439:1: rule__StringConstraint__Group__7__Impl : ( ( rule__StringConstraint__Group_7__0 )? ) ;
    public final void rule__StringConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3443:1: ( ( ( rule__StringConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3444:1: ( ( rule__StringConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3444:1: ( ( rule__StringConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3445:1: ( rule__StringConstraint__Group_7__0 )?
            {
             before(grammarAccess.getStringConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3446:1: ( rule__StringConstraint__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3446:2: rule__StringConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__StringConstraint__Group_7__0_in_rule__StringConstraint__Group__7__Impl6974);
                    rule__StringConstraint__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group__7__Impl


    // $ANTLR start rule__StringConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3472:1: rule__StringConstraint__Group_1__0 : rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1 ;
    public final void rule__StringConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3476:1: ( rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3477:2: rule__StringConstraint__Group_1__0__Impl rule__StringConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_1__0__Impl_in_rule__StringConstraint__Group_1__07021);
            rule__StringConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_1__1_in_rule__StringConstraint__Group_1__07024);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3484:1: rule__StringConstraint__Group_1__0__Impl : ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__StringConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3488:1: ( ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3489:1: ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3489:1: ( ( rule__StringConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3490:1: ( rule__StringConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:1: ( rule__StringConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3491:2: rule__StringConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__HasDefaultAssignment_1_0_in_rule__StringConstraint__Group_1__0__Impl7051);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3501:1: rule__StringConstraint__Group_1__1 : rule__StringConstraint__Group_1__1__Impl ;
    public final void rule__StringConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3505:1: ( rule__StringConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3506:2: rule__StringConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_1__1__Impl_in_rule__StringConstraint__Group_1__17081);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3512:1: rule__StringConstraint__Group_1__1__Impl : ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__StringConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3516:1: ( ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3517:1: ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3517:1: ( ( rule__StringConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3518:1: ( rule__StringConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3519:1: ( rule__StringConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3519:2: rule__StringConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__DefaultValueAssignment_1_1_in_rule__StringConstraint__Group_1__1__Impl7108);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3533:1: rule__StringConstraint__Group_2__0 : rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 ;
    public final void rule__StringConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3537:1: ( rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3538:2: rule__StringConstraint__Group_2__0__Impl rule__StringConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__07142);
            rule__StringConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__07145);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3545:1: rule__StringConstraint__Group_2__0__Impl : ( ( rule__StringConstraint__IsFixedAssignment_2_0 ) ) ;
    public final void rule__StringConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3549:1: ( ( ( rule__StringConstraint__IsFixedAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3550:1: ( ( rule__StringConstraint__IsFixedAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3550:1: ( ( rule__StringConstraint__IsFixedAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3551:1: ( rule__StringConstraint__IsFixedAssignment_2_0 )
            {
             before(grammarAccess.getStringConstraintAccess().getIsFixedAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:1: ( rule__StringConstraint__IsFixedAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3552:2: rule__StringConstraint__IsFixedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__StringConstraint__IsFixedAssignment_2_0_in_rule__StringConstraint__Group_2__0__Impl7172);
            rule__StringConstraint__IsFixedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getIsFixedAssignment_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3562:1: rule__StringConstraint__Group_2__1 : rule__StringConstraint__Group_2__1__Impl ;
    public final void rule__StringConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3566:1: ( rule__StringConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3567:2: rule__StringConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__17202);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3573:1: rule__StringConstraint__Group_2__1__Impl : ( ( rule__StringConstraint__FixedValueAssignment_2_1 ) ) ;
    public final void rule__StringConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3577:1: ( ( ( rule__StringConstraint__FixedValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3578:1: ( ( rule__StringConstraint__FixedValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3578:1: ( ( rule__StringConstraint__FixedValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3579:1: ( rule__StringConstraint__FixedValueAssignment_2_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getFixedValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3580:1: ( rule__StringConstraint__FixedValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3580:2: rule__StringConstraint__FixedValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__FixedValueAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl7229);
            rule__StringConstraint__FixedValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getFixedValueAssignment_2_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3594:1: rule__StringConstraint__Group_3__0 : rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1 ;
    public final void rule__StringConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3598:1: ( rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3599:2: rule__StringConstraint__Group_3__0__Impl rule__StringConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_3__0__Impl_in_rule__StringConstraint__Group_3__07263);
            rule__StringConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_3__1_in_rule__StringConstraint__Group_3__07266);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3606:1: rule__StringConstraint__Group_3__0__Impl : ( 'minLen' ) ;
    public final void rule__StringConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3610:1: ( ( 'minLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3611:1: ( 'minLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3611:1: ( 'minLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3612:1: 'minLen'
            {
             before(grammarAccess.getStringConstraintAccess().getMinLenKeyword_3_0()); 
            match(input,42,FOLLOW_42_in_rule__StringConstraint__Group_3__0__Impl7294); 
             after(grammarAccess.getStringConstraintAccess().getMinLenKeyword_3_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3625:1: rule__StringConstraint__Group_3__1 : rule__StringConstraint__Group_3__1__Impl ;
    public final void rule__StringConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3629:1: ( rule__StringConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3630:2: rule__StringConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_3__1__Impl_in_rule__StringConstraint__Group_3__17325);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3636:1: rule__StringConstraint__Group_3__1__Impl : ( ( rule__StringConstraint__MinLenAssignment_3_1 ) ) ;
    public final void rule__StringConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3640:1: ( ( ( rule__StringConstraint__MinLenAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3641:1: ( ( rule__StringConstraint__MinLenAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3641:1: ( ( rule__StringConstraint__MinLenAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3642:1: ( rule__StringConstraint__MinLenAssignment_3_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getMinLenAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3643:1: ( rule__StringConstraint__MinLenAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3643:2: rule__StringConstraint__MinLenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__MinLenAssignment_3_1_in_rule__StringConstraint__Group_3__1__Impl7352);
            rule__StringConstraint__MinLenAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getMinLenAssignment_3_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3657:1: rule__StringConstraint__Group_4__0 : rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1 ;
    public final void rule__StringConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3661:1: ( rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3662:2: rule__StringConstraint__Group_4__0__Impl rule__StringConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_4__0__Impl_in_rule__StringConstraint__Group_4__07386);
            rule__StringConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_4__1_in_rule__StringConstraint__Group_4__07389);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3669:1: rule__StringConstraint__Group_4__0__Impl : ( 'maxLen' ) ;
    public final void rule__StringConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3673:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3674:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3674:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3675:1: 'maxLen'
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_4_0()); 
            match(input,43,FOLLOW_43_in_rule__StringConstraint__Group_4__0__Impl7417); 
             after(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_4_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3688:1: rule__StringConstraint__Group_4__1 : rule__StringConstraint__Group_4__1__Impl ;
    public final void rule__StringConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3692:1: ( rule__StringConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3693:2: rule__StringConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_4__1__Impl_in_rule__StringConstraint__Group_4__17448);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3699:1: rule__StringConstraint__Group_4__1__Impl : ( ( rule__StringConstraint__MaxLenAssignment_4_1 ) ) ;
    public final void rule__StringConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3703:1: ( ( ( rule__StringConstraint__MaxLenAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3704:1: ( ( rule__StringConstraint__MaxLenAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3704:1: ( ( rule__StringConstraint__MaxLenAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3705:1: ( rule__StringConstraint__MaxLenAssignment_4_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLenAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3706:1: ( rule__StringConstraint__MaxLenAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3706:2: rule__StringConstraint__MaxLenAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__MaxLenAssignment_4_1_in_rule__StringConstraint__Group_4__1__Impl7475);
            rule__StringConstraint__MaxLenAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getMaxLenAssignment_4_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3720:1: rule__StringConstraint__Group_5__0 : rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1 ;
    public final void rule__StringConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3724:1: ( rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3725:2: rule__StringConstraint__Group_5__0__Impl rule__StringConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_5__0__Impl_in_rule__StringConstraint__Group_5__07509);
            rule__StringConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_5__1_in_rule__StringConstraint__Group_5__07512);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3732:1: rule__StringConstraint__Group_5__0__Impl : ( 'fixeLen' ) ;
    public final void rule__StringConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3736:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3737:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3737:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3738:1: 'fixeLen'
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_5_0()); 
            match(input,44,FOLLOW_44_in_rule__StringConstraint__Group_5__0__Impl7540); 
             after(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_5_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3751:1: rule__StringConstraint__Group_5__1 : rule__StringConstraint__Group_5__1__Impl ;
    public final void rule__StringConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3755:1: ( rule__StringConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3756:2: rule__StringConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_5__1__Impl_in_rule__StringConstraint__Group_5__17571);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3762:1: rule__StringConstraint__Group_5__1__Impl : ( ( rule__StringConstraint__FixeLenAssignment_5_1 ) ) ;
    public final void rule__StringConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3766:1: ( ( ( rule__StringConstraint__FixeLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3767:1: ( ( rule__StringConstraint__FixeLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3767:1: ( ( rule__StringConstraint__FixeLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3768:1: ( rule__StringConstraint__FixeLenAssignment_5_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3769:1: ( rule__StringConstraint__FixeLenAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3769:2: rule__StringConstraint__FixeLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__FixeLenAssignment_5_1_in_rule__StringConstraint__Group_5__1__Impl7598);
            rule__StringConstraint__FixeLenAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getFixeLenAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start rule__StringConstraint__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3783:1: rule__StringConstraint__Group_7__0 : rule__StringConstraint__Group_7__0__Impl rule__StringConstraint__Group_7__1 ;
    public final void rule__StringConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3787:1: ( rule__StringConstraint__Group_7__0__Impl rule__StringConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3788:2: rule__StringConstraint__Group_7__0__Impl rule__StringConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_7__0__Impl_in_rule__StringConstraint__Group_7__07632);
            rule__StringConstraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__StringConstraint__Group_7__1_in_rule__StringConstraint__Group_7__07635);
            rule__StringConstraint__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_7__0


    // $ANTLR start rule__StringConstraint__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3795:1: rule__StringConstraint__Group_7__0__Impl : ( 'regexp' ) ;
    public final void rule__StringConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3799:1: ( ( 'regexp' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3800:1: ( 'regexp' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3800:1: ( 'regexp' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3801:1: 'regexp'
            {
             before(grammarAccess.getStringConstraintAccess().getRegexpKeyword_7_0()); 
            match(input,45,FOLLOW_45_in_rule__StringConstraint__Group_7__0__Impl7663); 
             after(grammarAccess.getStringConstraintAccess().getRegexpKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_7__0__Impl


    // $ANTLR start rule__StringConstraint__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3814:1: rule__StringConstraint__Group_7__1 : rule__StringConstraint__Group_7__1__Impl ;
    public final void rule__StringConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3818:1: ( rule__StringConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3819:2: rule__StringConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__StringConstraint__Group_7__1__Impl_in_rule__StringConstraint__Group_7__17694);
            rule__StringConstraint__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_7__1


    // $ANTLR start rule__StringConstraint__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3825:1: rule__StringConstraint__Group_7__1__Impl : ( ( rule__StringConstraint__RegularExpressionAssignment_7_1 ) ) ;
    public final void rule__StringConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3829:1: ( ( ( rule__StringConstraint__RegularExpressionAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3830:1: ( ( rule__StringConstraint__RegularExpressionAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3830:1: ( ( rule__StringConstraint__RegularExpressionAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3831:1: ( rule__StringConstraint__RegularExpressionAssignment_7_1 )
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3832:1: ( rule__StringConstraint__RegularExpressionAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3832:2: rule__StringConstraint__RegularExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_rule__StringConstraint__RegularExpressionAssignment_7_1_in_rule__StringConstraint__Group_7__1__Impl7721);
            rule__StringConstraint__RegularExpressionAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getStringConstraintAccess().getRegularExpressionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__Group_7__1__Impl


    // $ANTLR start rule__DateTimeConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3846:1: rule__DateTimeConstraint__Group__0 : rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 ;
    public final void rule__DateTimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3850:1: ( rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3851:2: rule__DateTimeConstraint__Group__0__Impl rule__DateTimeConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__07755);
            rule__DateTimeConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__07758);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3858:1: rule__DateTimeConstraint__Group__0__Impl : ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DateTimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3862:1: ( ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3863:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3863:1: ( ( rule__DateTimeConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3864:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3865:1: ( rule__DateTimeConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3865:2: rule__DateTimeConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl7785);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3875:1: rule__DateTimeConstraint__Group__1 : rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 ;
    public final void rule__DateTimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3879:1: ( rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3880:2: rule__DateTimeConstraint__Group__1__Impl rule__DateTimeConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__17815);
            rule__DateTimeConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__17818);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3887:1: rule__DateTimeConstraint__Group__1__Impl : ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) ;
    public final void rule__DateTimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3891:1: ( ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3892:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3892:1: ( ( rule__DateTimeConstraint__DataTypeAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3893:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3894:1: ( rule__DateTimeConstraint__DataTypeAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3894:2: rule__DateTimeConstraint__DataTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl7845);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3904:1: rule__DateTimeConstraint__Group__2 : rule__DateTimeConstraint__Group__2__Impl ;
    public final void rule__DateTimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3908:1: ( rule__DateTimeConstraint__Group__2__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3909:2: rule__DateTimeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__27875);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3915:1: rule__DateTimeConstraint__Group__2__Impl : ( ( rule__DateTimeConstraint__Group_2__0 )? ) ;
    public final void rule__DateTimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3919:1: ( ( ( rule__DateTimeConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3920:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3920:1: ( ( rule__DateTimeConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3921:1: ( rule__DateTimeConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDateTimeConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3922:1: ( rule__DateTimeConstraint__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3922:2: rule__DateTimeConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl7902);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3938:1: rule__DateTimeConstraint__Group_2__0 : rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 ;
    public final void rule__DateTimeConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3942:1: ( rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3943:2: rule__DateTimeConstraint__Group_2__0__Impl rule__DateTimeConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__07939);
            rule__DateTimeConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__07942);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3950:1: rule__DateTimeConstraint__Group_2__0__Impl : ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3954:1: ( ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3955:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3955:1: ( ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3956:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3957:1: ( rule__DateTimeConstraint__HasDefaultAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3957:2: rule__DateTimeConstraint__HasDefaultAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl7969);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3967:1: rule__DateTimeConstraint__Group_2__1 : rule__DateTimeConstraint__Group_2__1__Impl ;
    public final void rule__DateTimeConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3971:1: ( rule__DateTimeConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3972:2: rule__DateTimeConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__17999);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3978:1: rule__DateTimeConstraint__Group_2__1__Impl : ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) ;
    public final void rule__DateTimeConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3982:1: ( ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3983:1: ( ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3984:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3985:1: ( rule__DateTimeConstraint__DefaultValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3985:2: rule__DateTimeConstraint__DefaultValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl8026);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:3999:1: rule__IntegerConstraint__Group__0 : rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 ;
    public final void rule__IntegerConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4003:1: ( rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4004:2: rule__IntegerConstraint__Group__0__Impl rule__IntegerConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__08060);
            rule__IntegerConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__08063);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4011:1: rule__IntegerConstraint__Group__0__Impl : ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__IntegerConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4015:1: ( ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4016:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4016:1: ( ( rule__IntegerConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4017:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4018:1: ( rule__IntegerConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4018:2: rule__IntegerConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl8090);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4028:1: rule__IntegerConstraint__Group__1 : rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2 ;
    public final void rule__IntegerConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4032:1: ( rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4033:2: rule__IntegerConstraint__Group__1__Impl rule__IntegerConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__18120);
            rule__IntegerConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__2_in_rule__IntegerConstraint__Group__18123);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4040:1: rule__IntegerConstraint__Group__1__Impl : ( ( rule__IntegerConstraint__Group_1__0 )? ) ;
    public final void rule__IntegerConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4044:1: ( ( ( rule__IntegerConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4045:1: ( ( rule__IntegerConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4045:1: ( ( rule__IntegerConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4046:1: ( rule__IntegerConstraint__Group_1__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4047:1: ( rule__IntegerConstraint__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4047:2: rule__IntegerConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__0_in_rule__IntegerConstraint__Group__1__Impl8150);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4057:1: rule__IntegerConstraint__Group__2 : rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3 ;
    public final void rule__IntegerConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4061:1: ( rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4062:2: rule__IntegerConstraint__Group__2__Impl rule__IntegerConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__2__Impl_in_rule__IntegerConstraint__Group__28181);
            rule__IntegerConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__3_in_rule__IntegerConstraint__Group__28184);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4069:1: rule__IntegerConstraint__Group__2__Impl : ( ( rule__IntegerConstraint__Group_2__0 )? ) ;
    public final void rule__IntegerConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4073:1: ( ( ( rule__IntegerConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4074:1: ( ( rule__IntegerConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4074:1: ( ( rule__IntegerConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4075:1: ( rule__IntegerConstraint__Group_2__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4076:1: ( rule__IntegerConstraint__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4076:2: rule__IntegerConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__0_in_rule__IntegerConstraint__Group__2__Impl8211);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4086:1: rule__IntegerConstraint__Group__3 : rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4 ;
    public final void rule__IntegerConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4090:1: ( rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4091:2: rule__IntegerConstraint__Group__3__Impl rule__IntegerConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__3__Impl_in_rule__IntegerConstraint__Group__38242);
            rule__IntegerConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__4_in_rule__IntegerConstraint__Group__38245);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4098:1: rule__IntegerConstraint__Group__3__Impl : ( ( rule__IntegerConstraint__Group_3__0 )? ) ;
    public final void rule__IntegerConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4102:1: ( ( ( rule__IntegerConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4103:1: ( ( rule__IntegerConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4103:1: ( ( rule__IntegerConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4104:1: ( rule__IntegerConstraint__Group_3__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4105:1: ( rule__IntegerConstraint__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4105:2: rule__IntegerConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__0_in_rule__IntegerConstraint__Group__3__Impl8272);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4115:1: rule__IntegerConstraint__Group__4 : rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5 ;
    public final void rule__IntegerConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4119:1: ( rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4120:2: rule__IntegerConstraint__Group__4__Impl rule__IntegerConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__4__Impl_in_rule__IntegerConstraint__Group__48303);
            rule__IntegerConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__5_in_rule__IntegerConstraint__Group__48306);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4127:1: rule__IntegerConstraint__Group__4__Impl : ( ( rule__IntegerConstraint__Group_4__0 )? ) ;
    public final void rule__IntegerConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4131:1: ( ( ( rule__IntegerConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4132:1: ( ( rule__IntegerConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4132:1: ( ( rule__IntegerConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4133:1: ( rule__IntegerConstraint__Group_4__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4134:1: ( rule__IntegerConstraint__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4134:2: rule__IntegerConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__0_in_rule__IntegerConstraint__Group__4__Impl8333);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4144:1: rule__IntegerConstraint__Group__5 : rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6 ;
    public final void rule__IntegerConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4148:1: ( rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4149:2: rule__IntegerConstraint__Group__5__Impl rule__IntegerConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__5__Impl_in_rule__IntegerConstraint__Group__58364);
            rule__IntegerConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__6_in_rule__IntegerConstraint__Group__58367);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4156:1: rule__IntegerConstraint__Group__5__Impl : ( ( rule__IntegerConstraint__Group_5__0 )? ) ;
    public final void rule__IntegerConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4160:1: ( ( ( rule__IntegerConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4161:1: ( ( rule__IntegerConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4161:1: ( ( rule__IntegerConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4162:1: ( rule__IntegerConstraint__Group_5__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4163:1: ( rule__IntegerConstraint__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4163:2: rule__IntegerConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__0_in_rule__IntegerConstraint__Group__5__Impl8394);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4173:1: rule__IntegerConstraint__Group__6 : rule__IntegerConstraint__Group__6__Impl rule__IntegerConstraint__Group__7 ;
    public final void rule__IntegerConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4177:1: ( rule__IntegerConstraint__Group__6__Impl rule__IntegerConstraint__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4178:2: rule__IntegerConstraint__Group__6__Impl rule__IntegerConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__6__Impl_in_rule__IntegerConstraint__Group__68425);
            rule__IntegerConstraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__7_in_rule__IntegerConstraint__Group__68428);
            rule__IntegerConstraint__Group__7();
            _fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4185:1: rule__IntegerConstraint__Group__6__Impl : ( ( rule__IntegerConstraint__Group_6__0 )? ) ;
    public final void rule__IntegerConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4189:1: ( ( ( rule__IntegerConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4190:1: ( ( rule__IntegerConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4190:1: ( ( rule__IntegerConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4191:1: ( rule__IntegerConstraint__Group_6__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4192:1: ( rule__IntegerConstraint__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4192:2: rule__IntegerConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__0_in_rule__IntegerConstraint__Group__6__Impl8455);
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


    // $ANTLR start rule__IntegerConstraint__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4202:1: rule__IntegerConstraint__Group__7 : rule__IntegerConstraint__Group__7__Impl rule__IntegerConstraint__Group__8 ;
    public final void rule__IntegerConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4206:1: ( rule__IntegerConstraint__Group__7__Impl rule__IntegerConstraint__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4207:2: rule__IntegerConstraint__Group__7__Impl rule__IntegerConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__7__Impl_in_rule__IntegerConstraint__Group__78486);
            rule__IntegerConstraint__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group__8_in_rule__IntegerConstraint__Group__78489);
            rule__IntegerConstraint__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__7


    // $ANTLR start rule__IntegerConstraint__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4214:1: rule__IntegerConstraint__Group__7__Impl : ( ( rule__IntegerConstraint__Group_7__0 )? ) ;
    public final void rule__IntegerConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4218:1: ( ( ( rule__IntegerConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4219:1: ( ( rule__IntegerConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4219:1: ( ( rule__IntegerConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4220:1: ( rule__IntegerConstraint__Group_7__0 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4221:1: ( rule__IntegerConstraint__Group_7__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4221:2: rule__IntegerConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__Group_7__0_in_rule__IntegerConstraint__Group__7__Impl8516);
                    rule__IntegerConstraint__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__7__Impl


    // $ANTLR start rule__IntegerConstraint__Group__8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4231:1: rule__IntegerConstraint__Group__8 : rule__IntegerConstraint__Group__8__Impl ;
    public final void rule__IntegerConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4235:1: ( rule__IntegerConstraint__Group__8__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4236:2: rule__IntegerConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group__8__Impl_in_rule__IntegerConstraint__Group__88547);
            rule__IntegerConstraint__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__8


    // $ANTLR start rule__IntegerConstraint__Group__8__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4242:1: rule__IntegerConstraint__Group__8__Impl : ( ( rule__IntegerConstraint__IsXSDAttAssignment_8 )? ) ;
    public final void rule__IntegerConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4246:1: ( ( ( rule__IntegerConstraint__IsXSDAttAssignment_8 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4247:1: ( ( rule__IntegerConstraint__IsXSDAttAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4247:1: ( ( rule__IntegerConstraint__IsXSDAttAssignment_8 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4248:1: ( rule__IntegerConstraint__IsXSDAttAssignment_8 )?
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsXSDAttAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4249:1: ( rule__IntegerConstraint__IsXSDAttAssignment_8 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4249:2: rule__IntegerConstraint__IsXSDAttAssignment_8
                    {
                    pushFollow(FOLLOW_rule__IntegerConstraint__IsXSDAttAssignment_8_in_rule__IntegerConstraint__Group__8__Impl8574);
                    rule__IntegerConstraint__IsXSDAttAssignment_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerConstraintAccess().getIsXSDAttAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group__8__Impl


    // $ANTLR start rule__IntegerConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4277:1: rule__IntegerConstraint__Group_1__0 : rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1 ;
    public final void rule__IntegerConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4281:1: ( rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4282:2: rule__IntegerConstraint__Group_1__0__Impl rule__IntegerConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__0__Impl_in_rule__IntegerConstraint__Group_1__08623);
            rule__IntegerConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__1_in_rule__IntegerConstraint__Group_1__08626);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4289:1: rule__IntegerConstraint__Group_1__0__Impl : ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__IntegerConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4293:1: ( ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4294:1: ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4294:1: ( ( rule__IntegerConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4295:1: ( rule__IntegerConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4296:1: ( rule__IntegerConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4296:2: rule__IntegerConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__HasDefaultAssignment_1_0_in_rule__IntegerConstraint__Group_1__0__Impl8653);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4306:1: rule__IntegerConstraint__Group_1__1 : rule__IntegerConstraint__Group_1__1__Impl ;
    public final void rule__IntegerConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4310:1: ( rule__IntegerConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4311:2: rule__IntegerConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_1__1__Impl_in_rule__IntegerConstraint__Group_1__18683);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4317:1: rule__IntegerConstraint__Group_1__1__Impl : ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__IntegerConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4321:1: ( ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4322:1: ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4322:1: ( ( rule__IntegerConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4323:1: ( rule__IntegerConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4324:1: ( rule__IntegerConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4324:2: rule__IntegerConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__DefaultValueAssignment_1_1_in_rule__IntegerConstraint__Group_1__1__Impl8710);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4338:1: rule__IntegerConstraint__Group_2__0 : rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1 ;
    public final void rule__IntegerConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4342:1: ( rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4343:2: rule__IntegerConstraint__Group_2__0__Impl rule__IntegerConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__0__Impl_in_rule__IntegerConstraint__Group_2__08744);
            rule__IntegerConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__1_in_rule__IntegerConstraint__Group_2__08747);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4350:1: rule__IntegerConstraint__Group_2__0__Impl : ( ( rule__IntegerConstraint__IsFixedAssignment_2_0 ) ) ;
    public final void rule__IntegerConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4354:1: ( ( ( rule__IntegerConstraint__IsFixedAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4355:1: ( ( rule__IntegerConstraint__IsFixedAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4355:1: ( ( rule__IntegerConstraint__IsFixedAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4356:1: ( rule__IntegerConstraint__IsFixedAssignment_2_0 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsFixedAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4357:1: ( rule__IntegerConstraint__IsFixedAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4357:2: rule__IntegerConstraint__IsFixedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__IsFixedAssignment_2_0_in_rule__IntegerConstraint__Group_2__0__Impl8774);
            rule__IntegerConstraint__IsFixedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getIsFixedAssignment_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4367:1: rule__IntegerConstraint__Group_2__1 : rule__IntegerConstraint__Group_2__1__Impl ;
    public final void rule__IntegerConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4371:1: ( rule__IntegerConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4372:2: rule__IntegerConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_2__1__Impl_in_rule__IntegerConstraint__Group_2__18804);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4378:1: rule__IntegerConstraint__Group_2__1__Impl : ( ( rule__IntegerConstraint__FixedValueAssignment_2_1 ) ) ;
    public final void rule__IntegerConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4382:1: ( ( ( rule__IntegerConstraint__FixedValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4383:1: ( ( rule__IntegerConstraint__FixedValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4383:1: ( ( rule__IntegerConstraint__FixedValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4384:1: ( rule__IntegerConstraint__FixedValueAssignment_2_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixedValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4385:1: ( rule__IntegerConstraint__FixedValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4385:2: rule__IntegerConstraint__FixedValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__FixedValueAssignment_2_1_in_rule__IntegerConstraint__Group_2__1__Impl8831);
            rule__IntegerConstraint__FixedValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getFixedValueAssignment_2_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4399:1: rule__IntegerConstraint__Group_3__0 : rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1 ;
    public final void rule__IntegerConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4403:1: ( rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4404:2: rule__IntegerConstraint__Group_3__0__Impl rule__IntegerConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__0__Impl_in_rule__IntegerConstraint__Group_3__08865);
            rule__IntegerConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__1_in_rule__IntegerConstraint__Group_3__08868);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4411:1: rule__IntegerConstraint__Group_3__0__Impl : ( 'minVal' ) ;
    public final void rule__IntegerConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4415:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4416:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4416:1: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4417:1: 'minVal'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__IntegerConstraint__Group_3__0__Impl8896); 
             after(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_3_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4430:1: rule__IntegerConstraint__Group_3__1 : rule__IntegerConstraint__Group_3__1__Impl ;
    public final void rule__IntegerConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4434:1: ( rule__IntegerConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4435:2: rule__IntegerConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_3__1__Impl_in_rule__IntegerConstraint__Group_3__18927);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4441:1: rule__IntegerConstraint__Group_3__1__Impl : ( ( rule__IntegerConstraint__MinValueAssignment_3_1 ) ) ;
    public final void rule__IntegerConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4445:1: ( ( ( rule__IntegerConstraint__MinValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4446:1: ( ( rule__IntegerConstraint__MinValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4446:1: ( ( rule__IntegerConstraint__MinValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4447:1: ( rule__IntegerConstraint__MinValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4448:1: ( rule__IntegerConstraint__MinValueAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4448:2: rule__IntegerConstraint__MinValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MinValueAssignment_3_1_in_rule__IntegerConstraint__Group_3__1__Impl8954);
            rule__IntegerConstraint__MinValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMinValueAssignment_3_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4462:1: rule__IntegerConstraint__Group_4__0 : rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1 ;
    public final void rule__IntegerConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4466:1: ( rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4467:2: rule__IntegerConstraint__Group_4__0__Impl rule__IntegerConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__0__Impl_in_rule__IntegerConstraint__Group_4__08988);
            rule__IntegerConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__1_in_rule__IntegerConstraint__Group_4__08991);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4474:1: rule__IntegerConstraint__Group_4__0__Impl : ( 'maxVal' ) ;
    public final void rule__IntegerConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4478:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4479:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4479:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4480:1: 'maxVal'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__IntegerConstraint__Group_4__0__Impl9019); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_4_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4493:1: rule__IntegerConstraint__Group_4__1 : rule__IntegerConstraint__Group_4__1__Impl ;
    public final void rule__IntegerConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4497:1: ( rule__IntegerConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4498:2: rule__IntegerConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_4__1__Impl_in_rule__IntegerConstraint__Group_4__19050);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4504:1: rule__IntegerConstraint__Group_4__1__Impl : ( ( rule__IntegerConstraint__MaxValueAssignment_4_1 ) ) ;
    public final void rule__IntegerConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4508:1: ( ( ( rule__IntegerConstraint__MaxValueAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4509:1: ( ( rule__IntegerConstraint__MaxValueAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4509:1: ( ( rule__IntegerConstraint__MaxValueAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4510:1: ( rule__IntegerConstraint__MaxValueAssignment_4_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValueAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4511:1: ( rule__IntegerConstraint__MaxValueAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4511:2: rule__IntegerConstraint__MaxValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MaxValueAssignment_4_1_in_rule__IntegerConstraint__Group_4__1__Impl9077);
            rule__IntegerConstraint__MaxValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMaxValueAssignment_4_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4525:1: rule__IntegerConstraint__Group_5__0 : rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1 ;
    public final void rule__IntegerConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4529:1: ( rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4530:2: rule__IntegerConstraint__Group_5__0__Impl rule__IntegerConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__0__Impl_in_rule__IntegerConstraint__Group_5__09111);
            rule__IntegerConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__1_in_rule__IntegerConstraint__Group_5__09114);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4537:1: rule__IntegerConstraint__Group_5__0__Impl : ( 'maxLen' ) ;
    public final void rule__IntegerConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4541:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4542:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4542:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4543:1: 'maxLen'
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_5_0()); 
            match(input,43,FOLLOW_43_in_rule__IntegerConstraint__Group_5__0__Impl9142); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_5_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4556:1: rule__IntegerConstraint__Group_5__1 : rule__IntegerConstraint__Group_5__1__Impl ;
    public final void rule__IntegerConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4560:1: ( rule__IntegerConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4561:2: rule__IntegerConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_5__1__Impl_in_rule__IntegerConstraint__Group_5__19173);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4567:1: rule__IntegerConstraint__Group_5__1__Impl : ( ( rule__IntegerConstraint__MaxLenAssignment_5_1 ) ) ;
    public final void rule__IntegerConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4571:1: ( ( ( rule__IntegerConstraint__MaxLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4572:1: ( ( rule__IntegerConstraint__MaxLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4572:1: ( ( rule__IntegerConstraint__MaxLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4573:1: ( rule__IntegerConstraint__MaxLenAssignment_5_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4574:1: ( rule__IntegerConstraint__MaxLenAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4574:2: rule__IntegerConstraint__MaxLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__MaxLenAssignment_5_1_in_rule__IntegerConstraint__Group_5__1__Impl9200);
            rule__IntegerConstraint__MaxLenAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getMaxLenAssignment_5_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4588:1: rule__IntegerConstraint__Group_6__0 : rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1 ;
    public final void rule__IntegerConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4592:1: ( rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4593:2: rule__IntegerConstraint__Group_6__0__Impl rule__IntegerConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__0__Impl_in_rule__IntegerConstraint__Group_6__09234);
            rule__IntegerConstraint__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__1_in_rule__IntegerConstraint__Group_6__09237);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4600:1: rule__IntegerConstraint__Group_6__0__Impl : ( 'fixeLen' ) ;
    public final void rule__IntegerConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4604:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4605:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4605:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4606:1: 'fixeLen'
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_6_0()); 
            match(input,44,FOLLOW_44_in_rule__IntegerConstraint__Group_6__0__Impl9265); 
             after(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_6_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4619:1: rule__IntegerConstraint__Group_6__1 : rule__IntegerConstraint__Group_6__1__Impl ;
    public final void rule__IntegerConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4623:1: ( rule__IntegerConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4624:2: rule__IntegerConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_6__1__Impl_in_rule__IntegerConstraint__Group_6__19296);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4630:1: rule__IntegerConstraint__Group_6__1__Impl : ( ( rule__IntegerConstraint__FixeLenAssignment_6_1 ) ) ;
    public final void rule__IntegerConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4634:1: ( ( ( rule__IntegerConstraint__FixeLenAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4635:1: ( ( rule__IntegerConstraint__FixeLenAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4635:1: ( ( rule__IntegerConstraint__FixeLenAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4636:1: ( rule__IntegerConstraint__FixeLenAssignment_6_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4637:1: ( rule__IntegerConstraint__FixeLenAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4637:2: rule__IntegerConstraint__FixeLenAssignment_6_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__FixeLenAssignment_6_1_in_rule__IntegerConstraint__Group_6__1__Impl9323);
            rule__IntegerConstraint__FixeLenAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getFixeLenAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start rule__IntegerConstraint__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4651:1: rule__IntegerConstraint__Group_7__0 : rule__IntegerConstraint__Group_7__0__Impl rule__IntegerConstraint__Group_7__1 ;
    public final void rule__IntegerConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4655:1: ( rule__IntegerConstraint__Group_7__0__Impl rule__IntegerConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4656:2: rule__IntegerConstraint__Group_7__0__Impl rule__IntegerConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_7__0__Impl_in_rule__IntegerConstraint__Group_7__09357);
            rule__IntegerConstraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__IntegerConstraint__Group_7__1_in_rule__IntegerConstraint__Group_7__09360);
            rule__IntegerConstraint__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_7__0


    // $ANTLR start rule__IntegerConstraint__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4663:1: rule__IntegerConstraint__Group_7__0__Impl : ( 'paddle' ) ;
    public final void rule__IntegerConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4667:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4668:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4668:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4669:1: 'paddle'
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_7_0()); 
            match(input,48,FOLLOW_48_in_rule__IntegerConstraint__Group_7__0__Impl9388); 
             after(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_7__0__Impl


    // $ANTLR start rule__IntegerConstraint__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4682:1: rule__IntegerConstraint__Group_7__1 : rule__IntegerConstraint__Group_7__1__Impl ;
    public final void rule__IntegerConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4686:1: ( rule__IntegerConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4687:2: rule__IntegerConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__Group_7__1__Impl_in_rule__IntegerConstraint__Group_7__19419);
            rule__IntegerConstraint__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_7__1


    // $ANTLR start rule__IntegerConstraint__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4693:1: rule__IntegerConstraint__Group_7__1__Impl : ( ( rule__IntegerConstraint__PaddleAssignment_7_1 ) ) ;
    public final void rule__IntegerConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4697:1: ( ( ( rule__IntegerConstraint__PaddleAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4698:1: ( ( rule__IntegerConstraint__PaddleAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4698:1: ( ( rule__IntegerConstraint__PaddleAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4699:1: ( rule__IntegerConstraint__PaddleAssignment_7_1 )
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4700:1: ( rule__IntegerConstraint__PaddleAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4700:2: rule__IntegerConstraint__PaddleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__IntegerConstraint__PaddleAssignment_7_1_in_rule__IntegerConstraint__Group_7__1__Impl9446);
            rule__IntegerConstraint__PaddleAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getIntegerConstraintAccess().getPaddleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__Group_7__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4714:1: rule__DecimalConstraint__Group__0 : rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 ;
    public final void rule__DecimalConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4718:1: ( rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4719:2: rule__DecimalConstraint__Group__0__Impl rule__DecimalConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__09480);
            rule__DecimalConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__09483);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4726:1: rule__DecimalConstraint__Group__0__Impl : ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) ;
    public final void rule__DecimalConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4730:1: ( ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4731:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4731:1: ( ( rule__DecimalConstraint__ConstraintAssignment_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4732:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintAssignment_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4733:1: ( rule__DecimalConstraint__ConstraintAssignment_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4733:2: rule__DecimalConstraint__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl9510);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4743:1: rule__DecimalConstraint__Group__1 : rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2 ;
    public final void rule__DecimalConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4747:1: ( rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4748:2: rule__DecimalConstraint__Group__1__Impl rule__DecimalConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__19540);
            rule__DecimalConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__2_in_rule__DecimalConstraint__Group__19543);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4755:1: rule__DecimalConstraint__Group__1__Impl : ( ( rule__DecimalConstraint__Group_1__0 )? ) ;
    public final void rule__DecimalConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4759:1: ( ( ( rule__DecimalConstraint__Group_1__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4760:1: ( ( rule__DecimalConstraint__Group_1__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4760:1: ( ( rule__DecimalConstraint__Group_1__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4761:1: ( rule__DecimalConstraint__Group_1__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4762:1: ( rule__DecimalConstraint__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4762:2: rule__DecimalConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__0_in_rule__DecimalConstraint__Group__1__Impl9570);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4772:1: rule__DecimalConstraint__Group__2 : rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3 ;
    public final void rule__DecimalConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4776:1: ( rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4777:2: rule__DecimalConstraint__Group__2__Impl rule__DecimalConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__2__Impl_in_rule__DecimalConstraint__Group__29601);
            rule__DecimalConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__3_in_rule__DecimalConstraint__Group__29604);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4784:1: rule__DecimalConstraint__Group__2__Impl : ( ( rule__DecimalConstraint__Group_2__0 )? ) ;
    public final void rule__DecimalConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4788:1: ( ( ( rule__DecimalConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4789:1: ( ( rule__DecimalConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4789:1: ( ( rule__DecimalConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4790:1: ( rule__DecimalConstraint__Group_2__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4791:1: ( rule__DecimalConstraint__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4791:2: rule__DecimalConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__0_in_rule__DecimalConstraint__Group__2__Impl9631);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4801:1: rule__DecimalConstraint__Group__3 : rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4 ;
    public final void rule__DecimalConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4805:1: ( rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4806:2: rule__DecimalConstraint__Group__3__Impl rule__DecimalConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__3__Impl_in_rule__DecimalConstraint__Group__39662);
            rule__DecimalConstraint__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__4_in_rule__DecimalConstraint__Group__39665);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4813:1: rule__DecimalConstraint__Group__3__Impl : ( ( rule__DecimalConstraint__Group_3__0 )? ) ;
    public final void rule__DecimalConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4817:1: ( ( ( rule__DecimalConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4818:1: ( ( rule__DecimalConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4818:1: ( ( rule__DecimalConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4819:1: ( rule__DecimalConstraint__Group_3__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4820:1: ( rule__DecimalConstraint__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4820:2: rule__DecimalConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__0_in_rule__DecimalConstraint__Group__3__Impl9692);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4830:1: rule__DecimalConstraint__Group__4 : rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5 ;
    public final void rule__DecimalConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4834:1: ( rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4835:2: rule__DecimalConstraint__Group__4__Impl rule__DecimalConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__4__Impl_in_rule__DecimalConstraint__Group__49723);
            rule__DecimalConstraint__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__5_in_rule__DecimalConstraint__Group__49726);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4842:1: rule__DecimalConstraint__Group__4__Impl : ( ( rule__DecimalConstraint__Group_4__0 )? ) ;
    public final void rule__DecimalConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4846:1: ( ( ( rule__DecimalConstraint__Group_4__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4847:1: ( ( rule__DecimalConstraint__Group_4__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4847:1: ( ( rule__DecimalConstraint__Group_4__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4848:1: ( rule__DecimalConstraint__Group_4__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_4()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4849:1: ( rule__DecimalConstraint__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4849:2: rule__DecimalConstraint__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__0_in_rule__DecimalConstraint__Group__4__Impl9753);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4859:1: rule__DecimalConstraint__Group__5 : rule__DecimalConstraint__Group__5__Impl rule__DecimalConstraint__Group__6 ;
    public final void rule__DecimalConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4863:1: ( rule__DecimalConstraint__Group__5__Impl rule__DecimalConstraint__Group__6 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4864:2: rule__DecimalConstraint__Group__5__Impl rule__DecimalConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__5__Impl_in_rule__DecimalConstraint__Group__59784);
            rule__DecimalConstraint__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__6_in_rule__DecimalConstraint__Group__59787);
            rule__DecimalConstraint__Group__6();
            _fsp--;


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4871:1: rule__DecimalConstraint__Group__5__Impl : ( ( rule__DecimalConstraint__Group_5__0 )? ) ;
    public final void rule__DecimalConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4875:1: ( ( ( rule__DecimalConstraint__Group_5__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4876:1: ( ( rule__DecimalConstraint__Group_5__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4876:1: ( ( rule__DecimalConstraint__Group_5__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4877:1: ( rule__DecimalConstraint__Group_5__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_5()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4878:1: ( rule__DecimalConstraint__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4878:2: rule__DecimalConstraint__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__0_in_rule__DecimalConstraint__Group__5__Impl9814);
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


    // $ANTLR start rule__DecimalConstraint__Group__6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4888:1: rule__DecimalConstraint__Group__6 : rule__DecimalConstraint__Group__6__Impl rule__DecimalConstraint__Group__7 ;
    public final void rule__DecimalConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4892:1: ( rule__DecimalConstraint__Group__6__Impl rule__DecimalConstraint__Group__7 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4893:2: rule__DecimalConstraint__Group__6__Impl rule__DecimalConstraint__Group__7
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__6__Impl_in_rule__DecimalConstraint__Group__69845);
            rule__DecimalConstraint__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__7_in_rule__DecimalConstraint__Group__69848);
            rule__DecimalConstraint__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__6


    // $ANTLR start rule__DecimalConstraint__Group__6__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4900:1: rule__DecimalConstraint__Group__6__Impl : ( ( rule__DecimalConstraint__Group_6__0 )? ) ;
    public final void rule__DecimalConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4904:1: ( ( ( rule__DecimalConstraint__Group_6__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4905:1: ( ( rule__DecimalConstraint__Group_6__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4905:1: ( ( rule__DecimalConstraint__Group_6__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4906:1: ( rule__DecimalConstraint__Group_6__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_6()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4907:1: ( rule__DecimalConstraint__Group_6__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4907:2: rule__DecimalConstraint__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_6__0_in_rule__DecimalConstraint__Group__6__Impl9875);
                    rule__DecimalConstraint__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__6__Impl


    // $ANTLR start rule__DecimalConstraint__Group__7
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4917:1: rule__DecimalConstraint__Group__7 : rule__DecimalConstraint__Group__7__Impl rule__DecimalConstraint__Group__8 ;
    public final void rule__DecimalConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4921:1: ( rule__DecimalConstraint__Group__7__Impl rule__DecimalConstraint__Group__8 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4922:2: rule__DecimalConstraint__Group__7__Impl rule__DecimalConstraint__Group__8
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__7__Impl_in_rule__DecimalConstraint__Group__79906);
            rule__DecimalConstraint__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group__8_in_rule__DecimalConstraint__Group__79909);
            rule__DecimalConstraint__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__7


    // $ANTLR start rule__DecimalConstraint__Group__7__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4929:1: rule__DecimalConstraint__Group__7__Impl : ( ( rule__DecimalConstraint__Group_7__0 )? ) ;
    public final void rule__DecimalConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4933:1: ( ( ( rule__DecimalConstraint__Group_7__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4934:1: ( ( rule__DecimalConstraint__Group_7__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4934:1: ( ( rule__DecimalConstraint__Group_7__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4935:1: ( rule__DecimalConstraint__Group_7__0 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getGroup_7()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4936:1: ( rule__DecimalConstraint__Group_7__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4936:2: rule__DecimalConstraint__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__Group_7__0_in_rule__DecimalConstraint__Group__7__Impl9936);
                    rule__DecimalConstraint__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__7__Impl


    // $ANTLR start rule__DecimalConstraint__Group__8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4946:1: rule__DecimalConstraint__Group__8 : rule__DecimalConstraint__Group__8__Impl ;
    public final void rule__DecimalConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4950:1: ( rule__DecimalConstraint__Group__8__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4951:2: rule__DecimalConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group__8__Impl_in_rule__DecimalConstraint__Group__89967);
            rule__DecimalConstraint__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__8


    // $ANTLR start rule__DecimalConstraint__Group__8__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4957:1: rule__DecimalConstraint__Group__8__Impl : ( ( rule__DecimalConstraint__IsXSDAttAssignment_8 )? ) ;
    public final void rule__DecimalConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4961:1: ( ( ( rule__DecimalConstraint__IsXSDAttAssignment_8 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4962:1: ( ( rule__DecimalConstraint__IsXSDAttAssignment_8 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4962:1: ( ( rule__DecimalConstraint__IsXSDAttAssignment_8 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4963:1: ( rule__DecimalConstraint__IsXSDAttAssignment_8 )?
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsXSDAttAssignment_8()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4964:1: ( rule__DecimalConstraint__IsXSDAttAssignment_8 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4964:2: rule__DecimalConstraint__IsXSDAttAssignment_8
                    {
                    pushFollow(FOLLOW_rule__DecimalConstraint__IsXSDAttAssignment_8_in_rule__DecimalConstraint__Group__8__Impl9994);
                    rule__DecimalConstraint__IsXSDAttAssignment_8();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDecimalConstraintAccess().getIsXSDAttAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group__8__Impl


    // $ANTLR start rule__DecimalConstraint__Group_1__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4992:1: rule__DecimalConstraint__Group_1__0 : rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1 ;
    public final void rule__DecimalConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4996:1: ( rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:4997:2: rule__DecimalConstraint__Group_1__0__Impl rule__DecimalConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__0__Impl_in_rule__DecimalConstraint__Group_1__010043);
            rule__DecimalConstraint__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__1_in_rule__DecimalConstraint__Group_1__010046);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5004:1: rule__DecimalConstraint__Group_1__0__Impl : ( ( rule__DecimalConstraint__HasDefaultAssignment_1_0 ) ) ;
    public final void rule__DecimalConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5008:1: ( ( ( rule__DecimalConstraint__HasDefaultAssignment_1_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5009:1: ( ( rule__DecimalConstraint__HasDefaultAssignment_1_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5009:1: ( ( rule__DecimalConstraint__HasDefaultAssignment_1_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5010:1: ( rule__DecimalConstraint__HasDefaultAssignment_1_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getHasDefaultAssignment_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5011:1: ( rule__DecimalConstraint__HasDefaultAssignment_1_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5011:2: rule__DecimalConstraint__HasDefaultAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__HasDefaultAssignment_1_0_in_rule__DecimalConstraint__Group_1__0__Impl10073);
            rule__DecimalConstraint__HasDefaultAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getHasDefaultAssignment_1_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5021:1: rule__DecimalConstraint__Group_1__1 : rule__DecimalConstraint__Group_1__1__Impl ;
    public final void rule__DecimalConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5025:1: ( rule__DecimalConstraint__Group_1__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5026:2: rule__DecimalConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_1__1__Impl_in_rule__DecimalConstraint__Group_1__110103);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5032:1: rule__DecimalConstraint__Group_1__1__Impl : ( ( rule__DecimalConstraint__DefaultValueAssignment_1_1 ) ) ;
    public final void rule__DecimalConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5036:1: ( ( ( rule__DecimalConstraint__DefaultValueAssignment_1_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5037:1: ( ( rule__DecimalConstraint__DefaultValueAssignment_1_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5037:1: ( ( rule__DecimalConstraint__DefaultValueAssignment_1_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5038:1: ( rule__DecimalConstraint__DefaultValueAssignment_1_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getDefaultValueAssignment_1_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5039:1: ( rule__DecimalConstraint__DefaultValueAssignment_1_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5039:2: rule__DecimalConstraint__DefaultValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__DefaultValueAssignment_1_1_in_rule__DecimalConstraint__Group_1__1__Impl10130);
            rule__DecimalConstraint__DefaultValueAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getDefaultValueAssignment_1_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5053:1: rule__DecimalConstraint__Group_2__0 : rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1 ;
    public final void rule__DecimalConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5057:1: ( rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5058:2: rule__DecimalConstraint__Group_2__0__Impl rule__DecimalConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__0__Impl_in_rule__DecimalConstraint__Group_2__010164);
            rule__DecimalConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__1_in_rule__DecimalConstraint__Group_2__010167);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5065:1: rule__DecimalConstraint__Group_2__0__Impl : ( ( rule__DecimalConstraint__IsFixedAssignment_2_0 ) ) ;
    public final void rule__DecimalConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5069:1: ( ( ( rule__DecimalConstraint__IsFixedAssignment_2_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5070:1: ( ( rule__DecimalConstraint__IsFixedAssignment_2_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5070:1: ( ( rule__DecimalConstraint__IsFixedAssignment_2_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5071:1: ( rule__DecimalConstraint__IsFixedAssignment_2_0 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsFixedAssignment_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5072:1: ( rule__DecimalConstraint__IsFixedAssignment_2_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5072:2: rule__DecimalConstraint__IsFixedAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__IsFixedAssignment_2_0_in_rule__DecimalConstraint__Group_2__0__Impl10194);
            rule__DecimalConstraint__IsFixedAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getIsFixedAssignment_2_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5082:1: rule__DecimalConstraint__Group_2__1 : rule__DecimalConstraint__Group_2__1__Impl ;
    public final void rule__DecimalConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5086:1: ( rule__DecimalConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5087:2: rule__DecimalConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_2__1__Impl_in_rule__DecimalConstraint__Group_2__110224);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5093:1: rule__DecimalConstraint__Group_2__1__Impl : ( ( rule__DecimalConstraint__FixedValueAssignment_2_1 ) ) ;
    public final void rule__DecimalConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5097:1: ( ( ( rule__DecimalConstraint__FixedValueAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5098:1: ( ( rule__DecimalConstraint__FixedValueAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5098:1: ( ( rule__DecimalConstraint__FixedValueAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5099:1: ( rule__DecimalConstraint__FixedValueAssignment_2_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixedValueAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5100:1: ( rule__DecimalConstraint__FixedValueAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5100:2: rule__DecimalConstraint__FixedValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__FixedValueAssignment_2_1_in_rule__DecimalConstraint__Group_2__1__Impl10251);
            rule__DecimalConstraint__FixedValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getFixedValueAssignment_2_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5114:1: rule__DecimalConstraint__Group_3__0 : rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1 ;
    public final void rule__DecimalConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5118:1: ( rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5119:2: rule__DecimalConstraint__Group_3__0__Impl rule__DecimalConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__0__Impl_in_rule__DecimalConstraint__Group_3__010285);
            rule__DecimalConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__1_in_rule__DecimalConstraint__Group_3__010288);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5126:1: rule__DecimalConstraint__Group_3__0__Impl : ( 'minVal' ) ;
    public final void rule__DecimalConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5130:1: ( ( 'minVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5131:1: ( 'minVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5131:1: ( 'minVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5132:1: 'minVal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__DecimalConstraint__Group_3__0__Impl10316); 
             after(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_3_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5145:1: rule__DecimalConstraint__Group_3__1 : rule__DecimalConstraint__Group_3__1__Impl ;
    public final void rule__DecimalConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5149:1: ( rule__DecimalConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5150:2: rule__DecimalConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_3__1__Impl_in_rule__DecimalConstraint__Group_3__110347);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5156:1: rule__DecimalConstraint__Group_3__1__Impl : ( ( rule__DecimalConstraint__MinValueAssignment_3_1 ) ) ;
    public final void rule__DecimalConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5160:1: ( ( ( rule__DecimalConstraint__MinValueAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5161:1: ( ( rule__DecimalConstraint__MinValueAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5161:1: ( ( rule__DecimalConstraint__MinValueAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5162:1: ( rule__DecimalConstraint__MinValueAssignment_3_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValueAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5163:1: ( rule__DecimalConstraint__MinValueAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5163:2: rule__DecimalConstraint__MinValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MinValueAssignment_3_1_in_rule__DecimalConstraint__Group_3__1__Impl10374);
            rule__DecimalConstraint__MinValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMinValueAssignment_3_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5177:1: rule__DecimalConstraint__Group_4__0 : rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1 ;
    public final void rule__DecimalConstraint__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5181:1: ( rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5182:2: rule__DecimalConstraint__Group_4__0__Impl rule__DecimalConstraint__Group_4__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__0__Impl_in_rule__DecimalConstraint__Group_4__010408);
            rule__DecimalConstraint__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__1_in_rule__DecimalConstraint__Group_4__010411);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5189:1: rule__DecimalConstraint__Group_4__0__Impl : ( 'maxVal' ) ;
    public final void rule__DecimalConstraint__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5193:1: ( ( 'maxVal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5194:1: ( 'maxVal' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5194:1: ( 'maxVal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5195:1: 'maxVal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_4_0()); 
            match(input,47,FOLLOW_47_in_rule__DecimalConstraint__Group_4__0__Impl10439); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_4_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5208:1: rule__DecimalConstraint__Group_4__1 : rule__DecimalConstraint__Group_4__1__Impl ;
    public final void rule__DecimalConstraint__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5212:1: ( rule__DecimalConstraint__Group_4__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5213:2: rule__DecimalConstraint__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_4__1__Impl_in_rule__DecimalConstraint__Group_4__110470);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5219:1: rule__DecimalConstraint__Group_4__1__Impl : ( ( rule__DecimalConstraint__MaxValueAssignment_4_1 ) ) ;
    public final void rule__DecimalConstraint__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5223:1: ( ( ( rule__DecimalConstraint__MaxValueAssignment_4_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( ( rule__DecimalConstraint__MaxValueAssignment_4_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5224:1: ( ( rule__DecimalConstraint__MaxValueAssignment_4_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5225:1: ( rule__DecimalConstraint__MaxValueAssignment_4_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValueAssignment_4_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5226:1: ( rule__DecimalConstraint__MaxValueAssignment_4_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5226:2: rule__DecimalConstraint__MaxValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MaxValueAssignment_4_1_in_rule__DecimalConstraint__Group_4__1__Impl10497);
            rule__DecimalConstraint__MaxValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMaxValueAssignment_4_1()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5240:1: rule__DecimalConstraint__Group_5__0 : rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1 ;
    public final void rule__DecimalConstraint__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5244:1: ( rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5245:2: rule__DecimalConstraint__Group_5__0__Impl rule__DecimalConstraint__Group_5__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__0__Impl_in_rule__DecimalConstraint__Group_5__010531);
            rule__DecimalConstraint__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__1_in_rule__DecimalConstraint__Group_5__010534);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5252:1: rule__DecimalConstraint__Group_5__0__Impl : ( 'maxLen' ) ;
    public final void rule__DecimalConstraint__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5256:1: ( ( 'maxLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5257:1: ( 'maxLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5257:1: ( 'maxLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5258:1: 'maxLen'
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_5_0()); 
            match(input,43,FOLLOW_43_in_rule__DecimalConstraint__Group_5__0__Impl10562); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_5_0()); 

            }


            }

        }
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5271:1: rule__DecimalConstraint__Group_5__1 : rule__DecimalConstraint__Group_5__1__Impl ;
    public final void rule__DecimalConstraint__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5275:1: ( rule__DecimalConstraint__Group_5__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5276:2: rule__DecimalConstraint__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_5__1__Impl_in_rule__DecimalConstraint__Group_5__110593);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5282:1: rule__DecimalConstraint__Group_5__1__Impl : ( ( rule__DecimalConstraint__MaxLenAssignment_5_1 ) ) ;
    public final void rule__DecimalConstraint__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5286:1: ( ( ( rule__DecimalConstraint__MaxLenAssignment_5_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5287:1: ( ( rule__DecimalConstraint__MaxLenAssignment_5_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5287:1: ( ( rule__DecimalConstraint__MaxLenAssignment_5_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5288:1: ( rule__DecimalConstraint__MaxLenAssignment_5_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenAssignment_5_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5289:1: ( rule__DecimalConstraint__MaxLenAssignment_5_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5289:2: rule__DecimalConstraint__MaxLenAssignment_5_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__MaxLenAssignment_5_1_in_rule__DecimalConstraint__Group_5__1__Impl10620);
            rule__DecimalConstraint__MaxLenAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getMaxLenAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DecimalConstraint__Group_6__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5303:1: rule__DecimalConstraint__Group_6__0 : rule__DecimalConstraint__Group_6__0__Impl rule__DecimalConstraint__Group_6__1 ;
    public final void rule__DecimalConstraint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5307:1: ( rule__DecimalConstraint__Group_6__0__Impl rule__DecimalConstraint__Group_6__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5308:2: rule__DecimalConstraint__Group_6__0__Impl rule__DecimalConstraint__Group_6__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_6__0__Impl_in_rule__DecimalConstraint__Group_6__010654);
            rule__DecimalConstraint__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_6__1_in_rule__DecimalConstraint__Group_6__010657);
            rule__DecimalConstraint__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_6__0


    // $ANTLR start rule__DecimalConstraint__Group_6__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5315:1: rule__DecimalConstraint__Group_6__0__Impl : ( 'fixeLen' ) ;
    public final void rule__DecimalConstraint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5319:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5320:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5320:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5321:1: 'fixeLen'
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_6_0()); 
            match(input,44,FOLLOW_44_in_rule__DecimalConstraint__Group_6__0__Impl10685); 
             after(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_6__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_6__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5334:1: rule__DecimalConstraint__Group_6__1 : rule__DecimalConstraint__Group_6__1__Impl ;
    public final void rule__DecimalConstraint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5338:1: ( rule__DecimalConstraint__Group_6__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5339:2: rule__DecimalConstraint__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_6__1__Impl_in_rule__DecimalConstraint__Group_6__110716);
            rule__DecimalConstraint__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_6__1


    // $ANTLR start rule__DecimalConstraint__Group_6__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5345:1: rule__DecimalConstraint__Group_6__1__Impl : ( ( rule__DecimalConstraint__FixeLenAssignment_6_1 ) ) ;
    public final void rule__DecimalConstraint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5349:1: ( ( ( rule__DecimalConstraint__FixeLenAssignment_6_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5350:1: ( ( rule__DecimalConstraint__FixeLenAssignment_6_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5350:1: ( ( rule__DecimalConstraint__FixeLenAssignment_6_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5351:1: ( rule__DecimalConstraint__FixeLenAssignment_6_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenAssignment_6_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5352:1: ( rule__DecimalConstraint__FixeLenAssignment_6_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5352:2: rule__DecimalConstraint__FixeLenAssignment_6_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__FixeLenAssignment_6_1_in_rule__DecimalConstraint__Group_6__1__Impl10743);
            rule__DecimalConstraint__FixeLenAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getFixeLenAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_6__1__Impl


    // $ANTLR start rule__DecimalConstraint__Group_7__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5366:1: rule__DecimalConstraint__Group_7__0 : rule__DecimalConstraint__Group_7__0__Impl rule__DecimalConstraint__Group_7__1 ;
    public final void rule__DecimalConstraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5370:1: ( rule__DecimalConstraint__Group_7__0__Impl rule__DecimalConstraint__Group_7__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5371:2: rule__DecimalConstraint__Group_7__0__Impl rule__DecimalConstraint__Group_7__1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_7__0__Impl_in_rule__DecimalConstraint__Group_7__010777);
            rule__DecimalConstraint__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DecimalConstraint__Group_7__1_in_rule__DecimalConstraint__Group_7__010780);
            rule__DecimalConstraint__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_7__0


    // $ANTLR start rule__DecimalConstraint__Group_7__0__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5378:1: rule__DecimalConstraint__Group_7__0__Impl : ( 'paddle' ) ;
    public final void rule__DecimalConstraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5382:1: ( ( 'paddle' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5383:1: ( 'paddle' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5383:1: ( 'paddle' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5384:1: 'paddle'
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_7_0()); 
            match(input,48,FOLLOW_48_in_rule__DecimalConstraint__Group_7__0__Impl10808); 
             after(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_7__0__Impl


    // $ANTLR start rule__DecimalConstraint__Group_7__1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5397:1: rule__DecimalConstraint__Group_7__1 : rule__DecimalConstraint__Group_7__1__Impl ;
    public final void rule__DecimalConstraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5401:1: ( rule__DecimalConstraint__Group_7__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5402:2: rule__DecimalConstraint__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__Group_7__1__Impl_in_rule__DecimalConstraint__Group_7__110839);
            rule__DecimalConstraint__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_7__1


    // $ANTLR start rule__DecimalConstraint__Group_7__1__Impl
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5408:1: rule__DecimalConstraint__Group_7__1__Impl : ( ( rule__DecimalConstraint__PaddleAssignment_7_1 ) ) ;
    public final void rule__DecimalConstraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5412:1: ( ( ( rule__DecimalConstraint__PaddleAssignment_7_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5413:1: ( ( rule__DecimalConstraint__PaddleAssignment_7_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5413:1: ( ( rule__DecimalConstraint__PaddleAssignment_7_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5414:1: ( rule__DecimalConstraint__PaddleAssignment_7_1 )
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleAssignment_7_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5415:1: ( rule__DecimalConstraint__PaddleAssignment_7_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5415:2: rule__DecimalConstraint__PaddleAssignment_7_1
            {
            pushFollow(FOLLOW_rule__DecimalConstraint__PaddleAssignment_7_1_in_rule__DecimalConstraint__Group_7__1__Impl10866);
            rule__DecimalConstraint__PaddleAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getDecimalConstraintAccess().getPaddleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__Group_7__1__Impl


    // $ANTLR start rule__EnumerationConstraint__Group__0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5429:1: rule__EnumerationConstraint__Group__0 : rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 ;
    public final void rule__EnumerationConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5433:1: ( rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5434:2: rule__EnumerationConstraint__Group__0__Impl rule__EnumerationConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__010900);
            rule__EnumerationConstraint__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__010903);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5441:1: rule__EnumerationConstraint__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumerationConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5445:1: ( ( 'enum' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5446:1: ( 'enum' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5446:1: ( 'enum' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5447:1: 'enum'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__EnumerationConstraint__Group__0__Impl10931); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5460:1: rule__EnumerationConstraint__Group__1 : rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 ;
    public final void rule__EnumerationConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5464:1: ( rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5465:2: rule__EnumerationConstraint__Group__1__Impl rule__EnumerationConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__110962);
            rule__EnumerationConstraint__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__110965);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5472:1: rule__EnumerationConstraint__Group__1__Impl : ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) ;
    public final void rule__EnumerationConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5476:1: ( ( ( rule__EnumerationConstraint__UsageAssignment_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5477:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5477:1: ( ( rule__EnumerationConstraint__UsageAssignment_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5478:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageAssignment_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5479:1: ( rule__EnumerationConstraint__UsageAssignment_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5479:2: rule__EnumerationConstraint__UsageAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl10992);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5489:1: rule__EnumerationConstraint__Group__2 : rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 ;
    public final void rule__EnumerationConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5493:1: ( rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5494:2: rule__EnumerationConstraint__Group__2__Impl rule__EnumerationConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__211022);
            rule__EnumerationConstraint__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__211025);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5501:1: rule__EnumerationConstraint__Group__2__Impl : ( ( rule__EnumerationConstraint__Group_2__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5505:1: ( ( ( rule__EnumerationConstraint__Group_2__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5506:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5506:1: ( ( rule__EnumerationConstraint__Group_2__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5507:1: ( rule__EnumerationConstraint__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_2()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5508:1: ( rule__EnumerationConstraint__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5508:2: rule__EnumerationConstraint__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl11052);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5518:1: rule__EnumerationConstraint__Group__3 : rule__EnumerationConstraint__Group__3__Impl ;
    public final void rule__EnumerationConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5522:1: ( rule__EnumerationConstraint__Group__3__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5523:2: rule__EnumerationConstraint__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__311083);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5529:1: rule__EnumerationConstraint__Group__3__Impl : ( ( rule__EnumerationConstraint__Group_3__0 )? ) ;
    public final void rule__EnumerationConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5533:1: ( ( ( rule__EnumerationConstraint__Group_3__0 )? ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5534:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5534:1: ( ( rule__EnumerationConstraint__Group_3__0 )? )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5535:1: ( rule__EnumerationConstraint__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationConstraintAccess().getGroup_3()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5536:1: ( rule__EnumerationConstraint__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5536:2: rule__EnumerationConstraint__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl11110);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5554:1: rule__EnumerationConstraint__Group_2__0 : rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 ;
    public final void rule__EnumerationConstraint__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5558:1: ( rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5559:2: rule__EnumerationConstraint__Group_2__0__Impl rule__EnumerationConstraint__Group_2__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__011149);
            rule__EnumerationConstraint__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__011152);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5566:1: rule__EnumerationConstraint__Group_2__0__Impl : ( 'fixeLen' ) ;
    public final void rule__EnumerationConstraint__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5570:1: ( ( 'fixeLen' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5571:1: ( 'fixeLen' )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5571:1: ( 'fixeLen' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5572:1: 'fixeLen'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__EnumerationConstraint__Group_2__0__Impl11180); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5585:1: rule__EnumerationConstraint__Group_2__1 : rule__EnumerationConstraint__Group_2__1__Impl ;
    public final void rule__EnumerationConstraint__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5589:1: ( rule__EnumerationConstraint__Group_2__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5590:2: rule__EnumerationConstraint__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__111211);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5596:1: rule__EnumerationConstraint__Group_2__1__Impl : ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5600:1: ( ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5601:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5601:1: ( ( rule__EnumerationConstraint__FixeLenAssignment_2_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5602:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenAssignment_2_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5603:1: ( rule__EnumerationConstraint__FixeLenAssignment_2_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5603:2: rule__EnumerationConstraint__FixeLenAssignment_2_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl11238);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5617:1: rule__EnumerationConstraint__Group_3__0 : rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 ;
    public final void rule__EnumerationConstraint__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5621:1: ( rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5622:2: rule__EnumerationConstraint__Group_3__0__Impl rule__EnumerationConstraint__Group_3__1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__011272);
            rule__EnumerationConstraint__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__011275);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5629:1: rule__EnumerationConstraint__Group_3__0__Impl : ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5633:1: ( ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5634:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5634:1: ( ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5635:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultAssignment_3_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5636:1: ( rule__EnumerationConstraint__HasDefaultAssignment_3_0 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5636:2: rule__EnumerationConstraint__HasDefaultAssignment_3_0
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl11302);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5646:1: rule__EnumerationConstraint__Group_3__1 : rule__EnumerationConstraint__Group_3__1__Impl ;
    public final void rule__EnumerationConstraint__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5650:1: ( rule__EnumerationConstraint__Group_3__1__Impl )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5651:2: rule__EnumerationConstraint__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__111332);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5657:1: rule__EnumerationConstraint__Group_3__1__Impl : ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) ;
    public final void rule__EnumerationConstraint__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5661:1: ( ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5662:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5662:1: ( ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5663:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringAssignment_3_1()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5664:1: ( rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5664:2: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl11359);
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


    // $ANTLR start rule__DomainModel__ElementsAssignment
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5679:1: rule__DomainModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5683:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5684:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5684:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5685:1: ruleAbstractElement
            {
             before(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11398);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5694:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5698:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5699:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5699:1: ( ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5700:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111429);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5709:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5713:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5714:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5714:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5715:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111460);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5724:1: rule__PackageDeclaration__PrefixAssignment_2_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__PrefixAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5728:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5729:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5729:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5730:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_111491);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5739:1: rule__PackageDeclaration__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5743:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5744:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5744:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5745:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_111522); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5754:1: rule__PackageDeclaration__FormatAssignment_5_0_1 : ( ( 'XSD' ) ) ;
    public final void rule__PackageDeclaration__FormatAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5758:1: ( ( ( 'XSD' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5759:1: ( ( 'XSD' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5759:1: ( ( 'XSD' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5760:1: ( 'XSD' )
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5761:1: ( 'XSD' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5762:1: 'XSD'
            {
             before(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0()); 
            match(input,50,FOLLOW_50_in_rule__PackageDeclaration__FormatAssignment_5_0_111558); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5777:1: rule__PackageDeclaration__DelimiterAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__DelimiterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5781:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5782:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5782:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5783:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getDelimiterSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DelimiterAssignment_6_111597); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5792:1: rule__PackageDeclaration__LinesAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__PackageDeclaration__LinesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5796:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5797:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5797:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5798:1: RULE_STRING
            {
             before(grammarAccess.getPackageDeclarationAccess().getLinesSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PackageDeclaration__LinesAssignment_7_111628); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5807:1: rule__PackageDeclaration__ElementsAssignment_8 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5811:1: ( ( ruleAbstractElement ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5812:1: ( ruleAbstractElement )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5812:1: ( ruleAbstractElement )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5813:1: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_811659);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5822:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5826:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5827:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5827:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5828:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111690); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5837:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5841:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5842:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5842:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5843:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111721); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5852:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5856:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5857:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5857:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5858:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5859:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5860:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_111756);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5871:1: rule__Entity__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5875:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5876:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5876:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5877:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_311791); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5886:1: rule__Entity__FeaturesAssignment_5 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5890:1: ( ( ruleFeature ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5891:1: ( ruleFeature )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5891:1: ( ruleFeature )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5892:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_511822);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5901:1: rule__Feature__ConstraintAssignment_1 : ( ruleConstraint ) ;
    public final void rule__Feature__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5905:1: ( ( ruleConstraint ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5906:1: ( ruleConstraint )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5906:1: ( ruleConstraint )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5907:1: ruleConstraint
            {
             before(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_111853);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5916:1: rule__Feature__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Feature__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5920:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5921:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5921:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5922:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_211884); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5931:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5935:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5936:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5936:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5937:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_011915); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5946:1: rule__Attribute__TypeAssignment_2 : ( ruleTypeRef ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5950:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5951:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5951:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5952:1: ruleTypeRef
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_211946);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5961:1: rule__Reference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Reference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5965:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5966:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5966:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5967:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_111977); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5976:1: rule__Reference__TypeAssignment_3 : ( ruleTypeRef ) ;
    public final void rule__Reference__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5980:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5981:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5981:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5982:1: ruleTypeRef
            {
             before(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312008);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5991:1: rule__Reference__OppositeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__OppositeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5995:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5996:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5996:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5997:1: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5998:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:5999:1: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getOppositeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112043); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6010:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6014:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6015:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6015:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6016:1: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_112078); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6025:1: rule__Enumeration__EnumerationLiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__EnumerationLiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6029:1: ( ( ruleEnumerationLiteral ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6030:1: ( ruleEnumerationLiteral )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6030:1: ( ruleEnumerationLiteral )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6031:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_312109);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6040:1: rule__EnumerationLiteral__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6044:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6045:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6045:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6046:1: RULE_ID
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_012140); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6055:1: rule__EnumerationLiteral__PersistedValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EnumerationLiteral__PersistedValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6059:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6060:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6060:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6061:1: RULE_INT
            {
             before(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_112171); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6070:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6074:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6075:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6075:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6076:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012202); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6085:1: rule__Parameter__TypeAssignment_1 : ( ruleTypeRef ) ;
    public final void rule__Parameter__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6089:1: ( ( ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6090:1: ( ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6090:1: ( ruleTypeRef )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6091:1: ruleTypeRef
            {
             before(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112233);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6100:1: rule__TypeRef__ReferencedAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeRef__ReferencedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6104:1: ( ( ( ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6105:1: ( ( ruleQualifiedName ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6105:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6106:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6107:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6108:1: ruleQualifiedName
            {
             before(grammarAccess.getTypeRefAccess().getReferencedTypeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_012268);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6119:1: rule__TypeRef__MultiAssignment_1 : ( ( '*' ) ) ;
    public final void rule__TypeRef__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6123:1: ( ( ( '*' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6124:1: ( ( '*' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6124:1: ( ( '*' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6125:1: ( '*' )
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6126:1: ( '*' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6127:1: '*'
            {
             before(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__TypeRef__MultiAssignment_112308); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6142:1: rule__TypeRef__OptionAssignment_2 : ( ( '?' ) ) ;
    public final void rule__TypeRef__OptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6146:1: ( ( ( '?' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6147:1: ( ( '?' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6147:1: ( ( '?' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6148:1: ( '?' )
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6149:1: ( '?' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6150:1: '?'
            {
             before(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0()); 
            match(input,52,FOLLOW_52_in_rule__TypeRef__OptionAssignment_212352); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6165:1: rule__BoolConstraint__ConstraintAssignment_0 : ( ( 'boolean' ) ) ;
    public final void rule__BoolConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6169:1: ( ( ( 'boolean' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6170:1: ( ( 'boolean' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6170:1: ( ( 'boolean' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6171:1: ( 'boolean' )
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6172:1: ( 'boolean' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6173:1: 'boolean'
            {
             before(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0()); 
            match(input,53,FOLLOW_53_in_rule__BoolConstraint__ConstraintAssignment_012396); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6188:1: rule__BoolConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__BoolConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6192:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6193:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6193:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6194:1: ( 'default' )
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6195:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6196:1: 'default'
            {
             before(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__BoolConstraint__HasDefaultAssignment_1_012440); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6211:1: rule__BoolConstraint__DefaultValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__BoolConstraint__DefaultValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6215:1: ( ( ( 'true' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6216:1: ( ( 'true' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6216:1: ( ( 'true' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6217:1: ( 'true' )
            {
             before(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6218:1: ( 'true' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6219:1: 'true'
            {
             before(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0()); 
            match(input,55,FOLLOW_55_in_rule__BoolConstraint__DefaultValueAssignment_1_1_012484); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6234:1: rule__StringConstraint__ConstraintAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__StringConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6238:1: ( ( ( 'string' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6239:1: ( ( 'string' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6239:1: ( ( 'string' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6240:1: ( 'string' )
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6241:1: ( 'string' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6242:1: 'string'
            {
             before(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0()); 
            match(input,56,FOLLOW_56_in_rule__StringConstraint__ConstraintAssignment_012528); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6257:1: rule__StringConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__StringConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6261:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6262:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6262:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6263:1: ( 'default' )
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6264:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6265:1: 'default'
            {
             before(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__StringConstraint__HasDefaultAssignment_1_012572); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6280:1: rule__StringConstraint__DefaultValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6284:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6285:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6285:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6286:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__DefaultValueAssignment_1_112611); 
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


    // $ANTLR start rule__StringConstraint__IsFixedAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6295:1: rule__StringConstraint__IsFixedAssignment_2_0 : ( ( 'fixed' ) ) ;
    public final void rule__StringConstraint__IsFixedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6299:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6300:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6300:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6301:1: ( 'fixed' )
            {
             before(grammarAccess.getStringConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6302:1: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6303:1: 'fixed'
            {
             before(grammarAccess.getStringConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            match(input,57,FOLLOW_57_in_rule__StringConstraint__IsFixedAssignment_2_012647); 
             after(grammarAccess.getStringConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }

             after(grammarAccess.getStringConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__IsFixedAssignment_2_0


    // $ANTLR start rule__StringConstraint__FixedValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6318:1: rule__StringConstraint__FixedValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__FixedValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6322:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6323:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6323:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6324:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__FixedValueAssignment_2_112686); 
             after(grammarAccess.getStringConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__FixedValueAssignment_2_1


    // $ANTLR start rule__StringConstraint__MinLenAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6333:1: rule__StringConstraint__MinLenAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__MinLenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6337:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6338:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6338:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6339:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getMinLenINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__MinLenAssignment_3_112717); 
             after(grammarAccess.getStringConstraintAccess().getMinLenINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__MinLenAssignment_3_1


    // $ANTLR start rule__StringConstraint__MaxLenAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6348:1: rule__StringConstraint__MaxLenAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__MaxLenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6352:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6353:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6353:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6354:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__MaxLenAssignment_4_112748); 
             after(grammarAccess.getStringConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__MaxLenAssignment_4_1


    // $ANTLR start rule__StringConstraint__FixeLenAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6363:1: rule__StringConstraint__FixeLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__StringConstraint__FixeLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6367:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6368:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6368:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6369:1: RULE_INT
            {
             before(grammarAccess.getStringConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringConstraint__FixeLenAssignment_5_112779); 
             after(grammarAccess.getStringConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__FixeLenAssignment_5_1


    // $ANTLR start rule__StringConstraint__IsXSDAttAssignment_6
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6378:1: rule__StringConstraint__IsXSDAttAssignment_6 : ( ( 'xsd Att.' ) ) ;
    public final void rule__StringConstraint__IsXSDAttAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6382:1: ( ( ( 'xsd Att.' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6383:1: ( ( 'xsd Att.' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6383:1: ( ( 'xsd Att.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6384:1: ( 'xsd Att.' )
            {
             before(grammarAccess.getStringConstraintAccess().getIsXSDAttXsdAttKeyword_6_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6385:1: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6386:1: 'xsd Att.'
            {
             before(grammarAccess.getStringConstraintAccess().getIsXSDAttXsdAttKeyword_6_0()); 
            match(input,58,FOLLOW_58_in_rule__StringConstraint__IsXSDAttAssignment_612815); 
             after(grammarAccess.getStringConstraintAccess().getIsXSDAttXsdAttKeyword_6_0()); 

            }

             after(grammarAccess.getStringConstraintAccess().getIsXSDAttXsdAttKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__IsXSDAttAssignment_6


    // $ANTLR start rule__StringConstraint__RegularExpressionAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6401:1: rule__StringConstraint__RegularExpressionAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__StringConstraint__RegularExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6405:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6406:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6406:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6407:1: RULE_STRING
            {
             before(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_7_112854); 
             after(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StringConstraint__RegularExpressionAssignment_7_1


    // $ANTLR start rule__DateTimeConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6416:1: rule__DateTimeConstraint__ConstraintAssignment_0 : ( ( 'datetime' ) ) ;
    public final void rule__DateTimeConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6420:1: ( ( ( 'datetime' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6421:1: ( ( 'datetime' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6421:1: ( ( 'datetime' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6422:1: ( 'datetime' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6423:1: ( 'datetime' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6424:1: 'datetime'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0()); 
            match(input,59,FOLLOW_59_in_rule__DateTimeConstraint__ConstraintAssignment_012890); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6439:1: rule__DateTimeConstraint__DataTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DateTimeConstraint__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6443:1: ( ( ( RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6444:1: ( ( RULE_ID ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6444:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6445:1: ( RULE_ID )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6446:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6447:1: RULE_ID
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_112933); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6458:1: rule__DateTimeConstraint__HasDefaultAssignment_2_0 : ( ( 'default' ) ) ;
    public final void rule__DateTimeConstraint__HasDefaultAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6462:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6463:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6463:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6464:1: ( 'default' )
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6465:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6466:1: 'default'
            {
             before(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0()); 
            match(input,54,FOLLOW_54_in_rule__DateTimeConstraint__HasDefaultAssignment_2_012973); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6481:1: rule__DateTimeConstraint__DefaultValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DateTimeConstraint__DefaultValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6485:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6486:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6486:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6487:1: RULE_STRING
            {
             before(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_113012); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6496:1: rule__IntegerConstraint__ConstraintAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__IntegerConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6500:1: ( ( ( 'integer' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6501:1: ( ( 'integer' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6501:1: ( ( 'integer' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6502:1: ( 'integer' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6503:1: ( 'integer' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6504:1: 'integer'
            {
             before(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0()); 
            match(input,60,FOLLOW_60_in_rule__IntegerConstraint__ConstraintAssignment_013048); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6519:1: rule__IntegerConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__IntegerConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6523:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6524:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6524:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6525:1: ( 'default' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6526:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6527:1: 'default'
            {
             before(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__IntegerConstraint__HasDefaultAssignment_1_013092); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6542:1: rule__IntegerConstraint__DefaultValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6546:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6547:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6547:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6548:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getDefaultValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__DefaultValueAssignment_1_113131); 
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


    // $ANTLR start rule__IntegerConstraint__IsFixedAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6557:1: rule__IntegerConstraint__IsFixedAssignment_2_0 : ( ( 'fixed' ) ) ;
    public final void rule__IntegerConstraint__IsFixedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6561:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6562:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6562:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6563:1: ( 'fixed' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6564:1: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6565:1: 'fixed'
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            match(input,57,FOLLOW_57_in_rule__IntegerConstraint__IsFixedAssignment_2_013167); 
             after(grammarAccess.getIntegerConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }

             after(grammarAccess.getIntegerConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__IsFixedAssignment_2_0


    // $ANTLR start rule__IntegerConstraint__FixedValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6580:1: rule__IntegerConstraint__FixedValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__FixedValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6584:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6585:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6585:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6586:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixedValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixedValueAssignment_2_113206); 
             after(grammarAccess.getIntegerConstraintAccess().getFixedValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__FixedValueAssignment_2_1


    // $ANTLR start rule__IntegerConstraint__MinValueAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6595:1: rule__IntegerConstraint__MinValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MinValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6599:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6600:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6600:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6601:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MinValueAssignment_3_113237); 
             after(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MinValueAssignment_3_1


    // $ANTLR start rule__IntegerConstraint__MaxValueAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6610:1: rule__IntegerConstraint__MaxValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MaxValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6614:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6615:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6615:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6616:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxValueAssignment_4_113268); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MaxValueAssignment_4_1


    // $ANTLR start rule__IntegerConstraint__MaxLenAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6625:1: rule__IntegerConstraint__MaxLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__MaxLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6629:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6630:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6630:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6631:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxLenAssignment_5_113299); 
             after(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__MaxLenAssignment_5_1


    // $ANTLR start rule__IntegerConstraint__FixeLenAssignment_6_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6640:1: rule__IntegerConstraint__FixeLenAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__IntegerConstraint__FixeLenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6644:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6645:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6645:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6646:1: RULE_INT
            {
             before(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixeLenAssignment_6_113330); 
             after(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__FixeLenAssignment_6_1


    // $ANTLR start rule__IntegerConstraint__PaddleAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6655:1: rule__IntegerConstraint__PaddleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__IntegerConstraint__PaddleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6659:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6660:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6660:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6661:1: RULE_STRING
            {
             before(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IntegerConstraint__PaddleAssignment_7_113361); 
             after(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__PaddleAssignment_7_1


    // $ANTLR start rule__IntegerConstraint__IsXSDAttAssignment_8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6670:1: rule__IntegerConstraint__IsXSDAttAssignment_8 : ( ( 'xsd Att.' ) ) ;
    public final void rule__IntegerConstraint__IsXSDAttAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6674:1: ( ( ( 'xsd Att.' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6675:1: ( ( 'xsd Att.' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6675:1: ( ( 'xsd Att.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6676:1: ( 'xsd Att.' )
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6677:1: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6678:1: 'xsd Att.'
            {
             before(grammarAccess.getIntegerConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            match(input,58,FOLLOW_58_in_rule__IntegerConstraint__IsXSDAttAssignment_813397); 
             after(grammarAccess.getIntegerConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }

             after(grammarAccess.getIntegerConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__IntegerConstraint__IsXSDAttAssignment_8


    // $ANTLR start rule__DecimalConstraint__ConstraintAssignment_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6693:1: rule__DecimalConstraint__ConstraintAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__DecimalConstraint__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6697:1: ( ( ( 'decimal' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6698:1: ( ( 'decimal' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6698:1: ( ( 'decimal' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6699:1: ( 'decimal' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6700:1: ( 'decimal' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6701:1: 'decimal'
            {
             before(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0()); 
            match(input,61,FOLLOW_61_in_rule__DecimalConstraint__ConstraintAssignment_013441); 
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


    // $ANTLR start rule__DecimalConstraint__HasDefaultAssignment_1_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6716:1: rule__DecimalConstraint__HasDefaultAssignment_1_0 : ( ( 'default' ) ) ;
    public final void rule__DecimalConstraint__HasDefaultAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6720:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6721:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6721:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6722:1: ( 'default' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6723:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6724:1: 'default'
            {
             before(grammarAccess.getDecimalConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 
            match(input,54,FOLLOW_54_in_rule__DecimalConstraint__HasDefaultAssignment_1_013485); 
             after(grammarAccess.getDecimalConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }

             after(grammarAccess.getDecimalConstraintAccess().getHasDefaultDefaultKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__HasDefaultAssignment_1_0


    // $ANTLR start rule__DecimalConstraint__DefaultValueAssignment_1_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6739:1: rule__DecimalConstraint__DefaultValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__DecimalConstraint__DefaultValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6743:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6744:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6744:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6745:1: RULE_STRING
            {
             before(grammarAccess.getDecimalConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalConstraint__DefaultValueAssignment_1_113524); 
             after(grammarAccess.getDecimalConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__DefaultValueAssignment_1_1


    // $ANTLR start rule__DecimalConstraint__IsFixedAssignment_2_0
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6754:1: rule__DecimalConstraint__IsFixedAssignment_2_0 : ( ( 'fixed' ) ) ;
    public final void rule__DecimalConstraint__IsFixedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6758:1: ( ( ( 'fixed' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6759:1: ( ( 'fixed' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6759:1: ( ( 'fixed' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6760:1: ( 'fixed' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6761:1: ( 'fixed' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6762:1: 'fixed'
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 
            match(input,57,FOLLOW_57_in_rule__DecimalConstraint__IsFixedAssignment_2_013560); 
             after(grammarAccess.getDecimalConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }

             after(grammarAccess.getDecimalConstraintAccess().getIsFixedFixedKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__IsFixedAssignment_2_0


    // $ANTLR start rule__DecimalConstraint__FixedValueAssignment_2_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6777:1: rule__DecimalConstraint__FixedValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DecimalConstraint__FixedValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6781:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6782:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6782:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6783:1: RULE_STRING
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalConstraint__FixedValueAssignment_2_113599); 
             after(grammarAccess.getDecimalConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__FixedValueAssignment_2_1


    // $ANTLR start rule__DecimalConstraint__MinValueAssignment_3_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6792:1: rule__DecimalConstraint__MinValueAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MinValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6796:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6797:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6797:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6798:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MinValueAssignment_3_113630); 
             after(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MinValueAssignment_3_1


    // $ANTLR start rule__DecimalConstraint__MaxValueAssignment_4_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6807:1: rule__DecimalConstraint__MaxValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MaxValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6811:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6812:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6812:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6813:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxValueAssignment_4_113661); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MaxValueAssignment_4_1


    // $ANTLR start rule__DecimalConstraint__MaxLenAssignment_5_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6822:1: rule__DecimalConstraint__MaxLenAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__MaxLenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6826:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6827:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6827:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6828:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxLenAssignment_5_113692); 
             after(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__MaxLenAssignment_5_1


    // $ANTLR start rule__DecimalConstraint__FixeLenAssignment_6_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6837:1: rule__DecimalConstraint__FixeLenAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__DecimalConstraint__FixeLenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6841:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6842:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6842:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6843:1: RULE_INT
            {
             before(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DecimalConstraint__FixeLenAssignment_6_113723); 
             after(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__FixeLenAssignment_6_1


    // $ANTLR start rule__DecimalConstraint__PaddleAssignment_7_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6852:1: rule__DecimalConstraint__PaddleAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__DecimalConstraint__PaddleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6856:1: ( ( RULE_STRING ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6857:1: ( RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6857:1: ( RULE_STRING )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6858:1: RULE_STRING
            {
             before(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DecimalConstraint__PaddleAssignment_7_113754); 
             after(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__PaddleAssignment_7_1


    // $ANTLR start rule__DecimalConstraint__IsXSDAttAssignment_8
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6867:1: rule__DecimalConstraint__IsXSDAttAssignment_8 : ( ( 'xsd Att.' ) ) ;
    public final void rule__DecimalConstraint__IsXSDAttAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6871:1: ( ( ( 'xsd Att.' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6872:1: ( ( 'xsd Att.' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6872:1: ( ( 'xsd Att.' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6873:1: ( 'xsd Att.' )
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6874:1: ( 'xsd Att.' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6875:1: 'xsd Att.'
            {
             before(grammarAccess.getDecimalConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 
            match(input,58,FOLLOW_58_in_rule__DecimalConstraint__IsXSDAttAssignment_813790); 
             after(grammarAccess.getDecimalConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }

             after(grammarAccess.getDecimalConstraintAccess().getIsXSDAttXsdAttKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DecimalConstraint__IsXSDAttAssignment_8


    // $ANTLR start rule__EnumerationConstraint__UsageAssignment_1
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6890:1: rule__EnumerationConstraint__UsageAssignment_1 : ( ruleEnumUsage ) ;
    public final void rule__EnumerationConstraint__UsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6894:1: ( ( ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6895:1: ( ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6895:1: ( ruleEnumUsage )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6896:1: ruleEnumUsage
            {
             before(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_113829);
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6905:1: rule__EnumerationConstraint__FixeLenAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EnumerationConstraint__FixeLenAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6909:1: ( ( RULE_INT ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6910:1: ( RULE_INT )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6910:1: ( RULE_INT )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6911:1: RULE_INT
            {
             before(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_113860); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6920:1: rule__EnumerationConstraint__HasDefaultAssignment_3_0 : ( ( 'default' ) ) ;
    public final void rule__EnumerationConstraint__HasDefaultAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6924:1: ( ( ( 'default' ) ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6925:1: ( ( 'default' ) )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6925:1: ( ( 'default' ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6926:1: ( 'default' )
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6927:1: ( 'default' )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6928:1: 'default'
            {
             before(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0()); 
            match(input,54,FOLLOW_54_in_rule__EnumerationConstraint__HasDefaultAssignment_3_013896); 
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
    // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6943:1: rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6947:1: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6948:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6948:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom.ui/src-gen/fr/chaunier/xtext/bom/ui/contentassist/antlr/internal/InternalBomDsl.g:6949:1: RULE_ID
            {
             before(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_113935); 
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


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000860300002L});
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
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0_in_ruleTypeRef937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint1084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Alternatives_in_ruleConstraint1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__0_in_ruleBoolConstraint1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0_in_ruleStringConstraint1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0_in_ruleDateTimeConstraint1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0_in_ruleIntegerConstraint1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0_in_ruleDecimalConstraint1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0_in_ruleEnumerationConstraint1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumUsage__Alternatives_in_ruleEnumUsage1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__AbstractElement__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__AbstractElement__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__AbstractElement__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__0_in_rule__PackageDeclaration__Alternatives_51615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PackageDeclaration__Alternatives_51634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PackageDeclaration__Alternatives_51654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PackageDeclaration__Alternatives_51674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PackageDeclaration__Alternatives_51694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Type__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__Type__Alternatives1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StructuralFeature__Alternatives1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__StructuralFeature__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_rule__Constraint__Alternatives1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_rule__Constraint__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_rule__Constraint__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_rule__Constraint__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_rule__Constraint__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_rule__Constraint__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__DefaultValueAssignment_1_1_0_in_rule__BoolConstraint__Alternatives_1_11961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BoolConstraint__Alternatives_1_11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EnumUsage__Alternatives2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EnumUsage__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EnumUsage__Alternatives2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EnumUsage__Alternatives2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Import__Group__0__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__02234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PackageDeclaration__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__12296 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2_in_rule__PackageDeclaration__Group__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__2__Impl_in_rule__PackageDeclaration__Group__22356 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3_in_rule__PackageDeclaration__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0_in_rule__PackageDeclaration__Group__2__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__3__Impl_in_rule__PackageDeclaration__Group__32416 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4_in_rule__PackageDeclaration__Group__32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0_in_rule__PackageDeclaration__Group__3__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__4__Impl_in_rule__PackageDeclaration__Group__42476 = new BitSet(new long[]{0x000000087CB07800L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5_in_rule__PackageDeclaration__Group__42479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PackageDeclaration__Group__4__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__5__Impl_in_rule__PackageDeclaration__Group__52538 = new BitSet(new long[]{0x0000000878B00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6_in_rule__PackageDeclaration__Group__52541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Alternatives_5_in_rule__PackageDeclaration__Group__5__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__6__Impl_in_rule__PackageDeclaration__Group__62599 = new BitSet(new long[]{0x0000000870B00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7_in_rule__PackageDeclaration__Group__62602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__0_in_rule__PackageDeclaration__Group__6__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__7__Impl_in_rule__PackageDeclaration__Group__72660 = new BitSet(new long[]{0x0000000860B00000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__8_in_rule__PackageDeclaration__Group__72663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__0_in_rule__PackageDeclaration__Group__7__Impl2690 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__8__Impl_in_rule__PackageDeclaration__Group__82721 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__9_in_rule__PackageDeclaration__Group__82724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__ElementsAssignment_8_in_rule__PackageDeclaration__Group__8__Impl2751 = new BitSet(new long[]{0x0000000860300002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__9__Impl_in_rule__PackageDeclaration__Group__92782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PackageDeclaration__Group__9__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__0__Impl_in_rule__PackageDeclaration__Group_2__02861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1_in_rule__PackageDeclaration__Group_2__02864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PackageDeclaration__Group_2__0__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_2__1__Impl_in_rule__PackageDeclaration__Group_2__12923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__PrefixAssignment_2_1_in_rule__PackageDeclaration__Group_2__1__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__0__Impl_in_rule__PackageDeclaration__Group_3__02984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1_in_rule__PackageDeclaration__Group_3__02987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PackageDeclaration__Group_3__0__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_3__1__Impl_in_rule__PackageDeclaration__Group_3__13046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NamespaceAssignment_3_1_in_rule__PackageDeclaration__Group_3__1__Impl3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__0__Impl_in_rule__PackageDeclaration__Group_5_0__03107 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__1_in_rule__PackageDeclaration__Group_5_0__03110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PackageDeclaration__Group_5_0__0__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_5_0__1__Impl_in_rule__PackageDeclaration__Group_5_0__13169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__FormatAssignment_5_0_1_in_rule__PackageDeclaration__Group_5_0__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__0__Impl_in_rule__PackageDeclaration__Group_6__03230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__1_in_rule__PackageDeclaration__Group_6__03233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PackageDeclaration__Group_6__0__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_6__1__Impl_in_rule__PackageDeclaration__Group_6__13292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__DelimiterAssignment_6_1_in_rule__PackageDeclaration__Group_6__1__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__0__Impl_in_rule__PackageDeclaration__Group_7__03353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__1_in_rule__PackageDeclaration__Group_7__03356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PackageDeclaration__Group_7__0__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group_7__1__Impl_in_rule__PackageDeclaration__Group_7__13415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__LinesAssignment_7_1_in_rule__PackageDeclaration__Group_7__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataType__Group__0__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Entity__Group__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13661 = new BitSet(new long[]{0x0000000080400020L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23721 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33782 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_3_in_rule__Entity__Group__3__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43843 = new BitSet(new long[]{0x0000000200800010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__4__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53905 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__53908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_in_rule__Entity__Group__5__Impl3935 = new BitSet(new long[]{0x0000000200000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__63966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__6__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__04039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Entity__Group_2__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__04162 = new BitSet(new long[]{0x3922000000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__04165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_rule__Feature__Group__0__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__14221 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__14224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ConstraintAssignment_1_in_rule__Feature__Group__1__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__24282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__DescriptionAssignment_2_in_rule__Feature__Group__2__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04346 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attribute__Group__1__Impl4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Reference__Group__0__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14593 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__NameAssignment_1_in_rule__Reference__Group__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Reference__Group__2__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34715 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_3_in_rule__Reference__Group__3__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0_in_rule__Reference__Group__4__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__0__Impl_in_rule__Reference__Group_4__04843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1_in_rule__Reference__Group_4__04846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Reference__Group_4__0__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group_4__1__Impl_in_rule__Reference__Group_4__14905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__OppositeAssignment_4_1_in_rule__Reference__Group_4__1__Impl4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Enumeration__Group__0__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__15028 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__15031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__25088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__25091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Enumeration__Group__2__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__35150 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__35153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5182 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__EnumerationLiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl5194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__45227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Enumeration__Group__4__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__05296 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__05299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__15356 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__15359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0_in_rule__EnumerationLiteral__Group__1__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__25416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EnumerationLiteral__Group__2__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__0__Impl_in_rule__EnumerationLiteral__Group_1__05481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1_in_rule__EnumerationLiteral__Group_1__05484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EnumerationLiteral__Group_1__0__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group_1__1__Impl_in_rule__EnumerationLiteral__Group_1__15543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__PersistedValueAssignment_1_1_in_rule__EnumerationLiteral__Group_1__1__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_in_rule__Parameter__Group__1__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__0__Impl_in_rule__TypeRef__Group__05725 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1_in_rule__TypeRef__Group__05728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__ReferencedAssignment_0_in_rule__TypeRef__Group__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__1__Impl_in_rule__TypeRef__Group__15785 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2_in_rule__TypeRef__Group__15788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__MultiAssignment_1_in_rule__TypeRef__Group__1__Impl5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__Group__2__Impl_in_rule__TypeRef__Group__25846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeRef__OptionAssignment_2_in_rule__TypeRef__Group__2__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__05910 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__05913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__15969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildCard__Group__1__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06035 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6121 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__QualifiedName__Group_1__0__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__0__Impl_in_rule__BoolConstraint__Group__06278 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__1_in_rule__BoolConstraint__Group__06281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__ConstraintAssignment_0_in_rule__BoolConstraint__Group__0__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group__1__Impl_in_rule__BoolConstraint__Group__16338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__0_in_rule__BoolConstraint__Group__1__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__0__Impl_in_rule__BoolConstraint__Group_1__06400 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__1_in_rule__BoolConstraint__Group_1__06403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__HasDefaultAssignment_1_0_in_rule__BoolConstraint__Group_1__0__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Group_1__1__Impl_in_rule__BoolConstraint__Group_1__16460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolConstraint__Alternatives_1_1_in_rule__BoolConstraint__Group_1__1__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__0__Impl_in_rule__StringConstraint__Group__06521 = new BitSet(new long[]{0x06403C0000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1_in_rule__StringConstraint__Group__06524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__ConstraintAssignment_0_in_rule__StringConstraint__Group__0__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__1__Impl_in_rule__StringConstraint__Group__16581 = new BitSet(new long[]{0x06003C0000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2_in_rule__StringConstraint__Group__16584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__0_in_rule__StringConstraint__Group__1__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__2__Impl_in_rule__StringConstraint__Group__26642 = new BitSet(new long[]{0x04003C0000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__3_in_rule__StringConstraint__Group__26645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0_in_rule__StringConstraint__Group__2__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__3__Impl_in_rule__StringConstraint__Group__36703 = new BitSet(new long[]{0x0400380000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__4_in_rule__StringConstraint__Group__36706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__0_in_rule__StringConstraint__Group__3__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__4__Impl_in_rule__StringConstraint__Group__46764 = new BitSet(new long[]{0x0400300000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__5_in_rule__StringConstraint__Group__46767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__0_in_rule__StringConstraint__Group__4__Impl6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__5__Impl_in_rule__StringConstraint__Group__56825 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__6_in_rule__StringConstraint__Group__56828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__0_in_rule__StringConstraint__Group__5__Impl6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__6__Impl_in_rule__StringConstraint__Group__66886 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__7_in_rule__StringConstraint__Group__66889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__IsXSDAttAssignment_6_in_rule__StringConstraint__Group__6__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group__7__Impl_in_rule__StringConstraint__Group__76947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_7__0_in_rule__StringConstraint__Group__7__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__0__Impl_in_rule__StringConstraint__Group_1__07021 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__1_in_rule__StringConstraint__Group_1__07024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__HasDefaultAssignment_1_0_in_rule__StringConstraint__Group_1__0__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_1__1__Impl_in_rule__StringConstraint__Group_1__17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__DefaultValueAssignment_1_1_in_rule__StringConstraint__Group_1__1__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__0__Impl_in_rule__StringConstraint__Group_2__07142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1_in_rule__StringConstraint__Group_2__07145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__IsFixedAssignment_2_0_in_rule__StringConstraint__Group_2__0__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_2__1__Impl_in_rule__StringConstraint__Group_2__17202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__FixedValueAssignment_2_1_in_rule__StringConstraint__Group_2__1__Impl7229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__0__Impl_in_rule__StringConstraint__Group_3__07263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__1_in_rule__StringConstraint__Group_3__07266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StringConstraint__Group_3__0__Impl7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_3__1__Impl_in_rule__StringConstraint__Group_3__17325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__MinLenAssignment_3_1_in_rule__StringConstraint__Group_3__1__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__0__Impl_in_rule__StringConstraint__Group_4__07386 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__1_in_rule__StringConstraint__Group_4__07389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StringConstraint__Group_4__0__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_4__1__Impl_in_rule__StringConstraint__Group_4__17448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__MaxLenAssignment_4_1_in_rule__StringConstraint__Group_4__1__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__0__Impl_in_rule__StringConstraint__Group_5__07509 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__1_in_rule__StringConstraint__Group_5__07512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__StringConstraint__Group_5__0__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_5__1__Impl_in_rule__StringConstraint__Group_5__17571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__FixeLenAssignment_5_1_in_rule__StringConstraint__Group_5__1__Impl7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_7__0__Impl_in_rule__StringConstraint__Group_7__07632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_7__1_in_rule__StringConstraint__Group_7__07635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__StringConstraint__Group_7__0__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__Group_7__1__Impl_in_rule__StringConstraint__Group_7__17694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringConstraint__RegularExpressionAssignment_7_1_in_rule__StringConstraint__Group_7__1__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__0__Impl_in_rule__DateTimeConstraint__Group__07755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1_in_rule__DateTimeConstraint__Group__07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__ConstraintAssignment_0_in_rule__DateTimeConstraint__Group__0__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__1__Impl_in_rule__DateTimeConstraint__Group__17815 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2_in_rule__DateTimeConstraint__Group__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DataTypeAssignment_1_in_rule__DateTimeConstraint__Group__1__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group__2__Impl_in_rule__DateTimeConstraint__Group__27875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0_in_rule__DateTimeConstraint__Group__2__Impl7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__0__Impl_in_rule__DateTimeConstraint__Group_2__07939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1_in_rule__DateTimeConstraint__Group_2__07942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__HasDefaultAssignment_2_0_in_rule__DateTimeConstraint__Group_2__0__Impl7969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__Group_2__1__Impl_in_rule__DateTimeConstraint__Group_2__17999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateTimeConstraint__DefaultValueAssignment_2_1_in_rule__DateTimeConstraint__Group_2__1__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__0__Impl_in_rule__IntegerConstraint__Group__08060 = new BitSet(new long[]{0x0641D80000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1_in_rule__IntegerConstraint__Group__08063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__ConstraintAssignment_0_in_rule__IntegerConstraint__Group__0__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__1__Impl_in_rule__IntegerConstraint__Group__18120 = new BitSet(new long[]{0x0601D80000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__2_in_rule__IntegerConstraint__Group__18123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__0_in_rule__IntegerConstraint__Group__1__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__2__Impl_in_rule__IntegerConstraint__Group__28181 = new BitSet(new long[]{0x0401D80000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__3_in_rule__IntegerConstraint__Group__28184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__0_in_rule__IntegerConstraint__Group__2__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__3__Impl_in_rule__IntegerConstraint__Group__38242 = new BitSet(new long[]{0x0401980000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__4_in_rule__IntegerConstraint__Group__38245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__0_in_rule__IntegerConstraint__Group__3__Impl8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__4__Impl_in_rule__IntegerConstraint__Group__48303 = new BitSet(new long[]{0x0401180000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__5_in_rule__IntegerConstraint__Group__48306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__0_in_rule__IntegerConstraint__Group__4__Impl8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__5__Impl_in_rule__IntegerConstraint__Group__58364 = new BitSet(new long[]{0x0401100000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__6_in_rule__IntegerConstraint__Group__58367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__0_in_rule__IntegerConstraint__Group__5__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__6__Impl_in_rule__IntegerConstraint__Group__68425 = new BitSet(new long[]{0x0401000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__7_in_rule__IntegerConstraint__Group__68428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__0_in_rule__IntegerConstraint__Group__6__Impl8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__7__Impl_in_rule__IntegerConstraint__Group__78486 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__8_in_rule__IntegerConstraint__Group__78489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_7__0_in_rule__IntegerConstraint__Group__7__Impl8516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group__8__Impl_in_rule__IntegerConstraint__Group__88547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__IsXSDAttAssignment_8_in_rule__IntegerConstraint__Group__8__Impl8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__0__Impl_in_rule__IntegerConstraint__Group_1__08623 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__1_in_rule__IntegerConstraint__Group_1__08626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__HasDefaultAssignment_1_0_in_rule__IntegerConstraint__Group_1__0__Impl8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_1__1__Impl_in_rule__IntegerConstraint__Group_1__18683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__DefaultValueAssignment_1_1_in_rule__IntegerConstraint__Group_1__1__Impl8710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__0__Impl_in_rule__IntegerConstraint__Group_2__08744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__1_in_rule__IntegerConstraint__Group_2__08747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__IsFixedAssignment_2_0_in_rule__IntegerConstraint__Group_2__0__Impl8774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_2__1__Impl_in_rule__IntegerConstraint__Group_2__18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__FixedValueAssignment_2_1_in_rule__IntegerConstraint__Group_2__1__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__0__Impl_in_rule__IntegerConstraint__Group_3__08865 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__1_in_rule__IntegerConstraint__Group_3__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__IntegerConstraint__Group_3__0__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_3__1__Impl_in_rule__IntegerConstraint__Group_3__18927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MinValueAssignment_3_1_in_rule__IntegerConstraint__Group_3__1__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__0__Impl_in_rule__IntegerConstraint__Group_4__08988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__1_in_rule__IntegerConstraint__Group_4__08991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__IntegerConstraint__Group_4__0__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_4__1__Impl_in_rule__IntegerConstraint__Group_4__19050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MaxValueAssignment_4_1_in_rule__IntegerConstraint__Group_4__1__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__0__Impl_in_rule__IntegerConstraint__Group_5__09111 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__1_in_rule__IntegerConstraint__Group_5__09114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IntegerConstraint__Group_5__0__Impl9142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_5__1__Impl_in_rule__IntegerConstraint__Group_5__19173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__MaxLenAssignment_5_1_in_rule__IntegerConstraint__Group_5__1__Impl9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__0__Impl_in_rule__IntegerConstraint__Group_6__09234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__1_in_rule__IntegerConstraint__Group_6__09237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IntegerConstraint__Group_6__0__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_6__1__Impl_in_rule__IntegerConstraint__Group_6__19296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__FixeLenAssignment_6_1_in_rule__IntegerConstraint__Group_6__1__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_7__0__Impl_in_rule__IntegerConstraint__Group_7__09357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_7__1_in_rule__IntegerConstraint__Group_7__09360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__IntegerConstraint__Group_7__0__Impl9388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__Group_7__1__Impl_in_rule__IntegerConstraint__Group_7__19419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerConstraint__PaddleAssignment_7_1_in_rule__IntegerConstraint__Group_7__1__Impl9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__0__Impl_in_rule__DecimalConstraint__Group__09480 = new BitSet(new long[]{0x0641D80000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1_in_rule__DecimalConstraint__Group__09483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__ConstraintAssignment_0_in_rule__DecimalConstraint__Group__0__Impl9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__1__Impl_in_rule__DecimalConstraint__Group__19540 = new BitSet(new long[]{0x0601D80000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__2_in_rule__DecimalConstraint__Group__19543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__0_in_rule__DecimalConstraint__Group__1__Impl9570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__2__Impl_in_rule__DecimalConstraint__Group__29601 = new BitSet(new long[]{0x0401D80000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__3_in_rule__DecimalConstraint__Group__29604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__0_in_rule__DecimalConstraint__Group__2__Impl9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__3__Impl_in_rule__DecimalConstraint__Group__39662 = new BitSet(new long[]{0x0401980000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__4_in_rule__DecimalConstraint__Group__39665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__0_in_rule__DecimalConstraint__Group__3__Impl9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__4__Impl_in_rule__DecimalConstraint__Group__49723 = new BitSet(new long[]{0x0401180000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__5_in_rule__DecimalConstraint__Group__49726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__0_in_rule__DecimalConstraint__Group__4__Impl9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__5__Impl_in_rule__DecimalConstraint__Group__59784 = new BitSet(new long[]{0x0401100000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__6_in_rule__DecimalConstraint__Group__59787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__0_in_rule__DecimalConstraint__Group__5__Impl9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__6__Impl_in_rule__DecimalConstraint__Group__69845 = new BitSet(new long[]{0x0401000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__7_in_rule__DecimalConstraint__Group__69848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_6__0_in_rule__DecimalConstraint__Group__6__Impl9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__7__Impl_in_rule__DecimalConstraint__Group__79906 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__8_in_rule__DecimalConstraint__Group__79909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_7__0_in_rule__DecimalConstraint__Group__7__Impl9936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group__8__Impl_in_rule__DecimalConstraint__Group__89967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__IsXSDAttAssignment_8_in_rule__DecimalConstraint__Group__8__Impl9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__0__Impl_in_rule__DecimalConstraint__Group_1__010043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__1_in_rule__DecimalConstraint__Group_1__010046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__HasDefaultAssignment_1_0_in_rule__DecimalConstraint__Group_1__0__Impl10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_1__1__Impl_in_rule__DecimalConstraint__Group_1__110103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__DefaultValueAssignment_1_1_in_rule__DecimalConstraint__Group_1__1__Impl10130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__0__Impl_in_rule__DecimalConstraint__Group_2__010164 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__1_in_rule__DecimalConstraint__Group_2__010167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__IsFixedAssignment_2_0_in_rule__DecimalConstraint__Group_2__0__Impl10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_2__1__Impl_in_rule__DecimalConstraint__Group_2__110224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__FixedValueAssignment_2_1_in_rule__DecimalConstraint__Group_2__1__Impl10251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__0__Impl_in_rule__DecimalConstraint__Group_3__010285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__1_in_rule__DecimalConstraint__Group_3__010288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__DecimalConstraint__Group_3__0__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_3__1__Impl_in_rule__DecimalConstraint__Group_3__110347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MinValueAssignment_3_1_in_rule__DecimalConstraint__Group_3__1__Impl10374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__0__Impl_in_rule__DecimalConstraint__Group_4__010408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__1_in_rule__DecimalConstraint__Group_4__010411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DecimalConstraint__Group_4__0__Impl10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_4__1__Impl_in_rule__DecimalConstraint__Group_4__110470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MaxValueAssignment_4_1_in_rule__DecimalConstraint__Group_4__1__Impl10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__0__Impl_in_rule__DecimalConstraint__Group_5__010531 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__1_in_rule__DecimalConstraint__Group_5__010534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__DecimalConstraint__Group_5__0__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_5__1__Impl_in_rule__DecimalConstraint__Group_5__110593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__MaxLenAssignment_5_1_in_rule__DecimalConstraint__Group_5__1__Impl10620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_6__0__Impl_in_rule__DecimalConstraint__Group_6__010654 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_6__1_in_rule__DecimalConstraint__Group_6__010657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DecimalConstraint__Group_6__0__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_6__1__Impl_in_rule__DecimalConstraint__Group_6__110716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__FixeLenAssignment_6_1_in_rule__DecimalConstraint__Group_6__1__Impl10743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_7__0__Impl_in_rule__DecimalConstraint__Group_7__010777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_7__1_in_rule__DecimalConstraint__Group_7__010780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__DecimalConstraint__Group_7__0__Impl10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__Group_7__1__Impl_in_rule__DecimalConstraint__Group_7__110839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecimalConstraint__PaddleAssignment_7_1_in_rule__DecimalConstraint__Group_7__1__Impl10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__0__Impl_in_rule__EnumerationConstraint__Group__010900 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1_in_rule__EnumerationConstraint__Group__010903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumerationConstraint__Group__0__Impl10931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__1__Impl_in_rule__EnumerationConstraint__Group__110962 = new BitSet(new long[]{0x0040100000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2_in_rule__EnumerationConstraint__Group__110965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__UsageAssignment_1_in_rule__EnumerationConstraint__Group__1__Impl10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__2__Impl_in_rule__EnumerationConstraint__Group__211022 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3_in_rule__EnumerationConstraint__Group__211025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0_in_rule__EnumerationConstraint__Group__2__Impl11052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group__3__Impl_in_rule__EnumerationConstraint__Group__311083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0_in_rule__EnumerationConstraint__Group__3__Impl11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__0__Impl_in_rule__EnumerationConstraint__Group_2__011149 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1_in_rule__EnumerationConstraint__Group_2__011152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__EnumerationConstraint__Group_2__0__Impl11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_2__1__Impl_in_rule__EnumerationConstraint__Group_2__111211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__FixeLenAssignment_2_1_in_rule__EnumerationConstraint__Group_2__1__Impl11238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__0__Impl_in_rule__EnumerationConstraint__Group_3__011272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1_in_rule__EnumerationConstraint__Group_3__011275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__HasDefaultAssignment_3_0_in_rule__EnumerationConstraint__Group_3__0__Impl11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__Group_3__1__Impl_in_rule__EnumerationConstraint__Group_3__111332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_1_in_rule__EnumerationConstraint__Group_3__1__Impl11359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__DomainModel__ElementsAssignment11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_111429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_111460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__PrefixAssignment_2_111491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__NamespaceAssignment_3_111522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PackageDeclaration__FormatAssignment_5_0_111558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__DelimiterAssignment_6_111597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PackageDeclaration__LinesAssignment_7_111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__PackageDeclaration__ElementsAssignment_811659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_111690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_311791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_511822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__Feature__ConstraintAssignment_111853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Feature__DescriptionAssignment_211884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_011915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Attribute__TypeAssignment_211946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__NameAssignment_111977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Reference__TypeAssignment_312008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__OppositeAssignment_4_112043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_112078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__Enumeration__EnumerationLiteralsAssignment_312109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationLiteral__NameAssignment_012140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationLiteral__PersistedValueAssignment_1_112171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_rule__Parameter__TypeAssignment_112233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TypeRef__ReferencedAssignment_012268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__TypeRef__MultiAssignment_112308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__TypeRef__OptionAssignment_212352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__BoolConstraint__ConstraintAssignment_012396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__BoolConstraint__HasDefaultAssignment_1_012440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__BoolConstraint__DefaultValueAssignment_1_1_012484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__StringConstraint__ConstraintAssignment_012528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__StringConstraint__HasDefaultAssignment_1_012572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__DefaultValueAssignment_1_112611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__StringConstraint__IsFixedAssignment_2_012647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__FixedValueAssignment_2_112686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__MinLenAssignment_3_112717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__MaxLenAssignment_4_112748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringConstraint__FixeLenAssignment_5_112779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__StringConstraint__IsXSDAttAssignment_612815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringConstraint__RegularExpressionAssignment_7_112854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__DateTimeConstraint__ConstraintAssignment_012890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateTimeConstraint__DataTypeAssignment_112933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DateTimeConstraint__HasDefaultAssignment_2_012973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DateTimeConstraint__DefaultValueAssignment_2_113012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__IntegerConstraint__ConstraintAssignment_013048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__IntegerConstraint__HasDefaultAssignment_1_013092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__DefaultValueAssignment_1_113131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__IntegerConstraint__IsFixedAssignment_2_013167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixedValueAssignment_2_113206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MinValueAssignment_3_113237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxValueAssignment_4_113268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__MaxLenAssignment_5_113299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerConstraint__FixeLenAssignment_6_113330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IntegerConstraint__PaddleAssignment_7_113361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__IntegerConstraint__IsXSDAttAssignment_813397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__DecimalConstraint__ConstraintAssignment_013441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DecimalConstraint__HasDefaultAssignment_1_013485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalConstraint__DefaultValueAssignment_1_113524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__DecimalConstraint__IsFixedAssignment_2_013560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalConstraint__FixedValueAssignment_2_113599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MinValueAssignment_3_113630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxValueAssignment_4_113661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__MaxLenAssignment_5_113692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DecimalConstraint__FixeLenAssignment_6_113723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DecimalConstraint__PaddleAssignment_7_113754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__DecimalConstraint__IsXSDAttAssignment_813790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_rule__EnumerationConstraint__UsageAssignment_113829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationConstraint__FixeLenAssignment_2_113860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__EnumerationConstraint__HasDefaultAssignment_3_013896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationConstraint__DefaultValueAsStringAssignment_3_113935 = new BitSet(new long[]{0x0000000000000002L});

}