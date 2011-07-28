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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'package'", "'prefix'", "'namespace'", "'{'", "'format'", "'XSD'", "'DTD'", "'FLAT'", "'CSV'", "'DB'", "'delimiter'", "'lineSpec'", "'}'", "'datatype'", "'entity'", "'extends'", "':'", "'ref'", "'opposite'", "'enumeration'", "'['", "']'", "'='", "';'", "'*'", "'?'", "'.*'", "'.'", "'boolean'", "'string'", "'regexp'", "'datetime'", "'default'", "'integer'", "'decimal'", "'enum'", "'fixeLen'", "'minVal'", "'maxVal'", "'fixed'", "'minLen'", "'maxLen'", "'paddle'", "'nullable'", "'derived'", "'writable'", "'xsd Att.'", "'public'", "'private'", "'protected'", "'abstract'", "'as String'", "'as Value'"
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

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=25 && LA1_0<=26)||LA1_0==31||LA1_0==62) ) {
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
            case 62:
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

                if ( ((LA6_0>=11 && LA6_0<=12)||(LA6_0>=25 && LA6_0<=26)||LA6_0==31||LA6_0==62) ) {
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
            case 62:
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:580:1: ruleEntity returns [EObject current=null] : ( ( (lv_entityType_0_0= ruleEntityType ) )? 'entity' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_5_0= RULE_STRING ) )? '{' ( (lv_features_7_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_description_5_0=null;
        Enumerator lv_entityType_0_0 = null;

        EObject lv_features_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:585:6: ( ( ( (lv_entityType_0_0= ruleEntityType ) )? 'entity' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_5_0= RULE_STRING ) )? '{' ( (lv_features_7_0= ruleFeature ) )* '}' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? 'entity' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_5_0= RULE_STRING ) )? '{' ( (lv_features_7_0= ruleFeature ) )* '}' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:1: ( ( (lv_entityType_0_0= ruleEntityType ) )? 'entity' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_5_0= RULE_STRING ) )? '{' ( (lv_features_7_0= ruleFeature ) )* '}' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:2: ( (lv_entityType_0_0= ruleEntityType ) )? 'entity' ( (lv_name_2_0= RULE_ID ) ) ( 'extends' ( ( ruleQualifiedName ) ) )? ( (lv_description_5_0= RULE_STRING ) )? '{' ( (lv_features_7_0= ruleFeature ) )* '}'
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:586:2: ( (lv_entityType_0_0= ruleEntityType ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==62) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:587:1: (lv_entityType_0_0= ruleEntityType )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:587:1: (lv_entityType_0_0= ruleEntityType )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:588:3: lv_entityType_0_0= ruleEntityType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getEntityTypeEntityTypeEnumRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEntityType_in_ruleEntity1110);
                    lv_entityType_0_0=ruleEntityType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"entityType",
                    	        		lv_entityType_0_0, 
                    	        		"EntityType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ruleEntity1121); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_1(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:614:1: ( (lv_name_2_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:615:1: (lv_name_2_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:615:1: (lv_name_2_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:616:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1138); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:638:2: ( 'extends' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:638:4: 'extends' ( ( ruleQualifiedName ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleEntity1154); 

                            createLeafNode(grammarAccess.getEntityAccess().getExtendsKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:642:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:643:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:643:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:644:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1177);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:658:4: ( (lv_description_5_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:659:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:659:1: (lv_description_5_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:660:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEntity1196); 

                    			createLeafNode(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleEntity1212); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:686:1: ( (lv_features_7_0= ruleFeature ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:687:1: (lv_features_7_0= ruleFeature )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:687:1: (lv_features_7_0= ruleFeature )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:688:3: lv_features_7_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1233);
            	    lv_features_7_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_7_0, 
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
            	    break loop11;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_ruleEntity1244); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7(), null); 
                

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:722:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:723:2: (iv_ruleFeature= ruleFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:724:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1280);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1290); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:731:1: ruleFeature returns [EObject current=null] : (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_description_2_0=null;
        EObject this_StructuralFeature_0 = null;

        EObject lv_constraint_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:736:6: ( (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:737:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:737:1: (this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:738:5: this_StructuralFeature_0= ruleStructuralFeature ( (lv_constraint_1_0= ruleConstraint ) )? ( (lv_description_2_0= RULE_STRING ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getStructuralFeatureParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructuralFeature_in_ruleFeature1337);
            this_StructuralFeature_0=ruleStructuralFeature();
            _fsp--;

             
                    current = this_StructuralFeature_0; 
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:746:1: ( (lv_constraint_1_0= ruleConstraint ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=40 && LA12_0<=41)||LA12_0==43||(LA12_0>=45 && LA12_0<=47)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:747:1: (lv_constraint_1_0= ruleConstraint )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:747:1: (lv_constraint_1_0= ruleConstraint )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:748:3: lv_constraint_1_0= ruleConstraint
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureAccess().getConstraintConstraintParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleFeature1357);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:770:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:771:1: (lv_description_2_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:771:1: (lv_description_2_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:772:3: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeature1375); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:802:1: entryRuleStructuralFeature returns [EObject current=null] : iv_ruleStructuralFeature= ruleStructuralFeature EOF ;
    public final EObject entryRuleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeature = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:803:2: (iv_ruleStructuralFeature= ruleStructuralFeature EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:804:2: iv_ruleStructuralFeature= ruleStructuralFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructuralFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1417);
            iv_ruleStructuralFeature=ruleStructuralFeature();
            _fsp--;

             current =iv_ruleStructuralFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralFeature1427); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:811:1: ruleStructuralFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:816:6: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:817:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:817:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("817:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:818:5: this_Attribute_0= ruleAttribute
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getAttributeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStructuralFeature1474);
                    this_Attribute_0=ruleAttribute();
                    _fsp--;

                     
                            current = this_Attribute_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:828:5: this_Reference_1= ruleReference
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getStructuralFeatureAccess().getReferenceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReference_in_ruleStructuralFeature1501);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:844:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:845:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:846:2: iv_ruleAttribute= ruleAttribute EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1536);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1546); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:853:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:858:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:859:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:859:1: ( ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:859:2: ( (lv_name_0_0= RULE_ID ) ) ':' ( (lv_type_2_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:859:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:860:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:860:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:861:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1588); 

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

            match(input,28,FOLLOW_28_in_ruleAttribute1603); 

                    createLeafNode(grammarAccess.getAttributeAccess().getColonKeyword_1(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:887:1: ( (lv_type_2_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:888:1: (lv_type_2_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:888:1: (lv_type_2_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:889:3: lv_type_2_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute1624);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:919:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:920:2: (iv_ruleReference= ruleReference EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:921:2: iv_ruleReference= ruleReference EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReferenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1660);
            iv_ruleReference=ruleReference();
            _fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1670); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:928:1: ruleReference returns [EObject current=null] : ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:933:6: ( ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:934:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:934:1: ( 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:934:3: 'ref' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_type_3_0= ruleTypeRef ) ) ( 'opposite' ( ( RULE_ID ) ) )?
            {
            match(input,29,FOLLOW_29_in_ruleReference1705); 

                    createLeafNode(grammarAccess.getReferenceAccess().getRefKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:938:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:939:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:939:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:940:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1722); 

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

            match(input,28,FOLLOW_28_in_ruleReference1737); 

                    createLeafNode(grammarAccess.getReferenceAccess().getColonKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:966:1: ( (lv_type_3_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:967:1: (lv_type_3_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:967:1: (lv_type_3_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:968:3: lv_type_3_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReferenceAccess().getTypeTypeRefParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleReference1758);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:990:2: ( 'opposite' ( ( RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:990:4: 'opposite' ( ( RULE_ID ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleReference1769); 

                            createLeafNode(grammarAccess.getReferenceAccess().getOppositeKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:994:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:995:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:995:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:996:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getReferenceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReference1787); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1016:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1017:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1018:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1825);
            iv_ruleEnumeration=ruleEnumeration();
            _fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1835); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1025:1: ruleEnumeration returns [EObject current=null] : ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_enumerationLiterals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1030:6: ( ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1031:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1031:1: ( 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1031:3: 'enumeration' ( (lv_name_1_0= RULE_ID ) ) '[' ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+ ']'
            {
            match(input,31,FOLLOW_31_in_ruleEnumeration1870); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1035:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1036:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1036:1: (lv_name_1_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1037:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1887); 

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

            match(input,32,FOLLOW_32_in_ruleEnumeration1902); 

                    createLeafNode(grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1063:1: ( (lv_enumerationLiterals_3_0= ruleEnumerationLiteral ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1064:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1064:1: (lv_enumerationLiterals_3_0= ruleEnumerationLiteral )
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1065:3: lv_enumerationLiterals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEnumerationLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1923);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            match(input,33,FOLLOW_33_in_ruleEnumeration1934); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1099:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1100:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1101:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1970);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();
            _fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral1980); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1108:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_persistedValue_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1113:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:1: ( ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:2: ( (lv_name_0_0= RULE_ID ) ) ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) ) ';'
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1114:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1115:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1115:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1116:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral2022); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1138:2: ( '=' ( (lv_persistedValue_2_0= RULE_INT ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1138:4: '=' ( (lv_persistedValue_2_0= RULE_INT ) )
            {
            match(input,34,FOLLOW_34_in_ruleEnumerationLiteral2038); 

                    createLeafNode(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1142:1: ( (lv_persistedValue_2_0= RULE_INT ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1143:1: (lv_persistedValue_2_0= RULE_INT )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1143:1: (lv_persistedValue_2_0= RULE_INT )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1144:3: lv_persistedValue_2_0= RULE_INT
            {
            lv_persistedValue_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationLiteral2055); 

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

            match(input,35,FOLLOW_35_in_ruleEnumerationLiteral2071); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1180:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1181:2: (iv_ruleParameter= ruleParameter EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1182:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2109);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2119); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1189:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1194:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1195:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1195:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1195:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleTypeRef ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1195:2: ( (lv_name_0_0= RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1196:1: (lv_name_0_0= RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1196:1: (lv_name_0_0= RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1197:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2161); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1219:2: ( (lv_type_1_0= ruleTypeRef ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1220:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1220:1: (lv_type_1_0= ruleTypeRef )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1221:3: lv_type_1_0= ruleTypeRef
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRef_in_ruleParameter2187);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1253:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1254:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1255:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef2225);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;

             current =iv_ruleTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef2235); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1262:1: ruleTypeRef returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_multi_1_0=null;
        Token lv_option_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1267:6: ( ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:1: ( ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:2: ( ( ruleQualifiedName ) ) ( (lv_multi_1_0= '*' ) )? ( (lv_option_2_0= '?' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1268:2: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1269:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1269:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1270:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getReferencedTypeCrossReference_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeRef2283);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1284:2: ( (lv_multi_1_0= '*' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1285:1: (lv_multi_1_0= '*' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1285:1: (lv_multi_1_0= '*' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1286:3: lv_multi_1_0= '*'
                    {
                    lv_multi_1_0=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleTypeRef2301); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1305:3: ( (lv_option_2_0= '?' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1306:1: (lv_option_2_0= '?' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1306:1: (lv_option_2_0= '?' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1307:3: lv_option_2_0= '?'
                    {
                    lv_option_2_0=(Token)input.LT(1);
                    match(input,37,FOLLOW_37_in_ruleTypeRef2333); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1334:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1335:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1336:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2384);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2395); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1343:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1348:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1349:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1349:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1350:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2442);
            this_QualifiedName_0=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1360:1: (kw= '.*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1361:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,38,FOLLOW_38_in_ruleQualifiedNameWithWildCard2461); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1374:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1375:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1376:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2504);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2515); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1383:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1388:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1389:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1389:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1389:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2555); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1396:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1397:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,39,FOLLOW_39_in_ruleQualifiedName2574); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2589); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1417:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1418:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1419:2: iv_ruleConstraint= ruleConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2636);
            iv_ruleConstraint=ruleConstraint();
            _fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2646); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1426:1: ruleConstraint returns [EObject current=null] : (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) ;
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
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1431:6: ( (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1432:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1432:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 45:
                {
                alt21=4;
                }
                break;
            case 46:
                {
                alt21=5;
                }
                break;
            case 47:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1432:1: (this_BoolConstraint_0= ruleBoolConstraint | this_StringConstraint_1= ruleStringConstraint | this_DateTimeConstraint_2= ruleDateTimeConstraint | this_IntegerConstraint_3= ruleIntegerConstraint | this_DecimalConstraint_4= ruleDecimalConstraint | this_EnumerationConstraint_5= ruleEnumerationConstraint )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1433:5: this_BoolConstraint_0= ruleBoolConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getBoolConstraintParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolConstraint_in_ruleConstraint2693);
                    this_BoolConstraint_0=ruleBoolConstraint();
                    _fsp--;

                     
                            current = this_BoolConstraint_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1443:5: this_StringConstraint_1= ruleStringConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getStringConstraintParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringConstraint_in_ruleConstraint2720);
                    this_StringConstraint_1=ruleStringConstraint();
                    _fsp--;

                     
                            current = this_StringConstraint_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1453:5: this_DateTimeConstraint_2= ruleDateTimeConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDateTimeConstraintParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2747);
                    this_DateTimeConstraint_2=ruleDateTimeConstraint();
                    _fsp--;

                     
                            current = this_DateTimeConstraint_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1463:5: this_IntegerConstraint_3= ruleIntegerConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getIntegerConstraintParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntegerConstraint_in_ruleConstraint2774);
                    this_IntegerConstraint_3=ruleIntegerConstraint();
                    _fsp--;

                     
                            current = this_IntegerConstraint_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1473:5: this_DecimalConstraint_4= ruleDecimalConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getDecimalConstraintParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDecimalConstraint_in_ruleConstraint2801);
                    this_DecimalConstraint_4=ruleDecimalConstraint();
                    _fsp--;

                     
                            current = this_DecimalConstraint_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1483:5: this_EnumerationConstraint_5= ruleEnumerationConstraint
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getConstraintAccess().getEnumerationConstraintParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2828);
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1499:1: entryRuleBoolConstraint returns [EObject current=null] : iv_ruleBoolConstraint= ruleBoolConstraint EOF ;
    public final EObject entryRuleBoolConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1500:2: (iv_ruleBoolConstraint= ruleBoolConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1501:2: iv_ruleBoolConstraint= ruleBoolConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2863);
            iv_ruleBoolConstraint=ruleBoolConstraint();
            _fsp--;

             current =iv_ruleBoolConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolConstraint2873); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1508:1: ruleBoolConstraint returns [EObject current=null] : ( (lv_constraint_0_0= 'boolean' ) ) ;
    public final EObject ruleBoolConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1513:6: ( ( (lv_constraint_0_0= 'boolean' ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1514:1: ( (lv_constraint_0_0= 'boolean' ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1514:1: ( (lv_constraint_0_0= 'boolean' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1515:1: (lv_constraint_0_0= 'boolean' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1515:1: (lv_constraint_0_0= 'boolean' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1516:3: lv_constraint_0_0= 'boolean'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,40,FOLLOW_40_in_ruleBoolConstraint2915); 

                    createLeafNode(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0(), "constraint"); 
                

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1543:1: entryRuleStringConstraint returns [EObject current=null] : iv_ruleStringConstraint= ruleStringConstraint EOF ;
    public final EObject entryRuleStringConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1544:2: (iv_ruleStringConstraint= ruleStringConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1545:2: iv_ruleStringConstraint= ruleStringConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2963);
            iv_ruleStringConstraint=ruleStringConstraint();
            _fsp--;

             current =iv_ruleStringConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstraint2973); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1552:1: ruleStringConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStringConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_regularExpression_3_0=null;
        EObject lv_constraintRef_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1557:6: ( ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1558:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1558:1: ( ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1558:2: ( (lv_constraint_0_0= 'string' ) ) ( (lv_constraintRef_1_0= ruleAllConstraint ) ) ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1558:2: ( (lv_constraint_0_0= 'string' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1559:1: (lv_constraint_0_0= 'string' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1559:1: (lv_constraint_0_0= 'string' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1560:3: lv_constraint_0_0= 'string'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleStringConstraint3016); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1579:2: ( (lv_constraintRef_1_0= ruleAllConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1580:1: (lv_constraintRef_1_0= ruleAllConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1580:1: (lv_constraintRef_1_0= ruleAllConstraint )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1581:3: lv_constraintRef_1_0= ruleAllConstraint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStringConstraintAccess().getConstraintRefAllConstraintParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAllConstraint_in_ruleStringConstraint3050);
            lv_constraintRef_1_0=ruleAllConstraint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"constraintRef",
            	        		lv_constraintRef_1_0, 
            	        		"AllConstraint", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1603:2: ( 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1603:4: 'regexp' ( (lv_regularExpression_3_0= RULE_STRING ) )
                    {
                    match(input,42,FOLLOW_42_in_ruleStringConstraint3061); 

                            createLeafNode(grammarAccess.getStringConstraintAccess().getRegexpKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1607:1: ( (lv_regularExpression_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1608:1: (lv_regularExpression_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1608:1: (lv_regularExpression_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1609:3: lv_regularExpression_3_0= RULE_STRING
                    {
                    lv_regularExpression_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstraint3078); 

                    			createLeafNode(grammarAccess.getStringConstraintAccess().getRegularExpressionSTRINGTerminalRuleCall_2_1_0(), "regularExpression"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStringConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"regularExpression",
                    	        		lv_regularExpression_3_0, 
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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1639:1: entryRuleDateTimeConstraint returns [EObject current=null] : iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF ;
    public final EObject entryRuleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1640:2: (iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1641:2: iv_ruleDateTimeConstraint= ruleDateTimeConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDateTimeConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3121);
            iv_ruleDateTimeConstraint=ruleDateTimeConstraint();
            _fsp--;

             current =iv_ruleDateTimeConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeConstraint3131); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1648:1: ruleDateTimeConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDateTimeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        Token lv_hasDefault_2_0=null;
        Token lv_defaultValue_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1653:6: ( ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1654:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1654:1: ( ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1654:2: ( (lv_constraint_0_0= 'datetime' ) ) ( ( RULE_ID ) ) ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1654:2: ( (lv_constraint_0_0= 'datetime' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1655:1: (lv_constraint_0_0= 'datetime' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1655:1: (lv_constraint_0_0= 'datetime' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1656:3: lv_constraint_0_0= 'datetime'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,43,FOLLOW_43_in_ruleDateTimeConstraint3174); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1675:2: ( ( RULE_ID ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1676:1: ( RULE_ID )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1676:1: ( RULE_ID )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1677:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getDateTimeConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateTimeConstraint3205); 

            		createLeafNode(grammarAccess.getDateTimeConstraintAccess().getDataTypeDataTypeCrossReference_1_0(), "dataType"); 
            	

            }


            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1689:2: ( ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1689:3: ( (lv_hasDefault_2_0= 'default' ) ) ( (lv_defaultValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1689:3: ( (lv_hasDefault_2_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1690:1: (lv_hasDefault_2_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1690:1: (lv_hasDefault_2_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1691:3: lv_hasDefault_2_0= 'default'
                    {
                    lv_hasDefault_2_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleDateTimeConstraint3224); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1710:2: ( (lv_defaultValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1711:1: (lv_defaultValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1711:1: (lv_defaultValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1712:3: lv_defaultValue_3_0= RULE_STRING
                    {
                    lv_defaultValue_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3254); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1742:1: entryRuleIntegerConstraint returns [EObject current=null] : iv_ruleIntegerConstraint= ruleIntegerConstraint EOF ;
    public final EObject entryRuleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1743:2: (iv_ruleIntegerConstraint= ruleIntegerConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1744:2: iv_ruleIntegerConstraint= ruleIntegerConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntegerConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3297);
            iv_ruleIntegerConstraint=ruleIntegerConstraint();
            _fsp--;

             current =iv_ruleIntegerConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerConstraint3307); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1751:1: ruleIntegerConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'integer' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) ;
    public final EObject ruleIntegerConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        EObject lv_constraintRef_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1756:6: ( ( ( (lv_constraint_0_0= 'integer' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1757:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1757:1: ( ( (lv_constraint_0_0= 'integer' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1757:2: ( (lv_constraint_0_0= 'integer' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1757:2: ( (lv_constraint_0_0= 'integer' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1758:1: (lv_constraint_0_0= 'integer' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1758:1: (lv_constraint_0_0= 'integer' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1759:3: lv_constraint_0_0= 'integer'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,45,FOLLOW_45_in_ruleIntegerConstraint3350); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1778:2: ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1779:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1779:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1780:3: lv_constraintRef_1_0= ruleNumberConstraint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIntegerConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumberConstraint_in_ruleIntegerConstraint3384);
            lv_constraintRef_1_0=ruleNumberConstraint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIntegerConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"constraintRef",
            	        		lv_constraintRef_1_0, 
            	        		"NumberConstraint", 
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
    // $ANTLR end ruleIntegerConstraint


    // $ANTLR start entryRuleDecimalConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1810:1: entryRuleDecimalConstraint returns [EObject current=null] : iv_ruleDecimalConstraint= ruleDecimalConstraint EOF ;
    public final EObject entryRuleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1811:2: (iv_ruleDecimalConstraint= ruleDecimalConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1812:2: iv_ruleDecimalConstraint= ruleDecimalConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDecimalConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3420);
            iv_ruleDecimalConstraint=ruleDecimalConstraint();
            _fsp--;

             current =iv_ruleDecimalConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalConstraint3430); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1819:1: ruleDecimalConstraint returns [EObject current=null] : ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) ;
    public final EObject ruleDecimalConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_0_0=null;
        EObject lv_constraintRef_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1824:6: ( ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1825:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1825:1: ( ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1825:2: ( (lv_constraint_0_0= 'decimal' ) ) ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1825:2: ( (lv_constraint_0_0= 'decimal' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1826:1: (lv_constraint_0_0= 'decimal' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1826:1: (lv_constraint_0_0= 'decimal' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1827:3: lv_constraint_0_0= 'decimal'
            {
            lv_constraint_0_0=(Token)input.LT(1);
            match(input,46,FOLLOW_46_in_ruleDecimalConstraint3473); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1846:2: ( (lv_constraintRef_1_0= ruleNumberConstraint ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1847:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1847:1: (lv_constraintRef_1_0= ruleNumberConstraint )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1848:3: lv_constraintRef_1_0= ruleNumberConstraint
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint3507);
            lv_constraintRef_1_0=ruleNumberConstraint();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDecimalConstraintRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"constraintRef",
            	        		lv_constraintRef_1_0, 
            	        		"NumberConstraint", 
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
    // $ANTLR end ruleDecimalConstraint


    // $ANTLR start entryRuleEnumerationConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1878:1: entryRuleEnumerationConstraint returns [EObject current=null] : iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF ;
    public final EObject entryRuleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1879:2: (iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1880:2: iv_ruleEnumerationConstraint= ruleEnumerationConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumerationConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3543);
            iv_ruleEnumerationConstraint=ruleEnumerationConstraint();
            _fsp--;

             current =iv_ruleEnumerationConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationConstraint3553); 

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
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1887:1: ruleEnumerationConstraint returns [EObject current=null] : ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) ;
    public final EObject ruleEnumerationConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_fixeLen_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValueAsString_5_0=null;
        Enumerator lv_usage_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1892:6: ( ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1893:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1893:1: ( 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1893:3: 'enum' ( (lv_usage_1_0= ruleEnumUsage ) ) ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            {
            match(input,47,FOLLOW_47_in_ruleEnumerationConstraint3588); 

                    createLeafNode(grammarAccess.getEnumerationConstraintAccess().getEnumKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1897:1: ( (lv_usage_1_0= ruleEnumUsage ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1898:1: (lv_usage_1_0= ruleEnumUsage )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1898:1: (lv_usage_1_0= ruleEnumUsage )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1899:3: lv_usage_1_0= ruleEnumUsage
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEnumerationConstraintAccess().getUsageEnumUsageEnumRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3609);
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1921:2: ( 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1921:4: 'fixeLen' ( (lv_fixeLen_3_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleEnumerationConstraint3620); 

                            createLeafNode(grammarAccess.getEnumerationConstraintAccess().getFixeLenKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1925:1: ( (lv_fixeLen_3_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1926:1: (lv_fixeLen_3_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1926:1: (lv_fixeLen_3_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1927:3: lv_fixeLen_3_0= RULE_INT
                    {
                    lv_fixeLen_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationConstraint3637); 

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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:4: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:5: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1949:5: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1950:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1950:1: (lv_hasDefault_4_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1951:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleEnumerationConstraint3663); 

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

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1970:2: ( (lv_defaultValueAsString_5_0= RULE_ID ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1971:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1971:1: (lv_defaultValueAsString_5_0= RULE_ID )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:1972:3: lv_defaultValueAsString_5_0= RULE_ID
                    {
                    lv_defaultValueAsString_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationConstraint3693); 

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


    // $ANTLR start entryRuleNumberConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2002:1: entryRuleNumberConstraint returns [EObject current=null] : iv_ruleNumberConstraint= ruleNumberConstraint EOF ;
    public final EObject entryRuleNumberConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2003:2: (iv_ruleNumberConstraint= ruleNumberConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2004:2: iv_ruleNumberConstraint= ruleNumberConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNumberConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint3736);
            iv_ruleNumberConstraint=ruleNumberConstraint();
            _fsp--;

             current =iv_ruleNumberConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberConstraint3746); 

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
    // $ANTLR end entryRuleNumberConstraint


    // $ANTLR start ruleNumberConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2011:1: ruleNumberConstraint returns [EObject current=null] : ( ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_nullable_16_0= 'nullable' ) )? ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )? ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )? ) ;
    public final EObject ruleNumberConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_minValue_1_0=null;
        Token lv_maxValue_3_0=null;
        Token lv_hasDefault_4_0=null;
        Token lv_defaultValue_5_0=null;
        Token lv_isFixed_6_0=null;
        Token lv_fixedValue_7_0=null;
        Token lv_minLen_9_0=null;
        Token lv_maxLen_11_0=null;
        Token lv_fixeLen_13_0=null;
        Token lv_paddle_15_0=null;
        Token lv_nullable_16_0=null;
        Token lv_derived_17_0=null;
        Token lv_writable_18_0=null;
        Token lv_isXSDAtt_19_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2016:6: ( ( ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_nullable_16_0= 'nullable' ) )? ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )? ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:1: ( ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_nullable_16_0= 'nullable' ) )? ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )? ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:1: ( ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_nullable_16_0= 'nullable' ) )? ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )? ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:2: ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )? ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )? ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )? ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )? ( (lv_nullable_16_0= 'nullable' ) )? ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )? ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:2: ( 'minVal' ( (lv_minValue_1_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2017:4: 'minVal' ( (lv_minValue_1_0= RULE_INT ) )
                    {
                    match(input,49,FOLLOW_49_in_ruleNumberConstraint3782); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getMinValKeyword_0_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2021:1: ( (lv_minValue_1_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2022:1: (lv_minValue_1_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2022:1: (lv_minValue_1_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2023:3: lv_minValue_1_0= RULE_INT
                    {
                    lv_minValue_1_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3799); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getMinValueINTTerminalRuleCall_0_1_0(), "minValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minValue",
                    	        		lv_minValue_1_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2045:4: ( 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2045:6: 'maxVal' ( (lv_maxValue_3_0= RULE_INT ) )
                    {
                    match(input,50,FOLLOW_50_in_ruleNumberConstraint3817); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getMaxValKeyword_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2049:1: ( (lv_maxValue_3_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2050:1: (lv_maxValue_3_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2050:1: (lv_maxValue_3_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2051:3: lv_maxValue_3_0= RULE_INT
                    {
                    lv_maxValue_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3834); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getMaxValueINTTerminalRuleCall_1_1_0(), "maxValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxValue",
                    	        		lv_maxValue_3_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2073:4: ( ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2073:5: ( (lv_hasDefault_4_0= 'default' ) ) ( (lv_defaultValue_5_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2073:5: ( (lv_hasDefault_4_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2074:1: (lv_hasDefault_4_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2074:1: (lv_hasDefault_4_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2075:3: lv_hasDefault_4_0= 'default'
                    {
                    lv_hasDefault_4_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleNumberConstraint3860); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getHasDefaultDefaultKeyword_2_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2094:2: ( (lv_defaultValue_5_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2095:1: (lv_defaultValue_5_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2095:1: (lv_defaultValue_5_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2096:3: lv_defaultValue_5_0= RULE_STRING
                    {
                    lv_defaultValue_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint3890); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_2_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_5_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2118:4: ( ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2118:5: ( (lv_isFixed_6_0= 'fixed' ) ) ( (lv_fixedValue_7_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2118:5: ( (lv_isFixed_6_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2119:1: (lv_isFixed_6_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2119:1: (lv_isFixed_6_0= 'fixed' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2120:3: lv_isFixed_6_0= 'fixed'
                    {
                    lv_isFixed_6_0=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleNumberConstraint3916); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getIsFixedFixedKeyword_3_0_0(), "isFixed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isFixed", true, "fixed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2139:2: ( (lv_fixedValue_7_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2140:1: (lv_fixedValue_7_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2140:1: (lv_fixedValue_7_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2141:3: lv_fixedValue_7_0= RULE_STRING
                    {
                    lv_fixedValue_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint3946); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getFixedValueSTRINGTerminalRuleCall_3_1_0(), "fixedValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixedValue",
                    	        		lv_fixedValue_7_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2163:4: ( 'minLen' ( (lv_minLen_9_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2163:6: 'minLen' ( (lv_minLen_9_0= RULE_INT ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleNumberConstraint3964); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getMinLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2167:1: ( (lv_minLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2168:1: (lv_minLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2168:1: (lv_minLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2169:3: lv_minLen_9_0= RULE_INT
                    {
                    lv_minLen_9_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint3981); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getMinLenINTTerminalRuleCall_4_1_0(), "minLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minLen",
                    	        		lv_minLen_9_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2191:4: ( 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2191:6: 'maxLen' ( (lv_maxLen_11_0= RULE_INT ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleNumberConstraint3999); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getMaxLenKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2195:1: ( (lv_maxLen_11_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2196:1: (lv_maxLen_11_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2196:1: (lv_maxLen_11_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2197:3: lv_maxLen_11_0= RULE_INT
                    {
                    lv_maxLen_11_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4016); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getMaxLenINTTerminalRuleCall_5_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_11_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2219:4: ( 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2219:6: 'fixeLen' ( (lv_fixeLen_13_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleNumberConstraint4034); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getFixeLenKeyword_6_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2223:1: ( (lv_fixeLen_13_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2224:1: (lv_fixeLen_13_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2224:1: (lv_fixeLen_13_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2225:3: lv_fixeLen_13_0= RULE_INT
                    {
                    lv_fixeLen_13_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumberConstraint4051); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getFixeLenINTTerminalRuleCall_6_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_13_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2247:4: ( 'paddle' ( (lv_paddle_15_0= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2247:6: 'paddle' ( (lv_paddle_15_0= RULE_STRING ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleNumberConstraint4069); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getPaddleKeyword_7_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2251:1: ( (lv_paddle_15_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2252:1: (lv_paddle_15_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2252:1: (lv_paddle_15_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2253:3: lv_paddle_15_0= RULE_STRING
                    {
                    lv_paddle_15_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberConstraint4086); 

                    			createLeafNode(grammarAccess.getNumberConstraintAccess().getPaddleSTRINGTerminalRuleCall_7_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_15_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2275:4: ( (lv_nullable_16_0= 'nullable' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2276:1: (lv_nullable_16_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2276:1: (lv_nullable_16_0= 'nullable' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2277:3: lv_nullable_16_0= 'nullable'
                    {
                    lv_nullable_16_0=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleNumberConstraint4111); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getNullableNullableKeyword_8_0(), "nullable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "nullable", true, "nullable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2296:3: ( ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2296:4: ( (lv_derived_17_0= 'derived' ) ) ( (lv_writable_18_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2296:4: ( (lv_derived_17_0= 'derived' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2297:1: (lv_derived_17_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2297:1: (lv_derived_17_0= 'derived' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2298:3: lv_derived_17_0= 'derived'
                    {
                    lv_derived_17_0=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleNumberConstraint4144); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getDerivedDerivedKeyword_9_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2317:2: ( (lv_writable_18_0= 'writable' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==57) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2318:1: (lv_writable_18_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2318:1: (lv_writable_18_0= 'writable' )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2319:3: lv_writable_18_0= 'writable'
                            {
                            lv_writable_18_0=(Token)input.LT(1);
                            match(input,57,FOLLOW_57_in_ruleNumberConstraint4175); 

                                    createLeafNode(grammarAccess.getNumberConstraintAccess().getWritableWritableKeyword_9_1_0(), "writable"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "writable", true, "writable", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2338:5: ( (lv_isXSDAtt_19_0= 'xsd Att.' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2339:1: (lv_isXSDAtt_19_0= 'xsd Att.' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2339:1: (lv_isXSDAtt_19_0= 'xsd Att.' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2340:3: lv_isXSDAtt_19_0= 'xsd Att.'
                    {
                    lv_isXSDAtt_19_0=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleNumberConstraint4209); 

                            createLeafNode(grammarAccess.getNumberConstraintAccess().getIsXSDAttXsdAttKeyword_10_0(), "isXSDAtt"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNumberConstraintRule().getType().getClassifier());
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
    // $ANTLR end ruleNumberConstraint


    // $ANTLR start entryRuleAllConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2367:1: entryRuleAllConstraint returns [EObject current=null] : iv_ruleAllConstraint= ruleAllConstraint EOF ;
    public final EObject entryRuleAllConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllConstraint = null;


        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2368:2: (iv_ruleAllConstraint= ruleAllConstraint EOF )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2369:2: iv_ruleAllConstraint= ruleAllConstraint EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAllConstraintRule(), currentNode); 
            pushFollow(FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint4259);
            iv_ruleAllConstraint=ruleAllConstraint();
            _fsp--;

             current =iv_ruleAllConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllConstraint4269); 

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
    // $ANTLR end entryRuleAllConstraint


    // $ANTLR start ruleAllConstraint
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2376:1: ruleAllConstraint returns [EObject current=null] : ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_nullable_12_0= 'nullable' ) )? ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) ;
    public final EObject ruleAllConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_hasDefault_0_0=null;
        Token lv_defaultValue_1_0=null;
        Token lv_isFixed_2_0=null;
        Token lv_fixedValue_3_0=null;
        Token lv_minLen_5_0=null;
        Token lv_maxLen_7_0=null;
        Token lv_fixeLen_9_0=null;
        Token lv_paddle_11_0=null;
        Token lv_nullable_12_0=null;
        Token lv_derived_13_0=null;
        Token lv_writable_14_0=null;
        Token lv_isXSDAtt_15_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2381:6: ( ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_nullable_12_0= 'nullable' ) )? ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_nullable_12_0= 'nullable' ) )? ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:1: ( ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_nullable_12_0= 'nullable' ) )? ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )? )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )? ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )? ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )? ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )? ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )? ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )? ( (lv_nullable_12_0= 'nullable' ) )? ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )? ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:2: ( ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:3: ( (lv_hasDefault_0_0= 'default' ) ) ( (lv_defaultValue_1_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2382:3: ( (lv_hasDefault_0_0= 'default' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2383:1: (lv_hasDefault_0_0= 'default' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2383:1: (lv_hasDefault_0_0= 'default' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2384:3: lv_hasDefault_0_0= 'default'
                    {
                    lv_hasDefault_0_0=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleAllConstraint4313); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getHasDefaultDefaultKeyword_0_0_0(), "hasDefault"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "hasDefault", true, "default", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2403:2: ( (lv_defaultValue_1_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2404:1: (lv_defaultValue_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2404:1: (lv_defaultValue_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2405:3: lv_defaultValue_1_0= RULE_STRING
                    {
                    lv_defaultValue_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4343); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getDefaultValueSTRINGTerminalRuleCall_0_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_1_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2427:4: ( ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2427:5: ( (lv_isFixed_2_0= 'fixed' ) ) ( (lv_fixedValue_3_0= RULE_STRING ) )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2427:5: ( (lv_isFixed_2_0= 'fixed' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2428:1: (lv_isFixed_2_0= 'fixed' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2428:1: (lv_isFixed_2_0= 'fixed' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2429:3: lv_isFixed_2_0= 'fixed'
                    {
                    lv_isFixed_2_0=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleAllConstraint4369); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getIsFixedFixedKeyword_1_0_0(), "isFixed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isFixed", true, "fixed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2448:2: ( (lv_fixedValue_3_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2449:1: (lv_fixedValue_3_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2449:1: (lv_fixedValue_3_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2450:3: lv_fixedValue_3_0= RULE_STRING
                    {
                    lv_fixedValue_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4399); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getFixedValueSTRINGTerminalRuleCall_1_1_0(), "fixedValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixedValue",
                    	        		lv_fixedValue_3_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2472:4: ( 'minLen' ( (lv_minLen_5_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==52) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2472:6: 'minLen' ( (lv_minLen_5_0= RULE_INT ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleAllConstraint4417); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getMinLenKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2476:1: ( (lv_minLen_5_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2477:1: (lv_minLen_5_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2477:1: (lv_minLen_5_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2478:3: lv_minLen_5_0= RULE_INT
                    {
                    lv_minLen_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4434); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getMinLenINTTerminalRuleCall_2_1_0(), "minLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"minLen",
                    	        		lv_minLen_5_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2500:4: ( 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==53) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2500:6: 'maxLen' ( (lv_maxLen_7_0= RULE_INT ) )
                    {
                    match(input,53,FOLLOW_53_in_ruleAllConstraint4452); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getMaxLenKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2504:1: ( (lv_maxLen_7_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2505:1: (lv_maxLen_7_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2505:1: (lv_maxLen_7_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2506:3: lv_maxLen_7_0= RULE_INT
                    {
                    lv_maxLen_7_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4469); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getMaxLenINTTerminalRuleCall_3_1_0(), "maxLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"maxLen",
                    	        		lv_maxLen_7_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2528:4: ( 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2528:6: 'fixeLen' ( (lv_fixeLen_9_0= RULE_INT ) )
                    {
                    match(input,48,FOLLOW_48_in_ruleAllConstraint4487); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getFixeLenKeyword_4_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2532:1: ( (lv_fixeLen_9_0= RULE_INT ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2533:1: (lv_fixeLen_9_0= RULE_INT )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2533:1: (lv_fixeLen_9_0= RULE_INT )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2534:3: lv_fixeLen_9_0= RULE_INT
                    {
                    lv_fixeLen_9_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAllConstraint4504); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getFixeLenINTTerminalRuleCall_4_1_0(), "fixeLen"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"fixeLen",
                    	        		lv_fixeLen_9_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2556:4: ( 'paddle' ( (lv_paddle_11_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2556:6: 'paddle' ( (lv_paddle_11_0= RULE_STRING ) )
                    {
                    match(input,54,FOLLOW_54_in_ruleAllConstraint4522); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getPaddleKeyword_5_0(), null); 
                        
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2560:1: ( (lv_paddle_11_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2561:1: (lv_paddle_11_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2561:1: (lv_paddle_11_0= RULE_STRING )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2562:3: lv_paddle_11_0= RULE_STRING
                    {
                    lv_paddle_11_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllConstraint4539); 

                    			createLeafNode(grammarAccess.getAllConstraintAccess().getPaddleSTRINGTerminalRuleCall_5_1_0(), "paddle"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paddle",
                    	        		lv_paddle_11_0, 
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

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2584:4: ( (lv_nullable_12_0= 'nullable' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2585:1: (lv_nullable_12_0= 'nullable' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2585:1: (lv_nullable_12_0= 'nullable' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2586:3: lv_nullable_12_0= 'nullable'
                    {
                    lv_nullable_12_0=(Token)input.LT(1);
                    match(input,55,FOLLOW_55_in_ruleAllConstraint4564); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getNullableNullableKeyword_6_0(), "nullable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "nullable", true, "nullable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2605:3: ( ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2605:4: ( (lv_derived_13_0= 'derived' ) ) ( (lv_writable_14_0= 'writable' ) )?
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2605:4: ( (lv_derived_13_0= 'derived' ) )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2606:1: (lv_derived_13_0= 'derived' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2606:1: (lv_derived_13_0= 'derived' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2607:3: lv_derived_13_0= 'derived'
                    {
                    lv_derived_13_0=(Token)input.LT(1);
                    match(input,56,FOLLOW_56_in_ruleAllConstraint4597); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getDerivedDerivedKeyword_7_0_0(), "derived"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "derived", true, "derived", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2626:2: ( (lv_writable_14_0= 'writable' ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==57) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2627:1: (lv_writable_14_0= 'writable' )
                            {
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2627:1: (lv_writable_14_0= 'writable' )
                            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2628:3: lv_writable_14_0= 'writable'
                            {
                            lv_writable_14_0=(Token)input.LT(1);
                            match(input,57,FOLLOW_57_in_ruleAllConstraint4628); 

                                    createLeafNode(grammarAccess.getAllConstraintAccess().getWritableWritableKeyword_7_1_0(), "writable"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "writable", true, "writable", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2647:5: ( (lv_isXSDAtt_15_0= 'xsd Att.' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2648:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2648:1: (lv_isXSDAtt_15_0= 'xsd Att.' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2649:3: lv_isXSDAtt_15_0= 'xsd Att.'
                    {
                    lv_isXSDAtt_15_0=(Token)input.LT(1);
                    match(input,58,FOLLOW_58_in_ruleAllConstraint4662); 

                            createLeafNode(grammarAccess.getAllConstraintAccess().getIsXSDAttXsdAttKeyword_8_0(), "isXSDAtt"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllConstraintRule().getType().getClassifier());
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
    // $ANTLR end ruleAllConstraint


    // $ANTLR start ruleVisibility
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2676:1: ruleVisibility returns [Enumerator current=null] : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2680:6: ( ( ( 'public' ) | ( 'private' ) | ( 'protected' ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2681:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2681:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt48=1;
                }
                break;
            case 60:
                {
                alt48=2;
                }
                break;
            case 61:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2681:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) )", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2681:2: ( 'public' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2681:2: ( 'public' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2681:4: 'public'
                    {
                    match(input,59,FOLLOW_59_in_ruleVisibility4724); 

                            current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2687:6: ( 'private' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2687:6: ( 'private' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2687:8: 'private'
                    {
                    match(input,60,FOLLOW_60_in_ruleVisibility4739); 

                            current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2693:6: ( 'protected' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2693:6: ( 'protected' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2693:8: 'protected'
                    {
                    match(input,61,FOLLOW_61_in_ruleVisibility4754); 

                            current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2(), null); 
                        

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
    // $ANTLR end ruleVisibility


    // $ANTLR start ruleEntityType
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2703:1: ruleEntityType returns [Enumerator current=null] : ( 'abstract' ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2707:6: ( ( 'abstract' ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2708:1: ( 'abstract' )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2708:1: ( 'abstract' )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2708:3: 'abstract'
            {
            match(input,62,FOLLOW_62_in_ruleEntityType4796); 

                    current = grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    createLeafNode(grammarAccess.getEntityTypeAccess().getPublicEnumLiteralDeclaration(), null); 
                

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
    // $ANTLR end ruleEntityType


    // $ANTLR start ruleEnumUsage
    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2718:1: ruleEnumUsage returns [Enumerator current=null] : ( ( 'as String' ) | ( 'as Value' ) ) ;
    public final Enumerator ruleEnumUsage() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2722:6: ( ( ( 'as String' ) | ( 'as Value' ) ) )
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2723:1: ( ( 'as String' ) | ( 'as Value' ) )
            {
            // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2723:1: ( ( 'as String' ) | ( 'as Value' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            else if ( (LA49_0==64) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2723:1: ( ( 'as String' ) | ( 'as Value' ) )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2723:2: ( 'as String' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2723:2: ( 'as String' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2723:4: 'as String'
                    {
                    match(input,63,FOLLOW_63_in_ruleEnumUsage4838); 

                            current = grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2729:6: ( 'as Value' )
                    {
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2729:6: ( 'as Value' )
                    // ../fr.chaunier.xtext.bom/src-gen/fr/chaunier/xtext/bom/parser/antlr/internal/InternalBomDsl.g:2729:8: 'as Value'
                    {
                    match(input,64,FOLLOW_64_in_ruleEnumUsage4853); 

                            current = grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getEnumUsageAccess().getAsValueEnumLiteralDeclaration_1(), null); 
                        

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
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainModel130 = new BitSet(new long[]{0x4000000086001802L});
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
    public static final BitSet FOLLOW_15_in_rulePackageDeclaration557 = new BitSet(new long[]{0x4000000087FD1800L});
    public static final BitSet FOLLOW_16_in_rulePackageDeclaration569 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePackageDeclaration587 = new BitSet(new long[]{0x4000000087C01800L});
    public static final BitSet FOLLOW_18_in_rulePackageDeclaration617 = new BitSet(new long[]{0x4000000087C01800L});
    public static final BitSet FOLLOW_19_in_rulePackageDeclaration633 = new BitSet(new long[]{0x4000000087C01800L});
    public static final BitSet FOLLOW_20_in_rulePackageDeclaration649 = new BitSet(new long[]{0x4000000087C01800L});
    public static final BitSet FOLLOW_21_in_rulePackageDeclaration665 = new BitSet(new long[]{0x4000000087C01800L});
    public static final BitSet FOLLOW_22_in_rulePackageDeclaration678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration695 = new BitSet(new long[]{0x4000000087801800L});
    public static final BitSet FOLLOW_23_in_rulePackageDeclaration713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePackageDeclaration730 = new BitSet(new long[]{0x4000000087801800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration758 = new BitSet(new long[]{0x4000000087001800L});
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
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity1110 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntity1121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1138 = new BitSet(new long[]{0x0000000008008010L});
    public static final BitSet FOLLOW_27_in_ruleEntity1154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1177 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity1196 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity1212 = new BitSet(new long[]{0x0000000021000020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1233 = new BitSet(new long[]{0x0000000021000020L});
    public static final BitSet FOLLOW_24_in_ruleEntity1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_ruleFeature1337 = new BitSet(new long[]{0x0000EB0000000012L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleFeature1357 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeature1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralFeature_in_entryRuleStructuralFeature1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeature1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStructuralFeature1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleStructuralFeature1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1588 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttribute1603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleReference1705 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1722 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleReference1737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleReference1758 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleReference1769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReference1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEnumeration1870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1887 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleEnumeration1902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumeration1923 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_33_in_ruleEnumeration1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral1970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral2022 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEnumerationLiteral2038 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationLiteral2055 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleEnumerationLiteral2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleParameter2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef2225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeRef2283 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleTypeRef2301 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleTypeRef2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard2384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard2442 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedNameWithWildCard2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2555 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleQualifiedName2574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2589 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_ruleConstraint2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_ruleConstraint2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_ruleConstraint2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_ruleConstraint2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_ruleConstraint2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_ruleConstraint2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolConstraint_in_entryRuleBoolConstraint2863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolConstraint2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBoolConstraint2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstraint_in_entryRuleStringConstraint2963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstraint2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleStringConstraint3016 = new BitSet(new long[]{0x05F9140000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_ruleStringConstraint3050 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleStringConstraint3061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstraint3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeConstraint_in_entryRuleDateTimeConstraint3121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeConstraint3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDateTimeConstraint3174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateTimeConstraint3205 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleDateTimeConstraint3224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimeConstraint3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerConstraint_in_entryRuleIntegerConstraint3297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerConstraint3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntegerConstraint3350 = new BitSet(new long[]{0x05FF100000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_ruleIntegerConstraint3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalConstraint_in_entryRuleDecimalConstraint3420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalConstraint3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDecimalConstraint3473 = new BitSet(new long[]{0x05FF100000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_ruleDecimalConstraint3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationConstraint_in_entryRuleEnumerationConstraint3543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationConstraint3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleEnumerationConstraint3588 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEnumUsage_in_ruleEnumerationConstraint3609 = new BitSet(new long[]{0x0001100000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumerationConstraint3620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationConstraint3637 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleEnumerationConstraint3663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationConstraint3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberConstraint_in_entryRuleNumberConstraint3736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberConstraint3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNumberConstraint3782 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3799 = new BitSet(new long[]{0x05FD100000000002L});
    public static final BitSet FOLLOW_50_in_ruleNumberConstraint3817 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3834 = new BitSet(new long[]{0x05F9100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNumberConstraint3860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint3890 = new BitSet(new long[]{0x05F9000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNumberConstraint3916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint3946 = new BitSet(new long[]{0x05F1000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumberConstraint3964 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint3981 = new BitSet(new long[]{0x05E1000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNumberConstraint3999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4016 = new BitSet(new long[]{0x05C1000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNumberConstraint4034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumberConstraint4051 = new BitSet(new long[]{0x05C0000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumberConstraint4069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberConstraint4086 = new BitSet(new long[]{0x0580000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNumberConstraint4111 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNumberConstraint4144 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNumberConstraint4175 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNumberConstraint4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllConstraint_in_entryRuleAllConstraint4259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllConstraint4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAllConstraint4313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4343 = new BitSet(new long[]{0x05F9000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAllConstraint4369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4399 = new BitSet(new long[]{0x05F1000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAllConstraint4417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4434 = new BitSet(new long[]{0x05E1000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAllConstraint4452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4469 = new BitSet(new long[]{0x05C1000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAllConstraint4487 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAllConstraint4504 = new BitSet(new long[]{0x05C0000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAllConstraint4522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllConstraint4539 = new BitSet(new long[]{0x0580000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAllConstraint4564 = new BitSet(new long[]{0x0500000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAllConstraint4597 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAllConstraint4628 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAllConstraint4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleVisibility4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleVisibility4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleVisibility4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleEntityType4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEnumUsage4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleEnumUsage4853 = new BitSet(new long[]{0x0000000000000002L});

}