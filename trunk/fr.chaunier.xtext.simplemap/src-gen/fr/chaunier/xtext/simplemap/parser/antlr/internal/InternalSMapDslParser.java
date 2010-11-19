package fr.chaunier.xtext.simplemap.parser.antlr.internal; 

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
import fr.chaunier.xtext.simplemap.services.SMapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'module'", "'{'", "';'", "'}'", "'map'", "'=>'", "'set left'", "'='", "'set right'", "'ignore left'"
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
    public String getGrammarFileName() { return "../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g"; }



     	private SMapDslGrammarAccess grammarAccess;
     	
        public InternalSMapDslParser(TokenStream input, IAstFactory factory, SMapDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SMapDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:79:2: iv_ruleModel= ruleModel EOF
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
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:86:1: ruleModel returns [EObject current=null] : ( (lv_mappingModules_0_0= ruleMappingModule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mappingModules_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:91:6: ( ( (lv_mappingModules_0_0= ruleMappingModule ) )* )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:92:1: ( (lv_mappingModules_0_0= ruleMappingModule ) )*
            {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:92:1: ( (lv_mappingModules_0_0= ruleMappingModule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:93:1: (lv_mappingModules_0_0= ruleMappingModule )
            	    {
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:93:1: (lv_mappingModules_0_0= ruleMappingModule )
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:94:3: lv_mappingModules_0_0= ruleMappingModule
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


    // $ANTLR start entryRuleQualifiedName
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:126:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:127:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:128:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName169);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName180); 

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
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:135:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:140:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:141:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:141:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:141:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName220); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:148:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:149:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,11,FOLLOW_11_in_ruleQualifiedName239); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName254); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:169:1: entryRuleMappingModule returns [EObject current=null] : iv_ruleMappingModule= ruleMappingModule EOF ;
    public final EObject entryRuleMappingModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModule = null;


        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:170:2: (iv_ruleMappingModule= ruleMappingModule EOF )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:171:2: iv_ruleMappingModule= ruleMappingModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMappingModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleMappingModule_in_entryRuleMappingModule301);
            iv_ruleMappingModule=ruleMappingModule();
            _fsp--;

             current =iv_ruleMappingModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModule311); 

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
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:178:1: ruleMappingModule returns [EObject current=null] : ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) ;
    public final EObject ruleMappingModule() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_mappedFeatures_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:183:6: ( ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )* '}' ) )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:184:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:184:1: ( 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )* '}' )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:184:3: 'module' ( (lv_name_1_0= ruleQualifiedName ) ) '{' ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )* '}'
            {
            match(input,12,FOLLOW_12_in_ruleMappingModule346); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getModuleKeyword_0(), null); 
                
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:188:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:189:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:189:1: (lv_name_1_0= ruleQualifiedName )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:190:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMappingModule367);
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

            match(input,13,FOLLOW_13_in_ruleMappingModule377); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:216:1: ( ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:216:2: ( (lv_mappedFeatures_3_0= ruleFeatureMap ) ) ( ';' )?
            	    {
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:216:2: ( (lv_mappedFeatures_3_0= ruleFeatureMap ) )
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:217:1: (lv_mappedFeatures_3_0= ruleFeatureMap )
            	    {
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:217:1: (lv_mappedFeatures_3_0= ruleFeatureMap )
            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:218:3: lv_mappedFeatures_3_0= ruleFeatureMap
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMappingModuleAccess().getMappedFeaturesFeatureMapParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureMap_in_ruleMappingModule399);
            	    lv_mappedFeatures_3_0=ruleFeatureMap();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMappingModuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"mappedFeatures",
            	    	        		lv_mappedFeatures_3_0, 
            	    	        		"FeatureMap", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:240:2: ( ';' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:240:4: ';'
            	            {
            	            match(input,14,FOLLOW_14_in_ruleMappingModule410); 

            	                    createLeafNode(grammarAccess.getMappingModuleAccess().getSemicolonKeyword_3_1(), null); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,15,FOLLOW_15_in_ruleMappingModule424); 

                    createLeafNode(grammarAccess.getMappingModuleAccess().getRightCurlyBracketKeyword_4(), null); 
                

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


    // $ANTLR start entryRuleFeatureMap
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:256:1: entryRuleFeatureMap returns [EObject current=null] : iv_ruleFeatureMap= ruleFeatureMap EOF ;
    public final EObject entryRuleFeatureMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMap = null;


        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:257:2: (iv_ruleFeatureMap= ruleFeatureMap EOF )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:258:2: iv_ruleFeatureMap= ruleFeatureMap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureMapRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap460);
            iv_ruleFeatureMap=ruleFeatureMap();
            _fsp--;

             current =iv_ruleFeatureMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureMap470); 

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
    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:265:1: ruleFeatureMap returns [EObject current=null] : ( ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) ) ;
    public final EObject ruleFeatureMap() throws RecognitionException {
        EObject current = null;

        Token lv_rule_4_0=null;
        Token lv_valLeft_8_0=null;
        Token lv_valRight_12_0=null;
        Token lv_documentation_15_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:270:6: ( ( ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) ) )
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:271:1: ( ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )
            {
            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:271:1: ( ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("271:1: ( ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? ) | ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) ) | ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) ) | ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? ) )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:271:2: ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:271:2: ( 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )? )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:271:4: 'map' ( ( ruleQualifiedName ) ) '=>' ( ( ruleQualifiedName ) ) ( (lv_rule_4_0= RULE_STRING ) )?
                    {
                    match(input,16,FOLLOW_16_in_ruleFeatureMap506); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getMapKeyword_0_0(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:275:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:276:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:276:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:277:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getLeftFieldAttributeCrossReference_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap529);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,17,FOLLOW_17_in_ruleFeatureMap539); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignGreaterThanSignKeyword_0_2(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:295:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:296:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:296:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:297:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getRightFieldAttributeCrossReference_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap562);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:311:2: ( (lv_rule_4_0= RULE_STRING ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_STRING) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:312:1: (lv_rule_4_0= RULE_STRING )
                            {
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:312:1: (lv_rule_4_0= RULE_STRING )
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:313:3: lv_rule_4_0= RULE_STRING
                            {
                            lv_rule_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap579); 

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
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:336:6: ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:336:6: ( 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:336:8: 'set left' ( ( ruleQualifiedName ) ) '=' ( (lv_valLeft_8_0= RULE_STRING ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleFeatureMap603); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetLeftKeyword_1_0(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:340:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:341:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:341:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:342:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getSetLeftFieldAttributeCrossReference_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap626);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleFeatureMap636); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_1_2(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:360:1: ( (lv_valLeft_8_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:361:1: (lv_valLeft_8_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:361:1: (lv_valLeft_8_0= RULE_STRING )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:362:3: lv_valLeft_8_0= RULE_STRING
                    {
                    lv_valLeft_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap653); 

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
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:385:6: ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:385:6: ( 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:385:8: 'set right' ( ( ruleQualifiedName ) ) '=' ( (lv_valRight_12_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFeatureMap676); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getSetRightKeyword_2_0(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:389:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:390:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:390:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:391:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getSetRightFieldAttributeCrossReference_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap699);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleFeatureMap709); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getEqualsSignKeyword_2_2(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:409:1: ( (lv_valRight_12_0= RULE_STRING ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:410:1: (lv_valRight_12_0= RULE_STRING )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:410:1: (lv_valRight_12_0= RULE_STRING )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:411:3: lv_valRight_12_0= RULE_STRING
                    {
                    lv_valRight_12_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap726); 

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
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:434:6: ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:434:6: ( 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )? )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:434:8: 'ignore left' ( ( ruleQualifiedName ) ) ( (lv_documentation_15_0= RULE_STRING ) )?
                    {
                    match(input,21,FOLLOW_21_in_ruleFeatureMap749); 

                            createLeafNode(grammarAccess.getFeatureMapAccess().getIgnoreLeftKeyword_3_0(), null); 
                        
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:438:1: ( ( ruleQualifiedName ) )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:439:1: ( ruleQualifiedName )
                    {
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:439:1: ( ruleQualifiedName )
                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:440:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFeatureMapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFeatureMapAccess().getIgnoreLeftFieldAttributeCrossReference_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureMap772);
                    ruleQualifiedName();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:454:2: ( (lv_documentation_15_0= RULE_STRING ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_STRING) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:455:1: (lv_documentation_15_0= RULE_STRING )
                            {
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:455:1: (lv_documentation_15_0= RULE_STRING )
                            // ../fr.chaunier.xtext.simplemap/src-gen/fr/chaunier/xtext/simplemap/parser/antlr/internal/InternalSMapDsl.g:456:3: lv_documentation_15_0= RULE_STRING
                            {
                            lv_documentation_15_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureMap789); 

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
    public static final BitSet FOLLOW_ruleMappingModule_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName220 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName254 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleMappingModule_in_entryRuleMappingModule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModule311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMappingModule346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMappingModule367 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMappingModule377 = new BitSet(new long[]{0x0000000000358000L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_ruleMappingModule399 = new BitSet(new long[]{0x000000000035C000L});
    public static final BitSet FOLLOW_14_in_ruleMappingModule410 = new BitSet(new long[]{0x0000000000358000L});
    public static final BitSet FOLLOW_15_in_ruleMappingModule424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureMap_in_entryRuleFeatureMap460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMap470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFeatureMap506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap529 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFeatureMap539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap562 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFeatureMap603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFeatureMap676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap699 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFeatureMap709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFeatureMap749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureMap772 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureMap789 = new BitSet(new long[]{0x0000000000000002L});

}