package fr.chaunier.xtext.bom.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import fr.chaunier.xtext.bom.services.BomDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBomDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'prefix'", "'namespace'", "'{'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'*'", "'?'", "'.*'", "'.'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'minLen'", "'maxLen'", "'fixeLen'", "'regexp'", "'datetime'", "'integer'", "'minVal'", "'maxVal'", "'paddle'", "'decimal'", "'enumeration'", "'['", "']'", "'='", "';'", "'enum'", "'as String'", "'as bool String'", "'as Value'", "'as bool Value'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g"; }



     	private BomDslGrammarAccess grammarAccess;
     	
        public InternalBomDslParser(TokenStream input, IAstFactory factory, BomDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected BomDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleDomainModel
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:78:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:79:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:80:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDomainModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();
            _fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDomainModel


    // $ANTLR start ruleDomainModel
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:87:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:92:6: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:93:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:93:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=17 && LA1_0<=18)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:94:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:94:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:95:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDomainModelAccess().getElementsAbstractElementParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainModel130);
            	    lv_elements_0_0=ruleAbstractElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDomainModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_0_0, 
            	    	        		"AbstractElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDomainModel


    // $ANTLR start entryRuleAbstractElement
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:125:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:126:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:127:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();
            _fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbstractElement


    // $ANTLR start ruleAbstractElement
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:134:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:139:6: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:140:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:140:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
            case 42:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("140:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:141:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223);
                    this_PackageDeclaration_0=rulePackageDeclaration();
                    _fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:151:5: this_Type_1= ruleType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement250);
                    this_Type_1=ruleType();
                    _fsp--;

                     
                            current = this_Type_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:161:5: this_Import_2= ruleImport
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement277);
                    this_Import_2=ruleImport();
                    _fsp--;

                     
                            current = this_Import_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbstractElement


    // $ANTLR start entryRuleImport
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:177:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:178:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:179:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport312);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:186:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:191:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:192:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:192:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:192:3: 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            match(input,11,FOLLOW_11_in_ruleImport357); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:196:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:197:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:197:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:198:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport378);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importedNamespace",
            	        		lv_importedNamespace_1_0, 
            	        		"QualifiedNameWithWildCard", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRulePackageDeclaration
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:228:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:229:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:230:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackageDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration414);
            iv_rulePackageDeclaration=rulePackageDeclaration();
            _fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackageDeclaration


    // $ANTLR start rulePackageDeclaration
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:237:1: rulePackageDeclaration returns [EObject current=null] : ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( (lv_elements_7_0= ruleAbstractElement ) )* '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_5_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        EObject lv_elements_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:242:6: ( ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( (lv_elements_7_0= ruleAbstractElement ) )* '}' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:1: ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( (lv_elements_7_0= ruleAbstractElement ) )* '}' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:1: ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( (lv_elements_7_0= ruleAbstractElement ) )* '}' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:3: 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( (lv_elements_7_0= ruleAbstractElement ) )* '}'
            {
            match(input,12,FOLLOW_12_in_rulePackageDeclaration459); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:247:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:248:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:248:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:249:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration480);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:271:2: ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:271:4: 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) )
            {
            match(input,13,FOLLOW_13_in_rulePackageDeclaration491); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getPrefixKeyword_2_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:275:1: ( (lv_prefix_3_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:276:1: (lv_prefix_3_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:276:1: (lv_prefix_3_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:277:3: lv_prefix_3_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationAccess().getPrefixQualifiedNameParserRuleCall_2_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration512);
            lv_prefix_3_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"prefix",
            	        		lv_prefix_3_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:299:3: ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:299:5: 'namespace' ( (lv_namespace_5_0= RULE_STRING ) )
            {
            match(input,14,FOLLOW_14_in_rulePackageDeclaration524); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getNamespaceKeyword_3_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:303:1: ( (lv_namespace_5_0= RULE_STRING ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:304:1: (lv_namespace_5_0= RULE_STRING )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:304:1: (lv_namespace_5_0= RULE_STRING )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:305:3: lv_namespace_5_0= RULE_STRING
            {
            lv_namespace_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageDeclaration541); 

            			createLeafNode(grammarAccess.getPackageDeclarationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0(), "namespace"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"namespace",
            	        		lv_namespace_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

            match(input,15,FOLLOW_15_in_rulePackageDeclaration557); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:331:1: ( (lv_elements_7_0= ruleAbstractElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)||(LA3_0>=17 && LA3_0<=18)||LA3_0==42) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:332:1: (lv_elements_7_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:332:1: (lv_elements_7_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:333:3: lv_elements_7_0= ruleAbstractElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration578);
            	    lv_elements_7_0=ruleAbstractElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_7_0, 
            	    	        		"AbstractElement", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_rulePackageDeclaration589); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackageDeclaration


    // $ANTLR start entryRuleType
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:367:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:368:2: (iv_ruleType= ruleType EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:369:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType625);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:376:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;

        EObject this_Enumeration_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:381:6: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:382:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:382:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("382:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:383:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType682);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:393:5: this_DataType_1= ruleDataType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType709);
                    this_DataType_1=ruleDataType();
                    _fsp--;

                     
                            current = this_DataType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:403:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType736);
                    this_Enumeration_2=ruleEnumeration();
                    _fsp--;

                     
                            current = this_Enumeration_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDataType
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:419:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:420:2: (iv_ruleDataType= ruleDataType EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:421:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType771);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataType


    // $ANTLR start ruleDataType
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:428:1: ruleDataType returns [EObject current=null] : ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:433:6: ( ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:434:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:434:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:434:3: 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,17,FOLLOW_17_in_ruleDataType816); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:439:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType833); 

            			createLeafNode(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start entryRuleEntity
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:470:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:471:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:472:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity874);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:479:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_description_4_0=null;
        EObject lv_features_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:484:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:485:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:485:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:485:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}'
            {
            match(input,18,FOLLOW_18_in_ruleEntity919); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:490:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:490:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity936); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:513:2: ( 'extends' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:513:4: 'extends' ( ( ruleQualifiedName ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleEntity952); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:517:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:518:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:518:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:519:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity975);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:533:4: ( (lv_description_4_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:534:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:534:1: (lv_description_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:535:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity994); 

                    			createLeafNode(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleEntity1010); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:561:1: ( (lv_features_6_0= ruleFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:562:1: (lv_features_6_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:562:1: (lv_features_6_0= ruleFeature )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:563:3: lv_features_6_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1031);
            	    lv_features_6_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_6_0, 
            	    	        		"Feature", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleEntity1042); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:597:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:598:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:599:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1078);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:606:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_description_2_0=null;
        EObject this_StructuralFeature_0 = null;

        EObject lv_constraint_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:611:6: ( (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:612:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:612:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:613:5: this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructuralFeature_in_ruleFeature1135);
            this_StructuralFeature_0=ruleStructuralFeature();
            _fsp--;

             
                    current = this_StructuralFeature_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:621:1: ( (lv_constraint_1_0= ruleConstraint ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27||LA8_0==31||(LA8_0>=36 && LA8_0<=37)||LA8_0==41||LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:622:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:622:1: (lv_constraint_1_0= ruleConstraint )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:623:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleFeature1155);
                    lv_constraint_1_0=ruleConstraint();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"constraint",
                    	        		lv_constraint_1_0, 
                    	        		"Constraint", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:645:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:646:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:646:1: (lv_description_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:647:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeature1173); 

                    			createLeafNode(grammarAccess.getFeatureAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start entryRuleStructuralFeature
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:677:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:678:2: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:679:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1215);
            iv_ruleStructuralFeature=ruleStructuralFeature();
            _fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature1225); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStructuralFeature


    // $ANTLR start ruleStructuralFeature
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:686:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:691:6: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:692:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:692:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("692:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:693:5: this_Attribute_0= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStructuralFeature1272);
                    this_Attribute_0=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:703:5: this_Reference_1= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStructuralFeature1299);
                    this_Reference_1=ruleReference();
                    _fsp--;

                     
                            current = this_Reference_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructuralFeature


    // $ANTLR start entryRuleAttribute
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:719:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:720:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:721:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1334);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:728:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:733:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:734:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:734:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:734:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:734:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:735:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:735:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:736:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1386); 

            			createLeafNode(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleAttribute1401); 

                    createLeafNode(grammarAccess.getAttributeAccess().getColonKeyword_1(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:762:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:763:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:763:1: (lv_type_2_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:764:3: lv_type_2_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute1422);
            lv_type_2_0=ruleTypeRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"TypeRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleReference
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:794:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:795:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:796:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1458);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1468); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleReference


    // $ANTLR start ruleReference
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:803:1: ruleReference returns [EObject current=null] : ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:808:6: ( ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:809:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:809:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:809:3: 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )?
            {
            match(input,21,FOLLOW_21_in_ruleReference1503); 

                    createLeafNode(grammarAccess.getReferenceAccess().getRefKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:813:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:814:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:814:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:815:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1520); 

            			createLeafNode(grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleReference1535); 

                    createLeafNode(grammarAccess.getReferenceAccess().getColonKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:841:1: ( (lv_type_3_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:842:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:842:1: (lv_type_3_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:843:3: lv_type_3_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleReference1556);
            lv_type_3_0=ruleTypeRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_3_0, 
            	        		"TypeRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:865:2: ( 'opposite' ( ( RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:865:4: 'opposite' ( ( RULE_ID ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleReference1567); 

                            createLeafNode(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:869:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:870:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:870:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:871:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1585); 

                    		createLeafNode(grammarAccess.getReferenceAccess().getOppositeReferenceCrossReference_4_1_0(), "opposite"); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReference


    // $ANTLR start entryRuleParameter
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:891:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:892:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:893:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1623);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:900:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:905:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:906:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:906:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:906:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:906:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:907:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:907:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:908:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1675); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:930:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:931:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:931:1: (lv_type_1_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:932:3: lv_type_1_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter1701);
            lv_type_1_0=ruleTypeRef();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"TypeRef", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleTypeRef
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:964:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:965:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:966:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef1739);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef1749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:973:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token lv_option_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:978:6: ( ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:979:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:979:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:979:2: ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:979:2: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:980:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:980:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:981:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef1797);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:995:2: ( (lv_multi_1_0= '*' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:996:1: (lv_multi_1_0= '*' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:996:1: (lv_multi_1_0= '*' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:997:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruleTypeRef1815); 

                            createLeafNode(grammarAccess.getTypeRefAccess().getMultiAsteriskKeyword_1_0(), "multi"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "multi", true, "*", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1016:3: ( (lv_option_2_0= '?' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1017:1: (lv_option_2_0= '?' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1017:1: (lv_option_2_0= '?' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1018:3: lv_option_2_0= '?'
                    {
                    lv_option_2_0=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleTypeRef1847); 

                            createLeafNode(grammarAccess.getTypeRefAccess().getOptionQuestionMarkKeyword_2_0(), "option"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "option", true, "?", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeRef


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1045:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1046:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1047:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1898);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedNameWithWildCard


    // $ANTLR start ruleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1054:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1059:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1060:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1060:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1061:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1956);
            this_QualifiedName_0=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1071:1: (kw= '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1072:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleQualifiedNameWithWildCard1975); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedNameWithWildCard


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1085:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1086:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1087:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2018);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1094:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1099:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1100:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1100:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1100:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2069); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1107:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1108:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,26,FOLLOW_26_in_ruleQualifiedName2088); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2103); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1128:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1129:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1130:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2150);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2160); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstraint


    // $ANTLR start ruleConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1137:1: ruleConstraint returns [EObject current=null] : (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BoolConstraint_0 = null;

        EObject this_StringConstraint_1 = null;

        EObject this_DateTimeConstraint_2 = null;

        EObject this_IntegerConstraint_3 = null;

        EObject this_DecimalConstraint_4 = null;

        EObject this_EnumerationConstraint_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1142:6: ( (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1143:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1143:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 37:
                {
                alt16=4;
                }
                break;
            case 41:
                {
                alt16=5;
                }
                break;
            case 47:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1143:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1144:5: this_BoolConstraint_0= ruleBoolConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolConstraint_in_ruleConstraint2207);
                    this_BoolConstraint_0=ruleBoolConstraint();
                    _fsp--;

                     
                            current = this_BoolConstraint_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1154:5: this_StringConstraint_1= ruleStringConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringConstraint_in_ruleConstraint2234);
                    this_StringConstraint_1=ruleStringConstraint();
                    _fsp--;

                     
                            current = this_StringConstraint_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1164:5: this_DateTimeConstraint_2= ruleDateTimeConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2261);
                    this_DateTimeConstraint_2=ruleDateTimeConstraint();
                    _fsp--;

                     
                            current = this_DateTimeConstraint_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1174:5: this_IntegerConstraint_3= ruleIntegerConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_ruleConstraint2288);
                    this_IntegerConstraint_3=ruleIntegerConstraint();
                    _fsp--;

                     
                            current = this_IntegerConstraint_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1184:5: this_DecimalConstraint_4= ruleDecimalConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_ruleConstraint2315);
                    this_DecimalConstraint_4=ruleDecimalConstraint();
                    _fsp--;

                     
                            current = this_DecimalConstraint_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1194:5: this_EnumerationConstraint_5= ruleEnumerationConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2342);
                    this_EnumerationConstraint_5=ruleEnumerationConstraint();
                    _fsp--;

                     
                            current = this_EnumerationConstraint_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstraint


    // $ANTLR start entryRuleBoolConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1210:1: entryRuleBoolConstraint returns [EObject current=null] : iv_ruleBoolConstraint= ruleBoolConstraint EOF ;
    public final EObject entryRuleBoolConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1211:2: (iv_ruleBoolConstraint= ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1212:2: iv_ruleBoolConstraint= ruleBoolConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2377);
            iv_ruleBoolConstraint=ruleBoolConstraint();
            _fsp--;

             current =iv_ruleBoolConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint2387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBoolConstraint


    // $ANTLR start ruleBoolConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1219:1: ruleBoolConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? ) ;
    public final EObject ruleBoolConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1224:6: ( ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1225:1: ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1225:1: ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1225:2: ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1225:2: ( (lv_constraint_0_0= 'boolean' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1226:1: (lv_constraint_0_0= 'boolean' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1226:1: (lv_constraint_0_0= 'boolean' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1227:3: lv_constraint_0_0= 'boolean'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_ruleBoolConstraint2430); 

                    createLeafNode(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0_0(), "constraint"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBoolConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "constraint", lv_constraint_0_0, "boolean", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1246:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1246:3: ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1246:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1247:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1247:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1248:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleBoolConstraint2462); 

                            createLeafNode(grammarAccess.getBoolConstraintAccess().getHasDefaultDefaultKeyword_1_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBoolConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1267:2: ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1267:2: ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1267:3: ( (lv_defaultValue_2_0= 'true' ) )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1267:3: ( (lv_defaultValue_2_0= 'true' ) )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:1: (lv_defaultValue_2_0= 'true' )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:1: (lv_defaultValue_2_0= 'true' )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1269:3: lv_defaultValue_2_0= 'true'
                            {
                            lv_defaultValue_2_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleBoolConstraint2494); 

                                    createLeafNode(grammarAccess.getBoolConstraintAccess().getDefaultValueTrueKeyword_1_1_0_0(), "defaultValue"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getBoolConstraintRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "defaultValue", true, "true", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1289:7: 'false'
                            {
                            match(input,30,FOLLOW_30_in_ruleBoolConstraint2523); 

                                    createLeafNode(grammarAccess.getBoolConstraintAccess().getFalseKeyword_1_1_1(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolConstraint


    // $ANTLR start entryRuleStringConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1301:1: entryRuleStringConstraint returns [EObject current=null] : iv_ruleStringConstraint= ruleStringConstraint EOF ;
    public final EObject entryRuleStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1302:2: (iv_ruleStringConstraint= ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1303:2: iv_ruleStringConstraint= ruleStringConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2562);
            iv_ruleStringConstraint=ruleStringConstraint();
            _fsp--;

             current =iv_ruleStringConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint2572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringConstraint


    // $ANTLR start ruleStringConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1310:1: ruleStringConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )? ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;
        Token lv_minLength_4_0=null;
        Token lv_maxLength_6_0=null;
        Token lv_fixeLength_8_0=null;
        Token lv_regularExpression_10_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1315:6: ( ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )? ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1316:1: ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )? ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1316:1: ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )? ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1316:2: ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )? ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1316:2: ( (lv_constraint_0_0= 'string' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1317:1: (lv_constraint_0_0= 'string' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1317:1: (lv_constraint_0_0= 'string' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1318:3: lv_constraint_0_0= 'string'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,31,FOLLOW_31_in_ruleStringConstraint2615); 

                    createLeafNode(grammarAccess.getStringConstraintAccess().getConstraintStringKeyword_0_0(), "constraint"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "constraint", lv_constraint_0_0, "string", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1337:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1337:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1337:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1338:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1338:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1339:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleStringConstraint2647); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getHasDefaultDefaultKeyword_1_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1358:2: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1359:1: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1359:1: (lv_defaultValue_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1360:3: lv_defaultValue_2_0= RULE_STRING
                    {
                    lv_defaultValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint2677); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1382:4: ( 'minLen' ( (lv_minLength_4_0= RULE_INT ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1382:6: 'minLen' ( (lv_minLength_4_0= RULE_INT ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleStringConstraint2695); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getMinLenKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1386:1: ( (lv_minLength_4_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1387:1: (lv_minLength_4_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1387:1: (lv_minLength_4_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1388:3: lv_minLength_4_0= RULE_INT
                    {
                    lv_minLength_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint2712); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getMinLengthINTTerminalRuleCall_2_1_0(), "minLength"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minLength",
                    	        		lv_minLength_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1410:4: ( 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1410:6: 'maxLen' ( (lv_maxLength_6_0= RULE_INT ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleStringConstraint2730); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1414:1: ( (lv_maxLength_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1415:1: (lv_maxLength_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1415:1: (lv_maxLength_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1416:3: lv_maxLength_6_0= RULE_INT
                    {
                    lv_maxLength_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint2747); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getMaxLengthINTTerminalRuleCall_3_1_0(), "maxLength"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLength",
                    	        		lv_maxLength_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1438:4: ( 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1438:6: 'fixeLen' ( (lv_fixeLength_8_0= RULE_INT ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleStringConstraint2765); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1442:1: ( (lv_fixeLength_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1443:1: (lv_fixeLength_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1443:1: (lv_fixeLength_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1444:3: lv_fixeLength_8_0= RULE_INT
                    {
                    lv_fixeLength_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint2782); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getFixeLengthINTTerminalRuleCall_4_1_0(), "fixeLength"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLength",
                    	        		lv_fixeLength_8_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1466:4: ( 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1466:6: 'regexp' ( (lv_regularExpression_10_0= RULE_STRING ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleStringConstraint2800); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getRegexpKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1470:1: ( (lv_regularExpression_10_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1471:1: (lv_regularExpression_10_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1471:1: (lv_regularExpression_10_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1472:3: lv_regularExpression_10_0= RULE_STRING
                    {
                    lv_regularExpression_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint2817); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_5_1_0(), "regularExpression"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"regularExpression",
                    	        		lv_regularExpression_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringConstraint


    // $ANTLR start entryRuleDateTimeConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1502:1: entryRuleDateTimeConstraint returns [EObject current=null] : iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF ;
    public final EObject entryRuleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1503:2: (iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1504:2: iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimeConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint2860);
            iv_ruleDateTimeConstraint=ruleDateTimeConstraint();
            _fsp--;

             current =iv_ruleDateTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint2870); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDateTimeConstraint


    // $ANTLR start ruleDateTimeConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1511:1: ruleDateTimeConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_2_0=null;
        Token lv_defaultValue_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1516:6: ( ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1517:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1517:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1517:2: ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1517:2: ( (lv_constraint_0_0= 'datetime' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1518:1: (lv_constraint_0_0= 'datetime' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1518:1: (lv_constraint_0_0= 'datetime' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1519:3: lv_constraint_0_0= 'datetime'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,36,FOLLOW_36_in_ruleDateTimeConstraint2913); 

                    createLeafNode(grammarAccess.getDateTimeConstraintAccess().getConstraintDatetimeKeyword_0_0(), "constraint"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "constraint", lv_constraint_0_0, "datetime", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1538:2: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1539:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1539:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1540:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeConstraint2944); 

            		createLeafNode(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0(), "dataType"); 
            	

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1552:2: ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1552:3: ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1552:3: ( (lv_hasDefault_2_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1553:1: (lv_hasDefault_2_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1553:1: (lv_hasDefault_2_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1554:3: lv_hasDefault_2_0= 'default'
                    {
                    lv_hasDefault_2_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleDateTimeConstraint2963); 

                            createLeafNode(grammarAccess.getDateTimeConstraintAccess().getHasDefaultDefaultKeyword_2_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1573:2: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1574:1: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1574:1: (lv_defaultValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1575:3: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeConstraint2993); 

                    			createLeafNode(grammarAccess.getDateTimeConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_3_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDateTimeConstraint


    // $ANTLR start entryRuleIntegerConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1605:1: entryRuleIntegerConstraint returns [EObject current=null] : iv_ruleIntegerConstraint= ruleIntegerConstraint EOF ;
    public final EObject entryRuleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1606:2: (iv_ruleIntegerConstraint= ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1607:2: iv_ruleIntegerConstraint= ruleIntegerConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3036);
            iv_ruleIntegerConstraint=ruleIntegerConstraint();
            _fsp--;

             current =iv_ruleIntegerConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint3046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntegerConstraint


    // $ANTLR start ruleIntegerConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1614:1: ruleIntegerConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;
        Token lv_minValue_4_0=null;
        Token lv_maxValue_6_0=null;
        Token lv_maxLen_8_0=null;
        Token lv_fixeLen_10_0=null;
        Token lv_paddle_12_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1619:6: ( ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1620:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1620:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1620:2: ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1620:2: ( (lv_constraint_0_0= 'integer' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1621:1: (lv_constraint_0_0= 'integer' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1621:1: (lv_constraint_0_0= 'integer' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1622:3: lv_constraint_0_0= 'integer'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,37,FOLLOW_37_in_ruleIntegerConstraint3089); 

                    createLeafNode(grammarAccess.getIntegerConstraintAccess().getConstraintIntegerKeyword_0_0(), "constraint"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "constraint", lv_constraint_0_0, "integer", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1641:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1641:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1641:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1642:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1642:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1643:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleIntegerConstraint3121); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getHasDefaultDefaultKeyword_1_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1662:2: ( (lv_defaultValue_2_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1663:1: (lv_defaultValue_2_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1663:1: (lv_defaultValue_2_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1664:3: lv_defaultValue_2_0= RULE_INT
                    {
                    lv_defaultValue_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3151); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getDefaultValueINTTerminalRuleCall_1_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1686:4: ( 'minVal' ( (lv_minValue_4_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1686:6: 'minVal' ( (lv_minValue_4_0= RULE_INT ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleIntegerConstraint3169); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1690:1: ( (lv_minValue_4_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1691:1: (lv_minValue_4_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1691:1: (lv_minValue_4_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1692:3: lv_minValue_4_0= RULE_INT
                    {
                    lv_minValue_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3186); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_2_1_0(), "minValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minValue",
                    	        		lv_minValue_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1714:4: ( 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1714:6: 'maxVal' ( (lv_maxValue_6_0= RULE_INT ) )
                    {
                    match(input,39,FOLLOW_39_in_ruleIntegerConstraint3204); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1718:1: ( (lv_maxValue_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1719:1: (lv_maxValue_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1719:1: (lv_maxValue_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1720:3: lv_maxValue_6_0= RULE_INT
                    {
                    lv_maxValue_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3221); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_3_1_0(), "maxValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxValue",
                    	        		lv_maxValue_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1742:4: ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1742:6: 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleIntegerConstraint3239); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1746:1: ( (lv_maxLen_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1747:1: (lv_maxLen_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1747:1: (lv_maxLen_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1748:3: lv_maxLen_8_0= RULE_INT
                    {
                    lv_maxLen_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3256); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_8_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1770:4: ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1770:6: 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleIntegerConstraint3274); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1774:1: ( (lv_fixeLen_10_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1775:1: (lv_fixeLen_10_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1775:1: (lv_fixeLen_10_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1776:3: lv_fixeLen_10_0= RULE_INT
                    {
                    lv_fixeLen_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3291); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_10_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1798:4: ( 'paddle' ( (lv_paddle_12_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1798:6: 'paddle' ( (lv_paddle_12_0= RULE_STRING ) )
                    {
                    match(input,40,FOLLOW_40_in_ruleIntegerConstraint3309); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_6_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1802:1: ( (lv_paddle_12_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1803:1: (lv_paddle_12_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1803:1: (lv_paddle_12_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1804:3: lv_paddle_12_0= RULE_STRING
                    {
                    lv_paddle_12_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerConstraint3326); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_6_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_12_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntegerConstraint


    // $ANTLR start entryRuleDecimalConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1834:1: entryRuleDecimalConstraint returns [EObject current=null] : iv_ruleDecimalConstraint= ruleDecimalConstraint EOF ;
    public final EObject entryRuleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1835:2: (iv_ruleDecimalConstraint= ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1836:2: iv_ruleDecimalConstraint= ruleDecimalConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3369);
            iv_ruleDecimalConstraint=ruleDecimalConstraint();
            _fsp--;

             current =iv_ruleDecimalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint3379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDecimalConstraint


    // $ANTLR start ruleDecimalConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1843:1: ruleDecimalConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'decimal' ) ) ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_minValue_2_0=null;
        Token lv_maxValue_4_0=null;
        Token lv_maxLen_6_0=null;
        Token lv_fixeLen_8_0=null;
        Token lv_paddle_10_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1848:6: ( ( ( (lv_constraint_0_0= 'decimal' ) ) ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1849:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1849:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1849:2: ( (lv_constraint_0_0= 'decimal' ) ) ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1849:2: ( (lv_constraint_0_0= 'decimal' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1850:1: (lv_constraint_0_0= 'decimal' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1850:1: (lv_constraint_0_0= 'decimal' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1851:3: lv_constraint_0_0= 'decimal'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleDecimalConstraint3422); 

                    createLeafNode(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0(), "constraint"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "constraint", lv_constraint_0_0, "decimal", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1870:2: ( 'minVal' ( (lv_minValue_2_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1870:4: 'minVal' ( (lv_minValue_2_0= RULE_INT ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleDecimalConstraint3446); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1874:1: ( (lv_minValue_2_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1875:1: (lv_minValue_2_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1875:1: (lv_minValue_2_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1876:3: lv_minValue_2_0= RULE_INT
                    {
                    lv_minValue_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint3463); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_1_1_0(), "minValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minValue",
                    	        		lv_minValue_2_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1898:4: ( 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1898:6: 'maxVal' ( (lv_maxValue_4_0= RULE_INT ) )
                    {
                    match(input,39,FOLLOW_39_in_ruleDecimalConstraint3481); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1902:1: ( (lv_maxValue_4_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1903:1: (lv_maxValue_4_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1903:1: (lv_maxValue_4_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1904:3: lv_maxValue_4_0= RULE_INT
                    {
                    lv_maxValue_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint3498); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_2_1_0(), "maxValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxValue",
                    	        		lv_maxValue_4_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1926:4: ( 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1926:6: 'maxLen' ( (lv_maxLen_6_0= RULE_INT ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleDecimalConstraint3516); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1930:1: ( (lv_maxLen_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1931:1: (lv_maxLen_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1931:1: (lv_maxLen_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1932:3: lv_maxLen_6_0= RULE_INT
                    {
                    lv_maxLen_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint3533); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1954:4: ( 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1954:6: 'fixeLen' ( (lv_fixeLen_8_0= RULE_INT ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleDecimalConstraint3551); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1958:1: ( (lv_fixeLen_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1959:1: (lv_fixeLen_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1959:1: (lv_fixeLen_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1960:3: lv_fixeLen_8_0= RULE_INT
                    {
                    lv_fixeLen_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint3568); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_8_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1982:4: ( 'paddle' ( (lv_paddle_10_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1982:6: 'paddle' ( (lv_paddle_10_0= RULE_STRING ) )
                    {
                    match(input,40,FOLLOW_40_in_ruleDecimalConstraint3586); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1986:1: ( (lv_paddle_10_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1987:1: (lv_paddle_10_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1987:1: (lv_paddle_10_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1988:3: lv_paddle_10_0= RULE_STRING
                    {
                    lv_paddle_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalConstraint3603); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDecimalConstraint


    // $ANTLR start entryRuleEnumeration
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2018:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2019:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2020:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration3646);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration3656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumeration


    // $ANTLR start ruleEnumeration
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2027:1: ruleEnumeration returns [EObject current=null] : ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_enumerationLiterals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2032:6: ( ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2033:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2033:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2033:3: 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']'
            {
            match(input,42,FOLLOW_42_in_ruleEnumeration3691); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2037:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2038:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2038:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2039:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration3708); 

            			createLeafNode(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,43,FOLLOW_43_in_ruleEnumeration3723); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2065:1: ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2066:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2066:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2067:3: lv_enumerationLiterals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration3744);
            	    lv_enumerationLiterals_3_0=ruleEnumerationLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumerationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"enumerationLiterals",
            	    	        		lv_enumerationLiterals_3_0, 
            	    	        		"EnumerationLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            match(input,44,FOLLOW_44_in_ruleEnumeration3755); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumeration


    // $ANTLR start entryRuleEnumerationLiteral
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2101:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2102:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2103:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral3791);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral3801); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumerationLiteral


    // $ANTLR start ruleEnumerationLiteral
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2110:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_persistedValue_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2115:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:2: ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';'
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2117:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2117:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2118:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral3843); 

            			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2140:2: ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2140:4: '=' ( (lv_persistedValue_2_0= RULE_INT ) )
            {
            match(input,45,FOLLOW_45_in_ruleEnumerationLiteral3859); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2144:1: ( (lv_persistedValue_2_0= RULE_INT ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2145:1: (lv_persistedValue_2_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2145:1: (lv_persistedValue_2_0= RULE_INT )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2146:3: lv_persistedValue_2_0= RULE_INT
            {
            lv_persistedValue_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral3876); 

            			createLeafNode(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0(), "persistedValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"persistedValue",
            	        		lv_persistedValue_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

            match(input,46,FOLLOW_46_in_ruleEnumerationLiteral3892); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumerationLiteral


    // $ANTLR start entryRuleEnumerationConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2180:1: entryRuleEnumerationConstraint returns [EObject current=null] : iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF ;
    public final EObject entryRuleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2181:2: (iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2182:2: iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3928);
            iv_ruleEnumerationConstraint=ruleEnumerationConstraint();
            _fsp--;

             current =iv_ruleEnumerationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint3938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEnumerationConstraint


    // $ANTLR start ruleEnumerationConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2189:1: ruleEnumerationConstraint returns [EObject current=null] : ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_hasDefault_2_0=null;
        Token lv_defaultValueAsString_3_0=null;
        Enumerator lv_usage_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2194:6: ( ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2195:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2195:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2195:3: 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )?
            {
            match(input,47,FOLLOW_47_in_ruleEnumerationConstraint3973); 

                    createLeafNode(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2199:1: ( (lv_usage_1_0= ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2200:1: (lv_usage_1_0= ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2200:1: (lv_usage_1_0= ruleEnumUsage )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2201:3: lv_usage_1_0= ruleEnumUsage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3994);
            lv_usage_1_0=ruleEnumUsage();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumerationConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"usage",
            	        		lv_usage_1_0, 
            	        		"EnumUsage", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2223:2: ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2223:3: ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValueAsString_3_0= RULE_ID ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2223:3: ( (lv_hasDefault_2_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2224:1: (lv_hasDefault_2_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2224:1: (lv_hasDefault_2_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2225:3: lv_hasDefault_2_0= 'default'
                    {
                    lv_hasDefault_2_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleEnumerationConstraint4013); 

                            createLeafNode(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_2_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2244:2: ( (lv_defaultValueAsString_3_0= RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2245:1: (lv_defaultValueAsString_3_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2245:1: (lv_defaultValueAsString_3_0= RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2246:3: lv_defaultValueAsString_3_0= RULE_ID
                    {
                    lv_defaultValueAsString_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationConstraint4043); 

                    			createLeafNode(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_2_1_0(), "defaultValueAsString"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValueAsString",
                    	        		lv_defaultValueAsString_3_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumerationConstraint


    // $ANTLR start ruleEnumUsage
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2280:1: ruleEnumUsage returns [Enumerator current=null] : ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) ) ;
    public final Enumerator ruleEnumUsage() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2284:6: ( ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2285:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2285:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt38=1;
                }
                break;
            case 49:
                {
                alt38=2;
                }
                break;
            case 50:
                {
                alt38=3;
                }
                break;
            case 51:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2285:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2285:2: ( 'as String' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2285:2: ( 'as String' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2285:4: 'as String'
                    {
                    match(input,48,FOLLOW_48_in_ruleEnumUsage4102); 

                            current = grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2291:6: ( 'as bool String' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2291:6: ( 'as bool String' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2291:8: 'as bool String'
                    {
                    match(input,49,FOLLOW_49_in_ruleEnumUsage4117); 

                            current = grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2297:6: ( 'as Value' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2297:6: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2297:8: 'as Value'
                    {
                    match(input,50,FOLLOW_50_in_ruleEnumUsage4132); 

                            current = grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2303:6: ( 'as bool Value' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2303:6: ( 'as bool Value' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2303:8: 'as bool Value'
                    {
                    match(input,51,FOLLOW_51_in_ruleEnumUsage4147); 

                            current = grammarAccess.getEnumUsageAccess().getAsBoolValueEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsBoolValueEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumUsage


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x0000040000061802L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackageDeclaration524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration541 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration557 = new BitSet(new long[]{0x0000040000071800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration578 = new BitSet(new long[]{0x0000040000071800L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataType816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEntity919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity936 = new BitSet(new long[]{0x0000000000088010L});
    public static final BitSet FOLLOW_19_in_ruleEntity952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity975 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity994 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1010 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1031 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_16_in_ruleEntity1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_ruleFeature1135 = new BitSet(new long[]{0x0000823088000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleFeature1155 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStructuralFeature1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStructuralFeature1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1386 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleReference1503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleReference1535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleReference1556 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleReference1567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef1797 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleTypeRef1815 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTypeRef1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard1956 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedNameWithWildCard1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2069 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName2088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2103 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_ruleConstraint2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_ruleConstraint2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_ruleConstraint2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_ruleConstraint2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBoolConstraint2430 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleBoolConstraint2462 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleBoolConstraint2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBoolConstraint2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStringConstraint2615 = new BitSet(new long[]{0x0000000F10000002L});
    public static final BitSet FOLLOW_28_in_ruleStringConstraint2647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint2677 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_32_in_ruleStringConstraint2695 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint2712 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_33_in_ruleStringConstraint2730 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint2747 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleStringConstraint2765 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint2782 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleStringConstraint2800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint2860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDateTimeConstraint2913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeConstraint2944 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleDateTimeConstraint2963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeConstraint2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIntegerConstraint3089 = new BitSet(new long[]{0x000001C610000002L});
    public static final BitSet FOLLOW_28_in_ruleIntegerConstraint3121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3151 = new BitSet(new long[]{0x000001C600000002L});
    public static final BitSet FOLLOW_38_in_ruleIntegerConstraint3169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3186 = new BitSet(new long[]{0x0000018600000002L});
    public static final BitSet FOLLOW_39_in_ruleIntegerConstraint3204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3221 = new BitSet(new long[]{0x0000010600000002L});
    public static final BitSet FOLLOW_33_in_ruleIntegerConstraint3239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3256 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_34_in_ruleIntegerConstraint3274 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3291 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleIntegerConstraint3309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerConstraint3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDecimalConstraint3422 = new BitSet(new long[]{0x000001C600000002L});
    public static final BitSet FOLLOW_38_in_ruleDecimalConstraint3446 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint3463 = new BitSet(new long[]{0x0000018600000002L});
    public static final BitSet FOLLOW_39_in_ruleDecimalConstraint3481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint3498 = new BitSet(new long[]{0x0000010600000002L});
    public static final BitSet FOLLOW_33_in_ruleDecimalConstraint3516 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint3533 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_34_in_ruleDecimalConstraint3551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint3568 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleDecimalConstraint3586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalConstraint3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration3646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEnumeration3691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration3708 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEnumeration3723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration3744 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_44_in_ruleEnumeration3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral3791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral3843 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleEnumerationLiteral3859 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral3876 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleEnumerationLiteral3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEnumerationConstraint3973 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3994 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumerationConstraint4013 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationConstraint4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumUsage4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEnumUsage4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEnumUsage4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEnumUsage4147 = new BitSet(new long[]{0x0000000000000002L});

}