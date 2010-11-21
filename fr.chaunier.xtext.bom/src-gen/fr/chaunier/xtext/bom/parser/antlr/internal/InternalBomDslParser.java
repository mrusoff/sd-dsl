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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'prefix'", "'namespace'", "'{'", "'format'", "'XSD'", "'DTD'", "'FLAT'", "'CSV'", "'DB'", "'delimiter'", "'lineSpec'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "'='", "';'", "'*'", "'?'", "'.*'", "'.'", "'boolean'", "'default'", "'true'", "'false'", "'string'", "'fixed'", "'minLen'", "'maxLen'", "'fixeLen'", "'xsd Att.'", "'regexp'", "'datetime'", "'integer'", "'minVal'", "'maxVal'", "'paddle'", "'decimal'", "'enum'", "'as String'", "'as bool String'", "'as Value'", "'as bool Value'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=25 && LA1_0<=26)||LA1_0==31) ) {
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
            case 25:
            case 26:
            case 31:
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:237:1: rulePackageDeclaration returns [EObject current=null] : ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )? ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )? ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )* ( (lv_elements_17_0= ruleAbstractElement ) )* '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_5_0=null;
        Token lv_format_8_0=null;
        Token lv_delimiter_14_0=null;
        Token lv_lines_16_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        EObject lv_elements_17_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:242:6: ( ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )? ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )? ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )* ( (lv_elements_17_0= ruleAbstractElement ) )* '}' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:1: ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )? ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )? ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )* ( (lv_elements_17_0= ruleAbstractElement ) )* '}' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:1: ( 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )? ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )? ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )* ( (lv_elements_17_0= ruleAbstractElement ) )* '}' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:243:3: 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( 'prefix' ( (lv_prefix_3_0= ruleQualifiedName ) ) ) ( 'namespace' ( (lv_namespace_5_0= RULE_STRING ) ) ) '{' ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )? ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )? ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )* ( (lv_elements_17_0= ruleAbstractElement ) )* '}'
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
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:331:1: ( ( 'format' ( (lv_format_8_0= 'XSD' ) ) ) | 'DTD' | 'FLAT' | 'CSV' | 'DB' )?
            int alt3=6;
            switch ( input.LA(1) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                    {
                    alt3=2;
                    }
                    break;
                case 19:
                    {
                    alt3=3;
                    }
                    break;
                case 20:
                    {
                    alt3=4;
                    }
                    break;
                case 21:
                    {
                    alt3=5;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:331:2: ( 'format' ( (lv_format_8_0= 'XSD' ) ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:331:2: ( 'format' ( (lv_format_8_0= 'XSD' ) ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:331:4: 'format' ( (lv_format_8_0= 'XSD' ) )
                    {
                    match(input,16,FOLLOW_16_in_rulePackageDeclaration569); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getFormatKeyword_5_0_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:335:1: ( (lv_format_8_0= 'XSD' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:336:1: (lv_format_8_0= 'XSD' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:336:1: (lv_format_8_0= 'XSD' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:337:3: lv_format_8_0= 'XSD'
                    {
                    lv_format_8_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_rulePackageDeclaration587); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getFormatXSDKeyword_5_0_1_0(), "format"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "format", lv_format_8_0, "XSD", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:357:7: 'DTD'
                    {
                    match(input,18,FOLLOW_18_in_rulePackageDeclaration617); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getDTDKeyword_5_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:362:7: 'FLAT'
                    {
                    match(input,19,FOLLOW_19_in_rulePackageDeclaration633); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getFLATKeyword_5_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:367:7: 'CSV'
                    {
                    match(input,20,FOLLOW_20_in_rulePackageDeclaration649); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getCSVKeyword_5_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:372:7: 'DB'
                    {
                    match(input,21,FOLLOW_21_in_rulePackageDeclaration665); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getDBKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:376:3: ( 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:376:5: 'delimiter' ( (lv_delimiter_14_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_rulePackageDeclaration678); 

                            createLeafNode(grammarAccess.getPackageDeclarationAccess().getDelimiterKeyword_6_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:380:1: ( (lv_delimiter_14_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:381:1: (lv_delimiter_14_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:381:1: (lv_delimiter_14_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:382:3: lv_delimiter_14_0= RULE_STRING
                    {
                    lv_delimiter_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageDeclaration695); 

                    			createLeafNode(grammarAccess.getPackageDeclarationAccess().getDelimiterSTRINGTerminalRuleCall_6_1_0(), "delimiter"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"delimiter",
                    	        		lv_delimiter_14_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:404:4: ( 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:404:6: 'lineSpec' ( (lv_lines_16_0= RULE_STRING ) )
            	    {
            	    match(input,23,FOLLOW_23_in_rulePackageDeclaration713); 

            	            createLeafNode(grammarAccess.getPackageDeclarationAccess().getLineSpecKeyword_7_0(), null); 
            	        
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:408:1: ( (lv_lines_16_0= RULE_STRING ) )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:409:1: (lv_lines_16_0= RULE_STRING )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:409:1: (lv_lines_16_0= RULE_STRING )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:410:3: lv_lines_16_0= RULE_STRING
            	    {
            	    lv_lines_16_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePackageDeclaration730); 

            	    			createLeafNode(grammarAccess.getPackageDeclarationAccess().getLinesSTRINGTerminalRuleCall_7_1_0(), "lines"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"lines",
            	    	        		lv_lines_16_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:432:4: ( (lv_elements_17_0= ruleAbstractElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=12)||(LA6_0>=25 && LA6_0<=26)||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:433:1: (lv_elements_17_0= ruleAbstractElement )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:433:1: (lv_elements_17_0= ruleAbstractElement )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:434:3: lv_elements_17_0= ruleAbstractElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration758);
            	    lv_elements_17_0=ruleAbstractElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPackageDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_17_0, 
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
            	    break loop6;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_rulePackageDeclaration769); 

                    createLeafNode(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_9(), null); 
                

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:468:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:469:2: (iv_ruleType= ruleType EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:470:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType805);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType815); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:477:1: ruleType returns [EObject current=null] : (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_DataType_1 = null;

        EObject this_Enumeration_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:482:6: ( (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:483:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:483:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("483:1: (this_Entity_0= ruleEntity | this_DataType_1= ruleDataType | this_Enumeration_2= ruleEnumeration )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:484:5: this_Entity_0= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType862);
                    this_Entity_0=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:494:5: this_DataType_1= ruleDataType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType889);
                    this_DataType_1=ruleDataType();
                    _fsp--;

                     
                            current = this_DataType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:504:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleType916);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:520:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:521:2: (iv_ruleDataType= ruleDataType EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:522:2: iv_ruleDataType= ruleDataType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType951);
            iv_ruleDataType=ruleDataType();
            _fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType961); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:529:1: ruleDataType returns [EObject current=null] : ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:534:6: ( ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:535:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:535:1: ( 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:535:3: 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleDataType996); 

                    createLeafNode(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:539:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:540:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:540:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:541:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1013); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:571:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:572:2: (iv_ruleEntity= ruleEntity EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:573:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1054);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1064); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:580:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_description_4_0=null;
        EObject lv_features_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:585:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_4_0= RULE_STRING ) )? '{' ( (lv_features_6_0= ruleFeature ) )* '}'
            {
            match(input,26,FOLLOW_26_in_ruleEntity1099); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:590:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:591:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:591:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:592:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1116); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:614:2: ( 'extends' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:614:4: 'extends' ( ( ruleQualifiedName ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleEntity1132); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:618:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:619:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:619:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:620:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1155);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:634:4: ( (lv_description_4_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:635:1: (lv_description_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:635:1: (lv_description_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:636:3: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1174); 

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

            match(input,15,FOLLOW_15_in_ruleEntity1190); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:662:1: ( (lv_features_6_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:663:1: (lv_features_6_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:663:1: (lv_features_6_0= ruleFeature )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:664:3: lv_features_6_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1211);
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
            	    break loop10;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleEntity1222); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:698:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:699:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:700:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1258);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1268); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:707:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_description_2_0=null;
        EObject this_StructuralFeature_0 = null;

        EObject lv_constraint_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:712:6: ( (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:713:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:713:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:714:5: this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructuralFeature_in_ruleFeature1315);
            this_StructuralFeature_0=ruleStructuralFeature();
            _fsp--;

             
                    current = this_StructuralFeature_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:722:1: ( (lv_constraint_1_0= ruleConstraint ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40||LA11_0==44||(LA11_0>=51 && LA11_0<=52)||(LA11_0>=56 && LA11_0<=57)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:723:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:723:1: (lv_constraint_1_0= ruleConstraint )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:724:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleFeature1335);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:746:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:747:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:747:1: (lv_description_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:748:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeature1353); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:778:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:779:2: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:780:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1395);
            iv_ruleStructuralFeature=ruleStructuralFeature();
            _fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature1405); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:787:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:792:6: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:793:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:793:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("793:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:794:5: this_Attribute_0= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStructuralFeature1452);
                    this_Attribute_0=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:804:5: this_Reference_1= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStructuralFeature1479);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:820:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:821:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:822:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1514);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1524); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:829:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:834:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:835:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:835:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:835:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:835:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:836:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:836:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:837:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1566); 

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

            match(input,28,FOLLOW_28_in_ruleAttribute1581); 

                    createLeafNode(grammarAccess.getAttributeAccess().getColonKeyword_1(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:863:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:864:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:864:1: (lv_type_2_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:865:3: lv_type_2_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute1602);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:895:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:896:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:897:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1638);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1648); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:904:1: ruleReference returns [EObject current=null] : ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:909:6: ( ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:910:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:910:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:910:3: 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )?
            {
            match(input,29,FOLLOW_29_in_ruleReference1683); 

                    createLeafNode(grammarAccess.getReferenceAccess().getRefKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:914:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:915:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:915:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:916:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1700); 

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

            match(input,28,FOLLOW_28_in_ruleReference1715); 

                    createLeafNode(grammarAccess.getReferenceAccess().getColonKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:942:1: ( (lv_type_3_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:943:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:943:1: (lv_type_3_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:944:3: lv_type_3_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleReference1736);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:966:2: ( 'opposite' ( ( RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:966:4: 'opposite' ( ( RULE_ID ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleReference1747); 

                            createLeafNode(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:970:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:971:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:971:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:972:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1765); 

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


    // $ANTLR start entryRuleEnumeration
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:992:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:993:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:994:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1803);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1813); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1001:1: ruleEnumeration returns [EObject current=null] : ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_enumerationLiterals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1006:6: ( ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1007:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1007:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1007:3: 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']'
            {
            match(input,31,FOLLOW_31_in_ruleEnumeration1848); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1011:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1012:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1012:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1013:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1865); 

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

            match(input,32,FOLLOW_32_in_ruleEnumeration1880); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1039:1: ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1040:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1040:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1041:3: lv_enumerationLiterals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1901);
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match(input,33,FOLLOW_33_in_ruleEnumeration1912); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1075:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1076:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1077:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1948);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1958); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1084:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_persistedValue_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1089:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1090:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1090:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1090:2: ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';'
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1090:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1091:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1091:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1092:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral2000); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:2: ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:4: '=' ( (lv_persistedValue_2_0= RULE_INT ) )
            {
            match(input,34,FOLLOW_34_in_ruleEnumerationLiteral2016); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1118:1: ( (lv_persistedValue_2_0= RULE_INT ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1119:1: (lv_persistedValue_2_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1119:1: (lv_persistedValue_2_0= RULE_INT )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1120:3: lv_persistedValue_2_0= RULE_INT
            {
            lv_persistedValue_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral2033); 

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

            match(input,35,FOLLOW_35_in_ruleEnumerationLiteral2049); 

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


    // $ANTLR start entryRuleParameter
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1154:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1155:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1156:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2085);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2095); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1163:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1168:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1169:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1169:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1169:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1169:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1170:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1170:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1171:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2137); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1193:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1194:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1194:1: (lv_type_1_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1195:3: lv_type_1_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter2163);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1227:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1228:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1229:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2201);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2211); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1236:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token lv_option_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1241:6: ( ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1242:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1242:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1242:2: ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1242:2: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1243:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1243:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1244:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef2259);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1258:2: ( (lv_multi_1_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1259:1: (lv_multi_1_0= '*' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1259:1: (lv_multi_1_0= '*' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1260:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleTypeRef2277); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1279:3: ( (lv_option_2_0= '?' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1280:1: (lv_option_2_0= '?' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1280:1: (lv_option_2_0= '?' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1281:3: lv_option_2_0= '?'
                    {
                    lv_option_2_0=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleTypeRef2309); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1308:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1309:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1310:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2360);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2371); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1317:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1322:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1323:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1323:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1324:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2418);
            this_QualifiedName_0=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1334:1: (kw= '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1335:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleQualifiedNameWithWildCard2437); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1348:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1349:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1350:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2480);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2491); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1357:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1362:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1363:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1363:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1363:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2531); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1370:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1371:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,39,FOLLOW_39_in_ruleQualifiedName2550); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2565); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1391:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1392:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1393:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2612);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2622); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1400:1: ruleConstraint returns [EObject current=null] : (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) ;
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
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1405:6: ( (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1406:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1406:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            int alt20=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt20=1;
                }
                break;
            case 44:
                {
                alt20=2;
                }
                break;
            case 51:
                {
                alt20=3;
                }
                break;
            case 52:
                {
                alt20=4;
                }
                break;
            case 56:
                {
                alt20=5;
                }
                break;
            case 57:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1406:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1407:5: this_BoolConstraint_0= ruleBoolConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolConstraint_in_ruleConstraint2669);
                    this_BoolConstraint_0=ruleBoolConstraint();
                    _fsp--;

                     
                            current = this_BoolConstraint_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1417:5: this_StringConstraint_1= ruleStringConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringConstraint_in_ruleConstraint2696);
                    this_StringConstraint_1=ruleStringConstraint();
                    _fsp--;

                     
                            current = this_StringConstraint_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1427:5: this_DateTimeConstraint_2= ruleDateTimeConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2723);
                    this_DateTimeConstraint_2=ruleDateTimeConstraint();
                    _fsp--;

                     
                            current = this_DateTimeConstraint_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1437:5: this_IntegerConstraint_3= ruleIntegerConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_ruleConstraint2750);
                    this_IntegerConstraint_3=ruleIntegerConstraint();
                    _fsp--;

                     
                            current = this_IntegerConstraint_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1447:5: this_DecimalConstraint_4= ruleDecimalConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_ruleConstraint2777);
                    this_DecimalConstraint_4=ruleDecimalConstraint();
                    _fsp--;

                     
                            current = this_DecimalConstraint_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1457:5: this_EnumerationConstraint_5= ruleEnumerationConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2804);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1473:1: entryRuleBoolConstraint returns [EObject current=null] : iv_ruleBoolConstraint= ruleBoolConstraint EOF ;
    public final EObject entryRuleBoolConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1474:2: (iv_ruleBoolConstraint= ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1475:2: iv_ruleBoolConstraint= ruleBoolConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2839);
            iv_ruleBoolConstraint=ruleBoolConstraint();
            _fsp--;

             current =iv_ruleBoolConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint2849); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1482:1: ruleBoolConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? ) ;
    public final EObject ruleBoolConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1487:6: ( ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1488:1: ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1488:1: ( ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1488:2: ( (lv_constraint_0_0= 'boolean' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1488:2: ( (lv_constraint_0_0= 'boolean' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1489:1: (lv_constraint_0_0= 'boolean' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1489:1: (lv_constraint_0_0= 'boolean' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1490:3: lv_constraint_0_0= 'boolean'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleBoolConstraint2892); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1509:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1509:3: ( (lv_hasDefault_1_0= 'default' ) ) ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1509:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1510:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1510:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1511:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleBoolConstraint2924); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1530:2: ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==42) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==43) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1530:2: ( ( (lv_defaultValue_2_0= 'true' ) ) | 'false' )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1530:3: ( (lv_defaultValue_2_0= 'true' ) )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1530:3: ( (lv_defaultValue_2_0= 'true' ) )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1531:1: (lv_defaultValue_2_0= 'true' )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1531:1: (lv_defaultValue_2_0= 'true' )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1532:3: lv_defaultValue_2_0= 'true'
                            {
                            lv_defaultValue_2_0=(Token)input.LT(1);
                            match(input,42,FOLLOW_42_in_ruleBoolConstraint2956); 

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
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1552:7: 'false'
                            {
                            match(input,43,FOLLOW_43_in_ruleBoolConstraint2985); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1564:1: entryRuleStringConstraint returns [EObject current=null] : iv_ruleStringConstraint= ruleStringConstraint EOF ;
    public final EObject entryRuleStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1565:2: (iv_ruleStringConstraint= ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1566:2: iv_ruleStringConstraint= ruleStringConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint3024);
            iv_ruleStringConstraint=ruleStringConstraint();
            _fsp--;

             current =iv_ruleStringConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint3034); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1573:1: ruleStringConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )? ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;
        Token lv_isFixed_3_0=null;
        Token lv_fixedValue_4_0=null;
        Token lv_minLen_6_0=null;
        Token lv_maxLen_8_0=null;
        Token lv_fixeLen_10_0=null;
        Token lv_isXSDAtt_11_0=null;
        Token lv_regularExpression_13_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1578:6: ( ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )? ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1579:1: ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )? ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1579:1: ( ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )? ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1579:2: ( (lv_constraint_0_0= 'string' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )? ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )? ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1579:2: ( (lv_constraint_0_0= 'string' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1580:1: (lv_constraint_0_0= 'string' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1580:1: (lv_constraint_0_0= 'string' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1581:3: lv_constraint_0_0= 'string'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,44,FOLLOW_44_in_ruleStringConstraint3077); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1600:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1600:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1600:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1601:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1601:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1602:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleStringConstraint3109); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1621:2: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1622:1: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1622:1: (lv_defaultValue_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1623:3: lv_defaultValue_2_0= RULE_STRING
                    {
                    lv_defaultValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint3139); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1645:4: ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1645:5: ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1645:5: ( (lv_isFixed_3_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1646:1: (lv_isFixed_3_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1646:1: (lv_isFixed_3_0= 'fixed' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1647:3: lv_isFixed_3_0= 'fixed'
                    {
                    lv_isFixed_3_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleStringConstraint3165); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getIsFixedFixedKeyword_2_0_0(), "isFixed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isFixed", true, "fixed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1666:2: ( (lv_fixedValue_4_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1667:1: (lv_fixedValue_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1667:1: (lv_fixedValue_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1668:3: lv_fixedValue_4_0= RULE_STRING
                    {
                    lv_fixedValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint3195); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0(), "fixedValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixedValue",
                    	        		lv_fixedValue_4_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1690:4: ( 'minLen' ( (lv_minLen_6_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1690:6: 'minLen' ( (lv_minLen_6_0= RULE_INT ) )
                    {
                    match(input,46,FOLLOW_46_in_ruleStringConstraint3213); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getMinLenKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1694:1: ( (lv_minLen_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1695:1: (lv_minLen_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1695:1: (lv_minLen_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1696:3: lv_minLen_6_0= RULE_INT
                    {
                    lv_minLen_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint3230); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getMinLenINTTerminalRuleCall_3_1_0(), "minLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minLen",
                    	        		lv_minLen_6_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1718:4: ( 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1718:6: 'maxLen' ( (lv_maxLen_8_0= RULE_INT ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleStringConstraint3248); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getMaxLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1722:1: ( (lv_maxLen_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1723:1: (lv_maxLen_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1723:1: (lv_maxLen_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1724:3: lv_maxLen_8_0= RULE_INT
                    {
                    lv_maxLen_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint3265); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getMaxLenINTTerminalRuleCall_4_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1746:4: ( 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1746:6: 'fixeLen' ( (lv_fixeLen_10_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleStringConstraint3283); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getFixeLenKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1750:1: ( (lv_fixeLen_10_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1751:1: (lv_fixeLen_10_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1751:1: (lv_fixeLen_10_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1752:3: lv_fixeLen_10_0= RULE_INT
                    {
                    lv_fixeLen_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringConstraint3300); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getFixeLenINTTerminalRuleCall_5_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1774:4: ( (lv_isXSDAtt_11_0= 'xsd Att.' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==49) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1775:1: (lv_isXSDAtt_11_0= 'xsd Att.' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1775:1: (lv_isXSDAtt_11_0= 'xsd Att.' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1776:3: lv_isXSDAtt_11_0= 'xsd Att.'
                    {
                    lv_isXSDAtt_11_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleStringConstraint3325); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getIsXSDAttXsdAttKeyword_6_0(), "isXSDAtt"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isXSDAtt", true, "xsd Att.", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1795:3: ( 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1795:5: 'regexp' ( (lv_regularExpression_13_0= RULE_STRING ) )
                    {
                    match(input,50,FOLLOW_50_in_ruleStringConstraint3350); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getRegexpKeyword_7_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1799:1: ( (lv_regularExpression_13_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1800:1: (lv_regularExpression_13_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1800:1: (lv_regularExpression_13_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1801:3: lv_regularExpression_13_0= RULE_STRING
                    {
                    lv_regularExpression_13_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint3367); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_7_1_0(), "regularExpression"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"regularExpression",
                    	        		lv_regularExpression_13_0, 
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1831:1: entryRuleDateTimeConstraint returns [EObject current=null] : iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF ;
    public final EObject entryRuleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1832:2: (iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1833:2: iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimeConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3410);
            iv_ruleDateTimeConstraint=ruleDateTimeConstraint();
            _fsp--;

             current =iv_ruleDateTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint3420); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1840:1: ruleDateTimeConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_2_0=null;
        Token lv_defaultValue_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1845:6: ( ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1846:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1846:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1846:2: ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1846:2: ( (lv_constraint_0_0= 'datetime' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1847:1: (lv_constraint_0_0= 'datetime' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1847:1: (lv_constraint_0_0= 'datetime' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1848:3: lv_constraint_0_0= 'datetime'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,51,FOLLOW_51_in_ruleDateTimeConstraint3463); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1867:2: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1868:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1868:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1869:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeConstraint3494); 

            		createLeafNode(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0(), "dataType"); 
            	

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1881:2: ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1881:3: ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1881:3: ( (lv_hasDefault_2_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1882:1: (lv_hasDefault_2_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1882:1: (lv_hasDefault_2_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1883:3: lv_hasDefault_2_0= 'default'
                    {
                    lv_hasDefault_2_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleDateTimeConstraint3513); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1902:2: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1903:1: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1903:1: (lv_defaultValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1904:3: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3543); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1934:1: entryRuleIntegerConstraint returns [EObject current=null] : iv_ruleIntegerConstraint= ruleIntegerConstraint EOF ;
    public final EObject entryRuleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1935:2: (iv_ruleIntegerConstraint= ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1936:2: iv_ruleIntegerConstraint= ruleIntegerConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3586);
            iv_ruleIntegerConstraint=ruleIntegerConstraint();
            _fsp--;

             current =iv_ruleIntegerConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint3596); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1943:1: ruleIntegerConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) ;
    public final EObject ruleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;
        Token lv_isFixed_3_0=null;
        Token lv_fixedValue_4_0=null;
        Token lv_minValue_6_0=null;
        Token lv_maxValue_8_0=null;
        Token lv_maxLen_10_0=null;
        Token lv_fixeLen_12_0=null;
        Token lv_paddle_14_0=null;
        Token lv_isXSDAtt_15_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1948:6: ( ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:2: ( (lv_constraint_0_0= 'integer' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:2: ( (lv_constraint_0_0= 'integer' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1950:1: (lv_constraint_0_0= 'integer' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1950:1: (lv_constraint_0_0= 'integer' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1951:3: lv_constraint_0_0= 'integer'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,52,FOLLOW_52_in_ruleIntegerConstraint3639); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1970:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1970:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_INT ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1970:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1971:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1971:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1972:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleIntegerConstraint3671); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1991:2: ( (lv_defaultValue_2_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1992:1: (lv_defaultValue_2_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1992:1: (lv_defaultValue_2_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1993:3: lv_defaultValue_2_0= RULE_INT
                    {
                    lv_defaultValue_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3701); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2015:4: ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2015:5: ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_INT ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2015:5: ( (lv_isFixed_3_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2016:1: (lv_isFixed_3_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2016:1: (lv_isFixed_3_0= 'fixed' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:3: lv_isFixed_3_0= 'fixed'
                    {
                    lv_isFixed_3_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleIntegerConstraint3727); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getIsFixedFixedKeyword_2_0_0(), "isFixed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isFixed", true, "fixed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2036:2: ( (lv_fixedValue_4_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2037:1: (lv_fixedValue_4_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2037:1: (lv_fixedValue_4_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2038:3: lv_fixedValue_4_0= RULE_INT
                    {
                    lv_fixedValue_4_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3757); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getFixedValueINTTerminalRuleCall_2_1_0(), "fixedValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixedValue",
                    	        		lv_fixedValue_4_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2060:4: ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2060:6: 'minVal' ( (lv_minValue_6_0= RULE_INT ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleIntegerConstraint3775); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMinValKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2064:1: ( (lv_minValue_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2065:1: (lv_minValue_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2065:1: (lv_minValue_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2066:3: lv_minValue_6_0= RULE_INT
                    {
                    lv_minValue_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3792); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0(), "minValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minValue",
                    	        		lv_minValue_6_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2088:4: ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2088:6: 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleIntegerConstraint3810); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxValKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2092:1: ( (lv_maxValue_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2093:1: (lv_maxValue_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2093:1: (lv_maxValue_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2094:3: lv_maxValue_8_0= RULE_INT
                    {
                    lv_maxValue_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3827); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0(), "maxValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxValue",
                    	        		lv_maxValue_8_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:4: ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2116:6: 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleIntegerConstraint3845); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxLenKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2120:1: ( (lv_maxLen_10_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2121:1: (lv_maxLen_10_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2121:1: (lv_maxLen_10_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2122:3: lv_maxLen_10_0= RULE_INT
                    {
                    lv_maxLen_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3862); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_10_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2144:4: ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2144:6: 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleIntegerConstraint3880); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getFixeLenKeyword_6_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2148:1: ( (lv_fixeLen_12_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2149:1: (lv_fixeLen_12_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2149:1: (lv_fixeLen_12_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2150:3: lv_fixeLen_12_0= RULE_INT
                    {
                    lv_fixeLen_12_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerConstraint3897); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_12_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2172:4: ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2172:6: 'paddle' ( (lv_paddle_14_0= RULE_STRING ) )
                    {
                    match(input,55,FOLLOW_55_in_ruleIntegerConstraint3915); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getPaddleKeyword_7_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2176:1: ( (lv_paddle_14_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2177:1: (lv_paddle_14_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2177:1: (lv_paddle_14_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2178:3: lv_paddle_14_0= RULE_STRING
                    {
                    lv_paddle_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntegerConstraint3932); 

                    			createLeafNode(grammarAccess.getIntegerConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_14_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2200:4: ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2201:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2201:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2202:3: lv_isXSDAtt_15_0= 'xsd Att.'
                    {
                    lv_isXSDAtt_15_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleIntegerConstraint3957); 

                            createLeafNode(grammarAccess.getIntegerConstraintAccess().getIsXSDAttXsdAttKeyword_8_0(), "isXSDAtt"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isXSDAtt", true, "xsd Att.", lastConsumedNode);
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
    // $ANTLR end ruleIntegerConstraint


    // $ANTLR start entryRuleDecimalConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2229:1: entryRuleDecimalConstraint returns [EObject current=null] : iv_ruleDecimalConstraint= ruleDecimalConstraint EOF ;
    public final EObject entryRuleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2230:2: (iv_ruleDecimalConstraint= ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2231:2: iv_ruleDecimalConstraint= ruleDecimalConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint4007);
            iv_ruleDecimalConstraint=ruleDecimalConstraint();
            _fsp--;

             current =iv_ruleDecimalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint4017); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2238:1: ruleDecimalConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'decimal' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) ;
    public final EObject ruleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_1_0=null;
        Token lv_defaultValue_2_0=null;
        Token lv_isFixed_3_0=null;
        Token lv_fixedValue_4_0=null;
        Token lv_minValue_6_0=null;
        Token lv_maxValue_8_0=null;
        Token lv_maxLen_10_0=null;
        Token lv_fixeLen_12_0=null;
        Token lv_paddle_14_0=null;
        Token lv_isXSDAtt_15_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2243:6: ( ( ( (lv_constraint_0_0= 'decimal' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2244:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2244:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2244:2: ( (lv_constraint_0_0= 'decimal' ) ) ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )? ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2244:2: ( (lv_constraint_0_0= 'decimal' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2245:1: (lv_constraint_0_0= 'decimal' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2245:1: (lv_constraint_0_0= 'decimal' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2246:3: lv_constraint_0_0= 'decimal'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,56,FOLLOW_56_in_ruleDecimalConstraint4060); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2265:2: ( ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2265:3: ( (lv_hasDefault_1_0= 'default' ) ) ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2265:3: ( (lv_hasDefault_1_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2266:1: (lv_hasDefault_1_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2266:1: (lv_hasDefault_1_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2267:3: lv_hasDefault_1_0= 'default'
                    {
                    lv_hasDefault_1_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleDecimalConstraint4092); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getHasDefaultDefaultKeyword_1_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2286:2: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2287:1: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2287:1: (lv_defaultValue_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2288:3: lv_defaultValue_2_0= RULE_STRING
                    {
                    lv_defaultValue_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalConstraint4122); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_1_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2310:4: ( ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2310:5: ( (lv_isFixed_3_0= 'fixed' ) ) ( (lv_fixedValue_4_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2310:5: ( (lv_isFixed_3_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2311:1: (lv_isFixed_3_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2311:1: (lv_isFixed_3_0= 'fixed' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2312:3: lv_isFixed_3_0= 'fixed'
                    {
                    lv_isFixed_3_0=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleDecimalConstraint4148); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getIsFixedFixedKeyword_2_0_0(), "isFixed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isFixed", true, "fixed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2331:2: ( (lv_fixedValue_4_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2332:1: (lv_fixedValue_4_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2332:1: (lv_fixedValue_4_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2333:3: lv_fixedValue_4_0= RULE_STRING
                    {
                    lv_fixedValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalConstraint4178); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getFixedValueSTRINGTerminalRuleCall_2_1_0(), "fixedValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixedValue",
                    	        		lv_fixedValue_4_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2355:4: ( 'minVal' ( (lv_minValue_6_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2355:6: 'minVal' ( (lv_minValue_6_0= RULE_INT ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleDecimalConstraint4196); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMinValKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2359:1: ( (lv_minValue_6_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2360:1: (lv_minValue_6_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2360:1: (lv_minValue_6_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2361:3: lv_minValue_6_0= RULE_INT
                    {
                    lv_minValue_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint4213); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMinValueINTTerminalRuleCall_3_1_0(), "minValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minValue",
                    	        		lv_minValue_6_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2383:4: ( 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2383:6: 'maxVal' ( (lv_maxValue_8_0= RULE_INT ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleDecimalConstraint4231); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxValKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2387:1: ( (lv_maxValue_8_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2388:1: (lv_maxValue_8_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2388:1: (lv_maxValue_8_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2389:3: lv_maxValue_8_0= RULE_INT
                    {
                    lv_maxValue_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint4248); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxValueINTTerminalRuleCall_4_1_0(), "maxValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxValue",
                    	        		lv_maxValue_8_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2411:4: ( 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2411:6: 'maxLen' ( (lv_maxLen_10_0= RULE_INT ) )
                    {
                    match(input,47,FOLLOW_47_in_ruleDecimalConstraint4266); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxLenKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2415:1: ( (lv_maxLen_10_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2416:1: (lv_maxLen_10_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2416:1: (lv_maxLen_10_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2417:3: lv_maxLen_10_0= RULE_INT
                    {
                    lv_maxLen_10_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint4283); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_10_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2439:4: ( 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2439:6: 'fixeLen' ( (lv_fixeLen_12_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleDecimalConstraint4301); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getFixeLenKeyword_6_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2443:1: ( (lv_fixeLen_12_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2444:1: (lv_fixeLen_12_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2444:1: (lv_fixeLen_12_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2445:3: lv_fixeLen_12_0= RULE_INT
                    {
                    lv_fixeLen_12_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDecimalConstraint4318); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_12_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2467:4: ( 'paddle' ( (lv_paddle_14_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2467:6: 'paddle' ( (lv_paddle_14_0= RULE_STRING ) )
                    {
                    match(input,55,FOLLOW_55_in_ruleDecimalConstraint4336); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getPaddleKeyword_7_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2471:1: ( (lv_paddle_14_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2472:1: (lv_paddle_14_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2472:1: (lv_paddle_14_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2473:3: lv_paddle_14_0= RULE_STRING
                    {
                    lv_paddle_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecimalConstraint4353); 

                    			createLeafNode(grammarAccess.getDecimalConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_14_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2495:4: ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2496:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2496:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2497:3: lv_isXSDAtt_15_0= 'xsd Att.'
                    {
                    lv_isXSDAtt_15_0=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleDecimalConstraint4378); 

                            createLeafNode(grammarAccess.getDecimalConstraintAccess().getIsXSDAttXsdAttKeyword_8_0(), "isXSDAtt"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isXSDAtt", true, "xsd Att.", lastConsumedNode);
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
    // $ANTLR end ruleDecimalConstraint


    // $ANTLR start entryRuleEnumerationConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2524:1: entryRuleEnumerationConstraint returns [EObject current=null] : iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF ;
    public final EObject entryRuleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2525:2: (iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2526:2: iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint4428);
            iv_ruleEnumerationConstraint=ruleEnumerationConstraint();
            _fsp--;

             current =iv_ruleEnumerationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint4438); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2533:1: ruleEnumerationConstraint returns [EObject current=null] : ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_fixeLen_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValueAsString_5_0=null;
        Enumerator lv_usage_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2538:6: ( ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2539:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2539:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2539:3: 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            {
            match(input,57,FOLLOW_57_in_ruleEnumerationConstraint4473); 

                    createLeafNode(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2543:1: ( (lv_usage_1_0= ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2544:1: (lv_usage_1_0= ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2544:1: (lv_usage_1_0= ruleEnumUsage )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2545:3: lv_usage_1_0= ruleEnumUsage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint4494);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2567:2: ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2567:4: 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleEnumerationConstraint4505); 

                            createLeafNode(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2571:1: ( (lv_fixeLen_3_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2572:1: (lv_fixeLen_3_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2572:1: (lv_fixeLen_3_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2573:3: lv_fixeLen_3_0= RULE_INT
                    {
                    lv_fixeLen_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationConstraint4522); 

                    			createLeafNode(grammarAccess.getEnumerationConstraintAccess().getFixeLenINTTerminalRuleCall_2_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_3_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2595:4: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2595:5: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2595:5: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2596:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2596:1: (lv_hasDefault_4_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2597:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleEnumerationConstraint4548); 

                            createLeafNode(grammarAccess.getEnumerationConstraintAccess().getHasDefaultDefaultKeyword_3_0_0(), "hasDefault"); 
                        

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2616:2: ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2617:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2617:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2618:3: lv_defaultValueAsString_5_0= RULE_ID
                    {
                    lv_defaultValueAsString_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationConstraint4578); 

                    			createLeafNode(grammarAccess.getEnumerationConstraintAccess().getDefaultValueAsStringIDTerminalRuleCall_3_1_0(), "defaultValueAsString"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEnumerationConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValueAsString",
                    	        		lv_defaultValueAsString_5_0, 
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2648:1: ruleEnumUsage returns [Enumerator current=null] : ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) ) ;
    public final Enumerator ruleEnumUsage() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2652:6: ( ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2653:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2653:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case 60:
                {
                alt49=3;
                }
                break;
            case 61:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2653:1: ( ( 'as String' ) | ( 'as bool String' ) | ( 'as Value' ) | ( 'as bool Value' ) )", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2653:2: ( 'as String' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2653:2: ( 'as String' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2653:4: 'as String'
                    {
                    match(input,58,FOLLOW_58_in_ruleEnumUsage4633); 

                            current = grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2659:6: ( 'as bool String' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2659:6: ( 'as bool String' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2659:8: 'as bool String'
                    {
                    match(input,59,FOLLOW_59_in_ruleEnumUsage4648); 

                            current = grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsBooleanEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2665:6: ( 'as Value' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2665:6: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2665:8: 'as Value'
                    {
                    match(input,60,FOLLOW_60_in_ruleEnumUsage4663); 

                            current = grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2671:6: ( 'as bool Value' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2671:6: ( 'as bool Value' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2671:8: 'as bool Value'
                    {
                    match(input,61,FOLLOW_61_in_ruleEnumUsage4678); 

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
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000086001802L});
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
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration557 = new BitSet(new long[]{0x0000000087FD1800L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration569 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration587 = new BitSet(new long[]{0x0000000087C01800L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration617 = new BitSet(new long[]{0x0000000087C01800L});
    public static final BitSet FOLLOW_19_in_rulePackageDeclaration633 = new BitSet(new long[]{0x0000000087C01800L});
    public static final BitSet FOLLOW_20_in_rulePackageDeclaration649 = new BitSet(new long[]{0x0000000087C01800L});
    public static final BitSet FOLLOW_21_in_rulePackageDeclaration665 = new BitSet(new long[]{0x0000000087C01800L});
    public static final BitSet FOLLOW_22_in_rulePackageDeclaration678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration695 = new BitSet(new long[]{0x0000000087801800L});
    public static final BitSet FOLLOW_23_in_rulePackageDeclaration713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration730 = new BitSet(new long[]{0x0000000087801800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration758 = new BitSet(new long[]{0x0000000087001800L});
    public static final BitSet FOLLOW_24_in_rulePackageDeclaration769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleType916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType996 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEntity1099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1116 = new BitSet(new long[]{0x0000000008008010L});
    public static final BitSet FOLLOW_27_in_ruleEntity1132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1155 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1174 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1190 = new BitSet(new long[]{0x0000000021000020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1211 = new BitSet(new long[]{0x0000000021000020L});
    public static final BitSet FOLLOW_24_in_ruleEntity1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_ruleFeature1315 = new BitSet(new long[]{0x0318110000000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleFeature1335 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStructuralFeature1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStructuralFeature1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1566 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttribute1581 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReference1683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1700 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReference1715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleReference1736 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleReference1747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEnumeration1848 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1865 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEnumeration1880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1901 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleEnumeration1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral2000 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEnumerationLiteral2016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral2033 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEnumerationLiteral2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef2259 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeRef2277 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeRef2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2418 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedNameWithWildCard2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2531 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName2550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2565 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_ruleConstraint2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_ruleConstraint2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_ruleConstraint2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_ruleConstraint2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBoolConstraint2892 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleBoolConstraint2924 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleBoolConstraint2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBoolConstraint2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint3024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStringConstraint3077 = new BitSet(new long[]{0x0007E20000000002L});
    public static final BitSet FOLLOW_41_in_ruleStringConstraint3109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint3139 = new BitSet(new long[]{0x0007E00000000002L});
    public static final BitSet FOLLOW_45_in_ruleStringConstraint3165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint3195 = new BitSet(new long[]{0x0007C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleStringConstraint3213 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint3230 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_47_in_ruleStringConstraint3248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint3265 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_48_in_ruleStringConstraint3283 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringConstraint3300 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleStringConstraint3325 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStringConstraint3350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDateTimeConstraint3463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeConstraint3494 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleDateTimeConstraint3513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIntegerConstraint3639 = new BitSet(new long[]{0x00E3A20000000002L});
    public static final BitSet FOLLOW_41_in_ruleIntegerConstraint3671 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3701 = new BitSet(new long[]{0x00E3A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntegerConstraint3727 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3757 = new BitSet(new long[]{0x00E3800000000002L});
    public static final BitSet FOLLOW_53_in_ruleIntegerConstraint3775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3792 = new BitSet(new long[]{0x00C3800000000002L});
    public static final BitSet FOLLOW_54_in_ruleIntegerConstraint3810 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3827 = new BitSet(new long[]{0x0083800000000002L});
    public static final BitSet FOLLOW_47_in_ruleIntegerConstraint3845 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3862 = new BitSet(new long[]{0x0083000000000002L});
    public static final BitSet FOLLOW_48_in_ruleIntegerConstraint3880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerConstraint3897 = new BitSet(new long[]{0x0082000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIntegerConstraint3915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntegerConstraint3932 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIntegerConstraint3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint4007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDecimalConstraint4060 = new BitSet(new long[]{0x00E3A20000000002L});
    public static final BitSet FOLLOW_41_in_ruleDecimalConstraint4092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalConstraint4122 = new BitSet(new long[]{0x00E3A00000000002L});
    public static final BitSet FOLLOW_45_in_ruleDecimalConstraint4148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalConstraint4178 = new BitSet(new long[]{0x00E3800000000002L});
    public static final BitSet FOLLOW_53_in_ruleDecimalConstraint4196 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint4213 = new BitSet(new long[]{0x00C3800000000002L});
    public static final BitSet FOLLOW_54_in_ruleDecimalConstraint4231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint4248 = new BitSet(new long[]{0x0083800000000002L});
    public static final BitSet FOLLOW_47_in_ruleDecimalConstraint4266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint4283 = new BitSet(new long[]{0x0083000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDecimalConstraint4301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDecimalConstraint4318 = new BitSet(new long[]{0x0082000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDecimalConstraint4336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecimalConstraint4353 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDecimalConstraint4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEnumerationConstraint4473 = new BitSet(new long[]{0x3C00000000000000L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint4494 = new BitSet(new long[]{0x0001020000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumerationConstraint4505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationConstraint4522 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleEnumerationConstraint4548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationConstraint4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleEnumUsage4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleEnumUsage4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEnumUsage4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleEnumUsage4678 = new BitSet(new long[]{0x0000000000000002L});

}