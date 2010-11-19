package fr.chaunier.xtext.map.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import fr.chaunier.xtext.map.services.MapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'module'", "'{'", "'}'", "'mapClass'", "'between'", "'and'", "';'", "'map'", "'=>'", "'set left'", "'='", "'set right'", "'ignore left'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalMapDslParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g"; }



     	private MapDslGrammarAccess grammarAccess;
     	
        public InternalMapDslParser(TokenStream input, IAstFactory factory, MapDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MapDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:86:1: ruleModel returns [EObject current=null] : ( (lv_mappingModules_0_0= ruleMappingModule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mappingModules_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:91:6: ( ( (lv_mappingModules_0_0= ruleMappingModule ) )* )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:92:1: ( (lv_mappingModules_0_0= ruleMappingModule ) )*
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:92:1: ( (lv_mappingModules_0_0= ruleMappingModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:93:1: (lv_mappingModules_0_0= ruleMappingModule )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:93:1: (lv_mappingModules_0_0= ruleMappingModule )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:94:3: lv_mappingModules_0_0= ruleMappingModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getMappingModulesMappingModuleParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMappingModule_in_ruleModel130);
            	    lv_mappingModules_0_0=ruleMappingModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappingModules",
            	    	        		lv_mappingModules_0_0, 
            	    	        		"MappingModule", 
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:126:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport166);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport176); 

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
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:133:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:138:6: ( ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:139:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:139:1: ( 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:139:3: 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            match(input,11,FOLLOW_11_in_ruleImport211); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:143:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:144:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:144:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:145:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport232);
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


    // $ANTLR start entryRuleQualifiedNameWithWildCard
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:175:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:176:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:177:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard269);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();
            _fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard280); 

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
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:184:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:189:6: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:190:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:190:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:191:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard327);
            this_QualifiedName_0=ruleQualifiedName();
            _fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    currentNode = currentNode.getParent();
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:201:1: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:202:2: kw= '.*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard346); 

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
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:215:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:216:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:217:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName389);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName400); 

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
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:224:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:229:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:230:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:230:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:230:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName440); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:237:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:238:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_ruleQualifiedName459); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName474); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start entryRuleMappingModule
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:258:1: entryRuleMappingModule returns [EObject current=null] : iv_ruleMappingModule= ruleMappingModule EOF ;
    public final EObject entryRuleMappingModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModule = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:259:2: (iv_ruleMappingModule= ruleMappingModule EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:260:2: iv_ruleMappingModule= ruleMappingModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappingModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule521);
            iv_ruleMappingModule=ruleMappingModule();
            _fsp--;

             current =iv_ruleMappingModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule531); 

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
    // $ANTLR end entryRuleMappingModule


    // $ANTLR start ruleMappingModule
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:267:1: ruleMappingModule returns [EObject current=null] : ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_mappings_4_0= ruleMapping ) )* '}' ) ;
    public final EObject ruleMappingModule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_mappings_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:272:6: ( ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_mappings_4_0= ruleMapping ) )* '}' ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:273:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_mappings_4_0= ruleMapping ) )* '}' )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:273:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_mappings_4_0= ruleMapping ) )* '}' )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:273:3: 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_mappings_4_0= ruleMapping ) )* '}'
            {
            match(input,14,FOLLOW_14_in_ruleMappingModule566); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getModuleKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:277:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:278:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:278:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:279:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMappingModule587);
            lv_name_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
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

            match(input,15,FOLLOW_15_in_ruleMappingModule597); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:305:1: ( (lv_imports_3_0= ruleImport ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:306:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:306:1: (lv_imports_3_0= ruleImport )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:307:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getImportsImportParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleMappingModule618);
            	    lv_imports_3_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_3_0, 
            	    	        		"Import", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:329:3: ( (lv_mappings_4_0= ruleMapping ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:330:1: (lv_mappings_4_0= ruleMapping )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:330:1: (lv_mappings_4_0= ruleMapping )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:331:3: lv_mappings_4_0= ruleMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getMappingsMappingParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMappingModule640);
            	    lv_mappings_4_0=ruleMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappings",
            	    	        		lv_mappings_4_0, 
            	    	        		"Mapping", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleMappingModule651); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleMappingModule


    // $ANTLR start entryRuleMapping
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:365:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:366:2: (iv_ruleMapping= ruleMapping EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:367:2: iv_ruleMapping= ruleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping687);
            iv_ruleMapping=ruleMapping();
            _fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping697); 

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
    // $ANTLR end entryRuleMapping


    // $ANTLR start ruleMapping
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:374:1: ruleMapping returns [EObject current=null] : ( 'mapClass' ( (lv_name_1_0= RULE_STRING ) )? 'between' ( ( ruleQualifiedName ) ) 'and' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_documentation_6_0=null;
        EObject lv_mappedFeatures_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:379:6: ( ( 'mapClass' ( (lv_name_1_0= RULE_STRING ) )? 'between' ( ( ruleQualifiedName ) ) 'and' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:380:1: ( 'mapClass' ( (lv_name_1_0= RULE_STRING ) )? 'between' ( ( ruleQualifiedName ) ) 'and' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:380:1: ( 'mapClass' ( (lv_name_1_0= RULE_STRING ) )? 'between' ( ( ruleQualifiedName ) ) 'and' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:380:3: 'mapClass' ( (lv_name_1_0= RULE_STRING ) )? 'between' ( ( ruleQualifiedName ) ) 'and' ( ( ruleQualifiedName ) ) ( (lv_documentation_6_0= RULE_STRING ) )? '{' ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )* '}'
            {
            match(input,17,FOLLOW_17_in_ruleMapping732); 

                    createLeafNode(grammarAccess.getMappingAccess().getMapClassKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:384:1: ( (lv_name_1_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:385:1: (lv_name_1_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:385:1: (lv_name_1_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:386:3: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping749); 

                    			createLeafNode(grammarAccess.getMappingAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_ruleMapping765); 

                    createLeafNode(grammarAccess.getMappingAccess().getBetweenKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:412:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:413:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:413:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:414:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getMappingAccess().getLeftClassEntityCrossReference_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMapping788);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleMapping798); 

                    createLeafNode(grammarAccess.getMappingAccess().getAndKeyword_4(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:432:1: ( ( ruleQualifiedName ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:433:1: ( ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:433:1: ( ruleQualifiedName )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:434:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
             
            	        currentNode=createCompositeNode(grammarAccess.getMappingAccess().getRightClassEntityCrossReference_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMapping821);
            ruleQualifiedName();
            _fsp--;

             
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:448:2: ( (lv_documentation_6_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:449:1: (lv_documentation_6_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:449:1: (lv_documentation_6_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:450:3: lv_documentation_6_0= RULE_STRING
                    {
                    lv_documentation_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping838); 

                    			createLeafNode(grammarAccess.getMappingAccess().getDocumentationSTRINGTerminalRuleCall_6_0(), "documentation"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"documentation",
                    	        		lv_documentation_6_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruleMapping854); 

                    createLeafNode(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_7(), null); 
                
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:476:1: ( ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==23||(LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:476:2: ( (lv_mappedFeatures_8_0= ruleFeatureMap ) ) ( ';' )?
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:476:2: ( (lv_mappedFeatures_8_0= ruleFeatureMap ) )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:477:1: (lv_mappedFeatures_8_0= ruleFeatureMap )
            	    {
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:477:1: (lv_mappedFeatures_8_0= ruleFeatureMap )
            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:478:3: lv_mappedFeatures_8_0= ruleFeatureMap
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingAccess().getMappedFeaturesFeatureMapParserRuleCall_8_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureMap_in_ruleMapping876);
            	    lv_mappedFeatures_8_0=ruleFeatureMap();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappedFeatures",
            	    	        		lv_mappedFeatures_8_0, 
            	    	        		"FeatureMap", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:500:2: ( ';' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:500:4: ';'
            	            {
            	            match(input,20,FOLLOW_20_in_ruleMapping887); 

            	                    createLeafNode(grammarAccess.getMappingAccess().getSemicolonKeyword_8_1(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleMapping901); 

                    createLeafNode(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9(), null); 
                

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
    // $ANTLR end ruleMapping


    // $ANTLR start entryRuleFeatureMap
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:516:1: entryRuleFeatureMap returns [EObject current=null] : iv_ruleFeatureMap= ruleFeatureMap EOF ;
    public final EObject entryRuleFeatureMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMap = null;


        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:517:2: (iv_ruleFeatureMap= ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:518:2: iv_ruleFeatureMap= ruleFeatureMap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureMapRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap937);
            iv_ruleFeatureMap=ruleFeatureMap();
            _fsp--;

             current =iv_ruleFeatureMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap947); 

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
    // $ANTLR end entryRuleFeatureMap


    // $ANTLR start ruleFeatureMap
    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:525:1: ruleFeatureMap returns [EObject current=null] : ( ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) ) ;
    public final EObject ruleFeatureMap() throws RecognitionException {
        EObject current = null;

        Token lv_rule_4_0=null;
        Token lv_valLeft_8_0=null;
        Token lv_valRight_12_0=null;
        Token lv_documentation_15_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:530:6: ( ( ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) ) )
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:531:1: ( ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )
            {
            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:531:1: ( ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("531:1: ( ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:531:2: ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:531:2: ( 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )? )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:531:4: 'map' ( ( RULE_ID ) ) '=>' ( ( RULE_ID ) ) ( (lv_rule_4_0= RULE_STRING ) )?
                    {
                    match(input,21,FOLLOW_21_in_ruleFeatureMap983); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:535:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:536:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:536:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:537:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1001); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeCrossReference_0_1_0(), "leftField"); 
                    	

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleFeatureMap1011); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_2(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:553:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:554:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:554:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:555:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1029); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getRightFieldAttributeCrossReference_0_3_0(), "rightField"); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:567:2: ( (lv_rule_4_0= RULE_STRING ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:568:1: (lv_rule_4_0= RULE_STRING )
                            {
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:568:1: (lv_rule_4_0= RULE_STRING )
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:569:3: lv_rule_4_0= RULE_STRING
                            {
                            lv_rule_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1046); 

                            			createLeafNode(grammarAccess.getFeatureMapAccess().getRuleSTRINGTerminalRuleCall_0_4_0(), "rule"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"rule",
                            	        		lv_rule_4_0, 
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
                    break;
                case 2 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:592:6: ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:592:6: ( 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:592:8: 'set left' ( ( RULE_ID ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFeatureMap1070); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:596:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:597:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:597:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:598:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1088); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_1_1_0(), "setLeftField"); 
                    	

                    }


                    }

                    match(input,24,FOLLOW_24_in_ruleFeatureMap1098); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_1_2(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:614:1: ( (lv_valLeft_8_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:615:1: (lv_valLeft_8_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:615:1: (lv_valLeft_8_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:616:3: lv_valLeft_8_0= RULE_STRING
                    {
                    lv_valLeft_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1115); 

                    			createLeafNode(grammarAccess.getFeatureMapAccess().getValLeftSTRINGTerminalRuleCall_1_3_0(), "valLeft"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"valLeft",
                    	        		lv_valLeft_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:639:6: ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:639:6: ( 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:639:8: 'set right' ( ( RULE_ID ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleFeatureMap1138); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetRightKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:643:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:644:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:644:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:645:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1156); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_2_1_0(), "setRightField"); 
                    	

                    }


                    }

                    match(input,24,FOLLOW_24_in_ruleFeatureMap1166); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_2_2(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:661:1: ( (lv_valRight_12_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:662:1: (lv_valRight_12_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:662:1: (lv_valRight_12_0= RULE_STRING )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:663:3: lv_valRight_12_0= RULE_STRING
                    {
                    lv_valRight_12_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1183); 

                    			createLeafNode(grammarAccess.getFeatureMapAccess().getValRightSTRINGTerminalRuleCall_2_3_0(), "valRight"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"valRight",
                    	        		lv_valRight_12_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:686:6: ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:686:6: ( 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )? )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:686:8: 'ignore left' ( ( RULE_ID ) ) ( (lv_documentation_15_0= RULE_STRING ) )?
                    {
                    match(input,26,FOLLOW_26_in_ruleFeatureMap1206); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:690:1: ( ( RULE_ID ) )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:691:1: ( RULE_ID )
                    {
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:691:1: ( RULE_ID )
                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:692:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeatureMap1224); 

                    		createLeafNode(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_3_1_0(), "setRightField"); 
                    	

                    }


                    }

                    // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:704:2: ( (lv_documentation_15_0= RULE_STRING ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_STRING) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:705:1: (lv_documentation_15_0= RULE_STRING )
                            {
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:705:1: (lv_documentation_15_0= RULE_STRING )
                            // ../fr.chaunier.xtext.map/src-gen/fr/chaunier/xtext/map/parser/antlr/internal/InternalMapDsl.g:706:3: lv_documentation_15_0= RULE_STRING
                            {
                            lv_documentation_15_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap1241); 

                            			createLeafNode(grammarAccess.getFeatureMapAccess().getDocumentationSTRINGTerminalRuleCall_3_2_0(), "documentation"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"documentation",
                            	        		lv_documentation_15_0, 
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
    // $ANTLR end ruleFeatureMap


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_ruleModel130 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard327 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName440 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName474 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleMappingModule566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMappingModule587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMappingModule597 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMappingModule618 = new BitSet(new long[]{0x0000000000030800L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappingModule640 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleMappingModule651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMapping732 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMapping765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMapping788 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMapping798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMapping821 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping838 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMapping854 = new BitSet(new long[]{0x0000000006A10000L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_ruleMapping876 = new BitSet(new long[]{0x0000000006B10000L});
    public static final BitSet FOLLOW_20_in_ruleMapping887 = new BitSet(new long[]{0x0000000006A10000L});
    public static final BitSet FOLLOW_16_in_ruleMapping901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFeatureMap983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFeatureMap1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1029 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFeatureMap1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1088 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureMap1098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFeatureMap1138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFeatureMap1166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFeatureMap1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMap1224 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap1241 = new BitSet(new long[]{0x0000000000000002L});

}